package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f53363b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, a> f53364c = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final q f53365a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
                } else if (b11 == 12) {
                    builder.b(q.f53352g.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MainViewGameTopAdv");
            if (struct.f53365a != null) {
                protocol.Q6("top_ad", 1, (byte) 12);
                q.f53352g.write(protocol, struct.f53365a);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public r(@m80.l q qVar) {
        this.f53365a = qVar;
    }

    public static /* synthetic */ r c(r rVar, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = rVar.f53365a;
        }
        return rVar.b(qVar);
    }

    @m80.l
    public final q a() {
        return this.f53365a;
    }

    @m80.k
    public final r b(@m80.l q qVar) {
        return new r(qVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && g0.g(this.f53365a, ((r) obj).f53365a);
    }

    public int hashCode() {
        q qVar = this.f53365a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    @m80.k
    public String toString() {
        return "MainViewGameTopAdv(top_ad=" + this.f53365a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53364c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMainViewGameTopAdv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewGameTopAdv.kt\ncom/baicizhan/biz/online/advertise_api/MainViewGameTopAdv$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public q f53366a;

        public a() {
            this.f53366a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r build() {
            return new r(this.f53366a);
        }

        @m80.k
        public final a b(@m80.l q qVar) {
            this.f53366a = qVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53366a = null;
        }

        public a(@m80.k r source) {
            g0.p(source, "source");
            this.f53366a = source.f53365a;
        }
    }
}
