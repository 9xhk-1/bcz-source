package y8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f99649i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f99650j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f99651a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99652b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99653c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99654d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99655e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99656f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final int f99657g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f99658h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
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
                            builder.g(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserMachineInfo");
            protocol.Q6("machine_id", 1, (byte) 10);
            protocol.q7(struct.f99651a);
            protocol.N2();
            protocol.Q6("user_machine_name", 2, (byte) 11);
            protocol.p1(struct.f99652b);
            protocol.N2();
            protocol.Q6("machine_model", 3, (byte) 11);
            protocol.p1(struct.f99653c);
            protocol.N2();
            protocol.Q6("sn_id", 4, (byte) 11);
            protocol.p1(struct.f99654d);
            protocol.N2();
            protocol.Q6("machine_version", 5, (byte) 11);
            protocol.p1(struct.f99655e);
            protocol.N2();
            protocol.Q6("machine_pic", 6, (byte) 11);
            protocol.p1(struct.f99656f);
            protocol.N2();
            protocol.Q6("machine_connect_status", 7, (byte) 8);
            protocol.l5(struct.f99657g);
            protocol.N2();
            if (struct.f99658h != null) {
                protocol.Q6("device_type", 8, (byte) 8);
                protocol.l5(struct.f99658h.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public l(long j11, @m80.k String user_machine_name, @m80.k String machine_model, @m80.k String sn_id, @m80.k String machine_version, @m80.k String machine_pic, int i11, @m80.l Integer num) {
        g0.p(user_machine_name, "user_machine_name");
        g0.p(machine_model, "machine_model");
        g0.p(sn_id, "sn_id");
        g0.p(machine_version, "machine_version");
        g0.p(machine_pic, "machine_pic");
        this.f99651a = j11;
        this.f99652b = user_machine_name;
        this.f99653c = machine_model;
        this.f99654d = sn_id;
        this.f99655e = machine_version;
        this.f99656f = machine_pic;
        this.f99657g = i11;
        this.f99658h = num;
    }

    public static /* synthetic */ l j(l lVar, long j11, String str, String str2, String str3, String str4, String str5, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = lVar.f99651a;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = lVar.f99652b;
        }
        String str6 = str;
        if ((i12 & 4) != 0) {
            str2 = lVar.f99653c;
        }
        String str7 = str2;
        if ((i12 & 8) != 0) {
            str3 = lVar.f99654d;
        }
        return lVar.i(j12, str6, str7, str3, (i12 & 16) != 0 ? lVar.f99655e : str4, (i12 & 32) != 0 ? lVar.f99656f : str5, (i12 & 64) != 0 ? lVar.f99657g : i11, (i12 & 128) != 0 ? lVar.f99658h : num);
    }

    public final long a() {
        return this.f99651a;
    }

    @m80.k
    public final String b() {
        return this.f99652b;
    }

    @m80.k
    public final String c() {
        return this.f99653c;
    }

    @m80.k
    public final String d() {
        return this.f99654d;
    }

    @m80.k
    public final String e() {
        return this.f99655e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f99651a == lVar.f99651a && g0.g(this.f99652b, lVar.f99652b) && g0.g(this.f99653c, lVar.f99653c) && g0.g(this.f99654d, lVar.f99654d) && g0.g(this.f99655e, lVar.f99655e) && g0.g(this.f99656f, lVar.f99656f) && this.f99657g == lVar.f99657g && g0.g(this.f99658h, lVar.f99658h);
    }

    @m80.k
    public final String f() {
        return this.f99656f;
    }

    public final int g() {
        return this.f99657g;
    }

    @m80.l
    public final Integer h() {
        return this.f99658h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Long.hashCode(this.f99651a) * 31) + this.f99652b.hashCode()) * 31) + this.f99653c.hashCode()) * 31) + this.f99654d.hashCode()) * 31) + this.f99655e.hashCode()) * 31) + this.f99656f.hashCode()) * 31) + Integer.hashCode(this.f99657g)) * 31;
        Integer num = this.f99658h;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public final l i(long j11, @m80.k String user_machine_name, @m80.k String machine_model, @m80.k String sn_id, @m80.k String machine_version, @m80.k String machine_pic, int i11, @m80.l Integer num) {
        g0.p(user_machine_name, "user_machine_name");
        g0.p(machine_model, "machine_model");
        g0.p(sn_id, "sn_id");
        g0.p(machine_version, "machine_version");
        g0.p(machine_pic, "machine_pic");
        return new l(j11, user_machine_name, machine_model, sn_id, machine_version, machine_pic, i11, num);
    }

    @m80.k
    public String toString() {
        return "UserMachineInfo(machine_id=" + this.f99651a + ", user_machine_name=" + this.f99652b + ", machine_model=" + this.f99653c + ", sn_id=" + this.f99654d + ", machine_version=" + this.f99655e + ", machine_pic=" + this.f99656f + ", machine_connect_status=" + this.f99657g + ", device_type=" + this.f99658h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99650j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserMachineInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMachineInfo.kt\ncom/baicizhan/biz/online/user_book/UserMachineInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f99659a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f99660b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f99661c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f99662d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f99663e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f99664f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f99665g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f99666h;

        public a() {
            this.f99659a = null;
            this.f99660b = null;
            this.f99661c = null;
            this.f99662d = null;
            this.f99663e = null;
            this.f99664f = null;
            this.f99665g = null;
            this.f99666h = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            Long l11 = this.f99659a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'machine_id' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f99660b;
            if (str == null) {
                throw new IllegalStateException("Required field 'user_machine_name' is missing");
            }
            String str2 = this.f99661c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'machine_model' is missing");
            }
            String str3 = this.f99662d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'sn_id' is missing");
            }
            String str4 = this.f99663e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'machine_version' is missing");
            }
            String str5 = this.f99664f;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'machine_pic' is missing");
            }
            Integer num = this.f99665g;
            if (num != null) {
                return new l(longValue, str, str2, str3, str4, str5, num.intValue(), this.f99666h);
            }
            throw new IllegalStateException("Required field 'machine_connect_status' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f99666h = num;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f99665g = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f99659a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String machine_model) {
            g0.p(machine_model, "machine_model");
            this.f99661c = machine_model;
            return this;
        }

        @m80.k
        public final a f(@m80.k String machine_pic) {
            g0.p(machine_pic, "machine_pic");
            this.f99664f = machine_pic;
            return this;
        }

        @m80.k
        public final a g(@m80.k String machine_version) {
            g0.p(machine_version, "machine_version");
            this.f99663e = machine_version;
            return this;
        }

        @m80.k
        public final a h(@m80.k String sn_id) {
            g0.p(sn_id, "sn_id");
            this.f99662d = sn_id;
            return this;
        }

        @m80.k
        public final a i(@m80.k String user_machine_name) {
            g0.p(user_machine_name, "user_machine_name");
            this.f99660b = user_machine_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99659a = null;
            this.f99660b = null;
            this.f99661c = null;
            this.f99662d = null;
            this.f99663e = null;
            this.f99664f = null;
            this.f99665g = null;
            this.f99666h = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f99659a = Long.valueOf(source.f99651a);
            this.f99660b = source.f99652b;
            this.f99661c = source.f99653c;
            this.f99662d = source.f99654d;
            this.f99663e = source.f99655e;
            this.f99664f = source.f99656f;
            this.f99665g = Integer.valueOf(source.f99657g);
            this.f99666h = source.f99658h;
        }
    }
}
