package com.lifeistech.andoroid.tapnumber;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {

    final SharedPreferences preferences;

    public PreferenceManager(Application application) {
        this.preferences = application.getSharedPreferences("DATA", Context.MODE_PRIVATE);
    }

    // 保存した数字を取得
    public int getInt(String key, int defaultValue) {
        return preferences.getInt(key, defaultValue);
    }

    // 数字を保存
    public void setInt(String key, int value) {
        preferences.edit()
                .putInt(key, value)
                .apply();
    }

    // 保存した文字を取得
    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }

    // 文字を保存
    public void setString(String key, String value) {
        preferences.edit()
                .putString(key, value)
                .apply();
    }

    // general
    public int getCount() {
        return preferences.getAll().size();
    }

    public void delete(String key) {
        preferences.edit()
                .remove(key)
                .apply();
    }

    public void deleteAll() {
        preferences.edit()
                .clear()
                .apply();
    }
}