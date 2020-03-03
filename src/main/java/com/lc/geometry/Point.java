package com.lc.geometry;

public class Point {
    double x=0;
    double y =0;


    public Double distanceFromPoint(Point pt){
        return Math.sqrt(Math.abs(Math.pow(this.x - pt.x,2) - Math.pow(this.y - pt.y,2)));
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }



    public String toString(){
        return this.x+" " + this.y + " " + distanceFromPoint(new Point(0,0)) ;
    }

}
