package c40;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7869a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7870b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7871c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7872d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements x00.p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7873a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7874b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<T> f7875c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.a<? extends T> aVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f7875c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f7875c, cVar);
            aVar.f7874b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f7873a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return i2.d(((r0) this.f7874b).getCoroutineContext(), this.f7875c);
        }
    }

    @m80.l
    public static final <T> Object b(@m80.k kotlin.coroutines.d dVar, @m80.k x00.a<? extends T> aVar, @m80.k j00.c<? super T> cVar) {
        return i.h(dVar, new a(aVar, null), cVar);
    }

    public static /* synthetic */ Object c(kotlin.coroutines.d dVar, x00.a aVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return b(dVar, aVar, cVar);
    }

    public static final <T> T d(kotlin.coroutines.d dVar, x00.a<? extends T> aVar) {
        try {
            t3 t3Var = new t3();
            t3Var.L(n2.A(dVar));
            try {
                return aVar.invoke();
            } finally {
                t3Var.F();
            }
        } catch (InterruptedException e11) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e11);
        }
    }
}
