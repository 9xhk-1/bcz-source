package tz;

import android.content.Context;
import android.os.Build;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static e f91261b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f91262c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final f f91263a;

    public e(Context context) {
        this.f91263a = Build.VERSION.SDK_INT >= 29 ? new c(context) : new d(context);
    }

    public static e b(Context context) {
        synchronized (f91262c) {
            try {
                if (f91261b == null) {
                    f91261b = new e(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f91261b;
    }

    public String a(String str) {
        return this.f91263a.a(str);
    }

    public void c(String str, String str2) {
        this.f91263a.a(str, str2);
    }

    public void d(String str, String str2) {
        String a11 = a(str);
        if (a11 == null || !a11.equals(str2)) {
            c(str, str2);
        }
    }
}
