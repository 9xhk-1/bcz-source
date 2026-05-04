package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f93269d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, a> f93270e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final ByteString f93271a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93272b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93273c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.b(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.K3());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ImgCaptcha");
            protocol.Q6("image", 1, (byte) 11);
            protocol.z1(struct.f93271a);
            protocol.N2();
            protocol.Q6("trace_id", 2, (byte) 11);
            protocol.p1(struct.f93272b);
            protocol.N2();
            protocol.Q6("captcha", 3, (byte) 11);
            protocol.p1(struct.f93273c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e(@m80.k ByteString image, @m80.k String trace_id, @m80.k String captcha) {
        g0.p(image, "image");
        g0.p(trace_id, "trace_id");
        g0.p(captcha, "captcha");
        this.f93271a = image;
        this.f93272b = trace_id;
        this.f93273c = captcha;
    }

    public static /* synthetic */ e e(e eVar, ByteString byteString, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            byteString = eVar.f93271a;
        }
        if ((i11 & 2) != 0) {
            str = eVar.f93272b;
        }
        if ((i11 & 4) != 0) {
            str2 = eVar.f93273c;
        }
        return eVar.d(byteString, str, str2);
    }

    @m80.k
    public final ByteString a() {
        return this.f93271a;
    }

    @m80.k
    public final String b() {
        return this.f93272b;
    }

    @m80.k
    public final String c() {
        return this.f93273c;
    }

    @m80.k
    public final e d(@m80.k ByteString image, @m80.k String trace_id, @m80.k String captcha) {
        g0.p(image, "image");
        g0.p(trace_id, "trace_id");
        g0.p(captcha, "captcha");
        return new e(image, trace_id, captcha);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(this.f93271a, eVar.f93271a) && g0.g(this.f93272b, eVar.f93272b) && g0.g(this.f93273c, eVar.f93273c);
    }

    public int hashCode() {
        return (((this.f93271a.hashCode() * 31) + this.f93272b.hashCode()) * 31) + this.f93273c.hashCode();
    }

    @m80.k
    public String toString() {
        return "ImgCaptcha(image=" + this.f93271a + ", trace_id=" + this.f93272b + ", captcha=" + this.f93273c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93270e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImgCaptcha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImgCaptcha.kt\ncom/baicizhan/biz/online/unified_user_service/ImgCaptcha$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public ByteString f93274a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93275b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93276c;

        public a() {
            this.f93274a = null;
            this.f93275b = null;
            this.f93276c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e build() {
            ByteString byteString = this.f93274a;
            if (byteString == null) {
                throw new IllegalStateException("Required field 'image' is missing");
            }
            String str = this.f93275b;
            if (str == null) {
                throw new IllegalStateException("Required field 'trace_id' is missing");
            }
            String str2 = this.f93276c;
            if (str2 != null) {
                return new e(byteString, str, str2);
            }
            throw new IllegalStateException("Required field 'captcha' is missing");
        }

        @m80.k
        public final a b(@m80.k String captcha) {
            g0.p(captcha, "captcha");
            this.f93276c = captcha;
            return this;
        }

        @m80.k
        public final a c(@m80.k ByteString image) {
            g0.p(image, "image");
            this.f93274a = image;
            return this;
        }

        @m80.k
        public final a d(@m80.k String trace_id) {
            g0.p(trace_id, "trace_id");
            this.f93275b = trace_id;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93274a = null;
            this.f93275b = null;
            this.f93276c = null;
        }

        public a(@m80.k e source) {
            g0.p(source, "source");
            this.f93274a = source.f93271a;
            this.f93275b = source.f93272b;
            this.f93276c = source.f93273c;
        }
    }
}
