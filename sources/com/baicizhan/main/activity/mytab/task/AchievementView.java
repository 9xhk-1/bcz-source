package com.baicizhan.main.activity.mytab.task;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUiAchievement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiAchievement.kt\ncom/baicizhan/main/activity/mytab/task/AchievementView\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n46#2,7:111\n86#3,6:118\n1247#4,6:124\n85#5:130\n*S KotlinDebug\n*F\n+ 1 UiAchievement.kt\ncom/baicizhan/main/activity/mytab/task/AchievementView\n*L\n103#1:111,7\n103#1:118,6\n105#1:124,6\n104#1:130\n*E\n"})
/* loaded from: classes4.dex */
public final class AchievementView extends AbstractComposeView {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18663b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public View.OnClickListener f18664a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public AchievementView(@m80.k Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 d(final AchievementView achievementView, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-886211130, i11, -1, "com.baicizhan.main.activity.mytab.task.AchievementView.Content.<anonymous> (UiAchievement.kt:102)");
            }
            composer.startReplaceableGroup(1890788296);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory createHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) TaskVM.class, current, (String) null, createHiltViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 36936, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            he.a e11 = e(SnapshotStateKt.collectAsState(((TaskVM) viewModel).f(), null, composer, 0, 1));
            boolean changedInstance = composer.changedInstance(achievementView);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.mytab.task.a
                    @Override // x00.a
                    public final Object invoke() {
                        g2 f11;
                        f11 = AchievementView.f(AchievementView.this);
                        return f11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x.c(e11, (x00.a) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final he.a e(State<? extends he.a> state) {
        return state.getValue();
    }

    public static final g2 f(AchievementView achievementView) {
        View.OnClickListener onClickListener = achievementView.f18664a;
        if (onClickListener != null) {
            onClickListener.onClick(achievementView);
        }
        return g2.f100423a;
    }

    public static final g2 g(AchievementView achievementView, int i11, Composer composer, int i12) {
        achievementView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-209048846);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-209048846, i12, -1, "com.baicizhan.main.activity.mytab.task.AchievementView.Content (UiAchievement.kt:100)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-886211130, true, new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.b
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 d11;
                    d11 = AchievementView.d(AchievementView.this, (Composer) obj, ((Integer) obj2).intValue());
                    return d11;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 g11;
                    g11 = AchievementView.g(AchievementView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return g11;
                }
            });
        }
    }

    @m80.l
    public final View.OnClickListener getClick() {
        return this.f18664a;
    }

    public final void setClick(@m80.l View.OnClickListener onClickListener) {
        this.f18664a = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public AchievementView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public /* synthetic */ AchievementView(Context context, AttributeSet attributeSet, int i11, kotlin.jvm.internal.v vVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }
}
