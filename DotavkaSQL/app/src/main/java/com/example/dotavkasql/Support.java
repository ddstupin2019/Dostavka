package com.example.dotavkasql;

import android.util.Log;

import java.util.ArrayList;

public class Support {
        public static ArrayList<Integer> df(ArrayList<Object> q) {
                ArrayList<Integer> x = new ArrayList<>();
                for (int i = 0; i < q.size(); i++) {
                        x.add(Integer.valueOf(q.get(i).toString()));
                }
                return x;
        }
        public static Output ekb(Root root){
                Log.d("Ny","ekkb");
                int a=Integer.parseInt(root.EkbObject.getNumberOfCompletedOrdersTheDay()),
                        s=Integer.parseInt(root.EkbObject.getNumberLongDistanceOrdersTheDay()),
                        d=Integer.parseInt(root.EkbObject.getNumberOfUnfulfilledOrdersTheDay()),
                        f=Integer.parseInt(root.EkbObject.getProfitOfCompletedOrdersTheDay());
                Log.d("My","dsfs"+a+" "+d+" "+s+" "+f);
                Output o = new Output(a+d,s,s*100/(a+d),d,d*100/(a+d),f,"ed");
                return o;
        }
        public static Output chel(Root root){
                int a=Integer.parseInt(root.ChelibObject.getNumberOfCompletedOrdersTheDay()),
                        s=Integer.parseInt(root.ChelibObject.getNumberLongDistanceOrdersTheDay()),
                        d=Integer.parseInt(root.ChelibObject.getNumberOfUnfulfilledOrdersTheDay()),
                        f=Integer.parseInt(root.ChelibObject.getProfitOfCompletedOrdersTheDay());
                Output o = new Output(a+d, s,s*100/(a+d),d,d*100/(a+d),f,"cd");
                return o;
        }
        public static Output tum(Root root) {
                int a = Integer.parseInt(root.TumenObject.getNumberOfCompletedOrdersTheDay()),
                        s = Integer.parseInt(root.TumenObject.getNumberLongDistanceOrdersTheDay()),
                        d = Integer.parseInt(root.TumenObject.getNumberOfUnfulfilledOrdersTheDay()),
                        f = Integer.parseInt(root.TumenObject.getProfitOfCompletedOrdersTheDay());
                Output o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "td");
                return o;
        }
                public static Output kur(Root root) {
                        int a = Integer.parseInt(root.KurganObject.getNumberOfCompletedOrdersTheDay()),
                                s = Integer.parseInt(root.KurganObject.getNumberLongDistanceOrdersTheDay()),
                                d = Integer.parseInt(root.KurganObject.getNumberOfUnfulfilledOrdersTheDay()),
                                f = Integer.parseInt(root.KurganObject.getProfitOfCompletedOrdersTheDay());
                        Output o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "kd");
                        return o;
                }
}
