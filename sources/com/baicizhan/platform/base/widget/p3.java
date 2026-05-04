package com.baicizhan.platform.base.widget;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Permission.kt\ncom/baicizhan/platform/base/widget/PermissionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,115:1\n1247#2,6:116\n1247#2,6:123\n1247#2,6:129\n113#3:122\n113#3:135\n113#3:136\n113#3:212\n113#3:217\n87#4:137\n84#4,9:138\n94#4:221\n79#5,6:147\n86#5,3:162\n89#5,2:171\n79#5,6:185\n86#5,3:200\n89#5,2:209\n93#5:215\n93#5:220\n347#6,9:153\n356#6:173\n347#6,9:191\n356#6:211\n357#6,2:213\n357#6,2:218\n4206#7,6:165\n4206#7,6:203\n99#8:174\n95#8,10:175\n106#8:216\n*S KotlinDebug\n*F\n+ 1 Permission.kt\ncom/baicizhan/platform/base/widget/PermissionKt\n*L\n36#1:116,6\n51#1:123,6\n52#1:129,6\n46#1:122\n57#1:135\n66#1:136\n69#1:212\n71#1:217\n66#1:137\n66#1:138,9\n66#1:221\n66#1:147,6\n66#1:162,3\n66#1:171,2\n67#1:185,6\n67#1:200,3\n67#1:209,2\n67#1:215\n66#1:220\n66#1:153,9\n66#1:173\n67#1:191,9\n67#1:211\n67#1:213,2\n66#1:218,2\n66#1:165,6\n67#1:203,6\n67#1:174\n67#1:175,10\n67#1:216\n*E\n"})
/* loaded from: classes6.dex */
public final class p3 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(@m80.k final q3 tipState, @m80.l Modifier modifier, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        final Modifier modifier2;
        kotlin.jvm.internal.g0.p(tipState, "tipState");
        Composer startRestartGroup = composer.startRestartGroup(414262105);
        if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(tipState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(414262105, i13, -1, "com.baicizhan.platform.base.widget.PermissionTip (Permission.kt:111)");
            }
            modifier2 = modifier3;
            j(tipState, modifier2, null, 0L, 0L, 0.0f, startRestartGroup, i13 & 126, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.n3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 i15;
                    i15 = p3.i(q3.this, modifier2, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return i15;
                }
            });
        }
    }

    public static final yz.g2 i(q3 q3Var, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        h(q3Var, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0091  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final com.baicizhan.platform.base.widget.q3 r21, androidx.compose.ui.Modifier r22, androidx.compose.ui.graphics.Shape r23, long r24, long r26, float r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.p3.j(com.baicizhan.platform.base.widget.q3, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int k(int i11) {
        return -i11;
    }

    public static final int l(int i11) {
        return -i11;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 m(Modifier modifier, Shape shape, long j11, long j12, float f11, final q3 q3Var, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168822900, i11, -1, "com.baicizhan.platform.base.widget.PermissionTipHost.<anonymous> (Permission.kt:53)");
        }
        float f12 = 16;
        SurfaceKt.m1784SurfaceFjzlyU(modifier.then(SizeKt.fillMaxWidth$default(PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(8), Dp.m5115constructorimpl(f12), 0.0f, 8, null), 0.0f, 1, null)), shape, j11, j12, null, f11, ComposableLambdaKt.rememberComposableLambda(950174664, true, new x00.p() { // from class: com.baicizhan.platform.base.widget.o3
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 n11;
                n11 = p3.n(q3.this, (Composer) obj, ((Integer) obj2).intValue());
                return n11;
            }
        }, composer, 54), composer, 1572864, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 n(final q3 q3Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950174664, i11, -1, "com.baicizhan.platform.base.widget.PermissionTipHost.<anonymous>.<anonymous> (Permission.kt:64)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer, ContentAlpha.$stable))), ComposableLambdaKt.rememberComposableLambda(1948002056, true, new x00.p() { // from class: com.baicizhan.platform.base.widget.m3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 o11;
                    o11 = p3.o(q3.this, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
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
    public static final yz.g2 o(q3 q3Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1948002056, i11, -1, "com.baicizhan.platform.base.widget.PermissionTipHost.<anonymous>.<anonymous>.<anonymous> (Permission.kt:65)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(16));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_permission_tip_title, composer, 6), "permission_tip", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            String title = q3Var.b().getTitle();
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            TextKt.m1845Text4IGK_g(title, m730paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme.getTypography(composer, i12).getH6(), composer, 48, 0, 65532);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(4)), composer, 6);
            TextKt.m1845Text4IGK_g(q3Var.b().getMessage(), (Modifier) null, bk.b.A(materialTheme.getColors(composer, i12)), bk.d.m(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 6, 130034);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 p(q3 q3Var, Modifier modifier, Shape shape, long j11, long j12, float f11, int i11, int i12, Composer composer, int i13) {
        j(q3Var, modifier, shape, j11, j12, f11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @Composable
    @m80.k
    public static final q3 q(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93033254, i11, -1, "com.baicizhan.platform.base.widget.rememberPermissionTipState (Permission.kt:35)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new q3();
            composer.updateRememberedValue(rememberedValue);
        }
        q3 q3Var = (q3) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return q3Var;
    }
}
