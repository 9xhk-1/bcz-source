package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class OpaqueKey {
    public static final int $stable = 0;

    @k
    private final String key;

    public OpaqueKey(@k String str) {
        this.key = str;
    }

    public static /* synthetic */ OpaqueKey copy$default(OpaqueKey opaqueKey, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.copy(str);
    }

    @k
    public final String component1() {
        return this.key;
    }

    @k
    public final OpaqueKey copy(@k String str) {
        return new OpaqueKey(str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && g0.g(this.key, ((OpaqueKey) obj).key);
    }

    @k
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @k
    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}
