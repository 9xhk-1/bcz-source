package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Input.kt\ncom/baicizhan/platform/base/widget/InputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,210:1\n1247#2,6:211\n1247#2,6:217\n1247#2,6:223\n1247#2,6:314\n70#3:229\n67#3,9:230\n77#3:312\n79#4,6:239\n86#4,3:254\n89#4,2:263\n79#4,6:276\n86#4,3:291\n89#4,2:300\n93#4:307\n93#4:311\n347#5,9:245\n356#5:265\n347#5,9:282\n356#5:302\n357#5,2:305\n357#5,2:309\n4206#6,6:257\n4206#6,6:294\n99#7:266\n96#7,9:267\n106#7:308\n113#8:303\n113#8:304\n113#8:313\n113#8:320\n85#9:321\n*S KotlinDebug\n*F\n+ 1 Input.kt\ncom/baicizhan/platform/base/widget/InputKt\n*L\n66#1:211,6\n70#1:217,6\n104#1:223,6\n77#1:314,6\n109#1:229\n109#1:230,9\n109#1:312\n109#1:239,6\n109#1:254,3\n109#1:263,2\n118#1:276,6\n118#1:291,3\n118#1:300,2\n118#1:307\n109#1:311\n109#1:245,9\n109#1:265\n118#1:282,9\n118#1:302\n118#1:305,2\n109#1:309,2\n109#1:257,6\n118#1:294,6\n118#1:266\n118#1:267,9\n118#1:308\n129#1:303\n141#1:304\n46#1:313\n79#1:320\n105#1:321\n*E\n"})
/* loaded from: classes6.dex */
public final class x2 {
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(@m80.k final java.lang.String r33, @m80.k final x00.l<? super java.lang.String, yz.g2> r34, @m80.l androidx.compose.ui.Modifier r35, @m80.l java.lang.String r36, @m80.l androidx.compose.ui.graphics.painter.Painter r37, @m80.l androidx.compose.ui.text.input.VisualTransformation r38, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r39, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x2.j(java.lang.String, x00.l, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.text.input.VisualTransformation, x00.p, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean k(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final yz.g2 l(String str, RowScope rowScope, String str2, x00.p it, Composer composer, int i11) {
        int i12;
        int i13;
        Composer composer2 = composer;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer2.changedInstance(it) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer2.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(505567552, i12, -1, "com.baicizhan.platform.base.widget.BasicMagicInput.<anonymous>.<anonymous>.<anonymous> (Input.kt:147)");
            }
            if (str.length() == 0) {
                composer2.startReplaceGroup(-1087254086);
                i13 = i12;
                TextKt.m1845Text4IGK_g(str2, rowScope.align(Modifier.Companion, Alignment.Companion.getCenterVertically()), bk.b.G(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable)), bk.d.m(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3072, 3120, 120816);
                composer2 = composer2;
            } else {
                i13 = i12;
                composer2.startReplaceGroup(-1092128030);
            }
            composer2.endReplaceGroup();
            it.invoke(composer2, Integer.valueOf(i13 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 m(String str, x00.l lVar, Modifier modifier, String str2, Painter painter, VisualTransformation visualTransformation, x00.p pVar, x00.p pVar2, int i11, int i12, Composer composer, int i13) {
        j(str, lVar, modifier, str2, painter, visualTransformation, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void n(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-797347351);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-797347351, i11, -1, "com.baicizhan.platform.base.widget.InputPreviews (Input.kt:173)");
            }
            bk.k.e(null, null, null, h1.f28308a.q(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.u2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 o11;
                    o11 = x2.o(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            });
        }
    }

    public static final yz.g2 o(int i11, Composer composer, int i12) {
        n(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(@m80.l androidx.compose.ui.Modifier r18, @m80.l java.lang.String r19, @m80.l java.lang.String r20, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r21, @m80.l androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x2.p(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 q(String str, x00.l lVar, String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (!kotlin.jvm.internal.g0.g(str, it)) {
            lVar.invoke(it);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r(final x00.l lVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782307307, i11, -1, "com.baicizhan.platform.base.widget.MagicInput.<anonymous> (Input.kt:76)");
            }
            boolean changed = composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.platform.base.widget.r2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 s11;
                        s11 = x2.s(x00.l.this);
                        return s11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            IconButtonKt.IconButton((x00.a) rememberedValue, PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, Dp.m5115constructorimpl(4), 0.0f, 2, null), false, null, h1.f28308a.w(), composer, 24624, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(x00.l lVar) {
        lVar.invoke("");
        return yz.g2.f100423a;
    }

    public static final yz.g2 t(Modifier modifier, String str, String str2, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        p(modifier, str, str2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(@m80.l androidx.compose.ui.Modifier r16, @m80.l java.lang.String r17, @m80.l java.lang.String r18, @m80.k final java.lang.String r19, boolean r20, @m80.k final x00.a<yz.g2> r21, @m80.l androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x2.u(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 v(x00.a aVar, String str, boolean z11, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-252087614, i11, -1, "com.baicizhan.platform.base.widget.MagicInputAction.<anonymous> (Input.kt:41)");
            }
            long sp2 = TextUnitKt.getSp(12);
            Modifier m775sizeVpY3zN4 = SizeKt.m775sizeVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(76), Dp.m5115constructorimpl(32));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            r.C(m775sizeVpY3zN4, aVar, str, sp2, null, 0, z11, false, materialTheme.getShapes(composer, i12).getSmall(), bk.f.a(materialTheme.getColors(composer, i12).m1602getSecondary0d7_KjU(), materialTheme.getColors(composer, i12).m1603getSecondaryVariant0d7_KjU(), bk.b.D0(materialTheme.getColors(composer, i12)), 0L, composer, 0, 8), r.L(), composer, 3078, 6, 176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(Modifier modifier, String str, String str2, String str3, boolean z11, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        u(modifier, str, str2, str3, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
