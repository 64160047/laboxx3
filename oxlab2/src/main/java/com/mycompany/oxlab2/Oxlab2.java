/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oxlab2;

/**
 *
 * @author minnie
 */
public class Oxlab2 {
    static char[][] board= {{'_', '_', '_'},{'_', '_', '_'},{'_', '_', '_'}};
    public static void main(String[] args) {
       printStartGameOX();
       printShowBoard();
       
    }
    private static void  printStartGameOX() {
         System.out.println("WELCOME OX GAME 👀");
         System.out.println("Start Game ➤➤ (y/n): ");   
    }
    
    private static void  printShowBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println("");

        }
         
    }
   
}
