package com.baicizhan.main.activity.mytab.task;

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
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.jiongji.andriod.card.R;
import he.a;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUiAchievement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiAchievement.kt\ncom/baicizhan/main/activity/mytab/task/UiAchievementKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,110:1\n1247#2,6:111\n113#3:117\n113#3:155\n99#4:118\n96#4,9:119\n106#4:190\n79#5,6:128\n86#5,3:143\n89#5,2:152\n93#5:189\n347#6,9:134\n356#6:154\n357#6,2:187\n4206#7,6:146\n1565#8:156\n1359#8,6:157\n1359#8,6:163\n1359#8,6:169\n1359#8,6:175\n1359#8,6:181\n*S KotlinDebug\n*F\n+ 1 UiAchievement.kt\ncom/baicizhan/main/activity/mytab/task/UiAchievementKt\n*L\n45#1:111,6\n48#1:117\n52#1:155\n41#1:118\n41#1:119,9\n41#1:190\n41#1:128,6\n41#1:143,3\n41#1:152,2\n41#1:189\n41#1:134,9\n41#1:154\n41#1:187,2\n41#1:146,6\n53#1:156\n54#1:157,6\n57#1:163,6\n62#1:169,6\n65#1:175,6\n68#1:181,6\n*E\n"})
/* loaded from: classes4.dex */
public final class x {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@m80.k final he.a achievement, @m80.k final x00.a<g2> onClick, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        String str;
        String str2;
        kotlin.jvm.internal.g0.p(achievement, "achievement");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(947589772);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(achievement) : startRestartGroup.changedInstance(achievement) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947589772, i12, -1, "com.baicizhan.main.activity.mytab.task.study (UiAchievement.kt:32)");
            }
            if (achievement instanceof a.b) {
                a.b bVar = (a.b) achievement;
                str = g(Integer.valueOf(bVar.d().f()));
                str2 = g(Integer.valueOf(bVar.d().e()));
            } else {
                str = HttpRequest.f17578o;
                str2 = HttpRequest.f17578o;
            }
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            String str3 = str2;
            String str4 = str;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(BackgroundKt.m234backgroundbw27NRU(ClickableKt.m267clickableO2vRcR0$default(companion, (MutableInteractionSource) rememberedValue, null, false, null, null, onClick, 28, null), bk.b.A0(), MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getSmall()), Dp.m5115constructorimpl(16));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_mytab_study, startRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(8)), composer2, 6);
            composer2.startReplaceGroup(1022924344);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composer2.startReplaceGroup(1022924572);
            long x11 = bk.b.x();
            long m11 = bk.d.m();
            FontWeight.Companion companion3 = FontWeight.Companion;
            int pushStyle = builder.pushStyle(new SpanStyle(x11, m11, companion3.getMedium(), (FontStyle) null, (FontSynthesis) null, bk.a.a(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, DefaultImageHeaderParser.f28782e, (kotlin.jvm.internal.v) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.my_tab_study_words, composer2, 6));
                g2 g2Var = g2.f100423a;
                builder.pop(pushStyle);
                composer2.endReplaceGroup();
                pushStyle = builder.pushStyle(new SpanStyle(bk.b.x(), bk.d.n(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, yj.a.a(R.font.din_black_italic), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (kotlin.jvm.internal.v) null));
                try {
                    builder.append(" " + ((Object) str4) + " ");
                    builder.pop(pushStyle);
                    composer2.startReplaceGroup(1022938683);
                    pushStyle = builder.pushStyle(new SpanStyle(bk.b.x(), bk.d.m(), companion3.getMedium(), (FontStyle) null, (FontSynthesis) null, bk.a.a(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, DefaultImageHeaderParser.f28782e, (kotlin.jvm.internal.v) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(R.string.my_tab_study_days, composer2, 6));
                        builder.pop(pushStyle);
                        composer2.endReplaceGroup();
                        pushStyle = builder.pushStyle(new SpanStyle(bk.b.x(), bk.d.n(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, yj.a.a(R.font.din_black_italic), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (kotlin.jvm.internal.v) null));
                        try {
                            builder.append(" " + ((Object) str3) + " ");
                            builder.pop(pushStyle);
                            composer2.startReplaceGroup(1022951552);
                            pushStyle = builder.pushStyle(new SpanStyle(bk.b.x(), bk.d.m(), companion3.getMedium(), (FontStyle) null, (FontSynthesis) null, bk.a.a(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, DefaultImageHeaderParser.f28782e, (kotlin.jvm.internal.v) null));
                            try {
                                builder.append(StringResources_androidKt.stringResource(R.string.my_tab_study_days_unit, composer2, 6));
                                builder.pop(pushStyle);
                                composer2.endReplaceGroup();
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composer2.endReplaceGroup();
                                TextKt.m1846TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.w
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 d11;
                    d11 = x.d(he.a.this, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return d11;
                }
            });
        }
    }

    public static final g2 d(he.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        c(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void e(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(992996);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(992996, i11, -1, "com.baicizhan.main.activity.mytab.task.testStudy (UiAchievement.kt:86)");
            }
            bk.k.e(null, null, null, f.f18822a.c(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.task.v
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 f11;
                    f11 = x.f(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            });
        }
    }

    public static final g2 f(int i11, Composer composer, int i12) {
        e(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @m80.k
    public static final String g(@m80.l Integer num) {
        String valueOf;
        if (num == null) {
            return HttpRequest.f17578o;
        }
        int intValue = num.intValue();
        if (intValue >= 100000) {
            valueOf = (intValue / 10000) + ExifInterface.LONGITUDE_WEST;
        } else {
            valueOf = String.valueOf(intValue);
        }
        return valueOf == null ? HttpRequest.f17578o : valueOf;
    }
}
