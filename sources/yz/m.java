package yz;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m<T, R> extends l<T, R> implements j00.c<R> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public x00.q<? super l<?, ?>, Object, ? super j00.c<Object>, ? extends Object> f100427a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Object f100428b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public j00.c<Object> f100429c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public Object f100430d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n182#2,6:162\n*E\n"})
    public static final class a implements j00.c<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f100431a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f100432b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q f100433c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j00.c f100434d;

        public a(kotlin.coroutines.d dVar, m mVar, x00.q qVar, j00.c cVar) {
            this.f100431a = dVar;
            this.f100432b = mVar;
            this.f100433c = qVar;
            this.f100434d = cVar;
        }

        @Override // j00.c
        public kotlin.coroutines.d getContext() {
            return this.f100431a;
        }

        @Override // j00.c
        public void resumeWith(Object obj) {
            this.f100432b.f100427a = this.f100433c;
            this.f100432b.f100429c = this.f100434d;
            this.f100432b.f100430d = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(@m80.k x00.q<? super l<T, R>, ? super T, ? super j00.c<? super R>, ? extends Object> block, T t11) {
        super(null);
        Object obj;
        kotlin.jvm.internal.g0.p(block, "block");
        this.f100427a = block;
        this.f100428b = t11;
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f100429c = this;
        obj = kotlin.a.f66910a;
        this.f100430d = obj;
    }

    @Override // yz.l
    @m80.l
    public Object b(T t11, @m80.k j00.c<? super R> cVar) {
        kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f100429c = cVar;
        this.f100428b = t11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        if (l11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return l11;
    }

    @Override // yz.l
    @m80.l
    public <U, S> Object c(@m80.k k<U, S> kVar, U u11, @m80.k j00.c<? super S> cVar) {
        x00.q<l<U, S>, U, j00.c<? super S>, Object> a11 = kVar.a();
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
        x00.q<? super l<?, ?>, Object, ? super j00.c<Object>, ? extends Object> qVar = this.f100427a;
        if (a11 != qVar) {
            this.f100427a = a11;
            kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f100429c = i(qVar, cVar);
        } else {
            kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f100429c = cVar;
        }
        this.f100428b = u11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        if (l11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return l11;
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final j00.c<Object> i(x00.q<? super l<?, ?>, Object, ? super j00.c<Object>, ? extends Object> qVar, j00.c<Object> cVar) {
        return new a(EmptyCoroutineContext.INSTANCE, this, qVar, cVar);
    }

    public final R j() {
        Object obj;
        Object obj2;
        while (true) {
            R r11 = (R) this.f100430d;
            j00.c<Object> cVar = this.f100429c;
            if (cVar == null) {
                kotlin.e.n(r11);
                return r11;
            }
            obj = kotlin.a.f66910a;
            if (Result.m6310equalsimpl0(obj, r11)) {
                try {
                    x00.q<? super l<?, ?>, Object, ? super j00.c<Object>, ? extends Object> qVar = this.f100427a;
                    Object obj3 = this.f100428b;
                    Object k11 = !(qVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.k(qVar, this, obj3, cVar) : ((x00.q) kotlin.jvm.internal.x0.q(qVar, 3)).invoke(this, obj3, cVar);
                    if (k11 != kotlin.coroutines.intrinsics.b.l()) {
                        Result.a aVar = Result.Companion;
                        cVar.resumeWith(Result.m6308constructorimpl(k11));
                    }
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
                }
            } else {
                obj2 = kotlin.a.f66910a;
                this.f100430d = obj2;
                cVar.resumeWith(r11);
            }
        }
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        this.f100429c = null;
        this.f100430d = obj;
    }
}
