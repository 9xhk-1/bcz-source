package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,426:1\n87#2:427\n84#2,9:428\n94#2:467\n79#3,6:437\n86#3,3:452\n89#3,2:461\n93#3:466\n79#3,6:480\n86#3,3:495\n89#3,2:504\n79#3,6:517\n86#3,3:532\n89#3,2:541\n93#3:546\n93#3:550\n347#4,9:443\n356#4,3:463\n347#4,9:486\n356#4:506\n347#4,9:523\n356#4,3:543\n357#4,2:548\n4206#5,6:455\n4206#5,6:498\n4206#5,6:535\n1247#6,6:468\n1247#6,6:554\n99#7,6:474\n106#7:551\n70#8:507\n67#8,9:508\n77#8:547\n75#9:552\n75#9:553\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n*L\n149#1:427\n149#1:428,9\n149#1:467\n149#1:437,6\n149#1:452,3\n149#1:461,2\n149#1:466\n187#1:480,6\n187#1:495,3\n187#1:504,2\n210#1:517,6\n210#1:532,3\n210#1:541,2\n210#1:546\n187#1:550\n149#1:443,9\n149#1:463,3\n187#1:486,9\n187#1:506\n210#1:523,9\n210#1:543,3\n187#1:548,2\n149#1:455,6\n187#1:498,6\n210#1:535,6\n195#1:468,6\n366#1:554,6\n187#1:474,6\n187#1:551\n210#1:507\n210#1:508,9\n210#1:547\n365#1:552\n366#1:553\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {

    @k
    private static final ContextMenuColors DefaultContextMenuColors;

    @k
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (v) null);
    private static final float DisabledAlpha = 0.38f;

    static {
        Color.Companion companion = Color.Companion;
        DefaultContextMenuColors = new ContextMenuColors(companion.m2546getWhite0d7_KjU(), companion.m2535getBlack0d7_KjU(), companion.m2535getBlack0d7_KjU(), Color.m2508copywmQWz5c$default(companion.m2535getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m2508copywmQWz5c$default(companion.m2535getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.annotation.VisibleForTesting
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuColumn(@m80.k androidx.compose.foundation.contextmenu.ContextMenuColors r28, @m80.l androidx.compose.ui.Modifier r29, @m80.k final x00.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a2  */
    @android.annotation.SuppressLint({"ComposableLambdaParameterPosition"})
    @androidx.annotation.VisibleForTesting
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuItem(@m80.k final java.lang.String r23, final boolean r24, @m80.k final androidx.compose.foundation.contextmenu.ContextMenuColors r25, @m80.l androidx.compose.ui.Modifier r26, @m80.l x00.q<? super androidx.compose.ui.graphics.Color, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, @m80.k final x00.a<yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuItem(java.lang.String, boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, x00.q, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ContextMenuPopup(@k PopupPositionProvider popupPositionProvider, @k a<g2> aVar, @l Modifier modifier, @k x00.l<? super ContextMenuScope, g2> lVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        a<g2> aVar2;
        final x00.l<? super ContextMenuScope, g2> lVar2;
        final PopupPositionProvider popupPositionProvider2;
        final Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(712057293);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
            }
            aVar2 = aVar;
            ContextMenuPopup(popupPositionProvider, aVar2, modifier3, computeContextMenuColors(0, 0, startRestartGroup, 0, 3), lVar, startRestartGroup, (i13 & 1022) | ((i13 << 3) & 57344), 0);
            popupPositionProvider2 = popupPositionProvider;
            lVar2 = lVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            aVar2 = aVar;
            lVar2 = lVar;
            popupPositionProvider2 = popupPositionProvider;
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final a<g2> aVar3 = aVar2;
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i15) {
                    ContextMenuUi_androidKt.ContextMenuPopup(PopupPositionProvider.this, aVar3, modifier2, lVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    @Composable
    @VisibleForTesting
    @k
    public static final ContextMenuColors computeContextMenuColors(@StyleRes int i11, @StyleRes int i12, @l Composer composer, int i13, int i14) {
        int i15 = (i14 & 1) != 0 ? R.style.Widget.PopupMenu : i11;
        int i16 = (i14 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i13, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean changed = composer.changed((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | composer.changed(context);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            ContextMenuColors contextMenuColors = DefaultContextMenuColors;
            long m363resolveColorg2O1Hgs = m363resolveColorg2O1Hgs(context, i15, R.attr.colorBackground, contextMenuColors.m340getBackgroundColor0d7_KjU());
            ColorStateList resolveColorStateList = resolveColorStateList(context, i16, R.attr.textColorPrimary);
            long m362enabledColor4WTKRHQ = m362enabledColor4WTKRHQ(resolveColorStateList, contextMenuColors.m344getTextColor0d7_KjU());
            long m361disabledColor4WTKRHQ = m361disabledColor4WTKRHQ(resolveColorStateList, contextMenuColors.m342getDisabledTextColor0d7_KjU());
            Object contextMenuColors2 = new ContextMenuColors(m363resolveColorg2O1Hgs, m362enabledColor4WTKRHQ, m362enabledColor4WTKRHQ, m361disabledColor4WTKRHQ, m361disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(contextMenuColors2);
            rememberedValue = contextMenuColors2;
        }
        ContextMenuColors contextMenuColors3 = (ContextMenuColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColors3;
    }

    /* renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m361disabledColor4WTKRHQ(ColorStateList colorStateList, long j11) {
        int m2563toArgb8_81llA = ColorKt.m2563toArgb8_81llA(j11);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, m2563toArgb8_81llA)) : null;
        return (valueOf == null || valueOf.intValue() == m2563toArgb8_81llA) ? j11 : ColorKt.Color(valueOf.intValue());
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m362enabledColor4WTKRHQ(ColorStateList colorStateList, long j11) {
        int m2563toArgb8_81llA = ColorKt.m2563toArgb8_81llA(j11);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, m2563toArgb8_81llA)) : null;
        return (valueOf == null || valueOf.intValue() == m2563toArgb8_81llA) ? j11 : ColorKt.Color(valueOf.intValue());
    }

    @k
    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m363resolveColorg2O1Hgs(Context context, @StyleRes int i11, @AttrRes int i12, long j11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{i12});
        int m2563toArgb8_81llA = ColorKt.m2563toArgb8_81llA(j11);
        int color = obtainStyledAttributes.getColor(0, m2563toArgb8_81llA);
        obtainStyledAttributes.recycle();
        return color == m2563toArgb8_81llA ? j11 : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, @StyleRes int i11, @AttrRes int i12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{i12});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuPopup(@m80.k final androidx.compose.ui.window.PopupPositionProvider r14, @m80.k final x00.a<yz.g2> r15, @m80.l androidx.compose.ui.Modifier r16, @m80.k final androidx.compose.foundation.contextmenu.ContextMenuColors r17, @m80.k final x00.l<? super androidx.compose.foundation.contextmenu.ContextMenuScope, yz.g2> r18, @m80.l androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup(androidx.compose.ui.window.PopupPositionProvider, x00.a, androidx.compose.ui.Modifier, androidx.compose.foundation.contextmenu.ContextMenuColors, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }
}
