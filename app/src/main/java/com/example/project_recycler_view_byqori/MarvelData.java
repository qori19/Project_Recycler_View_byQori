package com.example.project_recycler_view_byqori;

import java.util.ArrayList;

public class MarvelData {
    private static String[] title = new String[] {"Batman (15)","Captain America (25)","Spiderman (10)","Hulk (21)", "Flash(7)","Superman (13)","Ironman (18)"};

    private static int[] thumbnail = new int[] {R.drawable.batman,R.drawable.captain_america,R.drawable.spiderman,R.drawable.hulk,R.drawable.flash,R.drawable.superman,R.drawable.ironman};

    public static ArrayList<MarvelModel> getListData(){
        MarvelModel marvelmodel = null;
        ArrayList<MarvelModel> list = new ArrayList<>();
        for (int i=0;i<title.length;i++){
            marvelmodel = new MarvelModel();
            marvelmodel.setNamaMarvel(title[i]);
            marvelmodel.setFotoMarvel(thumbnail[i]);
            list.add(marvelmodel);
        }
        return list;
    }
}
