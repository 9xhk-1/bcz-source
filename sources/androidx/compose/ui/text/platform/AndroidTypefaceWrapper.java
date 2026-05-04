package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    public static final int $stable = 8;

    @l
    private final FontFamily fontFamily;

    @k
    private final Typeface typeface;

    public AndroidTypefaceWrapper(@k Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @l
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @k
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4810getNativeTypefacePYhJU0U(@k FontWeight fontWeight, int i11, int i12) {
        return this.typeface;
    }

    @k
    public final Typeface getTypeface() {
        return this.typeface;
    }
}
