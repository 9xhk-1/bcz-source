package p10;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a0 extends h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.l
        public static <R, D> R a(@m80.k a0 a0Var, @m80.k j<R, D> visitor, D d11) {
            kotlin.jvm.internal.g0.p(visitor, "visitor");
            return visitor.b(a0Var, d11);
        }

        @m80.l
        public static h b(@m80.k a0 a0Var) {
            return null;
        }
    }

    @m80.l
    <T> T A0(@m80.k z<T> zVar);

    @m80.k
    List<a0> R();

    boolean X(@m80.k a0 a0Var);

    @m80.k
    n0 h0(@m80.k n20.c cVar);

    @m80.k
    Collection<n20.c> m(@m80.k n20.c cVar, @m80.k x00.l<? super n20.f, Boolean> lVar);

    @m80.k
    n10.j q();
}
