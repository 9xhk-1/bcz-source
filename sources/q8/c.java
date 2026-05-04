package q8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C1010c f81853e = new C1010c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<c, a> f81854f = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f81855a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f81856b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f81857c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f81858d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<c, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol, @k a builder) {
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
                            } else if (b11 == 8) {
                                builder.e(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ChildAddress");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f81855a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f81856b);
            protocol.N2();
            protocol.Q6("parent_id", 3, (byte) 8);
            protocol.l5(struct.f81857c);
            protocol.N2();
            protocol.Q6("type", 4, (byte) 8);
            protocol.l5(struct.f81858d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: q8.c$c, reason: collision with other inner class name */
    public static final class C1010c {
        public /* synthetic */ C1010c(v vVar) {
            this();
        }

        public C1010c() {
        }
    }

    public c(int i11, @k String name, int i12, int i13) {
        g0.p(name, "name");
        this.f81855a = i11;
        this.f81856b = name;
        this.f81857c = i12;
        this.f81858d = i13;
    }

    public static /* synthetic */ c f(c cVar, int i11, String str, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = cVar.f81855a;
        }
        if ((i14 & 2) != 0) {
            str = cVar.f81856b;
        }
        if ((i14 & 4) != 0) {
            i12 = cVar.f81857c;
        }
        if ((i14 & 8) != 0) {
            i13 = cVar.f81858d;
        }
        return cVar.e(i11, str, i12, i13);
    }

    public final int a() {
        return this.f81855a;
    }

    @k
    public final String b() {
        return this.f81856b;
    }

    public final int c() {
        return this.f81857c;
    }

    public final int d() {
        return this.f81858d;
    }

    @k
    public final c e(int i11, @k String name, int i12, int i13) {
        g0.p(name, "name");
        return new c(i11, name, i12, i13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f81855a == cVar.f81855a && g0.g(this.f81856b, cVar.f81856b) && this.f81857c == cVar.f81857c && this.f81858d == cVar.f81858d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f81855a) * 31) + this.f81856b.hashCode()) * 31) + Integer.hashCode(this.f81857c)) * 31) + Integer.hashCode(this.f81858d);
    }

    @k
    public String toString() {
        return "ChildAddress(id=" + this.f81855a + ", name=" + this.f81856b + ", parent_id=" + this.f81857c + ", type=" + this.f81858d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f81854f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nChildAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildAddress.kt\ncom/baicizhan/biz/online/mall_proxy/ChildAddress$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f81859a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f81860b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f81861c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f81862d;

        public a() {
            this.f81859a = null;
            this.f81860b = null;
            this.f81861c = null;
            this.f81862d = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f81859a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f81860b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            Integer num2 = this.f81861c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'parent_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f81862d;
            if (num3 != null) {
                return new c(intValue, str, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'type' is missing");
        }

        @k
        public final a b(int i11) {
            this.f81859a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a c(@k String name) {
            g0.p(name, "name");
            this.f81860b = name;
            return this;
        }

        @k
        public final a d(int i11) {
            this.f81861c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a e(int i11) {
            this.f81862d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f81859a = null;
            this.f81860b = null;
            this.f81861c = null;
            this.f81862d = null;
        }

        public a(@k c source) {
            g0.p(source, "source");
            this.f81859a = Integer.valueOf(source.f81855a);
            this.f81860b = source.f81856b;
            this.f81861c = Integer.valueOf(source.f81857c);
            this.f81862d = Integer.valueOf(source.f81858d);
        }
    }
}
