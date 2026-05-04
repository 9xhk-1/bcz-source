package ry;

import a00.i0;
import a00.l1;
import a00.w1;
import ax.y;
import c40.a0;
import c40.n2;
import c40.r0;
import c40.x0;
import io.ktor.server.engine.o1;
import io.ktor.server.testing.TestApplication;
import io.ktor.server.testing.TestApplicationEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import rw.c1;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;
import zw.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDelegatingTestClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingTestClientEngine.kt\nio/ktor/server/testing/client/DelegatingTestClientEngine\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1863#2,2:99\n216#3:101\n217#3:103\n1#4:102\n*S KotlinDebug\n*F\n+ 1 DelegatingTestClientEngine.kt\nio/ktor/server/testing/client/DelegatingTestClientEngine\n*L\n70#1:99,2\n28#1:101\n28#1:103\n*E\n"})
/* loaded from: classes8.dex */
public final class e extends ow.e {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final a f86914m = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final f f86915e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<?>> f86916f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c0 f86917g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c0 f86918h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final c0 f86919i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final c0 f86920j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final a0 f86921k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f86922l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ow.l<f> {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @Override // ow.l
        @m80.k
        public ow.a a(@m80.k x00.l<? super f, g2> block) {
            g0.p(block, "block");
            f fVar = new f();
            block.invoke(fVar);
            return new e(fVar);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.DelegatingTestClientEngine", f = "DelegatingTestClientEngine.kt", i = {0, 0, 1, 1}, l = {48, 49, 54, 58}, m = "execute", n = {"this", "data", "this", "data"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f86923a;

        /* renamed from: b, reason: collision with root package name */
        public Object f86924b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f86925c;

        /* renamed from: e, reason: collision with root package name */
        public int f86927e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f86925c = obj;
            this.f86927e |= Integer.MIN_VALUE;
            return e.this.B0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.DelegatingTestClientEngine$mainEngineHostWithPortsDeferred$2$1", f = "DelegatingTestClientEngine.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nDelegatingTestClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingTestClientEngine.kt\nio/ktor/server/testing/client/DelegatingTestClientEngine$mainEngineHostWithPortsDeferred$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1557#2:99\n1628#2,3:100\n*S KotlinDebug\n*F\n+ 1 DelegatingTestClientEngine.kt\nio/ktor/server/testing/client/DelegatingTestClientEngine$mainEngineHostWithPortsDeferred$2$1\n*L\n39#1:99\n39#1:100,3\n*E\n"})
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super List<? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f86928a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new c(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<String>> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f86928a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                TestApplicationEngine o02 = e.this.o0();
                this.f86928a = 1;
                obj = o02.i(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            Iterable<o1> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
            for (o1 o1Var : iterable) {
                arrayList.add(o1Var.b() + ':' + o1Var.a());
            }
            return arrayList;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends String>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<String>>) cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@m80.k f config) {
        super("delegating-test-engine");
        g0.p(config, "config");
        this.f86915e = config;
        this.f86916f = w1.u(y.f5554a, c1.f84603a, s.f102985a);
        this.f86917g = e0.c(new x00.a() { // from class: ry.a
            @Override // x00.a
            public final Object invoke() {
                TestApplicationEngine c02;
                c02 = e.c0(e.this);
                return c02;
            }
        });
        this.f86918h = e0.c(new x00.a() { // from class: ry.b
            @Override // x00.a
            public final Object invoke() {
                Map m02;
                m02 = e.m0(e.this);
                return m02;
            }
        });
        this.f86919i = e0.c(new x00.a() { // from class: ry.c
            @Override // x00.a
            public final Object invoke() {
                l G0;
                G0 = e.G0(e.this);
                return G0;
            }
        });
        this.f86920j = e0.c(new x00.a() { // from class: ry.d
            @Override // x00.a
            public final Object invoke() {
                x0 D0;
                D0 = e.D0(e.this);
                return D0;
            }
        });
        a0 a11 = n2.a(getConfig().j());
        this.f86921k = a11;
        this.f86922l = E8().plus(a11);
    }

    public static final x0 D0(e eVar) {
        x0 b11;
        b11 = c40.k.b(eVar, null, null, eVar.new c(null), 3, null);
        return b11;
    }

    public static final l G0(e eVar) {
        i iVar = new i();
        iVar.k(eVar.o0());
        return new l(iVar);
    }

    public static final TestApplicationEngine c0(e eVar) {
        return eVar.getConfig().k().invoke().j().p();
    }

    public static final Map m0(e eVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TestApplication> entry : eVar.getConfig().k().invoke().i().entrySet()) {
            String key = entry.getKey();
            TestApplication value = entry.getValue();
            i iVar = new i();
            iVar.k(value.j().p());
            linkedHashMap.put(key, new l(iVar));
        }
        return l1.D0(linkedHashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // ow.a
    @m80.l
    @io.ktor.utils.io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(@m80.k cx.z r10, @m80.k j00.c<? super cx.f0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ry.e.b
            if (r0 == 0) goto L13
            r0 = r11
            ry.e$b r0 = (ry.e.b) r0
            int r1 = r0.f86927e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86927e = r1
            goto L18
        L13:
            ry.e$b r0 = new ry.e$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f86925c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f86927e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L56
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.e.n(r11)
            return r11
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.e.n(r11)
            return r11
        L3e:
            java.lang.Object r10 = r0.f86924b
            cx.z r10 = (cx.z) r10
            java.lang.Object r2 = r0.f86923a
            ry.e r2 = (ry.e) r2
            kotlin.e.n(r11)
            goto L86
        L4a:
            java.lang.Object r10 = r0.f86924b
            cx.z r10 = (cx.z) r10
            java.lang.Object r2 = r0.f86923a
            ry.e r2 = (ry.e) r2
            kotlin.e.n(r11)
            goto L75
        L56:
            kotlin.e.n(r11)
            ry.f r11 = r9.getConfig()
            x00.a r11 = r11.k()
            java.lang.Object r11 = r11.invoke()
            io.ktor.server.testing.TestApplication r11 = (io.ktor.server.testing.TestApplication) r11
            r0.f86923a = r9
            r0.f86924b = r10
            r0.f86927e = r6
            java.lang.Object r11 = r11.l(r0)
            if (r11 != r1) goto L74
            goto Ld4
        L74:
            r2 = r9
        L75:
            c40.x0 r11 = r2.C0()
            r0.f86923a = r2
            r0.f86924b = r10
            r0.f86927e = r5
            java.lang.Object r11 = r11.i(r0)
            if (r11 != r1) goto L86
            goto Ld4
        L86:
            java.util.List r11 = (java.util.List) r11
            ix.t2 r5 = r10.h()
            java.lang.String r5 = ix.w2.c(r5)
            ix.t2 r6 = r10.h()
            java.lang.String r6 = ix.l2.m(r6)
            java.util.Map r7 = r2.y0()
            boolean r7 = r7.containsKey(r5)
            r8 = 0
            if (r7 == 0) goto Lbe
            java.util.Map r11 = r2.y0()
            java.lang.Object r11 = r11.get(r5)
            kotlin.jvm.internal.g0.m(r11)
            ry.l r11 = (ry.l) r11
            r0.f86923a = r8
            r0.f86924b = r8
            r0.f86927e = r4
            java.lang.Object r10 = r11.B0(r10, r0)
            if (r10 != r1) goto Lbd
            goto Ld4
        Lbd:
            return r10
        Lbe:
            boolean r4 = r11.contains(r6)
            if (r4 == 0) goto Ld6
            ry.l r11 = r2.z0()
            r0.f86923a = r8
            r0.f86924b = r8
            r0.f86927e = r3
            java.lang.Object r10 = r11.B0(r10, r0)
            if (r10 != r1) goto Ld5
        Ld4:
            return r1
        Ld5:
            return r10
        Ld6:
            io.ktor.server.testing.client.InvalidTestRequestException r10 = new io.ktor.server.testing.client.InvalidTestRequestException
            java.util.Map r0 = r2.y0()
            java.util.Set r0 = r0.keySet()
            r10.<init>(r5, r0, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ry.e.B0(cx.z, j00.c):java.lang.Object");
    }

    public final x0<List<String>> C0() {
        return (x0) this.f86920j.getValue();
    }

    @Override // ow.e, ow.a
    @m80.k
    public Set<ow.h<?>> D2() {
        return this.f86916f;
    }

    @Override // ow.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f86921k.complete();
        z0().close();
        Iterator<T> it = y0().values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).close();
        }
    }

    @Override // ow.e, c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86922l;
    }

    public final TestApplicationEngine o0() {
        return (TestApplicationEngine) this.f86917g.getValue();
    }

    @Override // ow.a
    @m80.k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public f getConfig() {
        return this.f86915e;
    }

    public final Map<String, l> y0() {
        return (Map) this.f86918h.getValue();
    }

    public final l z0() {
        return (l) this.f86919i.getValue();
    }
}
