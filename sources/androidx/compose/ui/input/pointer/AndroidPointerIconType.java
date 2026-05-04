package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidPointerIconType implements PointerIcon {
    public static final int $stable = 0;
    private final int type;

    public AndroidPointerIconType(int i11) {
        this.type = i11;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(AndroidPointerIconType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.type == ((AndroidPointerIconType) obj).type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    @k
    public String toString() {
        return "AndroidPointerIcon(type=" + this.type + ')';
    }
}
