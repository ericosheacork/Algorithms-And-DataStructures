package com.company;

import java.util.Arrays;

public class woodLogCuttingBottomUp {

    //int sizeOfWood;

     double[] prices  = new double[] {0 ,1.2 , 3 , 5.8 , 0 , 10.1};
      boolean[] valid = new  boolean[] {true , true , true , true , false , true};
     double[] cuts ;
     double [] optimalPrices;
    double maxPrice;


     public  woodLogCuttingBottomUp(int size)
     {

         //this.sizeOfWood = size;
         this.optimalPrices = new double[size + 1];
         this.cuts = new double[size + 1];

     }





    public  void solve(int size)
    {System.out.println("blah blah");
        if(size == 0)
        {
            System.out.println("Nothing to cut");

        }



        else {
            for (int i = 0; i <= size; i++) {

                maxPrice = Integer.MIN_VALUE;
                for (int j = 0; j <= i; j++) {
                    if (valid[i] == true) {
                        if (maxPrice < prices[j] + optimalPrices[i]) {

                            maxPrice = Math.max(maxPrice, prices[j] + optimalPrices[i]);
                            cuts[i] = j;

                        }
                    }


                }

                optimalPrices[i] = maxPrice;

            }

        }

       // printSolution();
        optimalSolution(optimalPrices , maxPrice);
    }



    public void optimalSolution(double[] optimalP , double max)
    {
        for(int i = 0; i >= optimalP.length; i++)
        {
            if(optimalP[i] > max)
            {
                max = optimalP[i];
            }


        }

        System.out.println( toString());
        System.out.println("Max Price = " + max);
        System.out.println();



    }
    public String toString() {
        return "PaperRollCuttingBottomUp{" +
                "prices=" + Arrays.toString(prices) + "\n" +
                " cuts=" + Arrays.toString(cuts) + "\n "+
                "optimalPrices=" + Arrays.toString(optimalPrices) +
                '}';
    }

}
