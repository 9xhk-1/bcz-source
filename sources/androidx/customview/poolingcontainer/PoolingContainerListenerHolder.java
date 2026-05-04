package androidx.customview.poolingcontainer;

import a00.h0;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class PoolingContainerListenerHolder {

    @k
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(@k PoolingContainerListener listener) {
        g0.p(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int L = h0.L(this.listeners); -1 < L; L--) {
            this.listeners.get(L).onRelease();
        }
    }

    public final void removeListener(@k PoolingContainerListener listener) {
        g0.p(listener, "listener");
        this.listeners.remove(listener);
    }
}
