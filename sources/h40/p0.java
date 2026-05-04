package h40;

import kotlinx.coroutines.internal.UndeliveredElementException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p0 {
    public static final <E> void a(@m80.k x00.l<? super E, g2> lVar, E e11, @m80.k kotlin.coroutines.d dVar) {
        UndeliveredElementException b11 = b(lVar, e11, null);
        if (b11 != null) {
            c40.o0.b(dVar, b11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public static final <E> UndeliveredElementException b(@m80.k x00.l<? super E, g2> lVar, E e11, @m80.l UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e11);
            return undeliveredElementException;
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                yz.r.a(undeliveredElementException, th2);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + e11, th2);
        }
    }

    public static /* synthetic */ UndeliveredElementException c(x00.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(lVar, obj, undeliveredElementException);
    }
}
