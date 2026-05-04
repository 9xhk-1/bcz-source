package e40;

import c40.r0;
import e40.l0;
import kotlin.DeprecationLevel;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface i0<E> extends r0, l0<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@m80.k i0<? super E> i0Var, E e11) {
            return l0.a.c(i0Var, e11);
        }
    }

    @m80.k
    l0<E> getChannel();
}
