package u5;

import c40.i;
import c40.m0;
import c40.r0;
import java.util.List;
import k3.d1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;
import u5.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f implements a.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f91828a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c7.e f91829b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.plugin.ReportNativePluginProxy$report$2", f = "PluginRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f91830a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f91832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f91832c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return f.this.new a(this.f91832c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f91830a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (f.this.f91828a instanceof d1.c) {
                ((d1.c) f.this.f91828a).e(this.f91832c);
                return g2.f100423a;
            }
            throw new IllegalArgumentException("Unsupported plugin type: " + o0.d(f.this.f91828a.getClass()));
        }
    }

    public f(@k d1 plugin, @k c7.e deviceRepo) {
        g0.p(plugin, "plugin");
        g0.p(deviceRepo, "deviceRepo");
        this.f91828a = plugin;
        this.f91829b = deviceRepo;
    }

    @Override // u5.a.b
    @l
    public Object a(@k List<String> list, @k j00.c<? super g2> cVar) {
        m0 b11;
        b11 = e.b(this.f91829b);
        Object h11 = i.h(b11, new a(list, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
