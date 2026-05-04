package com.meizu.cloud.pushsdk.d.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39837a = "e";

    public static long a(String str) {
        long j11;
        long j12 = 0;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt <= 127) {
                j11 = 1;
            } else if (charAt <= 2047) {
                j11 = 2;
            } else {
                if (charAt >= 55296 && charAt <= 57343) {
                    j12 += 4;
                    i11++;
                } else if (charAt < 65535) {
                    j11 = 3;
                } else {
                    j12 += 4;
                }
                i11++;
            }
            j12 += j11;
            i11++;
        }
        return j12;
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String c(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getSimOperator();
            }
            return null;
        } catch (Exception e11) {
            c.a(f39837a, "getOperator error " + e11.getMessage(), new Object[0]);
            return null;
        }
    }

    @TargetApi(19)
    public static Point d(Context context) {
        Point point = new Point();
        Display display = null;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return null;
            }
            display = windowManager.getDefaultDisplay();
            Display.class.getMethod("getSize", Point.class);
            display.getSize(point);
            return point;
        } catch (Exception unused) {
            String str = f39837a;
            c.a(str, "Display.getSize isn't available on older devices.", new Object[0]);
            if (display != null) {
                point.x = display.getWidth();
                point.y = display.getHeight();
            } else {
                c.a(str, "error get display", new Object[0]);
            }
            return point;
        }
    }

    private static Object a(Object obj) {
        return obj;
    }

    public static String b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
            return null;
        } catch (Exception e11) {
            c.a(f39837a, "getCarrier: %s", e11.toString());
            return null;
        }
    }

    public static String a() {
        return Long.toString(System.currentTimeMillis());
    }

    public static JSONObject a(Map map) {
        return new JSONObject(map);
    }

    public static boolean a(long j11, long j12, long j13) {
        return j11 > j12 - j13;
    }

    public static boolean a(Context context) {
        try {
            String str = f39837a;
            boolean z11 = false;
            c.c(str, "Checking tracker internet connectivity.", new Object[0]);
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                z11 = true;
            }
            c.b(str, "Tracker connection online: %s", Boolean.valueOf(z11));
            return z11;
        } catch (Exception e11) {
            c.a(f39837a, "Security exception checking connection: %s", e11.toString());
            return true;
        }
    }
}
