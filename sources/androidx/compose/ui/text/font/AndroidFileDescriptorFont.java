package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class AndroidFileDescriptorFont extends AndroidPreloadedFont {
    public static final int $stable = 0;

    @l
    private final String cacheKey;

    @k
    private final ParcelFileDescriptor fileDescriptor;

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i11, FontVariation.Settings settings, v vVar) {
        this(parcelFileDescriptor, fontWeight, i11, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @l
    public android.graphics.Typeface doLoad$ui_text_release(@l Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFileDescriptor(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @l
    public String getCacheKey() {
        return this.cacheKey;
    }

    @k
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @k
    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4672toStringimpl(mo4623getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, v vVar) {
        this(parcelFileDescriptor, (i12 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i12 & 4) != 0 ? FontStyle.Companion.m4677getNormal_LCdwA() : i11, settings, null);
    }

    private AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i11, FontVariation.Settings settings) {
        super(fontWeight, i11, settings, null);
        this.fileDescriptor = parcelFileDescriptor;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
