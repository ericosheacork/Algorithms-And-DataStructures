package com.company;

import java.text.DecimalFormat;

public class RobotMoving {

   
    double[] am = {1.1,1.3,100};
    double[] nz = {1.5,1.2,2.3};
    double[] costs = new double[3];


   double[][] costGrid;
   char[][] path;
   char[][] solution ;
   double cost = 0;
   char name;
   int gridSize;

    public RobotMoving(int gs, char n)
    {
       // this.costGrid = new double[gridSize][gridSize];
        this.solution = new char[gs][gs];
        this.costGrid = new double[gs][gs];
        this.path = new char[gs][gs];


        this.name = n;
        this.gridSize = gs;
        int charTest = n;

        
        if(charTest>64)
        {
            costs = am;
        }
        if(charTest>77)
        {
            costs = nz;
        }

    }

   public void shortestPath()
   {
        findShortestDirection();
        
   }


    public void findShortestDirection()
    {
        // top down approach x is x axis y is y axis if the costgrid
        // for the picked character n means no value has been chosen , r is right , d is down and x indicates diagonal
       
        for(int y = 0; y<gridSize; y++)
        {
           
            for(int x = 0; x<gridSize; x++)  
            {
                double smallestCost = 9999999.9;
                char picked = 'n';
            // solution[y][x] = costs[]

                if(x-1>=0)
                {
                    if(costGrid[y][x-1] + costs[0] < smallestCost)
                    {
                        smallestCost = costGrid[y][x-1] + costs[0];
                        picked = 'r';
                    }
                }

                if(y-1>=0)
                {
                    if(costGrid[y-1][x] + costs[1] < smallestCost)
                    {
                        smallestCost  = costGrid[y-1][x] + costs[1];
                        picked = 'd';
                    }
                }

                if(y-1 >= 0 && x-1 >= 0)
                {
                    if(costGrid[y-1][x - 1] + costs[2] < smallestCost)
                    {
                        smallestCost  = costGrid[y-1][x - 1] + costs[2];
                        picked = 'x';
                    }
                }
                if(y == 0 && x == 0)
                {
                    smallestCost = 0.0;
                    picked = '-';
                }
                
               path[y][x] = picked;
               costGrid[y][x] = smallestCost;
               solution[y][x] += costGrid[x][y];


                } 
        }
        printSolution();
        

    }
   

   

    public void printSolution()
    {
        
        // prints the solution

        // this for loop prints the costGrid matrix i is the rows and j is the columns
        System.out.println(" COSTS");
       
        for(int i = 0; i < costGrid.length; i++)
        {
            String pcosts = "(";
            for(int j = 0 ; j < costGrid.length; j++ )
            {
               pcosts +=" " + costGrid[i][j] + ",";
            }
            pcosts += " )";
            System.out.println(pcosts);
           
        }
       

        System.out.println("\n Full Path");
        for(int i = 0; i < path.length; i++)
        {
            String pPath = "( ";
            for(int j = 0; j < path.length; j++)
            {
                pPath = pPath + path[i][j] + " , ";
            }
            pPath +=")";
            System.out.println(pPath);
            
           
        }
       
    }

    

}
