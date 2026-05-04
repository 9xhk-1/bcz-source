package e40;

import c40.a3;
import h40.x0;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x0 f49041a = new x0("NO_ELEMENT");

    @a3
    @yz.n(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @m80.k
    public static final <E> d<E> a(int i11) {
        if (i11 == -2) {
            return new e(o.f49142n0.a());
        }
        if (i11 == -1) {
            return new b0();
        }
        if (i11 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i11 != Integer.MAX_VALUE) {
            return new e(i11);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
