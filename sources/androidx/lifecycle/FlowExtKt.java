package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FlowExtKt {
    @k
    public static final <T> kotlinx.coroutines.flow.i<T> flowWithLifecycle(@k kotlinx.coroutines.flow.i<? extends T> iVar, @k Lifecycle lifecycle, @k Lifecycle.State minActiveState) {
        g0.p(iVar, "<this>");
        g0.p(lifecycle, "lifecycle");
        g0.p(minActiveState, "minActiveState");
        return kotlinx.coroutines.flow.k.t(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, iVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i flowWithLifecycle$default(kotlinx.coroutines.flow.i iVar, Lifecycle lifecycle, Lifecycle.State state, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(iVar, lifecycle, state);
    }
}
