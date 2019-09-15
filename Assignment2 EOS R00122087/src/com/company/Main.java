package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       woodLogCuttingBottomUp p1 = new woodLogCuttingBottomUp(5);
        p1.solve(5);

        RobotMoving r1 = new RobotMoving( 4, 'A');
                r1.shortestPath();
    }
}
