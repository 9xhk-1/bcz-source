package y8;

import com.baicizhan.main.wikiv2.studyv2.data.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f99619g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f99620h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f99621a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f99622b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f99623c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f99624d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f99625e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f99626f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserBookWord");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f99621a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f99622b);
            protocol.N2();
            protocol.Q6("created_at", 3, (byte) 10);
            protocol.q7(struct.f99623c);
            protocol.N2();
            if (struct.f99624d != null) {
                protocol.Q6("word", 4, (byte) 11);
                protocol.p1(struct.f99624d);
                protocol.N2();
            }
            if (struct.f99625e != null) {
                protocol.Q6(t.f26099a, 5, (byte) 11);
                protocol.p1(struct.f99625e);
                protocol.N2();
            }
            if (struct.f99626f != null) {
                protocol.Q6("audio_url", 6, (byte) 11);
                protocol.p1(struct.f99626f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j(int i11, int i12, long j11, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        this.f99621a = i11;
        this.f99622b = i12;
        this.f99623c = j11;
        this.f99624d = str;
        this.f99625e = str2;
        this.f99626f = str3;
    }

    public static /* synthetic */ j h(j jVar, int i11, int i12, long j11, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = jVar.f99621a;
        }
        if ((i13 & 2) != 0) {
            i12 = jVar.f99622b;
        }
        if ((i13 & 4) != 0) {
            j11 = jVar.f99623c;
        }
        if ((i13 & 8) != 0) {
            str = jVar.f99624d;
        }
        if ((i13 & 16) != 0) {
            str2 = jVar.f99625e;
        }
        if ((i13 & 32) != 0) {
            str3 = jVar.f99626f;
        }
        String str4 = str3;
        String str5 = str;
        long j12 = j11;
        return jVar.g(i11, i12, j12, str5, str2, str4);
    }

    public final int a() {
        return this.f99621a;
    }

    public final int b() {
        return this.f99622b;
    }

    public final long c() {
        return this.f99623c;
    }

    @m80.l
    public final String d() {
        return this.f99624d;
    }

    @m80.l
    public final String e() {
        return this.f99625e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f99621a == jVar.f99621a && this.f99622b == jVar.f99622b && this.f99623c == jVar.f99623c && g0.g(this.f99624d, jVar.f99624d) && g0.g(this.f99625e, jVar.f99625e) && g0.g(this.f99626f, jVar.f99626f);
    }

    @m80.l
    public final String f() {
        return this.f99626f;
    }

    @m80.k
    public final j g(int i11, int i12, long j11, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        return new j(i11, i12, j11, str, str2, str3);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f99621a) * 31) + Integer.hashCode(this.f99622b)) * 31) + Long.hashCode(this.f99623c)) * 31;
        String str = this.f99624d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99625e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99626f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserBookWord(topic_id=" + this.f99621a + ", book_id=" + this.f99622b + ", created_at=" + this.f99623c + ", word=" + this.f99624d + ", mean=" + this.f99625e + ", audio_url=" + this.f99626f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99620h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBookWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookWord.kt\ncom/baicizhan/biz/online/user_book/UserBookWord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f99627a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f99628b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f99629c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f99630d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f99631e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f99632f;

        public a() {
            this.f99627a = null;
            this.f99628b = null;
            this.f99629c = null;
            this.f99630d = null;
            this.f99631e = null;
            this.f99632f = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f99632f = str;
            return this;
        }

        @m80.k
        public final a b(int i11) {
            this.f99628b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public j build() {
            Integer num = this.f99627a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f99628b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue2 = num2.intValue();
            Long l11 = this.f99629c;
            if (l11 != null) {
                return new j(intValue, intValue2, l11.longValue(), this.f99630d, this.f99631e, this.f99632f);
            }
            throw new IllegalStateException("Required field 'created_at' is missing");
        }

        @m80.k
        public final a d(long j11) {
            this.f99629c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f99631e = str;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f99627a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f99630d = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99627a = null;
            this.f99628b = null;
            this.f99629c = null;
            this.f99630d = null;
            this.f99631e = null;
            this.f99632f = null;
        }

        public a(@m80.k j source) {
            g0.p(source, "source");
            this.f99627a = Integer.valueOf(source.f99621a);
            this.f99628b = Integer.valueOf(source.f99622b);
            this.f99629c = Long.valueOf(source.f99623c);
            this.f99630d = source.f99624d;
            this.f99631e = source.f99625e;
            this.f99632f = source.f99626f;
        }
    }
}
