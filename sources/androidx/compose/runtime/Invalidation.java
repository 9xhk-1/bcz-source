package androidx.compose.runtime;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class Invalidation {

    @l
    private Object instances;
    private final int location;

    @k
    private final RecomposeScopeImpl scope;

    public Invalidation(@k RecomposeScopeImpl recomposeScopeImpl, int i11, @l Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i11;
        this.instances = obj;
    }

    @l
    public final Object getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    @k
    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(@l Object obj) {
        this.instances = obj;
    }
}
