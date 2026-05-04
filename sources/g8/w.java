package g8;

import com.tencent.open.SocialConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f53417d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w, a> f53418e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53419a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53420b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53421c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<w, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k w struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PracticePopupAdv");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(struct.f53419a);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 2, (byte) 11);
            protocol.p1(struct.f53420b);
            protocol.N2();
            if (struct.f53421c != null) {
                protocol.Q6(y9.b.f99687c, 3, (byte) 11);
                protocol.p1(struct.f53421c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public w(@m80.k String id2, @m80.k String img, @m80.l String str) {
        g0.p(id2, "id");
        g0.p(img, "img");
        this.f53419a = id2;
        this.f53420b = img;
        this.f53421c = str;
    }

    public static /* synthetic */ w e(w wVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wVar.f53419a;
        }
        if ((i11 & 2) != 0) {
            str2 = wVar.f53420b;
        }
        if ((i11 & 4) != 0) {
            str3 = wVar.f53421c;
        }
        return wVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f53419a;
    }

    @m80.k
    public final String b() {
        return this.f53420b;
    }

    @m80.l
    public final String c() {
        return this.f53421c;
    }

    @m80.k
    public final w d(@m80.k String id2, @m80.k String img, @m80.l String str) {
        g0.p(id2, "id");
        g0.p(img, "img");
        return new w(id2, img, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return g0.g(this.f53419a, wVar.f53419a) && g0.g(this.f53420b, wVar.f53420b) && g0.g(this.f53421c, wVar.f53421c);
    }

    public int hashCode() {
        int hashCode = ((this.f53419a.hashCode() * 31) + this.f53420b.hashCode()) * 31;
        String str = this.f53421c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "PracticePopupAdv(id=" + this.f53419a + ", img=" + this.f53420b + ", link=" + this.f53421c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53418e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPracticePopupAdv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PracticePopupAdv.kt\ncom/baicizhan/biz/online/advertise_api/PracticePopupAdv$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class a implements ts.f<w> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53422a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53423b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53424c;

        public a() {
            this.f53422a = null;
            this.f53423b = null;
            this.f53424c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w build() {
            String str = this.f53422a;
            if (str == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            String str2 = this.f53423b;
            if (str2 != null) {
                return new w(str, str2, this.f53424c);
            }
            throw new IllegalStateException("Required field 'img' is missing");
        }

        @m80.k
        public final a b(@m80.k String id2) {
            g0.p(id2, "id");
            this.f53422a = id2;
            return this;
        }

        @m80.k
        public final a c(@m80.k String img) {
            g0.p(img, "img");
            this.f53423b = img;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f53424c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53422a = null;
            this.f53423b = null;
            this.f53424c = null;
        }

        public a(@m80.k w source) {
            g0.p(source, "source");
            this.f53422a = source.f53419a;
            this.f53423b = source.f53420b;
            this.f53424c = source.f53421c;
        }
    }
}
