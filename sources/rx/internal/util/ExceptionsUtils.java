package rx.internal.util;

import androidx.camera.view.q;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum ExceptionsUtils {
    ;

    private static final Throwable TERMINATED = new Throwable("Terminated");

    public static boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        Throwable compositeException;
        do {
            th3 = atomicReference.get();
            if (th3 == TERMINATED) {
                return false;
            }
            if (th3 == null) {
                compositeException = th2;
            } else if (th3 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                arrayList.add(th2);
                compositeException = new CompositeException(arrayList);
            } else {
                compositeException = new CompositeException(th3, th2);
            }
        } while (!q.a(atomicReference, th3, compositeException));
        return true;
    }

    public static boolean isTerminated(AtomicReference<Throwable> atomicReference) {
        return isTerminated(atomicReference.get());
    }

    public static Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = TERMINATED;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }

    public static boolean isTerminated(Throwable th2) {
        return th2 == TERMINATED;
    }
}
