package cb0;

import a00.a0;
import a00.h0;
import a00.m;
import a00.m0;
import a00.r0;
import ab0.a;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import oa0.g;
import org.koin.core.definition.Kind;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.MissingScopeValueException;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.core.logger.Level;
import ta0.f;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@va0.b
@u0({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 measureTime.kt\nkotlin/time/MeasureTimeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,444:1\n252#1:446\n253#1,3:448\n258#1,2:455\n272#1,4:458\n43#2:445\n50#2:462\n43#2,9:463\n1#3:447\n1#3:457\n95#4:451\n135#4,3:452\n1374#5:472\n1460#5,5:473\n1869#5,2:478\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope\n*L\n244#1:446\n244#1:448,3\n246#1:455,2\n266#1:458,4\n240#1:445\n286#1:462\n286#1:463,9\n244#1:447\n245#1:451\n245#1:452,3\n397#1:472\n397#1:473,5\n426#1:478,2\n*E\n"})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final za0.a f8488a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f8489b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8490c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final za0.d f8491d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final na0.a f8492e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList<b> f8493f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Object f8494g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashSet<cb0.c> f8495h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public ThreadLocal<m<ya0.a>> f8496i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8497j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$declare$1\n+ 2 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry\n+ 3 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,444:1\n145#2,2:445\n147#2,6:454\n153#2,3:467\n156#2,3:471\n159#2,3:475\n99#3,7:447\n122#3,7:460\n1869#4:470\n1870#4:474\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$declare$1\n*L\n353#1:445,2\n353#1:454,6\n353#1:467,3\n353#1:471,3\n353#1:475,3\n353#1:447,7\n353#1:460,7\n353#1:470\n353#1:474\n*E\n"})
    public static final class a implements x00.a<g2> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f8499b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ za0.a f8500c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<h10.d<?>> f8501d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f8502e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f8503f;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: cb0.b$a$a, reason: collision with other inner class name */
        public static final class C0144a<T> implements p<b, ya0.a, T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f8504a;

            public C0144a(Object obj) {
                this.f8504a = obj;
            }

            @Override // x00.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(b bVar, ya0.a it) {
                g0.p(bVar, "<this>");
                g0.p(it, "it");
                return (T) this.f8504a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(T t11, za0.a aVar, List<? extends h10.d<?>> list, boolean z11, boolean z12) {
            this.f8499b = t11;
            this.f8500c = aVar;
            this.f8501d = list;
            this.f8502e = z11;
            this.f8503f = z12;
        }

        public final void a() {
            p c0144a;
            String str;
            String value;
            ab0.a u11 = b.this.M().u();
            T t11 = this.f8499b;
            za0.a G = b.this.G();
            String p11 = b.this.p();
            za0.a aVar = this.f8500c;
            List<h10.d<?>> list = this.f8501d;
            boolean z11 = this.f8502e;
            boolean z12 = this.f8503f;
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            h10.d d11 = o0.d(Object.class);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fb0.b.a(d11));
            sb2.append(':');
            sb2.append((aVar == null || (value = aVar.getValue()) == null) ? "" : value);
            sb2.append(':');
            sb2.append(G);
            String sb3 = sb2.toString();
            ta0.b<?> bVar = u11.i().get(sb3);
            f fVar = bVar instanceof f ? (f) bVar : null;
            if (fVar != null) {
                fVar.m(p11, t11);
                return;
            }
            if (z12) {
                g0.w();
                c0144a = new C0144a(t11);
            } else {
                c0144a = new a.b(d11);
            }
            Kind kind = Kind.Scoped;
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            ra0.b bVar2 = new ra0.b(G, o0.d(Object.class), aVar, c0144a, kind, list);
            f fVar2 = new f(bVar2, z12);
            ab0.a.q(u11, z11, sb3, fVar2, false, 8, null);
            Iterator<T> it = bVar2.h().iterator();
            while (it.hasNext()) {
                h10.d dVar = (h10.d) it.next();
                za0.a f11 = bVar2.f();
                za0.a g11 = bVar2.g();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(fb0.b.a(dVar));
                sb4.append(':');
                if (f11 == null || (str = f11.getValue()) == null) {
                    str = "";
                }
                sb4.append(str);
                sb4.append(':');
                sb4.append(g11);
                ab0.a.q(u11, z11, sb4.toString(), fVar2, false, 8, null);
            }
            fVar2.m(p11, t11);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            a();
            return g2.f100423a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,444:1\n142#2:445\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n*L\n115#1:445\n*E\n"})
    /* renamed from: cb0.b$b, reason: collision with other inner class name */
    public static final class C0145b<T> implements x00.a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f8506b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<ya0.a> f8507c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0145b(za0.a aVar, x00.a<? extends ya0.a> aVar2) {
            this.f8506b = aVar;
            this.f8507c = aVar2;
        }

        @Override // x00.a
        public final T invoke() {
            b bVar = b.this;
            za0.a aVar = this.f8506b;
            x00.a<ya0.a> aVar2 = this.f8507c;
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) bVar.i(o0.d(Object.class), aVar, aVar2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$injectOrNull$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,444:1\n166#2:445\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$injectOrNull$1\n*L\n130#1:445\n*E\n"})
    public static final class c<T> implements x00.a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f8509b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<ya0.a> f8510c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(za0.a aVar, x00.a<? extends ya0.a> aVar2) {
            this.f8509b = aVar;
            this.f8510c = aVar2;
        }

        @Override // x00.a
        public final T invoke() {
            b bVar = b.this;
            za0.a aVar = this.f8509b;
            x00.a<ya0.a> aVar2 = this.f8510c;
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) bVar.u(o0.d(Object.class), aVar, aVar2);
        }
    }

    public /* synthetic */ b(za0.a aVar, String str, boolean z11, za0.d dVar, na0.a aVar2, int i11, v vVar) {
        this(aVar, str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : dVar, aVar2);
    }

    public static /* synthetic */ Object L(b bVar, h10.d dVar, za0.a aVar, ya0.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return bVar.K(dVar, aVar, aVar2);
    }

    public static /* synthetic */ c0 P(b bVar, za0.a aVar, LazyThreadSafetyMode mode, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        g0.p(mode, "mode");
        g0.w();
        return e0.b(mode, bVar.new C0145b(aVar, aVar2));
    }

    public static /* synthetic */ c0 R(b bVar, za0.a aVar, LazyThreadSafetyMode mode, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        g0.p(mode, "mode");
        g0.w();
        return e0.b(mode, bVar.new c(aVar, aVar2));
    }

    public static /* synthetic */ Object a0(b bVar, h10.d dVar, za0.a aVar, ya0.a aVar2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return bVar.Z(dVar, aVar, aVar2);
    }

    public static final g2 e(b bVar) {
        m<ya0.a> mVar;
        bVar.f8492e.w().a("|- (-) Scope - id:'" + bVar.f8489b + '\'');
        Iterator<T> it = bVar.f8495h.iterator();
        while (it.hasNext()) {
            ((cb0.c) it.next()).a(bVar);
        }
        bVar.f8495h.clear();
        bVar.f8497j = true;
        bVar.f8494g = null;
        ThreadLocal<m<ya0.a>> threadLocal = bVar.f8496i;
        if (threadLocal != null && (mVar = threadLocal.get()) != null) {
            mVar.clear();
        }
        bVar.f8496i = null;
        bVar.f8492e.P().f(bVar);
        return g2.f100423a;
    }

    public static /* synthetic */ void h(b bVar, Object obj, za0.a aVar, List list, boolean z11, boolean z12, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        za0.a aVar2 = aVar;
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        List secondaryTypes = list;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        g0.p(secondaryTypes, "secondaryTypes");
        jb0.c cVar = jb0.c.f64013a;
        g0.w();
        cVar.j(bVar, bVar.new a(obj, aVar2, secondaryTypes, z13, z12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object k(b bVar, h10.d dVar, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return bVar.i(dVar, aVar, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object l(b bVar, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return bVar.i(o0.d(Object.class), aVar, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object w(b bVar, h10.d dVar, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return bVar.u(dVar, aVar, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object x(b bVar, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return bVar.u(o0.d(Object.class), aVar, aVar2);
    }

    @k
    public final <T> T B(@k String key) {
        g0.p(key, "key");
        T t11 = (T) this.f8492e.H(key);
        if (t11 != null) {
            return t11;
        }
        throw new MissingPropertyException("Property '" + key + "' not found");
    }

    @k
    public final <T> T C(@k String key, @k T defaultValue) {
        g0.p(key, "key");
        g0.p(defaultValue, "defaultValue");
        return (T) this.f8492e.I(key, defaultValue);
    }

    @l
    public final <T> T D(@k String key) {
        g0.p(key, "key");
        return (T) this.f8492e.H(key);
    }

    @k
    public final b E(@k String scopeID) {
        g0.p(scopeID, "scopeID");
        return q().N(scopeID);
    }

    @l
    public final za0.d F() {
        return this.f8491d;
    }

    @k
    public final za0.a G() {
        return this.f8488a;
    }

    public final /* synthetic */ <T> T H() {
        T t11 = (T) I();
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t11;
    }

    @l
    public final Object I() {
        return this.f8494g;
    }

    @g
    public final <T> T K(@k h10.d<?> clazz, @l za0.a aVar, @l ya0.a aVar2) {
        g0.p(clazz, "clazz");
        return (T) Z(clazz, aVar, aVar2);
    }

    @k
    public final na0.a M() {
        return this.f8492e;
    }

    public final /* synthetic */ <T> c0<T> O(za0.a aVar, LazyThreadSafetyMode mode, x00.a<? extends ya0.a> aVar2) {
        g0.p(mode, "mode");
        g0.w();
        return e0.b(mode, new C0145b(aVar, aVar2));
    }

    public final /* synthetic */ <T> c0<T> Q(za0.a aVar, LazyThreadSafetyMode mode, x00.a<? extends ya0.a> aVar2) {
        g0.p(mode, "mode");
        g0.w();
        return e0.b(mode, new c(aVar, aVar2));
    }

    public final boolean S() {
        return !o();
    }

    public final boolean T() {
        return this.f8490c;
    }

    public final void U(@k b... scopes) {
        g0.p(scopes, "scopes");
        if (this.f8490c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        this.f8493f.addAll(0, a0.dz(scopes));
    }

    public final void V(h10.d<?> dVar, long j11) {
        this.f8492e.w().b(Level.DEBUG, "|- '" + fb0.b.a(dVar) + "' in " + db0.a.a(j11) + " ms");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r8 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(h10.d<?> r7, za0.a r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            r1 = 39
            if (r8 == 0) goto L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " with qualifier '"
            r2.append(r3)
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            if (r8 != 0) goto L1d
        L1c:
            r8 = r0
        L1d:
            boolean r2 = r6.f8490c
            if (r2 == 0) goto L22
            goto L38
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " - scope:'"
            r0.append(r2)
            java.lang.String r2 = r6.f8489b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L38:
            na0.a r2 = r6.f8492e
            ua0.b r2 = r2.w()
            org.koin.core.logger.Level r3 = org.koin.core.logger.Level.DEBUG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "|- '"
            r4.append(r5)
            java.lang.String r7 = fb0.b.a(r7)
            r4.append(r7)
            r4.append(r1)
            r4.append(r8)
            r4.append(r0)
            java.lang.String r7 = "..."
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r2.b(r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb0.b.W(h10.d, za0.a):void");
    }

    public final m<ya0.a> X(ya0.a aVar) {
        m<ya0.a> t11 = t();
        t11.addFirst(aVar);
        return t11;
    }

    public final void Y(@k cb0.c callback) {
        g0.p(callback, "callback");
        this.f8495h.add(callback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T Z(h10.d<?> r9, za0.a r10, ya0.a r11) {
        /*
            r8 = this;
            na0.a r0 = r8.f8492e
            ua0.b r0 = r0.w()
            org.koin.core.logger.Level r1 = org.koin.core.logger.Level.DEBUG
            org.koin.core.logger.Level r0 = r0.d()
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto Lc0
            java.lang.String r0 = ""
            r2 = 39
            if (r10 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " with qualifier '"
            r3.append(r4)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L2f
        L2e:
            r3 = r0
        L2f:
            boolean r4 = r8.f8490c
            if (r4 == 0) goto L34
            goto L4a
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = " - scope:'"
            r0.append(r4)
            java.lang.String r4 = r8.f8489b
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L4a:
            na0.a r4 = r8.f8492e
            ua0.b r4 = r4.w()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "|- '"
            r5.append(r6)
            java.lang.String r7 = fb0.b.a(r9)
            r5.append(r7)
            r5.append(r2)
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = "..."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.b(r1, r0)
            kotlin.time.n$b r0 = kotlin.time.n.b.f67794b
            long r2 = r0.b()
            java.lang.Object r10 = r8.c0(r10, r9, r11)
            w30.s r11 = new w30.s
            long r2 = kotlin.time.n.b.a.i(r2)
            r0 = 0
            r11.<init>(r10, r2, r0)
            long r2 = r11.e()
            na0.a r10 = r8.f8492e
            ua0.b r10 = r10.w()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r9 = fb0.b.a(r9)
            r0.append(r9)
            java.lang.String r9 = "' in "
            r0.append(r9)
            double r2 = db0.a.a(r2)
            r0.append(r2)
            java.lang.String r9 = " ms"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.b(r1, r9)
            java.lang.Object r9 = r11.f()
            return r9
        Lc0:
            java.lang.Object r9 = r8.c0(r10, r9, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cb0.b.Z(h10.d, za0.a, ya0.a):java.lang.Object");
    }

    public final void b() {
        if (this.f8497j) {
            throw new ClosedScopeException("Scope '" + this.f8489b + "' is closed");
        }
    }

    public final <T> T b0(ta0.d dVar) {
        return (T) this.f8492e.L().a(this, dVar);
    }

    public final void c(m<ya0.a> mVar) {
        mVar.s();
        if (mVar.isEmpty()) {
            ThreadLocal<m<ya0.a>> threadLocal = this.f8496i;
            if (threadLocal != null) {
                threadLocal.remove();
            }
            this.f8496i = null;
        }
    }

    public final <T> T c0(za0.a aVar, h10.d<?> dVar, ya0.a aVar2) {
        if (!this.f8497j) {
            return (T) f0(aVar2, new ta0.d(this.f8492e.w(), this, dVar, aVar, aVar2));
        }
        throw new ClosedScopeException("Scope '" + this.f8489b + "' is closed");
    }

    public final void d() {
        jb0.c.f64013a.j(this, new x00.a() { // from class: cb0.a
            @Override // x00.a
            public final Object invoke() {
                g2 e11;
                e11 = b.e(b.this);
                return e11;
            }
        });
    }

    public final void d0(@l ThreadLocal<m<ya0.a>> threadLocal) {
        this.f8496i = threadLocal;
    }

    public final void e0(@l Object obj) {
        this.f8494g = obj;
    }

    public final void f(@k List<b> links) {
        g0.p(links, "links");
        this.f8493f.addAll(links);
    }

    public final <T> T f0(ya0.a aVar, ta0.d dVar) {
        if (aVar == null) {
            return (T) b0(dVar);
        }
        ua0.b w11 = this.f8492e.w();
        Level level = Level.DEBUG;
        if (w11.d().compareTo(level) <= 0) {
            w11.b(level, "| >> parameters " + aVar);
        }
        m<ya0.a> X = X(aVar);
        try {
            return (T) b0(dVar);
        } finally {
            this.f8492e.w().a("| << parameters");
            c(X);
        }
    }

    public final /* synthetic */ <T> void g(T t11, za0.a aVar, List<? extends h10.d<?>> secondaryTypes, boolean z11, boolean z12) {
        g0.p(secondaryTypes, "secondaryTypes");
        jb0.c cVar = jb0.c.f64013a;
        g0.w();
        cVar.j(this, new a(t11, aVar, secondaryTypes, z11, z12));
    }

    public final void g0(@k b... scopes) {
        g0.p(scopes, "scopes");
        if (this.f8490c) {
            throw new IllegalStateException("Can't remove scope link to a root scope");
        }
        m0.M0(this.f8493f, scopes);
    }

    public final <T> T i(@k h10.d<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return (T) Z(clazz, aVar, aVar2 != null ? aVar2.invoke() : null);
    }

    public final /* synthetic */ <T> T j(za0.a aVar, x00.a<? extends ya0.a> aVar2) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) i(o0.d(Object.class), aVar, aVar2);
    }

    public final /* synthetic */ <T> List<T> m() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return n(o0.d(Object.class));
    }

    @k
    public final <T> List<T> n(@k h10.d<?> clazz) {
        g0.p(clazz, "clazz");
        List<T> h11 = this.f8492e.u().h(clazz, new ta0.d(this.f8492e.w(), this, clazz, null, null, 24, null));
        ArrayList<b> arrayList = this.f8493f;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList2, ((b) it.next()).n(clazz));
        }
        return r0.I4(h11, arrayList2);
    }

    public final boolean o() {
        return this.f8497j;
    }

    @k
    public final String p() {
        return this.f8489b;
    }

    @k
    public final na0.a q() {
        return this.f8492e;
    }

    @k
    public final ArrayList<b> r() {
        return this.f8493f;
    }

    @k
    public final ua0.b s() {
        return this.f8492e.w();
    }

    public final m<ya0.a> t() {
        m<ya0.a> mVar;
        ThreadLocal<m<ya0.a>> threadLocal = this.f8496i;
        if (threadLocal != null && (mVar = threadLocal.get()) != null) {
            return mVar;
        }
        m<ya0.a> mVar2 = new m<>();
        ThreadLocal<m<ya0.a>> threadLocal2 = new ThreadLocal<>();
        this.f8496i = threadLocal2;
        threadLocal2.set(mVar2);
        return mVar2;
    }

    @k
    public String toString() {
        return "['" + this.f8489b + "']";
    }

    @l
    public final <T> T u(@k h10.d<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        try {
            return (T) i(clazz, aVar, aVar2);
        } catch (ClosedScopeException unused) {
            this.f8492e.w().a("* Scope closed - no instance found for " + fb0.b.a(clazz) + " on scope " + this);
            return null;
        } catch (MissingScopeValueException unused2) {
            this.f8492e.w().a("* No Scoped value found for type '" + fb0.b.a(clazz) + "' on scope '" + this + '\'');
            return null;
        } catch (NoDefinitionFoundException unused3) {
            this.f8492e.w().a("* No instance found for type '" + fb0.b.a(clazz) + "' on scope '" + this + '\'');
            return null;
        }
    }

    public final /* synthetic */ <T> T v(za0.a aVar, x00.a<? extends ya0.a> aVar2) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) u(o0.d(Object.class), aVar, aVar2);
    }

    @l
    public final <T> T y(@k ta0.d ctx) {
        g0.p(ctx, "ctx");
        try {
            return (T) K(ctx.a(), ctx.e(), ctx.d());
        } catch (ClosedScopeException unused) {
            this.f8492e.w().a("* Scope closed - no instance found for " + fb0.b.a(ctx.a()) + " on scope " + this);
            return null;
        } catch (NoDefinitionFoundException unused2) {
            this.f8492e.w().a("* No instance found for type '" + fb0.b.a(ctx.a()) + "' on scope '" + this + '\'');
            return null;
        }
    }

    @l
    public final ThreadLocal<m<ya0.a>> z() {
        return this.f8496i;
    }

    public b(@k za0.a scopeQualifier, @k String id2, boolean z11, @l za0.d dVar, @k na0.a _koin) {
        g0.p(scopeQualifier, "scopeQualifier");
        g0.p(id2, "id");
        g0.p(_koin, "_koin");
        this.f8488a = scopeQualifier;
        this.f8489b = id2;
        this.f8490c = z11;
        this.f8491d = dVar;
        this.f8492e = _koin;
        this.f8493f = new ArrayList<>();
        this.f8495h = new LinkedHashSet<>();
    }

    @g
    public static /* synthetic */ void A() {
    }

    @g
    public static /* synthetic */ void J() {
    }

    @v0
    public static /* synthetic */ void N() {
    }
}
