package og;

import a00.h0;
import a00.r0;
import android.app.Application;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.booklist.BookUpdateInfos;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.LiveDataUtilsKt$sam$i$androidx_lifecycle_Observer$0;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.home.plan.data.LearningState;
import com.baicizhan.main.home.plan.learncard.UiType;
import com.baicizhan.main.home.plan.module.UpgradeType;
import com.baicizhan.main.rx.BookAdObservables;
import com.baicizhan.online.user_study_api.PrimarySchoolModeConfig;
import com.jiongji.andriod.card.R;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import pg.e1;
import pg.l0;
import q9.x;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLearnCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnCardViewModel.kt\ncom/baicizhan/main/home/plan/learncard/LearnCardViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LiveDataUtils.kt\ncom/baicizhan/client/business/util/LiveDataUtilsKt\n*L\n1#1,473:1\n1#2:474\n14#3,7:475\n14#3,7:482\n*S KotlinDebug\n*F\n+ 1 LearnCardViewModel.kt\ncom/baicizhan/main/home/plan/learncard/LearnCardViewModel\n*L\n80#1:475,7\n188#1:482,7\n*E\n"})
/* loaded from: classes4.dex */
public final class t extends AndroidViewModel {

    @m80.k
    public static final a M = new a(null);
    public static final int N = 8;

    @m80.k
    public static final String O = "LearnCardViewModel";

    @m80.k
    public final LiveData<UiType> A;

    @m80.k
    public final LiveData<Boolean> B;

    @m80.k
    public final MutableLiveData<Pair<Integer, Integer>> C;

    @m80.k
    public final MutableLiveData<Pair<Integer, Integer>> D;

    @m80.k
    public final MutableLiveData<BookAdObservables.BookAdInfo> E;

    @m80.k
    public final l0 F;

    @m80.k
    public final Observer<Boolean> G;

    @m80.k
    public final Observer<Integer> H;

    @m80.k
    public final Observer<Throwable> I;

    @m80.k
    public final LiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> J;

    @m80.k
    public final LiveData<UiType> K;

    @m80.l
    public qb0.h L;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76933a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76934b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f76935c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76936d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76937e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76938f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> f76939g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final LiveData<LearnCardStatus> f76940h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f76941i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f76942j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76943k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f76944l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f76945m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f76946n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f76947o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f76948p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final c0 f76949q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f76950r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Pair<String, Boolean>> f76951s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Object> f76952t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Object> f76953u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Pair<BookUpdateInfos.BookUpdateInfo, String>> f76954v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<String> f76955w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Boolean> f76956x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent f76957y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent f76958z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76959a;

        static {
            int[] iArr = new int[UpgradeType.values().length];
            try {
                iArr[UpgradeType.NORMAL_UPGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpgradeType.FORCE_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpgradeType.NORMAL_UPGRADE_USER_REJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76959a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLiveDataUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataUtils.kt\ncom/baicizhan/client/business/util/LiveDataUtilsKt$filter$1$1\n+ 2 LearnCardViewModel.kt\ncom/baicizhan/main/home/plan/learncard/LearnCardViewModel\n*L\n1#1,62:1\n188#2:63\n*E\n"})
    public static final class c implements x00.l<Pair<? extends LearnCardStatus, ? extends Triple<? extends LearningState, ? extends LearningState, ? extends LearningState>>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData f76960a;

        public c(MediatorLiveData mediatorLiveData) {
            this.f76960a = mediatorLiveData;
        }

        public final void a(Pair<? extends LearnCardStatus, ? extends Triple<? extends LearningState, ? extends LearningState, ? extends LearningState>> pair) {
            Pair<? extends LearnCardStatus, ? extends Triple<? extends LearningState, ? extends LearningState, ? extends LearningState>> pair2 = pair;
            if (r0.a2(h0.t(LearnCardStatus.LOADING, LearnCardStatus.ERROR), pair2 != null ? pair2.getFirst() : null)) {
                this.f76960a.setValue(pair);
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Pair<? extends LearnCardStatus, ? extends Triple<? extends LearningState, ? extends LearningState, ? extends LearningState>> pair) {
            a(pair);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLiveDataUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataUtils.kt\ncom/baicizhan/client/business/util/LiveDataUtilsKt$filter$1$1\n+ 2 LearnCardViewModel.kt\ncom/baicizhan/main/home/plan/learncard/LearnCardViewModel\n*L\n1#1,62:1\n81#2:63\n*E\n"})
    public static final class d implements x00.l<LearnCardStatus, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData f76961a;

        public d(MediatorLiveData mediatorLiveData) {
            this.f76961a = mediatorLiveData;
        }

        public final void a(LearnCardStatus learnCardStatus) {
            LearnCardStatus learnCardStatus2 = learnCardStatus;
            if (learnCardStatus2 != null ? learnCardStatus2.isNormal() : false) {
                this.f76961a.setValue(learnCardStatus);
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LearnCardStatus learnCardStatus) {
            a(learnCardStatus);
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k Application app2) {
        super(app2);
        g0.p(app2, "app");
        this.f76933a = new MutableLiveData<>();
        this.f76934b = new MutableLiveData<>();
        this.f76935c = new MutableLiveData<>();
        this.f76936d = new MutableLiveData<>();
        this.f76937e = new MutableLiveData<>();
        this.f76938f = new MutableLiveData<>();
        MutableLiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new Pair<>(LearnCardStatus.LOADING, null));
        this.f76939g = mutableLiveData;
        LiveData map = Transformations.map(mutableLiveData, new x00.l() { // from class: og.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                LearnCardStatus x11;
                x11 = t.x((Pair) obj);
                return x11;
            }
        });
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(map, new LiveDataUtilsKt$sam$i$androidx_lifecycle_Observer$0(new d(mediatorLiveData)));
        this.f76940h = mediatorLiveData;
        this.f76941i = Transformations.map(mediatorLiveData, new x00.l() { // from class: og.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean B0;
                B0 = t.B0((LearnCardStatus) obj);
                return Boolean.valueOf(B0);
            }
        });
        this.f76942j = Transformations.map(mediatorLiveData, new x00.l() { // from class: og.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean n02;
                n02 = t.n0((LearnCardStatus) obj);
                return Boolean.valueOf(n02);
            }
        });
        this.f76943k = new MutableLiveData<>();
        this.f76944l = new MutableLiveData<>();
        this.f76945m = new MutableLiveData<>();
        LiveData<Boolean> map2 = Transformations.map(mutableLiveData, new x00.l() { // from class: og.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean z11;
                z11 = t.z((Pair) obj);
                return Boolean.valueOf(z11);
            }
        });
        this.f76946n = map2;
        this.f76947o = Transformations.switchMap(map2, new x00.l() { // from class: og.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                LiveData y11;
                y11 = t.y(t.this, ((Boolean) obj).booleanValue());
                return y11;
            }
        });
        this.f76948p = Transformations.switchMap(mutableLiveData, new x00.l() { // from class: og.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                LiveData p02;
                p02 = t.p0(t.this, (Pair) obj);
                return p02;
            }
        });
        this.f76949q = e0.c(new x00.a() { // from class: og.g
            @Override // x00.a
            public final Object invoke() {
                LiveData z02;
                z02 = t.z0(t.this);
                return z02;
            }
        });
        this.f76950r = new MutableLiveData<>();
        this.f76951s = new ClickProtectedEvent<>();
        this.f76952t = new ClickProtectedEvent<>();
        this.f76953u = new ClickProtectedEvent<>();
        this.f76954v = new ClickProtectedEvent<>();
        this.f76955w = new ClickProtectedEvent<>();
        this.f76956x = new ClickProtectedEvent<>();
        this.f76957y = new ClickProtectedEvent();
        this.f76958z = new ClickProtectedEvent();
        this.C = new MutableLiveData<>();
        this.D = new MutableLiveData<>();
        this.E = new MutableLiveData<>();
        this.F = new l0();
        Observer<Boolean> observer = new Observer() { // from class: og.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                t.t0(t.this, (Boolean) obj);
            }
        };
        this.G = observer;
        Observer<Integer> observer2 = new Observer() { // from class: og.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                t.A(t.this, (Integer) obj);
            }
        };
        this.H = observer2;
        Observer<Throwable> observer3 = new Observer() { // from class: og.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                t.q0(t.this, (Throwable) obj);
            }
        };
        this.I = observer3;
        pg.u0 u0Var = pg.u0.f80487a;
        u0Var.q().observeForever(observer);
        u0Var.m().observeForever(observer2);
        u0Var.o().observeForever(observer3);
        LiveData<UiType> map3 = Transformations.map(FlowLiveDataConversions.asLiveData$default(ch.m.f8648a.b(), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null), new x00.l() { // from class: og.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                UiType v11;
                v11 = t.v((com.baicizhan.main.activity.schedule_v2.mutimode.data.e) obj);
                return v11;
            }
        });
        this.A = map3;
        LiveData<Boolean> map4 = Transformations.map(map3, new x00.l() { // from class: og.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean w11;
                w11 = t.w((UiType) obj);
                return Boolean.valueOf(w11);
            }
        });
        this.B = map4;
        this.J = FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.flow.k.c0(FlowLiveDataConversions.asFlow(Transformations.switchMap(map4, new x00.l() { // from class: og.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                LiveData o02;
                o02 = t.o0(t.this, ((Boolean) obj).booleanValue());
                return o02;
            }
        })), 300L), (kotlin.coroutines.d) null, 0L, 3, (Object) null);
        this.K = Transformations.map(map3, new x00.l() { // from class: og.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                UiType B;
                B = t.B(t.this, (UiType) obj);
                return B;
            }
        });
    }

    public static final void A(t tVar, Integer num) {
        if (num != null) {
            tVar.E.setValue(null);
            D0(tVar, LearnCardStatus.LOADING, null, true, 2, null);
        }
    }

    public static final LiveData A0(t tVar, Pair pair) {
        return tVar.f76934b;
    }

    public static final UiType B(t tVar, UiType it) {
        g0.p(it, "it");
        qb.c.i(O, "isNewExam " + it + " " + tVar.f76939g.getValue(), new Object[0]);
        UiType uiType = UiType.Ain1;
        if (it == uiType) {
            return uiType;
        }
        UiType uiType2 = UiType.Exam;
        if (it == uiType2) {
            Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>> value = tVar.f76939g.getValue();
            if ((value != null ? value.getFirst() : null) != LearnCardStatus.ERROR) {
                return uiType2;
            }
        }
        return UiType.Pic;
    }

    public static final boolean B0(LearnCardStatus it) {
        g0.p(it, "it");
        return it.isReviewing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void D0(t tVar, LearnCardStatus learnCardStatus, Triple triple, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            triple = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        tVar.C0(learnCardStatus, triple, z11);
    }

    public static final boolean n0(LearnCardStatus it) {
        g0.p(it, "it");
        return it.isDoing() || it == LearnCardStatus.QUIZZER_ALL_KILL_NEXT_DAY;
    }

    public static final LiveData o0(t tVar, boolean z11) {
        qb.c.i(O, "isNewExam " + z11, new Object[0]);
        if (!z11) {
            return tVar.f76939g;
        }
        MutableLiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> mutableLiveData = tVar.f76939g;
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData, new LiveDataUtilsKt$sam$i$androidx_lifecycle_Observer$0(new c(mediatorLiveData)));
        return mediatorLiveData;
    }

    public static final LiveData p0(t tVar, Pair pair) {
        return tVar.f76947o;
    }

    public static final void q0(t tVar, Throwable th2) {
        if (th2 != null) {
            D0(tVar, LearnCardStatus.ERROR, null, true, 2, null);
        }
    }

    public static final void t0(t tVar, Boolean bool) {
        qb.c.i(O, "REFRESH DONE " + bool, new Object[0]);
        if (bool != null) {
            if (!bool.booleanValue()) {
                bool = null;
            }
            if (bool != null) {
                tVar.u0();
                tVar.D();
                return;
            }
        }
        D0(tVar, LearnCardStatus.LOADING, null, true, 2, null);
    }

    public static final LearnCardStatus u(Pair pair) {
        return (LearnCardStatus) pair.getFirst();
    }

    private final void u0() {
        qb0.h hVar = this.L;
        if (hVar != null) {
            if (!hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        BookAdObservables.BookAdInfo value = this.E.getValue();
        if (value != null) {
            if (value.book_id == x.r().l()) {
                value = null;
            }
            if (value != null) {
                this.E.setValue(null);
            }
        }
        BookRecord k11 = x.r().k();
        if (k11 == null) {
            return;
        }
        rx.c<BookAdObservables.BookAdInfo> I3 = BookAdObservables.h(k11.bookId).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: og.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v02;
                v02 = t.v0(t.this, (BookAdObservables.BookAdInfo) obj);
                return v02;
            }
        };
        this.L = I3.u5(new wb0.b() { // from class: og.l
            @Override // wb0.b
            public final void call(Object obj) {
                t.w0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: og.m
            @Override // wb0.b
            public final void call(Object obj) {
                t.x0((Throwable) obj);
            }
        });
    }

    public static final UiType v(com.baicizhan.main.activity.schedule_v2.mutimode.data.e it) {
        g0.p(it, "it");
        return g0.g(it, e.a.f19304d) ? UiType.Ain1 : it instanceof e.g ? UiType.Exam : UiType.Pic;
    }

    public static final g2 v0(t tVar, BookAdObservables.BookAdInfo bookAdInfo) {
        tVar.E.postValue(bookAdInfo);
        return g2.f100423a;
    }

    public static final boolean w(UiType it) {
        g0.p(it, "it");
        return it == UiType.Exam;
    }

    public static final void w0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final LearnCardStatus x(Pair pair) {
        return (LearnCardStatus) pair.getFirst();
    }

    public static final void x0(Throwable th2) {
        qb.c.c(O, "book ad info: ", th2);
    }

    public static final LiveData y(t tVar, boolean z11) {
        return !z11 ? tVar.f76933a : tVar.f76945m;
    }

    public static final boolean z(Pair pair) {
        LearnCardStatus learnCardStatus;
        if (pair == null || (learnCardStatus = (LearnCardStatus) pair.getFirst()) == null) {
            return false;
        }
        return learnCardStatus.isDoneOfToday();
    }

    public static final LiveData z0(final t tVar) {
        return Transformations.switchMap(tVar.f76939g, new x00.l() { // from class: og.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                LiveData A0;
                A0 = t.A0(t.this, (Pair) obj);
                return A0;
            }
        });
    }

    public final void C() {
        if (gi.e.d(getApplication())) {
            this.f76956x.postValue(Boolean.valueOf(com.baicizhan.main.activity.daka.datasource.k.d()));
            ma.l.a(ma.t.f73003b, ma.a.f72768j);
        }
    }

    public final void C0(@m80.k LearnCardStatus status, @m80.l Triple<? extends LearningState, ? extends LearningState, ? extends LearningState> triple, boolean z11) {
        g0.p(status, "status");
        qb.c.i(O, "set STATUS " + status, new Object[0]);
        u.a(this.f76939g, new Pair(status, triple), z11);
    }

    public final void D() {
        this.F.c();
        MutableLiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> mutableLiveData = this.f76939g;
        Pair pair = new Pair(this.F.d().getStatus(), null);
        qb.c.i(O, String.valueOf(this.F.d().getStatus()), new Object[0]);
        u.b(mutableLiveData, pair, false, 2, null);
        u.a(this.f76933a, Integer.valueOf(this.F.d().g()), true);
        u.a(this.f76934b, Integer.valueOf(this.F.d().f()), true);
        u.a(this.f76935c, this.F.d().o(), true);
        u.a(this.f76937e, Integer.valueOf(this.F.d().e()), true);
        u.a(this.f76938f, Integer.valueOf(this.F.d().k()), true);
        u.a(this.f76945m, Integer.valueOf(this.F.d().h()), true);
        u.a(this.f76950r, this.F.d().l(), true);
        u.a(this.C, new Pair(Integer.valueOf(this.F.d().p()), Integer.valueOf(this.F.d().c())), true);
        u.a(this.D, new Pair(Integer.valueOf(this.F.d().i()), Integer.valueOf(this.F.d().n())), true);
        u.a(this.f76943k, Integer.valueOf(this.F.d().j()), true);
        u.a(this.f76944l, Boolean.valueOf(e1.f80462a.n() != UpgradeType.NO_NEED), true);
    }

    public final void E0() {
        String str;
        String str2 = this.F.d().k() == 0 ? ma.a.E : ma.a.C;
        String[] strArr = {ma.b.f72916j0, ma.b.f72919k0, "plan_type"};
        Integer value = this.f76947o.getValue();
        Integer valueOf = Integer.valueOf(value != null ? value.intValue() : 0);
        Integer value2 = this.f76934b.getValue();
        Integer valueOf2 = Integer.valueOf(value2 != null ? value2.intValue() : 0);
        ch.m mVar = ch.m.f8648a;
        if (g0.g(mVar.a(), new e.g(3))) {
            str = ma.v.f73039j;
        } else if (mVar.a() instanceof e.g) {
            str = mVar.a().a() + ma.v.f73040k;
        } else if (this.F.d().k() == 0 && g0.g(mVar.a(), e.C0296e.f19310d)) {
            str = ma.v.f73037h;
        } else if (this.F.d().k() == 0 && !g0.g(mVar.a(), e.C0296e.f19310d)) {
            str = ma.v.f73035f;
        } else if (this.F.d().k() != 0 && g0.g(mVar.a(), e.C0296e.f19310d)) {
            str = ma.v.f73038i;
        } else {
            if (this.F.d().k() == 0 || g0.g(mVar.a(), e.C0296e.f19310d)) {
                throw new RuntimeException("studyReport unExcepted branch");
            }
            str = ma.v.f73036g;
        }
        ma.l.b(ma.t.f73003b, str2, ma.u.d(strArr, new Object[]{valueOf, valueOf2, str}, false, 4, null));
    }

    @m80.k
    public final LiveData<BookAdObservables.BookAdInfo> F() {
        return this.E;
    }

    public final void F0(int i11) {
        u.b(this.f76936d, Integer.valueOf(i11), false, 2, null);
    }

    @m80.k
    public final MutableLiveData<String> G() {
        return this.f76950r;
    }

    public final void G0() {
        e1 e1Var = e1.f80462a;
        int i11 = b.f76959a[e1Var.n().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                this.f76955w.postValue(ma.a.f72819q1);
                return;
            } else if (i11 != 3) {
                return;
            }
        }
        this.f76954v.postValue(new Pair<>(e1Var.m(), ma.a.f72819q1));
    }

    @m80.k
    public final MutableLiveData<String> H() {
        return this.f76935c;
    }

    public final void H0() {
        this.f76957y.call();
    }

    @m80.k
    public final MutableLiveData<Integer> I() {
        return this.f76943k;
    }

    @m80.k
    public final MutableLiveData<Boolean> J() {
        return this.f76944l;
    }

    @m80.k
    public final LiveData<UiType> K() {
        return this.K;
    }

    @m80.k
    public final LiveData<Pair<Integer, Integer>> L() {
        return this.D;
    }

    @m80.k
    public final LiveData<Pair<Integer, Integer>> M() {
        return this.C;
    }

    @m80.k
    public final ClickProtectedEvent<String> N() {
        return this.f76955w;
    }

    @m80.k
    public final MutableLiveData<Integer> O() {
        return this.f76937e;
    }

    @m80.k
    public final ClickProtectedEvent<Pair<String, Boolean>> P() {
        return this.f76951s;
    }

    @m80.k
    public final ClickProtectedEvent<Boolean> Q() {
        return this.f76956x;
    }

    @m80.k
    public final ClickProtectedEvent<Object> R() {
        return this.f76953u;
    }

    @m80.k
    public final ClickProtectedEvent<Object> S() {
        return this.f76952t;
    }

    @m80.k
    public final ClickProtectedEvent T() {
        return this.f76958z;
    }

    @m80.k
    public final LiveData<LearnCardStatus> U() {
        return Transformations.map(this.f76939g, new x00.l() { // from class: og.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                LearnCardStatus u11;
                u11 = t.u((Pair) obj);
                return u11;
            }
        });
    }

    @m80.k
    public final LiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> V() {
        return this.J;
    }

    @m80.k
    public final LiveData<Integer> W() {
        return this.f76948p;
    }

    @m80.k
    public final LiveData<Integer> X() {
        return (LiveData) this.f76949q.getValue();
    }

    @m80.k
    public final MutableLiveData<Integer> Y() {
        return this.f76938f;
    }

    @m80.k
    public final LiveData<Boolean> Z() {
        return this.f76941i;
    }

    @m80.l
    public final Pair<BookRecord, Integer> a0() {
        BookRecord k11 = x.r().k();
        if (k11 != null) {
            return new Pair<>(k11, Integer.valueOf(this.F.d().k()));
        }
        return null;
    }

    @m80.k
    public final ClickProtectedEvent<Pair<BookUpdateInfos.BookUpdateInfo, String>> b0() {
        return this.f76954v;
    }

    @m80.k
    public final ClickProtectedEvent c0() {
        return this.f76957y;
    }

    @m80.k
    public final LiveData<Integer> d0() {
        return this.f76936d;
    }

    public final void g0() {
        this.f76953u.call();
    }

    public final void j0() {
        e1 e1Var = e1.f80462a;
        int i11 = b.f76959a[e1Var.n().ordinal()];
        if (i11 == 1) {
            this.f76954v.postValue(new Pair<>(e1Var.m(), ma.a.f72812p1));
            return;
        }
        if (i11 == 2) {
            this.f76955w.postValue(ma.a.f72812p1);
            return;
        }
        PrimarySchoolModeConfig b11 = hi.e.b(getApplication());
        if (k0(this.F.d().getStatus(), b11)) {
            ig.b.f60539a.c(AppPageStatus.CAKE_STUDY);
            this.f76951s.postValue(new Pair<>(b11.h5_link, Boolean.TRUE));
        } else {
            ch.m mVar = ch.m.f8648a;
            if (g0.g(mVar.a(), e.C0296e.f19310d)) {
                ig.b.f60539a.c(this.F.d().k() == 0 ? AppPageStatus.RHYME_STUDY : AppPageStatus.RHYME_REVIEW);
                this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_rhythm), Boolean.TRUE));
            } else {
                com.baicizhan.main.activity.schedule_v2.mutimode.data.e a11 = mVar.a();
                e.b bVar = com.baicizhan.main.activity.schedule_v2.mutimode.data.e.f19301b;
                if (g0.g(a11, bVar.a(3))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_xmode), Boolean.TRUE));
                } else if (g0.g(mVar.a(), bVar.a(4))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_context), Boolean.TRUE));
                } else if (g0.g(mVar.a(), bVar.a(5))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_profession), Boolean.TRUE));
                } else if (g0.g(mVar.a(), bVar.a(6))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_minority), Boolean.TRUE));
                } else if (g0.g(mVar.a(), bVar.a(7))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_french), Boolean.TRUE));
                } else if (g0.g(mVar.a(), bVar.a(8))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_spanish), Boolean.TRUE));
                } else if (g0.g(mVar.a(), bVar.a(9))) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_korean), Boolean.TRUE));
                } else if (mVar.a() instanceof e.g) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_new_exam, String.valueOf(mVar.a().a())), Boolean.TRUE));
                } else if (g0.g(mVar.a(), e.a.f19304d)) {
                    this.f76951s.postValue(new Pair<>(KotlinExtKt.getString(R.string.url_all_in_one), Boolean.TRUE));
                } else {
                    this.f76952t.call();
                }
            }
        }
        x.r().e0();
        E0();
    }

    public final boolean k0(LearnCardStatus learnCardStatus, PrimarySchoolModeConfig primarySchoolModeConfig) {
        Boolean bool = null;
        if ((learnCardStatus == LearnCardStatus.CAKE_LEARNING ? this : null) != null) {
            if (primarySchoolModeConfig != null) {
                if (TextUtils.isEmpty(primarySchoolModeConfig.h5_link)) {
                    primarySchoolModeConfig = null;
                }
                if (primarySchoolModeConfig != null) {
                    int i11 = primarySchoolModeConfig.state;
                    boolean z11 = true;
                    if (i11 != 1 && i11 != 3 && i11 != 5) {
                        z11 = false;
                    }
                    bool = Boolean.valueOf(z11);
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    @m80.k
    public final LiveData<Boolean> m0() {
        return this.f76942j;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb.c.i(O, "onCleared", new Object[0]);
        pg.u0 u0Var = pg.u0.f80487a;
        u0Var.q().removeObserver(this.G);
        u0Var.m().removeObserver(this.H);
        u0Var.o().removeObserver(this.I);
        u0Var.k();
    }

    public final void s0() {
        if (hi.e.f(getApplication())) {
            PrimarySchoolModeConfig b11 = hi.e.b(getApplication());
            this.f76951s.postValue(new Pair<>(b11.has_done_final_exam == 0 ? b11.final_exam_link_button : b11.final_exam_result_link, Boolean.FALSE));
        }
    }

    public final void y0() {
        pg.u0.f80487a.s().setValue(Boolean.TRUE);
    }

    public final void e0() {
    }

    public final void f0() {
    }

    public final void h0() {
    }

    public final void i0() {
    }

    public final void r0() {
    }
}
