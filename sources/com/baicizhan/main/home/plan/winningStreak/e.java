package com.baicizhan.main.home.plan.winningStreak;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c40.r0;
import com.baicizhan.main.home.plan.winningStreak.a;
import com.baicizhan.main.home.plan.winningStreak.b;
import com.baicizhan.main.home.plan.winningStreak.c;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import sg.e0;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@u0({"SMAP\nWinningStreakVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakVm.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes4.dex */
public final class e extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final int f23010g = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.client.business.managers.winningstreak.a f23011a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final aa.a f23012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u9.d f23013c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u9.f f23014d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final y<sg.c> f23015e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final m0<sg.c> f23016f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.winningStreak.WinningStreakVM$refresh$1", f = "WinningStreakVm.kt", i = {0, 0}, l = {78}, m = "invokeSuspend", n = {"it", "$i$a$-also-WinningStreakVM$refresh$1$3"}, s = {"L$1", "I$0"}, v = 1)
    @u0({"SMAP\nWinningStreakVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakVm.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakVM$refresh$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
    public static final class a extends SuspendLambda implements p<j<? super Boolean>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f23017a;

        /* renamed from: b, reason: collision with root package name */
        public Object f23018b;

        /* renamed from: c, reason: collision with root package name */
        public int f23019c;

        /* renamed from: d, reason: collision with root package name */
        public int f23020d;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23020d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.main.home.plan.winningStreak.c i12 = ((sg.c) e.this.f23015e.getValue()).i();
                c.b bVar = i12 instanceof c.b ? (c.b) i12 : null;
                if (bVar != null) {
                    e eVar = e.this;
                    if (bVar.f() != WinningStreakStatus.ComeOn || eVar.f23012b.currentTimeMillis() < eVar.h(eVar.f23012b.currentTimeMillis())) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        e eVar2 = e.this;
                        y yVar = eVar2.f23015e;
                        sg.c f11 = sg.c.f((sg.c) eVar2.f23015e.getValue(), c.b.d(bVar, 0, WinningStreakStatus.Hint, 1, null), null, null, false, 14, null);
                        this.f23017a = bVar;
                        this.f23018b = l00.k.a(bVar);
                        this.f23019c = 0;
                        this.f23020d = 1;
                        if (yVar.emit(f11, this) == l11) {
                            return l11;
                        }
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

        @Override // x00.p
        public final Object invoke(j<? super Boolean> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.winningStreak.WinningStreakVM$refresh$2", f = "WinningStreakVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements q<j<? super Boolean>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23022a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23023b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f23023b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(e0.f88462a, "", th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(j<? super Boolean> jVar, Throwable th2, j00.c<? super g2> cVar) {
            b bVar = new b(cVar);
            bVar.f23023b = th2;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.winningStreak.WinningStreakVM$refresh$3", f = "WinningStreakVm.kt", i = {0}, l = {84}, m = "invokeSuspend", n = {"it"}, s = {"Z$0"}, v = 1)
    public static final class c extends SuspendLambda implements p<Boolean, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23024a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f23025b;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = e.this.new c(cVar);
            cVar2.f23025b = ((Boolean) obj).booleanValue();
            return cVar2;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f23025b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23024a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.i(e0.f88462a, "", l00.a.a(z11));
                y yVar = e.this.f23015e;
                sg.c f11 = sg.c.f(e.this.f(), null, null, null, ((sg.c) e.this.f23015e.getValue()).j(), 7, null);
                this.f23025b = z11;
                this.f23024a = 1;
                if (yVar.emit(f11, this) == l11) {
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

        public final Object invoke(boolean z11, j00.c<? super g2> cVar) {
            return ((c) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.winningStreak.WinningStreakVM$refresh$4", f = "WinningStreakVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements q<j<? super Boolean>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23027a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23028b;

        public d(j00.c<? super d> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f23028b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(e0.f88462a, "", th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(j<? super Boolean> jVar, Throwable th2, j00.c<? super g2> cVar) {
            d dVar = new d(cVar);
            dVar.f23028b = th2;
            return dVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.winningStreak.WinningStreakVM$refresh$5", f = "WinningStreakVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.main.home.plan.winningStreak.e$e, reason: collision with other inner class name */
    public static final class C0318e extends SuspendLambda implements q<j<? super Boolean>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23029a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23030b;

        public C0318e(j00.c<? super C0318e> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f23030b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23029a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.c(e0.f88462a, "", th2);
            return g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(j<? super Boolean> jVar, Throwable th2, j00.c<? super g2> cVar) {
            C0318e c0318e = new C0318e(cVar);
            c0318e.f23030b = th2;
            return c0318e.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.winningStreak.WinningStreakVM$themeChange$1", f = "WinningStreakVm.kt", i = {0, 0}, l = {65}, m = "invokeSuspend", n = {"it", "$i$a$-also-WinningStreakVM$themeChange$1$2"}, s = {"L$1", "I$0"}, v = 1)
    @u0({"SMAP\nWinningStreakVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakVm.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakVM$themeChange$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f23031a;

        /* renamed from: b, reason: collision with root package name */
        public Object f23032b;

        /* renamed from: c, reason: collision with root package name */
        public int f23033c;

        /* renamed from: d, reason: collision with root package name */
        public int f23034d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f23036f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z11, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f23036f = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new f(this.f23036f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23034d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Object value = e.this.f23015e.getValue();
                if (((sg.c) value).j() == this.f23036f) {
                    value = null;
                }
                sg.c cVar = (sg.c) value;
                if (cVar != null) {
                    e eVar = e.this;
                    boolean z11 = this.f23036f;
                    y yVar = eVar.f23015e;
                    sg.c f11 = sg.c.f(cVar, null, null, null, z11, 7, null);
                    this.f23031a = cVar;
                    this.f23032b = l00.k.a(cVar);
                    this.f23033c = 0;
                    this.f23034d = 1;
                    if (yVar.emit(f11, this) == l11) {
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

    @Inject
    public e(@k com.baicizhan.client.business.managers.winningstreak.a repo, @k aa.a serverTime, @k u9.d expRepo, @k u9.f taskRepo) {
        g0.p(repo, "repo");
        g0.p(serverTime, "serverTime");
        g0.p(expRepo, "expRepo");
        g0.p(taskRepo, "taskRepo");
        this.f23011a = repo;
        this.f23012b = serverTime;
        this.f23013c = expRepo;
        this.f23014d = taskRepo;
        y<sg.c> a11 = o0.a(f());
        this.f23015e = a11;
        this.f23016f = a11;
    }

    public final sg.c f() {
        return new sg.c(g(), (this.f23011a.g() ? this : null) != null ? this.f23011a.c().d() ? new b.C0317b(TaskStatus.Hint) : new b.C0317b(TaskStatus.Normal) : b.a.f22992b, (this.f23011a.d() ? this : null) != null ? new a.b(RankingStatus.Normal) : a.C0316a.f22987b, false, 8, null);
    }

    public final com.baicizhan.main.home.plan.winningStreak.c g() {
        if (!this.f23011a.enable()) {
            return c.a.f22997b;
        }
        com.baicizhan.client.business.managers.winningstreak.f b11 = this.f23011a.b();
        return new c.b(b11.e(), b11.f() >= com.baicizhan.client.business.managers.winningstreak.b.c(this.f23012b.currentTimeMillis()) ? WinningStreakStatus.Finish : (b11.f() >= com.baicizhan.client.business.managers.winningstreak.b.c(this.f23012b.currentTimeMillis()) || this.f23012b.currentTimeMillis() < h(this.f23012b.currentTimeMillis())) ? WinningStreakStatus.ComeOn : WinningStreakStatus.Hint);
    }

    public final long h(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 18);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @k
    public final m0<sg.c> i() {
        return this.f23016f;
    }

    public final void j() {
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.o1(this.f23011a.a(), new a(null)), new b(null)), new c(null)), ViewModelKt.getViewModelScope(this));
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(this.f23013c.a(), new d(null)), ViewModelKt.getViewModelScope(this));
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(this.f23014d.a(), new C0318e(null)), ViewModelKt.getViewModelScope(this));
    }

    public final void k(boolean z11) {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new f(z11, null), 3, null);
    }
}
