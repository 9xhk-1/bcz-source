package z9;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102425d = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.client.business.managers.winningstreak.a f102426a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final z9.a f102427b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u9.d f102428c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.client.business.managers.study.StudyCommitterImpl$commit$1", f = "StudyDataCommiter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements r<Boolean, Boolean, Boolean, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f102429a;

        public a(j00.c<? super a> cVar) {
            super(4, cVar);
        }

        public final Object i(boolean z11, boolean z12, boolean z13, j00.c<? super Boolean> cVar) {
            return new a(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, j00.c<? super Boolean> cVar) {
            return i(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f102429a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return l00.a.a(true);
        }
    }

    @Inject
    public c(@k com.baicizhan.client.business.managers.winningstreak.a winning, @k z9.a daka, @k u9.d expRepo) {
        g0.p(winning, "winning");
        g0.p(daka, "daka");
        g0.p(expRepo, "expRepo");
        this.f102426a = winning;
        this.f102427b = daka;
        this.f102428c = expRepo;
    }

    @Override // z9.b
    @k
    public i<Boolean> commit() {
        return kotlinx.coroutines.flow.k.H(this.f102427b.a(), this.f102426a.a(), this.f102428c.a(), new a(null));
    }
}
