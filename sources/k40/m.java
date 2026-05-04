package k40;

import a00.r0;
import c40.k1;
import c40.y1;
import com.xiaomi.mipush.sdk.MiPushClient;
import h40.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k40.d;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import yz.g2;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n426#4,9:909\n435#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
@v0
/* loaded from: classes8.dex */
public class m<R> implements c40.m, d<R>, o<R> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65828f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f65829a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public List<m<R>.a> f65830b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Object f65831c;

    /* renamed from: d, reason: collision with root package name */
    public int f65832d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public Object f65833e;
    private volatile /* synthetic */ Object state$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,904:1\n1#2:905\n*E\n"})
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @m80.k
        public final Object f65834a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final x00.q<Object, n<?>, Object, g2> f65835b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final x00.q<Object, Object, Object, Object> f65836c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final Object f65837d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final Object f65838e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        @w00.g
        public final x00.q<n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> f65839f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        @w00.g
        public Object f65840g;

        /* renamed from: h, reason: collision with root package name */
        @w00.g
        public int f65841h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k Object obj, @m80.k x00.q<Object, ? super n<?>, Object, g2> qVar, @m80.k x00.q<Object, Object, Object, ? extends Object> qVar2, @m80.l Object obj2, @m80.k Object obj3, @m80.l x00.q<? super n<?>, Object, Object, ? extends x00.q<? super Throwable, Object, ? super kotlin.coroutines.d, g2>> qVar3) {
            this.f65834a = obj;
            this.f65835b = qVar;
            this.f65836c = qVar2;
            this.f65837d = obj2;
            this.f65838e = obj3;
            this.f65839f = qVar3;
        }

        @m80.l
        public final x00.q<Throwable, Object, kotlin.coroutines.d, g2> a(@m80.k n<?> nVar, @m80.l Object obj) {
            x00.q<n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> qVar = this.f65839f;
            if (qVar != null) {
                return qVar.invoke(nVar, this.f65837d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f65840g;
            m<R> mVar = m.this;
            if (obj instanceof h40.u0) {
                ((h40.u0) obj).z(this.f65841h, null, mVar.getContext());
                return;
            }
            k1 k1Var = obj instanceof k1 ? (k1) obj : null;
            if (k1Var != null) {
                k1Var.dispose();
            }
        }

        @m80.l
        public final Object c(@m80.l Object obj, @m80.k j00.c<? super R> cVar) {
            Object obj2 = this.f65838e;
            if (this.f65837d == p.l()) {
                g0.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((x00.l) obj2).invoke(cVar);
            }
            g0.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((x00.p) obj2).invoke(obj, cVar);
        }

        @m80.l
        public final Object d(@m80.l Object obj) {
            return this.f65836c.invoke(this.f65834a, this.f65837d, obj);
        }

        public final boolean e(@m80.k m<R> mVar) {
            x0 x0Var;
            this.f65835b.invoke(this.f65834a, mVar, this.f65837d);
            Object obj = mVar.f65833e;
            x0Var = p.f65858i;
            return obj == x0Var;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {453, 456}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f65843a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65844b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<R> f65845c;

        /* renamed from: d, reason: collision with root package name */
        public int f65846d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m<R> mVar, j00.c<? super b> cVar) {
            super(cVar);
            this.f65845c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f65844b = obj;
            this.f65846d |= Integer.MIN_VALUE;
            return this.f65845c.y(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {729}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f65847a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<R> f65848b;

        /* renamed from: c, reason: collision with root package name */
        public int f65849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m<R> mVar, j00.c<? super c> cVar) {
            super(cVar);
            this.f65848b = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f65847a = obj;
            this.f65849c |= Integer.MIN_VALUE;
            return this.f65848b.G(null, null, this);
        }
    }

    public m(@m80.k kotlin.coroutines.d dVar) {
        x0 x0Var;
        x0 x0Var2;
        this.f65829a = dVar;
        x0Var = p.f65855f;
        this.state$volatile = x0Var;
        this.f65830b = new ArrayList(2);
        this.f65832d = -1;
        x0Var2 = p.f65858i;
        this.f65833e = x0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D() {
        x0 x0Var;
        Object obj = f65828f.get(this);
        x0Var = p.f65857h;
        return obj == x0Var;
    }

    private final boolean E() {
        return f65828f.get(this) instanceof a;
    }

    private final /* synthetic */ void F(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public static /* synthetic */ void I(m mVar, a aVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mVar.H(aVar, z11);
    }

    @v0
    public static /* synthetic */ <R> Object x(m<R> mVar, j00.c<? super R> cVar) {
        return mVar.E() ? mVar.v(cVar) : mVar.y(cVar);
    }

    public final boolean A() {
        x0 x0Var;
        Object obj = f65828f.get(this);
        x0Var = p.f65855f;
        return obj == x0Var || (obj instanceof List);
    }

    public final /* synthetic */ Object B() {
        return this.state$volatile;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(k40.m<R>.a r5, java.lang.Object r6, j00.c<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof k40.m.c
            if (r0 == 0) goto L13
            r0 = r7
            k40.m$c r0 = (k40.m.c) r0
            int r1 = r0.f65849c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65849c = r1
            goto L18
        L13:
            k40.m$c r0 = new k40.m$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f65847a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65849c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            return r7
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r7)
            java.lang.Object r6 = r5.d(r6)
            r0.f65849c = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.m.G(k40.m$a, java.lang.Object, j00.c):java.lang.Object");
    }

    @w00.j(name = MiPushClient.COMMAND_REGISTER)
    public final void H(@m80.k m<R>.a aVar, boolean z11) {
        if (f65828f.get(this) instanceof a) {
            return;
        }
        if (!z11) {
            t(aVar.f65834a);
        }
        if (!aVar.e(this)) {
            f65828f.set(this, aVar);
            return;
        }
        if (!z11) {
            List<m<R>.a> list = this.f65830b;
            g0.m(list);
            list.add(aVar);
        }
        aVar.f65840g = this.f65831c;
        aVar.f65841h = this.f65832d;
        this.f65831c = null;
        this.f65832d = -1;
    }

    public final void J(Object obj) {
        m<R>.a z11 = z(obj);
        g0.m(z11);
        z11.f65840g = null;
        z11.f65841h = -1;
        H(z11, true);
    }

    public final /* synthetic */ void K(Object obj) {
        this.state$volatile = obj;
    }

    @m80.k
    public final TrySelectDetailedResult L(@m80.k Object obj, @m80.l Object obj2) {
        TrySelectDetailedResult d11;
        d11 = p.d(M(obj, obj2));
        return d11;
    }

    public final int M(Object obj, Object obj2) {
        boolean o11;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        while (true) {
            Object obj3 = f65828f.get(this);
            if (obj3 instanceof c40.n) {
                m<R>.a z11 = z(obj);
                if (z11 == null) {
                    continue;
                } else {
                    x00.q<Throwable, Object, kotlin.coroutines.d, g2> a11 = z11.a(this, obj2);
                    if (androidx.concurrent.futures.a.a(f65828f, this, obj3, z11)) {
                        this.f65833e = obj2;
                        o11 = p.o((c40.n) obj3, a11);
                        if (o11) {
                            return 0;
                        }
                        x0Var = p.f65858i;
                        this.f65833e = x0Var;
                        return 2;
                    }
                }
            } else {
                x0Var2 = p.f65856g;
                if (g0.g(obj3, x0Var2) || (obj3 instanceof a)) {
                    return 3;
                }
                x0Var3 = p.f65857h;
                if (g0.g(obj3, x0Var3)) {
                    return 2;
                }
                x0Var4 = p.f65855f;
                if (g0.g(obj3, x0Var4)) {
                    if (androidx.concurrent.futures.a.a(f65828f, this, obj3, a00.g0.l(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.a.a(f65828f, this, obj3, r0.J4((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    public final /* synthetic */ void N(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r0 = r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.b.l()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        l00.f.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.b.l()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return yz.g2.f100423a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            c40.p r0 = new c40.p
            j00.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.y()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
        L11:
            java.lang.Object r2 = r1.get(r5)
            h40.x0 r3 = k40.p.j()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = o()
            boolean r2 = androidx.concurrent.futures.a.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            c40.r.c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = o()
            h40.x0 r4 = k40.p.j()
            boolean r3 = androidx.concurrent.futures.a.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            r(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof k40.m.a
            if (r1 == 0) goto L79
            yz.g2 r1 = yz.g2.f100423a
            k40.m$a r2 = (k40.m.a) r2
            java.lang.Object r3 = n(r5)
            x00.q r2 = r2.a(r5, r3)
            r0.A(r1, r2)
        L62:
            java.lang.Object r0 = r0.F()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            if (r0 != r1) goto L6f
            l00.f.c(r6)
        L6f:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
            if (r0 != r6) goto L76
            return r0
        L76:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.m.O(j00.c):java.lang.Object");
    }

    @Override // c40.m
    public void a(@m80.l Throwable th2) {
        Object obj;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65828f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            x0Var = p.f65856g;
            if (obj == x0Var) {
                return;
            } else {
                x0Var2 = p.f65857h;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, x0Var2));
        List<m<R>.a> list = this.f65830b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        x0Var3 = p.f65858i;
        this.f65833e = x0Var3;
        this.f65830b = null;
    }

    @Override // c40.z3
    public void b(@m80.k h40.u0<?> u0Var, int i11) {
        this.f65831c = u0Var;
        this.f65832d = i11;
    }

    @Override // k40.d
    public <P, Q> void c(@m80.k j<? super P, ? extends Q> jVar, P p11, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar) {
        I(this, new a(jVar.d(), jVar.c(), jVar.b(), p11, pVar, jVar.a()), false, 1, null);
    }

    @Override // k40.d
    public <P, Q> void d(@m80.k j<? super P, ? extends Q> jVar, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar) {
        d.a.a(this, jVar, pVar);
    }

    @Override // k40.n
    public void e(@m80.l Object obj) {
        this.f65833e = obj;
    }

    @Override // k40.d
    public <Q> void f(@m80.k h<? extends Q> hVar, @m80.k x00.p<? super Q, ? super j00.c<? super R>, ? extends Object> pVar) {
        I(this, new a(hVar.d(), hVar.c(), hVar.b(), null, pVar, hVar.a()), false, 1, null);
    }

    @Override // k40.n
    public void g(@m80.k k1 k1Var) {
        this.f65831c = k1Var;
    }

    @Override // k40.n
    @m80.k
    public kotlin.coroutines.d getContext() {
        return this.f65829a;
    }

    @Override // k40.n
    public boolean h(@m80.k Object obj, @m80.l Object obj2) {
        return M(obj, obj2) == 0;
    }

    @Override // k40.d
    @o00.i
    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @w0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void i(long j11, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar) {
        d.a.b(this, j11, lVar);
    }

    @Override // k40.d
    public void j(@m80.k f fVar, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar) {
        I(this, new a(fVar.d(), fVar.c(), fVar.b(), p.l(), lVar, fVar.a()), false, 1, null);
    }

    public final void t(Object obj) {
        List<m<R>.a> list = this.f65830b;
        g0.m(list);
        List<m<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f65834a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    public final void u(m<R>.a aVar) {
        x0 x0Var;
        x0 x0Var2;
        List<m<R>.a> list = this.f65830b;
        if (list == null) {
            return;
        }
        for (m<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f65828f;
        x0Var = p.f65856g;
        atomicReferenceFieldUpdater.set(this, x0Var);
        x0Var2 = p.f65858i;
        this.f65833e = x0Var2;
        this.f65830b = null;
    }

    public final Object v(j00.c<? super R> cVar) {
        Object obj = f65828f.get(this);
        g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        m<R>.a aVar = (a) obj;
        Object obj2 = this.f65833e;
        u(aVar);
        return aVar.c(aVar.d(obj2), cVar);
    }

    @m80.l
    @v0
    public Object w(@m80.k j00.c<? super R> cVar) {
        return x(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(j00.c<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k40.m.b
            if (r0 == 0) goto L13
            r0 = r6
            k40.m$b r0 = (k40.m.b) r0
            int r1 = r0.f65846d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65846d = r1
            goto L18
        L13:
            k40.m$b r0 = new k40.m$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f65844b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65846d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f65843a
            k40.m r2 = (k40.m) r2
            kotlin.e.n(r6)
            goto L4b
        L3c:
            kotlin.e.n(r6)
            r0.f65843a = r5
            r0.f65846d = r4
            java.lang.Object r6 = r5.O(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f65843a = r6
            r0.f65846d = r3
            java.lang.Object r6 = r2.v(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.m.y(j00.c):java.lang.Object");
    }

    public final m<R>.a z(Object obj) {
        List<m<R>.a> list = this.f65830b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f65834a == obj) {
                obj2 = next;
                break;
            }
        }
        m<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }
}
