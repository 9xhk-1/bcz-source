package androidx.compose.ui.text.android;

import android.text.Spanned;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SpannedExtensions_androidKt {
    public static final boolean hasSpan(@m80.k Spanned spanned, @m80.k Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(@m80.k Spanned spanned, @m80.k Class<?> cls, int i11, int i12) {
        return spanned.nextSpanTransition(i11 - 1, i12, cls) != i12;
    }
}
