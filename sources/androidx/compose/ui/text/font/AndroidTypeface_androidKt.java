package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidTypeface_androidKt {
    @k
    public static final FontFamily FontFamily(@k android.graphics.Typeface typeface) {
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }

    @n(level = DeprecationLevel.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @w0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @k
    public static final Typeface Typeface(@k Context context, @k FontFamily fontFamily, @l List<Pair<FontWeight, FontStyle>> list) {
        if (fontFamily instanceof FontListFontFamily) {
            return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Typeface Typeface$default(Context context, FontFamily fontFamily, List list, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    @k
    public static final Typeface Typeface(@k android.graphics.Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }
}
