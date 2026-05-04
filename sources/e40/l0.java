package e40;

import c40.c1;
import kotlin.DeprecationLevel;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface l0<E> {
    @m80.l
    Object b(E e11, @m80.k j00.c<? super g2> cVar);

    @m80.k
    k40.j<E, l0<E>> d();

    @m80.k
    Object m(E e11);

    boolean o();

    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e11);

    void u(@m80.k x00.l<? super Throwable, g2> lVar);

    boolean z(@m80.l Throwable th2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ boolean a(l0 l0Var, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return l0Var.z(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@m80.k l0<? super E> l0Var, E e11) {
            Object m11 = l0Var.m(e11);
            if (s.m(m11)) {
                return true;
            }
            Throwable f11 = s.f(m11);
            if (f11 == null) {
                return false;
            }
            throw h40.w0.m(f11);
        }

        @c1
        public static /* synthetic */ void b() {
        }
    }
}
