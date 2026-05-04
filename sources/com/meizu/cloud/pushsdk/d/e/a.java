package com.meizu.cloud.pushsdk.d.e;

import android.content.Context;
import com.meizu.cloud.pushsdk.PushManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: n, reason: collision with root package name */
    private static final String f39779n = "a";

    /* renamed from: b, reason: collision with root package name */
    protected com.meizu.cloud.pushsdk.d.b.a f39781b;

    /* renamed from: c, reason: collision with root package name */
    protected c f39782c;

    /* renamed from: d, reason: collision with root package name */
    protected b f39783d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f39784e;

    /* renamed from: f, reason: collision with root package name */
    protected final String f39785f;

    /* renamed from: g, reason: collision with root package name */
    protected final boolean f39786g;

    /* renamed from: h, reason: collision with root package name */
    protected final com.meizu.cloud.pushsdk.d.f.b f39787h;

    /* renamed from: i, reason: collision with root package name */
    protected final boolean f39788i;

    /* renamed from: j, reason: collision with root package name */
    protected final long f39789j;

    /* renamed from: k, reason: collision with root package name */
    protected final int f39790k;

    /* renamed from: l, reason: collision with root package name */
    protected final TimeUnit f39791l;

    /* renamed from: a, reason: collision with root package name */
    protected final String f39780a = PushManager.TAG;

    /* renamed from: m, reason: collision with root package name */
    protected final AtomicBoolean f39792m = new AtomicBoolean(true);

    /* renamed from: com.meizu.cloud.pushsdk.d.e.a$a, reason: collision with other inner class name */
    public static class C0479a {

        /* renamed from: a, reason: collision with root package name */
        protected final com.meizu.cloud.pushsdk.d.b.a f39793a;

        /* renamed from: b, reason: collision with root package name */
        protected final String f39794b;

        /* renamed from: c, reason: collision with root package name */
        protected final String f39795c;

        /* renamed from: d, reason: collision with root package name */
        protected final Context f39796d;

        /* renamed from: e, reason: collision with root package name */
        protected c f39797e = null;

        /* renamed from: f, reason: collision with root package name */
        protected boolean f39798f = false;

        /* renamed from: g, reason: collision with root package name */
        protected com.meizu.cloud.pushsdk.d.f.b f39799g = com.meizu.cloud.pushsdk.d.f.b.OFF;

        /* renamed from: h, reason: collision with root package name */
        protected boolean f39800h = false;

        /* renamed from: i, reason: collision with root package name */
        protected long f39801i = 600;

        /* renamed from: j, reason: collision with root package name */
        protected long f39802j = 300;

        /* renamed from: k, reason: collision with root package name */
        protected long f39803k = 15;

        /* renamed from: l, reason: collision with root package name */
        protected int f39804l = 10;

        /* renamed from: m, reason: collision with root package name */
        protected TimeUnit f39805m = TimeUnit.SECONDS;

        public C0479a(com.meizu.cloud.pushsdk.d.b.a aVar, String str, String str2, Context context, Class<? extends a> cls) {
            this.f39793a = aVar;
            this.f39794b = str;
            this.f39795c = str2;
            this.f39796d = context;
        }

        public C0479a a(int i11) {
            this.f39804l = i11;
            return this;
        }

        public C0479a a(c cVar) {
            this.f39797e = cVar;
            return this;
        }

        public C0479a a(com.meizu.cloud.pushsdk.d.f.b bVar) {
            this.f39799g = bVar;
            return this;
        }

        public C0479a a(Boolean bool) {
            this.f39798f = bool.booleanValue();
            return this;
        }
    }

    public a(C0479a c0479a) {
        this.f39781b = c0479a.f39793a;
        this.f39785f = c0479a.f39795c;
        this.f39786g = c0479a.f39798f;
        this.f39784e = c0479a.f39794b;
        this.f39782c = c0479a.f39797e;
        this.f39787h = c0479a.f39799g;
        boolean z11 = c0479a.f39800h;
        this.f39788i = z11;
        this.f39789j = c0479a.f39803k;
        int i11 = c0479a.f39804l;
        this.f39790k = i11 < 2 ? 2 : i11;
        this.f39791l = c0479a.f39805m;
        if (z11) {
            this.f39783d = new b(c0479a.f39801i, c0479a.f39802j, c0479a.f39805m, c0479a.f39796d);
        }
        com.meizu.cloud.pushsdk.d.f.c.a(c0479a.f39799g);
        com.meizu.cloud.pushsdk.d.f.c.c(f39779n, "Tracker created successfully.", new Object[0]);
    }

    private com.meizu.cloud.pushsdk.d.a.b a(List<com.meizu.cloud.pushsdk.d.a.b> list) {
        if (this.f39788i) {
            list.add(this.f39783d.a());
        }
        c cVar = this.f39782c;
        if (cVar != null) {
            if (!cVar.a().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.d.a.b("geolocation", this.f39782c.a()));
            }
            if (!this.f39782c.b().isEmpty()) {
                list.add(new com.meizu.cloud.pushsdk.d.a.b("mobileinfo", this.f39782c.b()));
            }
        }
        LinkedList linkedList = new LinkedList();
        Iterator<com.meizu.cloud.pushsdk.d.a.b> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().a());
        }
        return new com.meizu.cloud.pushsdk.d.a.b("push_extra_info", linkedList);
    }

    public com.meizu.cloud.pushsdk.d.b.a b() {
        return this.f39781b;
    }

    public void a() {
        if (this.f39792m.get()) {
            b().a();
        }
    }

    private void a(com.meizu.cloud.pushsdk.d.a.c cVar, List<com.meizu.cloud.pushsdk.d.a.b> list, boolean z11) {
        if (this.f39782c != null) {
            cVar.a(new HashMap(this.f39782c.c()));
            cVar.a("et", a(list).a());
        }
        com.meizu.cloud.pushsdk.d.f.c.c(f39779n, "Adding new payload to event storage: %s", cVar);
        this.f39781b.a(cVar, z11);
    }

    public void a(com.meizu.cloud.pushsdk.d.c.b bVar, boolean z11) {
        if (this.f39792m.get()) {
            a(bVar.e(), bVar.a(), z11);
        }
    }

    public void a(c cVar) {
        this.f39782c = cVar;
    }
}
