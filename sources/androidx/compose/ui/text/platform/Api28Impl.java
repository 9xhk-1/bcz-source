package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.RequiresApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
final class Api28Impl {

    @k
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    @k
    public final TypefaceSpan createTypefaceSpan(@k Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
