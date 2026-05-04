package com.meizu.cloud.pushsdk.c.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alipay.sdk.m.u.i;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.c.b;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.f;
import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.c.h;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.k;
import ix.l1;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b<T extends b> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39431a = "b";

    /* renamed from: w, reason: collision with root package name */
    private static final g f39432w = g.a("application/json; charset=utf-8");

    /* renamed from: x, reason: collision with root package name */
    private static final g f39433x = g.a("text/x-markdown; charset=utf-8");

    /* renamed from: z, reason: collision with root package name */
    private static final Object f39434z = new Object();
    private com.meizu.cloud.pushsdk.c.c.a A;
    private int B;
    private boolean C;
    private int D;
    private com.meizu.cloud.pushsdk.c.d.a E;
    private Bitmap.Config F;
    private int G;
    private int H;
    private ImageView.ScaleType I;
    private final Executor J;
    private String K;
    private Type L;

    /* renamed from: b, reason: collision with root package name */
    private final int f39435b;

    /* renamed from: c, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.c.a.d f39436c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39437d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39438e;

    /* renamed from: f, reason: collision with root package name */
    private int f39439f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f39440g;

    /* renamed from: h, reason: collision with root package name */
    private e f39441h;

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<String, String> f39442i;

    /* renamed from: j, reason: collision with root package name */
    private HashMap<String, String> f39443j;

    /* renamed from: k, reason: collision with root package name */
    private HashMap<String, String> f39444k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<String, String> f39445l;

    /* renamed from: m, reason: collision with root package name */
    private final HashMap<String, String> f39446m;

    /* renamed from: n, reason: collision with root package name */
    private final HashMap<String, String> f39447n;

    /* renamed from: o, reason: collision with root package name */
    private HashMap<String, File> f39448o;

    /* renamed from: p, reason: collision with root package name */
    private String f39449p;

    /* renamed from: q, reason: collision with root package name */
    private String f39450q;

    /* renamed from: r, reason: collision with root package name */
    private JSONObject f39451r;

    /* renamed from: s, reason: collision with root package name */
    private JSONArray f39452s;

    /* renamed from: t, reason: collision with root package name */
    private String f39453t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f39454u;

    /* renamed from: v, reason: collision with root package name */
    private File f39455v;

    /* renamed from: y, reason: collision with root package name */
    private g f39456y;

    /* renamed from: com.meizu.cloud.pushsdk.c.a.b$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39458a;

        static {
            int[] iArr = new int[e.values().length];
            f39458a = iArr;
            try {
                iArr[e.JSON_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39458a[e.JSON_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39458a[e.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39458a[e.BITMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39458a[e.PREFETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class a<T extends a> {

        /* renamed from: b, reason: collision with root package name */
        private final String f39460b;

        /* renamed from: c, reason: collision with root package name */
        private Object f39461c;

        /* renamed from: g, reason: collision with root package name */
        private final String f39465g;

        /* renamed from: h, reason: collision with root package name */
        private final String f39466h;

        /* renamed from: j, reason: collision with root package name */
        private Executor f39468j;

        /* renamed from: k, reason: collision with root package name */
        private String f39469k;

        /* renamed from: a, reason: collision with root package name */
        private com.meizu.cloud.pushsdk.c.a.d f39459a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap<String, String> f39462d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        private final HashMap<String, String> f39463e = new HashMap<>();

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, String> f39464f = new HashMap<>();

        /* renamed from: i, reason: collision with root package name */
        private int f39467i = 0;

        public a(String str, String str2, String str3) {
            this.f39460b = str;
            this.f39465g = str2;
            this.f39466h = str3;
        }

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.c.a.b$b, reason: collision with other inner class name */
    public static class C0474b<T extends C0474b> {

        /* renamed from: c, reason: collision with root package name */
        private final String f39472c;

        /* renamed from: d, reason: collision with root package name */
        private Object f39473d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap.Config f39474e;

        /* renamed from: f, reason: collision with root package name */
        private int f39475f;

        /* renamed from: g, reason: collision with root package name */
        private int f39476g;

        /* renamed from: h, reason: collision with root package name */
        private ImageView.ScaleType f39477h;

        /* renamed from: l, reason: collision with root package name */
        private Executor f39481l;

        /* renamed from: m, reason: collision with root package name */
        private String f39482m;

        /* renamed from: a, reason: collision with root package name */
        private com.meizu.cloud.pushsdk.c.a.d f39470a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;

        /* renamed from: i, reason: collision with root package name */
        private final HashMap<String, String> f39478i = new HashMap<>();

        /* renamed from: j, reason: collision with root package name */
        private final HashMap<String, String> f39479j = new HashMap<>();

        /* renamed from: k, reason: collision with root package name */
        private final HashMap<String, String> f39480k = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private final int f39471b = 0;

        public C0474b(String str) {
            this.f39472c = str;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    this.f39479j.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public static class c<T extends c> {

        /* renamed from: b, reason: collision with root package name */
        private final String f39484b;

        /* renamed from: c, reason: collision with root package name */
        private Object f39485c;

        /* renamed from: j, reason: collision with root package name */
        private Executor f39492j;

        /* renamed from: k, reason: collision with root package name */
        private String f39493k;

        /* renamed from: l, reason: collision with root package name */
        private String f39494l;

        /* renamed from: a, reason: collision with root package name */
        private com.meizu.cloud.pushsdk.c.a.d f39483a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap<String, String> f39486d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        private final HashMap<String, String> f39487e = new HashMap<>();

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, String> f39488f = new HashMap<>();

        /* renamed from: g, reason: collision with root package name */
        private final HashMap<String, String> f39489g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        private final HashMap<String, File> f39490h = new HashMap<>();

        /* renamed from: i, reason: collision with root package name */
        private int f39491i = 0;

        public c(String str) {
            this.f39484b = str;
        }

        public T a(String str, File file) {
            this.f39490h.put(str, file);
            return this;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    this.f39487e.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public static class d<T extends d> {

        /* renamed from: c, reason: collision with root package name */
        private final String f39497c;

        /* renamed from: d, reason: collision with root package name */
        private Object f39498d;

        /* renamed from: o, reason: collision with root package name */
        private Executor f39509o;

        /* renamed from: p, reason: collision with root package name */
        private String f39510p;

        /* renamed from: q, reason: collision with root package name */
        private String f39511q;

        /* renamed from: a, reason: collision with root package name */
        private com.meizu.cloud.pushsdk.c.a.d f39495a = com.meizu.cloud.pushsdk.c.a.d.MEDIUM;

        /* renamed from: e, reason: collision with root package name */
        private JSONObject f39499e = null;

        /* renamed from: f, reason: collision with root package name */
        private JSONArray f39500f = null;

        /* renamed from: g, reason: collision with root package name */
        private String f39501g = null;

        /* renamed from: h, reason: collision with root package name */
        private byte[] f39502h = null;

        /* renamed from: i, reason: collision with root package name */
        private File f39503i = null;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap<String, String> f39504j = new HashMap<>();

        /* renamed from: k, reason: collision with root package name */
        private final HashMap<String, String> f39505k = new HashMap<>();

        /* renamed from: l, reason: collision with root package name */
        private final HashMap<String, String> f39506l = new HashMap<>();

        /* renamed from: m, reason: collision with root package name */
        private final HashMap<String, String> f39507m = new HashMap<>();

        /* renamed from: n, reason: collision with root package name */
        private final HashMap<String, String> f39508n = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private final int f39496b = 1;

        public d(String str) {
            this.f39497c = str;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    this.f39505k.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public b(a aVar) {
        this.f39443j = new HashMap<>();
        this.f39444k = new HashMap<>();
        this.f39445l = new HashMap<>();
        this.f39448o = new HashMap<>();
        this.f39451r = null;
        this.f39452s = null;
        this.f39453t = null;
        this.f39454u = null;
        this.f39455v = null;
        this.f39456y = null;
        this.D = 0;
        this.L = null;
        this.f39437d = 1;
        this.f39435b = 0;
        this.f39436c = aVar.f39459a;
        this.f39438e = aVar.f39460b;
        this.f39440g = aVar.f39461c;
        this.f39449p = aVar.f39465g;
        this.f39450q = aVar.f39466h;
        this.f39442i = aVar.f39462d;
        this.f39446m = aVar.f39463e;
        this.f39447n = aVar.f39464f;
        this.D = aVar.f39467i;
        this.J = aVar.f39468j;
        this.K = aVar.f39469k;
    }

    public com.meizu.cloud.pushsdk.c.a.c b() {
        this.f39441h = e.BITMAP;
        return com.meizu.cloud.pushsdk.c.e.c.a(this);
    }

    public com.meizu.cloud.pushsdk.c.a.c c() {
        return com.meizu.cloud.pushsdk.c.e.c.a(this);
    }

    public int d() {
        return this.f39435b;
    }

    public String e() {
        String str = this.f39438e;
        for (Map.Entry<String, String> entry : this.f39447n.entrySet()) {
            str = str.replace("{" + entry.getKey() + i.f11099d, String.valueOf(entry.getValue()));
        }
        f.a f11 = f.c(str).f();
        for (Map.Entry<String, String> entry2 : this.f39446m.entrySet()) {
            f11.a(entry2.getKey(), entry2.getValue());
        }
        return f11.b().toString();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public e f() {
        return this.f39441h;
    }

    public int g() {
        return this.f39437d;
    }

    public String h() {
        return this.K;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public com.meizu.cloud.pushsdk.c.d.a i() {
        return new com.meizu.cloud.pushsdk.c.d.a() { // from class: com.meizu.cloud.pushsdk.c.a.b.1
            @Override // com.meizu.cloud.pushsdk.c.d.a
            public void a(long j11, long j12) {
                b.this.B = (int) ((100 * j11) / j12);
                if (b.this.E == null || b.this.C) {
                    return;
                }
                b.this.E.a(j11, j12);
            }
        };
    }

    public String j() {
        return this.f39449p;
    }

    public String k() {
        return this.f39450q;
    }

    public com.meizu.cloud.pushsdk.c.c.a l() {
        return this.A;
    }

    public j m() {
        JSONObject jSONObject = this.f39451r;
        if (jSONObject != null) {
            g gVar = this.f39456y;
            return gVar != null ? j.a(gVar, jSONObject.toString()) : j.a(f39432w, jSONObject.toString());
        }
        JSONArray jSONArray = this.f39452s;
        if (jSONArray != null) {
            g gVar2 = this.f39456y;
            return gVar2 != null ? j.a(gVar2, jSONArray.toString()) : j.a(f39432w, jSONArray.toString());
        }
        String str = this.f39453t;
        if (str != null) {
            g gVar3 = this.f39456y;
            return gVar3 != null ? j.a(gVar3, str) : j.a(f39433x, str);
        }
        File file = this.f39455v;
        if (file != null) {
            g gVar4 = this.f39456y;
            return gVar4 != null ? j.a(gVar4, file) : j.a(f39433x, file);
        }
        byte[] bArr = this.f39454u;
        if (bArr != null) {
            g gVar5 = this.f39456y;
            return gVar5 != null ? j.a(gVar5, bArr) : j.a(f39433x, bArr);
        }
        b.a aVar = new b.a();
        try {
            for (Map.Entry<String, String> entry : this.f39443j.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry<String, String> entry2 : this.f39444k.entrySet()) {
                if (!TextUtils.isEmpty(entry2.getKey()) && !TextUtils.isEmpty(entry2.getValue())) {
                    aVar.b(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return aVar.a();
    }

    public j n() {
        h.a a11 = new h.a().a(h.f39576e);
        try {
            for (Map.Entry<String, String> entry : this.f39445l.entrySet()) {
                a11.a(com.meizu.cloud.pushsdk.c.c.c.a("Content-Disposition", "form-data; name=\"" + entry.getKey() + "\""), j.a((g) null, entry.getValue()));
            }
            for (Map.Entry<String, File> entry2 : this.f39448o.entrySet()) {
                if (entry2.getValue() != null) {
                    String name = entry2.getValue().getName();
                    a11.a(com.meizu.cloud.pushsdk.c.c.c.a("Content-Disposition", "form-data; name=\"" + entry2.getKey() + "\"; filename=\"" + name + "\""), j.a(g.a(com.meizu.cloud.pushsdk.c.h.b.a(name)), entry2.getValue()));
                    g gVar = this.f39456y;
                    if (gVar != null) {
                        a11.a(gVar);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return a11.a();
    }

    public com.meizu.cloud.pushsdk.c.c.c o() {
        c.a aVar = new c.a();
        try {
            for (Map.Entry<String, String> entry : this.f39442i.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return aVar.a();
    }

    public String toString() {
        return "ANRequest{sequenceNumber='" + this.f39439f + ", mMethod=" + this.f39435b + ", mPriority=" + this.f39436c + ", mRequestType=" + this.f39437d + ", mUrl=" + this.f39438e + l50.b.f69928j;
    }

    public b(C0474b c0474b) {
        this.f39443j = new HashMap<>();
        this.f39444k = new HashMap<>();
        this.f39445l = new HashMap<>();
        this.f39448o = new HashMap<>();
        this.f39451r = null;
        this.f39452s = null;
        this.f39453t = null;
        this.f39454u = null;
        this.f39455v = null;
        this.f39456y = null;
        this.D = 0;
        this.L = null;
        this.f39437d = 0;
        this.f39435b = c0474b.f39471b;
        this.f39436c = c0474b.f39470a;
        this.f39438e = c0474b.f39472c;
        this.f39440g = c0474b.f39473d;
        this.f39442i = c0474b.f39478i;
        this.F = c0474b.f39474e;
        this.H = c0474b.f39476g;
        this.G = c0474b.f39475f;
        this.I = c0474b.f39477h;
        this.f39446m = c0474b.f39479j;
        this.f39447n = c0474b.f39480k;
        this.J = c0474b.f39481l;
        this.K = c0474b.f39482m;
    }

    public com.meizu.cloud.pushsdk.c.a.c a() {
        this.f39441h = e.STRING;
        return com.meizu.cloud.pushsdk.c.e.c.a(this);
    }

    public b(c cVar) {
        this.f39443j = new HashMap<>();
        this.f39444k = new HashMap<>();
        this.f39445l = new HashMap<>();
        this.f39448o = new HashMap<>();
        this.f39451r = null;
        this.f39452s = null;
        this.f39453t = null;
        this.f39454u = null;
        this.f39455v = null;
        this.f39456y = null;
        this.D = 0;
        this.L = null;
        this.f39437d = 2;
        this.f39435b = 1;
        this.f39436c = cVar.f39483a;
        this.f39438e = cVar.f39484b;
        this.f39440g = cVar.f39485c;
        this.f39442i = cVar.f39486d;
        this.f39446m = cVar.f39488f;
        this.f39447n = cVar.f39489g;
        this.f39445l = cVar.f39487e;
        this.f39448o = cVar.f39490h;
        this.D = cVar.f39491i;
        this.J = cVar.f39492j;
        this.K = cVar.f39493k;
        if (cVar.f39494l != null) {
            this.f39456y = g.a(cVar.f39494l);
        }
    }

    public com.meizu.cloud.pushsdk.c.a.c a(k kVar) {
        com.meizu.cloud.pushsdk.c.a.c<Bitmap> a11;
        int i11 = AnonymousClass2.f39458a[this.f39441h.ordinal()];
        if (i11 == 1) {
            try {
                return com.meizu.cloud.pushsdk.c.a.c.a(new JSONArray(com.meizu.cloud.pushsdk.c.g.g.a(kVar.b().a()).h()));
            } catch (Exception e11) {
                return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e11)));
            }
        }
        if (i11 == 2) {
            try {
                return com.meizu.cloud.pushsdk.c.a.c.a(new JSONObject(com.meizu.cloud.pushsdk.c.g.g.a(kVar.b().a()).h()));
            } catch (Exception e12) {
                return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e12)));
            }
        }
        if (i11 == 3) {
            try {
                return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.g.g.a(kVar.b().a()).h());
            } catch (Exception e13) {
                return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e13)));
            }
        }
        if (i11 != 4) {
            if (i11 != 5) {
                return null;
            }
            return com.meizu.cloud.pushsdk.c.a.c.a(l1.b.f62933c);
        }
        synchronized (f39434z) {
            try {
                try {
                    a11 = com.meizu.cloud.pushsdk.c.h.b.a(kVar, this.G, this.H, this.F, this.I);
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception e14) {
                return com.meizu.cloud.pushsdk.c.a.c.a(com.meizu.cloud.pushsdk.c.h.b.b(new com.meizu.cloud.pushsdk.c.b.a(e14)));
            }
        }
        return a11;
    }

    public b(d dVar) {
        this.f39443j = new HashMap<>();
        this.f39444k = new HashMap<>();
        this.f39445l = new HashMap<>();
        this.f39448o = new HashMap<>();
        this.f39451r = null;
        this.f39452s = null;
        this.f39453t = null;
        this.f39454u = null;
        this.f39455v = null;
        this.f39456y = null;
        this.D = 0;
        this.L = null;
        this.f39437d = 0;
        this.f39435b = dVar.f39496b;
        this.f39436c = dVar.f39495a;
        this.f39438e = dVar.f39497c;
        this.f39440g = dVar.f39498d;
        this.f39442i = dVar.f39504j;
        this.f39443j = dVar.f39505k;
        this.f39444k = dVar.f39506l;
        this.f39446m = dVar.f39507m;
        this.f39447n = dVar.f39508n;
        this.f39451r = dVar.f39499e;
        this.f39452s = dVar.f39500f;
        this.f39453t = dVar.f39501g;
        this.f39455v = dVar.f39503i;
        this.f39454u = dVar.f39502h;
        this.J = dVar.f39509o;
        this.K = dVar.f39510p;
        if (dVar.f39511q != null) {
            this.f39456y = g.a(dVar.f39511q);
        }
    }

    public com.meizu.cloud.pushsdk.c.b.a a(com.meizu.cloud.pushsdk.c.b.a aVar) {
        try {
            if (aVar.a() == null || aVar.a().b() == null || aVar.a().b().a() == null) {
                return aVar;
            }
            aVar.b(com.meizu.cloud.pushsdk.c.g.g.a(aVar.a().b().a()).h());
            return aVar;
        } catch (Exception e11) {
            e11.printStackTrace();
            return aVar;
        }
    }

    public void a(com.meizu.cloud.pushsdk.c.c.a aVar) {
        this.A = aVar;
    }

    public void a(String str) {
        this.K = str;
    }
}
