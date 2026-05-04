package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable = 0;

    @k
    private final Typeface typeface;

    public LoadedFontFamily(@k Typeface typeface) {
        super(true, null);
        this.typeface = typeface;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadedFontFamily) && g0.g(this.typeface, ((LoadedFontFamily) obj).typeface);
    }

    @k
    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    @k
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
