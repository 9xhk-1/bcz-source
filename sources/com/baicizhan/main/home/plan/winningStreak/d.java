package com.baicizhan.main.home.plan.winningStreak;

import a00.l1;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.main.home.plan.winningStreak.a;
import com.baicizhan.main.home.plan.winningStreak.b;
import com.baicizhan.main.home.plan.winningStreak.c;
import com.jiongji.andriod.card.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWinningStreakUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakUi.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakUiKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,303:1\n99#2:304\n96#2,9:305\n106#2:346\n99#2:359\n96#2,9:360\n106#2:403\n79#3,6:314\n86#3,3:329\n89#3,2:338\n93#3:345\n79#3,6:369\n86#3,3:384\n89#3,2:393\n93#3:402\n347#4,9:320\n356#4:340\n357#4,2:343\n347#4,9:375\n356#4:395\n357#4,2:400\n4206#5,6:332\n4206#5,6:387\n113#6:341\n113#6:342\n113#6:347\n113#6:348\n113#6:356\n113#6:357\n113#6:358\n113#6:416\n1247#7,6:349\n1247#7,6:404\n1247#7,6:410\n75#8:355\n75#8:396\n75#8:397\n75#8:398\n75#8:399\n*S KotlinDebug\n*F\n+ 1 WinningStreakUi.kt\ncom/baicizhan/main/home/plan/winningStreak/WinningStreakUiKt\n*L\n61#1:304\n61#1:305,9\n61#1:346\n242#1:359\n242#1:360,9\n242#1:403\n61#1:314,6\n61#1:329,3\n61#1:338,2\n61#1:345\n242#1:369,6\n242#1:384,3\n242#1:393,2\n242#1:402\n61#1:320,9\n61#1:340\n61#1:343,2\n242#1:375,9\n242#1:395\n242#1:400,2\n61#1:332,6\n242#1:387,6\n74#1:341\n83#1:342\n211#1:347\n213#1:348\n250#1:356\n252#1:357\n253#1:358\n230#1:416\n245#1:349,6\n97#1:404,6\n124#1:410,6\n249#1:355\n256#1:396\n257#1:397\n260#1:398\n261#1:399\n*E\n"})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Map<WinningStreakStatus, Integer> f23002a = l1.W(new Pair(WinningStreakStatus.Finish, Integer.valueOf(R.drawable.ic_winning_streak_lightning_finish)), new Pair(WinningStreakStatus.ComeOn, Integer.valueOf(R.drawable.ic_winning_streak_lightning_unfinish)), new Pair(WinningStreakStatus.Hint, Integer.valueOf(R.drawable.ic_winning_streak_lightning_hint)));

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ProvidableCompositionLocal<Color> f23003b = CompositionLocalKt.compositionLocalOf$default(null, a.f23008a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final ProvidableCompositionLocal<Integer> f23004c = CompositionLocalKt.compositionLocalOf$default(null, new x00.a() { // from class: sg.x
        @Override // x00.a
        public final Object invoke() {
            int v11;
            v11 = com.baicizhan.main.home.plan.winningStreak.d.v();
            return Integer.valueOf(v11);
        }
    }, 1, null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ProvidableCompositionLocal<Color> f23005d = CompositionLocalKt.compositionLocalOf$default(null, b.f23009a, 1, null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final ProvidableCompositionLocal<Dp> f23006e = CompositionLocalKt.compositionLocalOf$default(null, new x00.a() { // from class: sg.y
        @Override // x00.a
        public final Object invoke() {
            Dp w11;
            w11 = com.baicizhan.main.home.plan.winningStreak.d.w();
            return w11;
        }
    }, 1, null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final ProvidableCompositionLocal<TextStyle> f23007f = CompositionLocalKt.compositionLocalOf$default(null, new x00.a() { // from class: sg.j
        @Override // x00.a
        public final Object invoke() {
            TextStyle x11;
            x11 = com.baicizhan.main.home.plan.winningStreak.d.x();
            return x11;
        }
    }, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.a<Color> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23008a = new a();

        public final long a() {
            return Color.Companion.m2535getBlack0d7_KjU();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m2499boximpl(a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.a<Color> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23009a = new b();

        public final long a() {
            return Color.Companion.m2535getBlack0d7_KjU();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m2499boximpl(a());
        }
    }

    public static final g2 A(boolean z11, int i11, boolean z12, long j11, p pVar, int i12, int i13, Composer composer, int i14) {
        y(z11, i11, z12, j11, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void B(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(912646619);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912646619, i11, -1, "com.baicizhan.main.home.plan.winningStreak.Preview (WinningStreakUi.kt:293)");
            }
            bk.k.e(null, null, null, sg.b.f88448a.b(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.n
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 C;
                    C = com.baicizhan.main.home.plan.winningStreak.d.C(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }

    public static final g2 C(int i11, Composer composer, int i12) {
        B(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D(boolean z11, @k final a.b state, @k final x00.a<g2> onClick, @l Composer composer, final int i11) {
        int i12;
        final boolean z12;
        g0.p(state, "state");
        g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1683676527);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 131) != 130, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1683676527, i12, -1, "com.baicizhan.main.home.plan.winningStreak.RankUI (WinningStreakUi.kt:103)");
            }
            z12 = z11;
            y(z12, R.drawable.ic_ranking_normal, false, V(z11), ComposableLambdaKt.rememberComposableLambda(1776172226, true, new p() { // from class: sg.q
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 E;
                    E = com.baicizhan.main.home.plan.winningStreak.d.E(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            }, startRestartGroup, 54), startRestartGroup, (i12 & 14) | 24624, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z12 = z11;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.r
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 F;
                    F = com.baicizhan.main.home.plan.winningStreak.d.F(z12, state, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return F;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 E(x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1776172226, i11, -1, "com.baicizhan.main.home.plan.winningStreak.RankUI.<anonymous> (WinningStreakUi.kt:108)");
            }
            r(StringResources_androidKt.stringResource(R.string.ranking_homepage_title, composer, 6), aVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 F(boolean z11, a.b bVar, x00.a aVar, int i11, Composer composer, int i12) {
        D(z11, bVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void G(boolean z11, @k final b.C0317b state, @k final x00.l<? super b.C0317b, g2> taskClick, @l Composer composer, final int i11) {
        int i12;
        final boolean z12;
        g0.p(state, "state");
        g0.p(taskClick, "taskClick");
        Composer startRestartGroup = composer.startRestartGroup(741033892);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(taskClick) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(741033892, i12, -1, "com.baicizhan.main.home.plan.winningStreak.TaskUI (WinningStreakUi.kt:113)");
            }
            z12 = z11;
            y(z12, state.d() == TaskStatus.Normal ? R.drawable.ic_tasks_normal : R.drawable.ic_tasks_reward, false, V(z11), ComposableLambdaKt.rememberComposableLambda(-1825651949, true, new p() { // from class: sg.k
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 H;
                    H = com.baicizhan.main.home.plan.winningStreak.d.H(x00.l.this, state, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            }, startRestartGroup, 54), startRestartGroup, (i12 & 14) | 24576, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z12 = z11;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 J;
                    J = com.baicizhan.main.home.plan.winningStreak.d.J(z12, state, taskClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return J;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 H(final x00.l lVar, final b.C0317b c0317b, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825651949, i11, -1, "com.baicizhan.main.home.plan.winningStreak.TaskUI.<anonymous> (WinningStreakUi.kt:123)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.task_homepage_title, composer, 6);
            boolean changed = composer.changed(lVar) | composer.changed(c0317b);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: sg.m
                    @Override // x00.a
                    public final Object invoke() {
                        g2 I;
                        I = com.baicizhan.main.home.plan.winningStreak.d.I(x00.l.this, c0317b);
                        return I;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            r(stringResource, (x00.a) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 I(x00.l lVar, b.C0317b c0317b) {
        lVar.invoke(c0317b);
        return g2.f100423a;
    }

    public static final g2 J(boolean z11, b.C0317b c0317b, x00.l lVar, int i11, Composer composer, int i12) {
        G(z11, c0317b, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void K(@k final sg.c state, @k final x00.l<? super c.b, g2> goWinning, @k final x00.a<g2> goRanking, @k final x00.l<? super b.C0317b, g2> goTask, @l Composer composer, final int i11) {
        int i12;
        g0.p(state, "state");
        g0.p(goWinning, "goWinning");
        g0.p(goRanking, "goRanking");
        g0.p(goTask, "goTask");
        Composer startRestartGroup = composer.startRestartGroup(-748496418);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(goWinning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(goRanking) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(goTask) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-748496418, i12, -1, "com.baicizhan.main.home.plan.winningStreak.WinningRankAndTask (WinningStreakUi.kt:58)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxHeight$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            c i13 = state.i();
            c.b bVar = i13 instanceof c.b ? (c.b) i13 : null;
            if (bVar == null) {
                startRestartGroup.startReplaceGroup(1864442388);
            } else {
                startRestartGroup.startReplaceGroup(1864442389);
                M(state.j(), bVar, goWinning, startRestartGroup, (i12 << 3) & 896);
            }
            startRestartGroup.endReplaceGroup();
            com.baicizhan.main.home.plan.winningStreak.a g11 = state.g();
            a.b bVar2 = g11 instanceof a.b ? (a.b) g11 : null;
            if (bVar2 == null) {
                startRestartGroup.startReplaceGroup(1864631767);
            } else {
                startRestartGroup.startReplaceGroup(1864631768);
                if (g0.g(state.i(), c.a.f22997b)) {
                    startRestartGroup.startReplaceGroup(-2068385872);
                } else {
                    startRestartGroup.startReplaceGroup(-2065315384);
                    SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
                }
                startRestartGroup.endReplaceGroup();
                D(state.j(), bVar2, goRanking, startRestartGroup, i12 & 896);
            }
            startRestartGroup.endReplaceGroup();
            com.baicizhan.main.home.plan.winningStreak.b h11 = state.h();
            b.C0317b c0317b = h11 instanceof b.C0317b ? (b.C0317b) h11 : null;
            if (c0317b == null) {
                startRestartGroup.startReplaceGroup(1864934575);
            } else {
                startRestartGroup.startReplaceGroup(1864934576);
                if (g0.g(state.i(), c.a.f22997b) && g0.g(state.g(), a.C0316a.f22987b)) {
                    startRestartGroup.startReplaceGroup(-528340998);
                } else {
                    startRestartGroup.startReplaceGroup(-524928270);
                    SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
                }
                startRestartGroup.endReplaceGroup();
                G(state.j(), c0317b, goTask, startRestartGroup, (i12 >> 3) & 896);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.u
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 L;
                    L = com.baicizhan.main.home.plan.winningStreak.d.L(c.this, goWinning, goRanking, goTask, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return L;
                }
            });
        }
    }

    public static final g2 L(sg.c cVar, x00.l lVar, x00.a aVar, x00.l lVar2, int i11, Composer composer, int i12) {
        K(cVar, lVar, aVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void M(boolean z11, @k final c.b winning, @k final x00.l<? super c.b, g2> winingClick, @l Composer composer, final int i11) {
        int i12;
        final boolean z12;
        g0.p(winning, "winning");
        g0.p(winingClick, "winingClick");
        Composer startRestartGroup = composer.startRestartGroup(214610800);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(winning) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(winingClick) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(214610800, i12, -1, "com.baicizhan.main.home.plan.winningStreak.WinningStreakUI (WinningStreakUi.kt:91)");
            }
            Integer num = f23002a.get(winning.f());
            g0.m(num);
            z12 = z11;
            y(z12, num.intValue(), true, W(z11, winning), ComposableLambdaKt.rememberComposableLambda(-488255201, true, new p() { // from class: sg.o
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 N;
                    N = com.baicizhan.main.home.plan.winningStreak.d.N(c.b.this, winingClick, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            }, startRestartGroup, 54), startRestartGroup, (i12 & 14) | 24960, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z12 = z11;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.p
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 P;
                    P = com.baicizhan.main.home.plan.winningStreak.d.P(z12, winning, winingClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return P;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 N(final c.b bVar, final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-488255201, i11, -1, "com.baicizhan.main.home.plan.winningStreak.WinningStreakUI.<anonymous> (WinningStreakUi.kt:96)");
            }
            String valueOf = String.valueOf(bVar.e());
            boolean changed = composer.changed(lVar) | composer.changed(bVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: sg.w
                    @Override // x00.a
                    public final Object invoke() {
                        g2 O;
                        O = com.baicizhan.main.home.plan.winningStreak.d.O(x00.l.this, bVar);
                        return O;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            r(valueOf, (x00.a) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 O(x00.l lVar, c.b bVar) {
        lVar.invoke(bVar);
        return g2.f100423a;
    }

    public static final g2 P(boolean z11, c.b bVar, x00.l lVar, int i11, Composer composer, int i12) {
        M(z11, bVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @k
    public static final ProvidableCompositionLocal<Color> Q() {
        return f23003b;
    }

    @k
    public static final ProvidableCompositionLocal<Integer> R() {
        return f23004c;
    }

    @k
    public static final ProvidableCompositionLocal<Color> S() {
        return f23005d;
    }

    @k
    public static final ProvidableCompositionLocal<Dp> T() {
        return f23006e;
    }

    @k
    public static final ProvidableCompositionLocal<TextStyle> U() {
        return f23007f;
    }

    public static final long V(boolean z11) {
        return z11 ? bk.b.J0() : bk.b.D();
    }

    public static final long W(boolean z11, c.b bVar) {
        return bVar.f() == WinningStreakStatus.Finish ? z11 ? bk.b.A0() : bk.b.B0() : z11 ? bk.b.J0() : bk.b.h();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void r(final String str, final x00.a<g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-154915375);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154915375, i13, -1, "com.baicizhan.main.home.plan.winningStreak.Item (WinningStreakUi.kt:240)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(SizeKt.m759height3ABfNKs(BackgroundKt.m234backgroundbw27NRU(ClickableKt.m267clickableO2vRcR0$default(companion, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar, 28, null), ((Color) startRestartGroup.consume(f23003b)).m2519unboximpl(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(18))), Dp.m5115constructorimpl(36)), Dp.m5115constructorimpl(10), Dp.m5115constructorimpl(0));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            t(((Number) startRestartGroup.consume(f23004c)).intValue(), startRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, ((Dp) startRestartGroup.consume(f23006e)).m5129unboximpl()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, ((Color) startRestartGroup.consume(f23005d)).m2519unboximpl(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) startRestartGroup.consume(f23007f), composer2, i13 & 14, 3120, 54778);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.v
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 s11;
                    s11 = com.baicizhan.main.home.plan.winningStreak.d.s(str, aVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            });
        }
    }

    public static final g2 s(String str, x00.a aVar, int i11, Composer composer, int i12) {
        r(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void t(@DrawableRes final int i11, @l Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(999512757);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999512757, i13, -1, "com.baicizhan.main.home.plan.winningStreak.LightIcon (WinningStreakUi.kt:131)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, startRestartGroup, i13 & 14), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sg.i
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 u11;
                    u11 = com.baicizhan.main.home.plan.winningStreak.d.u(i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            });
        }
    }

    public static final g2 u(int i11, int i12, Composer composer, int i13) {
        t(i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return g2.f100423a;
    }

    public static final int v() {
        return R.drawable.ic_winning_streak_lightning_finish;
    }

    public static final Dp w() {
        return Dp.m5113boximpl(Dp.m5115constructorimpl(4));
    }

    public static final TextStyle x() {
        return new TextStyle(0L, bk.d.n(), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (v) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final boolean r49, int r50, boolean r51, long r52, final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.winningStreak.d.y(boolean, int, boolean, long, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final g2 z(p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052016242, i11, -1, "com.baicizhan.main.home.plan.winningStreak.LocalTheme.<anonymous> (WinningStreakUi.kt:222)");
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
}
