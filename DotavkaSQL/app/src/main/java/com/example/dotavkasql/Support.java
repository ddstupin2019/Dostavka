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

        public static Output ekb(Root root) {
                Log.d("Ny", "ekkb");
                int a = Integer.parseInt(root.Ekb.getNumberOfCompletedOrdersTheDay()),
                        s = Integer.parseInt(root.Ekb.getNumberLongdistanceOrdersTheDay()),
                        d = Integer.parseInt(root.Ekb.getNumberOfUnfulfilledOrdersTheDay()),
                        f = Integer.parseInt(root.Ekb.getProfitOfCompletedOrdersTheDay());
                Log.d("My", "dsfs" + a + " " + d + " " + s + " " + f);
                Output o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "ed");
                return o;
        }

        public static Output chel(Root root) {
                int a = Integer.parseInt(root.Chelib.getNumberOfCompletedOrdersTheDay()),
                        s = Integer.parseInt(root.Chelib.getNumberLongdistanceOrdersTheDay()),
                        d = Integer.parseInt(root.Chelib.getNumberOfUnfulfilledOrdersTheDay()),
                        f = Integer.parseInt(root.Chelib.getProfitOfCompletedOrdersTheDay());
                Output o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "cd");
                return o;
        }

        public static Output tum(Root root) {
                int a = Integer.parseInt(root.Tumen.getNumberOfCompletedOrdersTheDay()),
                        s = Integer.parseInt(root.Tumen.getNumberLongdistanceOrdersTheDay()),
                        d = Integer.parseInt(root.Tumen.getNumberOfUnfulfilledOrdersTheDay()),
                        f = Integer.parseInt(root.Tumen.getProfitOfCompletedOrdersTheDay());
                Output o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "td");
                return o;
        }

        public static Output kur(Root root) {
                int a = Integer.parseInt(root.Turgan.getNumberOfCompletedOrdersTheDay()),
                        s = Integer.parseInt(root.Turgan.getNumberLongdistanceOrdersTheDay()),
                        d = Integer.parseInt(root.Turgan.getNumberOfUnfulfilledOrdersTheDay()),
                        f = Integer.parseInt(root.Turgan.getProfitOfCompletedOrdersTheDay());
                Output o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "kd");
                return o;
        }
        public static void ekbM(Root root) {
                Output o;
                for (int i = 0; i < MainActivity.root.Ekb.numberLongdistanceOrdersTheMonth.size(); i++) {
                        int a = Integer.parseInt((String) root.Ekb.numberLongdistanceOrdersTheMonth.get(i)),
                                s = Integer.parseInt((String) root.Ekb.numberLongdistanceOrdersTheMonth.get(i)),
                                d = Integer.parseInt((String) root.Ekb.numberOfUnfulfilledOrdersTheMonth.get(i)),
                                f = Integer.parseInt((String) root.Ekb.profitOfCompletedOrdersTheMonth.get(i));
                        o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "ed",Integer.parseInt((String) root.Ekb.Data.get(i)));
                        MainActivity.database.insertM(o);
                }
        }
        public static void chelM(Root root) {
                Output o;
                for (int i = 0; i < MainActivity.root.Chelib.numberLongdistanceOrdersTheMonth.size(); i++) {
                        int a = Integer.parseInt((String) root.Chelib.numberLongdistanceOrdersTheMonth.get(i)),
                                s = Integer.parseInt((String) root.Chelib.numberLongdistanceOrdersTheMonth.get(i)),
                                d = Integer.parseInt((String) root.Chelib.numberOfUnfulfilledOrdersTheMonth.get(i)),
                                f = Integer.parseInt((String) root.Chelib.profitOfCompletedOrdersTheMonth.get(i));
                        o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "ed", Integer.parseInt((String) root.Chelib.Data.get(i)));
                        MainActivity.database.insertM(o);
                }
        }
        public static void tumM(Root root) {
                Output o;
                for (int i = 0; i < MainActivity.root.Tumen.numberLongdistanceOrdersTheMonth.size(); i++) {
                        int a = Integer.parseInt((String) root.Tumen.numberLongdistanceOrdersTheMonth.get(i)),
                                s = Integer.parseInt((String) root.Tumen.numberLongdistanceOrdersTheMonth.get(i)),
                                d = Integer.parseInt((String) root.Tumen.numberOfUnfulfilledOrdersTheMonth.get(i)),
                                f = Integer.parseInt((String) root.Tumen.profitOfCompletedOrdersTheMonth.get(i));
                        o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "ed",Integer.parseInt((String) root.Tumen.Data.get(i)));
                        MainActivity.database.insertM(o);
                }
        }
        public static void kurM(Root root) {
                Output o;
                for (int i = 0; i < MainActivity.root.Turgan.numberLongdistanceOrdersTheMonth.size(); i++) {
                        int a = Integer.parseInt((String) root.Turgan.numberLongdistanceOrdersTheMonth.get(i)),
                                s = Integer.parseInt((String) root.Turgan.numberLongdistanceOrdersTheMonth.get(i)),
                                d = Integer.parseInt((String) root.Turgan.numberOfUnfulfilledOrdersTheMonth.get(i)),
                                f = Integer.parseInt((String) root.Turgan.profitOfCompletedOrdersTheMonth.get(i));
                        o = new Output(a + d, s, s * 100 / (a + d), d, d * 100 / (a + d), f, "ed",Integer.parseInt((String) root.Turgan.Data.get(i)));
                        MainActivity.database.insertM(o);
                }
        }
}