package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.SieveCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Duplicate cache")
@u0({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n1#1,174:1\n1#2:175\n251#3,2:176\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n*L\n142#1:176,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidTypefaceCache {

    @k
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();

    @k
    private static final SieveCache<String, Typeface> cache = new SieveCache<>(16, 16, null, null, null, 28, null);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    private final String getKey(Context context, Font font) {
        if (!(font instanceof ResourceFont)) {
            if (font instanceof AndroidPreloadedFont) {
                return ((AndroidPreloadedFont) font).getCacheKey();
            }
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("res:");
        CharSequence charSequence = typedValue.string;
        String obj = charSequence != null ? charSequence.toString() : null;
        g0.m(obj);
        sb2.append(obj);
        return sb2.toString();
    }

    @k
    public final Typeface getOrCreate(@k Context context, @k Font font) {
        Typeface loadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                loadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
            } else {
                loadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                g0.m(loadBlocking);
            }
        } else {
            if (!(font instanceof AndroidFont)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            AndroidFont androidFont = (AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (loadBlocking != null) {
            if (key != null) {
                cache.put(key, loadBlocking);
            }
            return loadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
