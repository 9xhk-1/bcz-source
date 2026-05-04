package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.n2;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.y0;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.plan.allinone.c1;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import com.baicizhan.main.home.plan.module.exam.Progress;
import com.baicizhan.online.user_study_api.StudyHome;
import com.jiongji.andriod.card.R;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import se.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@kotlin.jvm.internal.u0({"SMAP\nAdjustClassicVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdjustClassicVm.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/AdjustClassicVm\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,677:1\n1#2:678\n*E\n"})
/* loaded from: classes4.dex */
public final class e extends ViewModel implements DefaultLifecycleObserver {

    @m80.k
    public static final a Q = new a(null);
    public static final int R = 8;

    @m80.k
    public static final String S = "AdjustVm";

    @m80.k
    public final ClickProtectedEvent<Serializable> A;

    @m80.k
    public final LiveData<Boolean> B;

    @m80.k
    public final MutableLiveData<Boolean> C;
    public BookRecord D;
    public boolean E;
    public int F;
    public int G;
    public final int H;
    public long I;
    public long J;

    @m80.k
    public final ScheduleType K;
    public com.baicizhan.main.activity.schedule_v2.adjustschedule.a L;

    @m80.k
    public final yz.c0 M;

    @m80.l
    public qb0.h N;

    @m80.l
    public qb0.h O;

    @m80.l
    public qb0.h P;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final qg.q0 f19071a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.plan.allinone.e1 f19072b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.s f19073c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final oe.b1 f19074d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Application f19075e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<String>> f19076f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<y0> f19077g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19078h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19079i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Long> f19080j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19081k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<r2> f19082l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<n2> f19083m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19084n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19085o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19086p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19087q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<String> f19088r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f19089s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Integer> f19090t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<ScheduleStatus> f19091u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<LearnCardStatus> f19092v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Integer> f19093w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Integer> f19094x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Integer> f19095y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f19096z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustClassicVm$confirmChangeForFavoritesPlan$1", f = "AdjustClassicVm.kt", i = {}, l = {505}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19098a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object b11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19098a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                e.this.J().setValue(l00.a.a(true));
                ki.c a11 = ki.e.a();
                long j11 = e.this.J;
                long j12 = e.this.I;
                int i12 = e.this.G;
                this.f19098a = 1;
                cVar = this;
                b11 = a11.b(j11, j12, i12, cVar);
                if (b11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                b11 = ((Result) obj).m6317unboximpl();
                cVar = this;
            }
            e eVar = e.this;
            if (Result.m6315isSuccessimpl(b11)) {
                eVar.J().setValue(l00.a.a(false));
                eVar.C().setValue(new Pair(l00.a.g(eVar.I), l00.a.f(eVar.G)));
            }
            e eVar2 = e.this;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(b11);
            if (m6311exceptionOrNullimpl != null) {
                eVar2.J().setValue(l00.a.a(false));
                va.g.k(m6311exceptionOrNullimpl, R.string.schedule_unknow_error, 0);
                qb.c.c(e.S, "set failed ", m6311exceptionOrNullimpl);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustClassicVm$confirmReset$2$1", f = "AdjustClassicVm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.main.activity.schedule_v2.adjustschedule.e$e, reason: collision with other inner class name */
    public static final class C0294e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19101a;

        public C0294e(j00.c<? super C0294e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new C0294e(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((C0294e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19101a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (ch.m.f8648a.a() instanceof e.a) {
                e.this.f19072b.b();
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends qb0.g<Integer> {
        public f() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            kotlin.jvm.internal.g0.p(e11, "e");
            va.g.k(e11, R.string.schedule_unknow_error, 1);
            e.this.J().postValue(Boolean.FALSE);
            qb.c.c(e.S, "", e11);
        }

        @Override // qb0.g
        public void onStart() {
            e.this.J().postValue(Boolean.TRUE);
        }

        @Override // qb0.c
        public void onNext(Integer num) {
            e.this.e0();
            va.g.g(R.string.schedule_already_reset, 1);
            e.this.J().postValue(Boolean.FALSE);
            e.this.w().postValue(Boolean.TRUE);
            pg.x0 x0Var = pg.x0.f80512a;
            BookRecord bookRecord = e.this.D;
            if (bookRecord == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord = null;
            }
            x0Var.f(bookRecord.bookId);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustClassicVm$mutiMode$1", f = "AdjustClassicVm.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<LiveDataScope<Boolean>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19104a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19105b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ oe.b1 f19106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oe.b1 b1Var, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f19106c = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            g gVar = new g(this.f19106c, cVar);
            gVar.f19105b = obj;
            return gVar;
        }

        @Override // x00.p
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, j00.c<? super yz.g2> cVar) {
            return ((g) create(liveDataScope, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope = (LiveDataScope) this.f19105b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f19104a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Boolean a11 = l00.a.a(a00.a0.B8(new ScheduleType[]{ScheduleType.ADJUST, ScheduleType.ADJUST_BY_DEVICE}, this.f19106c.d()) && !com.baicizhan.base.a.a(KotlinExtKt.getGlobalApplicationContext()));
                this.f19105b = l00.k.a(liveDataScope);
                this.f19104a = 1;
                if (liveDataScope.emit(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    @Inject
    public e(@m80.k oe.b1 shareVM, @m80.k Application application, @m80.k qg.q0 getExamStatus, @m80.k com.baicizhan.main.home.plan.allinone.e1 homeRepo, @m80.k com.baicizhan.main.home.experiment.repo.s gameHomeRepo) {
        kotlin.jvm.internal.g0.p(shareVM, "shareVM");
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(getExamStatus, "getExamStatus");
        kotlin.jvm.internal.g0.p(homeRepo, "homeRepo");
        kotlin.jvm.internal.g0.p(gameHomeRepo, "gameHomeRepo");
        this.f19071a = getExamStatus;
        this.f19072b = homeRepo;
        this.f19073c = gameHomeRepo;
        this.f19074d = shareVM;
        this.f19075e = application;
        this.f19076f = new MutableLiveData<>();
        this.f19077g = new MutableLiveData<>();
        this.f19078h = new SingleLiveEvent<>();
        this.f19079i = new SingleLiveEvent<>();
        this.f19080j = new SingleLiveEvent<>();
        this.f19081k = new SingleLiveEvent<>();
        this.f19082l = new SingleLiveEvent<>();
        this.f19083m = new SingleLiveEvent<>();
        this.f19084n = new SingleLiveEvent<>();
        this.f19085o = new SingleLiveEvent<>();
        this.f19086p = new SingleLiveEvent<>();
        this.f19087q = new SingleLiveEvent<>();
        this.f19088r = new SingleLiveEvent<>();
        this.f19089s = new SingleLiveEvent<>();
        this.f19090t = new SingleLiveEvent<>();
        this.f19091u = new SingleLiveEvent<>();
        this.f19092v = new SingleLiveEvent<>();
        this.f19093w = new ClickProtectedEvent<>();
        this.f19094x = new ClickProtectedEvent<>();
        this.f19095y = new ClickProtectedEvent<>();
        this.f19096z = new SingleLiveEvent<>();
        this.A = new ClickProtectedEvent<>();
        this.B = CoroutineLiveDataKt.liveData$default((kotlin.coroutines.d) null, 0L, new g(shareVM, null), 3, (Object) null);
        this.C = new MutableLiveData<>();
        this.H = shareVM.b();
        this.I = -1L;
        this.K = shareVM.d();
        this.M = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.b
            @Override // x00.a
            public final Object invoke() {
                pg.l0 a02;
                a02 = e.a0();
                return a02;
            }
        });
    }

    public static final pg.l0 a0() {
        return new pg.l0();
    }

    public static /* synthetic */ void j0(e eVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        eVar.i0(z11);
    }

    public static /* synthetic */ void m(e eVar, com.baicizhan.main.activity.schedule_v2.mutimode.data.e eVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar2 = e.f.f19312d;
        }
        eVar.l(eVar2);
    }

    public static final yz.g2 q(e eVar, Integer num) {
        c40.j.b(null, eVar.new C0294e(null), 1, null);
        return yz.g2.f100423a;
    }

    public static final void r(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @m80.k
    public final MutableLiveData<y0> A() {
        return this.f19077g;
    }

    @m80.k
    public final SingleLiveEvent<Integer> B() {
        return this.f19081k;
    }

    @m80.k
    public final ClickProtectedEvent<Serializable> C() {
        return this.A;
    }

    @m80.k
    public final SingleLiveEvent<Long> D() {
        return this.f19080j;
    }

    public final Pair<String, String> F() {
        Application application = this.f19075e;
        return new Pair<>(application.getString(R.string.schedule_manager_pick_item_day), application.getString(R.string.schedule_manager_pick_item_word));
    }

    @m80.k
    public final qg.q0 G() {
        return this.f19071a;
    }

    @m80.k
    public final pg.l0 H() {
        return (pg.l0) this.M.getValue();
    }

    @m80.k
    public final SingleLiveEvent<LearnCardStatus> I() {
        return this.f19092v;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> J() {
        return this.f19096z;
    }

    @m80.k
    public final LiveData<Boolean> K() {
        return this.B;
    }

    @m80.k
    public final SingleLiveEvent<String> L() {
        return this.f19088r;
    }

    @m80.k
    public final SingleLiveEvent<String> M() {
        return this.f19087q;
    }

    @m80.k
    public final LiveData<Boolean> N() {
        return this.C;
    }

    @m80.k
    public final SingleLiveEvent<r2> O() {
        return this.f19082l;
    }

    @m80.k
    public final SingleLiveEvent<n2> P() {
        return this.f19083m;
    }

    @m80.k
    public final SingleLiveEvent<Integer> Q() {
        return this.f19090t;
    }

    @m80.k
    public final ClickProtectedEvent<Integer> R() {
        return this.f19093w;
    }

    @m80.k
    public final ClickProtectedEvent<Integer> S() {
        return this.f19094x;
    }

    @m80.k
    public final ClickProtectedEvent<Integer> T() {
        return this.f19095y;
    }

    public final String U() {
        return oe.d1.d(this.f19074d.d()) ? this.f19074d.c() : "";
    }

    @m80.k
    public final SingleLiveEvent<Integer> V() {
        return this.f19079i;
    }

    @m80.k
    public final MutableLiveData<List<String>> W() {
        return this.f19076f;
    }

    public final void X() {
        r2 r2Var;
        LearnCardStatus status;
        Progress progress;
        g0();
        ch.m mVar = ch.m.f8648a;
        com.baicizhan.main.activity.schedule_v2.mutimode.data.e a11 = mVar.a();
        BookRecord bookRecord = null;
        if (a11 instanceof e.g) {
            JsModel a12 = this.f19071a.a();
            if (a12 != null && (progress = a12.getProgress()) != null) {
                r2Var = new r2(progress.getFinishedWordsCount(), progress.getTotalWordsCount(), 0, 4, null);
            }
            r2Var = null;
        } else {
            if (a11 instanceof e.a) {
                com.baicizhan.main.home.plan.allinone.c1 value = this.f19072b.c().getValue();
                c1.a aVar = value instanceof c1.a ? (c1.a) value : null;
                if (aVar != null) {
                    BookRecord bookRecord2 = this.D;
                    if (bookRecord2 == null) {
                        kotlin.jvm.internal.g0.S("currentBook");
                        bookRecord2 = null;
                    }
                    bookRecord2.wordCount = aVar.d().progress.total;
                    r2Var = new r2(aVar.d().progress.learned, aVar.d().progress.total, aVar.d().progress.mastered);
                }
            }
            r2Var = null;
        }
        if (r2Var == null) {
            BookRecord bookRecord3 = this.D;
            if (bookRecord3 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord3 = null;
            }
            if (bookRecord3.isFinished()) {
                r2Var = new r2(H().d().p(), H().d().c(), 0, 4, null);
            } else {
                BookRecord bookRecord4 = this.D;
                if (bookRecord4 == null) {
                    kotlin.jvm.internal.g0.S("currentBook");
                    bookRecord4 = null;
                }
                int i11 = bookRecord4.finishCount;
                BookRecord bookRecord5 = this.D;
                if (bookRecord5 == null) {
                    kotlin.jvm.internal.g0.S("currentBook");
                    bookRecord5 = null;
                }
                r2Var = new r2(i11, bookRecord5.wordCount, 0, 4, null);
            }
        }
        this.f19082l.postValue(r2Var);
        SingleLiveEvent<LearnCardStatus> singleLiveEvent = this.f19092v;
        com.baicizhan.main.activity.schedule_v2.mutimode.data.e a13 = mVar.a();
        if (a13 instanceof e.g) {
            JsModel a14 = this.f19071a.a();
            if (a14 != null) {
                if (a14 instanceof JsModel.FinishAll) {
                    if ((((JsModel.FinishAll) a14).getRound() == 0 ? this : null) != null) {
                        status = LearnCardStatus.ALL_FINISHING_LEARNING_TODAY;
                    }
                } else if (a14 instanceof JsModel.AllRemoved) {
                    status = LearnCardStatus.ALL_KILLED_TODAY;
                }
            }
            status = null;
        } else if (a13 instanceof e.a) {
            com.baicizhan.main.home.plan.allinone.c1 value2 = this.f19072b.c().getValue();
            c1.a aVar2 = value2 instanceof c1.a ? (c1.a) value2 : null;
            if (aVar2 != null) {
                status = aVar2.d().today_progresss.book_finished ? LearnCardStatus.ALL_KILLED_TODAY : aVar2.d().today_progresss.learning_finished_today ? LearnCardStatus.ALL_FINISHING_LEARNING_TODAY : LearnCardStatus.LEARNING;
            }
            status = null;
        } else {
            status = H().d().getStatus();
        }
        if (status == null) {
            status = LearnCardStatus.LEARNING;
        }
        singleLiveEvent.setValue(status);
        if (mVar.a() instanceof e.a) {
            com.baicizhan.main.home.plan.allinone.c1 value3 = this.f19072b.c().getValue();
            c1.a aVar3 = value3 instanceof c1.a ? (c1.a) value3 : null;
            if (aVar3 != null) {
                this.f19091u.postValue(aVar3.d().progress.learned >= aVar3.d().progress.total ? ScheduleStatus.ALLINONE_REVIEW : ScheduleStatus.NORMAL_NEW);
                return;
            }
            return;
        }
        SingleLiveEvent<ScheduleStatus> singleLiveEvent2 = this.f19091u;
        BookRecord bookRecord6 = this.D;
        if (bookRecord6 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
        } else {
            bookRecord = bookRecord6;
        }
        singleLiveEvent2.postValue(s2.a(bookRecord, this.f19092v.getValue()));
    }

    public final void Y(int i11) {
        BookRecord bookById = BookListManager.getInstance().getBookById(i11);
        kotlin.jvm.internal.g0.o(bookById, "getBookById(...)");
        this.D = bookById;
        this.E = false;
        this.F = 0;
        this.G = se.f.f88374a.g(i11, U());
        this.f19091u.postValue(ScheduleStatus.NORMAL_NEW);
        SingleLiveEvent<r2> singleLiveEvent = this.f19082l;
        BookRecord bookRecord = this.D;
        if (bookRecord == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord = null;
        }
        singleLiveEvent.postValue(new r2(0, bookRecord.wordCount, 0, 4, null));
    }

    public final void Z(int i11, String str) {
        Pair<String, String> F = F();
        a1 a1Var = new a1(F.getFirst(), F.getSecond());
        this.L = a1Var;
        a1Var.m();
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar = this.L;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar2 = null;
        if (aVar == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar = null;
        }
        if (aVar.j(this.G) < 0) {
            com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar3 = this.L;
            if (aVar3 == null) {
                kotlin.jvm.internal.g0.S("dataProvider");
                aVar3 = null;
            }
            aVar3.k(BookRecord.computeDaysByWords(i11, this.G), this.G);
            qb.c.i(S, "fav book, select not found %d", Integer.valueOf(this.G));
        }
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar4 = this.L;
        if (aVar4 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar4 = null;
        }
        aVar4.l(i11);
        MutableLiveData<List<String>> mutableLiveData = this.f19076f;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar5 = this.L;
        if (aVar5 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar5 = null;
        }
        mutableLiveData.postValue(aVar5.i());
        MutableLiveData<y0> mutableLiveData2 = this.f19077g;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar6 = this.L;
        if (aVar6 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
        } else {
            aVar2 = aVar6;
        }
        List<String> c11 = aVar2.c();
        kotlin.jvm.internal.g0.o(c11, "getDayList(...)");
        mutableLiveData2.postValue(new y0.b(c11));
        i0(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (u30.k0.n3(U(), "小学", false, 2, null) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (u30.k0.n3(r0, "小学", false, 2, null) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (20 > r6.G) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0() {
        /*
            r6 = this;
            com.baicizhan.client.business.managers.booklist.BookListManager r0 = com.baicizhan.client.business.managers.booklist.BookListManager.getInstance()
            com.baicizhan.client.business.dataset.models.BookRecord r1 = r6.D
            r2 = 0
            if (r1 != 0) goto Lf
            java.lang.String r1 = "currentBook"
            kotlin.jvm.internal.g0.S(r1)
            r1 = r2
        Lf:
            int r1 = r1.bookId
            com.baicizhan.client.business.dataset.models.BookCategory r0 = r0.getCategoryByBookId(r1)
            r1 = 2
            java.lang.String r3 = "小学"
            r4 = 0
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getCategoryTagName()
            java.lang.String r5 = "getCategoryTagName(...)"
            kotlin.jvm.internal.g0.o(r0, r5)
            boolean r0 = u30.k0.n3(r0, r3, r4, r1, r2)
            if (r0 != 0) goto L34
        L2a:
            java.lang.String r0 = r6.U()
            boolean r0 = u30.k0.n3(r0, r3, r4, r1, r2)
            if (r0 == 0) goto L3c
        L34:
            r0 = 20
            int r1 = r6.G
            if (r0 > r1) goto L3c
            r0 = 1
            return r0
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.adjustschedule.e.b0():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.adjustschedule.e.c0():void");
    }

    public final void d0() {
        ClickProtectedEvent<Integer> clickProtectedEvent = this.f19095y;
        BookRecord bookRecord = this.D;
        if (bookRecord == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord = null;
        }
        clickProtectedEvent.postValue(Integer.valueOf(bookRecord.finishCount));
    }

    public final void e0() {
        SingleLiveEvent<r2> singleLiveEvent = this.f19082l;
        BookRecord bookRecord = this.D;
        if (bookRecord == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord = null;
        }
        singleLiveEvent.postValue(new r2(0, bookRecord.wordCount, 0, 4, null));
        BookRecord bookRecord2 = this.D;
        if (bookRecord2 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord2 = null;
        }
        bookRecord2.finishCount = 0;
        BookRecord bookRecord3 = this.D;
        if (bookRecord3 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord3 = null;
        }
        bookRecord3.masteredCount = 0;
        this.f19090t.postValue(0);
        this.f19092v.setValue(LearnCardStatus.LEARNING);
        this.F = 0;
        this.f19091u.postValue(ScheduleStatus.NORMAL_NEW);
        BookRecord bookRecord4 = this.D;
        if (bookRecord4 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord4 = null;
        }
        int i11 = bookRecord4.dailyCount;
        this.G = i11;
        if (i11 <= 0) {
            se.f fVar = se.f.f88374a;
            BookRecord bookRecord5 = this.D;
            if (bookRecord5 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord5 = null;
            }
            this.G = fVar.g(bookRecord5.bookId, U());
        }
        MutableLiveData<y0> mutableLiveData = this.f19077g;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar = this.L;
        if (aVar == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar = null;
        }
        List<String> c11 = aVar.c();
        kotlin.jvm.internal.g0.o(c11, "getDayList(...)");
        mutableLiveData.postValue(new y0.b(c11));
        j0(this, false, 1, null);
    }

    public final void f0() {
        BookRecord bookRecord = this.D;
        if (bookRecord == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord = null;
        }
        int i11 = bookRecord.wordCount;
        BookRecord bookRecord2 = this.D;
        if (bookRecord2 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord2 = null;
        }
        float f11 = (i11 - bookRecord2.finishCount) * 24.0f;
        if (f11 >= 3600.0f) {
            SingleLiveEvent<String> singleLiveEvent = this.f19088r;
            singleLiveEvent.postValue(((int) Math.rint(f11 / 3600)) + "小时");
            return;
        }
        if (f11 < 60.0f) {
            if (f11 > 0.0f) {
                this.f19088r.postValue("1分钟");
                return;
            } else {
                this.f19088r.postValue(null);
                return;
            }
        }
        SingleLiveEvent<String> singleLiveEvent2 = this.f19088r;
        singleLiveEvent2.postValue(((int) Math.rint(f11 / 60.0f)) + "分钟");
    }

    public final void g0() {
        int i11;
        StudyHome d11;
        this.D = new BookRecord();
        ScheduleRecord o11 = q9.x.r().o();
        BookRecord bookRecord = null;
        if (o11 != null) {
            BookRecord bookRecord2 = this.D;
            if (bookRecord2 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord2 = null;
            }
            bookRecord2.bookId = o11.bookId;
            BookRecord bookRecord3 = this.D;
            if (bookRecord3 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord3 = null;
            }
            bookRecord3.dailyCount = o11.dailyCount;
            BookRecord bookRecord4 = this.D;
            if (bookRecord4 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord4 = null;
            }
            bookRecord4.wordCount = q9.x.r().A();
            BookRecord bookRecord5 = this.D;
            if (bookRecord5 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord5 = null;
            }
            bookRecord5.reviewCount = o11.reviewCount;
            BookRecord bookRecord6 = this.D;
            if (bookRecord6 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord6 = null;
            }
            bookRecord6.finishCount = LearnRecordManager.A().y();
            BookRecord bookRecord7 = this.D;
            if (bookRecord7 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord7 = null;
            }
            bookRecord7.bookName = o11.bookName;
            BookRecord bookRecord8 = this.D;
            if (bookRecord8 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord8 = null;
            }
            bookRecord8.descImage = o11.descImage;
            BookRecord bookRecord9 = this.D;
            if (bookRecord9 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord9 = null;
            }
            bookRecord9.description = o11.desc;
        }
        this.E = true;
        if (!(ch.m.f8648a.a() instanceof e.a)) {
            BookRecord bookRecord10 = this.D;
            if (bookRecord10 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord10 = null;
            }
            if (bookRecord10.getRemainCountNotIncludeToday() > 0) {
                BookRecord bookRecord11 = this.D;
                if (bookRecord11 == null) {
                    kotlin.jvm.internal.g0.S("currentBook");
                } else {
                    bookRecord = bookRecord11;
                }
                i11 = bookRecord.dailyCount;
            } else {
                BookRecord bookRecord12 = this.D;
                if (bookRecord12 == null) {
                    kotlin.jvm.internal.g0.S("currentBook");
                } else {
                    bookRecord = bookRecord12;
                }
                i11 = bookRecord.reviewCount;
            }
            int intValue = Integer.valueOf(i11).intValue();
            this.F = intValue;
            this.G = intValue;
            return;
        }
        com.baicizhan.main.home.plan.allinone.c1 value = this.f19072b.c().getValue();
        c1.a aVar = value instanceof c1.a ? (c1.a) value : null;
        if (aVar != null && (d11 = aVar.d()) != null) {
            BookRecord bookRecord13 = this.D;
            if (bookRecord13 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord13 = null;
            }
            bookRecord13.wordCount = d11.progress.total;
            BookRecord bookRecord14 = this.D;
            if (bookRecord14 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord14 = null;
            }
            bookRecord14.finishCount = d11.progress.learned;
            BookRecord bookRecord15 = this.D;
            if (bookRecord15 == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord15 = null;
            }
            bookRecord15.masteredCount = d11.progress.mastered;
        }
        BookRecord bookRecord16 = this.D;
        if (bookRecord16 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
            bookRecord16 = null;
        }
        this.F = bookRecord16.dailyCount;
        BookRecord bookRecord17 = this.D;
        if (bookRecord17 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
        } else {
            bookRecord = bookRecord17;
        }
        this.G = bookRecord.dailyCount;
    }

    public final void h0(@m80.k kj.a book, long j11, int i11) {
        kotlin.jvm.internal.g0.p(book, "book");
        this.I = book.j();
        this.J = j11;
        this.F = 0;
        this.f19089s.postValue(Boolean.TRUE);
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        this.G = valueOf != null ? valueOf.intValue() : 10;
        this.f19091u.postValue(ScheduleStatus.FAVORITE_PLAN);
        this.f19084n.postValue(book.i());
        this.f19085o.postValue(book.k());
        this.f19082l.postValue(new r2(0, book.n(), 0, 4, null));
        int i12 = this.G;
        int n11 = book.n();
        if (1 <= n11 && n11 < i12) {
            this.G = book.n();
        }
        Z(book.n(), book.k());
    }

    public final void i0(boolean z11) {
        boolean z12;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar = null;
        if (z11) {
            se.f fVar = se.f.f88374a;
            BookRecord bookRecord = this.D;
            if (bookRecord == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord = null;
            }
            f.a d11 = fVar.d(bookRecord.bookId, this.G, this.f19072b, this.f19073c);
            LearnCardStatus value = this.f19092v.getValue();
            if (value != null) {
                if (value.isNewLearnDoneOfToday() || value.isAllKill()) {
                    value = null;
                }
                if (value != null) {
                    if (ch.m.f8648a.a() instanceof e.a) {
                        BookRecord bookRecord2 = this.D;
                        if (bookRecord2 == null) {
                            kotlin.jvm.internal.g0.S("currentBook");
                            bookRecord2 = null;
                        }
                        int i11 = bookRecord2.finishCount;
                        BookRecord bookRecord3 = this.D;
                        if (bookRecord3 == null) {
                            kotlin.jvm.internal.g0.S("currentBook");
                            bookRecord3 = null;
                        }
                        if (i11 >= bookRecord3.wordCount) {
                            this.f19083m.postValue(new n2.a(d11.i()));
                        }
                    }
                    this.f19083m.postValue(new n2.b(d11.i(), d11.j()));
                }
            }
            SingleLiveEvent<Boolean> singleLiveEvent = this.f19089s;
            if (this.G != this.F) {
                LearnCardStatus value2 = this.f19092v.getValue();
                if (!(value2 != null ? value2.isAllKill() : false)) {
                    z12 = true;
                    singleLiveEvent.postValue(Boolean.valueOf(z12));
                    this.f19081k.postValue(Integer.valueOf(d11.g()));
                    this.f19080j.postValue(Long.valueOf(d11.h()));
                }
            }
            z12 = false;
            singleLiveEvent.postValue(Boolean.valueOf(z12));
            this.f19081k.postValue(Integer.valueOf(d11.g()));
            this.f19080j.postValue(Long.valueOf(d11.h()));
        }
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar2 = this.L;
        if (aVar2 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar2 = null;
        }
        Integer valueOf = Integer.valueOf(aVar2.j(this.G));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        this.f19079i.postValue(Integer.valueOf(intValue));
        SingleLiveEvent<Integer> singleLiveEvent2 = this.f19078h;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar3 = this.L;
        if (aVar3 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
        } else {
            aVar = aVar3;
        }
        singleLiveEvent2.postValue(Integer.valueOf(aVar.d(intValue)));
    }

    public final void k(@m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e model) {
        kotlin.jvm.internal.g0.p(model, "model");
        if (oe.d1.b(this.K)) {
            n();
            return;
        }
        if (b0()) {
            this.f19093w.postValue(20);
        } else if (oe.d1.c(this.K)) {
            this.C.setValue(Boolean.TRUE);
        } else {
            l(model);
        }
    }

    public final void k0(int i11) {
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar = this.L;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar2 = null;
        if (aVar == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar = null;
        }
        this.G = aVar.h(i11);
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar3 = this.L;
        if (aVar3 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
        } else {
            aVar2 = aVar3;
        }
        i0(!(aVar2 instanceof a1));
    }

    public final void l(@m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e model) {
        kotlin.jvm.internal.g0.p(model, "model");
        qb0.h hVar = this.N;
        BookRecord bookRecord = null;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        se.u uVar = se.u.f88397a;
        Application application = this.f19075e;
        BookRecord bookRecord2 = this.D;
        if (bookRecord2 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
        } else {
            bookRecord = bookRecord2;
        }
        this.N = uVar.q(application, bookRecord, this.G, model.a()).I3(tb0.a.a()).q5(new b());
    }

    public final void n() {
        if (this.I == -1 || this.J == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    public final void o() {
        qb0.h hVar = this.O;
        BookRecord bookRecord = null;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        se.u uVar = se.u.f88397a;
        BookRecord bookRecord2 = this.D;
        if (bookRecord2 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
        } else {
            bookRecord = bookRecord2;
        }
        this.O = uVar.y(bookRecord.bookId).e6(1L, TimeUnit.MINUTES).I3(tb0.a.a()).r5(new d());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(@m80.k LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(@m80.k LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        super.onResume(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }

    public final void p() {
        qb0.h hVar = this.P;
        BookRecord bookRecord = null;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        se.u uVar = se.u.f88397a;
        Application application = this.f19075e;
        BookRecord bookRecord2 = this.D;
        if (bookRecord2 == null) {
            kotlin.jvm.internal.g0.S("currentBook");
        } else {
            bookRecord = bookRecord2;
        }
        rx.c<Integer> B = uVar.B(application, bookRecord);
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 q11;
                q11 = e.q(e.this, (Integer) obj);
                return q11;
            }
        };
        this.P = B.L1(new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.d
            @Override // wb0.b
            public final void call(Object obj) {
                e.r(x00.l.this, obj);
            }
        }).I3(tb0.a.a()).r5(new f());
    }

    public final void s(int i11) {
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar = this.L;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar2 = null;
        if (aVar == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar = null;
        }
        Integer valueOf = Integer.valueOf(aVar.j(this.G));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar3 = this.L;
        if (aVar3 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar3 = null;
        }
        if (aVar3.d(intValue) == i11) {
            return;
        }
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar4 = this.L;
        if (aVar4 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar4 = null;
        }
        int e11 = aVar4.e(i11);
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar5 = this.L;
        if (aVar5 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
            aVar5 = null;
        }
        this.G = aVar5.h(e11);
        com.baicizhan.main.activity.schedule_v2.adjustschedule.a aVar6 = this.L;
        if (aVar6 == null) {
            kotlin.jvm.internal.g0.S("dataProvider");
        } else {
            aVar2 = aVar6;
        }
        i0(!(aVar2 instanceof a1));
    }

    public final void start() {
        if (oe.d1.b(this.K)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (oe.d1.d(this.K)) {
            Y(this.H);
        } else {
            X();
        }
        c0();
    }

    @m80.k
    public final SingleLiveEvent<String> t() {
        return this.f19084n;
    }

    @m80.k
    public final SingleLiveEvent<String> u() {
        return this.f19086p;
    }

    @m80.k
    public final SingleLiveEvent<String> v() {
        return this.f19085o;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> w() {
        return this.f19089s;
    }

    @m80.k
    public final SingleLiveEvent<ScheduleStatus> x() {
        return this.f19091u;
    }

    public final int y() {
        return this.G;
    }

    @m80.k
    public final SingleLiveEvent<Integer> z() {
        return this.f19078h;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends qb0.g<Integer> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            kotlin.jvm.internal.g0.p(e11, "e");
            va.g.k(e11, R.string.schedule_unknow_error, 1);
            e.this.J().setValue(Boolean.FALSE);
        }

        @Override // qb0.c
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            q(((Number) obj).intValue());
        }

        @Override // qb0.g
        public void onStart() {
            e.this.J().setValue(Boolean.TRUE);
        }

        public void q(int i11) {
            qb.c.i(e.S, "change suc merge count %d", Integer.valueOf(i11));
            if (e.this.E || i11 == 0) {
                e.this.C().call();
            } else {
                e.this.S().postValue(Integer.valueOf(i11));
            }
            e.this.J().setValue(Boolean.FALSE);
            pg.x0 x0Var = pg.x0.f80512a;
            BookRecord bookRecord = e.this.D;
            if (bookRecord == null) {
                kotlin.jvm.internal.g0.S("currentBook");
                bookRecord = null;
            }
            x0Var.f(bookRecord.bookId);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends qb0.g<Void> {
        public d() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            kotlin.jvm.internal.g0.p(e11, "e");
            e.this.J().postValue(Boolean.FALSE);
            e.this.C().call();
            qb.c.c(e.S, "", e11);
        }

        @Override // qb0.g
        public void onStart() {
            e.this.J().postValue(Boolean.TRUE);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r22) {
            e.this.J().postValue(Boolean.FALSE);
            e.this.C().call();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
