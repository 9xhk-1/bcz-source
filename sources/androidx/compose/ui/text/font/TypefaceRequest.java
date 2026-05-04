package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TypefaceRequest {
    public static final int $stable = 8;

    @l
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;

    @k
    private final FontWeight fontWeight;

    @l
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i11, int i12, Object obj, v vVar) {
        this(fontFamily, fontWeight, i11, i12, obj);
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m4711copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i11, int i12, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i13 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i13 & 4) != 0) {
            i11 = typefaceRequest.fontStyle;
        }
        if ((i13 & 8) != 0) {
            i12 = typefaceRequest.fontSynthesis;
        }
        if ((i13 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i14 = i11;
        return typefaceRequest.m4714copye1PVR60(fontFamily, fontWeight, i14, i12, obj3);
    }

    @l
    public final FontFamily component1() {
        return this.fontFamily;
    }

    @k
    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m4712component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m4713component4GVVA2EU() {
        return this.fontSynthesis;
    }

    @l
    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    @k
    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m4714copye1PVR60(@l FontFamily fontFamily, @k FontWeight fontWeight, int i11, int i12, @l Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i11, i12, obj, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return g0.g(this.fontFamily, typefaceRequest.fontFamily) && g0.g(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m4670equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m4681equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && g0.g(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    @l
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m4715getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m4716getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    @k
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @l
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int hashCode = (((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m4671hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m4682hashCodeimpl(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @k
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m4672toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m4685toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i11, int i12, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i11;
        this.fontSynthesis = i12;
        this.resourceLoaderCacheKey = obj;
    }
}
