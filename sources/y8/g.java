package y8;

import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f99557f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, a> f99558g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f99559a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99560b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f99561c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99562d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f99563e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                } else if (b11 == 10) {
                                    builder.d(protocol.T1());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.c(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.f(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.a(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.e(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserBookItem");
            protocol.Q6(CollectReviewActivity.G, 1, (byte) 10);
            protocol.q7(struct.f99559a);
            protocol.N2();
            protocol.Q6("book_name", 2, (byte) 11);
            protocol.p1(struct.f99560b);
            protocol.N2();
            protocol.Q6("word_num", 3, (byte) 8);
            protocol.l5(struct.f99561c);
            protocol.N2();
            protocol.Q6("cover", 4, (byte) 11);
            protocol.p1(struct.f99562d);
            protocol.N2();
            protocol.Q6("updated_at", 5, (byte) 10);
            protocol.q7(struct.f99563e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g(long j11, @m80.k String book_name, int i11, @m80.k String cover, long j12) {
        g0.p(book_name, "book_name");
        g0.p(cover, "cover");
        this.f99559a = j11;
        this.f99560b = book_name;
        this.f99561c = i11;
        this.f99562d = cover;
        this.f99563e = j12;
    }

    public static /* synthetic */ g g(g gVar, long j11, String str, int i11, String str2, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = gVar.f99559a;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            str = gVar.f99560b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            i11 = gVar.f99561c;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = gVar.f99562d;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            j12 = gVar.f99563e;
        }
        return gVar.f(j13, str3, i13, str4, j12);
    }

    public final long a() {
        return this.f99559a;
    }

    @m80.k
    public final String b() {
        return this.f99560b;
    }

    public final int c() {
        return this.f99561c;
    }

    @m80.k
    public final String d() {
        return this.f99562d;
    }

    public final long e() {
        return this.f99563e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f99559a == gVar.f99559a && g0.g(this.f99560b, gVar.f99560b) && this.f99561c == gVar.f99561c && g0.g(this.f99562d, gVar.f99562d) && this.f99563e == gVar.f99563e;
    }

    @m80.k
    public final g f(long j11, @m80.k String book_name, int i11, @m80.k String cover, long j12) {
        g0.p(book_name, "book_name");
        g0.p(cover, "cover");
        return new g(j11, book_name, i11, cover, j12);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f99559a) * 31) + this.f99560b.hashCode()) * 31) + Integer.hashCode(this.f99561c)) * 31) + this.f99562d.hashCode()) * 31) + Long.hashCode(this.f99563e);
    }

    @m80.k
    public String toString() {
        return "UserBookItem(user_book_id=" + this.f99559a + ", book_name=" + this.f99560b + ", word_num=" + this.f99561c + ", cover=" + this.f99562d + ", updated_at=" + this.f99563e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99558g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBookItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookItem.kt\ncom/baicizhan/biz/online/user_book/UserBookItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f99564a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f99565b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f99566c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f99567d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f99568e;

        public a() {
            this.f99564a = null;
            this.f99565b = null;
            this.f99566c = null;
            this.f99567d = null;
            this.f99568e = null;
        }

        @m80.k
        public final a a(@m80.k String book_name) {
            g0.p(book_name, "book_name");
            this.f99565b = book_name;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g build() {
            Long l11 = this.f99564a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'user_book_id' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f99565b;
            if (str == null) {
                throw new IllegalStateException("Required field 'book_name' is missing");
            }
            Integer num = this.f99566c;
            if (num == null) {
                throw new IllegalStateException("Required field 'word_num' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f99567d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'cover' is missing");
            }
            Long l12 = this.f99568e;
            if (l12 != null) {
                return new g(longValue, str, intValue, str2, l12.longValue());
            }
            throw new IllegalStateException("Required field 'updated_at' is missing");
        }

        @m80.k
        public final a c(@m80.k String cover) {
            g0.p(cover, "cover");
            this.f99567d = cover;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f99568e = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f99564a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f99566c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99564a = null;
            this.f99565b = null;
            this.f99566c = null;
            this.f99567d = null;
            this.f99568e = null;
        }

        public a(@m80.k g source) {
            g0.p(source, "source");
            this.f99564a = Long.valueOf(source.f99559a);
            this.f99565b = source.f99560b;
            this.f99566c = Integer.valueOf(source.f99561c);
            this.f99567d = source.f99562d;
            this.f99568e = Long.valueOf(source.f99563e);
        }
    }
}
