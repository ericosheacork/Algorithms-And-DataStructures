//package com.company;
//import  java.util.Scanner;
//public class bishops {
//
//    int numbishops = 0;
//
//    public static void main(String[] args)
//    {
//         Scanner kb = new Scanner(System.in);
//        System.out.println("How many bishops are there?");
//        numbishops = kb.nextInt();
//       solveBishops();
//    }
//    public static void printRes(int board[][])
//    {
//        for(int i = 0; i < numbishops; i++)
//        {
//            for(int j = 0; j< numbishops; j++)
//            {
//                System.out.print(" " + board[i][j] + " " );
//            }
//        }
//    }
//
//    static boolean feasability(int board[][] , int col , int row)
//    {
//        // check diagonally  downwards left
//        for(int i = col; i < numbishops; i++ )
//        {
//          if(board[col][row] ==  1)
//          {
//            return false;
//          }
//
//          else
//          {
//              row++;
//          }
//        }
//
//        //check diagonally downward right
//        for(int i = row; i < numbishops; i++)
//        {
//            if(board[col][i] == 1)
//            {
//                return false;
//            }
//
//            else
//            {
//                col--;
//            }
//        }
//
//
//        //check diagonally upward rights
//
//        for(int i = col; i < numbishops; i++)
//        {
//
//                if(board[i][row] == 1)
//                {
//                    return false;
//                }
//                else
//                {
//                    row--;
//                }
//        }
//
//        // check diagonally upward left
//        for(int i =col ; i > 0; i--)
//        {
//            if(board[i][row] == 1)
//            {
//                return  false;
//            }
//
//            else
//            {
//                row --;
//            }
//        }
//
//
//        return true;
//    }
//
//
//    public static boolean solveBishops()
//    {
//        int[][] board = new int[numbishops][numbishops];
//        int columns = numbishops;
//        int rows  = numbishops;
//        int placed = 0;
//
//        boolean res = false;
//
//
//        //base case if all bishops are placed then return true and the solution will work
//        if(placed == columns)
//        {
//            printRes(board);
//            return true;
//        }
//
//        for(int i = 0; i < columns; i++)
//        {
//
//        }
//
//        return res;
//    }
//
//    boolean solveBacktrack(int board[][] , int col , int row)
//    {
//
//
//
//
//        return false;
//    }
//}
