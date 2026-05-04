package com.baicizhan.main.home.plan.view;

import a00.a0;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.m;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.SpKeys;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.webview.MapLearnHelper;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.home.plan.data.LearningState;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.main.rx.BookAdObservables;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;
import gs.uo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import ma.u;
import sa.q;
import tj.i;
import xu.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordPlanInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanInfoView.kt\ncom/baicizhan/main/home/plan/view/WordPlanInfoView\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,775:1\n18#2,3:776\n18#2,3:779\n*S KotlinDebug\n*F\n+ 1 WordPlanInfoView.kt\ncom/baicizhan/main/home/plan/view/WordPlanInfoView\n*L\n472#1:776,3\n482#1:779,3\n*E\n"})
/* loaded from: classes4.dex */
public final class WordPlanInfoView extends ConstraintLayout {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f22923j = new c(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f22924k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final String f22925l = WordPlanInfoView.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f22926m = " 词";

    /* renamed from: n, reason: collision with root package name */
    public static final int f22927n = 1440;

    /* renamed from: a, reason: collision with root package name */
    @l
    public e f22928a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public LearnCardStatus f22929b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public View f22930c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f22931d;

    /* renamed from: e, reason: collision with root package name */
    public int f22932e;

    /* renamed from: f, reason: collision with root package name */
    public int f22933f;

    /* renamed from: g, reason: collision with root package name */
    public int f22934g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ValueAnimator f22935h;

    /* renamed from: i, reason: collision with root package name */
    public uo f22936i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @zz.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* renamed from: k, reason: collision with root package name */
        @k
        public static final C0314a f22937k = C0314a.f22950a;

        /* renamed from: l, reason: collision with root package name */
        public static final int f22938l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static final int f22939m = 2;

        /* renamed from: n, reason: collision with root package name */
        public static final int f22940n = 3;

        /* renamed from: o, reason: collision with root package name */
        public static final int f22941o = 4;

        /* renamed from: p, reason: collision with root package name */
        public static final int f22942p = 5;

        /* renamed from: q, reason: collision with root package name */
        public static final int f22943q = 6;

        /* renamed from: r, reason: collision with root package name */
        public static final int f22944r = 7;

        /* renamed from: s, reason: collision with root package name */
        public static final int f22945s = 8;

        /* renamed from: t, reason: collision with root package name */
        public static final int f22946t = 9;

        /* renamed from: u, reason: collision with root package name */
        public static final int f22947u = 10;

        /* renamed from: v, reason: collision with root package name */
        public static final int f22948v = 11;

        /* renamed from: w, reason: collision with root package name */
        public static final int f22949w = 12;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.home.plan.view.WordPlanInfoView$a$a, reason: collision with other inner class name */
        public static final class C0314a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ C0314a f22950a = new C0314a();

            /* renamed from: b, reason: collision with root package name */
            public static final int f22951b = 1;

            /* renamed from: c, reason: collision with root package name */
            public static final int f22952c = 2;

            /* renamed from: d, reason: collision with root package name */
            public static final int f22953d = 3;

            /* renamed from: e, reason: collision with root package name */
            public static final int f22954e = 4;

            /* renamed from: f, reason: collision with root package name */
            public static final int f22955f = 5;

            /* renamed from: g, reason: collision with root package name */
            public static final int f22956g = 6;

            /* renamed from: h, reason: collision with root package name */
            public static final int f22957h = 7;

            /* renamed from: i, reason: collision with root package name */
            public static final int f22958i = 8;

            /* renamed from: j, reason: collision with root package name */
            public static final int f22959j = 9;

            /* renamed from: k, reason: collision with root package name */
            public static final int f22960k = 10;

            /* renamed from: l, reason: collision with root package name */
            public static final int f22961l = 11;

            /* renamed from: m, reason: collision with root package name */
            public static final int f22962m = 12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @zz.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* renamed from: x, reason: collision with root package name */
        @k
        public static final a f22963x = a.f22966a;

        /* renamed from: y, reason: collision with root package name */
        public static final int f22964y = 1;

        /* renamed from: z, reason: collision with root package name */
        public static final int f22965z = 2;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f22966a = new a();

            /* renamed from: b, reason: collision with root package name */
            public static final int f22967b = 1;

            /* renamed from: c, reason: collision with root package name */
            public static final int f22968c = 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        @k
        public final String a(@k Context context, int i11) {
            g0.p(context, "context");
            Resources resources = context.getResources();
            String string = i11 <= 60 ? resources.getString(R.string.word_plan_card_plan_time_minutes, Integer.valueOf(i11)) : i11 >= 1440 ? resources.getString(R.string.word_plan_card_plan_time_longer_than_a_day) : resources.getString(R.string.word_plan_card_plan_time_hours_minutes, Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60));
            g0.o(string, "let(...)");
            return string;
        }

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22969a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22970b;

        static {
            int[] iArr = new int[LearnCardStatus.values().length];
            try {
                iArr[LearnCardStatus.LEARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LearnCardStatus.CAKE_LEARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LearnCardStatus.REVIEWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LearnCardStatus.ALL_KILL_NEXT_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LearnCardStatus.FINISHING_LEARNING_TOADY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LearnCardStatus.CAKE_ALL_FINISHING_LEARNING_TODAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LearnCardStatus.CAKE_ALL_KILL_TODAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LearnCardStatus.QUIZZER_LEARNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LearnCardStatus.QUIZZER_REVIEWING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LearnCardStatus.QUIZZER_ALL_KILL_NEXT_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LearnCardStatus.CAKE_FINISHING_LEARNING_TODAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LearnCardStatus.FINISHING_REVIEW_TODAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LearnCardStatus.ALL_FINISHING_LEARNING_TODAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LearnCardStatus.ALL_FINISH_REVIEW_TODAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LearnCardStatus.ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LearnCardStatus.LOADING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f22969a = iArr;
            int[] iArr2 = new int[LearningState.values().length];
            try {
                iArr2[LearningState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[LearningState.ALL_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[LearningState.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f22970b = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
        }

        static /* synthetic */ void c(e eVar, int i11, Object obj, int i12, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBookEvent");
            }
            if ((i12 & 2) != 0) {
                obj = null;
            }
            eVar.b(i11, obj);
        }

        void a(int i11);

        void b(int i11, @l Object obj);

        void onRefresh();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordPlanInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanInfoView.kt\ncom/baicizhan/main/home/plan/view/WordPlanInfoView$enableNameWidthEvaluation$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,775:1\n254#2:776\n*S KotlinDebug\n*F\n+ 1 WordPlanInfoView.kt\ncom/baicizhan/main/home/plan/view/WordPlanInfoView$enableNameWidthEvaluation$1\n*L\n226#1:776\n*E\n"})
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Rect rect = new Rect();
            uo uoVar = WordPlanInfoView.this.f22936i;
            uo uoVar2 = null;
            if (uoVar == null) {
                g0.S("binding");
                uoVar = null;
            }
            uoVar.N.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            uo uoVar3 = WordPlanInfoView.this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
                uoVar3 = null;
            }
            uoVar3.f57079n.getGlobalVisibleRect(rect2);
            Pair pair = new Pair(rect, rect2);
            WordPlanInfoView wordPlanInfoView = WordPlanInfoView.this;
            qb.c.b(WordPlanInfoView.f22925l, "adjust " + pair.getFirst() + ", name " + pair.getSecond(), new Object[0]);
            uo uoVar4 = wordPlanInfoView.f22936i;
            if (uoVar4 == null) {
                g0.S("binding");
                uoVar4 = null;
            }
            ImageView wpPlanUpdate = uoVar4.N;
            g0.o(wpPlanUpdate, "wpPlanUpdate");
            if (wpPlanUpdate.getVisibility() != 0 || ((Rect) pair.getFirst()).left <= 0) {
                uo uoVar5 = wordPlanInfoView.f22936i;
                if (uoVar5 == null) {
                    g0.S("binding");
                    uoVar5 = null;
                }
                uoVar5.f57079n.setMaxWidth((wordPlanInfoView.getRight() - ((Rect) pair.getSecond()).left) - wordPlanInfoView.getResources().getDimensionPixelSize(R.dimen.word_plan_book_name_margin_right));
            } else {
                uo uoVar6 = wordPlanInfoView.f22936i;
                if (uoVar6 == null) {
                    g0.S("binding");
                    uoVar6 = null;
                }
                uoVar6.f57079n.setMaxWidth((((Rect) pair.getFirst()).left - ((Rect) pair.getSecond()).left) - wordPlanInfoView.getResources().getDimensionPixelSize(R.dimen.word_plan_book_name_margin_right));
            }
            uo uoVar7 = WordPlanInfoView.this.f22936i;
            if (uoVar7 == null) {
                g0.S("binding");
            } else {
                uoVar2 = uoVar7;
            }
            uoVar2.f57079n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordPlanInfoView(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public static final g2 A(WordPlanInfoView wordPlanInfoView, View it) {
        g0.p(it, "it");
        qb.c.b(f22925l, "attempt to adjust plan", new Object[0]);
        e eVar = wordPlanInfoView.f22928a;
        if (eVar != null) {
            eVar.a(3);
        }
        View view = wordPlanInfoView.f22931d;
        if (view != null) {
            q.z(view, false);
            nc.b.b().j(SpKeys.WORDS_PLAN_MULTI_MODE_TIPS, false);
        }
        uo uoVar = wordPlanInfoView.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        if (g0.g(it, uoVar.G) && !i9.f.c(wordPlanInfoView.getContext(), i9.f.f60388o)) {
            i9.f.j(wordPlanInfoView.getContext(), i9.f.f60388o, true);
        }
        return g2.f100423a;
    }

    public static final g2 B(WordPlanInfoView wordPlanInfoView, View it) {
        Context context;
        g0.p(it, "it");
        i.a aVar = i.f90704f;
        if (wordPlanInfoView.getContext() instanceof p.a) {
            Context context2 = wordPlanInfoView.getContext();
            g0.n(context2, "null cannot be cast to non-null type dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper");
            context = ((p.a) context2).getBaseContext();
        } else {
            context = wordPlanInfoView.getContext();
        }
        g0.n(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        Object tag = it.getTag();
        BookAdObservables.BookAdInfo bookAdInfo = tag instanceof BookAdObservables.BookAdInfo ? (BookAdObservables.BookAdInfo) tag : null;
        if (bookAdInfo == null) {
            return g2.f100423a;
        }
        aVar.e(activity, bookAdInfo, 0);
        return g2.f100423a;
    }

    public static final boolean C(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean D(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final g2 E(WordPlanInfoView wordPlanInfoView, View it) {
        g0.p(it, "it");
        e eVar = wordPlanInfoView.f22928a;
        if (eVar != null) {
            eVar.onRefresh();
        }
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G(WordPlanInfoView wordPlanInfoView, LearnCardStatus learnCardStatus, Triple triple, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            triple = null;
        }
        wordPlanInfoView.F(learnCardStatus, triple);
    }

    public static final void I(WordPlanInfoView wordPlanInfoView, ValueAnimator it) {
        g0.p(it, "it");
        uo uoVar = wordPlanInfoView.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        ProgressBar progressBar = uoVar.I;
        Object animatedValue = it.getAnimatedValue();
        g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressBar.setProgress(((Integer) animatedValue).intValue());
    }

    public static /* synthetic */ void L(WordPlanInfoView wordPlanInfoView, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = -1;
        }
        if ((i13 & 2) != 0) {
            i12 = -1;
        }
        wordPlanInfoView.K(i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void P(WordPlanInfoView wordPlanInfoView, LearnCardStatus learnCardStatus, Triple triple, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            triple = null;
        }
        wordPlanInfoView.O(learnCardStatus, triple);
    }

    public static final g2 w(WordPlanInfoView wordPlanInfoView, View it) {
        g0.p(it, "it");
        e eVar = wordPlanInfoView.f22928a;
        if (eVar != null) {
            e.c(eVar, 2, null, 2, null);
        }
        return g2.f100423a;
    }

    public static final g2 x(WordPlanInfoView wordPlanInfoView, View it) {
        g0.p(it, "it");
        uo uoVar = wordPlanInfoView.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        LinearLayout mapLearnTip = uoVar.f57067b;
        g0.o(mapLearnTip, "mapLearnTip");
        q.z(mapLearnTip, false);
        return g2.f100423a;
    }

    public static final g2 y(WordPlanInfoView wordPlanInfoView, View it) {
        g0.p(it, "it");
        qb.c.b(f22925l, "button as " + it.getTag(), new Object[0]);
        e eVar = wordPlanInfoView.f22928a;
        if (eVar != null) {
            Object tag = it.getTag();
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num == null) {
                return g2.f100423a;
            }
            eVar.a(num.intValue());
        }
        return g2.f100423a;
    }

    public static final g2 z(WordPlanInfoView wordPlanInfoView, View it) {
        boolean z11;
        g0.p(it, "it");
        e eVar = wordPlanInfoView.f22928a;
        if (eVar != null) {
            uo uoVar = wordPlanInfoView.f22936i;
            if (uoVar == null) {
                g0.S("binding");
                uoVar = null;
            }
            if (!g0.g(it, uoVar.f57076k)) {
                uo uoVar2 = wordPlanInfoView.f22936i;
                if (uoVar2 == null) {
                    g0.S("binding");
                    uoVar2 = null;
                }
                TextView wpReviewRoundTip = uoVar2.Q;
                g0.o(wpReviewRoundTip, "wpReviewRoundTip");
                if (!q.m(wpReviewRoundTip)) {
                    z11 = false;
                    eVar.b(1, Boolean.valueOf(z11));
                }
            }
            z11 = true;
            eVar.b(1, Boolean.valueOf(z11));
        }
        nc.b.b().j(SpKeys.WORDS_PLAN_BOOK_DETAIL_POPUP_MSG, false);
        View view = wordPlanInfoView.f22930c;
        if (view != null) {
            q.z(view, false);
            wordPlanInfoView.s();
        }
        uo uoVar3 = wordPlanInfoView.f22936i;
        if (uoVar3 == null) {
            g0.S("binding");
            uoVar3 = null;
        }
        if (g0.g(it, uoVar3.f57075j)) {
            wordPlanInfoView.f22930c = null;
        }
        return g2.f100423a;
    }

    public final void F(LearnCardStatus learnCardStatus, Triple<? extends LearningState, ? extends LearningState, ? extends LearningState> triple) {
        Integer num;
        boolean z11;
        LearningState learningState;
        int i11;
        Pair pair;
        Integer valueOf = Integer.valueOf(R.string.word_plan_buttons_show_off);
        Integer valueOf2 = Integer.valueOf(R.string.word_plan_buttons_punch_card);
        if (triple == null) {
            uo uoVar = this.f22936i;
            if (uoVar == null) {
                g0.S("binding");
                uoVar = null;
            }
            TextView wpBtnLeft = uoVar.f57081p;
            g0.o(wpBtnLeft, "wpBtnLeft");
            N(wpBtnLeft, true, true);
            uo uoVar2 = this.f22936i;
            if (uoVar2 == null) {
                g0.S("binding");
                uoVar2 = null;
            }
            TextView wpBtnRight = uoVar2.f57085t;
            g0.o(wpBtnRight, "wpBtnRight");
            N(wpBtnRight, true, true);
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
                uoVar3 = null;
            }
            TextView wpBtnMainLight = uoVar3.f57084s;
            g0.o(wpBtnMainLight, "wpBtnMainLight");
            N(wpBtnMainLight, true, true);
            num = 1;
        } else {
            LearningState component1 = triple.component1();
            LearningState component2 = triple.component2();
            LearningState component3 = triple.component3();
            uo uoVar4 = this.f22936i;
            if (uoVar4 == null) {
                g0.S("binding");
                uoVar4 = null;
            }
            TextView wpBtnLeft2 = uoVar4.f57081p;
            g0.o(wpBtnLeft2, "wpBtnLeft");
            LearningState learningState2 = LearningState.UNDONE;
            int compareTo = component2.compareTo(learningState2);
            LearningState learningState3 = LearningState.DONE;
            boolean z12 = compareTo >= 0 ? component1.compareTo(learningState3) >= 0 : component1 == learningState3;
            if (component1.compareTo(learningState2) >= 0) {
                num = 1;
                z11 = true;
            } else {
                num = 1;
                z11 = false;
            }
            N(wpBtnLeft2, z12, z11);
            uo uoVar5 = this.f22936i;
            if (uoVar5 == null) {
                g0.S("binding");
                uoVar5 = null;
            }
            TextView wpBtnRight2 = uoVar5.f57085t;
            g0.o(wpBtnRight2, "wpBtnRight");
            N(wpBtnRight2, component1.compareTo(learningState2) >= 0 ? component1 == learningState2 || (component1 == (learningState = LearningState.DONE) && component2 == learningState) : component2 == LearningState.DONE, component2.compareTo(learningState2) >= 0);
            uo uoVar6 = this.f22936i;
            if (uoVar6 == null) {
                g0.S("binding");
                uoVar6 = null;
            }
            TextView wpBtnMainLight2 = uoVar6.f57084s;
            g0.o(wpBtnMainLight2, "wpBtnMainLight");
            N(wpBtnMainLight2, false, component3.compareTo(learningState2) >= 0);
        }
        int[] iArr = d.f22969a;
        int i12 = iArr[learnCardStatus.ordinal()];
        if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
            uo uoVar7 = this.f22936i;
            if (uoVar7 == null) {
                g0.S("binding");
                uoVar7 = null;
            }
            TextView wpBtnMain = uoVar7.f57082q;
            g0.o(wpBtnMain, "wpBtnMain");
            q.z(wpBtnMain, true);
            uo uoVar8 = this.f22936i;
            if (uoVar8 == null) {
                g0.S("binding");
                uoVar8 = null;
            }
            TextView wpBtnLeft3 = uoVar8.f57081p;
            g0.o(wpBtnLeft3, "wpBtnLeft");
            q.z(wpBtnLeft3, false);
            uo uoVar9 = this.f22936i;
            if (uoVar9 == null) {
                g0.S("binding");
                uoVar9 = null;
            }
            TextView wpBtnRight3 = uoVar9.f57085t;
            g0.o(wpBtnRight3, "wpBtnRight");
            q.z(wpBtnRight3, false);
            uo uoVar10 = this.f22936i;
            if (uoVar10 == null) {
                g0.S("binding");
                uoVar10 = null;
            }
            TextView wpBtnMainLight3 = uoVar10.f57084s;
            g0.o(wpBtnMainLight3, "wpBtnMainLight");
            q.z(wpBtnMainLight3, false);
            uo uoVar11 = this.f22936i;
            if (uoVar11 == null) {
                g0.S("binding");
                uoVar11 = null;
            }
            TextView textView = uoVar11.f57082q;
            Resources resources = getResources();
            int i13 = iArr[learnCardStatus.ordinal()];
            if (i13 == 1 || i13 == 2) {
                Integer num2 = num;
                uo uoVar12 = this.f22936i;
                if (uoVar12 == null) {
                    g0.S("binding");
                    uoVar12 = null;
                }
                uoVar12.f57082q.setTag(num2);
                g2 g2Var = g2.f100423a;
                i11 = R.string.word_plan_buttons_start_learning;
            } else if (i13 == 3) {
                uo uoVar13 = this.f22936i;
                if (uoVar13 == null) {
                    g0.S("binding");
                    uoVar13 = null;
                }
                uoVar13.f57082q.setTag(num);
                g2 g2Var2 = g2.f100423a;
                i11 = R.string.word_plan_buttons_start_reviewing;
            } else {
                if (i13 != 4) {
                    throw new RuntimeException("Unknown type: " + learnCardStatus);
                }
                uo uoVar14 = this.f22936i;
                if (uoVar14 == null) {
                    g0.S("binding");
                    uoVar14 = null;
                }
                uoVar14.f57082q.setTag(3);
                g2 g2Var3 = g2.f100423a;
                i11 = R.string.word_plan_buttons_start_new_plan;
            }
            textView.setText(resources.getString(i11));
            g2 g2Var4 = g2.f100423a;
            return;
        }
        int i14 = R.string.word_plan_buttons_review_undone;
        int i15 = R.string.word_plan_buttons_learning_all_done;
        switch (i12) {
            case 8:
                uo uoVar15 = this.f22936i;
                if (uoVar15 == null) {
                    g0.S("binding");
                    uoVar15 = null;
                }
                TextView wpBtnMain2 = uoVar15.f57082q;
                g0.o(wpBtnMain2, "wpBtnMain");
                q.z(wpBtnMain2, false);
                uo uoVar16 = this.f22936i;
                if (uoVar16 == null) {
                    g0.S("binding");
                    uoVar16 = null;
                }
                TextView wpBtnLeft4 = uoVar16.f57081p;
                g0.o(wpBtnLeft4, "wpBtnLeft");
                q.z(wpBtnLeft4, true);
                uo uoVar17 = this.f22936i;
                if (uoVar17 == null) {
                    g0.S("binding");
                    uoVar17 = null;
                }
                TextView wpBtnRight4 = uoVar17.f57085t;
                g0.o(wpBtnRight4, "wpBtnRight");
                q.z(wpBtnRight4, true);
                uo uoVar18 = this.f22936i;
                if (uoVar18 == null) {
                    g0.S("binding");
                    uoVar18 = null;
                }
                TextView wpBtnMainLight4 = uoVar18.f57084s;
                g0.o(wpBtnMainLight4, "wpBtnMainLight");
                q.z(wpBtnMainLight4, false);
                if (triple != null) {
                    uo uoVar19 = this.f22936i;
                    if (uoVar19 == null) {
                        g0.S("binding");
                        uoVar19 = null;
                    }
                    TextView textView2 = uoVar19.f57081p;
                    Resources resources2 = getResources();
                    LearningState c11 = mg.f.c(triple);
                    int[] iArr2 = d.f22970b;
                    int i16 = iArr2[c11.ordinal()];
                    if (i16 == 1) {
                        i15 = R.string.word_plan_buttons_learning_done;
                    } else if (i16 != 2) {
                        i15 = R.string.word_plan_buttons_learning_undone;
                    }
                    textView2.setText(resources2.getString(i15));
                    uo uoVar20 = this.f22936i;
                    if (uoVar20 == null) {
                        g0.S("binding");
                        uoVar20 = null;
                    }
                    TextView textView3 = uoVar20.f57085t;
                    Resources resources3 = getResources();
                    if (iArr2[mg.f.d(triple).ordinal()] == 1) {
                        i14 = R.string.word_plan_buttons_review_done;
                    }
                    textView3.setText(resources3.getString(i14));
                    uo uoVar21 = this.f22936i;
                    if (uoVar21 == null) {
                        g0.S("binding");
                        uoVar21 = null;
                    }
                    TextView textView4 = uoVar21.f57081p;
                    LearningState c12 = mg.f.c(triple);
                    LearningState learningState4 = LearningState.DONE;
                    textView4.setTag(c12 == learningState4 ? 8 : 7);
                    uo uoVar22 = this.f22936i;
                    if (uoVar22 == null) {
                        g0.S("binding");
                        uoVar22 = null;
                    }
                    uoVar22.f57085t.setTag(Integer.valueOf(mg.f.d(triple) == learningState4 ? 10 : 9));
                    g2 g2Var5 = g2.f100423a;
                    return;
                }
                return;
            case 9:
                uo uoVar23 = this.f22936i;
                if (uoVar23 == null) {
                    g0.S("binding");
                    uoVar23 = null;
                }
                TextView wpBtnMain3 = uoVar23.f57082q;
                g0.o(wpBtnMain3, "wpBtnMain");
                q.z(wpBtnMain3, false);
                uo uoVar24 = this.f22936i;
                if (uoVar24 == null) {
                    g0.S("binding");
                    uoVar24 = null;
                }
                TextView wpBtnLeft5 = uoVar24.f57081p;
                g0.o(wpBtnLeft5, "wpBtnLeft");
                q.z(wpBtnLeft5, false);
                uo uoVar25 = this.f22936i;
                if (uoVar25 == null) {
                    g0.S("binding");
                    uoVar25 = null;
                }
                TextView wpBtnRight5 = uoVar25.f57085t;
                g0.o(wpBtnRight5, "wpBtnRight");
                q.z(wpBtnRight5, false);
                uo uoVar26 = this.f22936i;
                if (uoVar26 == null) {
                    g0.S("binding");
                    uoVar26 = null;
                }
                TextView wpBtnMainLight5 = uoVar26.f57084s;
                g0.o(wpBtnMainLight5, "wpBtnMainLight");
                q.z(wpBtnMainLight5, true);
                LearningState e11 = triple != null ? mg.f.e(triple) : null;
                int i17 = e11 == null ? -1 : d.f22970b[e11.ordinal()];
                if (i17 == 1) {
                    uo uoVar27 = this.f22936i;
                    if (uoVar27 == null) {
                        g0.S("binding");
                        uoVar27 = null;
                    }
                    uoVar27.f57084s.setText(getResources().getString(R.string.word_plan_buttons_other_review_done));
                    uo uoVar28 = this.f22936i;
                    if (uoVar28 == null) {
                        g0.S("binding");
                        uoVar28 = null;
                    }
                    uoVar28.f57084s.setTag(12);
                    g2 g2Var6 = g2.f100423a;
                    return;
                }
                if (i17 == 2 || i17 == 3) {
                    uo uoVar29 = this.f22936i;
                    if (uoVar29 == null) {
                        g0.S("binding");
                        uoVar29 = null;
                    }
                    uoVar29.f57084s.setText(getResources().getString(R.string.word_plan_buttons_learning_all_done));
                    g2 g2Var7 = g2.f100423a;
                    return;
                }
                uo uoVar30 = this.f22936i;
                if (uoVar30 == null) {
                    g0.S("binding");
                    uoVar30 = null;
                }
                uoVar30.f57084s.setText(getResources().getString(R.string.word_plan_buttons_review_undone));
                uo uoVar31 = this.f22936i;
                if (uoVar31 == null) {
                    g0.S("binding");
                    uoVar31 = null;
                }
                uoVar31.f57084s.setTag(11);
                g2 g2Var8 = g2.f100423a;
                return;
            case 10:
                uo uoVar32 = this.f22936i;
                if (uoVar32 == null) {
                    g0.S("binding");
                    uoVar32 = null;
                }
                TextView wpBtnMain4 = uoVar32.f57082q;
                g0.o(wpBtnMain4, "wpBtnMain");
                q.z(wpBtnMain4, false);
                uo uoVar33 = this.f22936i;
                if (uoVar33 == null) {
                    g0.S("binding");
                    uoVar33 = null;
                }
                TextView wpBtnLeft6 = uoVar33.f57081p;
                g0.o(wpBtnLeft6, "wpBtnLeft");
                q.z(wpBtnLeft6, false);
                uo uoVar34 = this.f22936i;
                if (uoVar34 == null) {
                    g0.S("binding");
                    uoVar34 = null;
                }
                TextView wpBtnRight6 = uoVar34.f57085t;
                g0.o(wpBtnRight6, "wpBtnRight");
                q.z(wpBtnRight6, false);
                uo uoVar35 = this.f22936i;
                if (uoVar35 == null) {
                    g0.S("binding");
                    uoVar35 = null;
                }
                TextView wpBtnMainLight6 = uoVar35.f57084s;
                g0.o(wpBtnMainLight6, "wpBtnMainLight");
                N(wpBtnMainLight6, false, true);
                uo uoVar36 = this.f22936i;
                if (uoVar36 == null) {
                    g0.S("binding");
                    uoVar36 = null;
                }
                TextView wpBtnMainLight7 = uoVar36.f57084s;
                g0.o(wpBtnMainLight7, "wpBtnMainLight");
                q.z(wpBtnMainLight7, true);
                uo uoVar37 = this.f22936i;
                if (uoVar37 == null) {
                    g0.S("binding");
                    uoVar37 = null;
                }
                uoVar37.f57084s.setText(R.string.word_plan_buttons_start_new_plan_quizzer);
                uo uoVar38 = this.f22936i;
                if (uoVar38 == null) {
                    g0.S("binding");
                    uoVar38 = null;
                }
                uoVar38.f57084s.setTag(3);
                g2 g2Var9 = g2.f100423a;
                return;
            case 11:
            case 12:
                uo uoVar39 = this.f22936i;
                if (uoVar39 == null) {
                    g0.S("binding");
                    uoVar39 = null;
                }
                TextView wpBtnMain5 = uoVar39.f57082q;
                g0.o(wpBtnMain5, "wpBtnMain");
                q.z(wpBtnMain5, false);
                uo uoVar40 = this.f22936i;
                if (uoVar40 == null) {
                    g0.S("binding");
                    uoVar40 = null;
                }
                TextView wpBtnLeft7 = uoVar40.f57081p;
                g0.o(wpBtnLeft7, "wpBtnLeft");
                q.z(wpBtnLeft7, false);
                uo uoVar41 = this.f22936i;
                if (uoVar41 == null) {
                    g0.S("binding");
                    uoVar41 = null;
                }
                TextView wpBtnRight7 = uoVar41.f57085t;
                g0.o(wpBtnRight7, "wpBtnRight");
                q.z(wpBtnRight7, false);
                uo uoVar42 = this.f22936i;
                if (uoVar42 == null) {
                    g0.S("binding");
                    uoVar42 = null;
                }
                TextView wpBtnMainLight8 = uoVar42.f57084s;
                g0.o(wpBtnMainLight8, "wpBtnMainLight");
                q.z(wpBtnMainLight8, true);
                uo uoVar43 = this.f22936i;
                if (uoVar43 == null) {
                    g0.S("binding");
                    uoVar43 = null;
                }
                TextView textView5 = uoVar43.f57084s;
                String string = getResources().getString(R.string.word_plan_buttons_punch_card);
                uo uoVar44 = this.f22936i;
                if (uoVar44 == null) {
                    g0.S("binding");
                    uoVar44 = null;
                }
                uoVar44.f57084s.setTag(4);
                textView5.setText(string);
                g2 g2Var10 = g2.f100423a;
                return;
            default:
                uo uoVar45 = this.f22936i;
                if (uoVar45 == null) {
                    g0.S("binding");
                    uoVar45 = null;
                }
                TextView wpBtnMain6 = uoVar45.f57082q;
                g0.o(wpBtnMain6, "wpBtnMain");
                q.z(wpBtnMain6, false);
                uo uoVar46 = this.f22936i;
                if (uoVar46 == null) {
                    g0.S("binding");
                    uoVar46 = null;
                }
                TextView wpBtnLeft8 = uoVar46.f57081p;
                g0.o(wpBtnLeft8, "wpBtnLeft");
                q.z(wpBtnLeft8, true);
                uo uoVar47 = this.f22936i;
                if (uoVar47 == null) {
                    g0.S("binding");
                    uoVar47 = null;
                }
                TextView wpBtnRight8 = uoVar47.f57085t;
                g0.o(wpBtnRight8, "wpBtnRight");
                q.z(wpBtnRight8, true);
                uo uoVar48 = this.f22936i;
                if (uoVar48 == null) {
                    g0.S("binding");
                    uoVar48 = null;
                }
                TextView wpBtnMainLight9 = uoVar48.f57084s;
                g0.o(wpBtnMainLight9, "wpBtnMainLight");
                q.z(wpBtnMainLight9, false);
                int i18 = iArr[learnCardStatus.ordinal()];
                if (i18 == 5) {
                    pair = new Pair(Integer.valueOf(R.string.word_plan_buttons_extra_learning), valueOf2);
                    uo uoVar49 = this.f22936i;
                    if (uoVar49 == null) {
                        g0.S("binding");
                        uoVar49 = null;
                    }
                    uoVar49.f57081p.setTag(2);
                    uo uoVar50 = this.f22936i;
                    if (uoVar50 == null) {
                        g0.S("binding");
                        uoVar50 = null;
                    }
                    uoVar50.f57085t.setTag(4);
                } else if (i18 == 6 || i18 == 7) {
                    pair = new Pair(Integer.valueOf(R.string.word_plan_buttons_words_quiz), valueOf);
                    uo uoVar51 = this.f22936i;
                    if (uoVar51 == null) {
                        g0.S("binding");
                        uoVar51 = null;
                    }
                    uoVar51.f57081p.setTag(6);
                    uo uoVar52 = this.f22936i;
                    if (uoVar52 == null) {
                        g0.S("binding");
                        uoVar52 = null;
                    }
                    uoVar52.f57085t.setTag(5);
                } else {
                    pair = new Pair(valueOf2, valueOf);
                    uo uoVar53 = this.f22936i;
                    if (uoVar53 == null) {
                        g0.S("binding");
                        uoVar53 = null;
                    }
                    uoVar53.f57081p.setTag(4);
                    uo uoVar54 = this.f22936i;
                    if (uoVar54 == null) {
                        g0.S("binding");
                        uoVar54 = null;
                    }
                    uoVar54.f57085t.setTag(5);
                }
                uo uoVar55 = this.f22936i;
                if (uoVar55 == null) {
                    g0.S("binding");
                    uoVar55 = null;
                }
                uoVar55.f57081p.setText(getResources().getString(((Number) pair.getFirst()).intValue()));
                uo uoVar56 = this.f22936i;
                if (uoVar56 == null) {
                    g0.S("binding");
                    uoVar56 = null;
                }
                uoVar56.f57085t.setText(getResources().getString(((Number) pair.getSecond()).intValue()));
                g2 g2Var11 = g2.f100423a;
                return;
        }
    }

    public final void H(int i11, int i12) {
        int i13;
        uo uoVar = null;
        if (i12 == 0) {
            uo uoVar2 = this.f22936i;
            if (uoVar2 == null) {
                g0.S("binding");
                uoVar2 = null;
            }
            i13 = uoVar2.I.getMax();
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
                uoVar3 = null;
            }
            uoVar3.J.setText(getResources().getString(R.string.word_plan_card_progress_value, Integer.valueOf(i11), Integer.valueOf(i11)));
        } else {
            float f11 = i11 / i12;
            uo uoVar4 = this.f22936i;
            if (uoVar4 == null) {
                g0.S("binding");
                uoVar4 = null;
            }
            int max = (int) (f11 * uoVar4.I.getMax());
            uo uoVar5 = this.f22936i;
            if (uoVar5 == null) {
                g0.S("binding");
                uoVar5 = null;
            }
            uoVar5.J.setText(getResources().getString(R.string.word_plan_card_progress_value, Integer.valueOf(i11), Integer.valueOf(i12)));
            i13 = max;
        }
        if (i13 != this.f22932e) {
            ValueAnimator valueAnimator = this.f22935h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f22932e = i13;
            uo uoVar6 = this.f22936i;
            if (uoVar6 == null) {
                g0.S("binding");
                uoVar6 = null;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(uoVar6.I.getProgress(), i13);
            uo uoVar7 = this.f22936i;
            if (uoVar7 == null) {
                g0.S("binding");
            } else {
                uoVar = uoVar7;
            }
            ofInt.setDuration(Math.max(300, Math.abs(uoVar.I.getProgress() - i13)));
            ofInt.setStartDelay(200L);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rg.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    WordPlanInfoView.I(WordPlanInfoView.this, valueAnimator2);
                }
            });
            this.f22935h = ofInt;
            ofInt.start();
        }
    }

    public final void J(int i11, int i12) {
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        uoVar.H.setText(getResources().getString(R.string.word_plan_card_progress_desc, Integer.valueOf(i12)));
    }

    public final void K(int i11, int i12) {
        uo uoVar = null;
        if (i11 > -1) {
            uo uoVar2 = this.f22936i;
            if (uoVar2 == null) {
                g0.S("binding");
                uoVar2 = null;
            }
            TextView wpNewCount = uoVar2.E;
            g0.o(wpNewCount, "wpNewCount");
            rg.q.c(wpNewCount, i11);
        }
        if (i12 > -1) {
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
            } else {
                uoVar = uoVar3;
            }
            TextView wpReviewCount = uoVar.O;
            g0.o(wpReviewCount, "wpReviewCount");
            rg.q.c(wpReviewCount, i12);
        }
    }

    public final void M() {
        LearnCardStatus learnCardStatus;
        View view = this.f22930c;
        if (view == null || !q.m(view)) {
            View view2 = this.f22931d;
            if ((view2 == null || !q.m(view2)) && (learnCardStatus = this.f22929b) != null && learnCardStatus.isNormalLearning() && !(m.f8648a.a() instanceof e.g)) {
                uo uoVar = this.f22936i;
                uo uoVar2 = null;
                if (uoVar == null) {
                    g0.S("binding");
                    uoVar = null;
                }
                LinearLayout mapLearnTip = uoVar.f57067b;
                g0.o(mapLearnTip, "mapLearnTip");
                MapLearnHelper mapLearnHelper = MapLearnHelper.INSTANCE;
                q.z(mapLearnTip, !KotlinExtKt.isKvFlagTrue(mapLearnHelper.getKEY_HAS_SHOW_MAP_TIP()));
                uo uoVar3 = this.f22936i;
                if (uoVar3 == null) {
                    g0.S("binding");
                } else {
                    uoVar2 = uoVar3;
                }
                LinearLayout mapLearnTip2 = uoVar2.f57067b;
                g0.o(mapLearnTip2, "mapLearnTip");
                if (q.m(mapLearnTip2)) {
                    KotlinExtKt.setKvFlagTrue(mapLearnHelper.getKEY_HAS_SHOW_MAP_TIP(), true);
                }
            }
        }
    }

    public final void N(TextView textView, boolean z11, boolean z12) {
        textView.setBackgroundResource(z11 ? R.drawable.bg_button_learning_second : R.drawable.bg_button_learning_primary);
        textView.setTextColor(textView.getResources().getColorStateList(z11 ? R.color.button_learning_second : R.color.button_learning_primary, null));
        textView.setEnabled(z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bd, code lost:
    
        if ((r18 != null ? mg.f.d(r18) : null) == com.baicizhan.main.home.plan.data.LearningState.UNAVAILABLE) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(@m80.k com.baicizhan.main.home.plan.data.LearnCardStatus r17, @m80.l kotlin.Triple<? extends com.baicizhan.main.home.plan.data.LearningState, ? extends com.baicizhan.main.home.plan.data.LearningState, ? extends com.baicizhan.main.home.plan.data.LearningState> r18) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.view.WordPlanInfoView.O(com.baicizhan.main.home.plan.data.LearnCardStatus, kotlin.Triple):void");
    }

    @k
    public final View getAdjustView() {
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        View wpAdjustGroup = uoVar.f57070e;
        g0.o(wpAdjustGroup, "wpAdjustGroup");
        return wpAdjustGroup;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void onFinishInflate() {
        super.onFinishInflate();
        uo a11 = uo.a(this);
        g0.o(a11, "bind(...)");
        this.f22936i = a11;
        Context context = getContext();
        g0.o(context, "getContext(...)");
        com.baicizhan.base.d.d(this, context);
        Context context2 = getContext();
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        ThemeResUtil.setBaicizhanProgress(context2, uoVar.I, 50, getContext().getResources().getColor(R.color.main_color_background_gray), ColorKt.m2563toArgb8_81llA(bk.b.g0()));
        uo uoVar2 = this.f22936i;
        if (uoVar2 == null) {
            g0.S("binding");
            uoVar2 = null;
        }
        ImageView wpPlanUpdate = uoVar2.N;
        g0.o(wpPlanUpdate, "wpPlanUpdate");
        q.t(wpPlanUpdate, 0, new x00.l() { // from class: rg.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 w11;
                w11 = WordPlanInfoView.w(WordPlanInfoView.this, (View) obj);
                return w11;
            }
        }, 1, null);
        uo uoVar3 = this.f22936i;
        if (uoVar3 == null) {
            g0.S("binding");
            uoVar3 = null;
        }
        ImageView tipClose = uoVar3.f57068c;
        g0.o(tipClose, "tipClose");
        q.t(tipClose, 0, new x00.l() { // from class: rg.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = WordPlanInfoView.x(WordPlanInfoView.this, (View) obj);
                return x11;
            }
        }, 1, null);
        uo uoVar4 = this.f22936i;
        if (uoVar4 == null) {
            g0.S("binding");
            uoVar4 = null;
        }
        TextView wpBtnMain = uoVar4.f57082q;
        g0.o(wpBtnMain, "wpBtnMain");
        uo uoVar5 = this.f22936i;
        if (uoVar5 == null) {
            g0.S("binding");
            uoVar5 = null;
        }
        TextView wpBtnMainLight = uoVar5.f57084s;
        g0.o(wpBtnMainLight, "wpBtnMainLight");
        uo uoVar6 = this.f22936i;
        if (uoVar6 == null) {
            g0.S("binding");
            uoVar6 = null;
        }
        TextView wpBtnLeft = uoVar6.f57081p;
        g0.o(wpBtnLeft, "wpBtnLeft");
        uo uoVar7 = this.f22936i;
        if (uoVar7 == null) {
            g0.S("binding");
            uoVar7 = null;
        }
        TextView wpBtnRight = uoVar7.f57085t;
        g0.o(wpBtnRight, "wpBtnRight");
        uo uoVar8 = this.f22936i;
        if (uoVar8 == null) {
            g0.S("binding");
            uoVar8 = null;
        }
        FrameLayout wpPlanQuizzerPunchCard = uoVar8.K;
        g0.o(wpPlanQuizzerPunchCard, "wpPlanQuizzerPunchCard");
        q.v(new View[]{wpBtnMain, wpBtnMainLight, wpBtnLeft, wpBtnRight, wpPlanQuizzerPunchCard}, 0, new x00.l() { // from class: rg.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 y11;
                y11 = WordPlanInfoView.y(WordPlanInfoView.this, (View) obj);
                return y11;
            }
        }, 1, null);
        uo uoVar9 = this.f22936i;
        if (uoVar9 == null) {
            g0.S("binding");
            uoVar9 = null;
        }
        AspectRoundImageView aspectRoundImageView = uoVar9.f57075j;
        uo uoVar10 = this.f22936i;
        if (uoVar10 == null) {
            g0.S("binding");
            uoVar10 = null;
        }
        q.v(new AspectRoundImageView[]{aspectRoundImageView, uoVar10.f57076k}, 0, new x00.l() { // from class: rg.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z11;
                z11 = WordPlanInfoView.z(WordPlanInfoView.this, (View) obj);
                return z11;
            }
        }, 1, null);
        if (u()) {
            uo uoVar11 = this.f22936i;
            if (uoVar11 == null) {
                g0.S("binding");
                uoVar11 = null;
            }
            ImageView imageView = uoVar11.f57077l;
            this.f22930c = imageView;
            if (imageView != null) {
                q.z(imageView, true);
            }
        }
        uo uoVar12 = this.f22936i;
        if (uoVar12 == null) {
            g0.S("binding");
            uoVar12 = null;
        }
        View view = uoVar12.f57069d;
        uo uoVar13 = this.f22936i;
        if (uoVar13 == null) {
            g0.S("binding");
            uoVar13 = null;
        }
        q.v(new View[]{view, uoVar13.f57083r}, 0, new x00.l() { // from class: rg.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A;
                A = WordPlanInfoView.A(WordPlanInfoView.this, (View) obj);
                return A;
            }
        }, 1, null);
        uo uoVar14 = this.f22936i;
        if (uoVar14 == null) {
            g0.S("binding");
            uoVar14 = null;
        }
        TextView wpBookLink = uoVar14.f57078m;
        g0.o(wpBookLink, "wpBookLink");
        q.t(wpBookLink, 0, new x00.l() { // from class: rg.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B;
                B = WordPlanInfoView.B(WordPlanInfoView.this, (View) obj);
                return B;
            }
        }, 1, null);
        uo uoVar15 = this.f22936i;
        if (uoVar15 == null) {
            g0.S("binding");
            uoVar15 = null;
        }
        uoVar15.f57088w.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: rg.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean C;
                C = WordPlanInfoView.C(view2, motionEvent);
                return C;
            }
        });
        uo uoVar16 = this.f22936i;
        if (uoVar16 == null) {
            g0.S("binding");
            uoVar16 = null;
        }
        uoVar16.B.setOnTouchListener(new View.OnTouchListener() { // from class: rg.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean D;
                D = WordPlanInfoView.D(view2, motionEvent);
                return D;
            }
        });
        uo uoVar17 = this.f22936i;
        if (uoVar17 == null) {
            g0.S("binding");
            uoVar17 = null;
        }
        TextView refresh = uoVar17.f57088w.f57791d;
        g0.o(refresh, "refresh");
        q.t(refresh, 0, new x00.l() { // from class: rg.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E;
                E = WordPlanInfoView.E(WordPlanInfoView.this, (View) obj);
                return E;
            }
        }, 1, null);
    }

    public final void s() {
        if (this.f22931d == null && v()) {
            uo uoVar = this.f22936i;
            if (uoVar == null) {
                g0.S("binding");
                uoVar = null;
            }
            ImageView imageView = uoVar.C;
            this.f22931d = imageView;
            if (imageView != null) {
                imageView.setTranslationX((-KotlinExtKt.getDpPixels(72)) + 0.0f);
                q.z(imageView, true);
            }
        }
    }

    public final void setBookAdInfo(@l BookAdObservables.BookAdInfo bookAdInfo) {
        String str;
        uo uoVar = this.f22936i;
        uo uoVar2 = null;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        TextView wpBookLink = uoVar.f57078m;
        g0.o(wpBookLink, "wpBookLink");
        if (bookAdInfo == null || (str = bookAdInfo.show_name) == null) {
            str = null;
        } else if (str.length() > 0) {
            ma.l.b(t.f73010i, ma.a.I0, u.c(new String[]{"id", "book_id", "adv_id"}, new Object[]{bookAdInfo.aId, Integer.valueOf(bookAdInfo.book_id), bookAdInfo.aId}, true));
        }
        q.p(wpBookLink, str);
        uo uoVar3 = this.f22936i;
        if (uoVar3 == null) {
            g0.S("binding");
        } else {
            uoVar2 = uoVar3;
        }
        uoVar2.f57078m.setTag(bookAdInfo);
    }

    public final void setBookCover(@l String str) {
        g2 g2Var;
        uo uoVar = null;
        if (str == null || str.length() == 0) {
            g2Var = null;
        } else {
            ic.c f11 = hc.c.l(str).j(R.drawable.ic_book_cover_default).f(R.drawable.ic_book_cover_default);
            uo uoVar2 = this.f22936i;
            if (uoVar2 == null) {
                g0.S("binding");
                uoVar2 = null;
            }
            AspectRoundImageView wpBookCover = uoVar2.f57075j;
            g0.o(wpBookCover, "wpBookCover");
            f11.o(wpBookCover);
            ic.c f12 = hc.c.l(str).j(R.drawable.ic_book_cover_default).f(R.drawable.ic_book_cover_default);
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
                uoVar3 = null;
            }
            AspectRoundImageView wpBookCoverDone = uoVar3.f57076k;
            g0.o(wpBookCoverDone, "wpBookCoverDone");
            f12.o(wpBookCoverDone);
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            ic.c i11 = hc.c.i(R.drawable.ic_book_cover_default);
            uo uoVar4 = this.f22936i;
            if (uoVar4 == null) {
                g0.S("binding");
                uoVar4 = null;
            }
            AspectRoundImageView wpBookCover2 = uoVar4.f57075j;
            g0.o(wpBookCover2, "wpBookCover");
            i11.o(wpBookCover2);
            ic.c i12 = hc.c.i(R.drawable.ic_book_cover_default);
            uo uoVar5 = this.f22936i;
            if (uoVar5 == null) {
                g0.S("binding");
            } else {
                uoVar = uoVar5;
            }
            AspectRoundImageView wpBookCoverDone2 = uoVar.f57076k;
            g0.o(wpBookCoverDone2, "wpBookCoverDone");
            i12.o(wpBookCoverDone2);
        }
    }

    public final void setBookName(@l String str) {
        g2 g2Var = null;
        uo uoVar = null;
        g2Var = null;
        if (str != null && str.length() != 0) {
            t();
            uo uoVar2 = this.f22936i;
            if (uoVar2 == null) {
                g0.S("binding");
                uoVar2 = null;
            }
            uoVar2.f57079n.setText(str);
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
            } else {
                uoVar = uoVar3;
            }
            uoVar.f57080o.setText(str);
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            qb.c.d(f22925l, "no book name!", new Object[0]);
        }
    }

    public final void setBookUpgrading(boolean z11) {
        qb.c.i(f22925l, "book upgrade status:" + z11, new Object[0]);
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        ImageView wpPlanUpdate = uoVar.N;
        g0.o(wpPlanUpdate, "wpPlanUpdate");
        q.z(wpPlanUpdate, z11);
    }

    public final void setEstimatedTimeOfPlan(int i11) {
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        TextView textView = uoVar.R;
        c cVar = f22923j;
        Context context = getContext();
        g0.o(context, "getContext(...)");
        textView.setText(cVar.a(context, i11));
        uo uoVar2 = this.f22936i;
        if (uoVar2 == null) {
            g0.S("binding");
            uoVar2 = null;
        }
        Drawable[] compoundDrawables = uoVar2.R.getCompoundDrawables();
        g0.o(compoundDrawables, "getCompoundDrawables(...)");
        if (a0.hf(compoundDrawables, 0) == null) {
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
                uoVar3 = null;
            }
            TextView textView2 = uoVar3.R;
            Drawable drawable = getResources().getDrawable(R.drawable.ic_clock, null);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            textView2.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public final void setOnWordPlanInteraction(@k e interaction) {
        g0.p(interaction, "interaction");
        this.f22928a = interaction;
    }

    public final void setReviewRound(int i11) {
        uo uoVar = this.f22936i;
        uo uoVar2 = null;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        TextView wpReviewRoundTip = uoVar.Q;
        g0.o(wpReviewRoundTip, "wpReviewRoundTip");
        q.z(wpReviewRoundTip, i11 > 0);
        if (i11 > 0) {
            this.f22933f = i11;
            uo uoVar3 = this.f22936i;
            if (uoVar3 == null) {
                g0.S("binding");
                uoVar3 = null;
            }
            uoVar3.Q.setText(getResources().getString(R.string.word_plan_card_review_round, Integer.valueOf(i11)));
            LearnCardStatus learnCardStatus = this.f22929b;
            if (learnCardStatus == null || !learnCardStatus.isAllDoneReview()) {
                return;
            }
            uo uoVar4 = this.f22936i;
            if (uoVar4 == null) {
                g0.S("binding");
            } else {
                uoVar2 = uoVar4;
            }
            uoVar2.L.setText(getResources().getString(R.string.word_plan_card_done_summary_review_round, Integer.valueOf(this.f22933f)));
        }
    }

    public final void setWordsCount(int i11) {
        this.f22934g = i11;
        LearnCardStatus learnCardStatus = this.f22929b;
        if ((learnCardStatus == null || !learnCardStatus.isAllDoneNormal()) && this.f22929b != LearnCardStatus.QUIZZER_ALL_KILL_NEXT_DAY) {
            return;
        }
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        uoVar.L.setText(getResources().getString(R.string.word_plan_card_done_summary_all_learnt, Integer.valueOf(i11)));
    }

    public final void t() {
        uo uoVar = this.f22936i;
        if (uoVar == null) {
            g0.S("binding");
            uoVar = null;
        }
        uoVar.f57079n.getViewTreeObserver().addOnGlobalLayoutListener(new f());
    }

    public final boolean u() {
        return nc.b.b().getBoolean(SpKeys.WORDS_PLAN_BOOK_DETAIL_POPUP_MSG, true);
    }

    public final boolean v() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordPlanInfoView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WordPlanInfoView(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
    }

    public /* synthetic */ WordPlanInfoView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
