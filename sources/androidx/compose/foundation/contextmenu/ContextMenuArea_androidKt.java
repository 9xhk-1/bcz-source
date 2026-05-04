package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextMenuArea.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuArea.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuArea_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,88:1\n1247#2,6:89\n1247#2,6:136\n70#3:95\n67#3,9:96\n77#3:135\n79#4,6:105\n86#4,3:120\n89#4,2:129\n93#4:134\n347#5,9:111\n356#5,3:131\n4206#6,6:123\n*S KotlinDebug\n*F\n+ 1 ContextMenuArea.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuArea_androidKt\n*L\n50#1:89,6\n79#1:136,6\n57#1:95\n57#1:96,9\n57#1:135\n57#1:105,6\n57#1:120,3\n57#1:129,2\n57#1:134\n57#1:111,9\n57#1:131,3\n57#1:123,6\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuArea_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @VisibleForTesting
    public static final void ContextMenu(@k final ContextMenuState contextMenuState, @k final a<g2> aVar, @l Modifier modifier, @k final x00.l<? super ContextMenuScope, g2> lVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        Composer composer2;
        final Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(645832757);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(contextMenuState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(645832757, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)");
            }
            ContextMenuState.Status status = contextMenuState.getStatus();
            if (!(status instanceof ContextMenuState.Status.Open)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return g2.f100423a;
                        }

                        public final void invoke(Composer composer3, int i15) {
                            ContextMenuArea_androidKt.ContextMenu(ContextMenuState.this, aVar, modifier2, lVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                        }
                    });
                    return;
                }
                return;
            }
            boolean changed = startRestartGroup.changed(status);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ContextMenuPopupPositionProvider(IntOffsetKt.m5260roundk4lQ0M(((ContextMenuState.Status.Open) status).m360getOffsetF1C5BW0()), null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            ContextMenuUi_androidKt.ContextMenuPopup((ContextMenuPopupPositionProvider) rememberedValue, aVar, modifier2, lVar, composer2, i13 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer3, int i15) {
                    ContextMenuArea_androidKt.ContextMenu(ContextMenuState.this, aVar, modifier2, lVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0080  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuArea(@m80.k final androidx.compose.foundation.contextmenu.ContextMenuState r18, @m80.k final x00.a<yz.g2> r19, @m80.k final x00.l<? super androidx.compose.foundation.contextmenu.ContextMenuScope, yz.g2> r20, @m80.l androidx.compose.ui.Modifier r21, boolean r22, @m80.l x00.a<yz.g2> r23, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r24, @m80.l androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt.ContextMenuArea(androidx.compose.foundation.contextmenu.ContextMenuState, x00.a, x00.l, androidx.compose.ui.Modifier, boolean, x00.a, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
