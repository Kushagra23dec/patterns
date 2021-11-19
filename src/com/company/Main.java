package com.company;

public class Main {

    public void patterns (int n) {
int k=1, i=0, j=0, x=2*n-1;
        for(  i = 1; i<=n; i++){
            k=1;
            for(  j = 1; j<=x; j++){

                if(j<=n-1+i && j>=n+1-i && k==1 ){    // 2n-1-n+i
                    System.out.print(j);
                    k=0;
                }
                else{
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
	// write your code here

        Main m = new Main();

        m.patterns(9);

    }
}
