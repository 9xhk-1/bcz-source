package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;

    @l
    private final PlatformParagraphStyle paragraphStyle;

    @l
    private final PlatformSpanStyle spanStyle;

    public /* synthetic */ PlatformTextStyle(int i11, v vVar) {
        this(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return g0.g(this.paragraphStyle, platformTextStyle.paragraphStyle) && g0.g(this.spanStyle, platformTextStyle.spanStyle);
    }

    @l
    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @l
    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int hashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public PlatformTextStyle(@l PlatformSpanStyle platformSpanStyle, @l PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public /* synthetic */ PlatformTextStyle(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public PlatformTextStyle(boolean z11) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z11));
    }

    private PlatformTextStyle(int i11) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i11, (v) null));
    }
}
