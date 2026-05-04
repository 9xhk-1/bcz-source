package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    public static final int $stable = 8;

    @k
    private final Object cacheKey = new Object();

    @k
    private final Context context;

    @k
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(@k Font.ResourceLoader resourceLoader, @k Context context) {
        this.loader = resourceLoader;
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object awaitLoad(@k Font font, @k j00.c<Object> cVar) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, cVar);
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
    @l
    public Object loadBlocking(@k Font font) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }
}
