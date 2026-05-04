package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class GenericFontFamily extends SystemFontFamily {
    public static final int $stable = 0;

    @k
    private final String fontFamilyName;

    @k
    private final String name;

    public GenericFontFamily(@k String str, @k String str2) {
        super(null);
        this.name = str;
        this.fontFamilyName = str2;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public String toString() {
        return this.fontFamilyName;
    }
}
