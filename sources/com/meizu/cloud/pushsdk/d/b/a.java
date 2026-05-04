package com.meizu.cloud.pushsdk.d.b;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f39681a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f39682b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f39683c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f39684d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f39685e;

    /* renamed from: f, reason: collision with root package name */
    protected final TimeUnit f39686f;

    /* renamed from: g, reason: collision with root package name */
    protected final AtomicBoolean f39687g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39688h;

    /* renamed from: i, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.c.c.g f39689i;

    /* renamed from: j, reason: collision with root package name */
    private Uri.Builder f39690j;

    /* renamed from: k, reason: collision with root package name */
    private d f39691k;

    /* renamed from: l, reason: collision with root package name */
    private b f39692l;

    /* renamed from: m, reason: collision with root package name */
    private h f39693m;

    /* renamed from: n, reason: collision with root package name */
    private final SSLSocketFactory f39694n;

    /* renamed from: o, reason: collision with root package name */
    private final HostnameVerifier f39695o;

    /* renamed from: p, reason: collision with root package name */
    private String f39696p;

    /* renamed from: q, reason: collision with root package name */
    private final long f39697q;

    /* renamed from: r, reason: collision with root package name */
    private final long f39698r;

    /* renamed from: s, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.c.c.a f39699s;

    /* renamed from: com.meizu.cloud.pushsdk.d.b.a$a, reason: collision with other inner class name */
    public static class C0476a {

        /* renamed from: a, reason: collision with root package name */
        protected final String f39703a;

        /* renamed from: b, reason: collision with root package name */
        protected final Context f39704b;

        /* renamed from: m, reason: collision with root package name */
        protected SSLSocketFactory f39715m;

        /* renamed from: n, reason: collision with root package name */
        protected HostnameVerifier f39716n;

        /* renamed from: c, reason: collision with root package name */
        protected f f39705c = null;

        /* renamed from: d, reason: collision with root package name */
        protected d f39706d = d.POST;

        /* renamed from: e, reason: collision with root package name */
        protected b f39707e = b.Single;

        /* renamed from: f, reason: collision with root package name */
        protected h f39708f = h.HTTPS;

        /* renamed from: g, reason: collision with root package name */
        protected int f39709g = 5;

        /* renamed from: h, reason: collision with root package name */
        protected int f39710h = 250;

        /* renamed from: i, reason: collision with root package name */
        protected int f39711i = 5;

        /* renamed from: j, reason: collision with root package name */
        protected long f39712j = 40000;

        /* renamed from: k, reason: collision with root package name */
        protected long f39713k = 40000;

        /* renamed from: l, reason: collision with root package name */
        protected TimeUnit f39714l = TimeUnit.SECONDS;

        /* renamed from: o, reason: collision with root package name */
        protected com.meizu.cloud.pushsdk.c.c.a f39717o = new com.meizu.cloud.pushsdk.c.c.e();

        public C0476a(String str, Context context, Class<? extends a> cls) {
            this.f39703a = str;
            this.f39704b = context;
        }

        public C0476a a(int i11) {
            this.f39709g = i11;
            return this;
        }

        public C0476a b(int i11) {
            this.f39710h = i11;
            return this;
        }

        public C0476a c(int i11) {
            this.f39711i = i11;
            return this;
        }

        public C0476a a(com.meizu.cloud.pushsdk.c.c.a aVar) {
            if (aVar != null) {
                this.f39717o = aVar;
                com.meizu.cloud.pushsdk.d.f.c.c(C0476a.class.getSimpleName(), "set new call " + aVar, new Object[0]);
            }
            return this;
        }

        public C0476a a(b bVar) {
            this.f39707e = bVar;
            return this;
        }

        public C0476a a(f fVar) {
            this.f39705c = fVar;
            return this;
        }
    }

    public a(C0476a c0476a) {
        String simpleName = a.class.getSimpleName();
        this.f39688h = simpleName;
        this.f39689i = com.meizu.cloud.pushsdk.c.c.g.a("application/json; charset=utf-8");
        this.f39687g = new AtomicBoolean(false);
        this.f39691k = c0476a.f39706d;
        this.f39682b = c0476a.f39705c;
        this.f39681a = c0476a.f39704b;
        this.f39692l = c0476a.f39707e;
        this.f39693m = c0476a.f39708f;
        this.f39694n = c0476a.f39715m;
        this.f39695o = c0476a.f39716n;
        this.f39683c = c0476a.f39709g;
        this.f39684d = c0476a.f39711i;
        this.f39685e = c0476a.f39710h;
        this.f39697q = c0476a.f39712j;
        this.f39698r = c0476a.f39713k;
        this.f39696p = c0476a.f39703a;
        this.f39686f = c0476a.f39714l;
        this.f39699s = c0476a.f39717o;
        c();
        com.meizu.cloud.pushsdk.d.f.c.c(simpleName, "Emitter created successfully!", new Object[0]);
    }

    private void c() {
        StringBuilder sb2;
        String str;
        com.meizu.cloud.pushsdk.d.f.c.a(this.f39688h, "security " + this.f39693m, new Object[0]);
        if (this.f39693m == h.HTTP) {
            sb2 = new StringBuilder();
            str = "http://";
        } else {
            sb2 = new StringBuilder();
            str = "https://";
        }
        sb2.append(str);
        sb2.append(this.f39696p);
        this.f39690j = Uri.parse(sb2.toString()).buildUpon();
        if (this.f39691k == d.GET) {
            this.f39690j.appendPath("i");
        } else {
            this.f39690j.appendEncodedPath("push_data_report/mobile");
        }
    }

    public int a(i iVar) {
        k kVar = null;
        try {
            try {
                com.meizu.cloud.pushsdk.d.f.c.b(this.f39688h, "Sending request: %s", iVar);
                kVar = this.f39699s.a(iVar);
                return kVar.a();
            } catch (IOException e11) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39688h, "Request sending failed: %s", Log.getStackTraceString(e11));
                a(kVar);
                return -1;
            }
        } finally {
            a(kVar);
        }
    }

    public abstract void a();

    public abstract void a(com.meizu.cloud.pushsdk.d.a.a aVar, boolean z11);

    public String b() {
        return this.f39690j.clearQuery().build().toString();
    }

    private i a(com.meizu.cloud.pushsdk.d.a.a aVar) {
        a(aVar, "");
        this.f39690j.clearQuery();
        HashMap hashMap = (HashMap) aVar.a();
        for (String str : hashMap.keySet()) {
            this.f39690j.appendQueryParameter(str, (String) hashMap.get(str));
        }
        return new i.a().a(this.f39690j.build().toString()).a().c();
    }

    private i a(ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.meizu.cloud.pushsdk.d.a.a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().a());
        }
        com.meizu.cloud.pushsdk.d.a.b bVar = new com.meizu.cloud.pushsdk.d.a.b("push_group_data", arrayList2);
        com.meizu.cloud.pushsdk.d.f.c.b(this.f39688h, "final SelfDescribingJson " + bVar, new Object[0]);
        return new i.a().a(this.f39690j.build().toString()).a(j.a(this.f39689i, bVar.toString())).c();
    }

    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public LinkedList<e> a(c cVar) {
        int size = cVar.a().size();
        LinkedList<Long> b11 = cVar.b();
        LinkedList<e> linkedList = new LinkedList<>();
        long j11 = 22;
        boolean z11 = true;
        if (this.f39691k == d.GET) {
            for (int i11 = 0; i11 < size; i11++) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(b11.get(i11));
                com.meizu.cloud.pushsdk.d.a.a aVar = cVar.a().get(i11);
                linkedList.add(new e(aVar.b() + 22 > this.f39697q, a(aVar), linkedList2));
            }
        } else {
            int i12 = 0;
            while (i12 < size) {
                LinkedList linkedList3 = new LinkedList();
                ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList = new ArrayList<>();
                long j12 = 0;
                int i13 = i12;
                ?? r82 = z11;
                while (i13 < this.f39692l.a() + i12 && i13 < size) {
                    com.meizu.cloud.pushsdk.d.a.a aVar2 = cVar.a().get(i13);
                    long b12 = aVar2.b();
                    long j13 = b12 + j11;
                    if (b12 + 110 > this.f39698r) {
                        ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList2 = new ArrayList<>();
                        LinkedList linkedList4 = new LinkedList();
                        arrayList2.add(aVar2);
                        linkedList4.add(b11.get(i13));
                        linkedList.add(new e(r82, a(arrayList2), linkedList4));
                    } else {
                        j12 += j13;
                        if (88 + j12 + (arrayList.size() - r82) > this.f39698r) {
                            linkedList.add(new e(false, a(arrayList), linkedList3));
                            ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList3 = new ArrayList<>();
                            LinkedList linkedList5 = new LinkedList();
                            arrayList3.add(aVar2);
                            linkedList5.add(b11.get(i13));
                            arrayList = arrayList3;
                            linkedList3 = linkedList5;
                            j12 = j13;
                        } else {
                            arrayList.add(aVar2);
                            linkedList3.add(b11.get(i13));
                        }
                    }
                    i13++;
                    j11 = 22;
                    r82 = 1;
                }
                if (!arrayList.isEmpty()) {
                    linkedList.add(new e(false, a(arrayList), linkedList3));
                }
                i12 += this.f39692l.a();
                j11 = 22;
                z11 = true;
            }
        }
        return linkedList;
    }

    private void a(k kVar) {
        if (kVar != null) {
            try {
                if (kVar.b() != null) {
                    kVar.b().close();
                }
            } catch (Exception unused) {
                com.meizu.cloud.pushsdk.d.f.c.b(this.f39688h, "Unable to close source data", new Object[0]);
            }
        }
    }

    private void a(com.meizu.cloud.pushsdk.d.a.a aVar, String str) {
        if ("".equals(str)) {
            str = com.meizu.cloud.pushsdk.d.f.e.a();
        }
        aVar.a("stm", str);
    }

    public boolean a(int i11) {
        return i11 >= 200 && i11 < 300;
    }
}
