package n40;

import kotlin.DeprecationLevel;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a {
    @m80.k
    k40.j<Object, a> getOnLock();

    boolean holdsLock(@m80.k Object obj);

    boolean isLocked();

    @m80.l
    Object lock(@m80.l Object obj, @m80.k j00.c<? super g2> cVar);

    boolean tryLock(@m80.l Object obj);

    void unlock(@m80.l Object obj);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: n40.a$a, reason: collision with other inner class name */
    public static final class C0899a {
        public static /* synthetic */ Object b(a aVar, Object obj, j00.c cVar, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i11 & 1) != 0) {
                obj = null;
            }
            return aVar.lock(obj, cVar);
        }

        public static /* synthetic */ boolean c(a aVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i11 & 1) != 0) {
                obj = null;
            }
            return aVar.tryLock(obj);
        }

        public static /* synthetic */ void d(a aVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i11 & 1) != 0) {
                obj = null;
            }
            aVar.unlock(obj);
        }

        @n(level = DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }
    }
}
