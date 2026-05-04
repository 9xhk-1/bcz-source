package com.igexin.d;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.igexin.push.b.b;
import com.igexin.push.g.c;
import com.igexin.push.g.d;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushService;
import com.zx.sdk.api.ZXID;
import com.zx.sdk.api.ZXIDListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a implements InvocationHandler {

    /* renamed from: b, reason: collision with root package name */
    private static String f37281b = "ZxExecutor";

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f37282c;

    /* renamed from: a, reason: collision with root package name */
    public Context f37283a;

    /* renamed from: com.igexin.d.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.c(a.this.f37283a)) {
                    a aVar = a.this;
                    a.a(aVar, aVar.f37283a);
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    /* renamed from: com.igexin.d.a$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37285a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37286b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37287c;

        public AnonymousClass2(Context context, String str, String str2) {
            this.f37285a = context;
            this.f37286b = str;
            this.f37287c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Class cls = (Class) d.a(this.f37285a, PushService.class).second;
                if (cls != null) {
                    Intent intent = new Intent(this.f37285a, (Class<?>) cls);
                    intent.putExtra("action", PushConsts.ACTION_BROADCAST_UPLOAD_TYPE253);
                    intent.putExtra("id", this.f37286b);
                    intent.putExtra("aid", this.f37287c);
                    c.a(this.f37285a, intent);
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    private a() {
    }

    private void b(Context context) {
        this.f37283a = context.getApplicationContext();
        com.igexin.b.a.a().b().schedule(new AnonymousClass1(), 2000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        b bVar;
        Cursor cursor = null;
        try {
            bVar = new b(context);
            try {
                cursor = bVar.a("config", new String[]{"value"}, "id = 79");
                if (cursor == null || !cursor.moveToFirst()) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th2) {
                            com.igexin.c.a.c.a.a(th2);
                        }
                    }
                    bVar.close();
                    return false;
                }
                boolean parseBoolean = Boolean.parseBoolean(cursor.getString(0));
                try {
                    cursor.close();
                    bVar.close();
                    return parseBoolean;
                } catch (Throwable th3) {
                    com.igexin.c.a.c.a.a(th3);
                    return parseBoolean;
                }
            } catch (Throwable th4) {
                th = th4;
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th5) {
                        com.igexin.c.a.c.a.a(th5);
                        throw th;
                    }
                }
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            bVar = null;
        }
    }

    private void d(Context context) {
        try {
            Class<?> cls = Class.forName("com.zx.sdk.api.ZXManager");
            Object invoke = cls.getDeclaredMethod("newSDK", String.class).invoke(cls, com.igexin.push.a.f37306r);
            Method declaredMethod = invoke.getClass().getDeclaredMethod("init", Context.class);
            Method declaredMethod2 = invoke.getClass().getDeclaredMethod("allowPermissionDialog", Boolean.TYPE);
            declaredMethod.invoke(invoke, context);
            declaredMethod2.invoke(invoke, Boolean.FALSE);
            invoke.getClass().getDeclaredMethod("getZXID", ZXIDListener.class).invoke(invoke, Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{ZXIDListener.class}, this));
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            int hashCode = name.hashCode();
            if (hashCode != -530890460) {
                if (hashCode == 1116433148 && name.equals("onFailed")) {
                    StringBuilder sb2 = new StringBuilder();
                    for (Object obj2 : objArr) {
                        sb2.append(obj2);
                        sb2.append(",");
                    }
                    com.igexin.c.a.c.a.a("ZxExecutor | ", " get zxid failed code  msg = ".concat(String.valueOf(sb2)));
                }
            } else if (name.equals("onSuccess")) {
                Object obj3 = objArr[0];
                com.igexin.c.a.c.a.b(f37281b, " get zxid success ".concat(String.valueOf(obj3)));
                JSONObject jSONObject = (JSONObject) ZXID.class.getDeclaredMethod("getAids", null).invoke(obj3, null);
                com.igexin.b.a.a().f37028a.execute(new AnonymousClass2(this.f37283a, obj3.toString(), jSONObject != null ? jSONObject.optString("venderAid", "") : ""));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static a a() {
        if (f37282c == null) {
            synchronized (a.class) {
                try {
                    if (f37282c == null) {
                        a aVar = new a();
                        f37282c = aVar;
                        return aVar;
                    }
                } finally {
                }
            }
        }
        return f37282c;
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        try {
            Class<?> cls = Class.forName("com.zx.sdk.api.ZXManager");
            Object invoke = cls.getDeclaredMethod("newSDK", String.class).invoke(cls, com.igexin.push.a.f37306r);
            Method declaredMethod = invoke.getClass().getDeclaredMethod("init", Context.class);
            Method declaredMethod2 = invoke.getClass().getDeclaredMethod("allowPermissionDialog", Boolean.TYPE);
            declaredMethod.invoke(invoke, context);
            declaredMethod2.invoke(invoke, Boolean.FALSE);
            invoke.getClass().getDeclaredMethod("getZXID", ZXIDListener.class).invoke(invoke, Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{ZXIDListener.class}, aVar));
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    private void a(String str, String str2, Context context) {
        com.igexin.b.a.a().f37028a.execute(new AnonymousClass2(context, str, str2));
    }
}
