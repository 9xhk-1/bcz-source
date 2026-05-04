package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.ao;
import com.tencent.bugly.proguard.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BuglyLog {
    public static void d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f42621c) {
            Log.d(str, str2);
        }
        ao.a("D", str, str2);
    }

    public static void e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f42621c) {
            Log.e(str, str2);
        }
        ao.a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    public static void i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f42621c) {
            Log.i(str, str2);
        }
        ao.a("I", str, str2);
    }

    public static void setCache(int i11) {
        ao.a(i11);
    }

    public static void v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f42621c) {
            Log.v(str, str2);
        }
        ao.a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    public static void w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f42621c) {
            Log.w(str, str2);
        }
        ao.a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (p.f42621c) {
            Log.e(str, str2, th2);
        }
        ao.a(ExifInterface.LONGITUDE_EAST, str, th2);
    }
}
