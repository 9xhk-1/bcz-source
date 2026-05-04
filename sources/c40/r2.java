package c40;

import c40.l2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.jvm.internal.u0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n29#3:1585\n29#3:1696\n29#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n23#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n273#8,3:1599\n276#8,3:1613\n273#8,3:1620\n276#8,3:1634\n273#8,6:1639\n426#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
/* loaded from: classes8.dex */
public class r2 implements l2, w, b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7927a = AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7928b = AtomicReferenceFieldUpdater.newUpdater(r2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class a<T> extends p<T> {

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final r2 f7929i;

        public a(@m80.k j00.c<? super T> cVar, @m80.k r2 r2Var) {
            super(cVar, 1);
            this.f7929i = r2Var;
        }

        @Override // c40.p
        @m80.k
        public Throwable D(@m80.k l2 l2Var) {
            Throwable e11;
            Object f12 = this.f7929i.f1();
            return (!(f12 instanceof c) || (e11 = ((c) f12).e()) == null) ? f12 instanceof c0 ? ((c0) f12).f7827a : l2Var.y0() : e11;
        }

        @Override // c40.p
        @m80.k
        public String V() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends q2 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final r2 f7930e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final c f7931f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final v f7932g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public final Object f7933h;

        public b(@m80.k r2 r2Var, @m80.k c cVar, @m80.k v vVar, @m80.l Object obj) {
            this.f7930e = r2Var;
            this.f7931f = cVar;
            this.f7932g = vVar;
            this.f7933h = obj;
        }

        @Override // c40.q2
        public boolean C() {
            return false;
        }

        @Override // c40.q2
        public void D(@m80.l Throwable th2) {
            this.f7930e.J0(this.f7931f, this.f7932g, this.f7933h);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    public static final class c implements e2 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f7934b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f7935c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f7936d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final w2 f7937a;

        public c(@m80.k w2 w2Var, boolean z11, @m80.l Throwable th2) {
            this.f7937a = w2Var;
            this._isCompleting$volatile = z11 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        @Override // c40.e2
        @m80.k
        public w2 a() {
            return this.f7937a;
        }

        public final void b(@m80.k Throwable th2) {
            Throwable e11 = e();
            if (e11 == null) {
                r(th2);
                return;
            }
            if (th2 == e11) {
                return;
            }
            Object d11 = d();
            if (d11 == null) {
                q(th2);
                return;
            }
            if (d11 instanceof Throwable) {
                if (th2 == d11) {
                    return;
                }
                ArrayList<Throwable> c11 = c();
                c11.add(d11);
                c11.add(th2);
                q(c11);
                return;
            }
            if (d11 instanceof ArrayList) {
                ((ArrayList) d11).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + d11).toString());
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Object d() {
            return f7936d.get(this);
        }

        @m80.l
        public final Throwable e() {
            return (Throwable) f7935c.get(this);
        }

        public final /* synthetic */ Object f() {
            return this._exceptionsHolder$volatile;
        }

        public final /* synthetic */ int h() {
            return this._isCompleting$volatile;
        }

        @Override // c40.e2
        public boolean isActive() {
            return e() == null;
        }

        public final /* synthetic */ Object j() {
            return this._rootCause$volatile;
        }

        public final boolean l() {
            return e() != null;
        }

        public final boolean m() {
            return f7934b.get(this) == 1;
        }

        public final boolean n() {
            h40.x0 x0Var;
            Object d11 = d();
            x0Var = s2.f7969h;
            return d11 == x0Var;
        }

        @m80.k
        public final List<Throwable> o(@m80.l Throwable th2) {
            ArrayList<Throwable> arrayList;
            h40.x0 x0Var;
            Object d11 = d();
            if (d11 == null) {
                arrayList = c();
            } else if (d11 instanceof Throwable) {
                ArrayList<Throwable> c11 = c();
                c11.add(d11);
                arrayList = c11;
            } else {
                if (!(d11 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d11).toString());
                }
                arrayList = (ArrayList) d11;
            }
            Throwable e11 = e();
            if (e11 != null) {
                arrayList.add(0, e11);
            }
            if (th2 != null && !kotlin.jvm.internal.g0.g(th2, e11)) {
                arrayList.add(th2);
            }
            x0Var = s2.f7969h;
            q(x0Var);
            return arrayList;
        }

        public final void p(boolean z11) {
            f7934b.set(this, z11 ? 1 : 0);
        }

        public final void q(Object obj) {
            f7936d.set(this, obj);
        }

        public final void r(@m80.l Throwable th2) {
            f7935c.set(this, th2);
        }

        public final /* synthetic */ void s(Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        public final /* synthetic */ void t(int i11) {
            this._isCompleting$volatile = i11;
        }

        @m80.k
        public String toString() {
            return "Finishing[cancelling=" + l() + ", completing=" + m() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + l50.b.f69930l;
        }

        public final /* synthetic */ void u(Object obj) {
            this._rootCause$volatile = obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d extends q2 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final k40.n<?> f7938e;

        public d(@m80.k k40.n<?> nVar) {
            this.f7938e = nVar;
        }

        @Override // c40.q2
        public boolean C() {
            return false;
        }

        @Override // c40.q2
        public void D(@m80.l Throwable th2) {
            Object f12 = r2.this.f1();
            if (!(f12 instanceof c0)) {
                f12 = s2.h(f12);
            }
            this.f7938e.h(r2.this, f12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends q2 {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final k40.n<?> f7940e;

        public e(@m80.k k40.n<?> nVar) {
            this.f7940e = nVar;
        }

        @Override // c40.q2
        public boolean C() {
            return false;
        }

        @Override // c40.q2
        public void D(@m80.l Throwable th2) {
            this.f7940e.h(r2.this, yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {1003, 1005}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.u0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
    public static final class f extends RestrictedSuspendLambda implements x00.p<q30.o<? super l2>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f7942a;

        /* renamed from: b, reason: collision with root package name */
        public Object f7943b;

        /* renamed from: c, reason: collision with root package name */
        public int f7944c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f7945d;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            f fVar = r2.this.new f(cVar);
            fVar.f7945d = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
        
            if (r4.b(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        
            if (r6.b(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f7944c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f7943b
                h40.d0 r1 = (h40.d0) r1
                java.lang.Object r3 = r5.f7942a
                h40.b0 r3 = (h40.b0) r3
                java.lang.Object r4 = r5.f7945d
                q30.o r4 = (q30.o) r4
                kotlin.e.n(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                kotlin.e.n(r6)
                goto L86
            L2a:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f7945d
                q30.o r6 = (q30.o) r6
                c40.r2 r1 = c40.r2.this
                java.lang.Object r1 = r1.f1()
                boolean r4 = r1 instanceof c40.v
                if (r4 == 0) goto L48
                c40.v r1 = (c40.v) r1
                c40.w r1 = r1.f7991e
                r5.f7944c = r3
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof c40.e2
                if (r3 == 0) goto L86
                c40.e2 r1 = (c40.e2) r1
                c40.w2 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.g0.n(r3, r4)
                h40.d0 r3 = (h40.d0) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof c40.v
                if (r6 == 0) goto L81
                r6 = r1
                c40.v r6 = (c40.v) r6
                c40.w r6 = r6.f7991e
                r5.f7945d = r4
                r5.f7942a = r3
                r5.f7943b = r1
                r5.f7944c = r2
                java.lang.Object r6 = r4.b(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                h40.d0 r1 = r1.k()
                goto L63
            L86:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c40.r2.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super l2> oVar, j00.c<? super yz.g2> cVar) {
            return ((f) create(oVar, cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class g extends FunctionReferenceImpl implements x00.q<r2, k40.n<?>, Object, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f7947a = new g();

        public g() {
            super(3, r2.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(r2 r2Var, k40.n<?> nVar, Object obj) {
            r2Var.D1(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ yz.g2 invoke(r2 r2Var, k40.n<?> nVar, Object obj) {
            a(r2Var, nVar, obj);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class h extends FunctionReferenceImpl implements x00.q<r2, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f7948a = new h();

        public h() {
            super(3, r2.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r2 r2Var, Object obj, Object obj2) {
            return r2Var.C1(obj, obj2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class i extends FunctionReferenceImpl implements x00.q<r2, k40.n<?>, Object, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f7949a = new i();

        public i() {
            super(3, r2.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(r2 r2Var, k40.n<?> nVar, Object obj) {
            r2Var.J1(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ yz.g2 invoke(r2 r2Var, k40.n<?> nVar, Object obj) {
            a(r2Var, nVar, obj);
            return yz.g2.f100423a;
        }
    }

    public r2(boolean z11) {
        this._state$volatile = z11 ? s2.f7971j : s2.f7970i;
    }

    private final /* synthetic */ void M1(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void N1(Object obj) {
        this._state$volatile = obj;
    }

    public static /* synthetic */ JobCancellationException R0(r2 r2Var, String str, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if (str == null) {
            str = r2Var.t0();
        }
        return new JobCancellationException(str, th2, r2Var);
    }

    public static /* synthetic */ CancellationException R1(r2 r2Var, Throwable th2, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        return r2Var.Q1(th2, str);
    }

    private final /* synthetic */ Object g1() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object i1() {
        return this._state$volatile;
    }

    public final void A1(w2 w2Var, Throwable th2) {
        w2Var.f(1);
        Object j11 = w2Var.j();
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (h40.d0 d0Var = (h40.d0) j11; !kotlin.jvm.internal.g0.g(d0Var, w2Var); d0Var = d0Var.k()) {
            if (d0Var instanceof q2) {
                try {
                    ((q2) d0Var).D(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        yz.r.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d0Var + " for " + this, th3);
                        yz.g2 g2Var = yz.g2.f100423a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            l1(completionHandlerException);
        }
    }

    public final void B1(w2 w2Var, Throwable th2, x00.l<? super q2, Boolean> lVar) {
        Object j11 = w2Var.j();
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (h40.d0 d0Var = (h40.d0) j11; !kotlin.jvm.internal.g0.g(d0Var, w2Var); d0Var = d0Var.k()) {
            if ((d0Var instanceof q2) && lVar.invoke(d0Var).booleanValue()) {
                try {
                    ((q2) d0Var).D(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        yz.r.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d0Var + " for " + this, th3);
                        yz.g2 g2Var = yz.g2.f100423a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            l1(completionHandlerException);
        }
    }

    @Override // c40.l2
    @m80.k
    public final q30.m<l2> C() {
        return q30.q.b(new f(null));
    }

    @Override // c40.w
    public final void C0(@m80.k b3 b3Var) {
        n0(b3Var);
    }

    public final Object C1(Object obj, Object obj2) {
        if (obj2 instanceof c0) {
            throw ((c0) obj2).f7827a;
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // c40.b3
    @m80.k
    public CancellationException D0() {
        CancellationException cancellationException;
        Object f12 = f1();
        if (f12 instanceof c) {
            cancellationException = ((c) f12).e();
        } else if (f12 instanceof c0) {
            cancellationException = ((c0) f12).f7827a;
        } else {
            if (f12 instanceof e2) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + f12).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException("Parent job is " + P1(f12), cancellationException, this);
    }

    public final void D1(k40.n<?> nVar, Object obj) {
        Object f12;
        do {
            f12 = f1();
            if (!(f12 instanceof e2)) {
                if (!(f12 instanceof c0)) {
                    f12 = s2.h(f12);
                }
                nVar.e(f12);
                return;
            }
        } while (O1(f12) < 0);
        nVar.g(p2.B(this, false, new d(nVar), 1, null));
    }

    @Override // c40.l2
    @m80.k
    public final k1 G0(boolean z11, boolean z12, @m80.k x00.l<? super Throwable, yz.g2> lVar) {
        return n1(z12, z11 ? new j2(lVar) : new k2(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [c40.d2] */
    public final void H1(n1 n1Var) {
        w2 w2Var = new w2();
        if (!n1Var.isActive()) {
            w2Var = new d2(w2Var);
        }
        androidx.concurrent.futures.a.a(f7927a, this, n1Var, w2Var);
    }

    public final void I0(e2 e2Var, Object obj) {
        u e12 = e1();
        if (e12 != null) {
            e12.dispose();
            L1(y2.f8014a);
        }
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th2 = c0Var != null ? c0Var.f7827a : null;
        if (!(e2Var instanceof q2)) {
            w2 a11 = e2Var.a();
            if (a11 != null) {
                A1(a11, th2);
                return;
            }
            return;
        }
        try {
            ((q2) e2Var).D(th2);
        } catch (Throwable th3) {
            l1(new CompletionHandlerException("Exception in completion handler " + e2Var + " for " + this, th3));
        }
    }

    public final void I1(q2 q2Var) {
        q2Var.d(new w2());
        androidx.concurrent.futures.a.a(f7927a, this, q2Var, q2Var.k());
    }

    public final void J0(c cVar, v vVar, Object obj) {
        v y12 = y1(vVar);
        if (y12 == null || !Y1(cVar, y12, obj)) {
            cVar.a().f(2);
            v y13 = y1(vVar);
            if (y13 == null || !Y1(cVar, y13, obj)) {
                e0(S0(cVar, obj));
            }
        }
    }

    public final void J1(k40.n<?> nVar, Object obj) {
        if (r1()) {
            nVar.g(p2.B(this, false, new e(nVar), 1, null));
        } else {
            nVar.e(yz.g2.f100423a);
        }
    }

    @Override // c40.l2
    @m80.l
    public final Object K0(@m80.k j00.c<? super yz.g2> cVar) {
        if (r1()) {
            Object s12 = s1(cVar);
            return s12 == kotlin.coroutines.intrinsics.b.l() ? s12 : yz.g2.f100423a;
        }
        n2.z(cVar.getContext());
        return yz.g2.f100423a;
    }

    public final void K1(@m80.k q2 q2Var) {
        Object f12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var;
        do {
            f12 = f1();
            if (!(f12 instanceof q2)) {
                if (!(f12 instanceof e2) || ((e2) f12).a() == null) {
                    return;
                }
                q2Var.u();
                return;
            }
            if (f12 != q2Var) {
                return;
            }
            atomicReferenceFieldUpdater = f7927a;
            n1Var = s2.f7971j;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, f12, n1Var));
    }

    public final void L1(@m80.l u uVar) {
        f7928b.set(this, uVar);
    }

    public final Throwable M0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(t0(), null, this) : th2;
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((b3) obj).D0();
    }

    @m80.k
    public final JobCancellationException O0(@m80.l String str, @m80.l Throwable th2) {
        if (str == null) {
            str = t0();
        }
        return new JobCancellationException(str, th2, this);
    }

    public final int O1(Object obj) {
        n1 n1Var;
        if (!(obj instanceof n1)) {
            if (!(obj instanceof d2)) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a(f7927a, this, obj, ((d2) obj).a())) {
                return -1;
            }
            G1();
            return 1;
        }
        if (((n1) obj).isActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7927a;
        n1Var = s2.f7971j;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, n1Var)) {
            return -1;
        }
        G1();
        return 1;
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @m80.k
    public l2 P0(@m80.k l2 l2Var) {
        return l2.a.i(this, l2Var);
    }

    public final String P1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof e2 ? ((e2) obj).isActive() ? "Active" : "New" : obj instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.l() ? "Cancelling" : cVar.m() ? "Completing" : "Active";
    }

    @m80.k
    public final CancellationException Q1(@m80.k Throwable th2, @m80.l String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = t0();
            }
            cancellationException = new JobCancellationException(str, th2, this);
        }
        return cancellationException;
    }

    public final Object S0(c cVar, Object obj) {
        boolean l11;
        Throwable X0;
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        Throwable th2 = c0Var != null ? c0Var.f7827a : null;
        synchronized (cVar) {
            l11 = cVar.l();
            List<Throwable> o11 = cVar.o(th2);
            X0 = X0(cVar, o11);
            if (X0 != null) {
                b0(X0, o11);
            }
        }
        if (X0 != null && X0 != th2) {
            obj = new c0(X0, false, 2, null);
        }
        if (X0 != null && (r0(X0) || k1(X0))) {
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((c0) obj).d();
        }
        if (!l11) {
            E1(X0);
        }
        F1(obj);
        androidx.concurrent.futures.a.a(f7927a, this, cVar, s2.g(obj));
        I0(cVar, obj);
        return obj;
    }

    @g2
    @m80.k
    public final String S1() {
        return x1() + l50.b.f69927i + P1(f1()) + l50.b.f69928j;
    }

    @m80.l
    public final Object T0() {
        Object f12 = f1();
        if (f12 instanceof e2) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (f12 instanceof c0) {
            throw ((c0) f12).f7827a;
        }
        return s2.h(f12);
    }

    public final boolean T1(e2 e2Var, Object obj) {
        if (!androidx.concurrent.futures.a.a(f7927a, this, e2Var, s2.g(obj))) {
            return false;
        }
        E1(null);
        F1(obj);
        I0(e2Var, obj);
        return true;
    }

    @m80.l
    public final Throwable U0() {
        Object f12 = f1();
        if (f12 instanceof c) {
            Throwable e11 = ((c) f12).e();
            if (e11 != null) {
                return e11;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(f12 instanceof e2)) {
            if (f12 instanceof c0) {
                return ((c0) f12).f7827a;
            }
            return null;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final boolean U1(e2 e2Var, Throwable th2) {
        w2 d12 = d1(e2Var);
        if (d12 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f7927a, this, e2Var, new c(d12, false, th2))) {
            return false;
        }
        z1(d12, th2);
        return true;
    }

    public final boolean V0() {
        Object f12 = f1();
        return (f12 instanceof c0) && ((c0) f12).a();
    }

    public final Object V1(Object obj, Object obj2) {
        h40.x0 x0Var;
        h40.x0 x0Var2;
        if (!(obj instanceof e2)) {
            x0Var2 = s2.f7962a;
            return x0Var2;
        }
        if ((!(obj instanceof n1) && !(obj instanceof q2)) || (obj instanceof v) || (obj2 instanceof c0)) {
            return W1((e2) obj, obj2);
        }
        if (T1((e2) obj, obj2)) {
            return obj2;
        }
        x0Var = s2.f7964c;
        return x0Var;
    }

    public final Throwable W0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f7827a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object W1(e2 e2Var, Object obj) {
        h40.x0 x0Var;
        h40.x0 x0Var2;
        h40.x0 x0Var3;
        w2 d12 = d1(e2Var);
        if (d12 == null) {
            x0Var3 = s2.f7964c;
            return x0Var3;
        }
        c cVar = e2Var instanceof c ? (c) e2Var : null;
        if (cVar == null) {
            cVar = new c(d12, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.m()) {
                x0Var2 = s2.f7962a;
                return x0Var2;
            }
            cVar.p(true);
            if (cVar != e2Var && !androidx.concurrent.futures.a.a(f7927a, this, e2Var, cVar)) {
                x0Var = s2.f7964c;
                return x0Var;
            }
            boolean l11 = cVar.l();
            c0 c0Var = obj instanceof c0 ? (c0) obj : null;
            if (c0Var != null) {
                cVar.b(c0Var.f7827a);
            }
            ?? e11 = l11 ? 0 : cVar.e();
            objectRef.element = e11;
            yz.g2 g2Var = yz.g2.f100423a;
            if (e11 != 0) {
                z1(d12, e11);
            }
            v y12 = y1(d12);
            if (y12 != null && Y1(cVar, y12, obj)) {
                return s2.f7963b;
            }
            d12.f(2);
            v y13 = y1(d12);
            return (y13 == null || !Y1(cVar, y13, obj)) ? S0(cVar, obj) : s2.f7963b;
        }
    }

    public final Throwable X0(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.l()) {
                return new JobCancellationException(t0(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public final boolean X1(q2 q2Var, x00.p<? super e2, ? super w2, Boolean> pVar) {
        while (true) {
            Object f12 = f1();
            if (f12 instanceof n1) {
                n1 n1Var = (n1) f12;
                if (!n1Var.isActive()) {
                    H1(n1Var);
                } else if (androidx.concurrent.futures.a.a(f7927a, this, f12, q2Var)) {
                    return true;
                }
            } else {
                if (!(f12 instanceof e2)) {
                    return false;
                }
                w2 a11 = ((e2) f12).a();
                if (a11 == null) {
                    kotlin.jvm.internal.g0.n(f12, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    I1((q2) f12);
                } else if (pVar.invoke(f12, a11).booleanValue()) {
                    return true;
                }
            }
        }
    }

    public boolean Y0() {
        return true;
    }

    public final boolean Y1(c cVar, v vVar, Object obj) {
        while (n2.B(vVar.f7991e, false, new b(this, cVar, vVar, obj)) == y2.f8014a) {
            vVar = y1(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public final k40.h<?> Z0() {
        g gVar = g.f7947a;
        kotlin.jvm.internal.g0.n(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        x00.q qVar = (x00.q) kotlin.jvm.internal.x0.q(gVar, 3);
        h hVar = h.f7948a;
        kotlin.jvm.internal.g0.n(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k40.i(this, qVar, (x00.q) kotlin.jvm.internal.x0.q(hVar, 3), null, 8, null);
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th2) {
        Throwable jobCancellationException;
        if (th2 == null || (jobCancellationException = R1(this, th2, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(t0(), null, this);
        }
        p0(jobCancellationException);
        return true;
    }

    public final void b0(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                yz.r.a(th2, th3);
            }
        }
    }

    public boolean b1() {
        return false;
    }

    @Override // c40.l2
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel(null);
    }

    public final w2 d1(e2 e2Var) {
        w2 a11 = e2Var.a();
        if (a11 != null) {
            return a11;
        }
        if (e2Var instanceof n1) {
            return new w2();
        }
        if (e2Var instanceof q2) {
            I1((q2) e2Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + e2Var).toString());
    }

    @Override // c40.l2
    public final boolean e() {
        return !(f1() instanceof e2);
    }

    @m80.l
    public final u e1() {
        return (u) f7928b.get(this);
    }

    @m80.l
    public final Object f1() {
        return f7927a.get(this);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) l2.a.d(this, r11, pVar);
    }

    @m80.l
    public final Object g0(@m80.k j00.c<Object> cVar) {
        Object f12;
        do {
            f12 = f1();
            if (!(f12 instanceof e2)) {
                if (f12 instanceof c0) {
                    throw ((c0) f12).f7827a;
                }
                return s2.h(f12);
            }
        } while (O1(f12) < 0);
        return j0(cVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) l2.a.e(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @m80.k
    public final d.c<?> getKey() {
        return l2.f7886e0;
    }

    @Override // c40.l2
    @m80.l
    public l2 getParent() {
        u e12 = e1();
        if (e12 != null) {
            return e12.getParent();
        }
        return null;
    }

    @Override // c40.l2
    public boolean isActive() {
        Object f12 = f1();
        return (f12 instanceof e2) && ((e2) f12).isActive();
    }

    @Override // c40.l2
    public final boolean isCancelled() {
        Object f12 = f1();
        if (f12 instanceof c0) {
            return true;
        }
        return (f12 instanceof c) && ((c) f12).l();
    }

    public final Object j0(j00.c<Object> cVar) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), this);
        aVar.y();
        r.a(aVar, p2.B(this, false, new d3(aVar), 1, null));
        Object F = aVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public boolean k1(@m80.k Throwable th2) {
        return false;
    }

    public final boolean l0(@m80.l Throwable th2) {
        return n0(th2);
    }

    @Override // c40.l2
    @m80.k
    public final u m0(@m80.k w wVar) {
        v vVar = new v(wVar);
        vVar.E(this);
        while (true) {
            Object f12 = f1();
            if (f12 instanceof n1) {
                n1 n1Var = (n1) f12;
                if (!n1Var.isActive()) {
                    H1(n1Var);
                } else if (androidx.concurrent.futures.a.a(f7927a, this, f12, vVar)) {
                    return vVar;
                }
            } else {
                if (!(f12 instanceof e2)) {
                    Object f13 = f1();
                    c0 c0Var = f13 instanceof c0 ? (c0) f13 : null;
                    vVar.D(c0Var != null ? c0Var.f7827a : null);
                    return y2.f8014a;
                }
                w2 a11 = ((e2) f12).a();
                if (a11 != null) {
                    if (!a11.b(vVar, 7)) {
                        boolean b11 = a11.b(vVar, 3);
                        Object f14 = f1();
                        if (f14 instanceof c) {
                            r2 = ((c) f14).e();
                        } else {
                            c0 c0Var2 = f14 instanceof c0 ? (c0) f14 : null;
                            if (c0Var2 != null) {
                                r2 = c0Var2.f7827a;
                            }
                        }
                        vVar.D(r2);
                        if (!b11) {
                            return y2.f8014a;
                        }
                    }
                    return vVar;
                }
                kotlin.jvm.internal.g0.n(f12, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                I1((q2) f12);
            }
        }
    }

    public final void m1(@m80.l l2 l2Var) {
        if (l2Var == null) {
            L1(y2.f8014a);
            return;
        }
        l2Var.start();
        u m02 = l2Var.m0(this);
        L1(m02);
        if (e()) {
            m02.dispose();
            L1(y2.f8014a);
        }
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return l2.a.h(this, cVar);
    }

    public final boolean n0(@m80.l Object obj) {
        Object obj2;
        h40.x0 x0Var;
        h40.x0 x0Var2;
        h40.x0 x0Var3;
        obj2 = s2.f7962a;
        if (b1() && (obj2 = q0(obj)) == s2.f7963b) {
            return true;
        }
        x0Var = s2.f7962a;
        if (obj2 == x0Var) {
            obj2 = u1(obj);
        }
        x0Var2 = s2.f7962a;
        if (obj2 == x0Var2 || obj2 == s2.f7963b) {
            return true;
        }
        x0Var3 = s2.f7965d;
        if (obj2 == x0Var3) {
            return false;
        }
        e0(obj2);
        return true;
    }

    @m80.k
    public final k1 n1(boolean z11, @m80.k q2 q2Var) {
        boolean z12;
        boolean b11;
        q2Var.E(this);
        while (true) {
            Object f12 = f1();
            z12 = true;
            if (!(f12 instanceof n1)) {
                if (!(f12 instanceof e2)) {
                    z12 = false;
                    break;
                }
                e2 e2Var = (e2) f12;
                w2 a11 = e2Var.a();
                if (a11 == null) {
                    kotlin.jvm.internal.g0.n(f12, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    I1((q2) f12);
                } else {
                    if (q2Var.C()) {
                        c cVar = e2Var instanceof c ? (c) e2Var : null;
                        Throwable e11 = cVar != null ? cVar.e() : null;
                        if (e11 != null) {
                            if (z11) {
                                q2Var.D(e11);
                            }
                            return y2.f8014a;
                        }
                        b11 = a11.b(q2Var, 5);
                    } else {
                        b11 = a11.b(q2Var, 1);
                    }
                    if (b11) {
                        break;
                    }
                }
            } else {
                n1 n1Var = (n1) f12;
                if (!n1Var.isActive()) {
                    H1(n1Var);
                } else if (androidx.concurrent.futures.a.a(f7927a, this, f12, q2Var)) {
                    break;
                }
            }
        }
        if (z12) {
            return q2Var;
        }
        if (z11) {
            Object f13 = f1();
            c0 c0Var = f13 instanceof c0 ? (c0) f13 : null;
            q2Var.D(c0Var != null ? c0Var.f7827a : null);
        }
        return y2.f8014a;
    }

    @Override // c40.l2
    @m80.k
    public final k40.f o0() {
        i iVar = i.f7949a;
        kotlin.jvm.internal.g0.n(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new k40.g(this, (x00.q) kotlin.jvm.internal.x0.q(iVar, 3), null, 4, null);
    }

    public final boolean o1(e2 e2Var) {
        return (e2Var instanceof c) && ((c) e2Var).l();
    }

    public void p0(@m80.k Throwable th2) {
        n0(th2);
    }

    public final boolean p1() {
        return f1() instanceof c0;
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return l2.a.j(this, dVar);
    }

    public final Object q0(Object obj) {
        h40.x0 x0Var;
        Object V1;
        h40.x0 x0Var2;
        do {
            Object f12 = f1();
            if (!(f12 instanceof e2) || ((f12 instanceof c) && ((c) f12).m())) {
                x0Var = s2.f7962a;
                return x0Var;
            }
            V1 = V1(f12, new c0(M0(obj), false, 2, null));
            x0Var2 = s2.f7964c;
        } while (V1 == x0Var2);
        return V1;
    }

    public boolean q1() {
        return false;
    }

    public final boolean r0(Throwable th2) {
        if (q1()) {
            return true;
        }
        boolean z11 = th2 instanceof CancellationException;
        u e12 = e1();
        return (e12 == null || e12 == y2.f8014a) ? z11 : e12.e(th2) || z11;
    }

    public final boolean r1() {
        Object f12;
        do {
            f12 = f1();
            if (!(f12 instanceof e2)) {
                return false;
            }
        } while (O1(f12) < 0);
        return true;
    }

    public final Object s1(j00.c<? super yz.g2> cVar) {
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        r.a(pVar, p2.B(this, false, new e3(pVar), 1, null));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F == kotlin.coroutines.intrinsics.b.l() ? F : yz.g2.f100423a;
    }

    @Override // c40.l2
    public final boolean start() {
        int O1;
        do {
            O1 = O1(f1());
            if (O1 == 0) {
                return false;
            }
        } while (O1 != 1);
        return true;
    }

    @m80.k
    public String t0() {
        return "Job was cancelled";
    }

    public final Void t1(x00.l<Object, yz.g2> lVar) {
        while (true) {
            lVar.invoke(f1());
        }
    }

    @m80.k
    public String toString() {
        return S1() + '@' + u0.b(this);
    }

    public boolean u0(@m80.k Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return n0(th2) && Y0();
    }

    public final Object u1(Object obj) {
        h40.x0 x0Var;
        h40.x0 x0Var2;
        h40.x0 x0Var3;
        h40.x0 x0Var4;
        h40.x0 x0Var5;
        h40.x0 x0Var6;
        Throwable th2 = null;
        while (true) {
            Object f12 = f1();
            if (f12 instanceof c) {
                synchronized (f12) {
                    if (((c) f12).n()) {
                        x0Var2 = s2.f7965d;
                        return x0Var2;
                    }
                    boolean l11 = ((c) f12).l();
                    if (obj != null || !l11) {
                        if (th2 == null) {
                            th2 = M0(obj);
                        }
                        ((c) f12).b(th2);
                    }
                    Throwable e11 = l11 ? null : ((c) f12).e();
                    if (e11 != null) {
                        z1(((c) f12).a(), e11);
                    }
                    x0Var = s2.f7962a;
                    return x0Var;
                }
            }
            if (!(f12 instanceof e2)) {
                x0Var3 = s2.f7965d;
                return x0Var3;
            }
            if (th2 == null) {
                th2 = M0(obj);
            }
            e2 e2Var = (e2) f12;
            if (!e2Var.isActive()) {
                Object V1 = V1(f12, new c0(th2, false, 2, null));
                x0Var5 = s2.f7962a;
                if (V1 == x0Var5) {
                    throw new IllegalStateException(("Cannot happen in " + f12).toString());
                }
                x0Var6 = s2.f7964c;
                if (V1 != x0Var6) {
                    return V1;
                }
            } else if (U1(e2Var, th2)) {
                x0Var4 = s2.f7962a;
                return x0Var4;
            }
        }
    }

    @m80.l
    public final Throwable v0() {
        Object f12 = f1();
        if (f12 instanceof e2) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return W0(f12);
    }

    public final boolean v1(@m80.l Object obj) {
        Object V1;
        h40.x0 x0Var;
        h40.x0 x0Var2;
        do {
            V1 = V1(f1(), obj);
            x0Var = s2.f7962a;
            if (V1 == x0Var) {
                return false;
            }
            if (V1 == s2.f7963b) {
                return true;
            }
            x0Var2 = s2.f7964c;
        } while (V1 == x0Var2);
        e0(V1);
        return true;
    }

    @m80.l
    public final Object w1(@m80.l Object obj) {
        Object V1;
        h40.x0 x0Var;
        h40.x0 x0Var2;
        do {
            V1 = V1(f1(), obj);
            x0Var = s2.f7962a;
            if (V1 == x0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, W0(obj));
            }
            x0Var2 = s2.f7964c;
        } while (V1 == x0Var2);
        return V1;
    }

    @m80.k
    public String x1() {
        return u0.a(this);
    }

    @Override // c40.l2
    @m80.k
    public final CancellationException y0() {
        Object f12 = f1();
        if (!(f12 instanceof c)) {
            if (f12 instanceof e2) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (f12 instanceof c0) {
                return R1(this, ((c0) f12).f7827a, null, 1, null);
            }
            return new JobCancellationException(u0.a(this) + " has completed normally", null, this);
        }
        Throwable e11 = ((c) f12).e();
        if (e11 != null) {
            CancellationException Q1 = Q1(e11, u0.a(this) + " is cancelling");
            if (Q1 != null) {
                return Q1;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final v y1(h40.d0 d0Var) {
        while (d0Var.s()) {
            d0Var = d0Var.l();
        }
        while (true) {
            d0Var = d0Var.k();
            if (!d0Var.s()) {
                if (d0Var instanceof v) {
                    return (v) d0Var;
                }
                if (d0Var instanceof w2) {
                    return null;
                }
            }
        }
    }

    @Override // c40.l2
    @m80.k
    public final k1 z0(@m80.k x00.l<? super Throwable, yz.g2> lVar) {
        return n1(true, new k2(lVar));
    }

    public final void z1(w2 w2Var, Throwable th2) {
        E1(th2);
        w2Var.f(4);
        Object j11 = w2Var.j();
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (h40.d0 d0Var = (h40.d0) j11; !kotlin.jvm.internal.g0.g(d0Var, w2Var); d0Var = d0Var.k()) {
            if ((d0Var instanceof q2) && ((q2) d0Var).C()) {
                try {
                    ((q2) d0Var).D(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        yz.r.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d0Var + " for " + this, th3);
                        yz.g2 g2Var = yz.g2.f100423a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            l1(completionHandlerException);
        }
        r0(th2);
    }

    @Override // c40.l2
    public void cancel(@m80.l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t0(), null, this);
        }
        p0(cancellationException);
    }

    public static /* synthetic */ void a1() {
    }

    public static /* synthetic */ void c1() {
    }

    public void G1() {
    }

    public void E1(@m80.l Throwable th2) {
    }

    public void F1(@m80.l Object obj) {
    }

    public void e0(@m80.l Object obj) {
    }

    public void l1(@m80.k Throwable th2) {
        throw th2;
    }
}
