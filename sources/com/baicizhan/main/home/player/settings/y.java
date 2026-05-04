package com.baicizhan.main.home.player.settings;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.baicizhan.main.home.dialog.o1;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.f3;
import com.jiongji.andriod.card.R;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\ncom/baicizhan/main/home/player/settings/SettingsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 13 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,186:1\n1247#2,6:187\n1247#2,6:242\n1247#2,6:376\n1247#2,6:382\n1247#2,6:392\n1247#2,6:487\n1247#2,6:493\n1247#2,6:499\n113#3:193\n113#3:231\n113#3:232\n113#3:285\n113#3:290\n113#3:297\n113#3:298\n113#3:299\n113#3:300\n113#3:338\n113#3:339\n113#3:398\n113#3:436\n113#3:441\n99#4:194\n96#4,9:195\n106#4:236\n99#4:399\n96#4,9:400\n106#4:440\n99#4:442\n96#4,9:443\n106#4:482\n79#5,6:204\n86#5,3:219\n89#5,2:228\n93#5:235\n79#5,6:258\n86#5,3:273\n89#5,2:282\n93#5:288\n79#5,6:311\n86#5,3:326\n89#5,2:335\n79#5,6:349\n86#5,3:364\n89#5,2:373\n93#5:390\n79#5,6:409\n86#5,3:424\n89#5,2:433\n93#5:439\n79#5,6:452\n86#5,3:467\n89#5,2:476\n93#5:481\n93#5:485\n347#6,9:210\n356#6:230\n357#6,2:233\n347#6,9:264\n356#6:284\n357#6,2:286\n347#6,9:317\n356#6:337\n347#6,9:355\n356#6:375\n357#6,2:388\n347#6,9:415\n356#6:435\n357#6,2:437\n347#6,9:458\n356#6,3:478\n357#6,2:483\n4206#7,6:222\n4206#7,6:276\n4206#7,6:329\n4206#7,6:367\n4206#7,6:427\n4206#7,6:470\n75#8:237\n33#9:238\n53#10,3:239\n70#10:292\n70#10:295\n87#11:248\n84#11,9:249\n94#11:289\n87#11:301\n84#11,9:302\n87#11:340\n85#11,8:341\n94#11:391\n94#11:486\n61#12:291\n61#12:294\n22#13:293\n22#13:296\n*S KotlinDebug\n*F\n+ 1 Settings.kt\ncom/baicizhan/main/home/player/settings/SettingsKt\n*L\n55#1:187,6\n79#1:242,6\n164#1:376,6\n165#1:382,6\n169#1:392,6\n178#1:487,6\n179#1:493,6\n180#1:499,6\n55#1:193\n56#1:231\n57#1:232\n97#1:285\n139#1:290\n116#1:297\n157#1:298\n158#1:299\n159#1:300\n161#1:338\n163#1:339\n169#1:398\n171#1:436\n176#1:441\n55#1:194\n55#1:195,9\n55#1:236\n169#1:399\n169#1:400,9\n169#1:440\n176#1:442\n176#1:443,9\n176#1:482\n55#1:204,6\n55#1:219,3\n55#1:228,2\n55#1:235\n76#1:258,6\n76#1:273,3\n76#1:282,2\n76#1:288\n159#1:311,6\n159#1:326,3\n159#1:335,2\n163#1:349,6\n163#1:364,3\n163#1:373,2\n163#1:390\n169#1:409,6\n169#1:424,3\n169#1:433,2\n169#1:439\n176#1:452,6\n176#1:467,3\n176#1:476,2\n176#1:481\n159#1:485\n55#1:210,9\n55#1:230\n55#1:233,2\n76#1:264,9\n76#1:284\n76#1:286,2\n159#1:317,9\n159#1:337\n163#1:355,9\n163#1:375\n163#1:388,2\n169#1:415,9\n169#1:435\n169#1:437,2\n176#1:458,9\n176#1:478,3\n159#1:483,2\n55#1:222,6\n76#1:276,6\n159#1:329,6\n163#1:367,6\n169#1:427,6\n176#1:470,6\n73#1:237\n74#1:238\n74#1:239,3\n84#1:292\n89#1:295\n76#1:248\n76#1:249,9\n76#1:289\n159#1:301\n159#1:302,9\n163#1:340\n163#1:341,8\n163#1:391\n159#1:486\n84#1:291\n89#1:294\n84#1:293\n89#1:296\n*E\n"})
/* loaded from: classes4.dex */
public final class y {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void A(Modifier modifier, @DrawableRes final int i11, final String str, final boolean z11, final x00.l<? super Boolean, g2> lVar, Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        String str2;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1525982825);
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
            str2 = str;
            i14 |= startRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= startRestartGroup.changedInstance(lVar) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i14 & 9363) != 9362, i14 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1525982825, i14, -1, "com.baicizhan.main.home.player.settings.SettingSwitch (Settings.kt:53)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.u
                    @Override // x00.a
                    public final Object invoke() {
                        g2 B;
                        B = y.B();
                        return B;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            float f11 = 8;
            Modifier then = modifier4.then(PaddingKt.m726padding3ABfNKs(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue, 3, null), Dp.m5115constructorimpl(f11)));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            Modifier modifier5 = modifier4;
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i16 = i14 >> 3;
            float f12 = 32;
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, startRestartGroup, i16 & 14), "icon", SizeKt.m777sizeInqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str2, RowScope.weight$default(rowScopeInstance, PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), ColorKt.Color(4282664804L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getH4(), composer2, ((i14 >> 6) & 14) | 384, 0, 65528);
            f3.h(z11, false, null, lVar, composer2, ((i14 >> 9) & 14) | (i16 & 7168), 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.v
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 C;
                    C = y.C(Modifier.this, i11, str, z11, lVar, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }

    public static final g2 B() {
        return g2.f100423a;
    }

    public static final g2 C(Modifier modifier, int i11, String str, boolean z11, x00.l lVar, int i12, int i13, Composer composer, int i14) {
        A(modifier, i11, str, z11, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D(@m80.k final MutableState<Boolean> visibility, final boolean z11, final boolean z12, @m80.k final x00.l<? super Boolean, g2> onAudioEffectChanged, @m80.k final x00.l<? super Boolean, g2> onVibrationEffectChanged, @m80.k final x00.l<? super SettingBehavior, g2> onSettingBehavior, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        kotlin.jvm.internal.g0.p(onAudioEffectChanged, "onAudioEffectChanged");
        kotlin.jvm.internal.g0.p(onVibrationEffectChanged, "onVibrationEffectChanged");
        kotlin.jvm.internal.g0.p(onSettingBehavior, "onSettingBehavior");
        Composer startRestartGroup = composer.startRestartGroup(664332080);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(visibility) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(onAudioEffectChanged) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(onVibrationEffectChanged) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(onSettingBehavior) ? 131072 : 65536;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((74899 & i13) != 74898, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(664332080, i13, -1, "com.baicizhan.main.home.player.settings.Settings (Settings.kt:154)");
            }
            composer2 = startRestartGroup;
            o1.I(visibility, "设置", 0, null, null, ComposableLambdaKt.rememberComposableLambda(-1492881121, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.g
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 E;
                    E = y.E(z11, onAudioEffectChanged, z12, onVibrationEffectChanged, onSettingBehavior, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return E;
                }
            }, startRestartGroup, 54), composer2, (i13 & 14) | 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.p
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 N;
                    N = y.N(MutableState.this, z11, z12, onAudioEffectChanged, onVibrationEffectChanged, onSettingBehavior, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return N;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 E(final boolean z11, final x00.l lVar, final boolean z12, final x00.l lVar2, final x00.l lVar3, ColumnScope TipContentPage, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(TipContentPage, "$this$TipContentPage");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1492881121, i11, -1, "com.baicizhan.main.home.player.settings.Settings.<anonymous> (Settings.kt:156)");
            }
            Modifier.Companion companion = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), composer, 6);
            o1.A(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(companion, Dp.m5115constructorimpl(10), 0.0f, 2, null), 0.0f, 1, null), true, ComposableLambdaKt.rememberComposableLambda(-1023179623, true, new x00.q() { // from class: com.baicizhan.main.home.player.settings.w
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 F;
                    F = y.F(z11, lVar, z12, lVar2, lVar3, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return F;
                }
            }, composer, 54), composer, 438, 0);
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
    public static final g2 F(boolean z11, x00.l lVar, boolean z12, x00.l lVar2, final x00.l lVar3, BoxScope FrameContainer, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(FrameContainer, "$this$FrameContainer");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1023179623, i11, -1, "com.baicizhan.main.home.player.settings.Settings.<anonymous>.<anonymous> (Settings.kt:158)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(30));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            A(null, R.drawable.ic_home_setting_music_note, "音效", z11, lVar, composer, 432, 1);
            float f11 = 4;
            A(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 13, null), R.drawable.ic_home_setting_vibration, "震动", z12, lVar2, composer, 438, 0);
            float f12 = 24;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 13, null);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(12)), companion2.getStart(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m730paddingqDBjuR0$default);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean changed = composer.changed(lVar3);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.x
                    @Override // x00.a
                    public final Object invoke() {
                        g2 G;
                        G = y.G(x00.l.this);
                        return G;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            v(fillMaxWidth$default, "推送消息通知", (x00.a) rememberedValue, composer, 54, 0);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean changed2 = composer.changed(lVar3);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.settings.h
                    @Override // x00.a
                    public final Object invoke() {
                        g2 H;
                        H = y.H(x00.l.this);
                        return H;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            v(fillMaxWidth$default2, "学习方式设置", (x00.a) rememberedValue2, composer, 54, 0);
            composer.endNode();
            boolean changed3 = composer.changed(lVar3);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.player.settings.i
                    @Override // x00.a
                    public final Object invoke() {
                        g2 I;
                        I = y.I(x00.l.this);
                        return I;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Modifier m726padding3ABfNKs2 = PaddingKt.m726padding3ABfNKs(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue3, 3, null), Dp.m5115constructorimpl(f12));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs2);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g("更多信息", (Modifier) null, ColorKt.Color(4286744232L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle2(), composer, 390, 0, 65530);
            IconKt.m1692Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_home_setting_arrow_small, composer, 54), "arrow", PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4286744232L), composer, 3504, 0);
            composer.endNode();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_setting_divider, composer, 6), "divider", SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            Modifier m730paddingqDBjuR0$default2 = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(f12), 0.0f, Dp.m5115constructorimpl(f11), 5, null);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m730paddingqDBjuR0$default2);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4286744232L))), ComposableLambdaKt.rememberComposableLambda(-460698520, true, new x00.p() { // from class: com.baicizhan.main.home.player.settings.j
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 J;
                    J = y.J(RowScope.this, lVar3, (Composer) obj, ((Integer) obj2).intValue());
                    return J;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 G(x00.l lVar) {
        lVar.invoke(SettingBehavior.NOTIFICATION);
        return g2.f100423a;
    }

    public static final g2 H(x00.l lVar) {
        lVar.invoke(SettingBehavior.LEARNING_CONFIGURATION);
        return g2.f100423a;
    }

    public static final g2 I(x00.l lVar) {
        lVar.invoke(SettingBehavior.MORE);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 J(RowScope rowScope, final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460698520, i11, -1, "com.baicizhan.main.home.player.settings.Settings.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Settings.kt:177)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier weight$default = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null);
            boolean changed = composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.settings.r
                    @Override // x00.a
                    public final Object invoke() {
                        g2 K;
                        K = y.K(x00.l.this);
                        return K;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            O(weight$default, "帮助与反馈", (x00.a) rememberedValue, composer, 48, 0);
            Modifier weight$default2 = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null);
            boolean changed2 = composer.changed(lVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.settings.s
                    @Override // x00.a
                    public final Object invoke() {
                        g2 L;
                        L = y.L(x00.l.this);
                        return L;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            O(weight$default2, "给我们好评", (x00.a) rememberedValue2, composer, 48, 0);
            Modifier weight$default3 = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null);
            boolean changed3 = composer.changed(lVar);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.player.settings.t
                    @Override // x00.a
                    public final Object invoke() {
                        g2 M;
                        M = y.M(x00.l.this);
                        return M;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            O(weight$default3, "关于我们", (x00.a) rememberedValue3, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 K(x00.l lVar) {
        lVar.invoke(SettingBehavior.FEEDBACK);
        return g2.f100423a;
    }

    public static final g2 L(x00.l lVar) {
        lVar.invoke(SettingBehavior.RATE_US);
        return g2.f100423a;
    }

    public static final g2 M(x00.l lVar) {
        lVar.invoke(SettingBehavior.ABOUT);
        return g2.f100423a;
    }

    public static final g2 N(MutableState mutableState, boolean z11, boolean z12, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Composer composer, int i12) {
        D(mutableState, z11, z12, lVar, lVar2, lVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void O(Modifier modifier, final String str, final x00.a<g2> aVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        String str2;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1335522694);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            str2 = str;
            i13 |= startRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1335522694, i13, -1, "com.baicizhan.main.home.player.settings.TextButton (Settings.kt:135)");
            }
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str2, modifier4.then(PaddingKt.m728paddingVpY3zN4$default(ComposeUtilsKt.k(Modifier.Companion, 0L, false, aVar, 3, null), 0.0f, Dp.m5115constructorimpl(8), 1, null)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, TextDecoration.Companion.getUnderline(), TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getSubtitle2(), composer2, ((i13 >> 3) & 14) | 100663296, 0, 64764);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.m
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 P;
                    P = y.P(Modifier.this, str, aVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return P;
                }
            });
        }
    }

    public static final g2 P(Modifier modifier, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        O(modifier, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(@m80.l androidx.compose.ui.Modifier r34, float r35, int r36, int r37, final long r38, long r40, long r42, @m80.l x00.r<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r44, @m80.l androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.settings.y.s(androidx.compose.ui.Modifier, float, int, int, long, long, long, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 t(long j11, long j12, long j13, int i11, long j14, DrawScope drawBehind) {
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, j11, 0L, 0L, j12, null, 0.0f, null, 0, R.styleable.Theme_drawable_walk_sound2, null);
        Color.Companion companion = Color.Companion;
        if (!Color.m2510equalsimpl0(j13, companion.m2545getUnspecified0d7_KjU())) {
            DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, j13, 0L, Size.m2330copyxjbvk4A$default(drawBehind.mo3060getSizeNHjbRc(), 0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - (i11 * drawBehind.getDensity()), 1, null), j12, null, 0.0f, null, 0, R.styleable.Theme_drawable_time, null);
        }
        DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, j14, 0L, Size.m2330copyxjbvk4A$default(drawBehind.mo3060getSizeNHjbRc(), 0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - ((i11 * drawBehind.getDensity()) * (!Color.m2510equalsimpl0(j13, companion.m2545getUnspecified0d7_KjU()) ? 2 : 1)), 1, null), j12, null, 0.0f, null, 0, R.styleable.Theme_drawable_time, null);
        return g2.f100423a;
    }

    public static final g2 u(Modifier modifier, float f11, int i11, int i12, long j11, long j12, long j13, x00.r rVar, int i13, int i14, Composer composer, int i15) {
        s(modifier, f11, i11, i12, j11, j12, j13, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void v(@m80.l Modifier modifier, @m80.k final String title, @m80.k final x00.a<g2> onClick, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1085964595);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            final Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085964595, i13, -1, "com.baicizhan.main.home.player.settings.SettingButton (Settings.kt:105)");
            }
            modifier3 = modifier4;
            s(modifier4.then(ComposeUtilsKt.k(Modifier.Companion, 0L, false, onClick, 3, null)), 0.0f, 0, 0, ColorKt.Color(4292141307L), 0L, ColorKt.Color(4289643768L), ComposableLambdaKt.rememberComposableLambda(497763348, true, new x00.r() { // from class: com.baicizhan.main.home.player.settings.k
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    g2 w11;
                    w11 = y.w(Modifier.this, title, (ColumnScope) obj, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return w11;
                }
            }, startRestartGroup, 54), startRestartGroup, 14180352, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 x11;
                    x11 = y.x(Modifier.this, title, onClick, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 w(Modifier modifier, String str, ColumnScope LayerBox, Modifier it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(LayerBox, "$this$LayerBox");
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(497763348, i11, -1, "com.baicizhan.main.home.player.settings.SettingButton.<anonymous> (Settings.kt:111)");
            }
            TextKt.m1845Text4IGK_g(str, modifier.then(PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(24), Dp.m5115constructorimpl(13))), ColorKt.Color(4282664804L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), composer, 384, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 x(Modifier modifier, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        v(modifier, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void y(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1792288413);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1792288413, i11, -1, "com.baicizhan.main.home.player.settings.SettingButtonPreview (Settings.kt:123)");
            }
            bk.k.h(null, null, null, d.f24027a.e(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.settings.q
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 z11;
                    z11 = y.z(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return z11;
                }
            });
        }
    }

    public static final g2 z(int i11, Composer composer, int i12) {
        y(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }
}
