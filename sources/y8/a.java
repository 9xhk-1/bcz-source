package y8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f99511c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f99512d = new C1349a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f99513a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final k f99514b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y8.a$a, reason: collision with other inner class name */
    public static final class C1349a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        builder.c(k.f99634i.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.b(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AddSingleWordRsp");
            protocol.Q6("updated_at", 1, (byte) 10);
            protocol.q7(struct.f99513a);
            protocol.N2();
            if (struct.f99514b != null) {
                protocol.Q6("word", 2, (byte) 12);
                k.f99634i.write(protocol, struct.f99514b);
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

    public a(long j11, @m80.l k kVar) {
        this.f99513a = j11;
        this.f99514b = kVar;
    }

    public static /* synthetic */ a d(a aVar, long j11, k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aVar.f99513a;
        }
        if ((i11 & 2) != 0) {
            kVar = aVar.f99514b;
        }
        return aVar.c(j11, kVar);
    }

    public final long a() {
        return this.f99513a;
    }

    @m80.l
    public final k b() {
        return this.f99514b;
    }

    @m80.k
    public final a c(long j11, @m80.l k kVar) {
        return new a(j11, kVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f99513a == aVar.f99513a && g0.g(this.f99514b, aVar.f99514b);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f99513a) * 31;
        k kVar = this.f99514b;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    @m80.k
    public String toString() {
        return "AddSingleWordRsp(updated_at=" + this.f99513a + ", word=" + this.f99514b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99512d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAddSingleWordRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddSingleWordRsp.kt\ncom/baicizhan/biz/online/user_book/AddSingleWordRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f99515a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public k f99516b;

        public b() {
            this.f99515a = null;
            this.f99516b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            Long l11 = this.f99515a;
            if (l11 != null) {
                return new a(l11.longValue(), this.f99516b);
            }
            throw new IllegalStateException("Required field 'updated_at' is missing");
        }

        @m80.k
        public final b b(long j11) {
            this.f99515a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b c(@m80.l k kVar) {
            this.f99516b = kVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99515a = null;
            this.f99516b = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f99515a = Long.valueOf(source.f99513a);
            this.f99516b = source.f99514b;
        }
    }
}
