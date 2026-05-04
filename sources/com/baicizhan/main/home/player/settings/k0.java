package com.baicizhan.main.home.player.settings;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.baicizhan.main.home.dialog.o1;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ntips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 tips.kt\ncom/baicizhan/main/home/player/settings/TipsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,93:1\n1247#2,6:94\n1247#2,6:148\n99#3:100\n96#3,9:101\n106#3:141\n79#4,6:110\n86#4,3:125\n89#4,2:134\n93#4:140\n347#5,9:116\n356#5:136\n357#5,2:138\n4206#6,6:128\n113#7:137\n113#7:142\n113#7:143\n113#7:144\n113#7:145\n113#7:146\n113#7:147\n113#7:154\n113#7:155\n113#7:156\n113#7:157\n*S KotlinDebug\n*F\n+ 1 tips.kt\ncom/baicizhan/main/home/player/settings/TipsKt\n*L\n65#1:94,6\n69#1:148,6\n88#1:100\n88#1:101,9\n88#1:141\n88#1:110,6\n88#1:125,3\n88#1:134,2\n88#1:140\n88#1:116,9\n88#1:136\n88#1:138,2\n88#1:128,6\n90#1:137\n43#1:142\n44#1:143\n47#1:144\n48#1:145\n49#1:146\n68#1:147\n71#1:154\n74#1:155\n75#1:156\n76#1:157\n*E\n"})
/* loaded from: classes4.dex */
public final class k0 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(@m80.k final MutableState<Boolean> visibility, @m80.k final String title, @DrawableRes final int i11, @m80.k final String description, @DrawableRes final int i12, @m80.l Composer composer, final int i13) {
        int i14;
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        Composer startRestartGroup = composer.startRestartGroup(1025633569);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(visibility) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= startRestartGroup.changed(description) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i14 & 9363) != 9362, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1025633569, i14, -1, "com.baicizhan.main.home.player.settings.BuildingCostTip (tips.kt:40)");
            }
            o1.I(visibility, title, 0, null, null, ComposableLambdaKt.rememberComposableLambda(796863442, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.j0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 m11;
                    m11 = k0.m(i11, description, i12, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return m11;
                }
            }, startRestartGroup, 54), startRestartGroup, (i14 & 14) | 196608 | (i14 & 112), 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.a0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 p11;
                    p11 = k0.p(MutableState.this, title, i11, description, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return p11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 m(final int i11, final String str, final int i12, ColumnScope TipContentPage, Composer composer, int i13) {
        kotlin.jvm.internal.g0.p(TipContentPage, "$this$TipContentPage");
        if (composer.shouldExecute((i13 & 17) != 16, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796863442, i13, -1, "com.baicizhan.main.home.player.settings.BuildingCostTip.<anonymous> (tips.kt:42)");
            }
            Modifier.Companion companion = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), composer, 6);
            float f11 = 10;
            o1.A(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), 0.0f, 1, null), Dp.m5115constructorimpl(140)), false, ComposableLambdaKt.rememberComposableLambda(-1511940072, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.z
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 n11;
                    n11 = k0.n(i11, str, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return n11;
                }
            }, composer, 54), composer, 390, 2);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(16)), composer, 6);
            o1.A(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), 0.0f, 1, null), Dp.m5115constructorimpl(346)), false, ComposableLambdaKt.rememberComposableLambda(344748033, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.b0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 o11;
                    o11 = k0.o(i12, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return o11;
                }
            }, composer, 54), composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 n(int i11, String str, BoxScope FrameContainer, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(FrameContainer, "$this$FrameContainer");
        if ((i12 & 6) == 0) {
            i12 |= composer.changed(FrameContainer) ? 4 : 2;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1511940072, i12, -1, "com.baicizhan.main.home.player.settings.BuildingCostTip.<anonymous>.<anonymous> (tips.kt:44)");
            }
            x(FrameContainer.align(Modifier.Companion, Alignment.Companion.getCenter()), i11, str, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 o(int i11, BoxScope FrameContainer, Composer composer, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(FrameContainer, "$this$FrameContainer");
        if ((i12 & 6) == 0) {
            i13 = (composer.changed(FrameContainer) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (composer.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(344748033, i13, -1, "com.baicizhan.main.home.player.settings.BuildingCostTip.<anonymous>.<anonymous> (tips.kt:48)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer, 0), "2", OffsetKt.m686offsetVpY3zN4$default(FrameContainer.align(Modifier.Companion, Alignment.Companion.getCenter()), 0.0f, Dp.m5115constructorimpl(-5), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 p(MutableState mutableState, String str, int i11, String str2, int i12, int i13, Composer composer, int i14) {
        l(mutableState, str, i11, str2, i12, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@m80.k final MutableState<Boolean> visibility, @DrawableRes final int i11, @m80.k final String description, @DrawableRes final int i12, @m80.k final tg.a navigator, @m80.l Composer composer, final int i13) {
        int i14;
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(navigator, "navigator");
        Composer startRestartGroup = composer.startRestartGroup(1560022426);
        if ((i13 & 6) == 0) {
            i14 = (startRestartGroup.changed(visibility) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= startRestartGroup.changed(description) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= startRestartGroup.changed(i12) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (i13 & 32768) == 0 ? startRestartGroup.changed(navigator) : startRestartGroup.changedInstance(navigator) ? 16384 : 8192;
        }
        boolean z11 = false;
        if (startRestartGroup.shouldExecute((i14 & 9363) != 9362, i14 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1560022426, i14, -1, "com.baicizhan.main.home.player.settings.CoinsTip (tips.kt:63)");
            }
            if ((57344 & i14) == 16384 || ((i14 & 32768) != 0 && startRestartGroup.changedInstance(navigator))) {
                z11 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.g0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 r11;
                        r11 = k0.r(tg.a.this);
                        return r11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            o1.I(visibility, "我的铜板", 0, null, (x00.a) rememberedValue, ComposableLambdaKt.rememberComposableLambda(755262475, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.h0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 s11;
                    s11 = k0.s(tg.a.this, i11, description, i12, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return s11;
                }
            }, startRestartGroup, 54), startRestartGroup, (i14 & 14) | 196656, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.i0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 w11;
                    w11 = k0.w(MutableState.this, i11, description, i12, navigator, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            });
        }
    }

    public static final g2 r(tg.a aVar) {
        aVar.a("https://learn.baicizhan.com/member-buy/cprotocol.html");
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 s(final tg.a aVar, final int i11, final String str, final int i12, ColumnScope TipContentPage, Composer composer, int i13) {
        kotlin.jvm.internal.g0.p(TipContentPage, "$this$TipContentPage");
        if (composer.shouldExecute((i13 & 17) != 16, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755262475, i13, -1, "com.baicizhan.main.home.player.settings.CoinsTip.<anonymous> (tips.kt:67)");
            }
            Modifier.Companion companion = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), composer, 6);
            boolean changedInstance = composer.changedInstance(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.c0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 t11;
                        t11 = k0.t(tg.a.this);
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            float f11 = 10;
            o1.A(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue, 3, null), Dp.m5115constructorimpl(f11), 0.0f, 2, null), 0.0f, 1, null), Dp.m5115constructorimpl(140)), false, ComposableLambdaKt.rememberComposableLambda(-1801789743, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.d0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 u11;
                    u11 = k0.u(i11, str, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return u11;
                }
            }, composer, 54), composer, 384, 2);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(16)), composer, 6);
            o1.A(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), 0.0f, 1, null), Dp.m5115constructorimpl(382)), false, ComposableLambdaKt.rememberComposableLambda(64051322, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.e0
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 v11;
                    v11 = k0.v(i12, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return v11;
                }
            }, composer, 54), composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 t(tg.a aVar) {
        aVar.a("https://learn.baicizhan.com/new_copper/copper-record");
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 u(int i11, String str, BoxScope FrameContainer, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(FrameContainer, "$this$FrameContainer");
        if ((i12 & 6) == 0) {
            i12 |= composer.changed(FrameContainer) ? 4 : 2;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1801789743, i12, -1, "com.baicizhan.main.home.player.settings.CoinsTip.<anonymous>.<anonymous> (tips.kt:71)");
            }
            x(FrameContainer.align(Modifier.Companion, Alignment.Companion.getCenter()), i11, str, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 v(int i11, BoxScope FrameContainer, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(FrameContainer, "$this$FrameContainer");
        if (composer.shouldExecute((i12 & 17) != 16, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(64051322, i12, -1, "com.baicizhan.main.home.player.settings.CoinsTip.<anonymous>.<anonymous> (tips.kt:75)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer, 0), "2", SizeKt.fillMaxSize$default(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(6)), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 w(MutableState mutableState, int i11, String str, int i12, tg.a aVar, int i13, Composer composer, int i14) {
        q(mutableState, i11, str, i12, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void x(Modifier modifier, @DrawableRes final int i11, final String str, Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-583393660);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            modifier2 = modifier;
        } else if ((i12 & 6) == 0) {
            modifier2 = modifier;
            i14 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i12;
        } else {
            modifier2 = modifier;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i14 & 147) != 146, i14 & 1)) {
            modifier3 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583393660, i14, -1, "com.baicizhan.main.home.player.settings.TipDescription (tips.kt:86)");
            }
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, startRestartGroup, (i14 >> 3) & 14), "icon", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4280823876L), TextUnitKt.getSp(32), (FontStyle) null, (FontWeight) null, bk.k.n(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, ((i14 >> 6) & 14) | 1576368, 0, 130992);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.f0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 y11;
                    y11 = k0.y(Modifier.this, i11, str, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return y11;
                }
            });
        }
    }

    public static final g2 y(Modifier modifier, int i11, String str, int i12, int i13, Composer composer, int i14) {
        x(modifier, i11, str, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return g2.f100423a;
    }
}
