package m8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C0875c f72600g = new C0875c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<c, b> f72601h = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f72602a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f72603b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @w00.g
    public final String f72604c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f72605d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final com.baicizhan.biz.online.bs_users.a f72606e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f72607f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol, @k b builder) {
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
                            builder.c(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(com.baicizhan.biz.online.bs_users.a.f15923g.read(protocol));
                            break;
                        }
                    case 6:
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
        public void write(@k i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBQRCodeResp");
            protocol.Q6(ma.b.f72948u, 1, (byte) 8);
            protocol.l5(struct.f72602a);
            protocol.N2();
            protocol.Q6("action", 2, (byte) 11);
            protocol.p1(struct.f72603b);
            protocol.N2();
            if (struct.f72604c != null) {
                protocol.Q6("message", 3, (byte) 11);
                protocol.p1(struct.f72604c);
                protocol.N2();
            }
            if (struct.f72605d != null) {
                protocol.Q6(ma.b.f72894c, 4, (byte) 8);
                protocol.l5(struct.f72605d.intValue());
                protocol.N2();
            }
            if (struct.f72606e != null) {
                protocol.Q6("redirect_info", 5, (byte) 12);
                com.baicizhan.biz.online.bs_users.a.f15923g.write(protocol, struct.f72606e);
                protocol.N2();
            }
            if (struct.f72607f != null) {
                protocol.Q6("paper_book_id", 6, (byte) 8);
                protocol.l5(struct.f72607f.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m8.c$c, reason: collision with other inner class name */
    public static final class C0875c {
        public /* synthetic */ C0875c(v vVar) {
            this();
        }

        public C0875c() {
        }
    }

    public c(int i11, @k String action, @l String str, @l Integer num, @l com.baicizhan.biz.online.bs_users.a aVar, @l Integer num2) {
        g0.p(action, "action");
        this.f72602a = i11;
        this.f72603b = action;
        this.f72604c = str;
        this.f72605d = num;
        this.f72606e = aVar;
        this.f72607f = num2;
    }

    public static /* synthetic */ c h(c cVar, int i11, String str, String str2, Integer num, com.baicizhan.biz.online.bs_users.a aVar, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f72602a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f72603b;
        }
        if ((i12 & 4) != 0) {
            str2 = cVar.f72604c;
        }
        if ((i12 & 8) != 0) {
            num = cVar.f72605d;
        }
        if ((i12 & 16) != 0) {
            aVar = cVar.f72606e;
        }
        if ((i12 & 32) != 0) {
            num2 = cVar.f72607f;
        }
        com.baicizhan.biz.online.bs_users.a aVar2 = aVar;
        Integer num3 = num2;
        return cVar.g(i11, str, str2, num, aVar2, num3);
    }

    public final int a() {
        return this.f72602a;
    }

    @k
    public final String b() {
        return this.f72603b;
    }

    @l
    public final String c() {
        return this.f72604c;
    }

    @l
    public final Integer d() {
        return this.f72605d;
    }

    @l
    public final com.baicizhan.biz.online.bs_users.a e() {
        return this.f72606e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f72602a == cVar.f72602a && g0.g(this.f72603b, cVar.f72603b) && g0.g(this.f72604c, cVar.f72604c) && g0.g(this.f72605d, cVar.f72605d) && g0.g(this.f72606e, cVar.f72606e) && g0.g(this.f72607f, cVar.f72607f);
    }

    @l
    public final Integer f() {
        return this.f72607f;
    }

    @k
    public final c g(int i11, @k String action, @l String str, @l Integer num, @l com.baicizhan.biz.online.bs_users.a aVar, @l Integer num2) {
        g0.p(action, "action");
        return new c(i11, action, str, num, aVar, num2);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f72602a) * 31) + this.f72603b.hashCode()) * 31;
        String str = this.f72604c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f72605d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        com.baicizhan.biz.online.bs_users.a aVar = this.f72606e;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num2 = this.f72607f;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BBQRCodeResp(error_code=" + this.f72602a + ", action=" + this.f72603b + ", message=" + this.f72604c + ", word_level_id=" + this.f72605d + ", redirect_info=" + this.f72606e + ", paper_book_id=" + this.f72607f + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f72601h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBQRCodeResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBQRCodeResp.kt\ncom/baicizhan/biz/online/bs_users/BBQRCodeResp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1#2:245\n*E\n"})
    public static final class b implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f72608a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f72609b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f72610c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f72611d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public com.baicizhan.biz.online.bs_users.a f72612e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public Integer f72613f;

        public b() {
            this.f72608a = null;
            this.f72609b = null;
            this.f72610c = null;
            this.f72611d = null;
            this.f72612e = null;
            this.f72613f = null;
        }

        @k
        public final b a(@k String action) {
            g0.p(action, "action");
            this.f72609b = action;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f72608a;
            if (num == null) {
                throw new IllegalStateException("Required field 'error_code' is missing");
            }
            int intValue = num.intValue();
            String str = this.f72609b;
            if (str != null) {
                return new c(intValue, str, this.f72610c, this.f72611d, this.f72612e, this.f72613f);
            }
            throw new IllegalStateException("Required field 'action' is missing");
        }

        @k
        public final b c(int i11) {
            this.f72608a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final b d(@l String str) {
            this.f72610c = str;
            return this;
        }

        @k
        public final b e(@l Integer num) {
            this.f72613f = num;
            return this;
        }

        @k
        public final b f(@l com.baicizhan.biz.online.bs_users.a aVar) {
            this.f72612e = aVar;
            return this;
        }

        @k
        public final b g(@l Integer num) {
            this.f72611d = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f72608a = null;
            this.f72609b = null;
            this.f72610c = null;
            this.f72611d = null;
            this.f72612e = null;
            this.f72613f = null;
        }

        public b(@k c source) {
            g0.p(source, "source");
            this.f72608a = Integer.valueOf(source.f72602a);
            this.f72609b = source.f72603b;
            this.f72610c = source.f72604c;
            this.f72611d = source.f72605d;
            this.f72612e = source.f72606e;
            this.f72613f = source.f72607f;
        }
    }
}
