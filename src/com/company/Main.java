package com.company;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(int a, int b, int x, int y){
        setSize(a,b);
        setLocation(x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.BLACK);
    }
    public static void main(String[] args) {
        Main main = new Main(1000,1000, 0,0);
        Graph g = new Graph();
        main.add(g);
    }
}
