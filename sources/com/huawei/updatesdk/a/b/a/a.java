package com.huawei.updatesdk.a.b.a;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f36840b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static a f36841c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f36842a;

    public a(Context context) {
        this.f36842a = context.getApplicationContext();
    }

    public static a c() {
        a aVar;
        synchronized (f36840b) {
            aVar = f36841c;
        }
        return aVar;
    }

    public Context a() {
        return this.f36842a;
    }

    public String b() {
        Context context = this.f36842a;
        return (context == null || context.getFilesDir() == null) ? "" : this.f36842a.getFilesDir().getAbsolutePath();
    }

    public static void a(Context context) {
        synchronized (f36840b) {
            try {
                if (f36841c == null) {
                    f36841c = new a(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
