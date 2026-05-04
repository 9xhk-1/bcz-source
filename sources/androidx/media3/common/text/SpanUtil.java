package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f11, int i11, int i12, int i13) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i11, i12, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i11 && spannable.getSpanEnd(relativeSizeSpan) >= i12) {
                f11 *= relativeSizeSpan.getSizeChange();
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i11, i12, i13);
        }
        spannable.setSpan(new RelativeSizeSpan(f11), i11, i12, i13);
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i11, int i12, int i13) {
        for (Object obj2 : spannable.getSpans(i11, i12, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i11, i12, i13);
        }
        spannable.setSpan(obj, i11, i12, i13);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj, int i11, int i12, int i13) {
        if (spannable.getSpanStart(obj) == i11 && spannable.getSpanEnd(obj) == i12 && spannable.getSpanFlags(obj) == i13) {
            spannable.removeSpan(obj);
        }
    }
}
