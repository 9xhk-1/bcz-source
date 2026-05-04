package u5;

import c40.i;
import c40.m0;
import c40.r0;
import java.util.List;
import k3.d1;
import k3.h4;
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
public final class g implements a.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f91833a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c7.e f91834b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.plugin.UserBookNativePluginProxy$collectWord2Books$2", f = "PluginRepo.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f91835a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f91837c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f91838d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<Long> f91839e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, List<Long> list, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f91837c = i11;
            this.f91838d = i12;
            this.f91839e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return g.this.new a(this.f91837c, this.f91838d, this.f91839e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f91835a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (g.this.f91833a instanceof d1.d) {
                    ((d1.d) g.this.f91833a).g(this.f91837c, this.f91838d, this.f91839e);
                } else {
                    if (!(g.this.f91833a instanceof d1.e)) {
                        throw new IllegalArgumentException("Unsupported plugin type: " + o0.d(g.this.f91833a.getClass()));
                    }
                    d1.e eVar = (d1.e) g.this.f91833a;
                    int i12 = this.f91837c;
                    int i13 = this.f91838d;
                    List<Long> list = this.f91839e;
                    this.f91835a = 1;
                    if (eVar.b(i12, i13, list, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.plugin.UserBookNativePluginProxy$getWordCollectionState$2", f = "PluginRepo.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super h4>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f91840a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f91842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f91842c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return g.this.new b(this.f91842c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super h4> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f91840a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (g.this.f91833a instanceof d1.d) {
                    return ((d1.d) g.this.f91833a).f(this.f91842c);
                }
                if (!(g.this.f91833a instanceof d1.e)) {
                    throw new IllegalArgumentException("Unsupported plugin type: " + o0.d(g.this.f91833a.getClass()));
                }
                d1.e eVar = (d1.e) g.this.f91833a;
                int i12 = this.f91842c;
                this.f91840a = 1;
                obj = eVar.c(i12, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return (h4) obj;
        }
    }

    public g(@k d1 plugin, @k c7.e deviceRepo) {
        g0.p(plugin, "plugin");
        g0.p(deviceRepo, "deviceRepo");
        this.f91833a = plugin;
        this.f91834b = deviceRepo;
    }

    @Override // u5.a.c
    @l
    public Object b(int i11, int i12, @k List<Long> list, @k j00.c<? super g2> cVar) {
        m0 b11;
        b11 = e.b(this.f91834b);
        Object h11 = i.h(b11, new a(i11, i12, list, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // u5.a.c
    @l
    public Object c(int i11, @k j00.c<? super h4> cVar) {
        m0 b11;
        b11 = e.b(this.f91834b);
        return i.h(b11, new b(i11, null), cVar);
    }
}
