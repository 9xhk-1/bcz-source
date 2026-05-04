package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f91966d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f91967e = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final j f91968a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final j f91969b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final j f91970c;

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
                        } else if (b11 == 12) {
                            builder.c(j.f91949j.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.d(j.f91949j.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.b(j.f91949j.read(protocol));
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
            protocol.g6("UserEntitlementInfos");
            if (struct.f91968a != null) {
                protocol.Q6("member_info", 1, (byte) 12);
                j.f91949j.write(protocol, struct.f91968a);
                protocol.N2();
            }
            if (struct.f91969b != null) {
                protocol.Q6("word_energy_info", 2, (byte) 12);
                j.f91949j.write(protocol, struct.f91969b);
                protocol.N2();
            }
            if (struct.f91970c != null) {
                protocol.Q6("sentence_energy_info", 3, (byte) 12);
                j.f91949j.write(protocol, struct.f91970c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public k(@m80.l j jVar, @m80.l j jVar2, @m80.l j jVar3) {
        this.f91968a = jVar;
        this.f91969b = jVar2;
        this.f91970c = jVar3;
    }

    public static /* synthetic */ k e(k kVar, j jVar, j jVar2, j jVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = kVar.f91968a;
        }
        if ((i11 & 2) != 0) {
            jVar2 = kVar.f91969b;
        }
        if ((i11 & 4) != 0) {
            jVar3 = kVar.f91970c;
        }
        return kVar.d(jVar, jVar2, jVar3);
    }

    @m80.l
    public final j a() {
        return this.f91968a;
    }

    @m80.l
    public final j b() {
        return this.f91969b;
    }

    @m80.l
    public final j c() {
        return this.f91970c;
    }

    @m80.k
    public final k d(@m80.l j jVar, @m80.l j jVar2, @m80.l j jVar3) {
        return new k(jVar, jVar2, jVar3);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return g0.g(this.f91968a, kVar.f91968a) && g0.g(this.f91969b, kVar.f91969b) && g0.g(this.f91970c, kVar.f91970c);
    }

    public int hashCode() {
        j jVar = this.f91968a;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        j jVar2 = this.f91969b;
        int hashCode2 = (hashCode + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        j jVar3 = this.f91970c;
        return hashCode2 + (jVar3 != null ? jVar3.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserEntitlementInfos(member_info=" + this.f91968a + ", word_energy_info=" + this.f91969b + ", sentence_energy_info=" + this.f91970c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91967e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserEntitlementInfos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserEntitlementInfos.kt\ncom/baicizhan/biz/online/strategy_api/UserEntitlementInfos$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n1#2:160\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public j f91971a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public j f91972b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public j f91973c;

        public a() {
            this.f91971a = null;
            this.f91972b = null;
            this.f91973c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k build() {
            return new k(this.f91971a, this.f91972b, this.f91973c);
        }

        @m80.k
        public final a b(@m80.l j jVar) {
            this.f91971a = jVar;
            return this;
        }

        @m80.k
        public final a c(@m80.l j jVar) {
            this.f91973c = jVar;
            return this;
        }

        @m80.k
        public final a d(@m80.l j jVar) {
            this.f91972b = jVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91971a = null;
            this.f91972b = null;
            this.f91973c = null;
        }

        public a(@m80.k k source) {
            g0.p(source, "source");
            this.f91971a = source.f91968a;
            this.f91972b = source.f91969b;
            this.f91973c = source.f91970c;
        }
    }
}
