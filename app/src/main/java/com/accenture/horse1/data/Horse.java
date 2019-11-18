package com.accenture.horse1.data;

import com.accenture.horse1.R;
import com.accenture.horse1.model.Item;

import java.util.ArrayList;

public class Horse
{

    public ArrayList<Item> getHorseList() {
        ArrayList<Item> horseList = new ArrayList<>();
        horseList.add(new Item("Sergeant Reckless", R.drawable.sergeant_reckless, "ramu"));
        horseList.add(new Item("Comanche",R.drawable.comanche, "vinay") );
        horseList.add(new Item("Cincinnati",R.drawable.cincinnati, "fyroz"));
//        horseList.add(new Item(breedName: "tyu",R.drawable.cincinnati));

        return horseList;
    }
}
