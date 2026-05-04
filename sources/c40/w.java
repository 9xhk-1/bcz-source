package c40;

import c40.l2;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
@yz.n(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes8.dex */
public interface w extends l2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <R> R b(@m80.k w wVar, R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) l2.a.d(wVar, r11, pVar);
        }

        @m80.l
        public static <E extends d.b> E c(@m80.k w wVar, @m80.k d.c<E> cVar) {
            return (E) l2.a.e(wVar, cVar);
        }

        @m80.k
        public static kotlin.coroutines.d d(@m80.k w wVar, @m80.k d.c<?> cVar) {
            return l2.a.h(wVar, cVar);
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @m80.k
        public static l2 e(@m80.k w wVar, @m80.k l2 l2Var) {
            return l2.a.i(wVar, l2Var);
        }

        @m80.k
        public static kotlin.coroutines.d f(@m80.k w wVar, @m80.k kotlin.coroutines.d dVar) {
            return l2.a.j(wVar, dVar);
        }
    }

    @g2
    void C0(@m80.k b3 b3Var);
}
