package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SpannableStringKt {
    public static final void clearSpans(@m80.k Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(@m80.k Spannable spannable, int i11, int i12, @m80.k Object obj) {
        spannable.setSpan(obj, i11, i12, 17);
    }

    @m80.k
    public static final Spannable toSpannable(@m80.k CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(@m80.k Spannable spannable, @m80.k g10.l lVar, @m80.k Object obj) {
        spannable.setSpan(obj, lVar.getStart().intValue(), lVar.getEndInclusive().intValue(), 17);
    }
}
