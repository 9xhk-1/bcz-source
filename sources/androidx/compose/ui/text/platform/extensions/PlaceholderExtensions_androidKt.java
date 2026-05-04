package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n34#2,6:94\n13309#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m4829getSpanUnitR2X_6o(long j11) {
        long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m4831getSpanVerticalAligndo9XGg(int i11) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4470getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4476getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4471getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4472getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4475getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4473getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m4466equalsimpl0(i11, companion.m4474getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i11, int i12, Density density) {
        for (Object obj : spannable.getSpans(i11, i12, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m5309getValueimpl(placeholder.m4462getWidthXSAIIZE()), m4829getSpanUnitR2X_6o(placeholder.m4462getWidthXSAIIZE()), TextUnit.m5309getValueimpl(placeholder.m4460getHeightXSAIIZE()), m4829getSpanUnitR2X_6o(placeholder.m4460getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m4831getSpanVerticalAligndo9XGg(placeholder.m4461getPlaceholderVerticalAlignJ6kI3mc())), i11, i12);
    }

    public static final void setPlaceholders(@k Spannable spannable, @k List<AnnotatedString.Range<Placeholder>> list, @k Density density) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<Placeholder> range = list.get(i11);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m4830getSpanUnitR2X_6o$annotations(long j11) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m4832getSpanVerticalAligndo9XGg$annotations(int i11) {
    }
}
