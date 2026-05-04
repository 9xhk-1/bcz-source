package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f90130d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, a> f90131e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90132a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90133b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90134c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 11) {
                            builder.c(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SimilarWord");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90132a);
            protocol.N2();
            protocol.Q6(ma.b.f72894c, 2, (byte) 8);
            protocol.l5(struct.f90133b);
            protocol.N2();
            protocol.Q6("word", 3, (byte) 11);
            protocol.p1(struct.f90134c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m(int i11, int i12, @m80.k String word) {
        g0.p(word, "word");
        this.f90132a = i11;
        this.f90133b = i12;
        this.f90134c = word;
    }

    public static /* synthetic */ m e(m mVar, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = mVar.f90132a;
        }
        if ((i13 & 2) != 0) {
            i12 = mVar.f90133b;
        }
        if ((i13 & 4) != 0) {
            str = mVar.f90134c;
        }
        return mVar.d(i11, i12, str);
    }

    public final int a() {
        return this.f90132a;
    }

    public final int b() {
        return this.f90133b;
    }

    @m80.k
    public final String c() {
        return this.f90134c;
    }

    @m80.k
    public final m d(int i11, int i12, @m80.k String word) {
        g0.p(word, "word");
        return new m(i11, i12, word);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f90132a == mVar.f90132a && this.f90133b == mVar.f90133b && g0.g(this.f90134c, mVar.f90134c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f90132a) * 31) + Integer.hashCode(this.f90133b)) * 31) + this.f90134c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SimilarWord(topic_id=" + this.f90132a + ", word_level_id=" + this.f90133b + ", word=" + this.f90134c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90131e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSimilarWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimilarWord.kt\ncom/baicizhan/biz/online/resource_api/SimilarWord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
    public static final class a implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90135a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90136b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90137c;

        public a() {
            this.f90135a = null;
            this.f90136b = null;
            this.f90137c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            Integer num = this.f90135a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f90136b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'word_level_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f90137c;
            if (str != null) {
                return new m(intValue, intValue2, str);
            }
            throw new IllegalStateException("Required field 'word' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f90135a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String word) {
            g0.p(word, "word");
            this.f90137c = word;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f90136b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90135a = null;
            this.f90136b = null;
            this.f90137c = null;
        }

        public a(@m80.k m source) {
            g0.p(source, "source");
            this.f90135a = Integer.valueOf(source.f90132a);
            this.f90136b = Integer.valueOf(source.f90133b);
            this.f90137c = source.f90134c;
        }
    }
}
