package com.baicizhan.main.home.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import cn.hugo.android.scanner.CaptureActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2Activity;
import com.baicizhan.main.activity.feedback.FeedbackWebviewActivity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.lookup.LookupWordActivity;
import com.baicizhan.main.activity.lookup.SearchType;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.activity.userinfo.UserInfoActivity;
import com.baicizhan.main.home.player.behavior.SimpleNavigation;
import com.baicizhan.main.home.player.model.AudioEffect;
import com.baicizhan.main.word_book.list.WordFavoriteBooksActivity;
import com.baicizhan.main.wordlistv2.WordListV2Activity;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.jiongji.andriod.card.R;
import gs.hi;
import gs.ii;
import gs.ji;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Handler.kt\ncom/baicizhan/main/unity/bridge/HandlerKt\n+ 4 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 5 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2633:1\n70#2,11:2634\n15#3,5:2645\n20#3,2:2657\n15#3,5:2659\n20#3,2:2671\n15#3,5:2673\n20#3,2:2685\n15#3,5:2687\n20#3,2:2699\n10#4:2650\n10#4:2664\n10#4:2678\n10#4:2692\n43#5:2651\n43#5:2665\n43#5:2679\n43#5:2693\n124#6,4:2652\n124#6,4:2666\n124#6,4:2680\n124#6,4:2694\n142#7:2656\n142#7:2670\n142#7:2684\n142#7:2698\n1247#8,6:2701\n1247#8,6:2707\n1247#8,6:2713\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivity\n*L\n248#1:2634,11\n371#1:2645,5\n371#1:2657,2\n372#1:2659,5\n372#1:2671,2\n376#1:2673,5\n376#1:2685,2\n377#1:2687,5\n377#1:2699,2\n371#1:2650\n372#1:2664\n376#1:2678\n377#1:2692\n371#1:2651\n372#1:2665\n376#1:2679\n377#1:2693\n371#1:2652,4\n372#1:2666,4\n376#1:2680,4\n377#1:2694,4\n371#1:2656\n372#1:2670\n376#1:2684\n377#1:2698\n402#1:2701,6\n404#1:2707,6\n405#1:2713,6\n*E\n"})
@qu.b
/* loaded from: classes4.dex */
public final class HomeActivity extends Hilt_HomeActivity implements kg.a {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final a f23119n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f23120o = 8;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final String f23121p = "HomeActivity_Player";

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public Pair<Long, Long> f23125i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final yz.c0 f23126j;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f23122f = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.player.y1
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView c12;
            c12 = HomeActivity.c1(HomeActivity.this);
            return c12;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f23123g = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.player.z1
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView e12;
            e12 = HomeActivity.e1(HomeActivity.this);
            return e12;
        }
    });

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final yz.c0 f23124h = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.player.a2
        @Override // x00.a
        public final Object invoke() {
            FragmentContainerView d12;
            d12 = HomeActivity.d1(HomeActivity.this);
            return d12;
        }
    });

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final b f23127k = new b();

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final HomeActivity$homeBroadcast$1 f23128l = new BroadcastReceiver() { // from class: com.baicizhan.main.home.player.HomeActivity$homeBroadcast$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            qb.c.b("HomeActivity_Player", "broadcast action " + (intent != null ? intent.getAction() : null), new Object[0]);
            String action = intent != null ? intent.getAction() : null;
            if (action != null && action.hashCode() == 1867650277 && action.equals(ci.e.f8680b)) {
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.startActivity(new Intent(homeActivity, (Class<?>) ImageDakaV2Activity.class));
            }
        }
    };

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final yz.c0 f23129m = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.player.b2
        @Override // x00.a
        public final Object invoke() {
            xg.e g12;
            g12 = HomeActivity.g1(HomeActivity.this);
            return g12;
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
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivity$intentNavigator$1\n+ 2 utils.kt\ncom/baicizhan/base/UtilsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,2633:1\n14#2,6:2634\n14#2,6:2640\n14#2,6:2646\n14#2,6:2652\n14#2,6:2658\n14#2,6:2664\n14#2,6:2670\n29#3:2676\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivity$intentNavigator$1\n*L\n276#1:2634,6\n280#1:2640,6\n284#1:2646,6\n287#1:2652,6\n289#1:2658,6\n291#1:2664,6\n293#1:2670,6\n320#1:2676\n*E\n"})
    public static final class b implements tg.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23131a;

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
                    iArr[SimpleNavigation.FAVORITE_BOOKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SimpleNavigation.SEARCH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SimpleNavigation.PUNCH_CARD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SimpleNavigation.WORDS_LIST.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SimpleNavigation.PLAN_EDIT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[SimpleNavigation.SCAN.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[SimpleNavigation.MINE_USER_CENTER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[SimpleNavigation.MINE_USER_GRADE_EDIT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[SimpleNavigation.MINE_VOCABULARY_LISTENING_TEST.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[SimpleNavigation.MINE_VOCABULARY_READING_TEST.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[SimpleNavigation.NOTIFICATION.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[SimpleNavigation.LEARNING_CONFIGURATION.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[SimpleNavigation.FEEDBACK.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[SimpleNavigation.ABOUT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                f23131a = iArr;
            }
        }

        public b() {
        }

        @Override // tg.a
        public void a(String intent) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            Uri parse = Uri.parse(intent);
            try {
                wg.q.x(HomeActivity.this.R0(), AudioEffect.COMMON_HOME_CLICK, null, 2, null);
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
                qb.c.c("HomeActivity_Player", "failed to launch " + parse, e11);
            }
        }

        @Override // tg.a
        public void b(SimpleNavigation action) {
            kotlin.jvm.internal.g0.p(action, "action");
            wg.q.x(HomeActivity.this.R0(), AudioEffect.COMMON_HOME_CLICK, null, 2, null);
            switch (a.f23131a[action.ordinal()]) {
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
                    HomeActivity homeActivity = HomeActivity.this;
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) WordFavoriteBooksActivity.class));
                    return;
                case 5:
                    HomeActivity homeActivity2 = HomeActivity.this;
                    Bundle bundleOf = BundleKt.bundleOf(yz.h1.a(LookupWordActivity.B, SearchType.OCR));
                    Intent intent = new Intent(homeActivity2, (Class<?>) LookupWordActivity.class);
                    if (bundleOf != null) {
                        intent.putExtras(bundleOf);
                    }
                    homeActivity2.startActivity(intent);
                    return;
                case 6:
                    HomeActivity homeActivity3 = HomeActivity.this;
                    homeActivity3.startActivity(new Intent(homeActivity3, (Class<?>) ImageDakaV2Activity.class));
                    homeActivity3.overridePendingTransition(R.anim.business_push_up_in, R.anim.activity_nothing);
                    return;
                case 7:
                    HomeActivity homeActivity4 = HomeActivity.this;
                    homeActivity4.startActivity(new Intent(homeActivity4, (Class<?>) WordListV2Activity.class));
                    return;
                case 8:
                    HomeActivity homeActivity5 = HomeActivity.this;
                    Bundle bundleOf2 = BundleKt.bundleOf(yz.h1.a(EditScheduleActivity.f18913o, ScheduleType.ADJUST));
                    Intent intent2 = new Intent(homeActivity5, (Class<?>) EditScheduleActivity.class);
                    if (bundleOf2 != null) {
                        intent2.putExtras(bundleOf2);
                    }
                    homeActivity5.startActivity(intent2);
                    return;
                case 9:
                    HomeActivity homeActivity6 = HomeActivity.this;
                    homeActivity6.startActivity(new Intent(homeActivity6, (Class<?>) CaptureActivity.class));
                    return;
                case 10:
                    HomeActivity homeActivity7 = HomeActivity.this;
                    homeActivity7.startActivity(new Intent(homeActivity7, (Class<?>) UserInfoActivity.class));
                    return;
                case 11:
                    UserGradleActivity.f18481f.f(HomeActivity.this, 2, Boolean.valueOf(com.baicizhan.main.activity.idenity.a.f18511a.a()));
                    return;
                case 12:
                    BczWebHelperKt.startListenerTest(HomeActivity.this, "oldmine");
                    return;
                case 13:
                    BczWebHelperKt.startReadTest(HomeActivity.this, "oldmine");
                    return;
                case 14:
                    HomeActivity homeActivity8 = HomeActivity.this;
                    SingleFragmentActivity.I0(homeActivity8, bf.a.class, null, homeActivity8.getString(R.string.setting_learning_remainder));
                    return;
                case 15:
                    HomeActivity homeActivity9 = HomeActivity.this;
                    SingleFragmentActivity.I0(homeActivity9, cf.e.class, null, homeActivity9.getString(R.string.setting_learning_setting));
                    return;
                case 16:
                    FeedbackWebviewActivity.M0(HomeActivity.this);
                    return;
                case 17:
                    SingleFragmentActivity.I0(HomeActivity.this, ue.l.class, null, null);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivity$onCreate$2", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23132a;

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
            if (this.f23132a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            HomeActivity homeActivity = HomeActivity.this;
            hj.p.i(homeActivity, homeActivity);
            return yz.g2.f100423a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.baicizhan.main.home.player.HomeActivity$homeBroadcast$1] */
    public HomeActivity() {
        final x00.a aVar = null;
        this.f23126j = new ViewModelLazy(kotlin.jvm.internal.o0.d(wg.q.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.home.player.HomeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.home.player.HomeActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.home.player.HomeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                x00.a aVar2 = x00.a.this;
                return (aVar2 == null || (creationExtras = (CreationExtras) aVar2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final FragmentContainerView T0() {
        return (FragmentContainerView) this.f23124h.getValue();
    }

    private final FragmentContainerView U0() {
        return (FragmentContainerView) this.f23123g.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 W0(final HomeActivity homeActivity, Composer composer, int i11) {
        List list;
        List list2;
        List list3;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(458308311, i11, -1, "com.baicizhan.main.home.player.HomeActivity.onCreate.<anonymous> (HomeActivity.kt:398)");
            }
            b bVar = homeActivity.f23127k;
            list = HomeActivityKt.f23136b;
            String h11 = ((kg.l) list.get(1)).h();
            boolean changedInstance = composer.changedInstance(homeActivity);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.player.d2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView X0;
                        X0 = HomeActivity.X0(HomeActivity.this, (Context) obj);
                        return X0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Pair a11 = yz.h1.a(h11, (x00.l) rememberedValue);
            list2 = HomeActivityKt.f23136b;
            String h12 = ((kg.l) list2.get(3)).h();
            boolean changedInstance2 = composer.changedInstance(homeActivity);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.player.e2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView Y0;
                        Y0 = HomeActivity.Y0(HomeActivity.this, (Context) obj);
                        return Y0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Pair a12 = yz.h1.a(h12, (x00.l) rememberedValue2);
            list3 = HomeActivityKt.f23136b;
            String h13 = ((kg.l) list3.get(4)).h();
            boolean changedInstance3 = composer.changedInstance(homeActivity);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.player.f2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        FragmentContainerView Z0;
                        Z0 = HomeActivity.Z0(HomeActivity.this, (Context) obj);
                        return Z0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            HomeActivityKt.q0(bVar, a00.l1.W(a11, a12, yz.h1.a(h13, (x00.l) rememberedValue3)), homeActivity.R0(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final FragmentContainerView X0(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.S0();
    }

    public static final FragmentContainerView Y0(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.U0();
    }

    public static final FragmentContainerView Z0(HomeActivity homeActivity, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return homeActivity.T0();
    }

    private final void b1() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
    }

    public static final FragmentContainerView c1(HomeActivity homeActivity) {
        return ji.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public static final FragmentContainerView d1(HomeActivity homeActivity) {
        return hi.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public static final FragmentContainerView e1(HomeActivity homeActivity) {
        return ii.c(homeActivity.getLayoutInflater()).getRoot();
    }

    public static final xg.e g1(HomeActivity homeActivity) {
        return new xg.e(homeActivity);
    }

    public final wg.q R0() {
        return (wg.q) this.f23126j.getValue();
    }

    public final FragmentContainerView S0() {
        return (FragmentContainerView) this.f23122f.getValue();
    }

    public final xg.e V0() {
        return (xg.e) this.f23129m.getValue();
    }

    public final void a1() {
        k3.x2 x2Var;
        k3.x2 x2Var2;
        String simpleName = k3.e1.class.getSimpleName();
        if (ci.b.b().containsKey(simpleName)) {
            k3.x2 x2Var3 = ci.b.b().get(simpleName);
            if (x2Var3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IPluginService");
            }
            x2Var = (k3.e1) x2Var3;
        } else {
            dd.h.g(this);
            k3.x2 x2Var4 = (k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.e1.class), null, null);
            ci.b.b().put(simpleName, x2Var4);
            x2Var = x2Var4;
        }
        ((k3.e1) x2Var).x(V0());
        String simpleName2 = k3.e1.class.getSimpleName();
        if (ci.b.b().containsKey(simpleName2)) {
            k3.x2 x2Var5 = ci.b.b().get(simpleName2);
            if (x2Var5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IPluginService");
            }
            x2Var2 = (k3.e1) x2Var5;
        } else {
            dd.h.g(this);
            x2Var2 = (k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.e1.class), null, null);
            ci.b.b().put(simpleName2, x2Var2);
        }
        ((k3.e1) x2Var2).x(xg.a.f98045a);
    }

    public final void f1() {
        k3.x2 x2Var;
        k3.x2 x2Var2;
        String simpleName = k3.e1.class.getSimpleName();
        if (ci.b.b().containsKey(simpleName)) {
            k3.x2 x2Var3 = ci.b.b().get(simpleName);
            if (x2Var3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IPluginService");
            }
            x2Var = (k3.e1) x2Var3;
        } else {
            dd.h.g(this);
            k3.x2 x2Var4 = (k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.e1.class), null, null);
            ci.b.b().put(simpleName, x2Var4);
            x2Var = x2Var4;
        }
        ((k3.e1) x2Var).A(V0());
        String simpleName2 = k3.e1.class.getSimpleName();
        if (ci.b.b().containsKey(simpleName2)) {
            k3.x2 x2Var5 = ci.b.b().get(simpleName2);
            if (x2Var5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IPluginService");
            }
            x2Var2 = (k3.e1) x2Var5;
        } else {
            dd.h.g(this);
            x2Var2 = (k3.x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.e1.class), null, null);
            ci.b.b().put(simpleName2, x2Var2);
        }
        ((k3.e1) x2Var2).A(xg.a.f98045a);
    }

    @Override // com.baicizhan.main.home.player.Hilt_HomeActivity, com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        b1();
        kg.k.w(this);
        a1();
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(458308311, true, new x00.p() { // from class: com.baicizhan.main.home.player.c2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 W0;
                W0 = HomeActivity.W0(HomeActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return W0;
            }
        }), 1, null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new c(null));
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f23128l, new IntentFilter(ci.e.f8680b));
    }

    @Override // com.baicizhan.main.home.player.Hilt_HomeActivity, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f23128l);
        f1();
    }

    @i80.l
    public final void onEventMainThread(@m80.l ah.a aVar) {
        qb.c.b("HomeActivity_Player", "onEventMainThread: offline refresh", new Object[0]);
        int l11 = q9.x.r().l();
        if (sh.d.s().n() != l11) {
            sh.d.s().x(this, l11);
        }
    }

    @Override // q9.x.a
    public void v(@m80.l UserLimitInfoV2 userLimitInfoV2, @m80.l UserLimitInfoV2 userLimitInfoV22) {
        Pair<Long, Long> pair = this.f23125i;
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
        this.f23125i = yz.h1.a(userLimitInfoV2 != null ? Long.valueOf(userLimitInfoV2.collect_words_updated_at) : null, userLimitInfoV22 != null ? Long.valueOf(userLimitInfoV22.collect_words_updated_at) : null);
        hj.p.i(this, this);
        qb.c.i("HomeActivity_Player", "onUserLimitUpdate to refresh", new Object[0]);
    }
}
