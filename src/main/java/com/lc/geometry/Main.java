package com.lc.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,5));
        list.add(new Point(6,6));
        list.add(new Point(7,7));
        list.add(new Point(8,8));
        list.add(new Point(9,9));
        list.add(new Point(1,1));
        list.add(new Point(2,2));
        list.add(new Point(3,3));
        list.add(new Point(4,4));

        System.out.println(list.toString());


        final Point vertex = new Point(0,0);
        PriorityQueue<Point> pq = new PriorityQueue<>((p1,p2) ->{
            return (int) (p1.distanceFromPoint() - p2.distanceFromPoint());
        });
        for (Point p : list){
            pq.add(p);
        }
        while(true)
        {
            Point e = pq.poll();
            System.out.println(e);

            if(e == null) break;
        }


    }
}
