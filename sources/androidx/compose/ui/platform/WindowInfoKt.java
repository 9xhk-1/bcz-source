package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,90:1\n75#2:91\n1247#3,6:92\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n60#1:91\n62#1:92,6\n*E\n"})
/* loaded from: classes2.dex */
public final class WindowInfoKt {
    @Composable
    public static final void WindowFocusObserver(@m80.k final x00.l<? super Boolean, g2> lVar, @m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(127829799);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127829799, i12, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:58)");
            }
            WindowInfo windowInfo = (WindowInfo) startRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo());
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, startRestartGroup, i12 & 14);
            boolean changed = startRestartGroup.changed(windowInfo) | startRestartGroup.changed(rememberUpdatedState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, rememberUpdatedState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(windowInfo, (x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    WindowInfoKt.WindowFocusObserver(lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
