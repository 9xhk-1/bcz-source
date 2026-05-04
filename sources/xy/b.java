package xy;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/Attributes$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
    public static final class a {
        @m80.k
        public static <T> T a(@m80.k b bVar, @m80.k xy.a<T> key) {
            kotlin.jvm.internal.g0.p(key, "key");
            T t11 = (T) bVar.a(key);
            if (t11 != null) {
                return t11;
            }
            throw new IllegalStateException("No instance for key " + key);
        }

        @m80.k
        public static <T> T b(@m80.k b bVar, @m80.k xy.a<T> key) {
            kotlin.jvm.internal.g0.p(key, "key");
            T t11 = (T) bVar.g(key);
            bVar.b(key);
            return t11;
        }

        @m80.l
        public static <T> T c(@m80.k b bVar, @m80.k xy.a<T> key) {
            kotlin.jvm.internal.g0.p(key, "key");
            T t11 = (T) bVar.a(key);
            bVar.b(key);
            return t11;
        }
    }

    @m80.l
    <T> T a(@m80.k xy.a<T> aVar);

    <T> void b(@m80.k xy.a<T> aVar);

    boolean c(@m80.k xy.a<?> aVar);

    @m80.l
    <T> T d(@m80.k xy.a<T> aVar);

    <T> void e(@m80.k xy.a<T> aVar, @m80.k T t11);

    @m80.k
    List<xy.a<?>> f();

    @m80.k
    <T> T g(@m80.k xy.a<T> aVar);

    @m80.k
    <T> T h(@m80.k xy.a<T> aVar);

    @m80.k
    <T> T i(@m80.k xy.a<T> aVar, @m80.k x00.a<? extends T> aVar2);
}
