package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f74652c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, b> f74653d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74654a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74655b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<e, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k b builder) {
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
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBGetWordAssetInfoArg");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74654a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f74655b);
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

    public e(int i11, int i12) {
        this.f74654a = i11;
        this.f74655b = i12;
    }

    public static /* synthetic */ e d(e eVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = eVar.f74654a;
        }
        if ((i13 & 2) != 0) {
            i12 = eVar.f74655b;
        }
        return eVar.c(i11, i12);
    }

    public final int a() {
        return this.f74654a;
    }

    public final int b() {
        return this.f74655b;
    }

    @m80.k
    public final e c(int i11, int i12) {
        return new e(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f74654a == eVar.f74654a && this.f74655b == eVar.f74655b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f74654a) * 31) + Integer.hashCode(this.f74655b);
    }

    @m80.k
    public String toString() {
        return "BBGetWordAssetInfoArg(topic_id=" + this.f74654a + ", book_id=" + this.f74655b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74653d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBGetWordAssetInfoArg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBGetWordAssetInfoArg.kt\ncom/baicizhan/biz/online/bs_words/BBGetWordAssetInfoArg$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class b implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74656a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74657b;

        public b() {
            this.f74656a = null;
            this.f74657b = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f74657b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f74656a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74657b;
            if (num2 != null) {
                return new e(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'book_id' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f74656a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74656a = null;
            this.f74657b = null;
        }

        public b(@m80.k e source) {
            g0.p(source, "source");
            this.f74656a = Integer.valueOf(source.f74654a);
            this.f74657b = Integer.valueOf(source.f74655b);
        }
    }
}
