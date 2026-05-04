package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldHandleState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.Companion.m2283getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);

    @k
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final float lineHeight;
    private final long position;
    private final boolean visible;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldHandleState(boolean z11, long j11, float f11, ResolvedTextDirection resolvedTextDirection, boolean z12, v vVar) {
        this(z11, j11, f11, resolvedTextDirection, z12);
    }

    /* renamed from: copy-YqVAtuI$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m1338copyYqVAtuI$default(TextFieldHandleState textFieldHandleState, boolean z11, long j11, float f11, ResolvedTextDirection resolvedTextDirection, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = textFieldHandleState.visible;
        }
        if ((i11 & 2) != 0) {
            j11 = textFieldHandleState.position;
        }
        if ((i11 & 4) != 0) {
            f11 = textFieldHandleState.lineHeight;
        }
        if ((i11 & 8) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        if ((i11 & 16) != 0) {
            z12 = textFieldHandleState.handlesCrossed;
        }
        boolean z13 = z12;
        float f12 = f11;
        return textFieldHandleState.m1340copyYqVAtuI(z11, j11, f12, resolvedTextDirection, z13);
    }

    public final boolean component1() {
        return this.visible;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1339component2F1C5BW0() {
        return this.position;
    }

    public final float component3() {
        return this.lineHeight;
    }

    @k
    public final ResolvedTextDirection component4() {
        return this.direction;
    }

    public final boolean component5() {
        return this.handlesCrossed;
    }

    @k
    /* renamed from: copy-YqVAtuI, reason: not valid java name */
    public final TextFieldHandleState m1340copyYqVAtuI(boolean z11, long j11, float f11, @k ResolvedTextDirection resolvedTextDirection, boolean z12) {
        return new TextFieldHandleState(z11, j11, f11, resolvedTextDirection, z12, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m2265equalsimpl0(this.position, textFieldHandleState.position) && Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    @k
    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1341getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.visible) * 31) + Offset.m2270hashCodeimpl(this.position)) * 31) + Float.hashCode(this.lineHeight)) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    @k
    public String toString() {
        return "TextFieldHandleState(visible=" + this.visible + ", position=" + ((Object) Offset.m2276toStringimpl(this.position)) + ", lineHeight=" + this.lineHeight + ", direction=" + this.direction + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    private TextFieldHandleState(boolean z11, long j11, float f11, ResolvedTextDirection resolvedTextDirection, boolean z12) {
        this.visible = z11;
        this.position = j11;
        this.lineHeight = f11;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z12;
    }
}
