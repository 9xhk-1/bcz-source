package com.baicizhan.main.home.experiment;

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
import com.baicizhan.main.home.experiment.u3;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/ComposableSingletons$WordCardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,826:1\n1247#2,6:827\n1247#2,6:833\n1247#2,6:840\n1247#2,6:883\n1247#2,6:889\n1247#2,6:895\n113#3:839\n113#3:846\n87#4:847\n85#4,8:848\n94#4:904\n79#5,6:856\n86#5,3:871\n89#5,2:880\n93#5:903\n347#6,9:862\n356#6:882\n357#6,2:901\n4206#7,6:874\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/ComposableSingletons$WordCardKt\n*L\n765#1:827,6\n766#1:833,6\n768#1:840,6\n821#1:883,6\n822#1:889,6\n823#1:895,6\n767#1:839\n820#1:846\n820#1:847\n820#1:848,8\n820#1:904\n820#1:856,6\n820#1:871,3\n820#1:880,2\n820#1:903\n820#1:862,9\n820#1:882\n820#1:901,2\n820#1:874,6\n*E\n"})
/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p0 f21332a = new p0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<RowScope, Composer, Integer, yz.g2> f21333b = ComposableLambdaKt.composableLambdaInstance(-1456176189, false, new x00.q() { // from class: com.baicizhan.main.home.experiment.g0
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 q11;
            q11 = p0.q((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return q11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21334c = ComposableLambdaKt.composableLambdaInstance(1615795890, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.h0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 m11;
            m11 = p0.m((Composer) obj, ((Integer) obj2).intValue());
            return m11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f21335d = ComposableLambdaKt.composableLambdaInstance(-1913750472, false, new x00.p() { // from class: com.baicizhan.main.home.experiment.i0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 r11;
            r11 = p0.r((Composer) obj, ((Integer) obj2).intValue());
            return r11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 m(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1615795890, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$WordCardKt.lambda$1615795890.<anonymous> (WordCard.kt:762)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.m0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 n11;
                        n11 = p0.n();
                        return n11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            b bVar = new b(com.baicizhan.main.home.experiment.repo.q.f21581c, new u3.a((x00.a) rememberedValue), "", "已学 10 词", null, 16, null);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.n0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 o11;
                        o11 = p0.o();
                        return o11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            List Q = a00.h0.Q(bVar, new b(com.baicizhan.main.home.experiment.repo.q.f21582d, new u3.a((x00.a) rememberedValue2), "", null, null, 24, null));
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16));
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.experiment.o0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 p11;
                        p11 = p0.p((b) obj);
                        return p11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            WordCardKt.b0(Q, m726padding3ABfNKs, (x00.l) rememberedValue3, composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 n() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 o() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 p(b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 q(RowScope OutlinedButton, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(OutlinedButton, "$this$OutlinedButton");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1456176189, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$WordCardKt.lambda$-1456176189.<anonymous> (WordCard.kt:250)");
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
    public static final yz.g2 r(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1913750472, i11, -1, "com.baicizhan.main.home.experiment.ComposableSingletons$WordCardKt.lambda$-1913750472.<anonymous> (WordCard.kt:819)");
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
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.j0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 s11;
                        s11 = p0.s();
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            WordCardKt.h0("开始背1组单词吧！", null, null, (x00.a) rememberedValue, composer, 3078, 6);
            PointerPosition pointerPosition = PointerPosition.BOTTOM_RIGHT;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.k0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t11;
                        t11 = p0.t();
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            WordCardKt.h0("点击学习可以「再来一组」～", pointerPosition, null, (x00.a) rememberedValue2, composer, 3126, 4);
            PointerPosition pointerPosition2 = PointerPosition.TOP_LEFT;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.experiment.l0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = p0.u();
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            WordCardKt.h0("点击学习可以「再来一组」～", pointerPosition2, null, (x00.a) rememberedValue3, composer, 3126, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 s() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 t() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 u() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.q<RowScope, Composer, Integer, yz.g2> j() {
        return f21333b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> k() {
        return f21335d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> l() {
        return f21334c;
    }
}
