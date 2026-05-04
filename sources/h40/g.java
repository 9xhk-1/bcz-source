package h40;

import java.util.concurrent.atomic.AtomicReference;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    public static final <T> T a(@m80.k AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void c(@m80.k AtomicReference<T> atomicReference, @m80.k x00.p<? super AtomicReference<T>, ? super T, g2> pVar) {
        while (true) {
            pVar.invoke(atomicReference, (Object) a(atomicReference));
        }
    }

    public static final <T> void d(@m80.k AtomicReference<T> atomicReference, T t11) {
        atomicReference.set(t11);
    }

    public static /* synthetic */ void b(AtomicReference atomicReference) {
    }
}
