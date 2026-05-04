package k50;

import yz.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c1(markerClass = {f50.v.class})
/* loaded from: classes8.dex */
public interface x extends i50.h, i50.e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        @m80.k
        public static i50.e a(@m80.k x xVar, @m80.k h50.f descriptor, int i11) {
            kotlin.jvm.internal.g0.p(descriptor, "descriptor");
            return x.super.beginCollection(descriptor, i11);
        }

        @f50.f
        @Deprecated
        public static void b(@m80.k x xVar) {
            x.super.encodeNotNullMark();
        }

        @f50.f
        @Deprecated
        public static <T> void c(@m80.k x xVar, @m80.k f50.b0<? super T> serializer, @m80.l T t11) {
            kotlin.jvm.internal.g0.p(serializer, "serializer");
            x.super.encodeNullableSerializableValue(serializer, t11);
        }

        @Deprecated
        public static <T> void d(@m80.k x xVar, @m80.k f50.b0<? super T> serializer, T t11) {
            kotlin.jvm.internal.g0.p(serializer, "serializer");
            x.super.encodeSerializableValue(serializer, t11);
        }

        @f50.f
        @Deprecated
        public static boolean e(@m80.k x xVar, @m80.k h50.f descriptor, int i11) {
            kotlin.jvm.internal.g0.p(descriptor, "descriptor");
            return x.super.shouldEncodeElementDefault(descriptor, i11);
        }
    }

    @m80.k
    k50.a a();

    void d(@m80.k k kVar);
}
