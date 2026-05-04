package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public static final int $stable = 0;
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i11) {
        this.fontWeightAdjustment = i11;
    }

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i11);
    }

    @k
    public final AndroidFontResolveInterceptor copy(int i11) {
        return new AndroidFontResolveInterceptor(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    @k
    public FontWeight interceptFontWeight(@k FontWeight fontWeight) {
        int i11 = this.fontWeightAdjustment;
        return (i11 == 0 || i11 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(u.I(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000));
    }

    @k
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }
}
