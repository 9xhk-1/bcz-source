package e40;

import c40.a3;
import c40.r0;
import e40.k0;
import kotlin.DeprecationLevel;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a3
/* loaded from: classes8.dex */
public interface c<E> extends r0, k0<E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.k
        public static <E> k40.h<E> b(@m80.k c<E> cVar) {
            return k0.a.d(cVar);
        }

        @m80.l
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @w0(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E c(@m80.k c<E> cVar) {
            return (E) k0.a.h(cVar);
        }

        @m80.l
        @o00.i
        @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @w0(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object d(@m80.k c<E> cVar, @m80.k j00.c<? super E> cVar2) {
            return k0.a.i(cVar, cVar2);
        }
    }

    @m80.k
    o<E> getChannel();
}
