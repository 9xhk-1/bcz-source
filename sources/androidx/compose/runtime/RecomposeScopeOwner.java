package androidx.compose.runtime;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface RecomposeScopeOwner {
    @k
    InvalidationResult invalidate(@k RecomposeScopeImpl recomposeScopeImpl, @l Object obj);

    void recomposeScopeReleased(@k RecomposeScopeImpl recomposeScopeImpl);

    void recordReadOf(@k Object obj);
}
