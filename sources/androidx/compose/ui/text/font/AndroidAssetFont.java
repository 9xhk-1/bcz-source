package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public static final int $stable = 0;

    @k
    private final AssetManager assetManager;

    @k
    private final String cacheKey;

    @k
    private final String path;

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i11, FontVariation.Settings settings, v vVar) {
        this(assetManager, str, fontWeight, i11, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @l
    public android.graphics.Typeface doLoad$ui_text_release(@l Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings()) : android.graphics.Typeface.createFromAsset(this.assetManager, this.path);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        return g0.g(this.path, androidAssetFont.path) && g0.g(getVariationSettings(), androidAssetFont.getVariationSettings());
    }

    @k
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @k
    public String getCacheKey() {
        return this.cacheKey;
    }

    @k
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    @k
    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4672toStringimpl(mo4623getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, v vVar) {
        this(assetManager, str, (i12 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i12 & 8) != 0 ? FontStyle.Companion.m4677getNormal_LCdwA() : i11, settings, null);
    }

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i11, FontVariation.Settings settings) {
        super(fontWeight, i11, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.cacheKey = "asset:" + str;
    }
}
