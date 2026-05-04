package androidx.lifecycle;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
    }

    default void onDestroy(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
    }

    default void onPause(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
    }

    default void onResume(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
    }

    default void onStart(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
    }

    default void onStop(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
    }
}
