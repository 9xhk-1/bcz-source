package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f74712e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, b> f74713f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74714a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74715b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f74716c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final boolean f74717d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<j, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k b builder) {
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
                                at.b.a(protocol, b11);
                            } else if (b11 == 2) {
                                builder.c(protocol.readBool());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBSimilarWordVote");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74714a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f74715b);
            protocol.N2();
            protocol.Q6("similar_word_id", 3, (byte) 8);
            protocol.l5(struct.f74716c);
            protocol.N2();
            protocol.Q6("is_similar", 4, (byte) 2);
            protocol.a4(struct.f74717d);
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

    public j(int i11, int i12, int i13, boolean z11) {
        this.f74714a = i11;
        this.f74715b = i12;
        this.f74716c = i13;
        this.f74717d = z11;
    }

    public static /* synthetic */ j f(j jVar, int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = jVar.f74714a;
        }
        if ((i14 & 2) != 0) {
            i12 = jVar.f74715b;
        }
        if ((i14 & 4) != 0) {
            i13 = jVar.f74716c;
        }
        if ((i14 & 8) != 0) {
            z11 = jVar.f74717d;
        }
        return jVar.e(i11, i12, i13, z11);
    }

    public final int a() {
        return this.f74714a;
    }

    public final int b() {
        return this.f74715b;
    }

    public final int c() {
        return this.f74716c;
    }

    public final boolean d() {
        return this.f74717d;
    }

    @m80.k
    public final j e(int i11, int i12, int i13, boolean z11) {
        return new j(i11, i12, i13, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f74714a == jVar.f74714a && this.f74715b == jVar.f74715b && this.f74716c == jVar.f74716c && this.f74717d == jVar.f74717d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f74714a) * 31) + Integer.hashCode(this.f74715b)) * 31) + Integer.hashCode(this.f74716c)) * 31) + Boolean.hashCode(this.f74717d);
    }

    @m80.k
    public String toString() {
        return "BBSimilarWordVote(topic_id=" + this.f74714a + ", book_id=" + this.f74715b + ", similar_word_id=" + this.f74716c + ", is_similar=" + this.f74717d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74713f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBSimilarWordVote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBSimilarWordVote.kt\ncom/baicizhan/biz/online/bs_words/BBSimilarWordVote$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class b implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74718a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74719b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f74720c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Boolean f74721d;

        public b() {
            this.f74718a = null;
            this.f74719b = null;
            this.f74720c = null;
            this.f74721d = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f74719b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j build() {
            Integer num = this.f74718a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74719b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f74720c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'similar_word_id' is missing");
            }
            int intValue3 = num3.intValue();
            Boolean bool = this.f74721d;
            if (bool != null) {
                return new j(intValue, intValue2, intValue3, bool.booleanValue());
            }
            throw new IllegalStateException("Required field 'is_similar' is missing");
        }

        @m80.k
        public final b c(boolean z11) {
            this.f74721d = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f74720c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f74718a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74718a = null;
            this.f74719b = null;
            this.f74720c = null;
            this.f74721d = null;
        }

        public b(@m80.k j source) {
            g0.p(source, "source");
            this.f74718a = Integer.valueOf(source.f74714a);
            this.f74719b = Integer.valueOf(source.f74715b);
            this.f74720c = Integer.valueOf(source.f74716c);
            this.f74721d = Boolean.valueOf(source.f74717d);
        }
    }
}
