package com.azza.seasonalproduce;

import android.app.Activity;
import android.content.Intent;

public class Utils {
    private static int sTheme;

    public final static int THEME_SUMMER = 0;
    public final static int THEME_AUTUMN = 1;
    public final static int THEME_WINTER = 2;
    public final static int THEME_SPRING = 3;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void OnActivityCreateSetTheme(Activity activity) {
        switch(sTheme) {
            default:
            case THEME_SUMMER:
                activity.setTheme(R.style.SummerTheme);
                break;
            case THEME_AUTUMN:
                activity.setTheme(R.style.AutumnTheme);
                break;
            case THEME_WINTER:
                activity.setTheme(R.style.WinterTheme);
                break;
            case THEME_SPRING:
                activity.setTheme(R.style.SpringTheme);
                break;
        }
    }
}
