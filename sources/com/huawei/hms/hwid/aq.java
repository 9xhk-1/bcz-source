package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class aq {

    /* renamed from: a, reason: collision with root package name */
    private static int f35952a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static int f35953b;

    static {
        b();
    }

    public static boolean a() {
        return f35953b >= 21;
    }

    private static void b() {
        int d11 = d();
        f35953b = d11;
        if (d11 >= 17) {
            f35952a = 90;
        }
        if (d11 >= 11) {
            f35952a = 50;
        } else if (d11 >= 10) {
            f35952a = 41;
        } else if (d11 >= 9) {
            f35952a = 40;
        } else if (d11 >= 8) {
            f35952a = 31;
        } else if (d11 >= 7) {
            f35952a = 30;
        }
        if (f35952a == -1) {
            c();
        }
    }

    private static void c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod(ct.d.f46852f, String.class).invoke(cls, com.alipay.sdk.m.c.a.f10484a);
            if (str != null) {
                if (str.contains("EmotionUI_3.0")) {
                    f35952a = 30;
                    return;
                }
                if (str.contains("EmotionUI_3.1")) {
                    f35952a = 31;
                    return;
                }
                if (str.contains("EmotionUI_4.0")) {
                    f35952a = 40;
                } else if (str.contains("EmotionUI_4.1")) {
                    f35952a = 41;
                } else if (str.contains("EmotionUI_5.0")) {
                    f35952a = 50;
                }
            }
        } catch (RuntimeException unused) {
            as.d("EmuiUtil", "RuntimeException getEmuiType.", true);
        } catch (Exception unused2) {
            as.d("EmuiUtil", "getEmuiType Exception.", true);
        }
    }

    private static int d() {
        Object a11 = a.a(EmuiUtil.BUILDEX_VERSION, EmuiUtil.EMUI_SDK_INT);
        if (a11 != null) {
            try {
                f35953b = ((Integer) a11).intValue();
            } catch (ClassCastException unused) {
                as.d("EmuiUtil", "getEMUIVersionCode is not a number", true);
            }
        }
        return f35953b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public static Class<?> a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!EmuiUtil.BUILDEX_VERSION.equals(str) && !EmuiUtil.IMMERSION_STYLE.equals(str)) {
                return null;
            }
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public static Object a(String str, String str2) {
            Class<?> a11 = a(str);
            if (a11 == null || TextUtils.isEmpty(str2) || !EmuiUtil.BUILDEX_VERSION.equals(str) || !EmuiUtil.EMUI_SDK_INT.equals(str2)) {
                return null;
            }
            try {
                Field declaredField = a11.getDeclaredField(str2);
                AccessibleObject.setAccessible(new Field[]{declaredField}, true);
                return declaredField.get(a11);
            } catch (IllegalAccessException unused) {
                as.c("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException", true);
                return null;
            } catch (IllegalArgumentException unused2) {
                as.c("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException", true);
                return null;
            } catch (NoSuchFieldException unused3) {
                as.c("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException", true);
                return null;
            } catch (SecurityException unused4) {
                as.b("ReflectionUtils", "not security int method getStaticFieldObj", true);
                return null;
            }
        }
    }
}
