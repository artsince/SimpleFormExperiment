package com.ahmetkizilay.test.simpleform.simpleformexperiment.wrappers;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ahmetkizilay on 20.12.2014.
 */
public class UserStorage {

    private static final String NAME = "info";

    public static void updateUser(Context context, String username, int age) {
        SharedPreferences sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().putString("name", username).putInt("age", age).commit();
    }

    public static User getUser(Context context) {
        SharedPreferences sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        User newUser = new User();
        newUser.name = sp.getString("name", "");
        newUser.age = sp.getInt("age", -1);

        return newUser;
    }


    public static void clearUser(Context context) {
        SharedPreferences sp = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }
}
