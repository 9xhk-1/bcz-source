package c40;

import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface m3<S> extends d.b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <S, R> R a(@m80.k m3<S> m3Var, R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(m3Var, r11, pVar);
        }

        @m80.l
        public static <S, E extends d.b> E b(@m80.k m3<S> m3Var, @m80.k d.c<E> cVar) {
            return (E) d.b.a.b(m3Var, cVar);
        }

        @m80.k
        public static <S> kotlin.coroutines.d c(@m80.k m3<S> m3Var, @m80.k d.c<?> cVar) {
            return d.b.a.c(m3Var, cVar);
        }

        @m80.k
        public static <S> kotlin.coroutines.d d(@m80.k m3<S> m3Var, @m80.k kotlin.coroutines.d dVar) {
            return d.b.a.d(m3Var, dVar);
        }
    }

    void restoreThreadContext(@m80.k kotlin.coroutines.d dVar, S s11);

    S updateThreadContext(@m80.k kotlin.coroutines.d dVar);
}
