package com.example.demo;

import java.util.ArrayList;
import java.util.List;
//باقی مجموعه اطلاعات (یک سطر) اینجانگه داری میشود
public class Pack implements Comparable {
    private int max ;
    List values = new ArrayList<>();
    public Pack (int max) {
        this.max = max ;
    }
    public void addValue (Object o) {
        if (values.size() < max) {
            values.add(o);
        }
    }
    public void deleteValue (int n) {
        Object old = values.get(n) ;
        values.remove(old) ;
        values.add(n , "");
    }
    public void editeValue (int n , Object ob) {
        Object old = values.get(n) ;
        values.remove(old) ;
        values.add(n , ob);
    }
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (int i = 0 ; i < values.size() ; i++) {
            text.append(values.get(i));
        }
        return String.valueOf(text);
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public void addMax() {
        this.max ++ ;
    }
}
