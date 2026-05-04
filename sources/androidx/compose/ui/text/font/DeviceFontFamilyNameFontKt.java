package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "DeviceFontFamilyNameFontKt")
/* loaded from: classes2.dex */
public final class DeviceFontFamilyNameFontKt {
    @k
    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final Font m4640Fontvxs03AY(@k String str, @k FontWeight fontWeight, int i11, @k FontVariation.Settings settings) {
        return new DeviceFontFamilyNameFont(str, fontWeight, i11, settings, null);
    }

    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ Font m4641Fontvxs03AY$default(String str, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = FontStyle.Companion.m4677getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            settings = new FontVariation.Settings(new FontVariation.Setting[0]);
        }
        return m4640Fontvxs03AY(str, fontWeight, i11, settings);
    }
}
