package com.tencent.open.b;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.tencent.open.log.SLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected static final Uri f44446a = Uri.parse("content://telephony/carriers/preferapn");

    public static String a(Context context) {
        int d11 = d(context);
        if (d11 == 2) {
            return "wifi";
        }
        if (d11 == 1) {
            return "cmwap";
        }
        if (d11 == 4) {
            return "cmnet";
        }
        if (d11 == 16) {
            return "uniwap";
        }
        if (d11 == 8) {
            return "uninet";
        }
        if (d11 == 64) {
            return "wap";
        }
        if (d11 == 32) {
            return com.alipay.sdk.m.k.b.f10651k;
        }
        if (d11 == 512) {
            return "ctwap";
        }
        if (d11 == 256) {
            return "ctnet";
        }
        if (d11 == 2048) {
            return "3gnet";
        }
        if (d11 == 1024) {
            return "3gwap";
        }
        String b11 = b(context);
        return (b11 == null || b11.length() == 0) ? "none" : b11;
    }

    public static String b(Context context) {
        return "";
    }

    public static String c(Context context) {
        try {
            Cursor query = context.getContentResolver().query(f44446a, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex("proxy"));
            query.close();
            return string;
        } catch (SecurityException e11) {
            SLog.e("openSDK_LOG.APNUtil", "getApnProxy has exception: " + e11.getMessage());
            return "";
        }
    }

    public static int d(Context context) {
        NetworkInfo e11;
        try {
            e11 = e(context);
        } catch (Exception e12) {
            SLog.e("openSDK_LOG.APNUtil", "getMProxyType has exception: " + e12.getMessage());
        }
        if (e11 == null) {
            return 128;
        }
        if (e11.getTypeName().toUpperCase().equals("WIFI")) {
            return 2;
        }
        String lowerCase = e11.getExtraInfo().toLowerCase();
        if (lowerCase.startsWith("cmwap")) {
            return 1;
        }
        if (!lowerCase.startsWith("cmnet") && !lowerCase.startsWith("epc.tmobile.com")) {
            if (lowerCase.startsWith("uniwap")) {
                return 16;
            }
            if (lowerCase.startsWith("uninet")) {
                return 8;
            }
            if (lowerCase.startsWith("wap")) {
                return 64;
            }
            if (lowerCase.startsWith(com.alipay.sdk.m.k.b.f10651k)) {
                return 32;
            }
            if (lowerCase.startsWith("ctwap")) {
                return 512;
            }
            if (lowerCase.startsWith("ctnet")) {
                return 256;
            }
            if (lowerCase.startsWith("3gwap")) {
                return 1024;
            }
            if (lowerCase.startsWith("3gnet")) {
                return 2048;
            }
            if (lowerCase.startsWith("#777")) {
                String c11 = c(context);
                if (c11 != null) {
                    if (c11.length() > 0) {
                        return 512;
                    }
                }
                return 256;
            }
            return 128;
        }
        return 4;
    }

    public static NetworkInfo e(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }
}
