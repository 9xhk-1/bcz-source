package androidx.compose.foundation.text;

import a00.h0;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,440:1\n30#2:441\n80#3:442\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegateKt\n*L\n91#1:441\n91#1:442\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;

    @k
    private static final String EmptyTextReplacement = f0.v2("H", 10);

    public static final long computeSizeForDefaultText(@k TextStyle textStyle, @k Density density, @k FontFamily.Resolver resolver, @k String str, int i11) {
        Paragraph m4428ParagraphUl8oQg4;
        m4428ParagraphUl8oQg4 = ParagraphKt.m4428ParagraphUl8oQg4(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, (r22 & 32) != 0 ? h0.J() : h0.J(), (r22 & 64) != 0 ? h0.J() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : i11, (r22 & 256) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : TextOverflow.Companion.m5028getClipgIe3tQ8());
        return IntSize.m5281constructorimpl((TextDelegateKt.ceilToIntPx(m4428ParagraphUl8oQg4.getMinIntrinsicWidth()) << 32) | (TextDelegateKt.ceilToIntPx(m4428ParagraphUl8oQg4.getHeight()) & 4294967295L));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i12 & 16) != 0) {
            i11 = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i11);
    }

    @k
    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }
}
