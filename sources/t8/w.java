package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f90308c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w, a> f90309d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90310a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90311b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<w, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k w struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("WordPackItem");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90310a);
            protocol.N2();
            protocol.Q6("word_pack", 2, (byte) 11);
            protocol.p1(struct.f90311b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public w(int i11, @m80.k String word_pack) {
        g0.p(word_pack, "word_pack");
        this.f90310a = i11;
        this.f90311b = word_pack;
    }

    public static /* synthetic */ w d(w wVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = wVar.f90310a;
        }
        if ((i12 & 2) != 0) {
            str = wVar.f90311b;
        }
        return wVar.c(i11, str);
    }

    public final int a() {
        return this.f90310a;
    }

    @m80.k
    public final String b() {
        return this.f90311b;
    }

    @m80.k
    public final w c(int i11, @m80.k String word_pack) {
        g0.p(word_pack, "word_pack");
        return new w(i11, word_pack);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f90310a == wVar.f90310a && g0.g(this.f90311b, wVar.f90311b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f90310a) * 31) + this.f90311b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordPackItem(topic_id=" + this.f90310a + ", word_pack=" + this.f90311b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90309d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordPackItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPackItem.kt\ncom/baicizhan/biz/online/resource_api/WordPackItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    public static final class a implements ts.f<w> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90312a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90313b;

        public a() {
            this.f90312a = null;
            this.f90313b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w build() {
            Integer num = this.f90312a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f90313b;
            if (str != null) {
                return new w(intValue, str);
            }
            throw new IllegalStateException("Required field 'word_pack' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f90312a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String word_pack) {
            g0.p(word_pack, "word_pack");
            this.f90313b = word_pack;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90312a = null;
            this.f90313b = null;
        }

        public a(@m80.k w source) {
            g0.p(source, "source");
            this.f90312a = Integer.valueOf(source.f90310a);
            this.f90313b = source.f90311b;
        }
    }
}
