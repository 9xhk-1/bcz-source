package y8;

import com.baicizhan.main.wikiv2.studyv2.data.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f99633h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, a> f99634i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f99635a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f99636b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f99637c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99638d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99639e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99640f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f99641g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 7:
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
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserBookWordDetail");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f99635a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f99636b);
            protocol.N2();
            protocol.Q6("created_at", 3, (byte) 10);
            protocol.q7(struct.f99637c);
            protocol.N2();
            protocol.Q6("word", 4, (byte) 11);
            protocol.p1(struct.f99638d);
            protocol.N2();
            protocol.Q6(t.f26099a, 5, (byte) 11);
            protocol.p1(struct.f99639e);
            protocol.N2();
            protocol.Q6("audio_us", 6, (byte) 11);
            protocol.p1(struct.f99640f);
            protocol.N2();
            protocol.Q6("audio_uk", 7, (byte) 11);
            protocol.p1(struct.f99641g);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k(int i11, int i12, long j11, @m80.k String word, @m80.k String mean, @m80.k String audio_us, @m80.k String audio_uk) {
        g0.p(word, "word");
        g0.p(mean, "mean");
        g0.p(audio_us, "audio_us");
        g0.p(audio_uk, "audio_uk");
        this.f99635a = i11;
        this.f99636b = i12;
        this.f99637c = j11;
        this.f99638d = word;
        this.f99639e = mean;
        this.f99640f = audio_us;
        this.f99641g = audio_uk;
    }

    public static /* synthetic */ k i(k kVar, int i11, int i12, long j11, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = kVar.f99635a;
        }
        if ((i13 & 2) != 0) {
            i12 = kVar.f99636b;
        }
        if ((i13 & 4) != 0) {
            j11 = kVar.f99637c;
        }
        if ((i13 & 8) != 0) {
            str = kVar.f99638d;
        }
        if ((i13 & 16) != 0) {
            str2 = kVar.f99639e;
        }
        if ((i13 & 32) != 0) {
            str3 = kVar.f99640f;
        }
        if ((i13 & 64) != 0) {
            str4 = kVar.f99641g;
        }
        long j12 = j11;
        return kVar.h(i11, i12, j12, str, str2, str3, str4);
    }

    public final int a() {
        return this.f99635a;
    }

    public final int b() {
        return this.f99636b;
    }

    public final long c() {
        return this.f99637c;
    }

    @m80.k
    public final String d() {
        return this.f99638d;
    }

    @m80.k
    public final String e() {
        return this.f99639e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f99635a == kVar.f99635a && this.f99636b == kVar.f99636b && this.f99637c == kVar.f99637c && g0.g(this.f99638d, kVar.f99638d) && g0.g(this.f99639e, kVar.f99639e) && g0.g(this.f99640f, kVar.f99640f) && g0.g(this.f99641g, kVar.f99641g);
    }

    @m80.k
    public final String f() {
        return this.f99640f;
    }

    @m80.k
    public final String g() {
        return this.f99641g;
    }

    @m80.k
    public final k h(int i11, int i12, long j11, @m80.k String word, @m80.k String mean, @m80.k String audio_us, @m80.k String audio_uk) {
        g0.p(word, "word");
        g0.p(mean, "mean");
        g0.p(audio_us, "audio_us");
        g0.p(audio_uk, "audio_uk");
        return new k(i11, i12, j11, word, mean, audio_us, audio_uk);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f99635a) * 31) + Integer.hashCode(this.f99636b)) * 31) + Long.hashCode(this.f99637c)) * 31) + this.f99638d.hashCode()) * 31) + this.f99639e.hashCode()) * 31) + this.f99640f.hashCode()) * 31) + this.f99641g.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserBookWordDetail(topic_id=" + this.f99635a + ", book_id=" + this.f99636b + ", created_at=" + this.f99637c + ", word=" + this.f99638d + ", mean=" + this.f99639e + ", audio_us=" + this.f99640f + ", audio_uk=" + this.f99641g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99634i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBookWordDetail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookWordDetail.kt\ncom/baicizhan/biz/online/user_book/UserBookWordDetail$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1#2:268\n*E\n"})
    public static final class a implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f99642a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f99643b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f99644c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f99645d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f99646e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f99647f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f99648g;

        public a() {
            this.f99642a = null;
            this.f99643b = null;
            this.f99644c = null;
            this.f99645d = null;
            this.f99646e = null;
            this.f99647f = null;
            this.f99648g = null;
        }

        @m80.k
        public final a a(@m80.k String audio_uk) {
            g0.p(audio_uk, "audio_uk");
            this.f99648g = audio_uk;
            return this;
        }

        @m80.k
        public final a b(@m80.k String audio_us) {
            g0.p(audio_us, "audio_us");
            this.f99647f = audio_us;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f99643b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public k build() {
            Integer num = this.f99642a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f99643b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue2 = num2.intValue();
            Long l11 = this.f99644c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'created_at' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f99645d;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            String str2 = this.f99646e;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'mean' is missing");
            }
            String str3 = this.f99647f;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'audio_us' is missing");
            }
            String str4 = this.f99648g;
            if (str4 != null) {
                return new k(intValue, intValue2, longValue, str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'audio_uk' is missing");
        }

        @m80.k
        public final a e(long j11) {
            this.f99644c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String mean) {
            g0.p(mean, "mean");
            this.f99646e = mean;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f99642a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.k String word) {
            g0.p(word, "word");
            this.f99645d = word;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99642a = null;
            this.f99643b = null;
            this.f99644c = null;
            this.f99645d = null;
            this.f99646e = null;
            this.f99647f = null;
            this.f99648g = null;
        }

        public a(@m80.k k source) {
            g0.p(source, "source");
            this.f99642a = Integer.valueOf(source.f99635a);
            this.f99643b = Integer.valueOf(source.f99636b);
            this.f99644c = Long.valueOf(source.f99637c);
            this.f99645d = source.f99638d;
            this.f99646e = source.f99639e;
            this.f99647f = source.f99640f;
            this.f99648g = source.f99641g;
        }
    }
}
