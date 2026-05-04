package q8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q8.c;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final b f81877i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<f, a> f81878j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f81879a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f81880b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f81881c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public final q8.c f81882d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public final q8.c f81883e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final q8.c f81884f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @k
    public final String f81885g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final int f81886h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@k i protocol, @k a builder) {
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
                            builder.e(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(q8.c.f81854f.read(protocol));
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(q8.c.f81854f.read(protocol));
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(q8.c.f81854f.read(protocol));
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
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
        public void write(@k i protocol, @k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserAddress");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f81879a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f81880b);
            protocol.N2();
            protocol.Q6("mobile", 3, (byte) 11);
            protocol.p1(struct.f81881c);
            protocol.N2();
            protocol.Q6("province", 4, (byte) 12);
            ts.a<q8.c, c.a> aVar = q8.c.f81854f;
            aVar.write(protocol, struct.f81882d);
            protocol.N2();
            protocol.Q6("city", 5, (byte) 12);
            aVar.write(protocol, struct.f81883e);
            protocol.N2();
            if (struct.f81884f != null) {
                protocol.Q6("district", 6, (byte) 12);
                aVar.write(protocol, struct.f81884f);
                protocol.N2();
            }
            protocol.Q6("detail", 7, (byte) 11);
            protocol.p1(struct.f81885g);
            protocol.N2();
            protocol.Q6("status", 8, (byte) 8);
            protocol.l5(struct.f81886h);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f(int i11, @k String name, @k String mobile, @k q8.c province, @k q8.c city, @l q8.c cVar, @k String detail, int i12) {
        g0.p(name, "name");
        g0.p(mobile, "mobile");
        g0.p(province, "province");
        g0.p(city, "city");
        g0.p(detail, "detail");
        this.f81879a = i11;
        this.f81880b = name;
        this.f81881c = mobile;
        this.f81882d = province;
        this.f81883e = city;
        this.f81884f = cVar;
        this.f81885g = detail;
        this.f81886h = i12;
    }

    public static /* synthetic */ f j(f fVar, int i11, String str, String str2, q8.c cVar, q8.c cVar2, q8.c cVar3, String str3, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fVar.f81879a;
        }
        if ((i13 & 2) != 0) {
            str = fVar.f81880b;
        }
        if ((i13 & 4) != 0) {
            str2 = fVar.f81881c;
        }
        if ((i13 & 8) != 0) {
            cVar = fVar.f81882d;
        }
        if ((i13 & 16) != 0) {
            cVar2 = fVar.f81883e;
        }
        if ((i13 & 32) != 0) {
            cVar3 = fVar.f81884f;
        }
        if ((i13 & 64) != 0) {
            str3 = fVar.f81885g;
        }
        if ((i13 & 128) != 0) {
            i12 = fVar.f81886h;
        }
        String str4 = str3;
        int i14 = i12;
        q8.c cVar4 = cVar2;
        q8.c cVar5 = cVar3;
        return fVar.i(i11, str, str2, cVar, cVar4, cVar5, str4, i14);
    }

    public final int a() {
        return this.f81879a;
    }

    @k
    public final String b() {
        return this.f81880b;
    }

    @k
    public final String c() {
        return this.f81881c;
    }

    @k
    public final q8.c d() {
        return this.f81882d;
    }

    @k
    public final q8.c e() {
        return this.f81883e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f81879a == fVar.f81879a && g0.g(this.f81880b, fVar.f81880b) && g0.g(this.f81881c, fVar.f81881c) && g0.g(this.f81882d, fVar.f81882d) && g0.g(this.f81883e, fVar.f81883e) && g0.g(this.f81884f, fVar.f81884f) && g0.g(this.f81885g, fVar.f81885g) && this.f81886h == fVar.f81886h;
    }

    @l
    public final q8.c f() {
        return this.f81884f;
    }

    @k
    public final String g() {
        return this.f81885g;
    }

    public final int h() {
        return this.f81886h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f81879a) * 31) + this.f81880b.hashCode()) * 31) + this.f81881c.hashCode()) * 31) + this.f81882d.hashCode()) * 31) + this.f81883e.hashCode()) * 31;
        q8.c cVar = this.f81884f;
        return ((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f81885g.hashCode()) * 31) + Integer.hashCode(this.f81886h);
    }

    @k
    public final f i(int i11, @k String name, @k String mobile, @k q8.c province, @k q8.c city, @l q8.c cVar, @k String detail, int i12) {
        g0.p(name, "name");
        g0.p(mobile, "mobile");
        g0.p(province, "province");
        g0.p(city, "city");
        g0.p(detail, "detail");
        return new f(i11, name, mobile, province, city, cVar, detail, i12);
    }

    @k
    public String toString() {
        return "UserAddress(id=" + this.f81879a + ", name=" + this.f81880b + ", mobile=" + this.f81881c + ", province=" + this.f81882d + ", city=" + this.f81883e + ", district=" + this.f81884f + ", detail=" + this.f81885g + ", status=" + this.f81886h + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f81878j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAddress.kt\ncom/baicizhan/biz/online/mall_proxy/UserAddress$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f81887a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f81888b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f81889c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public q8.c f81890d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public q8.c f81891e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public q8.c f81892f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public String f81893g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public Integer f81894h;

        public a() {
            this.f81887a = null;
            this.f81888b = null;
            this.f81889c = null;
            this.f81890d = null;
            this.f81891e = null;
            this.f81892f = null;
            this.f81893g = null;
            this.f81894h = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            Integer num = this.f81887a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f81888b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str2 = this.f81889c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'mobile' is missing");
            }
            q8.c cVar = this.f81890d;
            if (cVar == null) {
                throw new IllegalStateException("Required field 'province' is missing");
            }
            q8.c cVar2 = this.f81891e;
            if (cVar2 == null) {
                throw new IllegalStateException("Required field 'city' is missing");
            }
            q8.c cVar3 = this.f81892f;
            String str3 = this.f81893g;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'detail' is missing");
            }
            Integer num2 = this.f81894h;
            if (num2 != null) {
                return new f(intValue, str, str2, cVar, cVar2, cVar3, str3, num2.intValue());
            }
            throw new IllegalStateException("Required field 'status' is missing");
        }

        @k
        public final a b(@k q8.c city) {
            g0.p(city, "city");
            this.f81891e = city;
            return this;
        }

        @k
        public final a c(@k String detail) {
            g0.p(detail, "detail");
            this.f81893g = detail;
            return this;
        }

        @k
        public final a d(@l q8.c cVar) {
            this.f81892f = cVar;
            return this;
        }

        @k
        public final a e(int i11) {
            this.f81887a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a f(@k String mobile) {
            g0.p(mobile, "mobile");
            this.f81889c = mobile;
            return this;
        }

        @k
        public final a g(@k String name) {
            g0.p(name, "name");
            this.f81888b = name;
            return this;
        }

        @k
        public final a h(@k q8.c province) {
            g0.p(province, "province");
            this.f81890d = province;
            return this;
        }

        @k
        public final a i(int i11) {
            this.f81894h = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f81887a = null;
            this.f81888b = null;
            this.f81889c = null;
            this.f81890d = null;
            this.f81891e = null;
            this.f81892f = null;
            this.f81893g = null;
            this.f81894h = null;
        }

        public a(@k f source) {
            g0.p(source, "source");
            this.f81887a = Integer.valueOf(source.f81879a);
            this.f81888b = source.f81880b;
            this.f81889c = source.f81881c;
            this.f81890d = source.f81882d;
            this.f81891e = source.f81883e;
            this.f81892f = source.f81884f;
            this.f81893g = source.f81885g;
            this.f81894h = Integer.valueOf(source.f81886h);
        }
    }
}
