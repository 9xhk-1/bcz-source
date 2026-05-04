package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n101#2,10:124\n101#2,10:134\n114#3,8:144\n80#4:152\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n109#1:124,10\n110#1:134,10\n118#1:144,8\n121#1:152\n*E\n"})
/* loaded from: classes2.dex */
public final class TextRangeKt {
    public static final long TextRange(int i11, int i12) {
        return TextRange.m4548constructorimpl(packWithCheck(i11, i12));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m4565coerceIn8ffj60Q(long j11, int i11, int i12) {
        int m4559getStartimpl = TextRange.m4559getStartimpl(j11);
        if (m4559getStartimpl < i11) {
            m4559getStartimpl = i11;
        }
        if (m4559getStartimpl > i12) {
            m4559getStartimpl = i12;
        }
        int m4554getEndimpl = TextRange.m4554getEndimpl(j11);
        if (m4554getEndimpl >= i11) {
            i11 = m4554getEndimpl;
        }
        if (i11 <= i12) {
            i12 = i11;
        }
        return (m4559getStartimpl == TextRange.m4559getStartimpl(j11) && i12 == TextRange.m4554getEndimpl(j11)) ? j11 : TextRange(m4559getStartimpl, i12);
    }

    private static final long packWithCheck(int i11, int i12) {
        if (!(i11 >= 0 && i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i11 + ", end: " + i12 + l50.b.f69930l);
        }
        return (i12 & 4294967295L) | (i11 << 32);
    }

    @k
    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m4566substringFDrldGo(@k CharSequence charSequence, long j11) {
        return charSequence.subSequence(TextRange.m4557getMinimpl(j11), TextRange.m4556getMaximpl(j11)).toString();
    }

    public static final long TextRange(int i11) {
        return TextRange(i11, i11);
    }
}
