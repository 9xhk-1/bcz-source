package z;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {
    public static final int a(@m80.k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger.get();
    }

    public static final void b(@m80.k AtomicInteger atomicInteger, int i11) {
        g0.p(atomicInteger, "<this>");
        atomicInteger.set(i11);
    }
}
