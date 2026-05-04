package q8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f81843e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<b, C1009b> f81844f = new a();

    /* renamed from: a, reason: collision with root package name */
    @l
    @w00.g
    public final q8.c f81845a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @w00.g
    public final q8.c f81846b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @w00.g
    public final q8.c f81847c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final q8.c f81848d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C1009b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C1009b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol, @k C1009b builder) {
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
                            } else if (b11 == 12) {
                                builder.e(q8.c.f81854f.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 12) {
                            builder.c(q8.c.f81854f.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.b(q8.c.f81854f.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.d(q8.c.f81854f.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AddressMatchResp");
            if (struct.f81845a != null) {
                protocol.Q6("province", 1, (byte) 12);
                q8.c.f81854f.write(protocol, struct.f81845a);
                protocol.N2();
            }
            if (struct.f81846b != null) {
                protocol.Q6("city", 2, (byte) 12);
                q8.c.f81854f.write(protocol, struct.f81846b);
                protocol.N2();
            }
            if (struct.f81847c != null) {
                protocol.Q6("district", 3, (byte) 12);
                q8.c.f81854f.write(protocol, struct.f81847c);
                protocol.N2();
            }
            if (struct.f81848d != null) {
                protocol.Q6("street", 4, (byte) 12);
                q8.c.f81854f.write(protocol, struct.f81848d);
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

    public b(@l q8.c cVar, @l q8.c cVar2, @l q8.c cVar3, @l q8.c cVar4) {
        this.f81845a = cVar;
        this.f81846b = cVar2;
        this.f81847c = cVar3;
        this.f81848d = cVar4;
    }

    public static /* synthetic */ b f(b bVar, q8.c cVar, q8.c cVar2, q8.c cVar3, q8.c cVar4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = bVar.f81845a;
        }
        if ((i11 & 2) != 0) {
            cVar2 = bVar.f81846b;
        }
        if ((i11 & 4) != 0) {
            cVar3 = bVar.f81847c;
        }
        if ((i11 & 8) != 0) {
            cVar4 = bVar.f81848d;
        }
        return bVar.e(cVar, cVar2, cVar3, cVar4);
    }

    @l
    public final q8.c a() {
        return this.f81845a;
    }

    @l
    public final q8.c b() {
        return this.f81846b;
    }

    @l
    public final q8.c c() {
        return this.f81847c;
    }

    @l
    public final q8.c d() {
        return this.f81848d;
    }

    @k
    public final b e(@l q8.c cVar, @l q8.c cVar2, @l q8.c cVar3, @l q8.c cVar4) {
        return new b(cVar, cVar2, cVar3, cVar4);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f81845a, bVar.f81845a) && g0.g(this.f81846b, bVar.f81846b) && g0.g(this.f81847c, bVar.f81847c) && g0.g(this.f81848d, bVar.f81848d);
    }

    public int hashCode() {
        q8.c cVar = this.f81845a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        q8.c cVar2 = this.f81846b;
        int hashCode2 = (hashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        q8.c cVar3 = this.f81847c;
        int hashCode3 = (hashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        q8.c cVar4 = this.f81848d;
        return hashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AddressMatchResp(province=" + this.f81845a + ", city=" + this.f81846b + ", district=" + this.f81847c + ", street=" + this.f81848d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f81844f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAddressMatchResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressMatchResp.kt\ncom/baicizhan/biz/online/mall_proxy/AddressMatchResp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
    /* renamed from: q8.b$b, reason: collision with other inner class name */
    public static final class C1009b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public q8.c f81849a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public q8.c f81850b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public q8.c f81851c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public q8.c f81852d;

        public C1009b() {
            this.f81849a = null;
            this.f81850b = null;
            this.f81851c = null;
            this.f81852d = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            return new b(this.f81849a, this.f81850b, this.f81851c, this.f81852d);
        }

        @k
        public final C1009b b(@l q8.c cVar) {
            this.f81850b = cVar;
            return this;
        }

        @k
        public final C1009b c(@l q8.c cVar) {
            this.f81851c = cVar;
            return this;
        }

        @k
        public final C1009b d(@l q8.c cVar) {
            this.f81849a = cVar;
            return this;
        }

        @k
        public final C1009b e(@l q8.c cVar) {
            this.f81852d = cVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f81849a = null;
            this.f81850b = null;
            this.f81851c = null;
            this.f81852d = null;
        }

        public C1009b(@k b source) {
            g0.p(source, "source");
            this.f81849a = source.f81845a;
            this.f81850b = source.f81846b;
            this.f81851c = source.f81847c;
            this.f81852d = source.f81848d;
        }
    }
}
