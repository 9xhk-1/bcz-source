package pg;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import c40.l3;
import c40.x1;
import com.baicizhan.client.business.dataset.models.OfflineStateRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.jiongji.andriod.card.R;
import gi.x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nMainControlModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainControlModule.kt\ncom/baicizhan/main/home/plan/module/MainControlModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u0 f80487a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f80488b = "LearnInfoTAG.MainControlModule";

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static qb0.h f80489c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f80490d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c40.r0 f80491e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.x<Boolean> f80492f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.i<Boolean> f80493g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final LiveData<Boolean> f80494h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final MutableLiveData<Boolean> f80495i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final MutableLiveData<Integer> f80496j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final MutableLiveData<Throwable> f80497k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.x<Boolean> f80498l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.i<Boolean> f80499m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public static qb0.h f80500n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f80501o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.module.MainControlModule$1", f = "MainControlModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<Boolean, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f80502a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f80503b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f80503b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f80503b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f80502a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.i(u0.f80488b, "refreshFlow value " + z11, new Object[0]);
            return g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super g2> cVar) {
            return ((a) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.module.MainControlModule$clear$1", f = "MainControlModule.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f80504a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f80504a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.i(u0.f80488b, kc.o.N, new Object[0]);
                kotlinx.coroutines.flow.x xVar = u0.f80492f;
                Boolean a11 = l00.a.a(false);
                this.f80504a = 1;
                if (xVar.emit(a11, this) == l11) {
                    return l11;
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
    @l00.d(c = "com.baicizhan.main.home.plan.module.MainControlModule$initSchedulePrepareBbs$1$1", f = "MainControlModule.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f80505a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Boolean f80506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f80506b = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f80506b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f80505a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.x xVar = u0.f80492f;
                Boolean bool = this.f80506b;
                kotlin.jvm.internal.g0.m(bool);
                this.f80505a = 1;
                if (xVar.emit(bool, this) == l11) {
                    return l11;
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

    static {
        u0 u0Var = new u0();
        f80487a = u0Var;
        f80490d = yz.e0.c(new x00.a() { // from class: pg.p0
            @Override // x00.a
            public final Object invoke() {
                Application l11;
                l11 = u0.l();
                return l11;
            }
        });
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.g0.o(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        c40.r0 a11 = c40.s0.a(x1.d(newSingleThreadExecutor).plus(l3.c(null, 1, null)));
        f80491e = a11;
        kotlinx.coroutines.flow.x<Boolean> a12 = kotlinx.coroutines.flow.e0.a(1, 2, BufferOverflow.SUSPEND);
        f80492f = a12;
        f80493g = a12;
        f80494h = FlowLiveDataConversions.asLiveData$default(a12, (kotlin.coroutines.d) null, 0L, 3, (Object) null);
        f80495i = new MutableLiveData<>();
        f80496j = new MutableLiveData<>();
        f80497k = new MutableLiveData<>();
        kotlinx.coroutines.flow.x<Boolean> a13 = kotlinx.coroutines.flow.e0.a(1, 1, BufferOverflow.DROP_OLDEST);
        f80498l = a13;
        f80499m = a13;
        u0Var.t();
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(a12, new a(null)), a11);
        f80501o = 8;
    }

    public static final void A() {
        if (rb.d.f(f80487a.n())) {
            BookListManager.getInstance().setLockModify(false, null);
        }
    }

    public static final g2 B(Integer num) {
        if (num.intValue() > 0) {
            ia.a.l(ia.a.f60467r, System.currentTimeMillis());
        }
        x.a aVar = new x.a();
        aVar.f53864a = num.intValue();
        i80.c.f().q(aVar);
        return g2.f100423a;
    }

    public static final void C(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void D(Throwable th2) {
        qb.c.c(f80488b, "", th2);
    }

    public static final Application l() {
        return pb.a.a();
    }

    public static final g2 u(Boolean bool) {
        qb.c.i(f80488b, String.valueOf(bool), new Object[0]);
        c40.k.f(f80491e, null, null, new c(bool, null), 3, null);
        return g2.f100423a;
    }

    public static final void v(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void w(Throwable th2) {
        qb.c.c(f80488b, "", th2);
    }

    public final void E(int i11) {
        OfflineStateRecord m11 = q9.x.r().m();
        if (m11 == null) {
            return;
        }
        int H = LearnRecordManager.A().H();
        int i12 = q9.x.r().k().dailyCount;
        int E = LearnRecordManager.A().E();
        int min = Math.min(E, i11) + H;
        int i13 = min - i12;
        qb.c.b(f80488b, "wantMore compute: 今日已新学 " + H + ", 计划新学 " + i12 + ", 想要今天新学 " + min + " , 剩余 " + E + " 实际加量个数 " + i13, new Object[0]);
        q9.x.r().B0(min);
        m11.wantMoreCount = i13;
        i9.a.p(n(), m11);
        ad.a s11 = q9.x.r().s();
        s11.w(min, sh.e.b());
        s11.D(null);
    }

    public final void j() {
        int l11 = q9.x.r().l();
        qb.c.b(f80488b, "checkResource " + l11, new Object[0]);
        sh.m.g().c();
        sh.w.g().evictAll();
        if (sh.d.s().n() != l11) {
            sh.d.s().x(n(), l11);
        }
    }

    public final void k() {
        c40.k.f(f80491e, null, null, new b(null), 3, null);
        f80495i.postValue(Boolean.FALSE);
        f80496j.postValue(null);
        f80497k.postValue(null);
    }

    @m80.k
    public final MutableLiveData<Integer> m() {
        return f80496j;
    }

    public final Application n() {
        return (Application) f80490d.getValue();
    }

    @m80.k
    public final MutableLiveData<Throwable> o() {
        return f80497k;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<Boolean> p() {
        return f80499m;
    }

    @m80.k
    public final LiveData<Boolean> q() {
        return f80494h;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<Boolean> r() {
        return f80493g;
    }

    @m80.k
    public final MutableLiveData<Boolean> s() {
        return f80495i;
    }

    public final void t() {
        qb0.h hVar = f80489c;
        if (hVar == null) {
            rx.c<Boolean> I3 = SchedulePrepareObservables.E().I3(tb0.a.a());
            final x00.l lVar = new x00.l() { // from class: pg.m0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 u11;
                    u11 = u0.u((Boolean) obj);
                    return u11;
                }
            };
            hVar = I3.u5(new wb0.b() { // from class: pg.n0
                @Override // wb0.b
                public final void call(Object obj) {
                    u0.v(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: pg.o0
                @Override // wb0.b
                public final void call(Object obj) {
                    u0.w((Throwable) obj);
                }
            });
        }
        f80489c = hVar;
    }

    public final void x() {
        f80498l.d(Boolean.TRUE);
    }

    public final void y() {
        z();
        j();
        hi.d.e();
    }

    public final void z() {
        qb.c.i(f80488b, "uploadLearnRecord", new Object[0]);
        qb0.h hVar = f80500n;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<Integer> I3 = LearnRecordManager.A().c0(n()).w5(bc0.c.e()).I3(tb0.a.a()).G1(new wb0.a() { // from class: pg.q0
            @Override // wb0.a
            public final void call() {
                u0.A();
            }
        }).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: pg.r0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B;
                B = u0.B((Integer) obj);
                return B;
            }
        };
        f80500n = I3.u5(new wb0.b() { // from class: pg.s0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.C(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: pg.t0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.D((Throwable) obj);
            }
        });
        if (rb.d.f(n())) {
            BookListManager.getInstance().setLockModify(true, n().getString(R.string.lock_schedule_modify_reason_upload));
        }
    }
}
