package v8;

import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f93359i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f93360j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f93361a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93362b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93363c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93364d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93365e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93366f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93367g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93368h;

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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
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
                            builder.h(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SearchSchoolRequest");
            protocol.Q6("page_num", 1, (byte) 8);
            protocol.l5(struct.f93361a);
            protocol.N2();
            protocol.Q6("page_size", 2, (byte) 8);
            protocol.l5(struct.f93362b);
            protocol.N2();
            if (struct.f93363c != null) {
                protocol.Q6(HwPayConstant.KEY_COUNTRY, 3, (byte) 11);
                protocol.p1(struct.f93363c);
                protocol.N2();
            }
            if (struct.f93364d != null) {
                protocol.Q6("province", 4, (byte) 11);
                protocol.p1(struct.f93364d);
                protocol.N2();
            }
            if (struct.f93365e != null) {
                protocol.Q6("city", 5, (byte) 11);
                protocol.p1(struct.f93365e);
                protocol.N2();
            }
            if (struct.f93366f != null) {
                protocol.Q6("county", 6, (byte) 11);
                protocol.p1(struct.f93366f);
                protocol.N2();
            }
            if (struct.f93367g != null) {
                protocol.Q6("school_key", 7, (byte) 11);
                protocol.p1(struct.f93367g);
                protocol.N2();
            }
            if (struct.f93368h != null) {
                protocol.Q6("level", 8, (byte) 8);
                protocol.l5(struct.f93368h.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public p(int i11, int i12, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l Integer num) {
        this.f93361a = i11;
        this.f93362b = i12;
        this.f93363c = str;
        this.f93364d = str2;
        this.f93365e = str3;
        this.f93366f = str4;
        this.f93367g = str5;
        this.f93368h = num;
    }

    public static /* synthetic */ p j(p pVar, int i11, int i12, String str, String str2, String str3, String str4, String str5, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = pVar.f93361a;
        }
        if ((i13 & 2) != 0) {
            i12 = pVar.f93362b;
        }
        if ((i13 & 4) != 0) {
            str = pVar.f93363c;
        }
        if ((i13 & 8) != 0) {
            str2 = pVar.f93364d;
        }
        if ((i13 & 16) != 0) {
            str3 = pVar.f93365e;
        }
        if ((i13 & 32) != 0) {
            str4 = pVar.f93366f;
        }
        if ((i13 & 64) != 0) {
            str5 = pVar.f93367g;
        }
        if ((i13 & 128) != 0) {
            num = pVar.f93368h;
        }
        String str6 = str5;
        Integer num2 = num;
        String str7 = str3;
        String str8 = str4;
        return pVar.i(i11, i12, str, str2, str7, str8, str6, num2);
    }

    public final int a() {
        return this.f93361a;
    }

    public final int b() {
        return this.f93362b;
    }

    @m80.l
    public final String c() {
        return this.f93363c;
    }

    @m80.l
    public final String d() {
        return this.f93364d;
    }

    @m80.l
    public final String e() {
        return this.f93365e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f93361a == pVar.f93361a && this.f93362b == pVar.f93362b && g0.g(this.f93363c, pVar.f93363c) && g0.g(this.f93364d, pVar.f93364d) && g0.g(this.f93365e, pVar.f93365e) && g0.g(this.f93366f, pVar.f93366f) && g0.g(this.f93367g, pVar.f93367g) && g0.g(this.f93368h, pVar.f93368h);
    }

    @m80.l
    public final String f() {
        return this.f93366f;
    }

    @m80.l
    public final String g() {
        return this.f93367g;
    }

    @m80.l
    public final Integer h() {
        return this.f93368h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f93361a) * 31) + Integer.hashCode(this.f93362b)) * 31;
        String str = this.f93363c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93364d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93365e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93366f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f93367g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f93368h;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public final p i(int i11, int i12, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l Integer num) {
        return new p(i11, i12, str, str2, str3, str4, str5, num);
    }

    @m80.k
    public String toString() {
        return "SearchSchoolRequest(page_num=" + this.f93361a + ", page_size=" + this.f93362b + ", country=" + this.f93363c + ", province=" + this.f93364d + ", city=" + this.f93365e + ", county=" + this.f93366f + ", school_key=" + this.f93367g + ", level=" + this.f93368h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93360j.write(protocol, this);
    }

    public /* synthetic */ p(int i11, int i12, String str, String str2, String str3, String str4, String str5, Integer num, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 20 : i12, str, str2, str3, str4, str5, num);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSearchSchoolRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSchoolRequest.kt\ncom/baicizhan/biz/online/unified_user_service/SearchSchoolRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f93369a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93370b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93371c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93372d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f93373e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f93374f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f93375g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f93376h;

        public a() {
            this.f93369a = 0;
            this.f93370b = 20;
            this.f93369a = 0;
            this.f93370b = 20;
            this.f93371c = null;
            this.f93372d = null;
            this.f93373e = null;
            this.f93374f = null;
            this.f93375g = null;
            this.f93376h = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p build() {
            Integer num = this.f93369a;
            if (num == null) {
                throw new IllegalStateException("Required field 'page_num' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f93370b;
            if (num2 != null) {
                return new p(intValue, num2.intValue(), this.f93371c, this.f93372d, this.f93373e, this.f93374f, this.f93375g, this.f93376h);
            }
            throw new IllegalStateException("Required field 'page_size' is missing");
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f93373e = str;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f93371c = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f93374f = str;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f93376h = num;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f93369a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f93370b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f93372d = str;
            return this;
        }

        @m80.k
        public final a i(@m80.l String str) {
            this.f93375g = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93369a = 0;
            this.f93370b = 20;
            this.f93371c = null;
            this.f93372d = null;
            this.f93373e = null;
            this.f93374f = null;
            this.f93375g = null;
            this.f93376h = null;
        }

        public a(@m80.k p source) {
            g0.p(source, "source");
            this.f93369a = 0;
            this.f93370b = 20;
            this.f93369a = Integer.valueOf(source.f93361a);
            this.f93370b = Integer.valueOf(source.f93362b);
            this.f93371c = source.f93363c;
            this.f93372d = source.f93364d;
            this.f93373e = source.f93365e;
            this.f93374f = source.f93366f;
            this.f93375g = source.f93367g;
            this.f93376h = source.f93368h;
        }
    }
}
