package c40;

import c40.x0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.c1(markerClass = {h2.class})
/* loaded from: classes8.dex */
public interface x<T> extends x0<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <T, R> R b(@m80.k x<T> xVar, R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) x0.a.b(xVar, r11, pVar);
        }

        @m80.l
        public static <T, E extends d.b> E c(@m80.k x<T> xVar, @m80.k d.c<E> cVar) {
            return (E) x0.a.c(xVar, cVar);
        }

        @m80.k
        public static <T> kotlin.coroutines.d d(@m80.k x<T> xVar, @m80.k d.c<?> cVar) {
            return x0.a.d(xVar, cVar);
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @m80.k
        public static <T> l2 e(@m80.k x<T> xVar, @m80.k l2 l2Var) {
            return x0.a.e(xVar, l2Var);
        }

        @m80.k
        public static <T> kotlin.coroutines.d f(@m80.k x<T> xVar, @m80.k kotlin.coroutines.d dVar) {
            return x0.a.f(xVar, dVar);
        }
    }

    boolean c0(T t11);

    boolean r(@m80.k Throwable th2);
}
