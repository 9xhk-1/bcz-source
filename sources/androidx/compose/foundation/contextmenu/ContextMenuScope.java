package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,426:1\n34#2,6:427\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n*L\n242#1:427,6\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuScope {
    public static final int $stable = 0;

    @k
    private final SnapshotStateList<q<ContextMenuColors, Composer, Integer, g2>> composables = SnapshotStateKt.mutableStateListOf();

    public static /* synthetic */ void item$default(ContextMenuScope contextMenuScope, p pVar, Modifier modifier, boolean z11, q qVar, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            qVar = null;
        }
        contextMenuScope.item(pVar, modifier2, z12, qVar, aVar);
    }

    @Composable
    public final void Content$foundation_release(@k final ContextMenuColors contextMenuColors, @l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1320309496);
        int i12 = (i11 & 6) == 0 ? (startRestartGroup.changed(contextMenuColors) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320309496, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:240)");
            }
            SnapshotStateList<q<ContextMenuColors, Composer, Integer, g2>> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i13 = 0; i13 < size; i13++) {
                snapshotStateList.get(i13).invoke(contextMenuColors, startRestartGroup, Integer.valueOf(i12 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    ContextMenuScope.this.Content$foundation_release(contextMenuColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    public final void clear$foundation_release() {
        this.composables.clear();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void item(@k final p<? super Composer, ? super Integer, String> pVar, @k final Modifier modifier, final boolean z11, @l final q<? super Color, ? super Composer, ? super Integer, g2> qVar, @k final a<g2> aVar) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(262103052, true, new q<ContextMenuColors, Composer, Integer, g2>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(ContextMenuColors contextMenuColors, Composer composer, Integer num) {
                invoke(contextMenuColors, composer, num.intValue());
                return g2.f100423a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(ContextMenuColors contextMenuColors, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(contextMenuColors) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(262103052, i11, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:282)");
                }
                String invoke = pVar.invoke(composer, 0);
                if (k0.O3(invoke)) {
                    InlineClassHelperKt.throwIllegalStateException("Label must not be blank");
                }
                ContextMenuUi_androidKt.ContextMenuItem(invoke, z11, contextMenuColors, modifier, qVar, aVar, composer, (i11 << 6) & 896, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
