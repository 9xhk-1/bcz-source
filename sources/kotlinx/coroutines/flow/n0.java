package kotlinx.coroutines.flow;

import h40.x0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n29#3:435\n29#3:439\n16#4:436\n16#4:440\n13402#5,2:437\n375#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
/* loaded from: classes8.dex */
public final class n0<T> extends kotlinx.coroutines.flow.internal.a<p0> implements y<T>, c<T>, kotlinx.coroutines.flow.internal.p<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68324f = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f68325e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {389, 401, 406}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68326a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68327b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68328c;

        /* renamed from: d, reason: collision with root package name */
        public Object f68329d;

        /* renamed from: e, reason: collision with root package name */
        public Object f68330e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f68331f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n0<T> f68332g;

        /* renamed from: h, reason: collision with root package name */
        public int f68333h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0<T> n0Var, j00.c<? super a> cVar) {
            super(cVar);
            this.f68332g = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68331f = obj;
            this.f68333h |= Integer.MIN_VALUE;
            return this.f68332g.collect(null, this);
        }
    }

    public n0(@m80.k Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ Object r() {
        return this._state$volatile;
    }

    private final /* synthetic */ void t(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.c0
    @m80.k
    public List<T> a() {
        return a00.g0.l(getValue());
    }

    @Override // kotlinx.coroutines.flow.y
    public boolean b(T t11, T t12) {
        if (t11 == null) {
            t11 = (T) kotlinx.coroutines.flow.internal.s.f68282a;
        }
        if (t12 == null) {
            t12 = (T) kotlinx.coroutines.flow.internal.s.f68282a;
        }
        return u(t11, t12);
    }

    @Override // kotlinx.coroutines.flow.x
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        if (kotlin.jvm.internal.g0.g(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        if (((kotlinx.coroutines.flow.q0) r11).a(r0) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ac, B:16:0x00b6, B:18:0x00bb, B:20:0x00dc, B:22:0x00e2, B:26:0x00c1, B:29:0x00c8, B:38:0x0060, B:40:0x0073, B:41:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ac, B:16:0x00b6, B:18:0x00bb, B:20:0x00dc, B:22:0x00e2, B:26:0x00c1, B:29:0x00c8, B:38:0x0060, B:40:0x0073, B:41:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ac, B:16:0x00b6, B:18:0x00bb, B:20:0x00dc, B:22:0x00e2, B:26:0x00c1, B:29:0x00c8, B:38:0x0060, B:40:0x0073, B:41:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e0 -> B:14:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f2 -> B:14:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.c0, kotlinx.coroutines.flow.i
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@m80.k kotlinx.coroutines.flow.j<? super T> r11, @m80.k j00.c<?> r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n0.collect(kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.x
    public boolean d(T t11) {
        setValue(t11);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @m80.k
    public i<T> e(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return o0.d(this, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.j
    @m80.l
    public Object emit(T t11, @m80.k j00.c<? super g2> cVar) {
        setValue(t11);
        return g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.m0
    public T getValue() {
        x0 x0Var = kotlinx.coroutines.flow.internal.s.f68282a;
        T t11 = (T) f68324f.get(this);
        if (t11 == x0Var) {
            return null;
        }
        return t11;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public p0 j() {
        return new p0();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    @m80.k
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public p0[] k(int i11) {
        return new p0[i11];
    }

    @Override // kotlinx.coroutines.flow.y
    public void setValue(T t11) {
        if (t11 == null) {
            t11 = (T) kotlinx.coroutines.flow.internal.s.f68282a;
        }
        u(null, t11);
    }

    public final boolean u(Object obj, Object obj2) {
        int i11;
        p0[] o11;
        synchronized (this) {
            Object obj3 = f68324f.get(this);
            if (obj != null && !kotlin.jvm.internal.g0.g(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.g0.g(obj3, obj2)) {
                return true;
            }
            f68324f.set(this, obj2);
            int i12 = this.f68325e;
            if ((i12 & 1) != 0) {
                this.f68325e = i12 + 2;
                return true;
            }
            int i13 = i12 + 1;
            this.f68325e = i13;
            p0[] o12 = o();
            g2 g2Var = g2.f100423a;
            while (true) {
                p0[] p0VarArr = o12;
                if (p0VarArr != null) {
                    for (p0 p0Var : p0VarArr) {
                        if (p0Var != null) {
                            p0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i11 = this.f68325e;
                    if (i11 == i13) {
                        this.f68325e = i13 + 1;
                        return true;
                    }
                    o11 = o();
                    g2 g2Var2 = g2.f100423a;
                }
                o12 = o11;
                i13 = i11;
            }
        }
    }
}
