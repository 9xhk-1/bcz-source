package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutlibFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;

    @k
    private final Context context;

    public LayoutlibFontResourceLoader(@k Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @n(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @w0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @k
    public Typeface load(@k Font font) {
        if ((font instanceof ResourceFont) && Build.VERSION.SDK_INT >= 26) {
            return ResourceFontHelper.INSTANCE.load(this.context, (ResourceFont) font);
        }
        throw new IllegalArgumentException("Unknown font type: " + font.getClass().getName());
    }
}
