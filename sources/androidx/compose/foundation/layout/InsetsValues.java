package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class InsetsValues {
    public static final int $stable = 0;
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public InsetsValues(int i11, int i12, int i13, int i14) {
        this.left = i11;
        this.top = i12;
        this.right = i13;
        this.bottom = i14;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        return this.left == insetsValues.left && this.top == insetsValues.top && this.right == insetsValues.right && this.bottom == insetsValues.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @m80.k
    public String toString() {
        return "InsetsValues(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
