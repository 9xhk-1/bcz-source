package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f58965d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f58966e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58967a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f58968b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f58969c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserAvatarRecordInfo");
            protocol.Q6("ip_type", 1, (byte) 8);
            protocol.l5(struct.f58967a);
            protocol.N2();
            protocol.Q6("ip_level", 2, (byte) 8);
            protocol.l5(struct.f58968b);
            protocol.N2();
            protocol.Q6("ip_exp", 3, (byte) 8);
            protocol.l5(struct.f58969c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k(int i11, int i12, int i13) {
        this.f58967a = i11;
        this.f58968b = i12;
        this.f58969c = i13;
    }

    public static /* synthetic */ k e(k kVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = kVar.f58967a;
        }
        if ((i14 & 2) != 0) {
            i12 = kVar.f58968b;
        }
        if ((i14 & 4) != 0) {
            i13 = kVar.f58969c;
        }
        return kVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f58967a;
    }

    public final int b() {
        return this.f58968b;
    }

    public final int c() {
        return this.f58969c;
    }

    @m80.k
    public final k d(int i11, int i12, int i13) {
        return new k(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f58967a == kVar.f58967a && this.f58968b == kVar.f58968b && this.f58969c == kVar.f58969c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f58967a) * 31) + Integer.hashCode(this.f58968b)) * 31) + Integer.hashCode(this.f58969c);
    }

    @m80.k
    public String toString() {
        return "UserAvatarRecordInfo(ip_type=" + this.f58967a + ", ip_level=" + this.f58968b + ", ip_exp=" + this.f58969c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58966e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserAvatarRecordInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAvatarRecordInfo.kt\ncom/baicizhan/biz/online/avatar_api/UserAvatarRecordInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58970a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f58971b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f58972c;

        public a() {
            this.f58970a = null;
            this.f58971b = null;
            this.f58972c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k build() {
            Integer num = this.f58970a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ip_type' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f58971b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'ip_level' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f58972c;
            if (num3 != null) {
                return new k(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'ip_exp' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f58972c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f58971b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f58970a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58970a = null;
            this.f58971b = null;
            this.f58972c = null;
        }

        public a(@m80.k k source) {
            g0.p(source, "source");
            this.f58970a = Integer.valueOf(source.f58967a);
            this.f58971b = Integer.valueOf(source.f58968b);
            this.f58972c = Integer.valueOf(source.f58969c);
        }
    }
}
