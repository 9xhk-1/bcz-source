package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f79730c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d, b> f79731d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79732a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79733b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<d, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@m80.k ws.i protocol, @m80.k b builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
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
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k d struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("AwardItem");
            protocol.Q6("award_type", 1, (byte) 8);
            protocol.l5(struct.f79732a);
            protocol.N2();
            protocol.Q6("award_count", 2, (byte) 8);
            protocol.l5(struct.f79733b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public d(int i11, int i12) {
        this.f79732a = i11;
        this.f79733b = i12;
    }

    public static /* synthetic */ d d(d dVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f79732a;
        }
        if ((i13 & 2) != 0) {
            i12 = dVar.f79733b;
        }
        return dVar.c(i11, i12);
    }

    public final int a() {
        return this.f79732a;
    }

    public final int b() {
        return this.f79733b;
    }

    @m80.k
    public final d c(int i11, int i12) {
        return new d(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f79732a == dVar.f79732a && this.f79733b == dVar.f79733b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79732a) * 31) + Integer.hashCode(this.f79733b);
    }

    @m80.k
    public String toString() {
        return "AwardItem(award_type=" + this.f79732a + ", award_count=" + this.f79733b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79731d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwardItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwardItem.kt\ncom/baicizhan/biz/online/game_api/AwardItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class b implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79734a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79735b;

        public b() {
            this.f79734a = null;
            this.f79735b = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f79735b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b b(int i11) {
            this.f79734a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f79734a;
            if (num == null) {
                throw new IllegalStateException("Required field 'award_type' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79735b;
            if (num2 != null) {
                return new d(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'award_count' is missing");
        }

        @Override // ts.f
        public void reset() {
            this.f79734a = null;
            this.f79735b = null;
        }

        public b(@m80.k d source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79734a = Integer.valueOf(source.f79732a);
            this.f79735b = Integer.valueOf(source.f79733b);
        }
    }
}
