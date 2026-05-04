package k50;

import yz.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c1(markerClass = {f50.v.class})
/* loaded from: classes8.dex */
public interface i extends i50.f, i50.d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static int a(@m80.k i iVar, @m80.k h50.f descriptor) {
            kotlin.jvm.internal.g0.p(descriptor, "descriptor");
            return i.super.decodeCollectionSize(descriptor);
        }

        @m80.l
        @f50.f
        @Deprecated
        public static <T> T b(@m80.k i iVar, @m80.k f50.e<? extends T> deserializer) {
            kotlin.jvm.internal.g0.p(deserializer, "deserializer");
            return (T) i.super.decodeNullableSerializableValue(deserializer);
        }

        @f50.f
        @Deprecated
        public static boolean c(@m80.k i iVar) {
            return i.super.decodeSequentially();
        }

        @Deprecated
        public static <T> T d(@m80.k i iVar, @m80.k f50.e<? extends T> deserializer) {
            kotlin.jvm.internal.g0.p(deserializer, "deserializer");
            return (T) i.super.decodeSerializableValue(deserializer);
        }
    }

    @m80.k
    k50.a a();

    @m80.k
    k i();
}
