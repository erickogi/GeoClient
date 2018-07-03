package com.dev.geoclient;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    private static final String PREF_NAME = "geoclient";
   private static final String KEY_ACCOUNT_NAME = "account";

    // Shared Preferences
    SharedPreferences pref;
    // Editor for Shared preferences
    SharedPreferences.Editor editor;
    // Context
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;



    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public String getName() {
        return pref.getString(KEY_ACCOUNT_NAME, null);
    }
    public void setKeyAccountName(String accountName) {
        editor.putString(KEY_ACCOUNT_NAME, accountName);
        editor.commit();
    }

}
