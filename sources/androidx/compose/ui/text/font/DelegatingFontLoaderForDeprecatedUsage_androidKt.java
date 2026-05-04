package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @n(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @w0(expression = "createFontFamilyResolver()", imports = {}))
    @k
    public static final FontFamily.Resolver createFontFamilyResolver(@k Font.ResourceLoader resourceLoader, @k Context context) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    @n(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @w0(expression = "createFontFamilyResolver()", imports = {}))
    @k
    public static final FontFamily.Resolver createFontFamilyResolver(@k Font.ResourceLoader resourceLoader) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
