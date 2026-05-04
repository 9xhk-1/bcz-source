package k40;

import c40.r0;
import c40.s0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class e<R> extends m<R> {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c40.p<R> f65813g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f65814a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e<R> f65815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<R> eVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f65815b = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f65815b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f65814a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    e<R> eVar = this.f65815b;
                    this.f65814a = 1;
                    obj = eVar.w(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                q.c(this.f65815b.f65813g, obj);
                return g2.f100423a;
            } catch (Throwable th2) {
                q.d(this.f65815b.f65813g, th2);
                return g2.f100423a;
            }
        }
    }

    public e(@m80.k j00.c<? super R> cVar) {
        super(cVar.getContext());
        this.f65813g = new c40.p<>(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
    }

    @m80.l
    @v0
    public final Object Q() {
        if (this.f65813g.e()) {
            return this.f65813g.F();
        }
        c40.k.f(s0.a(getContext()), null, CoroutineStart.UNDISPATCHED, new a(this, null), 1, null);
        return this.f65813g.F();
    }

    @v0
    public final void R(@m80.k Throwable th2) {
        c40.p<R> pVar = this.f65813g;
        Result.a aVar = Result.Companion;
        pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
    }
}
