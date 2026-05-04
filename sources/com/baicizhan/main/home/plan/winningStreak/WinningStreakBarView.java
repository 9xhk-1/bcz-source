package com.baicizhan.main.home.plan.winningStreak;

import a00.l1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.home.plan.winningStreak.WinningStreakBarView;
import com.baicizhan.main.home.plan.winningStreak.b;
import com.baicizhan.main.home.plan.winningStreak.c;
import com.jiongji.andriod.card.R;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import ma.t;
import w00.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWinningStreakUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakUi.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakBarView\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,303:1\n46#2,7:304\n86#3,6:311\n1247#4,6:317\n1247#4,6:323\n1247#4,6:329\n85#5:335\n*S KotlinDebug\n*F\n+ 1 WinningStreakUi.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakBarView\n*L\n158#1:304,7\n158#1:311,6\n161#1:317,6\n175#1:323,6\n178#1:329,6\n159#1:335\n*E\n"})
/* loaded from: classes4.dex */
public final class WinningStreakBarView extends AbstractComposeView {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22984a = AbstractComposeView.$stable;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22985a;

        static {
            int[] iArr = new int[WinningStreakStatus.values().length];
            try {
                iArr[WinningStreakStatus.ComeOn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WinningStreakStatus.Hint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WinningStreakStatus.Finish.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22985a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public WinningStreakBarView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(final WinningStreakBarView winningStreakBarView, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203432568, i11, -1, "com.baicizhan.main.home.plan.winningStreak.WinningStreakBarView.Content.<anonymous> (WinningStreakUi.kt:157)");
            }
            composer.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) e.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 36936, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            sg.c g11 = g(FlowExtKt.collectAsStateWithLifecycle(((e) viewModel).i(), (LifecycleOwner) null, (Lifecycle.State) null, (kotlin.coroutines.d) null, composer, 0, 7));
            boolean changedInstance = composer.changedInstance(winningStreakBarView);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new l() { // from class: sg.d
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 h11;
                        h11 = WinningStreakBarView.h(WinningStreakBarView.this, (c.b) obj);
                        return h11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            l lVar = (l) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(winningStreakBarView);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: sg.e
                    @Override // x00.a
                    public final Object invoke() {
                        g2 i12;
                        i12 = WinningStreakBarView.i(WinningStreakBarView.this);
                        return i12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar = (x00.a) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(winningStreakBarView);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new l() { // from class: sg.f
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 j11;
                        j11 = WinningStreakBarView.j(WinningStreakBarView.this, (b.C0317b) obj);
                        return j11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            d.K(g11, lVar, aVar, (l) rememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final sg.c g(State<sg.c> state) {
        return state.getValue();
    }

    public static final g2 h(WinningStreakBarView winningStreakBarView, c.b it) {
        String str;
        g0.p(it, "it");
        BczWebExecutorKt.startNormalWeb$default(winningStreakBarView.getContext(), winningStreakBarView.getContext().getString(R.string.url_winning_streak_detail), null, false, 0, null, 60, null);
        int i11 = a.f22985a[it.f().ordinal()];
        if (i11 == 1) {
            str = "unfinished";
        } else if (i11 == 2) {
            str = "inform";
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "finished";
        }
        Map j02 = l1.j0(new Pair("state", str));
        g0.n(j02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        ma.l.e(t.f73003b, ma.a.f72865w5, j02);
        return g2.f100423a;
    }

    public static final g2 i(WinningStreakBarView winningStreakBarView) {
        BczWebExecutorKt.startNormalWeb$default(winningStreakBarView.getContext(), winningStreakBarView.getContext().getString(R.string.url_rank_home), null, false, 0, null, 60, null);
        ma.l.a(t.f73003b, ma.a.K);
        return g2.f100423a;
    }

    public static final g2 j(WinningStreakBarView winningStreakBarView, b.C0317b it) {
        g0.p(it, "it");
        BczWebExecutorKt.startNormalWeb$default(winningStreakBarView.getContext(), winningStreakBarView.getContext().getString(R.string.url_task_home), null, false, 0, null, 60, null);
        return g2.f100423a;
    }

    public static final g2 k(WinningStreakBarView winningStreakBarView, int i11, Composer composer, int i12) {
        winningStreakBarView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1571992284);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(this) : startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1571992284, i12, -1, "com.baicizhan.main.home.plan.winningStreak.WinningStreakBarView.Content (WinningStreakUi.kt:155)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1203432568, true, new p() { // from class: sg.g
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 f11;
                    f11 = WinningStreakBarView.f(WinningStreakBarView.this, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.h
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 k11;
                    k11 = WinningStreakBarView.k(WinningStreakBarView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return k11;
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public WinningStreakBarView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public WinningStreakBarView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
    }

    public /* synthetic */ WinningStreakBarView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
