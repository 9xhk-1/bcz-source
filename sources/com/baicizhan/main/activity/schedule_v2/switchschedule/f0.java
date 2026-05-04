package com.baicizhan.main.activity.schedule_v2.switchschedule;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.schedule.data.BookDataSource;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.plan.allinone.c1;
import com.baicizhan.main.home.plan.allinone.e1;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import com.baicizhan.main.home.plan.module.exam.Progress;
import com.baicizhan.online.user_study_api.StudyHome;
import com.baicizhan.online.user_study_api.StudyHomeProgress;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import pg.l0;
import qg.q0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@u0({"SMAP\nSwitchVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchVm.kt\ncom/baicizhan/main/activity/schedule_v2/switchschedule/SwitchVm\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
/* loaded from: classes4.dex */
public final class f0 extends ViewModel {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final a f19490o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f19491p = 8;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f19492q = "SwitchVm";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f19493a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ta.b f19494b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q0 f19495c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e1 f19496d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.s f19497e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<b>> f19498f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<b> f19499g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f19500h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f19501i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<b> f19502j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f19503k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19504l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public qb0.h f19505m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public qb0.h f19506n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public f0(@m80.k Application app2, @m80.k ta.b loadingVm, @m80.k q0 getStatus, @m80.k e1 homeRepo, @m80.k com.baicizhan.main.home.experiment.repo.s gameHomeRepo) {
        kotlin.jvm.internal.g0.p(app2, "app");
        kotlin.jvm.internal.g0.p(loadingVm, "loadingVm");
        kotlin.jvm.internal.g0.p(getStatus, "getStatus");
        kotlin.jvm.internal.g0.p(homeRepo, "homeRepo");
        kotlin.jvm.internal.g0.p(gameHomeRepo, "gameHomeRepo");
        this.f19493a = app2;
        this.f19494b = loadingVm;
        this.f19495c = getStatus;
        this.f19496d = homeRepo;
        this.f19497e = gameHomeRepo;
        this.f19498f = new MutableLiveData<>();
        this.f19499g = new ClickProtectedEvent<>();
        this.f19500h = new MutableLiveData<>();
        this.f19501i = new MutableLiveData<>();
        this.f19502j = new ClickProtectedEvent<>();
        this.f19503k = new SingleLiveEvent<>();
        this.f19504l = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.y
            @Override // x00.a
            public final Object invoke() {
                l0 I;
                I = f0.I();
                return I;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 I() {
        return new l0();
    }

    public static /* synthetic */ void K(f0 f0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        f0Var.J(i11);
    }

    public static final rx.c L(List list) {
        return rx.c.u2(list);
    }

    public static final rx.c M(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final b N(f0 f0Var, int i11, BookRecord bookRecord) {
        List Q;
        int i12;
        StudyHome d11;
        int i13;
        boolean z11 = bookRecord.bookId == q9.x.r().l();
        if (z11 && (ch.m.f8648a.a() instanceof e.g)) {
            JsModel a11 = f0Var.f19495c.a();
            if (a11 != null) {
                Progress progress = a11.getProgress();
                Q = a00.h0.Q(Integer.valueOf(progress.getFinishedWordsCount()), Integer.valueOf(progress.getTotalWordsCount()), Integer.valueOf(progress.getRemainDaysCount()), Integer.valueOf(a11 instanceof JsModel.AllRemoved ? progress.getTotalWordsCount() : 0));
            }
            Q = null;
        } else if (z11 && (ch.m.f8648a.a() instanceof e.a)) {
            c1 value = f0Var.f19496d.c().getValue();
            c1.a aVar = value instanceof c1.a ? (c1.a) value : null;
            if (aVar != null && (d11 = aVar.d()) != null) {
                Integer valueOf = Integer.valueOf(d11.progress.learned);
                Integer valueOf2 = Integer.valueOf(d11.progress.total);
                StudyHomeProgress studyHomeProgress = d11.progress;
                int i14 = studyHomeProgress.learned;
                int i15 = studyHomeProgress.total;
                if (i14 >= i15) {
                    i13 = 0;
                } else {
                    int i16 = i15 - i14;
                    int i17 = bookRecord.dailyCount;
                    i13 = ((i16 + i17) - 1) / i17;
                }
                Q = a00.h0.Q(valueOf, valueOf2, Integer.valueOf(i13), Integer.valueOf(d11.progress.mastered));
            }
            Q = null;
        } else if (z11 && com.baicizhan.main.home.experiment.q0.f21394a.b()) {
            com.baicizhan.main.home.experiment.repo.m value2 = f0Var.f19497e.q().getValue();
            if (value2 != null) {
                Integer valueOf3 = Integer.valueOf(value2.f());
                Integer valueOf4 = Integer.valueOf(value2.h());
                if (value2.f() >= value2.h()) {
                    i12 = 0;
                } else {
                    int h11 = value2.h() - value2.f();
                    int i18 = bookRecord.dailyCount;
                    i12 = ((h11 + i18) - 1) / i18;
                }
                Q = a00.h0.Q(valueOf3, valueOf4, Integer.valueOf(i12), Integer.valueOf(value2.g()));
            }
            Q = null;
        } else {
            if (z11) {
                Q = a00.h0.Q(Integer.valueOf(f0Var.z().d().p()), Integer.valueOf(f0Var.z().d().c()), Integer.valueOf(f0Var.z().d().n()), Integer.valueOf(bookRecord.masteredCount));
            }
            Q = null;
        }
        if (Q == null) {
            Q = a00.h0.Q(Integer.valueOf(bookRecord.finishCount), Integer.valueOf(bookRecord.wordCount), Integer.valueOf(BookRecord.computeDaysByWords(bookRecord.wordCount - bookRecord.finishCount, bookRecord.dailyCount)), Integer.valueOf(bookRecord.masteredCount));
        }
        int intValue = ((Number) Q.get(0)).intValue();
        int intValue2 = ((Number) Q.get(1)).intValue();
        int intValue3 = ((Number) Q.get(2)).intValue();
        int intValue4 = ((Number) Q.get(3)).intValue();
        int i19 = bookRecord.bookId;
        String bookName = bookRecord.bookName;
        kotlin.jvm.internal.g0.o(bookName, "bookName");
        String descImage = bookRecord.descImage;
        kotlin.jvm.internal.g0.o(descImage, "descImage");
        Integer valueOf5 = Integer.valueOf(!bookRecord.isFinished() ? bookRecord.dailyCount : bookRecord.reviewCount);
        int intValue5 = valueOf5.intValue();
        int i21 = bookRecord.wordCount;
        Integer num = intValue5 <= i21 ? valueOf5 : null;
        if (num != null) {
            i21 = num.intValue();
        }
        return new b(i19, bookName, descImage, z11, intValue, intValue2, intValue4, i21, intValue3, i11 == bookRecord.bookId);
    }

    public static final b O(x00.l lVar, Object obj) {
        return (b) lVar.invoke(obj);
    }

    public static final g2 P(f0 f0Var, List list) {
        f0Var.f19494b.s();
        f0Var.f19498f.postValue(list);
        return g2.f100423a;
    }

    public static final void Q(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void R(f0 f0Var, Throwable th2) {
        f0Var.f19494b.f(th2);
        qb.c.c(f19492q, "", th2);
    }

    public static final g2 q(f0 f0Var, b bVar, Integer num) {
        f0Var.f19501i.postValue(Boolean.FALSE);
        List<b> value = f0Var.f19498f.getValue();
        List<b> list = x0.F(value) ? value : null;
        if (list != null) {
            Integer valueOf = Integer.valueOf(list.indexOf(bVar));
            Integer num2 = valueOf.intValue() != -1 ? valueOf : null;
            if (num2 != null) {
                int intValue = num2.intValue();
                f0Var.f19500h.postValue(Integer.valueOf(intValue));
                list.remove(intValue);
            }
        }
        return g2.f100423a;
    }

    public static final void r(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void s(f0 f0Var, Throwable th2) {
        f0Var.f19501i.postValue(Boolean.FALSE);
        va.g.j(th2, 1);
        qb.c.c(f19492q, "", th2);
    }

    public static final g2 u(f0 f0Var, Integer num) {
        f0Var.f19501i.postValue(Boolean.FALSE);
        f0Var.f19503k.postValue(Boolean.TRUE);
        return g2.f100423a;
    }

    public static final void v(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void w(f0 f0Var, Throwable th2) {
        f0Var.f19501i.postValue(Boolean.FALSE);
        va.g.j(th2, 1);
        qb.c.c(f19492q, "", th2);
    }

    private final l0 z() {
        return (l0) this.f19504l.getValue();
    }

    @m80.k
    public final MutableLiveData<Boolean> A() {
        return this.f19501i;
    }

    @m80.k
    public final ta.b B() {
        return this.f19494b;
    }

    @m80.k
    public final MutableLiveData<Integer> C() {
        return this.f19500h;
    }

    @m80.k
    public final MutableLiveData<List<b>> D() {
        return this.f19498f;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> F() {
        return this.f19503k;
    }

    @m80.k
    public final ClickProtectedEvent<b> G() {
        return this.f19499g;
    }

    @m80.k
    public final ClickProtectedEvent<b> H() {
        return this.f19502j;
    }

    public final void J(final int i11) {
        this.f19494b.k();
        rx.c<List<BookRecord>> j11 = se.f.f88374a.j(this.f19493a);
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c L;
                L = f0.L((List) obj);
                return L;
            }
        };
        rx.c<R> b22 = j11.b2(new wb0.p() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.a0
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c M;
                M = f0.M(x00.l.this, obj);
                return M;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                b N;
                N = f0.N(f0.this, i11, (BookRecord) obj);
                return N;
            }
        };
        rx.c I3 = b22.c3(new wb0.p() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.c0
            @Override // wb0.p
            public final Object call(Object obj) {
                b O;
                O = f0.O(x00.l.this, obj);
                return O;
            }
        }).v6().I3(tb0.a.a());
        final x00.l lVar3 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = f0.P(f0.this, (List) obj);
                return P;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.e0
            @Override // wb0.b
            public final void call(Object obj) {
                f0.Q(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.s
            @Override // wb0.b
            public final void call(Object obj) {
                f0.R(f0.this, (Throwable) obj);
            }
        });
    }

    public final void S(@m80.k b schedule) {
        kotlin.jvm.internal.g0.p(schedule, "schedule");
        this.f19502j.postValue(schedule);
    }

    public final void p(@m80.k final b schedule) {
        kotlin.jvm.internal.g0.p(schedule, "schedule");
        qb0.h hVar = this.f19505m;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        this.f19501i.postValue(Boolean.TRUE);
        se.u uVar = se.u.f88397a;
        Application application = this.f19493a;
        BookRecord a11 = BookDataSource.b().a(schedule.m());
        kotlin.jvm.internal.g0.o(a11, "getBookById(...)");
        rx.c<Integer> I3 = uVar.u(application, a11).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q11;
                q11 = f0.q(f0.this, schedule, (Integer) obj);
                return q11;
            }
        };
        this.f19505m = I3.u5(new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.u
            @Override // wb0.b
            public final void call(Object obj) {
                f0.r(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.v
            @Override // wb0.b
            public final void call(Object obj) {
                f0.s(f0.this, (Throwable) obj);
            }
        });
    }

    public final void t(@m80.k b schedule) {
        kotlin.jvm.internal.g0.p(schedule, "schedule");
        qb0.h hVar = this.f19506n;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        this.f19501i.postValue(Boolean.TRUE);
        se.u uVar = se.u.f88397a;
        Application application = this.f19493a;
        BookRecord a11 = BookDataSource.b().a(schedule.m());
        kotlin.jvm.internal.g0.o(a11, "getBookById(...)");
        rx.c I3 = se.u.r(uVar, application, a11, schedule.s(), 0, 8, null).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = f0.u(f0.this, (Integer) obj);
                return u11;
            }
        };
        this.f19506n = I3.u5(new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.w
            @Override // wb0.b
            public final void call(Object obj) {
                f0.v(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.activity.schedule_v2.switchschedule.x
            @Override // wb0.b
            public final void call(Object obj) {
                f0.w(f0.this, (Throwable) obj);
            }
        });
    }

    public final void x(@m80.k b schedule) {
        kotlin.jvm.internal.g0.p(schedule, "schedule");
        this.f19499g.postValue(schedule);
    }

    @m80.k
    public final q0 y() {
        return this.f19495c;
    }
}
