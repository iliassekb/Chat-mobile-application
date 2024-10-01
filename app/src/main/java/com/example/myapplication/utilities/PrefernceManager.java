package com.example.myapplication.utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefernceManager {

    private final SharedPreferences sharedPreferces;

    public PrefernceManager(Context context){

        sharedPreferces = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME,Context.MODE_PRIVATE);
    }

    public void putBoolean(String key,Boolean value){
        SharedPreferences.Editor editor = sharedPreferces.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }

    public Boolean getBoolean (String key){
        return sharedPreferces.getBoolean(key,false);
    }

    public void putString(String key,String value){
        SharedPreferences.Editor editor = sharedPreferces.edit();
        editor.putString(key,value);
        editor.apply();
    }

    public String getString (String key){
        return sharedPreferces.getString(key,null);
    }

    public void clear(){
        SharedPreferences.Editor editor = sharedPreferces.edit();
        editor.clear();
        editor.apply();
    }
}
