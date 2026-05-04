package com.meizu.cloud.pushsdk.platform.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.platform.b.d;
import com.meizu.cloud.pushsdk.platform.b.e;
import com.meizu.cloud.pushsdk.platform.b.f;
import com.meizu.cloud.pushsdk.platform.b.g;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f39939a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f39940b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f39941c;

    /* renamed from: d, reason: collision with root package name */
    private final a f39942d;

    /* renamed from: e, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.platform.b.b f39943e;

    /* renamed from: f, reason: collision with root package name */
    private final g f39944f;

    /* renamed from: g, reason: collision with root package name */
    private final f f39945g;

    /* renamed from: h, reason: collision with root package name */
    private final e f39946h;

    /* renamed from: i, reason: collision with root package name */
    private final d f39947i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39948j;

    public b(Context context, boolean z11) {
        this(context, z11, true);
    }

    public c<String> a(String str, String str2, String str3, File file) {
        return this.f39942d.a(str, str2, str3, file);
    }

    public boolean b(String str, String str2, String str3) {
        this.f39944f.b(str);
        this.f39944f.c(str2);
        this.f39944f.d(str3);
        return this.f39944f.m();
    }

    public boolean c(String str, String str2, String str3, String str4) {
        this.f39946h.b(str);
        this.f39946h.c(str2);
        this.f39946h.d(str3);
        this.f39946h.e(str4);
        this.f39946h.a(3);
        return this.f39946h.m();
    }

    public boolean d(String str, String str2, String str3, String str4) {
        this.f39947i.b(str);
        this.f39947i.c(str2);
        this.f39947i.d(str3);
        this.f39947i.e(str4);
        this.f39947i.a(2);
        return this.f39947i.m();
    }

    public b(Context context, boolean z11, boolean z12) {
        Context applicationContext = context.getApplicationContext();
        this.f39941c = applicationContext;
        a aVar = new a(applicationContext);
        this.f39942d = aVar;
        if (z11) {
            this.f39940b = (ScheduledExecutorService) com.meizu.cloud.pushsdk.d.b.a.b.a();
        }
        this.f39948j = z12;
        this.f39943e = new com.meizu.cloud.pushsdk.platform.b.b(applicationContext, aVar, this.f39940b, z12);
        this.f39944f = new g(applicationContext, aVar, this.f39940b, z12);
        this.f39945g = new f(applicationContext, aVar, this.f39940b, z12);
        this.f39946h = new e(applicationContext, aVar, this.f39940b, z12);
        this.f39947i = new d(applicationContext, aVar, this.f39940b, z12);
    }

    public static b a(Context context) {
        if (f39939a == null) {
            synchronized (b.class) {
                try {
                    if (f39939a == null) {
                        f39939a = new b(context, true);
                    }
                } finally {
                }
            }
        }
        return f39939a;
    }

    public boolean b(String str, String str2, String str3, String str4) {
        this.f39946h.b(str);
        this.f39946h.c(str2);
        this.f39946h.d(str3);
        this.f39946h.e(str4);
        this.f39946h.a(2);
        return this.f39946h.m();
    }

    public boolean c(String str, String str2, String str3, String str4, String str5) {
        this.f39947i.b(str);
        this.f39947i.c(str2);
        this.f39947i.d(str3);
        this.f39947i.e(str4);
        this.f39947i.a(0);
        this.f39947i.a(str5);
        return this.f39947i.m();
    }

    public boolean d(String str, String str2, String str3, String str4, String str5) {
        this.f39947i.b(str);
        this.f39947i.c(str2);
        this.f39947i.d(str3);
        this.f39947i.e(str4);
        this.f39947i.a(1);
        this.f39947i.a(str5);
        return this.f39947i.m();
    }

    public void a(boolean z11) {
        this.f39943e.a(z11);
        this.f39944f.a(z11);
        this.f39945g.a(z11);
        this.f39947i.a(z11);
        this.f39946h.a(z11);
    }

    public boolean b(String str, String str2, String str3, String str4, String str5) {
        this.f39946h.b(str);
        this.f39946h.c(str2);
        this.f39946h.d(str3);
        this.f39946h.e(str4);
        this.f39946h.a(1);
        this.f39946h.a(str5);
        return this.f39946h.m();
    }

    public boolean a(String str) {
        com.meizu.cloud.pushsdk.platform.b.a aVar = new com.meizu.cloud.pushsdk.platform.b.a(this.f39941c, this.f39940b, this.f39948j);
        aVar.a(0);
        aVar.d(str);
        return aVar.m();
    }

    public boolean a(String str, String str2) {
        com.meizu.cloud.pushsdk.platform.b.a aVar = new com.meizu.cloud.pushsdk.platform.b.a(this.f39941c, this.f39940b, this.f39948j);
        aVar.a(2);
        aVar.a(str2);
        aVar.d(str);
        return aVar.m();
    }

    public boolean a(String str, String str2, String str3) {
        this.f39943e.b(str);
        this.f39943e.c(str2);
        this.f39943e.d(str3);
        return this.f39943e.m();
    }

    public boolean a(String str, String str2, String str3, String str4) {
        this.f39945g.b(str);
        this.f39945g.c(str2);
        this.f39945g.d(str3);
        this.f39945g.a(str4);
        this.f39945g.a(2);
        return this.f39945g.m();
    }

    public boolean a(String str, String str2, String str3, String str4, int i11, boolean z11) {
        this.f39945g.b(str);
        this.f39945g.c(str2);
        this.f39945g.d(str3);
        this.f39945g.a(str4);
        this.f39945g.a(i11);
        this.f39945g.b(z11);
        return this.f39945g.m();
    }

    public boolean a(String str, String str2, String str3, String str4, String str5) {
        this.f39946h.b(str);
        this.f39946h.c(str2);
        this.f39946h.d(str3);
        this.f39946h.e(str4);
        this.f39946h.a(0);
        this.f39946h.a(str5);
        return this.f39946h.m();
    }

    public boolean a(String str, String str2, String str3, String str4, boolean z11) {
        this.f39945g.b(str);
        this.f39945g.c(str2);
        this.f39945g.d(str3);
        this.f39945g.a(str4);
        this.f39945g.a(3);
        this.f39945g.b(z11);
        return this.f39945g.m();
    }

    public boolean a(String str, int... iArr) {
        com.meizu.cloud.pushsdk.platform.b.a aVar = new com.meizu.cloud.pushsdk.platform.b.a(this.f39941c, this.f39940b, this.f39948j);
        aVar.a(iArr);
        aVar.d(str);
        aVar.a(1);
        return aVar.m();
    }
}
