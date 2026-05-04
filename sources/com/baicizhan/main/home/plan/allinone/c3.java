package com.baicizhan.main.home.plan.allinone;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.main.home.plan.allinone.b;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n4in1Card.kt\nKotlin\n*S Kotlin\n*F\n+ 1 4in1Card.kt\ncom/baicizhan/main/home/plan/allinone/_4in1CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,320:1\n113#2:321\n113#2:322\n113#2:323\n113#2:324\n113#2:325\n113#2:326\n113#2:327\n113#2:328\n113#2:396\n113#2:427\n113#2:446\n113#2:502\n113#2:503\n113#2:559\n113#2:560\n87#3:329\n84#3,9:330\n94#3:468\n87#3,6:469\n94#3:525\n87#3,6:526\n94#3:576\n79#4,6:339\n86#4,3:354\n89#4,2:363\n93#4:467\n79#4,6:475\n86#4,3:490\n89#4,2:499\n93#4:524\n79#4,6:532\n86#4,3:547\n89#4,2:556\n93#4:575\n347#5,9:345\n356#5:365\n357#5,2:465\n347#5,9:481\n356#5:501\n357#5,2:522\n347#5,9:538\n356#5:558\n357#5,2:573\n4206#6,6:357\n4206#6,6:493\n4206#6,6:550\n1247#7,6:366\n1247#7,6:372\n1247#7,6:378\n1247#7,6:384\n1247#7,6:390\n1247#7,6:397\n1247#7,6:403\n1247#7,6:409\n1247#7,6:415\n1247#7,6:421\n1247#7,6:428\n1247#7,6:434\n1247#7,6:440\n1247#7,6:447\n1247#7,6:453\n1247#7,6:459\n1247#7,6:504\n1247#7,6:510\n1247#7,6:516\n1247#7,6:561\n1247#7,6:567\n1247#7,6:577\n*S KotlinDebug\n*F\n+ 1 4in1Card.kt\ncom/baicizhan/main/home/plan/allinone/_4in1CardKt\n*L\n39#1:321\n81#1:322\n120#1:323\n141#1:324\n157#1:325\n171#1:326\n184#1:327\n195#1:328\n244#1:396\n271#1:427\n297#1:446\n54#1:502\n55#1:503\n96#1:559\n97#1:560\n208#1:329\n208#1:330,9\n208#1:468\n40#1:469,6\n40#1:525\n82#1:526,6\n82#1:576\n208#1:339,6\n208#1:354,3\n208#1:363,2\n208#1:467\n40#1:475,6\n40#1:490,3\n40#1:499,2\n40#1:524\n82#1:532,6\n82#1:547,3\n82#1:556,2\n82#1:575\n208#1:345,9\n208#1:365\n208#1:465,2\n40#1:481,9\n40#1:501\n40#1:522,2\n82#1:538,9\n82#1:558\n82#1:573,2\n208#1:357,6\n40#1:493,6\n82#1:550,6\n237#1:366,6\n238#1:372,6\n239#1:378,6\n240#1:384,6\n241#1:390,6\n268#1:397,6\n265#1:403,6\n266#1:409,6\n267#1:415,6\n269#1:421,6\n292#1:428,6\n293#1:434,6\n294#1:440,6\n312#1:447,6\n313#1:453,6\n314#1:459,6\n61#1:504,6\n62#1:510,6\n63#1:516,6\n102#1:561,6\n103#1:567,6\n127#1:577,6\n*E\n"})
/* loaded from: classes4.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f22150a = "4in1Card";

    public static final yz.g2 A0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 B0(m1 a11, AddType b11) {
        kotlin.jvm.internal.g0.p(a11, "a");
        kotlin.jvm.internal.g0.p(b11, "b");
        return yz.g2.f100423a;
    }

    public static final yz.g2 C0(th.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final yz.g2 D0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 E0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 F0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 G0(int i11, Composer composer, int i12) {
        p0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void M(@m80.k final b.a learning, @m80.k final x00.a<yz.g2> editClick, @m80.k final x00.a<yz.g2> daka, @m80.k final x00.a<yz.g2> showOff, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(learning, "learning");
        kotlin.jvm.internal.g0.p(editClick, "editClick");
        kotlin.jvm.internal.g0.p(daka, "daka");
        kotlin.jvm.internal.g0.p(showOff, "showOff");
        Composer startRestartGroup = composer.startRestartGroup(2075106346);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(learning) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(editClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(daka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(showOff) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2075106346, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneAllDone (4in1Card.kt:139)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(1359930250, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.e2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N;
                    N = c3.N(b.a.this, editClick, daka, showOff, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.f2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = c3.O(b.a.this, editClick, daka, showOff, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 N(b.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1359930250, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneAllDone.<anonymous> (4in1Card.kt:141)");
            }
            y0.P(null, aVar.f(), true, aVar.e().l(), aVar.e().p(), aVar.e().k(), aVar2, aVar3, aVar4, composer, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 O(b.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, Composer composer, int i12) {
        M(aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void P(@m80.k final b.C0310b error, @m80.k final x00.a<yz.g2> retry, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(error, "error");
        kotlin.jvm.internal.g0.p(retry, "retry");
        Composer startRestartGroup = composer.startRestartGroup(-565725924);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(error) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(retry) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-565725924, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneError (4in1Card.kt:155)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(1468996732, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.q2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = c3.Q(b.C0310b.this, retry, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.r2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 R;
                    R = c3.R(b.C0310b.this, retry, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return R;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 Q(b.C0310b c0310b, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1468996732, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneError.<anonymous> (4in1Card.kt:157)");
            }
            y0.J(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.94255877f, false, 2, null), c0310b.d(), StringResources_androidKt.stringResource(R.string.main_alert_no_road_map_confirm, composer, 6), aVar, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(b.C0310b c0310b, x00.a aVar, int i11, Composer composer, int i12) {
        P(c0310b, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void S(@m80.k final b.c learning, @m80.k final x00.p<? super m1, ? super AddType, yz.g2> goStudy, @m80.k final x00.a<yz.g2> daka, @m80.k final x00.a<yz.g2> showOff, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(learning, "learning");
        kotlin.jvm.internal.g0.p(goStudy, "goStudy");
        kotlin.jvm.internal.g0.p(daka, "daka");
        kotlin.jvm.internal.g0.p(showOff, "showOff");
        Composer startRestartGroup = composer.startRestartGroup(-35003429);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(learning) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goStudy) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(daka) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(showOff) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-35003429, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneFinishBookToday (4in1Card.kt:118)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(-1824801989, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.v2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 T;
                    T = c3.T(b.c.this, goStudy, daka, showOff, (Composer) obj, ((Integer) obj2).intValue());
                    return T;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.w2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 V;
                    V = c3.V(b.c.this, goStudy, daka, showOff, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return V;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 T(final b.c cVar, final x00.p pVar, x00.a aVar, x00.a aVar2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1824801989, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneFinishBookToday.<anonymous> (4in1Card.kt:120)");
            }
            boolean i12 = cVar.i();
            String l11 = cVar.h().l();
            int p11 = cVar.h().p();
            String k11 = cVar.h().k();
            boolean changed = composer.changed(pVar) | composer.changed(cVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.s2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 U;
                        U = c3.U(x00.p.this, cVar);
                        return U;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            y0.P(null, i12, false, l11, p11, k11, (x00.a) rememberedValue, aVar, aVar2, composer, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(x00.p pVar, b.c cVar) {
        pVar.invoke(cVar.j(), AddType.REVIEW);
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(b.c cVar, x00.p pVar, x00.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        S(cVar, pVar, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void W(@m80.k final b.e learning, @m80.k final x00.p<? super m1, ? super AddType, yz.g2> goStudy, @m80.k final x00.l<? super th.a, yz.g2> adClick, @m80.k final x00.a<yz.g2> editClick, @m80.k final x00.a<yz.g2> onUpgrade, @m80.k final x00.a<yz.g2> daka, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(learning, "learning");
        kotlin.jvm.internal.g0.p(goStudy, "goStudy");
        kotlin.jvm.internal.g0.p(adClick, "adClick");
        kotlin.jvm.internal.g0.p(editClick, "editClick");
        kotlin.jvm.internal.g0.p(onUpgrade, "onUpgrade");
        kotlin.jvm.internal.g0.p(daka, "daka");
        Composer startRestartGroup = composer.startRestartGroup(-1187160894);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(learning) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goStudy) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(adClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(editClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(onUpgrade) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(daka) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1187160894, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneLearning (4in1Card.kt:37)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(16)), ComposableLambdaKt.rememberComposableLambda(-940803742, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.o2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 X;
                    X = c3.X(b.e.this, editClick, onUpgrade, adClick, goStudy, daka, (Composer) obj, ((Integer) obj2).intValue());
                    return X;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.p2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b02;
                    b02 = c3.b0(b.e.this, goStudy, adClick, editClick, onUpgrade, daka, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return b02;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 X(final b.e eVar, x00.a aVar, x00.a aVar2, final x00.l lVar, final x00.p pVar, x00.a aVar3, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-940803742, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneLearning.<anonymous> (4in1Card.kt:39)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            y0.x(null, eVar.i(), aVar, aVar2, composer, 0, 1);
            DividerKt.m1643DivideroMI9zvI(SizeKt.m759height3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(20), 1, null), Dp.m5115constructorimpl(1)), bk.b.J(), 0.0f, 0.0f, composer, 54, 12);
            m1 k11 = eVar.k();
            m1 l11 = eVar.l();
            boolean j11 = eVar.j();
            th.a h11 = eVar.h();
            boolean changed = composer.changed(eVar) | composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.i2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Y;
                        Y = c3.Y(b.e.this, lVar);
                        return Y;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar4 = (x00.a) rememberedValue;
            boolean changed2 = composer.changed(pVar) | composer.changed(eVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.j2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Z;
                        Z = c3.Z(x00.p.this, eVar);
                        return Z;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar5 = (x00.a) rememberedValue2;
            boolean changed3 = composer.changed(pVar) | composer.changed(eVar);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.k2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 a02;
                        a02 = c3.a0(x00.p.this, eVar);
                        return a02;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            y0.a0(null, k11, l11, j11, h11, aVar4, aVar5, (x00.a) rememberedValue3, aVar3, composer, 0, 1);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y(b.e eVar, x00.l lVar) {
        th.a h11 = eVar.h();
        if (h11 != null) {
            lVar.invoke(h11);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(x00.p pVar, b.e eVar) {
        pVar.invoke(eVar.k(), AddType.LEARN);
        return yz.g2.f100423a;
    }

    public static final yz.g2 a0(x00.p pVar, b.e eVar) {
        pVar.invoke(eVar.l(), AddType.REVIEW);
        return yz.g2.f100423a;
    }

    public static final yz.g2 b0(b.e eVar, x00.p pVar, x00.l lVar, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Composer composer, int i12) {
        W(eVar, pVar, lVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c0(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(2103916654);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103916654, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneLoading (4in1Card.kt:182)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), a1.f22091a.b(), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.m2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 d02;
                    d02 = c3.d0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return d02;
                }
            });
        }
    }

    public static final yz.g2 d0(int i11, Composer composer, int i12) {
        c0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e0(@m80.k final b.g support, @m80.k final x00.a<yz.g2> edit, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(support, "support");
        kotlin.jvm.internal.g0.p(edit, "edit");
        Composer startRestartGroup = composer.startRestartGroup(2073894748);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(support) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(edit) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2073894748, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneNotSupport (4in1Card.kt:169)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(567463612, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.g2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f02;
                    f02 = c3.f0(b.g.this, edit, (Composer) obj, ((Integer) obj2).intValue());
                    return f02;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.h2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 g02;
                    g02 = c3.g0(b.g.this, edit, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return g02;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f0(b.g gVar, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(567463612, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneNotSupport.<anonymous> (4in1Card.kt:171)");
            }
            y0.J(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.94255877f, false, 2, null), gVar.d(), StringResources_androidKt.stringResource(R.string.card_4in1_change_plan, composer, 6), aVar, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 g0(b.g gVar, x00.a aVar, int i11, Composer composer, int i12) {
        e0(gVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h0(@m80.k final b.h learning, @m80.k final x00.p<? super m1, ? super AddType, yz.g2> goStudy, @m80.k final x00.l<? super th.a, yz.g2> adClick, @m80.k final x00.a<yz.g2> editClick, @m80.k final x00.a<yz.g2> onUpgrade, @m80.k final x00.a<yz.g2> daka, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(learning, "learning");
        kotlin.jvm.internal.g0.p(goStudy, "goStudy");
        kotlin.jvm.internal.g0.p(adClick, "adClick");
        kotlin.jvm.internal.g0.p(editClick, "editClick");
        kotlin.jvm.internal.g0.p(onUpgrade, "onUpgrade");
        kotlin.jvm.internal.g0.p(daka, "daka");
        Composer startRestartGroup = composer.startRestartGroup(1247802882);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(learning) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goStudy) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(adClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(editClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(onUpgrade) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(daka) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1247802882, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneReview (4in1Card.kt:79)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(16)), ComposableLambdaKt.rememberComposableLambda(-917085534, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.q1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 i02;
                    i02 = c3.i0(b.h.this, editClick, onUpgrade, adClick, goStudy, daka, (Composer) obj, ((Integer) obj2).intValue());
                    return i02;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.b2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 l02;
                    l02 = c3.l0(b.h.this, goStudy, adClick, editClick, onUpgrade, daka, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return l02;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i0(final b.h hVar, x00.a aVar, x00.a aVar2, final x00.l lVar, final x00.p pVar, x00.a aVar3, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917085534, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneReview.<anonymous> (4in1Card.kt:81)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            y0.x(null, hVar.h(), aVar, aVar2, composer, 0, 1);
            DividerKt.m1643DivideroMI9zvI(SizeKt.m759height3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(20), 1, null), Dp.m5115constructorimpl(1)), bk.b.J(), 0.0f, 0.0f, composer, 54, 12);
            m1 j11 = hVar.j();
            boolean i12 = hVar.i();
            th.a g11 = hVar.g();
            boolean changed = composer.changed(hVar) | composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.l2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 j02;
                        j02 = c3.j0(b.h.this, lVar);
                        return j02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar4 = (x00.a) rememberedValue;
            boolean changed2 = composer.changed(pVar) | composer.changed(hVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.n2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 k02;
                        k02 = c3.k0(x00.p.this, hVar);
                        return k02;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            y0.c0(null, j11, i12, g11, aVar4, (x00.a) rememberedValue2, aVar3, composer, 0, 1);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 j0(b.h hVar, x00.l lVar) {
        th.a g11 = hVar.g();
        if (g11 != null) {
            lVar.invoke(g11);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 k0(x00.p pVar, b.h hVar) {
        pVar.invoke(hVar.j(), AddType.REVIEW);
        return yz.g2.f100423a;
    }

    public static final yz.g2 l0(b.h hVar, x00.p pVar, x00.l lVar, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Composer composer, int i12) {
        h0(hVar, pVar, lVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m0(@m80.k final x00.a<yz.g2> onUpgrade, @m80.l Composer composer, final int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(onUpgrade, "onUpgrade");
        Composer startRestartGroup = composer.startRestartGroup(330719537);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(onUpgrade) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(330719537, i12, -1, "com.baicizhan.main.home.plan.allinone.FourInOneUpgrading (4in1Card.kt:193)");
            }
            y0.T(PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(16)), ComposableLambdaKt.rememberComposableLambda(-730849135, true, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.t2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 n02;
                    n02 = c3.n0(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return n02;
                }
            }, startRestartGroup, 54), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.u2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 o02;
                    o02 = c3.o0(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return o02;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 n0(x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-730849135, i11, -1, "com.baicizhan.main.home.plan.allinone.FourInOneUpgrading.<anonymous> (4in1Card.kt:195)");
            }
            y0.o0(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), aVar, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 o0(x00.a aVar, int i11, Composer composer, int i12) {
        m0(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void p0(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-2124867997);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2124867997, i11, -1, "com.baicizhan.main.home.plan.allinone.PreviewAllInOne (4in1Card.kt:206)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m235backgroundbw27NRU$default(companion, bk.b.J(), null, 2, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b.e eVar = new b.e(new p1("四级词汇大全", "bookImg", 100, 300, 150, 1000, false), new m1(1, 1, new a(1, "abc", com.baicizhan.main.home.plan.module.exam.b.f22504c)), new m1(1, 1, new a(2, "abc", com.baicizhan.main.home.plan.module.exam.b.f22504c)), null, true);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.x2
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 q02;
                        q02 = c3.q0((m1) obj, (AddType) obj2);
                        return q02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            x00.p pVar = (x00.p) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.u1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 r02;
                        r02 = c3.r0((th.a) obj);
                        return r02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            x00.l lVar = (x00.l) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.v1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 y02;
                        y02 = c3.y0();
                        return y02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            x00.a aVar = (x00.a) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.w1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 z02;
                        z02 = c3.z0();
                        return z02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            x00.a aVar2 = (x00.a) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.x1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A0;
                        A0 = c3.A0();
                        return A0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            W(eVar, pVar, lVar, aVar, aVar2, (x00.a) rememberedValue5, startRestartGroup, 224688);
            float f11 = 20;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            b.h hVar = new b.h(new p1("bookName", "bookImg", 1, 1, 1, 1, false), new m1(1, 1, new a(1, com.baicizhan.main.home.plan.module.exam.b.f22504c, com.baicizhan.main.home.plan.module.exam.b.f22504c)), null, true);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion3.getEmpty()) {
                rememberedValue6 = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.y1
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 B0;
                        B0 = c3.B0((m1) obj, (AddType) obj2);
                        return B0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            x00.p pVar2 = (x00.p) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion3.getEmpty()) {
                rememberedValue7 = new x00.l() { // from class: com.baicizhan.main.home.plan.allinone.z1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 C0;
                        C0 = c3.C0((th.a) obj);
                        return C0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            x00.l lVar2 = (x00.l) rememberedValue7;
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion3.getEmpty()) {
                rememberedValue8 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.a2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 D0;
                        D0 = c3.D0();
                        return D0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            x00.a aVar3 = (x00.a) rememberedValue8;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == companion3.getEmpty()) {
                rememberedValue9 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.c2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 E0;
                        E0 = c3.E0();
                        return E0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            x00.a aVar4 = (x00.a) rememberedValue9;
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == companion3.getEmpty()) {
                rememberedValue10 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.d2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 F0;
                        F0 = c3.F0();
                        return F0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            h0(hVar, pVar2, lVar2, aVar3, aVar4, (x00.a) rememberedValue10, startRestartGroup, 224688);
            startRestartGroup = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            b.c cVar = new b.c(new p1("bookName", "bookImg", 1, 1, 1, 1, false), new m1(1, 1, new a(1, com.baicizhan.main.home.plan.module.exam.b.f22504c, com.baicizhan.main.home.plan.module.exam.b.f22504c)), null, true);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == companion3.getEmpty()) {
                rememberedValue11 = new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.y2
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 s02;
                        s02 = c3.s0((m1) obj, (AddType) obj2);
                        return s02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            x00.p pVar3 = (x00.p) rememberedValue11;
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == companion3.getEmpty()) {
                rememberedValue12 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.z2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t02;
                        t02 = c3.t0();
                        return t02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            x00.a aVar5 = (x00.a) rememberedValue12;
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (rememberedValue13 == companion3.getEmpty()) {
                rememberedValue13 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.a3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u02;
                        u02 = c3.u0();
                        return u02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            S(cVar, pVar3, aVar5, (x00.a) rememberedValue13, startRestartGroup, 3504);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            b.a aVar6 = new b.a(new p1("bookName", "bookImg", 1, 1, 1, 1, false), true);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (rememberedValue14 == companion3.getEmpty()) {
                rememberedValue14 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.b3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v02;
                        v02 = c3.v0();
                        return v02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            x00.a aVar7 = (x00.a) rememberedValue14;
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == companion3.getEmpty()) {
                rememberedValue15 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.r1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 w02;
                        w02 = c3.w0();
                        return w02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            x00.a aVar8 = (x00.a) rememberedValue15;
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == companion3.getEmpty()) {
                rememberedValue16 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.s1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 x02;
                        x02 = c3.x0();
                        return x02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue16);
            }
            M(aVar6, aVar7, aVar8, (x00.a) rememberedValue16, startRestartGroup, 3504);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.t1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 G0;
                    G0 = c3.G0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return G0;
                }
            });
        }
    }

    public static final yz.g2 q0(m1 a11, AddType b11) {
        kotlin.jvm.internal.g0.p(a11, "a");
        kotlin.jvm.internal.g0.p(b11, "b");
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(th.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    public static final yz.g2 s0(m1 a11, AddType b11) {
        kotlin.jvm.internal.g0.p(a11, "a");
        kotlin.jvm.internal.g0.p(b11, "b");
        return yz.g2.f100423a;
    }

    public static final yz.g2 t0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 u0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 v0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 w0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 x0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 y0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 z0() {
        return yz.g2.f100423a;
    }
}
