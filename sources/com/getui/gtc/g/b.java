package com.getui.gtc.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.getui.gtc.BuildConfig;
import com.getui.gtc.SdkLoader;
import com.igexin.push.GtPushInterface;
import com.igexin.push.core.g;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, ClassLoader> f30079a = new HashMap();

    public static ClassLoader a(Bundle bundle) {
        return f30079a.get(bundle.getString(AdvanceSetting.CLEAR_NOTIFICATION));
    }

    public static void a(Context context, ClassLoader classLoader, String str, String str2, String str3) throws Throwable {
        Class<?> loadClass = classLoader.loadClass(str);
        com.getui.gtc.i.c.a.a("start load for class:" + str + ", appId: " + str2 + ", cid: " + str3);
        loadClass.getDeclaredMethod("onCreate", Context.class, String.class, String.class).invoke(loadClass.newInstance(), context, str2, str3);
        com.getui.gtc.i.c.a.a("load success for class:".concat(String.valueOf(str)));
        f30079a.put(str, classLoader);
    }

    public static void a(Context context, String str, String str2, String str3) throws Throwable {
        a(context, context.getClassLoader(), str, str2, str3);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) throws Throwable {
        Method declaredMethod = SdkLoader.class.getDeclaredMethod("load", Context.class, String.class, String.class, String.class, String.class, String.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(SdkLoader.class, context, str, str2, str3, str4, str5);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, com.getui.gtc.g.a.b bVar) {
        com.getui.gtc.g.a.a aVar = new com.getui.gtc.g.a.a(bVar);
        if (aVar.f30069b != null) {
            aVar.a(str, str2, str3, str4, str5);
            return;
        }
        try {
            Class<?> cls = (Class) com.getui.gtc.g.a.a.a(context, Class.forName(g.f38159f)).second;
            if (cls == null) {
                cls = Class.forName(g.f38159f);
            }
            Intent intent = new Intent(context, cls);
            intent.setType(BuildConfig.VERSION_NAME);
            context.bindService(intent, new ServiceConnection() { // from class: com.getui.gtc.g.a.a.2

                /* renamed from: a */
                final /* synthetic */ String f30073a;

                /* renamed from: b */
                final /* synthetic */ String f30074b;

                /* renamed from: c */
                final /* synthetic */ String f30075c;

                /* renamed from: d */
                final /* synthetic */ String f30076d;

                /* renamed from: e */
                final /* synthetic */ String f30077e;

                public AnonymousClass2(String str6, String str22, String str32, String str42, String str52) {
                    r2 = str6;
                    r3 = str22;
                    r4 = str32;
                    r5 = str42;
                    r6 = str52;
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    a.this.f30069b = GtPushInterface.Stub.asInterface(iBinder);
                    a.this.a(r2, r3, r4, r5, r6);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                    a.this.f30069b = null;
                }
            }, 1);
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.c(e11);
        }
    }

    public static boolean a(Context context, Bundle bundle) {
        try {
            String string = bundle.getString("dp");
            String string2 = bundle.getString("ad");
            String string3 = bundle.getString("gd");
            String string4 = bundle.getString("od");
            String string5 = bundle.getString(AdvanceSetting.CLEAR_NOTIFICATION);
            if (string == null) {
                a(context, string5, string2, string3);
                return true;
            }
            a(context, string, string4, string5, string2, string3);
            return true;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2.toString());
            return false;
        }
    }
}
