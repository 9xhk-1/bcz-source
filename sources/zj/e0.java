package zj;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNoScrimFullScreenDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoScrimFullScreenDialog.kt\ncom/baicizhan/platform/base/guide/NoScrimFullScreenDialogKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,82:1\n75#2:83\n75#2:84\n75#2:85\n1247#3,6:86\n28#4:92\n64#5,5:93\n*S KotlinDebug\n*F\n+ 1 NoScrimFullScreenDialog.kt\ncom/baicizhan/platform/base/guide/NoScrimFullScreenDialogKt\n*L\n28#1:83\n30#1:84\n32#1:85\n34#1:86,6\n46#1:92\n77#1:93,5\n*E\n"})
/* loaded from: classes6.dex */
public final class e0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 NoScrimFullScreenDialog.kt\ncom/baicizhan/platform/base/guide/NoScrimFullScreenDialogKt\n*L\n1#1,67:1\n78#2,2:68\n*E\n"})
    public static final class a implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f102720a;

        public a(Dialog dialog) {
            this.f102720a = dialog;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f102720a.dismiss();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void e(boolean z11, @m80.k final x00.a<g2> onDismissRequest, @m80.k final x00.p<? super Composer, ? super Integer, g2> content, @m80.l Composer composer, final int i11, final int i12) {
        boolean z12;
        int i13;
        final boolean z13;
        g0.p(onDismissRequest, "onDismissRequest");
        g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(335571411);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 6) == 0) {
            z12 = z11;
            i13 = (startRestartGroup.changed(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            final boolean z14 = i14 != 0 ? true : z12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(335571411, i13, -1, "com.baicizhan.platform.base.guide.NoScrimFullScreenDialog (NoScrimFullScreenDialog.kt:26)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            final ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
            final SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            g2 g2Var = g2.f100423a;
            boolean changedInstance = startRestartGroup.changedInstance(context) | ((i13 & 14) == 4) | ((i13 & 112) == 32) | startRestartGroup.changedInstance(lifecycleOwner) | startRestartGroup.changedInstance(current) | startRestartGroup.changedInstance(savedStateRegistryOwner) | startRestartGroup.changedInstance(rememberCompositionContext) | ((i13 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                x00.l lVar = new x00.l() { // from class: zj.a0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        DisposableEffectResult f11;
                        f11 = e0.f(context, z14, onDismissRequest, lifecycleOwner, current, savedStateRegistryOwner, rememberCompositionContext, content, (DisposableEffectScope) obj);
                        return f11;
                    }
                };
                startRestartGroup.updateRememberedValue(lVar);
                rememberedValue = lVar;
            }
            EffectsKt.DisposableEffect(g2Var, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z13 = z14;
        } else {
            startRestartGroup.skipToGroupEnd();
            z13 = z12;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: zj.b0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 i15;
                    i15 = e0.i(z13, onDismissRequest, content, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return i15;
                }
            });
        }
    }

    public static final DisposableEffectResult f(Context context, boolean z11, final x00.a aVar, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, CompositionContext compositionContext, final x00.p pVar, DisposableEffectScope DisposableEffect) {
        g0.p(DisposableEffect, "$this$DisposableEffect");
        Dialog dialog = new Dialog(context, R.style.NoScrimDialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setFlags(512, 512);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getDecorView().setSystemUiVisibility(1792);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        dialog.setCancelable(z11);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: zj.c0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                e0.g(x00.a.this, dialogInterface);
            }
        });
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        ViewTreeLifecycleOwner.set(composeView, lifecycleOwner);
        ViewTreeViewModelStoreOwner.set(composeView, viewModelStoreOwner);
        ViewTreeSavedStateRegistryOwner.set(composeView, savedStateRegistryOwner);
        composeView.setParentCompositionContext(compositionContext);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(731392495, true, new x00.p() { // from class: zj.d0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 h11;
                h11 = e0.h(x00.p.this, (Composer) obj, ((Integer) obj2).intValue());
                return h11;
            }
        }));
        dialog.setContentView(composeView);
        dialog.show();
        return new a(dialog);
    }

    public static final void g(x00.a aVar, DialogInterface dialogInterface) {
        aVar.invoke();
    }

    @Composable
    public static final g2 h(x00.p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(731392495, i11, -1, "com.baicizhan.platform.base.guide.NoScrimFullScreenDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NoScrimFullScreenDialog.kt:67)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 i(boolean z11, x00.a aVar, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        e(z11, aVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }
}
