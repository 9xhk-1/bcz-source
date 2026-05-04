package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@yz.n(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @yz.w0(expression = "PlatformFontLoader", imports = {}))
/* loaded from: classes2.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;

    @m80.k
    private final Context context;

    public AndroidFontResourceLoader(@m80.k Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @yz.n(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @yz.w0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @m80.k
    public Typeface load(@m80.k Font font) {
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
        }
        Typeface font2 = ResourcesCompat.getFont(this.context, ((ResourceFont) font).getResId());
        kotlin.jvm.internal.g0.m(font2);
        return font2;
    }
}
