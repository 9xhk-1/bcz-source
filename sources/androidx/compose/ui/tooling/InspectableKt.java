package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.InspectionModeKt;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "InspectableKt")
@u0({"SMAP\nInspectable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Inspectable.android.kt\nandroidx/compose/ui/tooling/InspectableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,77:1\n75#2:78\n*S KotlinDebug\n*F\n+ 1 Inspectable.android.kt\nandroidx/compose/ui/tooling/InspectableKt\n*L\n73#1:78\n*E\n"})
/* loaded from: classes2.dex */
public final class InspectableKt {
    @Composable
    @n(message = "This method should not be used in application code and will be removed soon.")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void InInspectionModeOnly(@k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(484868210);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(484868210, i12, -1, "androidx.compose.ui.tooling.InInspectionModeOnly (Inspectable.android.kt:71)");
            }
            if (((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                startRestartGroup.startReplaceGroup(-1889608988);
                pVar.invoke(startRestartGroup, Integer.valueOf(i12 & 14));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1889584963);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.InspectableKt$InInspectionModeOnly$1
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
                    InspectableKt.InInspectionModeOnly(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void Inspectable(@k final CompositionDataRecord compositionDataRecord, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1669497937);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(compositionDataRecord) : startRestartGroup.changedInstance(compositionDataRecord) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1669497937, i12, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.android.kt:53)");
            }
            startRestartGroup.collectParameterInformation();
            g0.n(compositionDataRecord, "null cannot be cast to non-null type androidx.compose.ui.tooling.CompositionDataRecordImpl");
            Set<CompositionData> store = ((CompositionDataRecordImpl) compositionDataRecord).getStore();
            store.add(startRestartGroup.getCompositionData());
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InspectionModeKt.getLocalInspectionMode().provides(Boolean.TRUE), InspectionTablesKt.getLocalInspectionTables().provides(store)}, pVar, startRestartGroup, (i12 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.InspectableKt$Inspectable$1
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
                    InspectableKt.Inspectable(CompositionDataRecord.this, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
