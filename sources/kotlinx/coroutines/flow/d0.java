package kotlinx.coroutines.flow;

import c40.k1;
import h40.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n29#2:747\n29#2:750\n29#2:769\n29#2:773\n29#2:782\n29#2:793\n29#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n375#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13402#7:755\n13403#7:758\n13402#7:777\n13403#7:780\n13402#7:799\n13403#7:802\n426#8,9:760\n435#8,2:771\n426#8,9:784\n435#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
/* loaded from: classes8.dex */
public class d0<T> extends kotlinx.coroutines.flow.internal.a<f0> implements x<T>, kotlinx.coroutines.flow.c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: e, reason: collision with root package name */
    public final int f68107e;

    /* renamed from: f, reason: collision with root package name */
    public final int f68108f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final BufferOverflow f68109g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public Object[] f68110h;

    /* renamed from: i, reason: collision with root package name */
    public long f68111i;

    /* renamed from: j, reason: collision with root package name */
    public long f68112j;

    /* renamed from: k, reason: collision with root package name */
    public int f68113k;

    /* renamed from: l, reason: collision with root package name */
    public int f68114l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements k1 {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @m80.k
        public final d0<?> f68115a;

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        public long f68116b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Object f68117c;

        /* renamed from: d, reason: collision with root package name */
        @w00.g
        @m80.k
        public final j00.c<g2> f68118d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k d0<?> d0Var, long j11, @m80.l Object obj, @m80.k j00.c<? super g2> cVar) {
            this.f68115a = d0Var;
            this.f68116b = j11;
            this.f68117c = obj;
            this.f68118d = cVar;
        }

        @Override // c40.k1
        public void dispose() {
            this.f68115a.C(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68119a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68119a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {387, 394, 397}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68120a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68121b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68122c;

        /* renamed from: d, reason: collision with root package name */
        public Object f68123d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f68124e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d0<T> f68125f;

        /* renamed from: g, reason: collision with root package name */
        public int f68126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d0<T> d0Var, j00.c<? super c> cVar) {
            super(cVar);
            this.f68125f = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68124e = obj;
            this.f68126g |= Integer.MIN_VALUE;
            return d0.E(this.f68125f, null, this);
        }
    }

    public d0(int i11, int i12, @m80.k BufferOverflow bufferOverflow) {
        this.f68107e = i11;
        this.f68108f = i12;
        this.f68109g = bufferOverflow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(3:(7:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(2:16|(3:28|29|(2:31|32)(2:33|27))(4:18|(1:20)|21|(1:23)(2:26|27)))|24)(4:44|45|46|47)|37|38)(5:53|54|55|(1:57)|60)|48|49|15|(3:16|(0)(0)|27)|24))|63|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.q0) r9).a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object E(kotlinx.coroutines.flow.d0<T> r8, kotlinx.coroutines.flow.j<? super T> r9, j00.c<?> r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d0.E(kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }

    public static /* synthetic */ <T> Object J(d0<T> d0Var, T t11, j00.c<? super g2> cVar) {
        if (d0Var.d(t11)) {
            return g2.f100423a;
        }
        Object K = d0Var.K(t11, cVar);
        return K == kotlin.coroutines.intrinsics.b.l() ? K : g2.f100423a;
    }

    public final Object B(f0 f0Var, j00.c<? super g2> cVar) {
        g2 g2Var;
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        synchronized (this) {
            try {
                if (Y(f0Var) < 0) {
                    f0Var.f68133b = pVar;
                } else {
                    Result.a aVar = Result.Companion;
                    pVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                }
                g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F == kotlin.coroutines.intrinsics.b.l() ? F : g2Var;
    }

    public final void C(a aVar) {
        Object f11;
        synchronized (this) {
            if (aVar.f68116b < O()) {
                return;
            }
            Object[] objArr = this.f68110h;
            kotlin.jvm.internal.g0.m(objArr);
            f11 = e0.f(objArr, aVar.f68116b);
            if (f11 != aVar) {
                return;
            }
            e0.g(objArr, aVar.f68116b, e0.f68130a);
            D();
            g2 g2Var = g2.f100423a;
        }
    }

    public final void D() {
        Object f11;
        if (this.f68108f != 0 || this.f68114l > 1) {
            Object[] objArr = this.f68110h;
            kotlin.jvm.internal.g0.m(objArr);
            while (this.f68114l > 0) {
                f11 = e0.f(objArr, (O() + U()) - 1);
                if (f11 != e0.f68130a) {
                    return;
                }
                this.f68114l--;
                e0.g(objArr, O() + U(), null);
            }
        }
    }

    public final void F(long j11) {
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (this.f68154b != 0 && (cVarArr = this.f68153a) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    f0 f0Var = (f0) cVar;
                    long j12 = f0Var.f68132a;
                    if (j12 >= 0 && j12 < j11) {
                        f0Var.f68132a = j11;
                    }
                }
            }
        }
        this.f68112j = j11;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    @m80.k
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public f0 j() {
        return new f0();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    @m80.k
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public f0[] k(int i11) {
        return new f0[i11];
    }

    public final void I() {
        Object[] objArr = this.f68110h;
        kotlin.jvm.internal.g0.m(objArr);
        e0.g(objArr, O(), null);
        this.f68113k--;
        long O = O() + 1;
        if (this.f68111i < O) {
            this.f68111i = O;
        }
        if (this.f68112j < O) {
            F(O);
        }
    }

    public final Object K(T t11, j00.c<? super g2> cVar) {
        Throwable th2;
        j00.c<g2>[] M;
        a aVar;
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        j00.c<g2>[] cVarArr = kotlinx.coroutines.flow.internal.b.f68157a;
        synchronized (this) {
            try {
                if (W(t11)) {
                    try {
                        Result.a aVar2 = Result.Companion;
                        pVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                        M = M(cVarArr);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, O() + U(), t11, pVar);
                        L(aVar);
                        this.f68114l++;
                        if (this.f68108f == 0) {
                            cVarArr = M(cVarArr);
                        }
                        M = cVarArr;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    c40.r.a(pVar, aVar);
                }
                for (j00.c<g2> cVar2 : M) {
                    if (cVar2 != null) {
                        Result.a aVar3 = Result.Companion;
                        cVar2.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                    }
                }
                Object F = pVar.F();
                if (F == kotlin.coroutines.intrinsics.b.l()) {
                    l00.f.c(cVar);
                }
                return F == kotlin.coroutines.intrinsics.b.l() ? F : g2.f100423a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void L(Object obj) {
        int U = U();
        Object[] objArr = this.f68110h;
        if (objArr == null) {
            objArr = V(null, 0, 2);
        } else if (U >= objArr.length) {
            objArr = V(objArr, U, objArr.length * 2);
        }
        e0.g(objArr, O() + U, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final j00.c<g2>[] M(j00.c<g2>[] cVarArr) {
        kotlinx.coroutines.flow.internal.c[] cVarArr2;
        f0 f0Var;
        j00.c<? super g2> cVar;
        int length = cVarArr.length;
        if (this.f68154b != 0 && (cVarArr2 = this.f68153a) != null) {
            int length2 = cVarArr2.length;
            int i11 = 0;
            cVarArr = cVarArr;
            while (i11 < length2) {
                kotlinx.coroutines.flow.internal.c cVar2 = cVarArr2[i11];
                if (cVar2 != null && (cVar = (f0Var = (f0) cVar2).f68133b) != null && Y(f0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = cVar;
                    f0Var.f68133b = null;
                    length++;
                }
                i11++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long N() {
        return O() + this.f68113k;
    }

    public final long O() {
        return Math.min(this.f68112j, this.f68111i);
    }

    public final T P() {
        Object f11;
        Object[] objArr = this.f68110h;
        kotlin.jvm.internal.g0.m(objArr);
        f11 = e0.f(objArr, (this.f68111i + T()) - 1);
        return (T) f11;
    }

    public final Object R(long j11) {
        Object f11;
        Object[] objArr = this.f68110h;
        kotlin.jvm.internal.g0.m(objArr);
        f11 = e0.f(objArr, j11);
        return f11 instanceof a ? ((a) f11).f68117c : f11;
    }

    public final long S() {
        return O() + this.f68113k + this.f68114l;
    }

    public final int T() {
        return (int) ((O() + this.f68113k) - this.f68111i);
    }

    public final int U() {
        return this.f68113k + this.f68114l;
    }

    public final Object[] V(Object[] objArr, int i11, int i12) {
        Object f11;
        if (i12 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i12];
        this.f68110h = objArr2;
        if (objArr != null) {
            long O = O();
            for (int i13 = 0; i13 < i11; i13++) {
                long j11 = i13 + O;
                f11 = e0.f(objArr, j11);
                e0.g(objArr2, j11, f11);
            }
        }
        return objArr2;
    }

    public final boolean W(T t11) {
        if (n() == 0) {
            return X(t11);
        }
        if (this.f68113k >= this.f68108f && this.f68112j <= this.f68111i) {
            int i11 = b.f68119a[this.f68109g.ordinal()];
            if (i11 == 1) {
                return false;
            }
            if (i11 == 2) {
                return true;
            }
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        L(t11);
        int i12 = this.f68113k + 1;
        this.f68113k = i12;
        if (i12 > this.f68108f) {
            I();
        }
        if (T() > this.f68107e) {
            a0(this.f68111i + 1, this.f68112j, N(), S());
        }
        return true;
    }

    public final boolean X(T t11) {
        if (this.f68107e == 0) {
            return true;
        }
        L(t11);
        int i11 = this.f68113k + 1;
        this.f68113k = i11;
        if (i11 > this.f68107e) {
            I();
        }
        this.f68112j = O() + this.f68113k;
        return true;
    }

    public final long Y(f0 f0Var) {
        long j11 = f0Var.f68132a;
        if (j11 >= N() && (this.f68108f > 0 || j11 > O() || this.f68114l == 0)) {
            return -1L;
        }
        return j11;
    }

    public final Object Z(f0 f0Var) {
        Object obj;
        j00.c<g2>[] cVarArr = kotlinx.coroutines.flow.internal.b.f68157a;
        synchronized (this) {
            try {
                long Y = Y(f0Var);
                if (Y < 0) {
                    obj = e0.f68130a;
                } else {
                    long j11 = f0Var.f68132a;
                    Object R = R(Y);
                    f0Var.f68132a = Y + 1;
                    cVarArr = b0(j11);
                    obj = R;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (j00.c<g2> cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
            }
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.c0
    @m80.k
    public List<T> a() {
        Object f11;
        synchronized (this) {
            int T = T();
            if (T == 0) {
                return a00.h0.J();
            }
            ArrayList arrayList = new ArrayList(T);
            Object[] objArr = this.f68110h;
            kotlin.jvm.internal.g0.m(objArr);
            for (int i11 = 0; i11 < T; i11++) {
                f11 = e0.f(objArr, this.f68111i + i11);
                arrayList.add(f11);
            }
            return arrayList;
        }
    }

    public final void a0(long j11, long j12, long j13, long j14) {
        long min = Math.min(j12, j11);
        for (long O = O(); O < min; O++) {
            Object[] objArr = this.f68110h;
            kotlin.jvm.internal.g0.m(objArr);
            e0.g(objArr, O, null);
        }
        this.f68111i = j11;
        this.f68112j = j12;
        this.f68113k = (int) (j13 - min);
        this.f68114l = (int) (j14 - j13);
    }

    @m80.k
    public final j00.c<g2>[] b0(long j11) {
        long j12;
        long j13;
        long j14;
        Object f11;
        Object f12;
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (j11 > this.f68112j) {
            return kotlinx.coroutines.flow.internal.b.f68157a;
        }
        long O = O();
        long j15 = this.f68113k + O;
        if (this.f68108f == 0 && this.f68114l > 0) {
            j15++;
        }
        if (this.f68154b != 0 && (cVarArr = this.f68153a) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    long j16 = ((f0) cVar).f68132a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f68112j) {
            return kotlinx.coroutines.flow.internal.b.f68157a;
        }
        long N = N();
        int min = n() > 0 ? Math.min(this.f68114l, this.f68108f - ((int) (N - j15))) : this.f68114l;
        j00.c<g2>[] cVarArr2 = kotlinx.coroutines.flow.internal.b.f68157a;
        long j17 = this.f68114l + N;
        if (min > 0) {
            cVarArr2 = new j00.c[min];
            Object[] objArr = this.f68110h;
            kotlin.jvm.internal.g0.m(objArr);
            j14 = 1;
            long j18 = N;
            int i11 = 0;
            while (true) {
                if (N >= j17) {
                    j12 = O;
                    j13 = j15;
                    N = j18;
                    break;
                }
                f12 = e0.f(objArr, N);
                j12 = O;
                x0 x0Var = e0.f68130a;
                if (f12 != x0Var) {
                    kotlin.jvm.internal.g0.n(f12, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) f12;
                    int i12 = i11 + 1;
                    j13 = j15;
                    cVarArr2[i11] = aVar.f68118d;
                    e0.g(objArr, N, x0Var);
                    e0.g(objArr, j18, aVar.f68117c);
                    long j19 = j18 + 1;
                    if (i12 >= min) {
                        N = j19;
                        break;
                    }
                    i11 = i12;
                    j18 = j19;
                } else {
                    j13 = j15;
                }
                N++;
                O = j12;
                j15 = j13;
            }
        } else {
            j12 = O;
            j13 = j15;
            j14 = 1;
        }
        j00.c<g2>[] cVarArr3 = cVarArr2;
        int i13 = (int) (N - j12);
        long j21 = n() == 0 ? N : j13;
        long max = Math.max(this.f68111i, N - Math.min(this.f68107e, i13));
        if (this.f68108f == 0 && max < j17) {
            Object[] objArr2 = this.f68110h;
            kotlin.jvm.internal.g0.m(objArr2);
            f11 = e0.f(objArr2, max);
            if (kotlin.jvm.internal.g0.g(f11, e0.f68130a)) {
                N += j14;
                max += j14;
            }
        }
        a0(max, j21, N, j17);
        D();
        return !(cVarArr3.length == 0) ? M(cVarArr3) : cVarArr3;
    }

    @Override // kotlinx.coroutines.flow.x
    public void c() {
        synchronized (this) {
            try {
                try {
                    a0(N(), this.f68112j, N(), S());
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final long c0() {
        long j11 = this.f68111i;
        if (j11 < this.f68112j) {
            this.f68112j = j11;
        }
        return j11;
    }

    @Override // kotlinx.coroutines.flow.c0, kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k j<? super T> jVar, @m80.k j00.c<?> cVar) {
        return E(this, jVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.x
    public boolean d(T t11) {
        int i11;
        boolean z11;
        j00.c<g2>[] cVarArr = kotlinx.coroutines.flow.internal.b.f68157a;
        synchronized (this) {
            if (W(t11)) {
                cVarArr = M(cVarArr);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        for (j00.c<g2> cVar : cVarArr) {
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
            }
        }
        return z11;
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @m80.k
    public i<T> e(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return e0.e(this, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.j
    @m80.l
    public Object emit(T t11, @m80.k j00.c<? super g2> cVar) {
        return J(this, t11, cVar);
    }

    public static /* synthetic */ void Q() {
    }
}
