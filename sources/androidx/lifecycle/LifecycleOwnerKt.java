package androidx.lifecycle;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LifecycleOwnerKt {
    @k
    public static final LifecycleCoroutineScope getLifecycleScope(@k LifecycleOwner lifecycleOwner) {
        g0.p(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
