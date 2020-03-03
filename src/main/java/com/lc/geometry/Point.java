package com.lc.geometry;

public class Point {
    double x=-1;
    double y =-1;

    public Double distanceFromPoint(){
        return Math.abs(Math.sqrt(x*x + y*y));
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }



    public String toString(){
        return "\n"+this.x+" " + this.y + " " +  Math.abs(Math.sqrt(x*x + y*y)) ;
    }

}
