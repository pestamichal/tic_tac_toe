package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import TicTacToe.Main;

public class Button extends JButton{

        private String text;
        private static Main main;
        private static JButton[][] board;

        public Button(Main m){
                this.setFont(new Font("Arial", Font.BOLD, 50));
                this.main = m;
                this.setText(" ");
                text = this.getText();
                this.addActionListener(new ButtonReaction());
                this.board = main.getBoard();
        }

        private void sText(String s){
                this.setText(s);
        }

        private class ButtonReaction implements ActionListener {
                public void actionPerformed(ActionEvent e){

                        if(main.getHasWinner() == false){
                                if(text == " "){
                                        text = (main.getCurrentPlayer());
                                        sText(text);
                                        isWinner();
                                        if(main.getCurrentPlayer() == "X"){
                                                main.setCurrentPlayer("O");
                                        }else{
                                                main.setCurrentPlayer("X");
                                        }

                                }

                        }

                }
        }

        public void isWinner() {
                if (board[0][0].getText().equals(main.getCurrentPlayer()) && board[1][0].getText().equals(main.getCurrentPlayer()) && board[2][0].getText().equals(main.getCurrentPlayer())) {
                        board[0][0].setBackground(Color.GREEN);
                        board[1][0].setBackground(Color.GREEN);
                        board[2][0].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[0][1].getText().equals(main.getCurrentPlayer()) && board[1][1].getText().equals(main.getCurrentPlayer()) && board[2][1].getText().equals(main.getCurrentPlayer())) {
                        board[0][1].setBackground(Color.GREEN);
                        board[1][1].setBackground(Color.GREEN);
                        board[2][1].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[0][2].getText().equals(main.getCurrentPlayer()) && board[1][2].getText().equals(main.getCurrentPlayer()) && board[2][2].getText().equals(main.getCurrentPlayer())) {
                        board[0][2].setBackground(Color.GREEN);
                        board[1][2].setBackground(Color.GREEN);
                        board[2][2].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[0][0].getText().equals(main.getCurrentPlayer()) && board[1][1].getText().equals(main.getCurrentPlayer()) && board[2][2].getText().equals(main.getCurrentPlayer())) {
                        board[0][0].setBackground(Color.GREEN);
                        board[1][1].setBackground(Color.GREEN);
                        board[2][2].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[0][2].getText().equals(main.getCurrentPlayer()) && board[1][1].getText().equals(main.getCurrentPlayer()) && board[2][0].getText().equals(main.getCurrentPlayer())) {
                        board[0][2].setBackground(Color.GREEN);
                        board[1][1].setBackground(Color.GREEN);
                        board[2][0].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[0][0].getText().equals(main.getCurrentPlayer()) && board[0][1].getText().equals(main.getCurrentPlayer()) && board[0][2].getText().equals(main.getCurrentPlayer())) {
                        board[0][0].setBackground(Color.GREEN);
                        board[0][1].setBackground(Color.GREEN);
                        board[0][2].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[1][0].getText().equals(main.getCurrentPlayer()) && board[1][1].getText().equals(main.getCurrentPlayer()) && board[1][2].getText().equals(main.getCurrentPlayer())) {
                        board[1][0].setBackground(Color.GREEN);
                        board[1][1].setBackground(Color.GREEN);
                        board[1][2].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                } else if (board[2][0].getText().equals(main.getCurrentPlayer()) && board[2][1].getText().equals(main.getCurrentPlayer()) && board[2][2].getText().equals(main.getCurrentPlayer())) {
                        board[2][0].setBackground(Color.GREEN);
                        board[2][1].setBackground(Color.GREEN);
                        board[2][2].setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "GRATULUJE MARYSIU! <3");
                        main.setHasWinner(true);
                }
        }

}
