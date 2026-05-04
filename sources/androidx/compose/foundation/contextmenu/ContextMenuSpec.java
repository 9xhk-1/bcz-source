package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@VisibleForTesting
@u0({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuSpec\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,426:1\n113#2:427\n113#2:428\n113#2:429\n113#2:430\n113#2:431\n113#2:432\n113#2:433\n113#2:434\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuSpec\n*L\n71#1:427\n72#1:428\n73#1:429\n74#1:430\n75#1:431\n78#1:432\n79#1:433\n80#1:434\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuSpec {
    public static final int $stable = 0;

    @k
    public static final ContextMenuSpec INSTANCE = new ContextMenuSpec();
    private static final float ContainerWidthMin = Dp.m5115constructorimpl(112);
    private static final float ContainerWidthMax = Dp.m5115constructorimpl(280);
    private static final float ListItemHeight = Dp.m5115constructorimpl(48);
    private static final float MenuContainerElevation = Dp.m5115constructorimpl(3);
    private static final float CornerRadius = Dp.m5115constructorimpl(4);

    @k
    private static final Alignment.Vertical LabelVerticalTextAlignment = Alignment.Companion.getCenterVertically();
    private static final int LabelHorizontalTextAlignment = TextAlign.Companion.m4982getStarte0LSkKk();
    private static final float HorizontalPadding = Dp.m5115constructorimpl(12);
    private static final float VerticalPadding = Dp.m5115constructorimpl(8);
    private static final float IconSize = Dp.m5115constructorimpl(24);
    private static final long FontSize = TextUnitKt.getSp(14);

    @k
    private static final FontWeight FontWeight = FontWeight.Companion.getMedium();
    private static final long LineHeight = TextUnitKt.getSp(20);
    private static final long LetterSpacing = TextUnitKt.getSp(0.1f);

    private ContextMenuSpec() {
    }

    /* renamed from: getContainerWidthMax-D9Ej5fM, reason: not valid java name */
    public final float m347getContainerWidthMaxD9Ej5fM() {
        return ContainerWidthMax;
    }

    /* renamed from: getContainerWidthMin-D9Ej5fM, reason: not valid java name */
    public final float m348getContainerWidthMinD9Ej5fM() {
        return ContainerWidthMin;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m349getCornerRadiusD9Ej5fM() {
        return CornerRadius;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m350getFontSizeXSAIIZE() {
        return FontSize;
    }

    @k
    public final FontWeight getFontWeight() {
        return FontWeight;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m351getHorizontalPaddingD9Ej5fM() {
        return HorizontalPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m352getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getLabelHorizontalTextAlignment-e0LSkKk, reason: not valid java name */
    public final int m353getLabelHorizontalTextAlignmente0LSkKk() {
        return LabelHorizontalTextAlignment;
    }

    @k
    public final Alignment.Vertical getLabelVerticalTextAlignment() {
        return LabelVerticalTextAlignment;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m354getLetterSpacingXSAIIZE() {
        return LetterSpacing;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m355getLineHeightXSAIIZE() {
        return LineHeight;
    }

    /* renamed from: getListItemHeight-D9Ej5fM, reason: not valid java name */
    public final float m356getListItemHeightD9Ej5fM() {
        return ListItemHeight;
    }

    /* renamed from: getMenuContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m357getMenuContainerElevationD9Ej5fM() {
        return MenuContainerElevation;
    }

    /* renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m358getVerticalPaddingD9Ej5fM() {
        return VerticalPadding;
    }

    @k
    /* renamed from: textStyle-8_81llA, reason: not valid java name */
    public final TextStyle m359textStyle8_81llA(long j11) {
        int i11 = LabelHorizontalTextAlignment;
        return new TextStyle(j11, FontSize, FontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, LetterSpacing, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, i11, 0, LineHeight, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613240, (v) null);
    }
}
