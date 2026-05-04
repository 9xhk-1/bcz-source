package i50;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f60175a = a.f60178a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f60176b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f60177c = -3;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f60178a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f60179b = -1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f60180c = -3;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        @Deprecated
        public static int a(@k d dVar, @k h50.f descriptor) {
            g0.p(descriptor, "descriptor");
            return d.super.decodeCollectionSize(descriptor);
        }

        @f50.f
        @Deprecated
        public static boolean c(@k d dVar) {
            return d.super.decodeSequentially();
        }
    }

    static /* synthetic */ Object g(d dVar, h50.f fVar, int i11, f50.e eVar, Object obj, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i12 & 8) != 0) {
            obj = null;
        }
        return dVar.decodeSerializableElement(fVar, i11, eVar, obj);
    }

    static /* synthetic */ Object h(d dVar, h50.f fVar, int i11, f50.e eVar, Object obj, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
        }
        if ((i12 & 8) != 0) {
            obj = null;
        }
        return dVar.decodeNullableSerializableElement(fVar, i11, eVar, obj);
    }

    boolean decodeBooleanElement(@k h50.f fVar, int i11);

    byte decodeByteElement(@k h50.f fVar, int i11);

    char decodeCharElement(@k h50.f fVar, int i11);

    default int decodeCollectionSize(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        return -1;
    }

    double decodeDoubleElement(@k h50.f fVar, int i11);

    int decodeElementIndex(@k h50.f fVar);

    float decodeFloatElement(@k h50.f fVar, int i11);

    @k
    f decodeInlineElement(@k h50.f fVar, int i11);

    int decodeIntElement(@k h50.f fVar, int i11);

    long decodeLongElement(@k h50.f fVar, int i11);

    @l
    @f50.f
    <T> T decodeNullableSerializableElement(@k h50.f fVar, int i11, @k f50.e<? extends T> eVar, @l T t11);

    @f50.f
    default boolean decodeSequentially() {
        return false;
    }

    <T> T decodeSerializableElement(@k h50.f fVar, int i11, @k f50.e<? extends T> eVar, @l T t11);

    short decodeShortElement(@k h50.f fVar, int i11);

    @k
    String decodeStringElement(@k h50.f fVar, int i11);

    void endStructure(@k h50.f fVar);

    @k
    o50.f getSerializersModule();
}
