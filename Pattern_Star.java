package com.company;
    public class Pattern_Star
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int p = 0; p <= n; p++)
        {
            for (int k = 1; k <= p; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}