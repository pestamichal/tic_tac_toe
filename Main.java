package TicTacToe;

import javax.swing.*;
import java.awt.*;
import TicTacToe.Button;


public class Main {

    private JButton [][] board;
    private JLabel title;
    private String currentPlayer;
    private boolean hasWinner;

    public Main(){
        board = new JButton[3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                board[i][j] = new Button(this);
            }
        }
        currentPlayer = "X";
        title = new JLabel("Tic Tac Toe");
        hasWinner = false;

    }

    public boolean getHasWinner(){
        return hasWinner;
    }

    public void setHasWinner(boolean b){
        hasWinner = b;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public JButton[][] getBoard(){
        return board;
    }

    public void setCurrentPlayer(String s){
        currentPlayer = s;
    }

    private void resetBoard(){

    }



    public void createGUI(){
        JFrame frame = new JFrame("tic_tac_toe");
        JPanel panel = new JPanel();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length;j++){
                panel.add(board[i][j]);
            }

        }
        panel.setLayout(new GridLayout(3,3));

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        Main ttt = new Main();
        ttt.createGUI();
    }

}
