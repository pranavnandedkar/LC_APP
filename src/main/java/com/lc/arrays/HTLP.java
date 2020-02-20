package com.lc.arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HTLP {



    public static void main(String[] args) {
        List<Serializable> list = new ArrayList<>();
        list.addAll(HTLP.getList(list));

//       int[] ret = new int[];



    }
    public static List<? extends Serializable> getList(List<? extends Serializable> list){

        return list;
    }

}
