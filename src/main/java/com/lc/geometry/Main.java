package com.lc.geometry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(2,4));
        list.add(new Point(3,2));
        list.add(new Point(42,5));
        list.add(new Point(13,3));
        list.add(new Point(61,7));
        list.add(new Point(26,4));
        list.add(new Point(3,88));
        list.add(new Point(4,3));
        System.out.println(list.toString());
        final Point vertex = new Point(0,0);
        PriorityQueue<Point> pq = new PriorityQueue<>(list.size(),(p1,p2) ->{
            return (int) (p1.distanceFromPoint(vertex) - p2.distanceFromPoint(vertex));
        });
        for (Point p : list){
            pq.add(p);
        }
        System.out.println(pq.toString());



    }
}
