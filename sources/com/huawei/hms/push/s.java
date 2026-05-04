package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f36219a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static int f36220b = -1;

    public static boolean a(Context context) {
        HMSLog.d("CommFun", "existFrameworkPush:" + f36220b);
        try {
            File file = new File("/system/framework/hwpush.jar");
            if (a()) {
                HMSLog.d("CommFun", "push jarFile is exist");
                return true;
            }
            if (!file.isFile()) {
                return false;
            }
            HMSLog.d("CommFun", "push jarFile is exist");
            return true;
        } catch (Exception e11) {
            HMSLog.e("CommFun", "get Apk version faild ,Exception e= " + e11.toString());
            return false;
        }
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean c() {
        return HwBuildEx.VERSION.EMUI_SDK_INT < 19;
    }

    public static boolean d(Context context) {
        HMSLog.d("CommFun", "existFrameworkPush:" + f36220b);
        synchronized (f36219a) {
            try {
                int i11 = f36220b;
                if (-1 != i11) {
                    return 1 == i11;
                }
                if (a(context)) {
                    f36220b = 1;
                } else {
                    f36220b = 0;
                }
                return 1 == f36220b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String c(Context context) {
        return oq.a.b(context).getString("client/project_id");
    }

    public static boolean b() {
        return HwBuildEx.VERSION.EMUI_SDK_INT >= 21;
    }

    public static boolean a() {
        try {
            Class<?> cls = Class.forName("huawei.cust.HwCfgFilePolicy");
            Integer num = (Integer) cls.getDeclaredField("CUST_TYPE_CONFIG").get(cls);
            num.intValue();
            File file = (File) cls.getDeclaredMethod("getCfgFile", String.class, Integer.TYPE).invoke(cls, "jars/hwpush.jar", num);
            if (file == null || !file.exists()) {
                return false;
            }
            HMSLog.d("CommFun", "get push cust File path success.");
            return true;
        } catch (ClassNotFoundException unused) {
            HMSLog.e("CommFun", "HwCfgFilePolicy ClassNotFoundException");
            return false;
        } catch (IllegalAccessException unused2) {
            HMSLog.e("CommFun", "check cust exist push IllegalAccessException.");
            return false;
        } catch (IllegalArgumentException unused3) {
            HMSLog.e("CommFun", "check cust exist push IllegalArgumentException.");
            return false;
        } catch (NoSuchFieldException unused4) {
            HMSLog.e("CommFun", "check cust exist push NoSuchFieldException.");
            return false;
        } catch (NoSuchMethodException unused5) {
            HMSLog.e("CommFun", "check cust exist push NoSuchMethodException.");
            return false;
        } catch (SecurityException unused6) {
            HMSLog.e("CommFun", "check cust exist push SecurityException.");
            return false;
        } catch (InvocationTargetException unused7) {
            HMSLog.e("CommFun", "check cust exist push InvocationTargetException.");
            return false;
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject != null) {
            return TextUtils.isEmpty(str) && jSONObject2 == null;
        }
        return true;
    }
}
