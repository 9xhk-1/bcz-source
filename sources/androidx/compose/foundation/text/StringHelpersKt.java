package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(@k CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(@k CharSequence charSequence, int i11) {
        while (i11 > 0) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
            i11--;
        }
        return 0;
    }

    public static final long getParagraphBoundary(@k CharSequence charSequence, int i11) {
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i11), findParagraphEnd(charSequence, i11));
    }
}
