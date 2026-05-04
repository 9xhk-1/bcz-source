package com.tencent.liteav.network;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private Context f43854a;

    /* renamed from: b, reason: collision with root package name */
    private String f43855b;

    /* renamed from: c, reason: collision with root package name */
    private String f43856c;

    /* renamed from: d, reason: collision with root package name */
    private String f43857d;

    /* renamed from: e, reason: collision with root package name */
    private String f43858e;

    /* renamed from: f, reason: collision with root package name */
    private long f43859f;

    /* renamed from: g, reason: collision with root package name */
    private long f43860g;

    /* renamed from: h, reason: collision with root package name */
    private String f43861h;

    /* renamed from: i, reason: collision with root package name */
    private long f43862i;

    /* renamed from: j, reason: collision with root package name */
    private long f43863j;

    /* renamed from: k, reason: collision with root package name */
    private long f43864k;

    /* renamed from: l, reason: collision with root package name */
    private long f43865l;

    /* renamed from: m, reason: collision with root package name */
    private long f43866m;

    /* renamed from: n, reason: collision with root package name */
    private long f43867n;

    /* renamed from: o, reason: collision with root package name */
    private long f43868o;

    /* renamed from: p, reason: collision with root package name */
    private long f43869p;

    /* renamed from: q, reason: collision with root package name */
    private long f43870q;

    /* renamed from: r, reason: collision with root package name */
    private long f43871r;

    /* renamed from: s, reason: collision with root package name */
    private long f43872s;

    /* renamed from: t, reason: collision with root package name */
    private long f43873t;

    /* renamed from: u, reason: collision with root package name */
    private long f43874u;

    /* renamed from: v, reason: collision with root package name */
    private long f43875v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f43876w = true;

    public o(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f43854a = applicationContext;
        this.f43855b = com.tencent.liteav.basic.util.h.b(applicationContext);
        this.f43857d = "Android";
        n.a().a(this.f43854a);
        a();
    }

    private void e() {
        long j11 = this.f43869p;
        long j12 = this.f43870q;
        a();
        this.f43867n = j11;
        this.f43868o = j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.o.f():void");
    }

    public void a() {
        this.f43856c = "";
        this.f43859f = 0L;
        this.f43860g = -1L;
        this.f43861h = "";
        this.f43862i = -1L;
        this.f43863j = -1L;
        this.f43864k = -1L;
        this.f43865l = -1L;
        this.f43858e = "";
        this.f43866m = 0L;
        this.f43867n = 0L;
        this.f43868o = 0L;
        this.f43869p = 0L;
        this.f43870q = 0L;
        this.f43871r = 0L;
        this.f43872s = 0L;
        this.f43873t = 0L;
        this.f43874u = 0L;
        this.f43875v = 0L;
        this.f43876w = true;
    }

    public void b() {
        this.f43859f = System.currentTimeMillis();
        this.f43856c = n.a().b();
    }

    public void c() {
        f();
        e();
    }

    public void d() {
        this.f43866m++;
    }

    private boolean c(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public void b(long j11, long j12) {
        this.f43875v++;
        this.f43871r += j11;
        this.f43872s += j12;
        if (j11 > this.f43873t) {
            this.f43873t = j11;
        }
        if (j12 > this.f43874u) {
            this.f43874u = j12;
        }
    }

    private boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public void a(boolean z11) {
        this.f43865l = z11 ? 2L : 1L;
        if (z11) {
            this.f43876w = false;
        }
    }

    public void a(String str) {
        this.f43858e = str;
    }

    public void a(boolean z11, String str) {
        this.f43861h = str;
        if (z11) {
            this.f43860g = 1L;
            return;
        }
        if (str != null) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            if (str != null) {
                for (String str2 : str.split("[.]")) {
                    if (!c(str2)) {
                        this.f43860g = 3L;
                        return;
                    }
                }
                this.f43860g = 2L;
            }
        }
    }

    public void a(long j11, long j12, long j13) {
        this.f43862i = j11;
        this.f43863j = j12;
        this.f43864k = j13;
    }

    public void a(long j11, long j12) {
        this.f43869p = j11;
        this.f43870q = j12;
    }
}
