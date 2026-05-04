package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j11, long j12, v vVar) {
        this(j11, j12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m2510equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m2510equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1514getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m1515getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m2516hashCodeimpl(this.handleColor) * 31) + Color.m2516hashCodeimpl(this.backgroundColor);
    }

    @k
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m2517toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m2517toStringimpl(this.backgroundColor)) + ')';
    }

    private TextSelectionColors(long j11, long j12) {
        this.handleColor = j11;
        this.backgroundColor = j12;
    }
}
