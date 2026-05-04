package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.Mask;
import d1.j;
import d1.l;
import e1.c;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Layer {

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f10055a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10056b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10057c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10058d;

    /* renamed from: e, reason: collision with root package name */
    public final LayerType f10059e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10060f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f10061g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Mask> f10062h;

    /* renamed from: i, reason: collision with root package name */
    public final l f10063i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10064j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10065k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10066l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10067m;

    /* renamed from: n, reason: collision with root package name */
    public final float f10068n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10069o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10070p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public final j f10071q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public final d1.k f10072r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public final d1.b f10073s;

    /* renamed from: t, reason: collision with root package name */
    public final List<k1.a<Float>> f10074t;

    /* renamed from: u, reason: collision with root package name */
    public final MatteType f10075u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f10076v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public final e1.a f10077w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public final h1.j f10078x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<c> list, k kVar, String str, long j11, LayerType layerType, long j12, @Nullable String str2, List<Mask> list2, l lVar, int i11, int i12, int i13, float f11, float f12, int i14, int i15, @Nullable j jVar, @Nullable d1.k kVar2, List<k1.a<Float>> list3, MatteType matteType, @Nullable d1.b bVar, boolean z11, @Nullable e1.a aVar, @Nullable h1.j jVar2) {
        this.f10055a = list;
        this.f10056b = kVar;
        this.f10057c = str;
        this.f10058d = j11;
        this.f10059e = layerType;
        this.f10060f = j12;
        this.f10061g = str2;
        this.f10062h = list2;
        this.f10063i = lVar;
        this.f10064j = i11;
        this.f10065k = i12;
        this.f10066l = i13;
        this.f10067m = f11;
        this.f10068n = f12;
        this.f10069o = i14;
        this.f10070p = i15;
        this.f10071q = jVar;
        this.f10072r = kVar2;
        this.f10074t = list3;
        this.f10075u = matteType;
        this.f10073s = bVar;
        this.f10076v = z11;
        this.f10077w = aVar;
        this.f10078x = jVar2;
    }

    @Nullable
    public e1.a a() {
        return this.f10077w;
    }

    public k b() {
        return this.f10056b;
    }

    @Nullable
    public h1.j c() {
        return this.f10078x;
    }

    public long d() {
        return this.f10058d;
    }

    public List<k1.a<Float>> e() {
        return this.f10074t;
    }

    public LayerType f() {
        return this.f10059e;
    }

    public List<Mask> g() {
        return this.f10062h;
    }

    public MatteType h() {
        return this.f10075u;
    }

    public String i() {
        return this.f10057c;
    }

    public long j() {
        return this.f10060f;
    }

    public int k() {
        return this.f10070p;
    }

    public int l() {
        return this.f10069o;
    }

    @Nullable
    public String m() {
        return this.f10061g;
    }

    public List<c> n() {
        return this.f10055a;
    }

    public int o() {
        return this.f10066l;
    }

    public int p() {
        return this.f10065k;
    }

    public int q() {
        return this.f10064j;
    }

    public float r() {
        return this.f10068n / this.f10056b.e();
    }

    @Nullable
    public j s() {
        return this.f10071q;
    }

    @Nullable
    public d1.k t() {
        return this.f10072r;
    }

    public String toString() {
        return y("");
    }

    @Nullable
    public d1.b u() {
        return this.f10073s;
    }

    public float v() {
        return this.f10067m;
    }

    public l w() {
        return this.f10063i;
    }

    public boolean x() {
        return this.f10076v;
    }

    public String y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i());
        sb2.append("\n");
        Layer x11 = this.f10056b.x(j());
        if (x11 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(x11.i());
            Layer x12 = this.f10056b.x(x11.j());
            while (x12 != null) {
                sb2.append("->");
                sb2.append(x12.i());
                x12 = this.f10056b.x(x12.j());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!g().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(g().size());
            sb2.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f10055a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (c cVar : this.f10055a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
