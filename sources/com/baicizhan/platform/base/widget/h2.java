package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/ComposableSingletons$WidgetsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,299:1\n113#2:300\n113#2:337\n113#2:338\n113#2:339\n87#3:301\n85#3,8:302\n94#3:343\n79#4,6:310\n86#4,3:325\n89#4,2:334\n93#4:342\n347#5,9:316\n356#5:336\n357#5,2:340\n4206#6,6:328\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/ComposableSingletons$WidgetsKt\n*L\n257#1:300\n258#1:337\n259#1:338\n260#1:339\n257#1:301\n257#1:302,8\n257#1:343\n257#1:310,6\n257#1:325,3\n257#1:334,2\n257#1:342\n257#1:316,9\n257#1:336\n257#1:340,2\n257#1:328,6\n*E\n"})
/* loaded from: classes6.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h2 f28318a = new h2();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28319b = ComposableLambdaKt.composableLambdaInstance(-102544626, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.d2
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 k11;
            k11 = h2.k((Composer) obj, ((Integer) obj2).intValue());
            return k11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28320c = ComposableLambdaKt.composableLambdaInstance(-1272385866, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.e2
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 l11;
            l11 = h2.l((Composer) obj, ((Integer) obj2).intValue());
            return l11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28321d = ComposableLambdaKt.composableLambdaInstance(2091777, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.f2
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 j11;
            j11 = h2.j((Composer) obj, ((Integer) obj2).intValue());
            return j11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28322e = ComposableLambdaKt.composableLambdaInstance(1750735207, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.g2
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 i11;
            i11 = h2.i((Composer) obj, ((Integer) obj2).intValue());
            return i11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1750735207, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$WidgetsKt.lambda$1750735207.<anonymous> (Widgets.kt:256)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 12;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(f11));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
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
            float f12 = 100;
            WidgetsKt.D(0.5f, 0.0f, SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f12)), 0.0f, 0L, 0L, ColorKt.Color(4294177535L), composer, 1573254, 58);
            WidgetsKt.D(0.0f, 0.0f, SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f12)), 0.0f, 0L, 0L, ColorKt.Color(4294177535L), composer, 1573254, 58);
            WidgetsKt.D(0.03f, 0.0f, SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(f12)), 0.0f, 0L, 0L, ColorKt.Color(4294177535L), composer, 1573254, 58);
            WidgetsKt.D(0.5f, 0.7f, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0L, ColorKt.Color(4292665855L), ColorKt.Color(4294177535L), composer, 1769910, 24);
            composer.endNode();
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
    public static final yz.g2 j(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2091777, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$WidgetsKt.lambda$2091777.<anonymous> (Widgets.kt:154)");
            }
            WidgetsKt.K(null, "标题", "副标题", composer, 432, 1);
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
    public static final yz.g2 k(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102544626, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$WidgetsKt.lambda$-102544626.<anonymous> (Widgets.kt:121)");
            }
            WidgetsKt.r(R.drawable.ic_word_favorites_match_empty, "无匹配", "返回", null, composer, 438, 8);
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
    public static final yz.g2 l(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272385866, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$WidgetsKt.lambda$-1272385866.<anonymous> (Widgets.kt:129)");
            }
            WidgetsKt.r(R.drawable.ic_word_favorites_match_empty, StringResources_androidKt.stringResource(R.string.devices_management_empty_tip, composer, 6), null, null, composer, 6, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> e() {
        return f28319b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> f() {
        return f28320c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> g() {
        return f28322e;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> h() {
        return f28321d;
    }
}
