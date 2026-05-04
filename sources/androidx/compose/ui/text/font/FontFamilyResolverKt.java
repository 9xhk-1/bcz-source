package androidx.compose.ui.text.font;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FontFamilyResolverKt {

    @k
    private static final TypefaceRequestCache GlobalTypefaceRequestCache = new TypefaceRequestCache();

    @k
    private static final AsyncTypefaceCache GlobalAsyncTypefaceCache = new AsyncTypefaceCache();

    @k
    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }

    @k
    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }
}
