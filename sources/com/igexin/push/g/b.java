package com.igexin.push.g;

import android.content.Context;
import com.igexin.assist.sdk.AssistPushConsts;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38620a = "com.igexin.assist.control.stp.ManufacturePushManager";

    public static boolean a(Context context) {
        try {
            Method declaredMethod = Class.forName(f38620a).getDeclaredMethod("checkDevice", Context.class);
            declaredMethod.setAccessible(true);
            boolean booleanValue = ((Boolean) declaredMethod.invoke(null, context)).booleanValue();
            com.igexin.c.a.c.a.b("Assist_UPS", "isSupportStp: ".concat(String.valueOf(booleanValue)));
            return booleanValue;
        } catch (Exception e11) {
            e11.getMessage();
            try {
                Class<?> cls = Class.forName(f38620a);
                Object newInstance = cls.getConstructor(Context.class).newInstance(context);
                Method declaredMethod2 = cls.getDeclaredMethod("isSupport", null);
                declaredMethod2.setAccessible(true);
                com.igexin.c.a.c.a.b("Assist_UPS", "isSupportStp: ".concat(String.valueOf(((Boolean) declaredMethod2.invoke(newInstance, null)).booleanValue())));
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static boolean a(Context context, String str) {
        String concat = AssistPushConsts.LOG_TAG.concat(String.valueOf(str));
        boolean z11 = false;
        try {
            Class<?> cls = Class.forName("com.igexin.assist.control." + str + ".ManufacturePushManager");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Field declaredField = cls.getDeclaredField(c90.k.f8409a);
            boolean isAccessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            declaredField.set(newInstance, context);
            declaredField.setAccessible(isAccessible);
            z11 = ((Boolean) cls.getDeclaredMethod("isSupport", null).invoke(newInstance, null)).booleanValue();
            com.igexin.c.a.c.a.e.a(concat, "isSupport " + str + " = " + z11);
            return z11;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.e.a(concat, "class non-existent  " + th2.getMessage());
            return z11;
        }
    }
}
