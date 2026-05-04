package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,582:1\n1247#2,6:583\n1247#2,6:589\n1247#2,6:595\n1247#2,6:602\n1247#2,6:608\n149#3:601\n149#3:614\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n73#1:583,6\n74#1:589,6\n199#1:595,6\n384#1:602,6\n400#1:608,6\n326#1:601\n573#1:614\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt {

    @k
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new a<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m5115constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1751Scaffold27mzLpw(@m80.l androidx.compose.ui.Modifier r39, @m80.l androidx.compose.material.ScaffoldState r40, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r41, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r42, @m80.l x00.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r44, int r45, boolean r46, @m80.l x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r47, boolean r48, @m80.l androidx.compose.ui.graphics.Shape r49, float r50, long r51, long r53, long r55, long r57, long r59, @m80.k final x00.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r61, @m80.l androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1751Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, x00.p, x00.p, x00.q, x00.p, int, boolean, x00.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1752Scaffoldu4IkXBM(@m80.k final androidx.compose.foundation.layout.WindowInsets r43, @m80.l androidx.compose.ui.Modifier r44, @m80.l androidx.compose.material.ScaffoldState r45, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r46, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r47, @m80.l x00.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r48, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r49, int r50, boolean r51, @m80.l x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r52, boolean r53, @m80.l androidx.compose.ui.graphics.Shape r54, float r55, long r56, long r58, long r60, long r62, long r64, @m80.k final x00.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r66, @m80.l androidx.compose.runtime.Composer r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1752Scaffoldu4IkXBM(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, x00.p, x00.p, x00.q, x00.p, int, boolean, x00.q, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m1753ScaffoldLayouti1QSOvI(final boolean z11, final int i11, final p<? super Composer, ? super Integer, g2> pVar, final q<? super PaddingValues, ? super Composer, ? super Integer, g2> qVar, final p<? super Composer, ? super Integer, g2> pVar2, final p<? super Composer, ? super Integer, g2> pVar3, final WindowInsets windowInsets, final p<? super Composer, ? super Integer, g2> pVar4, Composer composer, final int i12) {
        int i13;
        q<? super PaddingValues, ? super Composer, ? super Integer, g2> qVar2;
        p<? super Composer, ? super Integer, g2> pVar5;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-468424875);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(z11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            qVar2 = qVar;
            i13 |= startRestartGroup.changedInstance(qVar2) ? 2048 : 1024;
        } else {
            qVar2 = qVar;
        }
        if ((i12 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            pVar5 = pVar3;
            i13 |= startRestartGroup.changedInstance(pVar5) ? 131072 : 65536;
        } else {
            pVar5 = pVar3;
        }
        if ((i12 & 1572864) == 0) {
            i13 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar4) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((i13 & 4793491) != 4793490, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, i13, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            boolean z12 = ((i13 & 7168) == 2048) | ((57344 & i13) == 16384) | ((i13 & 896) == 256) | ((3670016 & i13) == 1048576) | ((458752 & i13) == 131072) | ((i13 & 112) == 32) | ((i13 & 14) == 4) | ((29360128 & i13) == 8388608);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue2 == companion.getEmpty()) {
                final q<? super PaddingValues, ? super Composer, ? super Integer, g2> qVar3 = qVar2;
                final p<? super Composer, ? super Integer, g2> pVar6 = pVar5;
                i14 = 0;
                p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar7 = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1755invoke0kLqBqw(subcomposeMeasureScope, constraints.m5074unboximpl());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:49:0x0264 A[LOOP:3: B:48:0x0262->B:49:0x0264, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x027a  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x02a8  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x02b4  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x02f5  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x031c  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0388 A[LOOP:4: B:75:0x0386->B:76:0x0388, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x0325  */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x030d  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x02f2  */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x02b1  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x027c  */
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final androidx.compose.ui.layout.MeasureResult m1755invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope r26, long r27) {
                        /*
                            Method dump skipped, instructions count: 966
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.m1755invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
                    }
                };
                startRestartGroup.updateRememberedValue(pVar7);
                rememberedValue2 = pVar7;
            } else {
                i14 = 0;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (p) rememberedValue2, startRestartGroup, i14, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

                public final void invoke(Composer composer2, int i15) {
                    ScaffoldKt.m1753ScaffoldLayouti1QSOvI(z11, i11, pVar, qVar, pVar2, pVar3, windowInsets, pVar4, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }

    @k
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    @k
    public static final ScaffoldState rememberScaffoldState(@l DrawerState drawerState, @l SnackbarHostState snackbarHostState, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i12 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i11, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scaffoldState;
    }
}
