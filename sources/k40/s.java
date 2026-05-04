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
public final class s<R> extends t<R> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c40.p<R> f65861h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f65862a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s<R> f65863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s<R> sVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f65863b = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f65863b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f65862a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    s<R> sVar = this.f65863b;
                    this.f65862a = 1;
                    obj = sVar.w(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                q.c(this.f65863b.f65861h, obj);
                return g2.f100423a;
            } catch (Throwable th2) {
                q.d(this.f65863b.f65861h, th2);
                return g2.f100423a;
            }
        }
    }

    public s(@m80.k j00.c<? super R> cVar) {
        super(cVar.getContext());
        this.f65861h = new c40.p<>(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
    }

    @v0
    public final void S(@m80.k Throwable th2) {
        c40.p<R> pVar = this.f65861h;
        Result.a aVar = Result.Companion;
        pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
    }

    @m80.l
    @v0
    public final Object T() {
        if (this.f65861h.e()) {
            return this.f65861h.F();
        }
        c40.k.f(s0.a(getContext()), null, CoroutineStart.UNDISPATCHED, new a(this, null), 1, null);
        return this.f65861h.F();
    }
}
