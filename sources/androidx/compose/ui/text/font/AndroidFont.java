package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;

    @k
    private final TypefaceLoader typefaceLoader;

    @k
    private final FontVariation.Settings variationSettings;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface TypefaceLoader {
        @l
        Object awaitLoad(@k Context context, @k AndroidFont androidFont, @k j00.c<? super android.graphics.Typeface> cVar);

        @l
        android.graphics.Typeface loadBlocking(@k Context context, @k AndroidFont androidFont);
    }

    public /* synthetic */ AndroidFont(int i11, TypefaceLoader typefaceLoader, FontVariation.Settings settings, v vVar) {
        this(i11, typefaceLoader, settings);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo4615getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    @k
    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    @k
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @n(message = "Replaced with fontVariation constructor", replaceWith = @w0(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ AndroidFont(int i11, TypefaceLoader typefaceLoader, v vVar) {
        this(i11, typefaceLoader);
    }

    private AndroidFont(int i11, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i11;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    private AndroidFont(int i11, TypefaceLoader typefaceLoader) {
        this(i11, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }
}
