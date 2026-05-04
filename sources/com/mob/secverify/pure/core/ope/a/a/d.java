package com.mob.secverify.pure.core.ope.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f40846a = {101, 122, 111, 100, 36, 111, 36, 59, 50, 51, 36, 105, 100};

    /* renamed from: b, reason: collision with root package name */
    public static String f40847b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f40848c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f40849d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f40850e = "0";

    private static int a(int i11) {
        int i12 = -101;
        if (i11 != -101) {
            i12 = -1;
            if (i11 != -1) {
                switch (i11) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 2;
                    case 13:
                    case 18:
                    case 19:
                        return 3;
                    default:
                        return i11;
                }
            }
        }
        return i12;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), null)).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String c(Context context) {
        int f11 = f(context);
        return f11 != -101 ? (f11 == -1 || f11 == 0) ? "null" : f11 != 1 ? f11 != 2 ? f11 != 3 ? Integer.toString(f11) : "4G" : "3G" : "2G" : "WIFI";
    }

    public static String d(Context context) {
        String c11 = c(context);
        return (c11 != null && c11.equals("WIFI") && b(context)) ? "BOTH" : c11;
    }

    public static String e(Context context) {
        String d11 = d(context);
        if (!TextUtils.isEmpty(d11) && !d11.equals("null")) {
            if (d11.equals("2G")) {
                return Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
            }
            if (d11.equals("3G")) {
                return Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE;
            }
            if (d11.equals("4G")) {
                return Constants.VIA_REPORT_TYPE_SET_AVATAR;
            }
            if (d11.equals("WIFI")) {
                return "13";
            }
            if (d11.equals("BOTH")) {
                return Constants.VIA_REPORT_TYPE_MAKE_FRIEND;
            }
        }
        return Constants.VIA_REPORT_TYPE_WPA_STATE;
    }

    @SuppressLint({"MissingPermission"})
    private static int f(Context context) {
        int i11 = 0;
        try {
            NetworkInfo a11 = a(context);
            if (a11 != null && a11.isAvailable() && a11.isConnected()) {
                int type = a11.getType();
                if (type == 1) {
                    i11 = -101;
                } else if (type == 0) {
                    try {
                        i11 = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    } catch (Exception e11) {
                        com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e11.toString());
                    }
                    if (i11 == 0) {
                        i11 = a11.getSubtype();
                    }
                }
            } else {
                i11 = -1;
            }
        } catch (NullPointerException e12) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e12.toString());
        } catch (Exception e13) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e13.toString());
        }
        return a(i11);
    }

    public static NetworkInfo a(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }
}
