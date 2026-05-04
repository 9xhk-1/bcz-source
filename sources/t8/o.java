package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f90150d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f90151e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f90152a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90153b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f90154c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("TopicKey");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f90152a);
            protocol.N2();
            protocol.Q6(ma.b.f72894c, 2, (byte) 8);
            protocol.l5(struct.f90153b);
            protocol.N2();
            protocol.Q6("tag_id", 3, (byte) 8);
            protocol.l5(struct.f90154c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public o(int i11, int i12, int i13) {
        this.f90152a = i11;
        this.f90153b = i12;
        this.f90154c = i13;
    }

    public static /* synthetic */ o e(o oVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = oVar.f90152a;
        }
        if ((i14 & 2) != 0) {
            i12 = oVar.f90153b;
        }
        if ((i14 & 4) != 0) {
            i13 = oVar.f90154c;
        }
        return oVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f90152a;
    }

    public final int b() {
        return this.f90153b;
    }

    public final int c() {
        return this.f90154c;
    }

    @m80.k
    public final o d(int i11, int i12, int i13) {
        return new o(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f90152a == oVar.f90152a && this.f90153b == oVar.f90153b && this.f90154c == oVar.f90154c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f90152a) * 31) + Integer.hashCode(this.f90153b)) * 31) + Integer.hashCode(this.f90154c);
    }

    @m80.k
    public String toString() {
        return "TopicKey(topic_id=" + this.f90152a + ", word_level_id=" + this.f90153b + ", tag_id=" + this.f90154c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90151e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTopicKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicKey.kt\ncom/baicizhan/biz/online/resource_api/TopicKey$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f90155a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90156b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f90157c;

        public a() {
            this.f90155a = null;
            this.f90156b = null;
            this.f90157c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o build() {
            Integer num = this.f90155a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f90156b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'word_level_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f90157c;
            if (num3 != null) {
                return new o(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'tag_id' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f90157c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f90155a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f90156b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90155a = null;
            this.f90156b = null;
            this.f90157c = null;
        }

        public a(@m80.k o source) {
            g0.p(source, "source");
            this.f90155a = Integer.valueOf(source.f90152a);
            this.f90156b = Integer.valueOf(source.f90153b);
            this.f90157c = Integer.valueOf(source.f90154c);
        }
    }
}
