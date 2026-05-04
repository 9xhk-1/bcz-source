package lg;

import a90.c3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.MapLearnHelper;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.plan.PrioritizedTask;
import com.baicizhan.main.home.plan.allinone.AllInOneView;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.home.plan.data.LearningState;
import com.baicizhan.main.home.plan.learncard.UiType;
import com.baicizhan.main.home.plan.newexam.LearnCardView;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.main.rx.BookAdObservables;
import com.baicizhan.main.wordlist.activity.WordListActivity;
import com.jiongji.andriod.card.R;
import gs.nh;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.u0;
import lg.q;
import q30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordPlanBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanBinder.kt\ncom/baicizhan/main/home/plan/binder/WordPlanBinder\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1321#2,2:399\n1321#2:401\n1322#2:403\n1321#2,2:404\n1#3:402\n*S KotlinDebug\n*F\n+ 1 WordPlanBinder.kt\ncom/baicizhan/main/home/plan/binder/WordPlanBinder\n*L\n330#1:399,2\n338#1:401\n338#1:403\n363#1:404,2\n*E\n"})
/* loaded from: classes4.dex */
public final class q extends lg.a<og.t, e> implements WordPlanInfoView.e {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final b f71292o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f71293p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final String f71294q = q.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c f71295h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f71296i;

    /* renamed from: j, reason: collision with root package name */
    public WordPlanInfoView f71297j;

    /* renamed from: k, reason: collision with root package name */
    public og.t f71298k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public AllInOneView f71299l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public LearnCardView f71300m;

    /* renamed from: n, reason: collision with root package name */
    public d f71301n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements DefaultLifecycleObserver {
        public a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner owner) {
            kotlin.jvm.internal.g0.p(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            kotlin.jvm.internal.g0.p(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(LifecycleOwner lifecycleOwner) {
            super.onResume(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void r(@m80.k PrioritizedTask prioritizedTask);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordPlanBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanBinder.kt\ncom/baicizhan/main/home/plan/binder/WordPlanBinder$Test\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,398:1\n1227#2,2:399\n1227#2,2:401\n1227#2,2:403\n*S KotlinDebug\n*F\n+ 1 WordPlanBinder.kt\ncom/baicizhan/main/home/plan/binder/WordPlanBinder$Test\n*L\n77#1:399,2\n79#1:401,2\n81#1:403,2\n*E\n"})
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@m80.l Context context, @m80.l Intent intent) {
            og.t tVar;
            og.t tVar2;
            WordPlanInfoView wordPlanInfoView = null;
            Triple triple = null;
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                switch (action.hashCode()) {
                    case -778249333:
                        if (action.equals("com.test.learn.status")) {
                            og.t tVar3 = q.this.f71298k;
                            if (tVar3 == null) {
                                kotlin.jvm.internal.g0.S("learnCardViewModel");
                                tVar = null;
                            } else {
                                tVar = tVar3;
                            }
                            og.t.D0(tVar, LearnCardStatus.values()[intent.getIntExtra("index", 0) % LearnCardStatus.values().length], null, false, 6, null);
                            return;
                        }
                        return;
                    case -599682699:
                        action.equals("com.test.learn.guide.new");
                        return;
                    case 307058882:
                        if (action.equals("com.test.learn.book")) {
                            WordPlanInfoView wordPlanInfoView2 = q.this.f71297j;
                            if (wordPlanInfoView2 == null) {
                                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                                wordPlanInfoView2 = null;
                            }
                            String stringExtra = intent.getStringExtra("name");
                            if (stringExtra == null) {
                                stringExtra = "";
                            }
                            wordPlanInfoView2.setBookName(stringExtra);
                            WordPlanInfoView wordPlanInfoView3 = q.this.f71297j;
                            if (wordPlanInfoView3 == null) {
                                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                            } else {
                                wordPlanInfoView = wordPlanInfoView3;
                            }
                            wordPlanInfoView.setBookUpgrading(intent.getBooleanExtra(c3.f2342e, true));
                            return;
                        }
                        return;
                    case 1400391887:
                        if (action.equals("com.test.learn.status.quizzer")) {
                            og.t tVar4 = q.this.f71298k;
                            if (tVar4 == null) {
                                kotlin.jvm.internal.g0.S("learnCardViewModel");
                                tVar2 = null;
                            } else {
                                tVar2 = tVar4;
                            }
                            LearnCardStatus learnCardStatus = LearnCardStatus.values()[intent.getIntExtra("index", 0) % LearnCardStatus.values().length];
                            if (intent.hasExtra("l") || intent.hasExtra(en.r.f50027a) || intent.hasExtra("m")) {
                                for (LearningState learningState : LearningState.values()) {
                                    if (learningState.getState() == intent.getIntExtra("l", 0)) {
                                        for (LearningState learningState2 : LearningState.values()) {
                                            if (learningState2.getState() == intent.getIntExtra(en.r.f50027a, 0)) {
                                                for (LearningState learningState3 : LearningState.values()) {
                                                    if (learningState3.getState() == intent.getIntExtra("m", 0)) {
                                                        triple = new Triple(learningState, learningState2, learningState3);
                                                    }
                                                }
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            og.t.D0(tVar2, learnCardStatus, triple, false, 4, null);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordPlanBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanBinder.kt\ncom/baicizhan/main/home/plan/binder/WordPlanBinder$WordPlanHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
    public final class e extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final View f71304e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q f71305f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f71306a;

            static {
                int[] iArr = new int[UiType.values().length];
                try {
                    iArr[UiType.Ain1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UiType.Exam.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f71306a = iArr;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(@m80.k lg.q r2, gs.nh r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.f71305f = r2
                android.widget.FrameLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                r1.<init>(r2)
                android.view.View r2 = r3.f56071b
                java.lang.String r3 = "bg"
                kotlin.jvm.internal.g0.o(r2, r3)
                r1.f71304e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.q.e.<init>(lg.q, gs.nh):void");
        }

        public static final g2 D(q qVar, Pair pair) {
            if (pair != null) {
                boolean z11 = ch.m.f8648a.a() instanceof e.g;
                qb.c.i(q.f71294q, z11 + " , " + pair, new Object[0]);
                WordPlanInfoView wordPlanInfoView = qVar.f71297j;
                if (wordPlanInfoView == null) {
                    kotlin.jvm.internal.g0.S("wordPlanInfoView");
                    wordPlanInfoView = null;
                }
                wordPlanInfoView.O((LearnCardStatus) pair.getFirst(), (Triple) pair.getSecond());
            }
            return g2.f100423a;
        }

        public static final g2 E(q qVar, Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                qb.c.b(q.f71294q, "isDoingState: " + booleanValue, new Object[0]);
                FrameLayout frameLayout = qVar.f71296i;
                FrameLayout frameLayout2 = null;
                if (frameLayout == null) {
                    kotlin.jvm.internal.g0.S("wordPlanCard");
                    frameLayout = null;
                }
                frameLayout.getLayoutParams().height = -2;
                WordPlanInfoView wordPlanInfoView = qVar.f71297j;
                if (wordPlanInfoView == null) {
                    kotlin.jvm.internal.g0.S("wordPlanInfoView");
                    wordPlanInfoView = null;
                }
                ViewGroup.LayoutParams layoutParams = wordPlanInfoView.getLayoutParams();
                int i11 = booleanValue ? R.dimen.word_plan_learning_card_height : R.dimen.word_plan_learning_card_height_done;
                FrameLayout frameLayout3 = qVar.f71296i;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.g0.S("wordPlanCard");
                } else {
                    frameLayout2 = frameLayout3;
                }
                layoutParams.height = Integer.valueOf((int) (frameLayout2.getResources().getDimensionPixelSize(i11) * (com.baicizhan.base.a.a(KotlinExtKt.getGlobalApplicationContext()) ? 1.1f : 1.0f))).intValue();
            }
            return g2.f100423a;
        }

        public static final g2 F(q qVar, Pair pair) {
            if (pair != null) {
                WordPlanInfoView wordPlanInfoView = qVar.f71297j;
                if (wordPlanInfoView == null) {
                    kotlin.jvm.internal.g0.S("wordPlanInfoView");
                    wordPlanInfoView = null;
                }
                wordPlanInfoView.J(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            }
            return g2.f100423a;
        }

        public static final g2 G(q qVar, Integer num) {
            if (num != null && num.intValue() > 0) {
                WordPlanInfoView wordPlanInfoView = qVar.f71297j;
                if (wordPlanInfoView == null) {
                    kotlin.jvm.internal.g0.S("wordPlanInfoView");
                    wordPlanInfoView = null;
                }
                wordPlanInfoView.setEstimatedTimeOfPlan(num.intValue());
            }
            return g2.f100423a;
        }

        public static final g2 H(q qVar, Integer num) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            if (num == null) {
                return g2.f100423a;
            }
            wordPlanInfoView.setWordsCount(num.intValue());
            return g2.f100423a;
        }

        public static final g2 I(q qVar, BookAdObservables.BookAdInfo bookAdInfo) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            wordPlanInfoView.setBookAdInfo(bookAdInfo);
            return g2.f100423a;
        }

        public static final g2 J(final q qVar, og.t tVar, final e eVar, UiType uiType) {
            qb.c.i(q.f71294q, " " + uiType, new Object[0]);
            int i11 = uiType == null ? -1 : a.f71306a[uiType.ordinal()];
            if (i11 == 1) {
                qVar.N(tVar);
            } else if (i11 != 2) {
                qVar.R();
            } else {
                qVar.O(tVar);
            }
            final boolean contains = a00.g0.l(UiType.Ain1).contains(uiType);
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            wordPlanInfoView.post(new Runnable() { // from class: lg.r
                @Override // java.lang.Runnable
                public final void run() {
                    q.e.K(q.this, eVar, contains);
                }
            });
            return g2.f100423a;
        }

        public static final void K(q qVar, e eVar, boolean z11) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            if (!z11) {
                eVar = null;
            }
            wordPlanInfoView.setVisibility(eVar != null ? 8 : 0);
        }

        public static final g2 L(q qVar, Boolean bool) {
            if (bool.booleanValue()) {
                WordPlanInfoView wordPlanInfoView = qVar.f71297j;
                if (wordPlanInfoView == null) {
                    kotlin.jvm.internal.g0.S("wordPlanInfoView");
                    wordPlanInfoView = null;
                }
                wordPlanInfoView.M();
            }
            return g2.f100423a;
        }

        public static final g2 M(e eVar, Integer num) {
            if (num != null) {
                if (num.intValue() != 0) {
                    eVar.f71304e.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, a00.a0.Wy(new Integer[]{Integer.valueOf(num.intValue() | (-16777216)), 0})));
                } else {
                    eVar.f71304e.setBackground(null);
                }
            }
            return g2.f100423a;
        }

        public static final g2 N(q qVar, String str) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            wordPlanInfoView.setBookName(str);
            return g2.f100423a;
        }

        public static final g2 O(q qVar, String str) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            wordPlanInfoView.setBookCover(str);
            return g2.f100423a;
        }

        public static final g2 P(q qVar, Boolean bool) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            kotlin.jvm.internal.g0.m(bool);
            wordPlanInfoView.setBookUpgrading(bool.booleanValue());
            return g2.f100423a;
        }

        public static final g2 Q(q qVar, Integer num) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            if (num == null) {
                return g2.f100423a;
            }
            wordPlanInfoView.setReviewRound(num.intValue());
            return g2.f100423a;
        }

        public static final g2 R(q qVar, Integer num) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            WordPlanInfoView.L(wordPlanInfoView, num != null ? num.intValue() : 0, 0, 2, null);
            return g2.f100423a;
        }

        public static final g2 S(q qVar, Integer num) {
            WordPlanInfoView wordPlanInfoView = qVar.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            WordPlanInfoView.L(wordPlanInfoView, 0, num != null ? num.intValue() : 0, 1, null);
            return g2.f100423a;
        }

        public static final g2 T(q qVar, Pair pair) {
            if (pair != null) {
                WordPlanInfoView wordPlanInfoView = qVar.f71297j;
                if (wordPlanInfoView == null) {
                    kotlin.jvm.internal.g0.S("wordPlanInfoView");
                    wordPlanInfoView = null;
                }
                wordPlanInfoView.H(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            }
            return g2.f100423a;
        }

        public final void C(@m80.k final og.t model) {
            kotlin.jvm.internal.g0.p(model, "model");
            qb.c.i(q.f71294q, "INIT", new Object[0]);
            WordPlanInfoView wordPlanInfoView = this.f71305f.f71297j;
            if (wordPlanInfoView == null) {
                kotlin.jvm.internal.g0.S("wordPlanInfoView");
                wordPlanInfoView = null;
            }
            wordPlanInfoView.O(LearnCardStatus.LOADING, null);
            LiveData<Pair<LearnCardStatus, Triple<LearningState, LearningState, LearningState>>> V = model.V();
            final q qVar = this.f71305f;
            V.observe(this, new f(new x00.l() { // from class: lg.z
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 D;
                    D = q.e.D(q.this, (Pair) obj);
                    return D;
                }
            }));
            LiveData<Boolean> m02 = model.m0();
            final q qVar2 = this.f71305f;
            m02.observe(this, new f(new x00.l() { // from class: lg.g0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 E;
                    E = q.e.E(q.this, (Boolean) obj);
                    return E;
                }
            }));
            model.d0().observe(this, new f(new x00.l() { // from class: lg.h0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 M;
                    M = q.e.M(q.e.this, (Integer) obj);
                    return M;
                }
            }));
            MutableLiveData<String> H = model.H();
            final q qVar3 = this.f71305f;
            H.observe(this, new f(new x00.l() { // from class: lg.s
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 N;
                    N = q.e.N(q.this, (String) obj);
                    return N;
                }
            }));
            MutableLiveData<String> G = model.G();
            final q qVar4 = this.f71305f;
            G.observe(this, new f(new x00.l() { // from class: lg.t
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 O;
                    O = q.e.O(q.this, (String) obj);
                    return O;
                }
            }));
            MutableLiveData<Boolean> J = model.J();
            final q qVar5 = this.f71305f;
            J.observe(this, new f(new x00.l() { // from class: lg.u
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 P;
                    P = q.e.P(q.this, (Boolean) obj);
                    return P;
                }
            }));
            MutableLiveData<Integer> Y = model.Y();
            final q qVar6 = this.f71305f;
            Y.observe(this, new f(new x00.l() { // from class: lg.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 Q;
                    Q = q.e.Q(q.this, (Integer) obj);
                    return Q;
                }
            }));
            LiveData<Integer> W = model.W();
            final q qVar7 = this.f71305f;
            W.observe(this, new f(new x00.l() { // from class: lg.w
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 R;
                    R = q.e.R(q.this, (Integer) obj);
                    return R;
                }
            }));
            LiveData<Integer> X = model.X();
            final q qVar8 = this.f71305f;
            X.observe(this, new f(new x00.l() { // from class: lg.x
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 S;
                    S = q.e.S(q.this, (Integer) obj);
                    return S;
                }
            }));
            LiveData<Pair<Integer, Integer>> M = model.M();
            final q qVar9 = this.f71305f;
            M.observe(this, new f(new x00.l() { // from class: lg.y
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 T;
                    T = q.e.T(q.this, (Pair) obj);
                    return T;
                }
            }));
            LiveData<Pair<Integer, Integer>> L = model.L();
            final q qVar10 = this.f71305f;
            L.observe(this, new f(new x00.l() { // from class: lg.a0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 F;
                    F = q.e.F(q.this, (Pair) obj);
                    return F;
                }
            }));
            MutableLiveData<Integer> O = model.O();
            final q qVar11 = this.f71305f;
            O.observe(this, new f(new x00.l() { // from class: lg.b0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 G2;
                    G2 = q.e.G(q.this, (Integer) obj);
                    return G2;
                }
            }));
            MutableLiveData<Integer> I = model.I();
            final q qVar12 = this.f71305f;
            I.observe(this, new f(new x00.l() { // from class: lg.c0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 H2;
                    H2 = q.e.H(q.this, (Integer) obj);
                    return H2;
                }
            }));
            LiveData<BookAdObservables.BookAdInfo> F = model.F();
            final q qVar13 = this.f71305f;
            F.observe(this, new f(new x00.l() { // from class: lg.d0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 I2;
                    I2 = q.e.I(q.this, (BookAdObservables.BookAdInfo) obj);
                    return I2;
                }
            }));
            LiveData<UiType> K = model.K();
            final q qVar14 = this.f71305f;
            K.observe(this, new f(new x00.l() { // from class: lg.e0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 J2;
                    J2 = q.e.J(q.this, model, this, (UiType) obj);
                    return J2;
                }
            }));
            MutableLiveData<Boolean> isMapAction = MapLearnHelper.INSTANCE.isMapAction();
            final q qVar15 = this.f71305f;
            isMapAction.observe(this, new f(new x00.l() { // from class: lg.f0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 L2;
                    L2 = q.e.L(q.this, (Boolean) obj);
                    return L2;
                }
            }));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f71307a;

        public f(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f71307a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f71307a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f71307a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@m80.k LifecycleOwner owner, @m80.k c planListener) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
        kotlin.jvm.internal.g0.p(planListener, "planListener");
        this.f71295h = planListener;
        owner.getLifecycle().addObserver(new a());
    }

    public static final boolean S(View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return (it instanceof AllInOneView) || (it instanceof LearnCardView);
    }

    public final void N(og.t tVar) {
        FrameLayout frameLayout = this.f71296i;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            kotlin.jvm.internal.g0.S("wordPlanCard");
            frameLayout = null;
        }
        for (View view : ViewGroupKt.getChildren(frameLayout)) {
            AllInOneView allInOneView = view instanceof AllInOneView ? (AllInOneView) view : null;
            if (allInOneView != null) {
                this.f71299l = allInOneView;
            }
            if (view instanceof LearnCardView) {
                FrameLayout frameLayout3 = this.f71296i;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.g0.S("wordPlanCard");
                    frameLayout3 = null;
                }
                frameLayout3.removeView(view);
                this.f71300m = null;
            }
        }
        if (this.f71299l == null) {
            qb.c.i(f71294q, "install4in1", new Object[0]);
            FrameLayout frameLayout4 = this.f71296i;
            if (frameLayout4 == null) {
                kotlin.jvm.internal.g0.S("wordPlanCard");
                frameLayout4 = null;
            }
            Context context = frameLayout4.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            AllInOneView allInOneView2 = new AllInOneView(context, null, 0, 6, null);
            this.f71299l = allInOneView2;
            allInOneView2.setOldVM(tVar);
            FrameLayout frameLayout5 = this.f71296i;
            if (frameLayout5 == null) {
                kotlin.jvm.internal.g0.S("wordPlanCard");
            } else {
                frameLayout2 = frameLayout5;
            }
            frameLayout2.addView(this.f71299l, 2, new ViewGroup.LayoutParams(-2, -1));
        }
    }

    public final void O(og.t tVar) {
        FrameLayout frameLayout = this.f71296i;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            kotlin.jvm.internal.g0.S("wordPlanCard");
            frameLayout = null;
        }
        for (View view : ViewGroupKt.getChildren(frameLayout)) {
            LearnCardView learnCardView = view instanceof LearnCardView ? (LearnCardView) view : null;
            if (learnCardView != null) {
                this.f71300m = learnCardView;
            }
            if (view instanceof AllInOneView) {
                FrameLayout frameLayout3 = this.f71296i;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.g0.S("wordPlanCard");
                    frameLayout3 = null;
                }
                frameLayout3.removeView(view);
                this.f71299l = null;
            }
        }
        if (this.f71300m == null) {
            qb.c.i(f71294q, "installExam", new Object[0]);
            FrameLayout frameLayout4 = this.f71296i;
            if (frameLayout4 == null) {
                kotlin.jvm.internal.g0.S("wordPlanCard");
                frameLayout4 = null;
            }
            Context context = frameLayout4.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            LearnCardView learnCardView2 = new LearnCardView(context, null, 0, 6, null);
            this.f71300m = learnCardView2;
            learnCardView2.setOldVM(tVar);
            FrameLayout frameLayout5 = this.f71296i;
            if (frameLayout5 == null) {
                kotlin.jvm.internal.g0.S("wordPlanCard");
            } else {
                frameLayout2 = frameLayout5;
            }
            frameLayout2.addView(this.f71300m, 2, new ViewGroup.LayoutParams(-2, -1));
        }
    }

    @Override // zf.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k e holder, @m80.k og.t item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        if (this.f71298k == null) {
            this.f71298k = item;
            holder.C(item);
        }
    }

    @Override // zf.b
    @m80.k
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public e u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        nh c11 = nh.c(inflater);
        c11.f56073d.getRoot().setOnWordPlanInteraction(this);
        WordPlanInfoView root = c11.f56073d.getRoot();
        kotlin.jvm.internal.g0.o(root, "getRoot(...)");
        this.f71297j = root;
        FrameLayout root2 = c11.getRoot();
        kotlin.jvm.internal.g0.o(root2, "getRoot(...)");
        this.f71296i = root2;
        kotlin.jvm.internal.g0.o(c11, "apply(...)");
        return new e(this, c11);
    }

    public final void R() {
        FrameLayout frameLayout = this.f71296i;
        if (frameLayout == null) {
            kotlin.jvm.internal.g0.S("wordPlanCard");
            frameLayout = null;
        }
        for (View view : k0.P0(ViewGroupKt.getChildren(frameLayout), new x00.l() { // from class: lg.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean S;
                S = q.S((View) obj);
                return Boolean.valueOf(S);
            }
        })) {
            FrameLayout frameLayout2 = this.f71296i;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.g0.S("wordPlanCard");
                frameLayout2 = null;
            }
            frameLayout2.removeView(view);
        }
        this.f71299l = null;
        this.f71300m = null;
    }

    @Override // com.baicizhan.main.home.plan.view.WordPlanInfoView.e
    public void a(int i11) {
        String str = f71294q;
        qb.c.b(str, "onBehavior: " + i11, new Object[0]);
        og.t tVar = null;
        switch (i11) {
            case 1:
                og.t tVar2 = this.f71298k;
                if (tVar2 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar2;
                }
                tVar.j0();
                break;
            case 2:
                og.t tVar3 = this.f71298k;
                if (tVar3 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar3;
                }
                tVar.H0();
                break;
            case 3:
                og.t tVar4 = this.f71298k;
                if (tVar4 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar4;
                }
                tVar.g0();
                break;
            case 4:
                og.t tVar5 = this.f71298k;
                if (tVar5 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar5;
                }
                tVar.C();
                break;
            case 5:
                ma.l.a(ma.t.f73003b, ma.a.f72775k);
                c cVar = this.f71295h;
                og.t tVar6 = this.f71298k;
                if (tVar6 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar6;
                }
                Pair<BookRecord, Integer> a02 = tVar.a0();
                if (a02 != null) {
                    cVar.r(new PrioritizedTask.ShowOff(a02));
                    break;
                }
                break;
            case 6:
                og.t tVar7 = this.f71298k;
                if (tVar7 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar7;
                }
                tVar.s0();
                break;
            case 7:
            case 8:
                og.t tVar8 = this.f71298k;
                if (tVar8 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar8;
                }
                tVar.f0();
                break;
            case 9:
                og.t tVar9 = this.f71298k;
                if (tVar9 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar9;
                }
                tVar.h0();
                break;
            case 10:
                og.t tVar10 = this.f71298k;
                if (tVar10 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar10;
                }
                tVar.i0();
                break;
            case 11:
            case 12:
                og.t tVar11 = this.f71298k;
                if (tVar11 == null) {
                    kotlin.jvm.internal.g0.S("learnCardViewModel");
                } else {
                    tVar = tVar11;
                }
                tVar.e0();
                break;
            default:
                qb.c.d(str, "Unknown behavior: " + i11, new Object[0]);
                break;
        }
    }

    @Override // com.baicizhan.main.home.plan.view.WordPlanInfoView.e
    public void b(int i11, @m80.l Object obj) {
        og.t tVar = null;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            og.t tVar2 = this.f71298k;
            if (tVar2 == null) {
                kotlin.jvm.internal.g0.S("learnCardViewModel");
            } else {
                tVar = tVar2;
            }
            tVar.G0();
            return;
        }
        if (this.f71296i == null) {
            qb.c.d(f71294q, "wordPlanCard view null", new Object[0]);
            return;
        }
        ma.l.a(ma.t.f73003b, ma.a.S);
        FrameLayout frameLayout = this.f71296i;
        if (frameLayout == null) {
            kotlin.jvm.internal.g0.S("wordPlanCard");
            frameLayout = null;
        }
        Context context = frameLayout.getContext();
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            WordListActivity.r1(context, !bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.baicizhan.main.home.plan.view.WordPlanInfoView.e
    public void onRefresh() {
        og.t tVar = this.f71298k;
        if (tVar == null) {
            kotlin.jvm.internal.g0.S("learnCardViewModel");
            tVar = null;
        }
        tVar.y0();
    }
}
