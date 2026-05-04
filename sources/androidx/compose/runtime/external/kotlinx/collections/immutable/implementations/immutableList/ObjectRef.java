package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ObjectRef {
    public static final int $stable = 8;

    @l
    private Object value;

    public ObjectRef(@l Object obj) {
        this.value = obj;
    }

    @l
    public final Object getValue() {
        return this.value;
    }

    public final void setValue(@l Object obj) {
        this.value = obj;
    }
}
