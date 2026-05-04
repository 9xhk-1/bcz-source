package com.alipay.sdk.m.d;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10513a = "OpenId";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10514b = false;

    public static void a(boolean z11) {
        Log.d(f10513a, "setDebug:" + z11);
        f10514b = z11;
    }

    public static void b(String str, Object... objArr) {
        if (f10514b) {
            Log.d(f10513a, a(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (f10514b) {
            Log.e(f10513a, a(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        if (f10514b) {
            Log.i(f10513a, a(str, objArr));
        }
    }

    public static void e(String str, Object... objArr) {
        if (f10514b) {
            Log.w(f10513a, a(str, objArr));
        }
    }

    public static String a(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        sb2.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i12 >= objArr.length) {
                    break;
                }
                sb2.append(a(objArr[i11], objArr[i12]));
                if (i12 < length - 1) {
                    sb2.append(",");
                }
                i11 += 2;
            }
            if (i11 == objArr.length - 1) {
                sb2.append(objArr[i11]);
            }
        }
        return sb2.toString();
    }

    public static String a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }
}
