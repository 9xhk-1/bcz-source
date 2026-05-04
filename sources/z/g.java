package z;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {
    public static final <T> T a(@m80.k AtomicReference<T> atomicReference) {
        g0.p(atomicReference, "<this>");
        return atomicReference.get();
    }

    public static final <T> void b(@m80.k AtomicReference<T> atomicReference, T t11) {
        g0.p(atomicReference, "<this>");
        atomicReference.set(t11);
    }
}
