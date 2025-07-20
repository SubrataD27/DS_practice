import google.generativeai as genai

# Your new API key is configured here
api_key = "AIzaSyA17TYUA-SKvSUhVPh9EtKZWWyPyVQOp08"
genai.configure(api_key=api_key)

# We will use the fast and efficient gemini-1.5-flash model
model = genai.GenerativeModel('gemini-1.5-flash')

# This isuse sprin your question to the AI
prompt = "how to spring and spring boot framework works and build an application using it?"

# Send the prompt to the model and get a response
print("Sending your request to the Gemini API...")
response = model.generate_content(prompt)

# Print the AI's answer
print("\n--- AI Response ---")
print(response.text)
print("-------------------")