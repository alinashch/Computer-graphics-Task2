package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.PI;

public class Graph extends JPanel  {

    @Override
    protected void paintComponent(Graphics g) {
       // DrawScale(g);
        int [] arr=new int[]{160,130,170,150,190,150,170,170,190,190,160,180,130,190,150,170,130,150,150,150};
        g.setColor(Color.white);
        DrawStar(g,arr);
        int c=2;
        g.setColor(Color.RED);
        DrawScale2(g,arr,c);
        int m=160;
        int n=155;
       // n=130;
       // m=300;
       // n=200;
        double x= -PI/2;
        g.setColor(Color.BLUE);
        Spin(g,arr, m, n, x);
        n=0;
        g.setColor(Color.green);
        Move(g, arr, m,n);
        Move(g, arr,n,m);
        g.setColor(Color.CYAN);
        pullingOnX(g,arr,5);
        pullingOnY(g,arr,4);
    }
    public static void DrawStar(Graphics g, int [] arr) {
        for (int i = 0; i < arr.length - 3; i++) {
            g.drawLine(arr[i], arr[i + 1], arr[i + 2], arr[i + 3]);
            i++;
        }
        g.drawLine(arr[arr.length - 2], arr[arr.length - 1], arr[0], arr[1]);
    }
        public static void Spin(Graphics g, int [] arr, int m, int n, double x){
        for(int i=0; i< arr.length-3; i++){
            int []a1=new int [3];
            int []a2=new int [3];
            a1[0]=arr[i];
            a1[1]=arr[i+1];
            a1[2]=1;
            a2[0]=arr[i+2];
            a2[1]=arr[i+3];
            a2[2]=1;
            g.drawLine(Logic.OneOnThree(a1,m,n,x)[0],Logic.OneOnThree(a1,m,n,x)[1],Logic.OneOnThree(a2,m,n,x)[0],Logic.OneOnThree(a2,m,n,x)[1] );
            i++;
        }
        int []a1=new int [3];
        int []a2=new int [3];
        a1[0]=arr[arr.length-2];
        a1[1]=arr[arr.length-1];
        a1[2]=1;
        a2[0]=arr[0];
        a2[1]=arr[1];
        a2[2]=1;
       g.drawLine(Logic.OneOnThree(a1,m,n,x)[0],Logic.OneOnThree(a1,m,n,x)[1],Logic.OneOnThree(a2,m,n,x)[0],Logic.OneOnThree(a2,m,n,x)[1]);
    }
    public static void pullingOnY(Graphics g, int [] arr, int m){

        for(int i=0; i< arr.length-3; i++){
            int []a1=new int [2];
            int []a2=new int [2];
            a1[0]=arr[i];
            a1[1]=arr[i+1];
            a2[0]=arr[i+2];
            a2[1]=arr[i+3];
            g.drawLine(Logic.multiplicationY(a1,m)[0], Logic.multiplicationY(a1,m)[1],Logic.multiplicationY(a2,m)[0],Logic.multiplicationY(a2,m)[1] );
            i++;
        }
        int []a1=new int [2];
        int []a2=new int [2];
        a1[0]=arr[arr.length-2];
        a1[1]=arr[arr.length-1];
        a2[0]=arr[0];
        a2[1]=arr[1];
        g.drawLine(Logic.multiplicationY(a1,m)[0], Logic.multiplicationY(a1,m)[1],Logic.multiplicationY(a2,m)[0],Logic.multiplicationY(a2,m)[1] );

    }
    public static void pullingOnX(Graphics g, int [] arr, int m){

        for(int i=0; i< arr.length-3; i++){
            int []a1=new int [2];
            int []a2=new int [2];
            a1[0]=arr[i];
            a1[1]=arr[i+1];
            a2[0]=arr[i+2];
            a2[1]=arr[i+3];
            g.drawLine(Logic.multiplicationX(a1,m)[0], Logic.multiplicationX(a1,m)[1],Logic.multiplicationX(a2,m)[0],Logic.multiplicationX(a2,m)[1] );
            i++;
        }
        int []a1=new int [2];
        int []a2=new int [2];
        a1[0]=arr[arr.length-2];
        a1[1]=arr[arr.length-1];
        a2[0]=arr[0];
        a2[1]=arr[1];
        g.drawLine(Logic.multiplicationX(a1,m)[0], Logic.multiplicationX(a1,m)[1],Logic.multiplicationX(a2,m)[0],Logic.multiplicationX(a2,m)[1] );

    }
    public static void Move(Graphics g, int [] arr, int m, int n){

        int [] a=new int[3];
        int[]a2=new int[3];
        for(int i=0; i< arr.length-3; i++){
            a[0]=arr[i];
            a[1]=arr[i+1];
            a[2]=1;
            a2[0]=arr[i+2];
            a2[1]=arr[i+3];
            a2[2]=1;
            int [] A=Logic.multiplicationOnMandN(a,m,n);
            int []A2=Logic.multiplicationOnMandN(a2,m,n);
            g.drawLine(A[0], A[1],A2[0],A2[1] );
            i++;
        }
        a[0]=arr[arr.length-2];
        a[1]=arr[arr.length-1];
        a[2]=1;
        a2[0]=arr[0];
        a2[1]=arr[1];
        a2[2]=1;
        g.drawLine(Logic.multiplicationOnMandN(a,m,n)[0],Logic.multiplicationOnMandN(a,m,n)[1],Logic.multiplicationOnMandN(a2,m,n)[0],Logic.multiplicationOnMandN(a2,m,n)[1]);

    }
    public static void DrawScale2(Graphics g,int [] arr, int c){


        for(int i=0; i< arr.length-3; i++){
            int []a1=new int [2];
            int []a2=new int [2];
            a1[0]=arr[i];
            a1[1]=arr[i+1];
            a2[0]=arr[i+2];
            a2[1]=arr[i+3];
            g.drawLine(Logic.Scale(a1,c)[0],Logic.Scale(a1,c)[1],Logic.Scale(a2,c)[0],Logic.Scale(a2,c)[1] );
            i++;
        }
        int []a1=new int [2];
        int []a2=new int [2];
        a1[0]=arr[arr.length-2];
        a1[1]=arr[arr.length-1];
        a2[0]=arr[0];
        a2[1]=arr[1];
        g.drawLine(Logic.Scale(a1,c)[0],Logic.Scale(a1,c)[1],Logic.Scale(a2,c)[0],Logic.Scale(a2,c)[1] );
    }


    public static void DrawScale(Graphics g){
        int [] arr1=new int[]{40,10};
        int [] arr2=new int[]{50,30};
        int [] arr3=new int[]{70,30};
        int [] arr4=new int[]{50,50};
        int [] arr5=new int[]{70,70};
        int [] arr6=new int[]{40,60};
        int [] arr7=new int[]{10,70};
        int [] arr8=new int[]{30,50};
        int [] arr9=new int[]{10,30};
        int [] arr10=new int[]{30,30};

        int [] XY1=Logic.Scale(arr1, 10);
        int [] XY2=Logic.Scale(arr2,10);
        int [] XY3=Logic.Scale(arr3, 10);
        int [] XY4=Logic.Scale(arr4,10);
        int [] XY5=Logic.Scale(arr5, 10);
        int [] XY6=Logic.Scale(arr6,10);
        int [] XY7=Logic.Scale(arr7, 10);
        int [] XY8=Logic.Scale(arr8,10);
        int [] XY9=Logic.Scale(arr9, 10);
        int [] XY10=Logic.Scale(arr10,10);


        g.drawLine(arr1[0], arr1[1], arr2[0], arr2[1]);
        g.drawLine(arr2[0], arr2[1], arr3[0], arr3[1]);
        g.drawLine(arr3[0], arr3[1], arr4[0], arr4[1]);
        g.drawLine(arr4[0], arr4[1], arr5[0], arr5[1]);
        g.drawLine(arr5[0], arr5[1], arr6[0], arr6[1]);
        g.drawLine(arr6[0], arr6[1], arr7[0], arr7[1]);
        g.drawLine(arr7[0], arr7[1], arr8[0], arr8[1]);
        g.drawLine(arr8[0], arr8[1], arr9[0], arr9[1]);
        g.drawLine(arr9[0], arr9[1], arr10[0], arr10[1]);
        g.drawLine( arr10[0], arr10[1], arr1[0], arr1[1]);


        g.drawLine(XY1[0], XY1[1], XY2[0], XY2[1]);
        g.drawLine(XY2[0], XY2[1], XY3[0], XY3[1]);
        g.drawLine(XY3[0], XY3[1], XY4[0], XY4[1]);
        g.drawLine(XY4[0], XY4[1], XY5[0], XY5[1]);
        g.drawLine(XY5[0], XY5[1], XY6[0], XY6[1]);
        g.drawLine(XY6[0], XY6[1], XY7[0], XY7[1]);
        g.drawLine(XY7[0], XY7[1], XY8[0], XY8[1]);
        g.drawLine(XY8[0], XY8[1], XY9[0], XY9[1]);
        g.drawLine(XY9[0], XY9[1], XY10[0], XY10[1]);
        g.drawLine( XY10[0], XY10[1], XY1[0], XY1[1]);

    }

}
