package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f91886c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f91887d = new C1227a();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final e f91888a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final e f91889b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: u8.a$a, reason: collision with other inner class name */
    public static final class C1227a implements ts.a<a, b> {
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
                        builder.c(e.f91915e.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.a(e.f91915e.read(protocol));
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
            protocol.g6("AppHomePageMemberStageInfo");
            if (struct.f91888a != null) {
                protocol.Q6("activity_icon_member_sale_info", 1, (byte) 12);
                e.f91915e.write(protocol, struct.f91888a);
                protocol.N2();
            }
            if (struct.f91889b != null) {
                protocol.Q6("popup_member_sale_info", 2, (byte) 12);
                e.f91915e.write(protocol, struct.f91889b);
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

    public a(@m80.l e eVar, @m80.l e eVar2) {
        this.f91888a = eVar;
        this.f91889b = eVar2;
    }

    public static /* synthetic */ a d(a aVar, e eVar, e eVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = aVar.f91888a;
        }
        if ((i11 & 2) != 0) {
            eVar2 = aVar.f91889b;
        }
        return aVar.c(eVar, eVar2);
    }

    @m80.l
    public final e a() {
        return this.f91888a;
    }

    @m80.l
    public final e b() {
        return this.f91889b;
    }

    @m80.k
    public final a c(@m80.l e eVar, @m80.l e eVar2) {
        return new a(eVar, eVar2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f91888a, aVar.f91888a) && g0.g(this.f91889b, aVar.f91889b);
    }

    public int hashCode() {
        e eVar = this.f91888a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.f91889b;
        return hashCode + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "AppHomePageMemberStageInfo(activity_icon_member_sale_info=" + this.f91888a + ", popup_member_sale_info=" + this.f91889b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91887d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAppHomePageMemberStageInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppHomePageMemberStageInfo.kt\ncom/baicizhan/biz/online/strategy_api/AppHomePageMemberStageInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public e f91890a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public e f91891b;

        public b() {
            this.f91890a = null;
            this.f91891b = null;
        }

        @m80.k
        public final b a(@m80.l e eVar) {
            this.f91890a = eVar;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a build() {
            return new a(this.f91890a, this.f91891b);
        }

        @m80.k
        public final b c(@m80.l e eVar) {
            this.f91891b = eVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91890a = null;
            this.f91891b = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f91890a = source.f91888a;
            this.f91891b = source.f91889b;
        }
    }
}
