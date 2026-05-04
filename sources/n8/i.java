package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final c f74700f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, b> f74701g = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74702a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74703b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f74704c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74705d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f74706e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<i, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 11) {
                                    builder.f(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.d(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
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
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBSimilarWordInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74702a);
            protocol.N2();
            protocol.Q6("similar_word_id", 2, (byte) 8);
            protocol.l5(struct.f74703b);
            protocol.N2();
            protocol.Q6("similar_word_book_id", 3, (byte) 8);
            protocol.l5(struct.f74704c);
            protocol.N2();
            protocol.Q6("tips", 4, (byte) 11);
            protocol.p1(struct.f74705d);
            protocol.N2();
            if (struct.f74706e != null) {
                protocol.Q6("word", 5, (byte) 11);
                protocol.p1(struct.f74706e);
                protocol.N2();
            }
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

    public i(int i11, int i12, int i13, @m80.k String tips, @m80.l String str) {
        g0.p(tips, "tips");
        this.f74702a = i11;
        this.f74703b = i12;
        this.f74704c = i13;
        this.f74705d = tips;
        this.f74706e = str;
    }

    public static /* synthetic */ i g(i iVar, int i11, int i12, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = iVar.f74702a;
        }
        if ((i14 & 2) != 0) {
            i12 = iVar.f74703b;
        }
        if ((i14 & 4) != 0) {
            i13 = iVar.f74704c;
        }
        if ((i14 & 8) != 0) {
            str = iVar.f74705d;
        }
        if ((i14 & 16) != 0) {
            str2 = iVar.f74706e;
        }
        String str3 = str2;
        int i15 = i13;
        return iVar.f(i11, i12, i15, str, str3);
    }

    public final int a() {
        return this.f74702a;
    }

    public final int b() {
        return this.f74703b;
    }

    public final int c() {
        return this.f74704c;
    }

    @m80.k
    public final String d() {
        return this.f74705d;
    }

    @m80.l
    public final String e() {
        return this.f74706e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f74702a == iVar.f74702a && this.f74703b == iVar.f74703b && this.f74704c == iVar.f74704c && g0.g(this.f74705d, iVar.f74705d) && g0.g(this.f74706e, iVar.f74706e);
    }

    @m80.k
    public final i f(int i11, int i12, int i13, @m80.k String tips, @m80.l String str) {
        g0.p(tips, "tips");
        return new i(i11, i12, i13, tips, str);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f74702a) * 31) + Integer.hashCode(this.f74703b)) * 31) + Integer.hashCode(this.f74704c)) * 31) + this.f74705d.hashCode()) * 31;
        String str = this.f74706e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "BBSimilarWordInfo(topic_id=" + this.f74702a + ", similar_word_id=" + this.f74703b + ", similar_word_book_id=" + this.f74704c + ", tips=" + this.f74705d + ", word=" + this.f74706e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74701g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBSimilarWordInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBSimilarWordInfo.kt\ncom/baicizhan/biz/online/bs_words/BBSimilarWordInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
    public static final class b implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74707a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74708b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f74709c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74710d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f74711e;

        public b() {
            this.f74707a = null;
            this.f74708b = null;
            this.f74709c = null;
            this.f74710d = null;
            this.f74711e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f74707a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74708b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'similar_word_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f74709c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'similar_word_book_id' is missing");
            }
            int intValue3 = num3.intValue();
            String str = this.f74710d;
            if (str != null) {
                return new i(intValue, intValue2, intValue3, str, this.f74711e);
            }
            throw new IllegalStateException("Required field 'tips' is missing");
        }

        @m80.k
        public final b b(int i11) {
            this.f74709c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f74708b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.k String tips) {
            g0.p(tips, "tips");
            this.f74710d = tips;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f74707a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(@m80.l String str) {
            this.f74711e = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74707a = null;
            this.f74708b = null;
            this.f74709c = null;
            this.f74710d = null;
            this.f74711e = null;
        }

        public b(@m80.k i source) {
            g0.p(source, "source");
            this.f74707a = Integer.valueOf(source.f74702a);
            this.f74708b = Integer.valueOf(source.f74703b);
            this.f74709c = Integer.valueOf(source.f74704c);
            this.f74710d = source.f74705d;
            this.f74711e = source.f74706e;
        }
    }
}
