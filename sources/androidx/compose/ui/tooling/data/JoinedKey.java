package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@UiToolingDataApi
/* loaded from: classes2.dex */
public final class JoinedKey {
    public static final int $stable = 8;

    @l
    private final Object left;

    @l
    private final Object right;

    public JoinedKey(@l Object obj, @l Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i11 & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }

    @l
    public final Object component1() {
        return this.left;
    }

    @l
    public final Object component2() {
        return this.right;
    }

    @k
    public final JoinedKey copy(@l Object obj, @l Object obj2) {
        return new JoinedKey(obj, obj2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return g0.g(this.left, joinedKey.left) && g0.g(this.right, joinedKey.right);
    }

    @l
    public final Object getLeft() {
        return this.left;
    }

    @l
    public final Object getRight() {
        return this.right;
    }

    public int hashCode() {
        Object obj = this.left;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.right;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}
