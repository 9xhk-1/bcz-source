package com.baicizhan.main.home.player;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.baicizhan.main.home.player.r4;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/ComposableSingletons$WordCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,925:1\n113#2:926\n113#2:939\n113#2:946\n1247#3,6:927\n1247#3,6:933\n1247#3,6:940\n1247#3,6:983\n1247#3,6:989\n1247#3,6:995\n87#4:947\n85#4,8:948\n94#4:1004\n79#5,6:956\n86#5,3:971\n89#5,2:980\n93#5:1003\n347#6,9:962\n356#6:982\n357#6,2:1001\n4206#7,6:974\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/ComposableSingletons$WordCardKt\n*L\n545#1:926\n866#1:939\n919#1:946\n864#1:927,6\n865#1:933,6\n867#1:940,6\n920#1:983,6\n921#1:989,6\n922#1:995,6\n919#1:947\n919#1:948,8\n919#1:1004\n919#1:956,6\n919#1:971,3\n919#1:980,2\n919#1:1003\n919#1:962,9\n919#1:982\n919#1:1001,2\n919#1:974,6\n*E\n"})
/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o1 f23826a = new o1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<RowScope, Composer, Integer, yz.g2> f23827b = ComposableLambdaKt.composableLambdaInstance(-248149289, false, new x00.q() { // from class: com.baicizhan.main.home.player.e1
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 s11;
            s11 = o1.s((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return s11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23828c = ComposableLambdaKt.composableLambdaInstance(-933055110, false, new x00.p() { // from class: com.baicizhan.main.home.player.f1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 x11;
            x11 = o1.x((Composer) obj, ((Integer) obj2).intValue());
            return x11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23829d = ComposableLambdaKt.composableLambdaInstance(-567293280, false, new x00.p() { // from class: com.baicizhan.main.home.player.g1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 t11;
            t11 = o1.t((Composer) obj, ((Integer) obj2).intValue());
            return t11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23830e = ComposableLambdaKt.composableLambdaInstance(2014120102, false, new x00.p() { // from class: com.baicizhan.main.home.player.h1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 o11;
            o11 = o1.o((Composer) obj, ((Integer) obj2).intValue());
            return o11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2014120102, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$WordCardKt.lambda$2014120102.<anonymous> (WordCard.kt:918)");
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(12));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(16)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.i1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 p11;
                        p11 = o1.p();
                        return p11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            WordCardKt.M("开始背1组单词吧！", null, null, (x00.a) rememberedValue, composer, 3078, 6);
            PointerPosition pointerPosition = PointerPosition.BOTTOM_RIGHT;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.j1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 q11;
                        q11 = o1.q();
                        return q11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            WordCardKt.M("点击学习可以「再来一组」～", pointerPosition, null, (x00.a) rememberedValue2, composer, 3126, 4);
            PointerPosition pointerPosition2 = PointerPosition.TOP_LEFT;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.player.k1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 r11;
                        r11 = o1.r();
                        return r11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            WordCardKt.M("点击学习可以「再来一组」～", pointerPosition2, null, (x00.a) rememberedValue3, composer, 3126, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 p() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 q() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 r() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 s(RowScope OutlinedButton, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(OutlinedButton, "$this$OutlinedButton");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-248149289, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$WordCardKt.lambda$-248149289.<anonymous> (WordCard.kt:273)");
            }
            TextKt.m1845Text4IGK_g("重试", (Modifier) null, MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1600getPrimary0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199686, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-567293280, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$WordCardKt.lambda$-567293280.<anonymous> (WordCard.kt:861)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.player.l1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 u11;
                        u11 = o1.u(((Integer) obj).intValue());
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            e eVar = new e(com.baicizhan.main.home.experiment.repo.q.f21581c, new r4.b((x00.l) rememberedValue), "", "已学 10 词", null, null, 0, false, 240, null);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.player.m1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 v11;
                        v11 = o1.v(((Integer) obj).intValue());
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            List Q = a00.h0.Q(eVar, new e(com.baicizhan.main.home.experiment.repo.q.f21582d, new r4.b((x00.l) rememberedValue2), "", null, null, null, 0, false, R.styleable.Theme_drawable_walk_sound4, null));
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16));
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.player.n1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 w11;
                        w11 = o1.w((e) obj);
                        return w11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            WordCardKt.F(Q, m726padding3ABfNKs, null, null, (x00.l) rememberedValue3, composer, 24624, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 u(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(e it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 x(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-933055110, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$WordCardKt.lambda$-933055110.<anonymous> (WordCard.kt:544)");
            }
            TextKt.m1845Text4IGK_g("词表", PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(6), Dp.m5115constructorimpl(2)), 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(17), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3126, 6, 130036);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.q<RowScope, Composer, Integer, yz.g2> k() {
        return f23827b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> l() {
        return f23829d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> m() {
        return f23828c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> n() {
        return f23830e;
    }
}
