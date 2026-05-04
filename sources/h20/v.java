package h20;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface v extends a30.z {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: h20.v$a$a, reason: collision with other inner class name */
        public static final class C0656a extends a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final byte[] f58156a;

            @m80.k
            public final byte[] b() {
                return this.f58156a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final x f58157a;

            /* renamed from: b, reason: collision with root package name */
            @m80.l
            public final byte[] f58158b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@m80.k x kotlinJvmBinaryClass, @m80.l byte[] bArr) {
                super(null);
                kotlin.jvm.internal.g0.p(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f58157a = kotlinJvmBinaryClass;
                this.f58158b = bArr;
            }

            @m80.k
            public final x b() {
                return this.f58157a;
            }

            public /* synthetic */ b(x xVar, byte[] bArr, int i11, kotlin.jvm.internal.v vVar) {
                this(xVar, (i11 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final x a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        public a() {
        }
    }

    @m80.l
    a a(@m80.k f20.g gVar, @m80.k m20.e eVar);

    @m80.l
    a c(@m80.k n20.b bVar, @m80.k m20.e eVar);
}
