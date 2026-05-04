package j8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f63876d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p, a> f63877e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63878a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f63879b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63880c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k p struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6(y9.e.f99707g);
            protocol.Q6(a.d.C0245a.f16161a, 1, (byte) 11);
            protocol.p1(struct.f63878a);
            protocol.N2();
            protocol.Q6("bit_flag", 2, (byte) 8);
            protocol.l5(struct.f63879b);
            protocol.N2();
            protocol.Q6("config_json", 3, (byte) 11);
            protocol.p1(struct.f63880c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p(@m80.k String key, int i11, @m80.k String config_json) {
        g0.p(key, "key");
        g0.p(config_json, "config_json");
        this.f63878a = key;
        this.f63879b = i11;
        this.f63880c = config_json;
    }

    public static /* synthetic */ p e(p pVar, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = pVar.f63878a;
        }
        if ((i12 & 2) != 0) {
            i11 = pVar.f63879b;
        }
        if ((i12 & 4) != 0) {
            str2 = pVar.f63880c;
        }
        return pVar.d(str, i11, str2);
    }

    @m80.k
    public final String a() {
        return this.f63878a;
    }

    public final int b() {
        return this.f63879b;
    }

    @m80.k
    public final String c() {
        return this.f63880c;
    }

    @m80.k
    public final p d(@m80.k String key, int i11, @m80.k String config_json) {
        g0.p(key, "key");
        g0.p(config_json, "config_json");
        return new p(key, i11, config_json);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return g0.g(this.f63878a, pVar.f63878a) && this.f63879b == pVar.f63879b && g0.g(this.f63880c, pVar.f63880c);
    }

    public int hashCode() {
        return (((this.f63878a.hashCode() * 31) + Integer.hashCode(this.f63879b)) * 31) + this.f63880c.hashCode();
    }

    @m80.k
    public String toString() {
        return "StaticConfig(key=" + this.f63878a + ", bit_flag=" + this.f63879b + ", config_json=" + this.f63880c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63877e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nStaticConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticConfig.kt\ncom/baicizhan/biz/online/bcz_system_api/StaticConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
    public static final class a implements ts.f<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f63881a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f63882b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f63883c;

        public a() {
            this.f63881a = null;
            this.f63882b = null;
            this.f63883c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f63882b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p build() {
            String str = this.f63881a;
            if (str == null) {
                throw new IllegalStateException("Required field 'key' is missing");
            }
            Integer num = this.f63882b;
            if (num == null) {
                throw new IllegalStateException("Required field 'bit_flag' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f63883c;
            if (str2 != null) {
                return new p(str, intValue, str2);
            }
            throw new IllegalStateException("Required field 'config_json' is missing");
        }

        @m80.k
        public final a c(@m80.k String config_json) {
            g0.p(config_json, "config_json");
            this.f63883c = config_json;
            return this;
        }

        @m80.k
        public final a d(@m80.k String key) {
            g0.p(key, "key");
            this.f63881a = key;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63881a = null;
            this.f63882b = null;
            this.f63883c = null;
        }

        public a(@m80.k p source) {
            g0.p(source, "source");
            this.f63881a = source.f63878a;
            this.f63882b = Integer.valueOf(source.f63879b);
            this.f63883c = source.f63880c;
        }
    }
}
