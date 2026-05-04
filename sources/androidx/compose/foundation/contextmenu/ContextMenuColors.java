package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@VisibleForTesting
/* loaded from: classes.dex */
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    public /* synthetic */ ContextMenuColors(long j11, long j12, long j13, long j14, long j15, v vVar) {
        this(j11, j12, j13, j14, j15);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.m2510equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m2510equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m2510equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m2510equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m2510equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m340getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m341getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m342getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m343getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m344getTextColor0d7_KjU() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((Color.m2516hashCodeimpl(this.backgroundColor) * 31) + Color.m2516hashCodeimpl(this.textColor)) * 31) + Color.m2516hashCodeimpl(this.iconColor)) * 31) + Color.m2516hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2516hashCodeimpl(this.disabledIconColor);
    }

    @k
    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) Color.m2517toStringimpl(this.backgroundColor)) + ", textColor=" + ((Object) Color.m2517toStringimpl(this.textColor)) + ", iconColor=" + ((Object) Color.m2517toStringimpl(this.iconColor)) + ", disabledTextColor=" + ((Object) Color.m2517toStringimpl(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) Color.m2517toStringimpl(this.disabledIconColor)) + ')';
    }

    private ContextMenuColors(long j11, long j12, long j13, long j14, long j15) {
        this.backgroundColor = j11;
        this.textColor = j12;
        this.iconColor = j13;
        this.disabledTextColor = j14;
        this.disabledIconColor = j15;
    }
}
