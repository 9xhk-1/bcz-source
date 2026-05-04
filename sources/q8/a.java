package q8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f81833e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<a, b> f81834f = new C1008a();

    /* renamed from: a, reason: collision with root package name */
    @l
    @w00.g
    public final String f81835a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @w00.g
    public final String f81836b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @w00.g
    public final String f81837c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final String f81838d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: q8.a$a, reason: collision with other inner class name */
    public static final class C1008a implements ts.a<a, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k b builder) {
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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
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
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AddressMatchReq");
            if (struct.f81835a != null) {
                protocol.Q6("province", 1, (byte) 11);
                protocol.p1(struct.f81835a);
                protocol.N2();
            }
            if (struct.f81836b != null) {
                protocol.Q6("city", 2, (byte) 11);
                protocol.p1(struct.f81836b);
                protocol.N2();
            }
            if (struct.f81837c != null) {
                protocol.Q6("district", 3, (byte) 11);
                protocol.p1(struct.f81837c);
                protocol.N2();
            }
            if (struct.f81838d != null) {
                protocol.Q6("street", 4, (byte) 11);
                protocol.p1(struct.f81838d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public a(@l String str, @l String str2, @l String str3, @l String str4) {
        this.f81835a = str;
        this.f81836b = str2;
        this.f81837c = str3;
        this.f81838d = str4;
    }

    public static /* synthetic */ a f(a aVar, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f81835a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f81836b;
        }
        if ((i11 & 4) != 0) {
            str3 = aVar.f81837c;
        }
        if ((i11 & 8) != 0) {
            str4 = aVar.f81838d;
        }
        return aVar.e(str, str2, str3, str4);
    }

    @l
    public final String a() {
        return this.f81835a;
    }

    @l
    public final String b() {
        return this.f81836b;
    }

    @l
    public final String c() {
        return this.f81837c;
    }

    @l
    public final String d() {
        return this.f81838d;
    }

    @k
    public final a e(@l String str, @l String str2, @l String str3, @l String str4) {
        return new a(str, str2, str3, str4);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f81835a, aVar.f81835a) && g0.g(this.f81836b, aVar.f81836b) && g0.g(this.f81837c, aVar.f81837c) && g0.g(this.f81838d, aVar.f81838d);
    }

    public int hashCode() {
        String str = this.f81835a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81836b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81837c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81838d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AddressMatchReq(province=" + this.f81835a + ", city=" + this.f81836b + ", district=" + this.f81837c + ", street=" + this.f81838d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f81834f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAddressMatchReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressMatchReq.kt\ncom/baicizhan/biz/online/mall_proxy/AddressMatchReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f81839a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f81840b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f81841c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f81842d;

        public b() {
            this.f81839a = null;
            this.f81840b = null;
            this.f81841c = null;
            this.f81842d = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            return new a(this.f81839a, this.f81840b, this.f81841c, this.f81842d);
        }

        @k
        public final b b(@l String str) {
            this.f81840b = str;
            return this;
        }

        @k
        public final b c(@l String str) {
            this.f81841c = str;
            return this;
        }

        @k
        public final b d(@l String str) {
            this.f81839a = str;
            return this;
        }

        @k
        public final b e(@l String str) {
            this.f81842d = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f81839a = null;
            this.f81840b = null;
            this.f81841c = null;
            this.f81842d = null;
        }

        public b(@k a source) {
            g0.p(source, "source");
            this.f81839a = source.f81835a;
            this.f81840b = source.f81836b;
            this.f81841c = source.f81837c;
            this.f81842d = source.f81838d;
        }
    }
}
