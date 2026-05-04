package y8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f99529g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, a> f99530h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f99531a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99532b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99533c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99534d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f99535e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f99536f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Long.valueOf(protocol.T1()));
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("DeviceAdvInfo");
            protocol.Q6("device_type", 1, (byte) 8);
            protocol.l5(struct.f99531a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f99532b);
            protocol.N2();
            protocol.Q6("image", 3, (byte) 11);
            protocol.p1(struct.f99533c);
            protocol.N2();
            protocol.Q6(y9.b.f99687c, 4, (byte) 11);
            protocol.p1(struct.f99534d);
            protocol.N2();
            if (struct.f99535e != null) {
                protocol.Q6("super_logo", 5, (byte) 11);
                protocol.p1(struct.f99535e);
                protocol.N2();
            }
            if (struct.f99536f != null) {
                protocol.Q6("super_timestamp", 6, (byte) 10);
                protocol.q7(struct.f99536f.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public d(int i11, @m80.k String name, @m80.k String image, @m80.k String link, @m80.l String str, @m80.l Long l11) {
        g0.p(name, "name");
        g0.p(image, "image");
        g0.p(link, "link");
        this.f99531a = i11;
        this.f99532b = name;
        this.f99533c = image;
        this.f99534d = link;
        this.f99535e = str;
        this.f99536f = l11;
    }

    public static /* synthetic */ d h(d dVar, int i11, String str, String str2, String str3, String str4, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = dVar.f99531a;
        }
        if ((i12 & 2) != 0) {
            str = dVar.f99532b;
        }
        if ((i12 & 4) != 0) {
            str2 = dVar.f99533c;
        }
        if ((i12 & 8) != 0) {
            str3 = dVar.f99534d;
        }
        if ((i12 & 16) != 0) {
            str4 = dVar.f99535e;
        }
        if ((i12 & 32) != 0) {
            l11 = dVar.f99536f;
        }
        String str5 = str4;
        Long l12 = l11;
        return dVar.g(i11, str, str2, str3, str5, l12);
    }

    public final int a() {
        return this.f99531a;
    }

    @m80.k
    public final String b() {
        return this.f99532b;
    }

    @m80.k
    public final String c() {
        return this.f99533c;
    }

    @m80.k
    public final String d() {
        return this.f99534d;
    }

    @m80.l
    public final String e() {
        return this.f99535e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f99531a == dVar.f99531a && g0.g(this.f99532b, dVar.f99532b) && g0.g(this.f99533c, dVar.f99533c) && g0.g(this.f99534d, dVar.f99534d) && g0.g(this.f99535e, dVar.f99535e) && g0.g(this.f99536f, dVar.f99536f);
    }

    @m80.l
    public final Long f() {
        return this.f99536f;
    }

    @m80.k
    public final d g(int i11, @m80.k String name, @m80.k String image, @m80.k String link, @m80.l String str, @m80.l Long l11) {
        g0.p(name, "name");
        g0.p(image, "image");
        g0.p(link, "link");
        return new d(i11, name, image, link, str, l11);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f99531a) * 31) + this.f99532b.hashCode()) * 31) + this.f99533c.hashCode()) * 31) + this.f99534d.hashCode()) * 31;
        String str = this.f99535e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f99536f;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "DeviceAdvInfo(device_type=" + this.f99531a + ", name=" + this.f99532b + ", image=" + this.f99533c + ", link=" + this.f99534d + ", super_logo=" + this.f99535e + ", super_timestamp=" + this.f99536f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99530h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDeviceAdvInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAdvInfo.kt\ncom/baicizhan/biz/online/user_book/DeviceAdvInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    public static final class a implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f99537a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f99538b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f99539c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f99540d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f99541e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f99542f;

        public a() {
            this.f99537a = null;
            this.f99538b = null;
            this.f99539c = null;
            this.f99540d = null;
            this.f99541e = null;
            this.f99542f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f99537a;
            if (num == null) {
                throw new IllegalStateException("Required field 'device_type' is missing");
            }
            int intValue = num.intValue();
            String str = this.f99538b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str2 = this.f99539c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'image' is missing");
            }
            String str3 = this.f99540d;
            if (str3 != null) {
                return new d(intValue, str, str2, str3, this.f99541e, this.f99542f);
            }
            throw new IllegalStateException("Required field 'link' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f99537a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String image) {
            g0.p(image, "image");
            this.f99539c = image;
            return this;
        }

        @m80.k
        public final a d(@m80.k String link) {
            g0.p(link, "link");
            this.f99540d = link;
            return this;
        }

        @m80.k
        public final a e(@m80.k String name) {
            g0.p(name, "name");
            this.f99538b = name;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f99541e = str;
            return this;
        }

        @m80.k
        public final a g(@m80.l Long l11) {
            this.f99542f = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99537a = null;
            this.f99538b = null;
            this.f99539c = null;
            this.f99540d = null;
            this.f99541e = null;
            this.f99542f = null;
        }

        public a(@m80.k d source) {
            g0.p(source, "source");
            this.f99537a = Integer.valueOf(source.f99531a);
            this.f99538b = source.f99532b;
            this.f99539c = source.f99533c;
            this.f99540d = source.f99534d;
            this.f99541e = source.f99535e;
            this.f99542f = source.f99536f;
        }
    }
}
