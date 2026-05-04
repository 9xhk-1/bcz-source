package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {

    @k
    private final String familyName;
    private final int style;

    @k
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i11, FontVariation.Settings settings, v vVar) {
        this(str, fontWeight, i11, settings);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        return DeviceFontFamilyName.m4636equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && g0.g(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m4670equalsimpl0(mo4623getStyle_LCdwA(), deviceFontFamilyNameFont.mo4623getStyle_LCdwA()) && g0.g(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo4623getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    @k
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m4637hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m4671hashCodeimpl(mo4623getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    @l
    public final android.graphics.Typeface loadCached(@k Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo4699optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo4623getStyle_LCdwA(), getVariationSettings(), context);
    }

    @k
    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m4638toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4672toStringimpl(mo4623getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i11, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m4663getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i11;
    }
}
