package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Anchor {
    public static final int $stable = 8;
    private int location;

    public Anchor(int i11) {
        this.location = i11;
    }

    public final int getLocation$runtime_release() {
        return this.location;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime_release(int i11) {
        this.location = i11;
    }

    public final int toIndexFor(@k SlotTable slotTable) {
        return slotTable.anchorIndex(this);
    }

    @k
    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }

    public final int toIndexFor(@k SlotWriter slotWriter) {
        return slotWriter.anchorIndex(this);
    }
}
