package com.baicizhan.main.home.experiment.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import c40.s0;
import c40.x0;
import com.baicizhan.online.notify.NotifyResult;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21537b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f21538a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.DoRefreshPop$invoke$2", f = "DoRefreshPop.kt", i = {0, 0}, l = {40}, m = "invokeSuspend", n = {"$this$coroutineScope", "newUserOn"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super w>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21539a;

        /* renamed from: b, reason: collision with root package name */
        public int f21540b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21541c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.repo.DoRefreshPop$invoke$2$1", f = "DoRefreshPop.kt", i = {0, 0, 0}, l = {38}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-DoRefreshPop$invoke$2$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        /* renamed from: com.baicizhan.main.home.experiment.repo.j$a$a, reason: collision with other inner class name */
        public static final class C0307a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends NotifyResult>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f21543a;

            /* renamed from: b, reason: collision with root package name */
            public int f21544b;

            /* renamed from: c, reason: collision with root package name */
            public int f21545c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f21546d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f21547e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ j f21548f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0307a(boolean z11, j jVar, j00.c<? super C0307a> cVar) {
                super(2, cVar);
                this.f21547e = z11;
                this.f21548f = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0307a c0307a = new C0307a(this.f21547e, this.f21548f, cVar);
                c0307a.f21546d = obj;
                return c0307a;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super Result<? extends NotifyResult>> cVar) {
                return ((C0307a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f21546d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21545c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        if (this.f21547e) {
                            return null;
                        }
                        j jVar = this.f21548f;
                        Result.a aVar = Result.Companion;
                        s sVar = jVar.f21538a;
                        this.f21546d = l00.k.a(r0Var);
                        this.f21543a = l00.k.a(r0Var);
                        this.f21544b = 0;
                        this.f21545c = 1;
                        obj = sVar.g(this);
                        if (obj == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl((NotifyResult) obj);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }
        }

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = j.this.new a(cVar);
            aVar.f21541c = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super w> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r10v2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            int i11;
            r0 r0Var = (r0) this.f21541c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f21540b;
            if (i12 == 0) {
                kotlin.e.n(obj);
                ?? r102 = (gi.v.c(4096) && gi.v.d()) ? 1 : 0;
                if (r102 != 0) {
                    gi.v.a(4096);
                    i9.f.j(pb.a.a(), jg.d.f64079c, true);
                }
                qb.c.i("RefreshAllUC", "fetch finish", new Object[0]);
                b11 = c40.k.b(r0Var, null, null, new C0307a(r102, j.this, null), 3, null);
                this.f21541c = l00.k.a(r0Var);
                this.f21539a = r102;
                this.f21540b = 1;
                obj = b11.i(this);
                if (obj == l11) {
                    return l11;
                }
                i11 = r102;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f21539a;
                kotlin.e.n(obj);
            }
            Result result = (Result) obj;
            if (result != null) {
                Object m6317unboximpl = result.m6317unboximpl();
                r7 = Result.m6314isFailureimpl(m6317unboximpl) ? null : m6317unboximpl;
            }
            return new w(r7, i11 != 0);
        }
    }

    @Inject
    public j(@m80.k s iGameHomeRepo) {
        g0.p(iGameHomeRepo, "iGameHomeRepo");
        this.f21538a = iGameHomeRepo;
    }

    @m80.l
    public final Object b(@m80.k j00.c<? super w> cVar) {
        return s0.g(new a(null), cVar);
    }
}
