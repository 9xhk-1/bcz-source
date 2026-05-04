package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f74616c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f74617d = new C0903a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74618a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74619b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: n8.a$a, reason: collision with other inner class name */
    public static final class C0903a implements ts.a<a, b> {
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
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBCollectWordPair");
            protocol.Q6(ma.b.f72894c, 1, (byte) 8);
            protocol.l5(struct.f74618a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f74619b);
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

    public a(int i11, int i12) {
        this.f74618a = i11;
        this.f74619b = i12;
    }

    public static /* synthetic */ a d(a aVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f74618a;
        }
        if ((i13 & 2) != 0) {
            i12 = aVar.f74619b;
        }
        return aVar.c(i11, i12);
    }

    public final int a() {
        return this.f74618a;
    }

    public final int b() {
        return this.f74619b;
    }

    @m80.k
    public final a c(int i11, int i12) {
        return new a(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f74618a == aVar.f74618a && this.f74619b == aVar.f74619b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f74618a) * 31) + Integer.hashCode(this.f74619b);
    }

    @m80.k
    public String toString() {
        return "BBCollectWordPair(word_level_id=" + this.f74618a + ", topic_id=" + this.f74619b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74617d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBCollectWordPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBCollectWordPair.kt\ncom/baicizhan/biz/online/bs_words/BBCollectWordPair$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74620a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74621b;

        public b() {
            this.f74620a = null;
            this.f74621b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f74620a;
            if (num == null) {
                throw new IllegalStateException("Required field 'word_level_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74621b;
            if (num2 != null) {
                return new a(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'topic_id' is missing");
        }

        @m80.k
        public final b b(int i11) {
            this.f74621b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f74620a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74620a = null;
            this.f74621b = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f74620a = Integer.valueOf(source.f74618a);
            this.f74621b = Integer.valueOf(source.f74619b);
        }
    }
}
