package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f53345c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f53346d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53347a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53348b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p read(@m80.k ws.i protocol, @m80.k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("LoadingImgInfo");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f53347a);
            protocol.N2();
            protocol.Q6("image_url", 2, (byte) 11);
            protocol.p1(struct.f53348b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p(int i11, @m80.k String image_url) {
        g0.p(image_url, "image_url");
        this.f53347a = i11;
        this.f53348b = image_url;
    }

    public static /* synthetic */ p d(p pVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = pVar.f53347a;
        }
        if ((i12 & 2) != 0) {
            str = pVar.f53348b;
        }
        return pVar.c(i11, str);
    }

    public final int a() {
        return this.f53347a;
    }

    @m80.k
    public final String b() {
        return this.f53348b;
    }

    @m80.k
    public final p c(int i11, @m80.k String image_url) {
        g0.p(image_url, "image_url");
        return new p(i11, image_url);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f53347a == pVar.f53347a && g0.g(this.f53348b, pVar.f53348b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f53347a) * 31) + this.f53348b.hashCode();
    }

    @m80.k
    public String toString() {
        return "LoadingImgInfo(id=" + this.f53347a + ", image_url=" + this.f53348b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53346d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLoadingImgInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadingImgInfo.kt\ncom/baicizhan/biz/online/advertise_api/LoadingImgInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53349a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53350b;

        public a() {
            this.f53349a = null;
            this.f53350b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build() {
            Integer num = this.f53349a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f53350b;
            if (str != null) {
                return new p(intValue, str);
            }
            throw new IllegalStateException("Required field 'image_url' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f53349a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String image_url) {
            g0.p(image_url, "image_url");
            this.f53350b = image_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53349a = null;
            this.f53350b = null;
        }

        public a(@m80.k p source) {
            g0.p(source, "source");
            this.f53349a = Integer.valueOf(source.f53347a);
            this.f53350b = source.f53348b;
        }
    }
}
