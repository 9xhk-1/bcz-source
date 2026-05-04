package c40;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n426#2,9:122\n435#2,2:133\n13402#3,2:131\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:122,9\n63#1:133,2\n75#1:131,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7833b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x0<T>[] f7834a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n11158#2:122\n11493#2,3:123\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n115#1:122\n115#1:123,3\n*E\n"})
    public final class a extends q2 {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f7835h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final n<List<? extends T>> f7836e;

        /* renamed from: f, reason: collision with root package name */
        public k1 f7837f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k n<? super List<? extends T>> nVar) {
            this.f7836e = nVar;
        }

        @Override // c40.q2
        public boolean C() {
            return false;
        }

        @Override // c40.q2
        public void D(@m80.l Throwable th2) {
            if (th2 != null) {
                Object v11 = this.f7836e.v(th2);
                if (v11 != null) {
                    this.f7836e.s(v11);
                    e<T>.b F = F();
                    if (F != null) {
                        F.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.e().decrementAndGet(e.this) == 0) {
                n<List<? extends T>> nVar = this.f7836e;
                x0[] x0VarArr = e.this.f7834a;
                ArrayList arrayList = new ArrayList(x0VarArr.length);
                for (x0 x0Var : x0VarArr) {
                    arrayList.add(x0Var.S());
                }
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(arrayList));
            }
        }

        @m80.l
        public final e<T>.b F() {
            return (b) f7835h.get(this);
        }

        @m80.k
        public final k1 G() {
            k1 k1Var = this.f7837f;
            if (k1Var != null) {
                return k1Var;
            }
            kotlin.jvm.internal.g0.S("handle");
            return null;
        }

        public final /* synthetic */ Object H() {
            return this._disposer$volatile;
        }

        public final void J(@m80.l e<T>.b bVar) {
            f7835h.set(this, bVar);
        }

        public final void K(@m80.k k1 k1Var) {
            this.f7837f = k1Var;
        }

        public final /* synthetic */ void L(Object obj) {
            this._disposer$volatile = obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n13402#2,2:122\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:122,2\n*E\n"})
    public final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final e<T>.a[] f7839a;

        public b(@m80.k e<T>.a[] aVarArr) {
            this.f7839a = aVarArr;
        }

        @Override // c40.m
        public void a(@m80.l Throwable th2) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.f7839a) {
                aVar.G().dispose();
            }
        }

        @m80.k
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f7839a + l50.b.f69930l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@m80.k x0<? extends T>[] x0VarArr) {
        this.f7834a = x0VarArr;
        this.notCompletedCount$volatile = x0VarArr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater e() {
        return f7833b;
    }

    @m80.l
    public final Object c(@m80.k j00.c<? super List<? extends T>> cVar) {
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        int length = this.f7834a.length;
        a[] aVarArr = new a[length];
        for (int i11 = 0; i11 < length; i11++) {
            x0 x0Var = this.f7834a[i11];
            x0Var.start();
            a aVar = new a(pVar);
            aVar.K(p2.B(x0Var, false, aVar, 1, null));
            yz.g2 g2Var = yz.g2.f100423a;
            aVarArr[i11] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            aVarArr[i12].J(bVar);
        }
        if (pVar.e()) {
            bVar.b();
        } else {
            r.c(pVar, bVar);
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public final /* synthetic */ int d() {
        return this.notCompletedCount$volatile;
    }

    public final /* synthetic */ void f(int i11) {
        this.notCompletedCount$volatile = i11;
    }
}
