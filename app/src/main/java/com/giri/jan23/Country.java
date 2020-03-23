package com.giri.jan23;

import java.util.ArrayList;

class Country {
    private String name;
    private String capital;
    private String flag;
    private ArrayList<String> borders;
    private ArrayList<Currency> currencies;

    public String getName() {
        return name;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public String getCapital() {
        return capital;
    }

    public String getFlag() {
        return flag;
    }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }
}
