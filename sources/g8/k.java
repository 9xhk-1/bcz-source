package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f53301g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, b> f53302h = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53303a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53304b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f53305c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53306d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53307e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53308f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<k, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.f(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BookAd");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f53303a);
            protocol.N2();
            protocol.Q6("show_name", 2, (byte) 11);
            protocol.p1(struct.f53304b);
            protocol.N2();
            protocol.Q6("jump_type", 3, (byte) 8);
            protocol.l5(struct.f53305c);
            protocol.N2();
            protocol.Q6("local_link", 4, (byte) 11);
            protocol.p1(struct.f53306d);
            protocol.N2();
            protocol.Q6("taobao_link", 5, (byte) 11);
            protocol.p1(struct.f53307e);
            protocol.N2();
            if (struct.f53308f != null) {
                protocol.Q6("aid", 6, (byte) 11);
                protocol.p1(struct.f53308f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public k(int i11, @m80.k String show_name, int i12, @m80.k String local_link, @m80.k String taobao_link, @m80.l String str) {
        g0.p(show_name, "show_name");
        g0.p(local_link, "local_link");
        g0.p(taobao_link, "taobao_link");
        this.f53303a = i11;
        this.f53304b = show_name;
        this.f53305c = i12;
        this.f53306d = local_link;
        this.f53307e = taobao_link;
        this.f53308f = str;
    }

    public static /* synthetic */ k h(k kVar, int i11, String str, int i12, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = kVar.f53303a;
        }
        if ((i13 & 2) != 0) {
            str = kVar.f53304b;
        }
        if ((i13 & 4) != 0) {
            i12 = kVar.f53305c;
        }
        if ((i13 & 8) != 0) {
            str2 = kVar.f53306d;
        }
        if ((i13 & 16) != 0) {
            str3 = kVar.f53307e;
        }
        if ((i13 & 32) != 0) {
            str4 = kVar.f53308f;
        }
        String str5 = str3;
        String str6 = str4;
        return kVar.g(i11, str, i12, str2, str5, str6);
    }

    public final int a() {
        return this.f53303a;
    }

    @m80.k
    public final String b() {
        return this.f53304b;
    }

    public final int c() {
        return this.f53305c;
    }

    @m80.k
    public final String d() {
        return this.f53306d;
    }

    @m80.k
    public final String e() {
        return this.f53307e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f53303a == kVar.f53303a && g0.g(this.f53304b, kVar.f53304b) && this.f53305c == kVar.f53305c && g0.g(this.f53306d, kVar.f53306d) && g0.g(this.f53307e, kVar.f53307e) && g0.g(this.f53308f, kVar.f53308f);
    }

    @m80.l
    public final String f() {
        return this.f53308f;
    }

    @m80.k
    public final k g(int i11, @m80.k String show_name, int i12, @m80.k String local_link, @m80.k String taobao_link, @m80.l String str) {
        g0.p(show_name, "show_name");
        g0.p(local_link, "local_link");
        g0.p(taobao_link, "taobao_link");
        return new k(i11, show_name, i12, local_link, taobao_link, str);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f53303a) * 31) + this.f53304b.hashCode()) * 31) + Integer.hashCode(this.f53305c)) * 31) + this.f53306d.hashCode()) * 31) + this.f53307e.hashCode()) * 31;
        String str = this.f53308f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "BookAd(book_id=" + this.f53303a + ", show_name=" + this.f53304b + ", jump_type=" + this.f53305c + ", local_link=" + this.f53306d + ", taobao_link=" + this.f53307e + ", aid=" + this.f53308f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53302h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBookAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookAd.kt\ncom/baicizhan/biz/online/advertise_api/BookAd$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,239:1\n1#2:240\n*E\n"})
    public static final class b implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53309a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53310b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f53311c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53312d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f53313e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f53314f;

        public b() {
            this.f53309a = null;
            this.f53310b = null;
            this.f53311c = null;
            this.f53312d = null;
            this.f53313e = null;
            this.f53314f = null;
        }

        @m80.k
        public final b a(@m80.l String str) {
            this.f53314f = str;
            return this;
        }

        @m80.k
        public final b b(int i11) {
            this.f53309a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k build() {
            Integer num = this.f53309a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f53310b;
            if (str == null) {
                throw new IllegalStateException("Required field 'show_name' is missing");
            }
            Integer num2 = this.f53311c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'jump_type' is missing");
            }
            int intValue2 = num2.intValue();
            String str2 = this.f53312d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'local_link' is missing");
            }
            String str3 = this.f53313e;
            if (str3 != null) {
                return new k(intValue, str, intValue2, str2, str3, this.f53314f);
            }
            throw new IllegalStateException("Required field 'taobao_link' is missing");
        }

        @m80.k
        public final b d(int i11) {
            this.f53311c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(@m80.k String local_link) {
            g0.p(local_link, "local_link");
            this.f53312d = local_link;
            return this;
        }

        @m80.k
        public final b f(@m80.k String show_name) {
            g0.p(show_name, "show_name");
            this.f53310b = show_name;
            return this;
        }

        @m80.k
        public final b g(@m80.k String taobao_link) {
            g0.p(taobao_link, "taobao_link");
            this.f53313e = taobao_link;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53309a = null;
            this.f53310b = null;
            this.f53311c = null;
            this.f53312d = null;
            this.f53313e = null;
            this.f53314f = null;
        }

        public b(@m80.k k source) {
            g0.p(source, "source");
            this.f53309a = Integer.valueOf(source.f53303a);
            this.f53310b = source.f53304b;
            this.f53311c = Integer.valueOf(source.f53305c);
            this.f53312d = source.f53306d;
            this.f53313e = source.f53307e;
            this.f53314f = source.f53308f;
        }
    }
}
