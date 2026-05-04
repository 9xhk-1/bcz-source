package my;

import a00.i0;
import a00.m0;
import a00.r0;
import a00.x1;
import h10.r;
import ix.e1;
import ix.g1;
import ix.y0;
import ix.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import my.c;
import org.junit.jupiter.api.j2;
import org.slf4j.Logger;
import x00.l;
import x00.q;
import xy.e2;
import yz.g2;
import yz.h1;
import yz.n;
import yz.w0;
import zx.b0;
import zx.h0;
import zx.k0;
import zx.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCORS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CORS.kt\nio/ktor/server/plugins/cors/CORSKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,230:1\n1557#2:231\n1628#2,3:232\n827#2:235\n855#2,2:236\n827#2:239\n855#2,2:240\n1557#2:242\n1628#2,3:243\n827#2:246\n855#2,2:247\n1557#2:249\n1628#2,3:250\n774#2:253\n865#2,2:254\n1557#2:256\n1628#2,3:257\n1368#2:260\n1454#2,5:261\n774#2:266\n865#2,2:267\n1557#2:269\n1628#2,3:270\n774#2:309\n865#2,2:310\n1#3:238\n25#4:273\n26#4:290\n25#4:291\n26#4:308\n25#4:312\n26#4:329\n58#5,16:274\n58#5,16:292\n58#5,16:313\n*S KotlinDebug\n*F\n+ 1 CORS.kt\nio/ktor/server/plugins/cors/CORSKt\n*L\n51#1:231\n51#1:232,3\n53#1:235\n53#1:236,2\n55#1:239\n55#1:240,2\n56#1:242\n56#1:243,3\n66#1:246\n66#1:247,2\n67#1:249\n67#1:250,3\n71#1:253\n71#1:254,2\n72#1:256\n72#1:257,3\n196#1:260\n196#1:261,5\n197#1:266\n197#1:267,2\n198#1:269\n198#1:270,3\n221#1:309\n221#1:310,2\n204#1:273\n204#1:290\n210#1:291\n210#1:308\n228#1:312\n228#1:329\n204#1:274,16\n210#1:292,16\n228#1:313,16\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Logger f73868a = ez.a.a("io.ktor.server.plugins.cors.CORS");

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final zx.k<c> f73869b = b0.i("CORS", a.f73870a, new l() { // from class: my.d
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 b11;
            b11 = e.b((o0) obj);
            return b11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f73870a = new a();

        public a() {
            super(0, c.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.cors.CORSKt$buildPlugin$1", f = "CORS.kt", i = {}, l = {110, 120, 128, 144}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nCORS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CORS.kt\nio/ktor/server/plugins/cors/CORSKt$buildPlugin$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
    public static final class b extends SuspendLambda implements q<h0<c>, k0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73871a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73872b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f73873c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f73874d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f73875e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ HashSet<String> f73876f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ HashSet<Pair<String, String>> f73877g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<l<String, Boolean>> f73878h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f73879i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f73880j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List<String> f73881k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set<e1> f73882l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f73883m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<l<String, Boolean>> f73884n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Set<String> f73885o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f73886p;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f73887a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.f73889a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.f73890b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.f73891c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f73887a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z11, boolean z12, boolean z13, HashSet<String> hashSet, HashSet<Pair<String, String>> hashSet2, List<? extends l<? super String, Boolean>> list, boolean z14, String str, List<String> list2, Set<e1> set, String str2, List<? extends l<? super String, Boolean>> list3, Set<String> set2, String str3, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f73873c = z11;
            this.f73874d = z12;
            this.f73875e = z13;
            this.f73876f = hashSet;
            this.f73877g = hashSet2;
            this.f73878h = list;
            this.f73879i = z14;
            this.f73880j = str;
            this.f73881k = list2;
            this.f73882l = set;
            this.f73883m = str2;
            this.f73884n = list3;
            this.f73885o = set2;
            this.f73886p = str3;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h0<c> h0Var, k0 k0Var, j00.c<? super g2> cVar) {
            b bVar = new b(this.f73873c, this.f73874d, this.f73875e, this.f73876f, this.f73877g, this.f73878h, this.f73879i, this.f73880j, this.f73881k, this.f73882l, this.f73883m, this.f73884n, this.f73885o, this.f73886p, cVar);
            bVar.f73872b = k0Var;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
        
            if (my.f.m(r0, r19) == r11) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
        
            if (my.f.m(r0, r19) == r11) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x018b, code lost:
        
            if (my.e.j(r0, r12, r1, r3, r4, r5, r6, r7, r8, r9, r19) == r11) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x01cd, code lost:
        
            if (my.f.m(r0, r19) == r11) goto L66;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 502
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: my.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final g2 b(o0 createApplicationPlugin) {
        g0.p(createApplicationPlugin, "$this$createApplicationPlugin");
        f(createApplicationPlugin);
        return g2.f100423a;
    }

    public static final void f(@k o0<c> o0Var) {
        g0.p(o0Var, "<this>");
        boolean v11 = o0Var.l().v();
        boolean contains = o0Var.l().B().contains("*");
        boolean t11 = o0Var.l().t();
        Set<String> z11 = o0Var.l().z();
        c.a aVar = c.f73851l;
        Set C = x1.C(z11, aVar.f());
        if (!o0Var.l().u()) {
            C = x1.y(C, y0.f63006a.C());
        }
        List<l<String, Boolean>> E = o0Var.l().E();
        List<l<String, Boolean>> y11 = o0Var.l().y();
        HashSet hashSet = new HashSet(x1.C(o0Var.l().D(), aVar.c()));
        Set set = C;
        ArrayList arrayList = new ArrayList(i0.d0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(e2.e((String) it.next()));
        }
        Set f62 = r0.f6(arrayList);
        boolean u11 = o0Var.l().u();
        Set<String> z12 = o0Var.l().z();
        List arrayList2 = new ArrayList();
        for (Object obj : z12) {
            if (!c.f73851l.f().contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (u11) {
            arrayList2 = r0.J4(arrayList2, y0.f63006a.C());
        }
        List list = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : hashSet) {
            if (!c.f73851l.c().contains((e1) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(i0.d0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((e1) it2.next()).l());
        }
        String r32 = r0.r3(r0.v5(arrayList4), j2.O, null, null, 0, null, null, 62, null);
        long C2 = o0Var.l().C();
        String valueOf = C2 > 0 ? String.valueOf(C2) : null;
        String r33 = !o0Var.l().w().isEmpty() ? r0.r3(r0.v5(o0Var.l().w()), j2.O, null, null, 0, null, null, 62, null) : null;
        Set<String> B = o0Var.l().B();
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = B.iterator();
        while (it3.hasNext()) {
            String str = valueOf;
            Object next = it3.next();
            Iterator it4 = it3;
            boolean z13 = contains;
            boolean z14 = t11;
            if (!u30.k0.m3((String) next, '*', false, 2, null)) {
                arrayList5.add(next);
            }
            valueOf = str;
            it3 = it4;
            contains = z13;
            t11 = z14;
        }
        String str2 = valueOf;
        boolean z15 = contains;
        boolean z16 = t11;
        ArrayList arrayList6 = new ArrayList(i0.d0(arrayList5, 10));
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(f.l((String) it5.next()));
        }
        HashSet hashSet2 = new HashSet(arrayList6);
        Set<String> B2 = o0Var.l().B();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = B2.iterator();
        while (it6.hasNext()) {
            Object next2 = it6.next();
            Iterator it7 = it6;
            HashSet hashSet3 = hashSet2;
            if (u30.k0.m3((String) next2, '*', false, 2, null)) {
                arrayList7.add(next2);
            }
            hashSet2 = hashSet3;
            it6 = it7;
        }
        HashSet hashSet4 = hashSet2;
        ArrayList arrayList8 = new ArrayList(i0.d0(arrayList7, 10));
        Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            List n52 = u30.k0.n5(f.l((String) it8.next()), new char[]{'*'}, false, 0, 6, null);
            arrayList8.add(h1.a((String) n52.get(0), (String) n52.get(1)));
        }
        o0Var.o(new b(z15, z16, v11, hashSet4, new HashSet(arrayList8), E, u11, r32, list, hashSet, str2, y11, f62, r33, null));
    }

    public static final h g(String str, z1 z1Var, boolean z11, boolean z12, Set<String> set, Set<Pair<String, String>> set2, List<? extends l<? super String, Boolean>> list) {
        return !f.k(str) ? h.f73890b : (z11 && f.j(str, z1Var)) ? h.f73890b : !f.e(str, z12, set, set2, list) ? h.f73891c : h.f73889a;
    }

    @k
    public static final zx.k<c> h() {
        return f73869b;
    }

    public static final Object j(zx.b bVar, String str, String str2, List<String> list, Set<e1> set, boolean z11, boolean z12, String str3, List<? extends l<? super String, Boolean>> list2, Set<String> set2, j00.c<? super g2> cVar) {
        List J;
        List<String> a11 = bVar.f().a().a(y0.f63006a.o());
        if (a11 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                m0.s0(arrayList, u30.k0.o5((String) it.next(), new String[]{","}, false, 0, 6, null));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!u30.k0.O3((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            J = new ArrayList(i0.d0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                J.add(e2.e(u30.k0.b6((String) it2.next()).toString()));
            }
        } else {
            J = a00.h0.J();
        }
        r rVar = null;
        if (!f.g(bVar, set)) {
            f73868a.trace("Return Forbidden for " + py.e.q(bVar.f()) + ": CORS method doesn't match " + py.e.o(bVar.f()));
            g1 k11 = g1.f62797c.k();
            h10.d d11 = kotlin.jvm.internal.o0.d(g1.class);
            try {
                rVar = kotlin.jvm.internal.o0.B(g1.class);
            } catch (Throwable unused) {
            }
            Object E = bVar.E(k11, new gz.a(d11, rVar), cVar);
            return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
        }
        if (!f.f(J, set2, list2)) {
            f73868a.trace("Return Forbidden for " + py.e.q(bVar.f()) + ": request has not allowed headers.");
            g1 k12 = g1.f62797c.k();
            h10.d d12 = kotlin.jvm.internal.o0.d(g1.class);
            try {
                rVar = kotlin.jvm.internal.o0.B(g1.class);
            } catch (Throwable unused2) {
            }
            Object E2 = bVar.E(k12, new gz.a(d12, rVar), cVar);
            return E2 == kotlin.coroutines.intrinsics.b.l() ? E2 : g2.f100423a;
        }
        f.b(bVar, str, z11, z12);
        f.a(bVar, z12);
        if (str2.length() > 0) {
            qy.l.l(bVar.k(), y0.f63006a.k(), str2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : J) {
            if (f.i((String) obj2, list2)) {
                arrayList3.add(obj2);
            }
        }
        qy.l.l(bVar.k(), y0.f63006a.j(), r0.r3(r0.v5(r0.I4(list, arrayList3)), j2.O, null, null, 0, null, null, 62, null));
        f.c(bVar, str3);
        g1 C = g1.f62797c.C();
        h10.d d13 = kotlin.jvm.internal.o0.d(g1.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(g1.class);
        } catch (Throwable unused3) {
        }
        Object E3 = bVar.E(C, new gz.a(d13, rVar), cVar);
        return E3 == kotlin.coroutines.intrinsics.b.l() ? E3 : g2.f100423a;
    }

    @n(level = DeprecationLevel.ERROR, message = "This plugin was moved to io.ktor.server.plugins.cors.routing", replaceWith = @w0(expression = "CORS", imports = {"io.ktor.server.plugins.cors.routing.CORS"}))
    public static /* synthetic */ void i() {
    }
}
