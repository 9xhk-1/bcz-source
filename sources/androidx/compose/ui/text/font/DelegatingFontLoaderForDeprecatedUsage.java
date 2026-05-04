package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    public static final int $stable = 8;

    @k
    private final Object cacheKey = new Object();

    @k
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(@k Font.ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object awaitLoad(@k Font font, @k j00.c<Object> cVar) {
        return this.loader.load(font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @k
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @k
    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @k
    public Object loadBlocking(@k Font font) {
        return this.loader.load(font);
    }
}
