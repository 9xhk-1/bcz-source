package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "AndroidFontKt")
/* loaded from: classes2.dex */
public final class AndroidFontKt {
    @Stable
    @k
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m4617FontEj4NQ78(@k File file, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i11, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m4619FontEj4NQ78$default(File file, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            settings = FontVariation.INSTANCE.m4692Settings6EWAqTQ(fontWeight, i11, new FontVariation.Setting[0]);
        }
        return m4617FontEj4NQ78(file, fontWeight, i11, settings);
    }

    @Stable
    @k
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m4620FontMuC2MFs(@k String str, @k AssetManager assetManager, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i11, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m4621FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 8) != 0) {
            i11 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i12 & 16) != 0) {
            settings = FontVariation.INSTANCE.m4692Settings6EWAqTQ(fontWeight, i11, new FontVariation.Setting[0]);
        }
        return m4620FontMuC2MFs(str, assetManager, fontWeight, i11, settings);
    }

    @Stable
    @RequiresApi(26)
    @k
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m4616FontEj4NQ78(@k ParcelFileDescriptor parcelFileDescriptor, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i11, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m4618FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            settings = FontVariation.INSTANCE.m4692Settings6EWAqTQ(fontWeight, i11, new FontVariation.Setting[0]);
        }
        return m4616FontEj4NQ78(parcelFileDescriptor, fontWeight, i11, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }
}
