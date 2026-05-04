package g8;

import com.tencent.open.SocialConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f53329d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, a> f53330e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53331a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53332b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53333c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ExplorePopupAdv");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(struct.f53331a);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 2, (byte) 11);
            protocol.p1(struct.f53332b);
            protocol.N2();
            if (struct.f53333c != null) {
                protocol.Q6(y9.b.f99687c, 3, (byte) 11);
                protocol.p1(struct.f53333c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public n(@m80.k String id2, @m80.k String img, @m80.l String str) {
        g0.p(id2, "id");
        g0.p(img, "img");
        this.f53331a = id2;
        this.f53332b = img;
        this.f53333c = str;
    }

    public static /* synthetic */ n e(n nVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nVar.f53331a;
        }
        if ((i11 & 2) != 0) {
            str2 = nVar.f53332b;
        }
        if ((i11 & 4) != 0) {
            str3 = nVar.f53333c;
        }
        return nVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f53331a;
    }

    @m80.k
    public final String b() {
        return this.f53332b;
    }

    @m80.l
    public final String c() {
        return this.f53333c;
    }

    @m80.k
    public final n d(@m80.k String id2, @m80.k String img, @m80.l String str) {
        g0.p(id2, "id");
        g0.p(img, "img");
        return new n(id2, img, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return g0.g(this.f53331a, nVar.f53331a) && g0.g(this.f53332b, nVar.f53332b) && g0.g(this.f53333c, nVar.f53333c);
    }

    public int hashCode() {
        int hashCode = ((this.f53331a.hashCode() * 31) + this.f53332b.hashCode()) * 31;
        String str = this.f53333c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "ExplorePopupAdv(id=" + this.f53331a + ", img=" + this.f53332b + ", link=" + this.f53333c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53330e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExplorePopupAdv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExplorePopupAdv.kt\ncom/baicizhan/biz/online/advertise_api/ExplorePopupAdv$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class a implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53334a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53335b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53336c;

        public a() {
            this.f53334a = null;
            this.f53335b = null;
            this.f53336c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n build() {
            String str = this.f53334a;
            if (str == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            String str2 = this.f53335b;
            if (str2 != null) {
                return new n(str, str2, this.f53336c);
            }
            throw new IllegalStateException("Required field 'img' is missing");
        }

        @m80.k
        public final a b(@m80.k String id2) {
            g0.p(id2, "id");
            this.f53334a = id2;
            return this;
        }

        @m80.k
        public final a c(@m80.k String img) {
            g0.p(img, "img");
            this.f53335b = img;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f53336c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53334a = null;
            this.f53335b = null;
            this.f53336c = null;
        }

        public a(@m80.k n source) {
            g0.p(source, "source");
            this.f53334a = source.f53331a;
            this.f53335b = source.f53332b;
            this.f53336c = source.f53333c;
        }
    }
}
