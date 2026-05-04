package com.baicizhan.main.home.experiment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2Activity;
import com.baicizhan.main.activity.lookup.LookupWordActivity;
import com.baicizhan.main.activity.lookup.SearchType;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.word_book.list.WordFavoriteBooksActivity;
import com.baicizhan.main.wordlistv2.WordListV2Activity;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import gs.gi;
import gs.hi;
import gs.ii;
import gs.ji;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/HomeActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1233:1\n1247#2,6:1234\n1247#2,6:1240\n1247#2,6:1246\n1247#2,6:1252\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/HomeActivity\n*L\n298#1:1234,6\n299#1:1240,6\n300#1:1246,6\n301#1:1252,6\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class HomeActivity extends Hilt_HomeActivity implements x.a, kg.a {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final a f21018m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f21019n = 8;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final String f21020o = "HomeActivity";

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public com.baicizhan.main.home.experiment.repo.s f21021f;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public Pair<Long, Long> f21023h;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final b f21022g = new b();

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21024i = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.experiment.s0
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView k12;
            k12 = HomeActivity.k1(HomeActivity.this);
            return k12;
        }
    });

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21025j = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.experiment.t0
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView j12;
            j12 = HomeActivity.j1(HomeActivity.this);
            return j12;
        }
    });

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21026k = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.experiment.u0
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView i12;
            i12 = HomeActivity.i1(HomeActivity.this);
            return i12;
        }
    });

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f21027l = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.experiment.v0
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView h12;
            h12 = HomeActivity.h1(HomeActivity.this);
            return h12;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/HomeActivity$intentNavigator$1\n+ 2 utils.kt\ncom/baicizhan/base/UtilsKt\n*L\n1#1,1233:1\n14#2,6:1234\n14#2,6:1240\n14#2,6:1246\n14#2,6:1252\n14#2,6:1258\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/HomeActivity$intentNavigator$1\n*L\n201#1:1234,6\n205#1:1240,6\n209#1:1246,6\n213#1:1252,6\n217#1:1258,6\n*E\n"})
    public static final class b implements x3 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21029a;

            static {
                int[] iArr = new int[SimpleNavigation.values().length];
                try {
                    iArr[SimpleNavigation.WINNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SimpleNavigation.WINNING_RANK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SimpleNavigation.WINNING_TASKS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SimpleNavigation.WORDS_TRAINING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SimpleNavigation.FAVORITE_BOOKS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SimpleNavigation.SEARCH.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SimpleNavigation.PUNCH_CARD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SimpleNavigation.WORDS_LIST.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SimpleNavigation.PLAN_EDIT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f21029a = iArr;
            }
        }

        public b() {
        }

        @Override // com.baicizhan.main.home.experiment.x3
        public void a(String intent) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            Uri parse = Uri.parse(intent);
            try {
                String scheme = parse.getScheme();
                if (scheme != null) {
                    int hashCode = scheme.hashCode();
                    if (hashCode == 3213448) {
                        if (!scheme.equals("http")) {
                        }
                        BczWebExecutorKt.startNormalWeb$default(HomeActivity.this, parse.toString(), null, false, 0, null, 60, null);
                        return;
                    } else if (hashCode == 99617003 && scheme.equals("https")) {
                        BczWebExecutorKt.startNormalWeb$default(HomeActivity.this, parse.toString(), null, false, 0, null, 60, null);
                        return;
                    }
                }
                HomeActivity homeActivity = HomeActivity.this;
                Intent intent2 = new Intent(jc.a.f64014a);
                intent2.setPackage(HomeActivity.this.getPackageName());
                intent2.setData(parse);
                homeActivity.startActivity(intent2);
            } catch (Exception e11) {
                qb.c.c(HomeActivity.f21020o, "failed to launch " + parse, e11);
            }
        }

        @Override // com.baicizhan.main.home.experiment.x3
        public void b(SimpleNavigation action) {
            kotlin.jvm.internal.g0.p(action, "action");
            switch (a.f21029a[action.ordinal()]) {
                case 1:
                    BczWebExecutorKt.startNormalWeb$default(HomeActivity.this, x6.a.f97565a, null, false, 0, null, 60, null);
                    return;
                case 2:
                    BczWebExecutorKt.startNormalWeb$default(HomeActivity.this, "https://reading.baicizhan.com/h5/fe-incentive-system/index/rank-list?webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%2C%22autoSafeArea%22%3Afalse%7D", null, false, 0, null, 60, null);
                    return;
                case 3:
                    BczWebExecutorKt.startNormalWeb$default(HomeActivity.this, x6.a.f97568d, null, false, 0, null, 60, null);
                    return;
                case 4:
                    return;
                case 5:
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) WordFavoriteBooksActivity.class));
                    return;
                case 6:
                    HomeActivity homeActivity2 = HomeActivity.this;
                    Bundle bundleOf = BundleKt.bundleOf(yz.h1.a(LookupWordActivity.B, SearchType.OCR));
                    Intent intent = new Intent(homeActivity2, (Class<?>) LookupWordActivity.class);
                    if (bundleOf != null) {
                        intent.putExtras(bundleOf);
                    }
                    homeActivity2.startActivity(intent);
                    return;
                case 7:
                    HomeActivity homeActivity3 = HomeActivity.this;
                    homeActivity3.startActivity(new Intent(homeActivity3, (Class<?>) ImageDakaV2Activity.class));
                    return;
                case 8:
                    HomeActivity homeActivity4 = HomeActivity.this;
                    homeActivity4.startActivity(new Intent(homeActivity4, (Class<?>) WordListV2Activity.class));
                    return;
                case 9:
                    HomeActivity homeActivity5 = HomeActivity.this;
                    Bundle bundleOf2 = BundleKt.bundleOf(yz.h1.a(EditScheduleActivity.f18913o, ScheduleType.ADJUST));
                    Intent intent2 = new Intent(homeActivity5, (Class<?>) EditScheduleActivity.class);
                    if (bundleOf2 != null) {
                        intent2.putExtras(bundleOf2);
                    }
                    homeActivity5.startActivity(intent2);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivity$onCreate$2", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21030a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return HomeActivity.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21030a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            HomeActivity homeActivity = HomeActivity.this;
            hj.p.i(homeActivity, homeActivity);
            HomeActivity.this.T0();
            return yz.g2.f100423a;
        }
    }

    public static final yz.g2 U0(HomeActivity homeActivity) {
        BczWebExecutorKt.startNormalWeb$default(homeActivity, homeActivity.V0().t(), null, false, 0, null, 60, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 a1(final HomeActivity homeActivity, Composer composer, int i11) {
        List list;
        List list2;
        List list3;
        List list4;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(150885051, i11, -1, "com.baicizhan.main.home.experiment.HomeActivity.onCreate.<anonymous> (HomeActivity.kt:295)");
            }
            b bVar = homeActivity.f21022g;
            list = n3.f21280e;
            String h11 = ((kg.l) list.get(1)).h();
            boolean changedInstance = composer.changedInstance(homeActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.experiment.w0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView b12;
                        b12 = HomeActivity.b1(HomeActivity.this, (Context) obj);
                        return b12;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Pair a11 = yz.h1.a(h11, (x00.l) rememberedValue);
            list2 = n3.f21280e;
            String h12 = ((kg.l) list2.get(2)).h();
            boolean changedInstance2 = composer.changedInstance(homeActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.experiment.x0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView c12;
                        c12 = HomeActivity.c1(HomeActivity.this, (Context) obj);
                        return c12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Pair a12 = yz.h1.a(h12, (x00.l) rememberedValue2);
            list3 = n3.f21280e;
            String h13 = ((kg.l) list3.get(3)).h();
            boolean changedInstance3 = composer.changedInstance(homeActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.experiment.y0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView d12;
                        d12 = HomeActivity.d1(HomeActivity.this, (Context) obj);
                        return d12;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Pair a13 = yz.h1.a(h13, (x00.l) rememberedValue3);
            list4 = n3.f21280e;
            String h14 = ((kg.l) list4.get(4)).h();
            boolean changedInstance4 = composer.changedInstance(homeActivity);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.home.experiment.z0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView e12;
                        e12 = HomeActivity.e1(HomeActivity.this, (Context) obj);
                        return e12;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            n3.z0(bVar, a00.l1.W(a11, a12, a13, yz.h1.a(h14, (x00.l) rememberedValue4)), null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final FragmentContainerView b1(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.Z0();
    }

    public static final FragmentContainerView c1(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.Y0();
    }

    public static final FragmentContainerView d1(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.X0();
    }

    public static final FragmentContainerView e1(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.W0();
    }

    public static final FragmentContainerView h1(HomeActivity homeActivity) {
        return gi.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public static final FragmentContainerView i1(HomeActivity homeActivity) {
        return hi.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public static final FragmentContainerView j1(HomeActivity homeActivity) {
        return ii.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public static final FragmentContainerView k1(HomeActivity homeActivity) {
        return ji.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public final void T0() {
        if (gi.v.c(4096) && gi.v.d()) {
            gi.v.a(4096);
            i9.f.j(pb.a.a(), jg.d.f64079c, true);
            new rg.e().z(new x00.a() { // from class: com.baicizhan.main.home.experiment.b1
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 U0;
                    U0 = HomeActivity.U0(HomeActivity.this);
                    return U0;
                }
            }).show(getSupportFragmentManager(), "freshman_guide");
        }
    }

    @m80.k
    public final com.baicizhan.main.home.experiment.repo.s V0() {
        com.baicizhan.main.home.experiment.repo.s sVar = this.f21021f;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.g0.S("gameHomeRepo");
        return null;
    }

    public final FragmentContainerView W0() {
        return (FragmentContainerView) this.f21027l.getValue();
    }

    public final FragmentContainerView X0() {
        return (FragmentContainerView) this.f21026k.getValue();
    }

    public final FragmentContainerView Y0() {
        return (FragmentContainerView) this.f21025j.getValue();
    }

    public final FragmentContainerView Z0() {
        return (FragmentContainerView) this.f21024i.getValue();
    }

    public final void f1(@m80.k com.baicizhan.main.home.experiment.repo.s sVar) {
        kotlin.jvm.internal.g0.p(sVar, "<set-?>");
        this.f21021f = sVar;
    }

    public final void g1() {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.show(WindowInsetsCompat.Type.navigationBars());
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setNavigationBarColor(0);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(false);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(true);
    }

    @Override // com.baicizhan.main.home.experiment.Hilt_HomeActivity, com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        g1();
        kg.k.w(this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(150885051, true, new x00.p() { // from class: com.baicizhan.main.home.experiment.a1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 a12;
                a12 = HomeActivity.a1(HomeActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return a12;
            }
        }), 1, null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new c(null));
        ma.l.e(ma.t.f73003b, ma.a.f72705a, a00.k1.k(yz.h1.a(ma.b.U1, "B")));
    }

    @Override // q9.x.a
    public void v(@m80.l UserLimitInfoV2 userLimitInfoV2, @m80.l UserLimitInfoV2 userLimitInfoV22) {
        Pair<Long, Long> pair = this.f21023h;
        if (pair != null) {
            if (kotlin.jvm.internal.g0.g(pair.getFirst(), userLimitInfoV2 != null ? Long.valueOf(userLimitInfoV2.collect_words_updated_at) : null)) {
                if (kotlin.jvm.internal.g0.g(pair.getSecond(), userLimitInfoV22 != null ? Long.valueOf(userLimitInfoV22.collect_words_updated_at) : null)) {
                    return;
                }
            }
            if (userLimitInfoV2 != null && userLimitInfoV22 != null && userLimitInfoV2.collect_words_updated_at == userLimitInfoV22.collect_words_updated_at) {
                return;
            }
        }
        this.f21023h = yz.h1.a(userLimitInfoV2 != null ? Long.valueOf(userLimitInfoV2.collect_words_updated_at) : null, userLimitInfoV22 != null ? Long.valueOf(userLimitInfoV22.collect_words_updated_at) : null);
        hj.p.i(this, this);
        qb.c.i(f21020o, "onUserLimitUpdate to refresh", new Object[0]);
    }
}
