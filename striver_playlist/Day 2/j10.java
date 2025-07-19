
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class j10 extends JFrame {
    private JButton[][] buttons;
    private boolean player1Turn = true;
    private JLabel statusLabel;

    public j10() {
        setTitle("Tic Tac Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Create game board panel
        JPanel boardPanel = new JPanel(new GridLayout(3, 3));
        buttons = new JButton[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                boardPanel.add(buttons[i][j]);
            }
        }

        // Create status label
        statusLabel = new JLabel("Player X's turn");
        statusLabel.setHorizontalAlignment(JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Add components to frame
        add(boardPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
    }

    private class ButtonClickListener implements ActionListener {
        private int row, col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (buttons[row][col].getText().equals("")) {
                if (player1Turn) {
                    buttons[row][col].setText("X");
                    statusLabel.setText("Player O's turn");
                } else {
                    buttons[row][col].setText("O");
                    statusLabel.setText("Player X's turn");
                }
                player1Turn = !player1Turn;
                
                if (checkWin()) {
                    String winner = player1Turn ? "O" : "X";
                    JOptionPane.showMessageDialog(null, "Player " + winner + " wins!");
                    resetGame();
                } else if (isBoardFull()) {
                    JOptionPane.showMessageDialog(null, "It's a tie!");
                    resetGame();
                }
            }
        }
    }

    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (!buttons[i][0].getText().equals("") &&
                buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][0].getText().equals(buttons[i][2].getText())) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (!buttons[0][j].getText().equals("") &&
                buttons[0][j].getText().equals(buttons[1][j].getText()) &&
                buttons[0][j].getText().equals(buttons[2][j].getText())) {
                return true;
            }
        }

        // Check diagonals
        if (!buttons[0][0].getText().equals("") &&
            buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[0][0].getText().equals(buttons[2][2].getText())) {
            return true;
        }

        if (!buttons[0][2].getText().equals("") &&
            buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[0][2].getText().equals(buttons[2][0].getText())) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        player1Turn = true;
        statusLabel.setText("Player X's turn");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            j10 game = new j10();
            game.setVisible(true);
        });
    }
}
//how to run this code:
//javac j10.java
//java j10
//This code creates a simple Tic Tac Toe game using Java Swing.
//It initializes a 3x3 grid of buttons, allows two players to take turns,               
