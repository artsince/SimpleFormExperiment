package com.ahmetkizilay.test.simpleform.simpleformexperiment.mock;

import android.content.SharedPreferences;

import java.util.Set;

/**
 * Created by ahmetkizilay on 20.12.2014.
 */
public class MockEditor implements SharedPreferences.Editor {
    @Override
    public SharedPreferences.Editor putString(String key, String value) {
        return null;
    }

    @Override
    public SharedPreferences.Editor putStringSet(String key, Set<String> values) {
        return null;
    }

    @Override
    public SharedPreferences.Editor putInt(String key, int value) {
        return null;
    }

    @Override
    public SharedPreferences.Editor putLong(String key, long value) {
        return null;
    }

    @Override
    public SharedPreferences.Editor putFloat(String key, float value) {
        return null;
    }

    @Override
    public SharedPreferences.Editor putBoolean(String key, boolean value) {
        return null;
    }

    @Override
    public SharedPreferences.Editor remove(String key) {
        return null;
    }

    @Override
    public SharedPreferences.Editor clear() {
        return null;
    }

    @Override
    public boolean commit() {
        return false;
    }

    @Override
    public void apply() {

    }
}