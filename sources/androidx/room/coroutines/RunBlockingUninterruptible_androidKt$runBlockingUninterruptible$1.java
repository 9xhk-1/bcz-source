package androidx.room.coroutines;

import c40.b2;
import c40.i;
import c40.r0;
import c40.x;
import c40.z;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {
    final /* synthetic */ p<r0, j00.c<? super T>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nRunBlockingUninterruptible.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunBlockingUninterruptible.android.kt\nandroidx/room/coroutines/RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ p<r0, j00.c<? super T>, Object> $block;
        final /* synthetic */ x<T> $deferred;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(x<T> xVar, p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$deferred = xVar;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deferred, this.$block, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x<T> xVar;
            Object m6308constructorimpl;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                r0 r0Var = (r0) this.L$0;
                x<T> xVar2 = this.$deferred;
                p<r0, j00.c<? super T>, Object> pVar = this.$block;
                try {
                    Result.a aVar = Result.Companion;
                    this.L$0 = xVar2;
                    this.label = 1;
                    obj = pVar.invoke(r0Var, this);
                    if (obj == l11) {
                        return l11;
                    }
                    xVar = xVar2;
                } catch (Throwable th2) {
                    th = th2;
                    xVar = xVar2;
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(e.a(th));
                    z.d(xVar, m6308constructorimpl);
                    return g2.f100423a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (x) this.L$0;
                try {
                    e.n(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Result.a aVar22 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(e.a(th));
                    z.d(xVar, m6308constructorimpl);
                    return g2.f100423a;
                }
            }
            m6308constructorimpl = Result.m6308constructorimpl(obj);
            z.d(xVar, m6308constructorimpl);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {
        final /* synthetic */ x<T> $deferred;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(x<T> xVar, j00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$deferred = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass2(this.$deferred, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                return obj;
            }
            e.n(obj);
            x<T> xVar = this.$deferred;
            this.label = 1;
            Object i12 = xVar.i(this);
            return i12 == l11 ? l11 : i12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, j00.c<? super RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1> cVar) {
        super(2, cVar);
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 = new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(this.$block, cVar);
        runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.L$0 = obj;
        return runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
        return ((RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        d.b bVar = ((r0) this.L$0).getCoroutineContext().get(kotlin.coroutines.c.f66933w0);
        g0.m(bVar);
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) bVar;
        x c11 = z.c(null, 1, null);
        i.d(b2.f7824a, cVar, CoroutineStart.UNDISPATCHED, new AnonymousClass1(c11, this.$block, null));
        while (!c11.e()) {
            try {
                return i.f(cVar, new AnonymousClass2(c11, null));
            } catch (InterruptedException unused) {
            }
        }
        return c11.S();
    }
}
