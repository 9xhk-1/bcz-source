package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextLinkStyles {
    public static final int $stable = 0;

    @l
    private final SpanStyle focusedStyle;

    @l
    private final SpanStyle hoveredStyle;

    @l
    private final SpanStyle pressedStyle;

    @l
    private final SpanStyle style;

    public TextLinkStyles() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return g0.g(this.style, textLinkStyles.style) && g0.g(this.focusedStyle, textLinkStyles.focusedStyle) && g0.g(this.hoveredStyle, textLinkStyles.hoveredStyle) && g0.g(this.pressedStyle, textLinkStyles.pressedStyle);
    }

    @l
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    @l
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    @l
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    @l
    public final SpanStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        SpanStyle spanStyle = this.style;
        int hashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.focusedStyle;
        int hashCode2 = (hashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.hoveredStyle;
        int hashCode3 = (hashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.pressedStyle;
        return hashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }

    public TextLinkStyles(@l SpanStyle spanStyle, @l SpanStyle spanStyle2, @l SpanStyle spanStyle3, @l SpanStyle spanStyle4) {
        this.style = spanStyle;
        this.focusedStyle = spanStyle2;
        this.hoveredStyle = spanStyle3;
        this.pressedStyle = spanStyle4;
    }

    public /* synthetic */ TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : spanStyle, (i11 & 2) != 0 ? null : spanStyle2, (i11 & 4) != 0 ? null : spanStyle3, (i11 & 8) != 0 ? null : spanStyle4);
    }
}
