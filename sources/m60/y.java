package m60;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y {
    public static final int a(@m80.k AtomicInteger atomicInteger, int i11) {
        int i12;
        int i13;
        g0.p(atomicInteger, "<this>");
        do {
            i12 = atomicInteger.get();
            if ((i12 & i11) != 0) {
                return 0;
            }
            i13 = i12 | i11;
        } while (!atomicInteger.compareAndSet(i12, i13));
        return i13;
    }
}
