import torch
from transformers import pipeline

def start_chat():
    """
    Initializes a continuous chat session with the Llama 2 model in the terminal.
    """
    # Define the model to use from Hugging Face
    # This requires you to have accepted the license on the model's page
    model_name = "meta-llama/Llama-2-7b-chat-hf"

    print("Initializing the Llama 2 chatbot...")
    print("This may take a few minutes to download the model for the first time.")

    try:
        # Create a text-generation pipeline
        # device_map="auto" will automatically use a GPU if one is detected
        chatbot = pipeline(
            "text-generation",
            model=model_name,
            torch_dtype=torch.float16,
            device_map="auto"
        )
    except Exception as e:
        print(f"Error loading the model: {e}")
        print("Please ensure you have run 'huggingface-cli login' and have access to the model.")
        return

    print("\n✅ Chatbot is ready! Type 'exit' or 'quit' to end the session.")
    print("-" * 60)

    # Start a continuous loop for the chat
    while True:
        # Get input from the user
        user_input = input("You: ")

        # Check for exit commands
        if user_input.lower() in ["exit", "quit"]:
            print("🤖 Goodbye!")
            break

        # Generate a response from the model
        # The pipeline returns a list of generated text dictionaries
        response = chatbot(
            user_input,
            do_sample=True,
            top_k=10,
            num_return_sequences=1,
            eos_token_id=chatbot.tokenizer.eos_token_id,
            max_new_tokens=256  # You can adjust the max length of the reply
        )

        # Print the chatbot's reply
        # The actual text is inside the 'generated_text' key
        # We also clean up the response to only show the model's answer
        bot_response = response[0]['generated_text'].split(user_input)[-1].strip()
        print(f"Llama 2: {bot_response}")
        print("-" * 60)


if __name__ == "__main__":
    start_chat()