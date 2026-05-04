package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.DeprecationLevel;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FontKt {
    @ExperimentalTextApi
    @k
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m4646FontF3nL8kk(int i11, @k FontWeight fontWeight, int i12, int i13, @k FontVariation.Settings settings) {
        return new ResourceFont(i11, fontWeight, i12, settings, i13, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m4647FontF3nL8kk$default(int i11, FontWeight fontWeight, int i12, int i13, FontVariation.Settings settings, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i14 & 4) != 0) {
            i12 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i14 & 8) != 0) {
            i13 = FontLoadingStrategy.Companion.m4662getBlockingPKNRLFQ();
        }
        if ((i14 & 16) != 0) {
            settings = FontVariation.INSTANCE.m4692Settings6EWAqTQ(fontWeight, i12, new FontVariation.Setting[0]);
        }
        return m4646FontF3nL8kk(i11, fontWeight, i12, i13, settings);
    }

    @Stable
    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @w0(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m4648FontRetOiIg(int i11, FontWeight fontWeight, int i12) {
        return new ResourceFont(i11, fontWeight, i12, null, FontLoadingStrategy.Companion.m4662getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m4649FontRetOiIg$default(int i11, FontWeight fontWeight, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i13 & 4) != 0) {
            i12 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        return m4648FontRetOiIg(i11, fontWeight, i12);
    }

    @Stable
    @k
    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m4650FontYpTlLL0(int i11, @k FontWeight fontWeight, int i12, int i13) {
        return new ResourceFont(i11, fontWeight, i12, new FontVariation.Settings(new FontVariation.Setting[0]), i13, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m4651FontYpTlLL0$default(int i11, FontWeight fontWeight, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i14 & 4) != 0) {
            i12 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i14 & 8) != 0) {
            i13 = FontLoadingStrategy.Companion.m4662getBlockingPKNRLFQ();
        }
        return m4650FontYpTlLL0(i11, fontWeight, i12, i13);
    }

    @Stable
    @k
    public static final FontFamily toFontFamily(@k Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
