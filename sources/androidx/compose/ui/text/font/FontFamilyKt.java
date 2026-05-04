package androidx.compose.ui.text.font;

import a00.q;
import androidx.compose.runtime.Stable;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FontFamilyKt {
    @Stable
    @k
    public static final FontFamily FontFamily(@k List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    @Stable
    @k
    public static final FontFamily FontFamily(@k Font... fontArr) {
        return new FontListFontFamily(q.t(fontArr));
    }

    @Stable
    @k
    public static final FontFamily FontFamily(@k Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
