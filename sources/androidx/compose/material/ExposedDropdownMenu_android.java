package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ExposedDropdownMenu_android")
@u0({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,94:1\n75#2:95\n75#2:102\n1247#3,6:96\n1247#3,6:103\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n*L\n37#1:95\n43#1:102\n38#1:96,6\n44#1:103,6\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_android {
    @Composable
    public static final void OnPlatformWindowBoundsChange(@k final a<g2> aVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1063434120);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1063434120, i12, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
            }
            final View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            boolean changedInstance = startRestartGroup.changedInstance(view) | ((i12 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view, aVar);
                        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                OnGlobalLayoutListener.this.dispose();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(view, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    ExposedDropdownMenu_android.OnPlatformWindowBoundsChange(aVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect getWindowBounds(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeIntRect(rect);
    }

    @Composable
    @k
    public static final WindowBoundsCalculator platformWindowBoundsCalculator(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1216067952, i11, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean changed = composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowBoundsCalculator(view);
            composer.updateRememberedValue(rememberedValue);
        }
        WindowBoundsCalculator windowBoundsCalculator = (WindowBoundsCalculator) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowBoundsCalculator;
    }
}
