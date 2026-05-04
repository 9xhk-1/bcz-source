package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface y2<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static <T> boolean a(@m80.k y2<T> y2Var, @m80.k h10.d<?> key) {
            kotlin.jvm.internal.g0.p(key, "key");
            return y2.super.b(key);
        }
    }

    default boolean b(@m80.k h10.d<?> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return false;
    }

    @m80.l
    f50.i<T> c(@m80.k h10.d<Object> dVar);
}
