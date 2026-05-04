package ux;

import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOID.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OID.kt\nio/ktor/network/tls/OID\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1557#2:78\n1628#2,3:79\n*S KotlinDebug\n*F\n+ 1 OID.kt\nio/ktor/network/tls/OID\n*L\n10#1:78\n10#1:79,3\n*E\n"})
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f92658c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final m f92659d = new m("2.5.4.10");

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final m f92660e = new m("2.5.4.11");

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final m f92661f = new m("2.5.4.6");

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final m f92662g = new m("2.5.4.3");

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final m f92663h = new m("2.5.29.17");

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final m f92664i = new m("2.5.29.19");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final m f92665j = new m("2.5.29.15");

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final m f92666k = new m("2.5.29.37");

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final m f92667l = new m("1.3.6.1.5.5.7.3.1");

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final m f92668m = new m("1.3.6.1.5.5.7.3.2");

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final m f92669n = new m("1 2 840 113549 1 1 1");

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final m f92670o = new m("1.2.840.10045.2.1");

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final m f92671p = new m("1.2.840.10045.4.3.3");

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final m f92672q = new m("1.2.840.10045.4.3.2");

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final m f92673r = new m("1.2.840.113549.1.1.13");

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final m f92674s = new m("1.2.840.113549.1.1.12");

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final m f92675t = new m("1.2.840.113549.1.1.11");

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final m f92676u = new m("1.2.840.113549.1.1.5");

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final m f92677v = new m("1.2.840.10045.3.1.7");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f92678a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final int[] f92679b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @m80.k
        public final m a(@m80.k String algorithm) {
            kotlin.jvm.internal.g0.p(algorithm, "algorithm");
            switch (algorithm.hashCode()) {
                case -794853417:
                    if (algorithm.equals("SHA384withRSA")) {
                        return p();
                    }
                    break;
                case -754115883:
                    if (algorithm.equals("SHA1withRSA")) {
                        return n();
                    }
                    break;
                case -280290445:
                    if (algorithm.equals("SHA256withRSA")) {
                        return o();
                    }
                    break;
                case 637568043:
                    if (algorithm.equals("SHA384withECDSA")) {
                        return g();
                    }
                    break;
                case 1211345095:
                    if (algorithm.equals("SHA256withECDSA")) {
                        return f();
                    }
                    break;
            }
            throw new IllegalStateException(("Could't find OID for " + algorithm).toString());
        }

        @m80.k
        public final m b() {
            return m.f92664i;
        }

        @m80.k
        public final m c() {
            return m.f92668m;
        }

        @m80.k
        public final m d() {
            return m.f92662g;
        }

        @m80.k
        public final m e() {
            return m.f92661f;
        }

        @m80.k
        public final m f() {
            return m.f92672q;
        }

        @m80.k
        public final m g() {
            return m.f92671p;
        }

        @m80.k
        public final m h() {
            return m.f92670o;
        }

        @m80.k
        public final m i() {
            return m.f92666k;
        }

        @m80.k
        public final m j() {
            return m.f92665j;
        }

        @m80.k
        public final m k() {
            return m.f92659d;
        }

        @m80.k
        public final m l() {
            return m.f92660e;
        }

        @m80.k
        public final m m() {
            return m.f92669n;
        }

        @m80.k
        public final m n() {
            return m.f92676u;
        }

        @m80.k
        public final m o() {
            return m.f92675t;
        }

        @m80.k
        public final m p() {
            return m.f92674s;
        }

        @m80.k
        public final m q() {
            return m.f92673r;
        }

        @m80.k
        public final m r() {
            return m.f92677v;
        }

        @m80.k
        public final m s() {
            return m.f92667l;
        }

        @m80.k
        public final m t() {
            return m.f92663h;
        }

        public a() {
        }
    }

    public m(@m80.k String identifier) {
        kotlin.jvm.internal.g0.p(identifier, "identifier");
        this.f92678a = identifier;
        List o52 = u30.k0.o5(identifier, new String[]{".", " "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(a00.i0.d0(o52, 10));
        Iterator it = o52.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(u30.k0.b6((String) it.next()).toString())));
        }
        this.f92679b = r0.Z5(arrayList);
    }

    public static /* synthetic */ m v(m mVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mVar.f92678a;
        }
        return mVar.u(str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.g0.g(this.f92678a, ((m) obj).f92678a);
    }

    public int hashCode() {
        return this.f92678a.hashCode();
    }

    @m80.k
    public final String t() {
        return this.f92678a;
    }

    @m80.k
    public String toString() {
        return "OID(identifier=" + this.f92678a + ')';
    }

    @m80.k
    public final m u(@m80.k String identifier) {
        kotlin.jvm.internal.g0.p(identifier, "identifier");
        return new m(identifier);
    }

    @m80.k
    public final int[] w() {
        return this.f92679b;
    }

    @m80.k
    public final String x() {
        return this.f92678a;
    }
}
