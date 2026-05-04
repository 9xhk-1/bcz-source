package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,72:1\n75#2:73\n372#3,7:74\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n53#1:73\n66#1:74,7\n*E\n"})
/* loaded from: classes2.dex */
public final class FontResources_androidKt {

    @k
    private static final Object cacheLock = new Object();

    @GuardedBy("cacheLock")
    @k
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @k
    @Composable
    @ReadOnlyComposable
    @n(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @w0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final Typeface fontResource(@k FontFamily fontFamily, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i11, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:51)");
        }
        Typeface fontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fontResourceFromContext;
    }

    @n(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @w0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            try {
                Map<FontFamily, Typeface> map = syncLoadedTypefaces;
                Typeface typeface2 = map.get(fontFamily);
                if (typeface2 == null) {
                    typeface2 = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    map.put(fontFamily, typeface2);
                }
                typeface = typeface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typeface;
    }
}
