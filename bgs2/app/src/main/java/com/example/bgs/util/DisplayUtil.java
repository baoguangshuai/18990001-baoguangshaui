package com.example.bgs.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class DisplayUtil {

    public static int getScreenWidth(Context ctx)
    {
        WindowManager wm=(WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new   DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;

    }
    public static int getScreenHeight(Context  ctx)
    {
        WindowManager wm=(WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new   DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.heightPixels;

    }
    public   static float getScreenDensity(Context  ctx)
    {
        WindowManager wm=(WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new   DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return dm.density;
    }







}
