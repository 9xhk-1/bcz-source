package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes7.dex */
public class a {
    public static NetworkInfo a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static boolean b(Context context) {
        NetworkInfo a11 = a(context);
        return a11 != null && a11.isConnected() && a11.getType() == 1;
    }
}
