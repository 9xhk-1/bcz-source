package z;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {
    public static final long a(@m80.k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong.get();
    }

    public static final void b(@m80.k AtomicLong atomicLong, long j11) {
        g0.p(atomicLong, "<this>");
        atomicLong.set(j11);
    }
}
