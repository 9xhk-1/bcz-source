package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f74684h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h, b> f74685i = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74686a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74687b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74688c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f74689d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74690e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74691f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final int f74692g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<h, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.h(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
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
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k h struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBReadingPlanDetail");
            protocol.Q6("plan_id", 1, (byte) 8);
            protocol.l5(struct.f74686a);
            protocol.N2();
            protocol.Q6("chapter_num", 2, (byte) 8);
            protocol.l5(struct.f74687b);
            protocol.N2();
            protocol.Q6("audio_url", 3, (byte) 11);
            protocol.p1(struct.f74688c);
            protocol.N2();
            protocol.Q6("duration", 4, (byte) 8);
            protocol.l5(struct.f74689d);
            protocol.N2();
            protocol.Q6("chapter_name", 5, (byte) 11);
            protocol.p1(struct.f74690e);
            protocol.N2();
            protocol.Q6("audio_file_name", 6, (byte) 11);
            protocol.p1(struct.f74691f);
            protocol.N2();
            protocol.Q6("file_size", 7, (byte) 8);
            protocol.l5(struct.f74692g);
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

    public h(int i11, int i12, @m80.k String audio_url, int i13, @m80.k String chapter_name, @m80.k String audio_file_name, int i14) {
        g0.p(audio_url, "audio_url");
        g0.p(chapter_name, "chapter_name");
        g0.p(audio_file_name, "audio_file_name");
        this.f74686a = i11;
        this.f74687b = i12;
        this.f74688c = audio_url;
        this.f74689d = i13;
        this.f74690e = chapter_name;
        this.f74691f = audio_file_name;
        this.f74692g = i14;
    }

    public static /* synthetic */ h i(h hVar, int i11, int i12, String str, int i13, String str2, String str3, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = hVar.f74686a;
        }
        if ((i15 & 2) != 0) {
            i12 = hVar.f74687b;
        }
        if ((i15 & 4) != 0) {
            str = hVar.f74688c;
        }
        if ((i15 & 8) != 0) {
            i13 = hVar.f74689d;
        }
        if ((i15 & 16) != 0) {
            str2 = hVar.f74690e;
        }
        if ((i15 & 32) != 0) {
            str3 = hVar.f74691f;
        }
        if ((i15 & 64) != 0) {
            i14 = hVar.f74692g;
        }
        String str4 = str3;
        int i16 = i14;
        String str5 = str2;
        String str6 = str;
        return hVar.h(i11, i12, str6, i13, str5, str4, i16);
    }

    public final int a() {
        return this.f74686a;
    }

    public final int b() {
        return this.f74687b;
    }

    @m80.k
    public final String c() {
        return this.f74688c;
    }

    public final int d() {
        return this.f74689d;
    }

    @m80.k
    public final String e() {
        return this.f74690e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f74686a == hVar.f74686a && this.f74687b == hVar.f74687b && g0.g(this.f74688c, hVar.f74688c) && this.f74689d == hVar.f74689d && g0.g(this.f74690e, hVar.f74690e) && g0.g(this.f74691f, hVar.f74691f) && this.f74692g == hVar.f74692g;
    }

    @m80.k
    public final String f() {
        return this.f74691f;
    }

    public final int g() {
        return this.f74692g;
    }

    @m80.k
    public final h h(int i11, int i12, @m80.k String audio_url, int i13, @m80.k String chapter_name, @m80.k String audio_file_name, int i14) {
        g0.p(audio_url, "audio_url");
        g0.p(chapter_name, "chapter_name");
        g0.p(audio_file_name, "audio_file_name");
        return new h(i11, i12, audio_url, i13, chapter_name, audio_file_name, i14);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f74686a) * 31) + Integer.hashCode(this.f74687b)) * 31) + this.f74688c.hashCode()) * 31) + Integer.hashCode(this.f74689d)) * 31) + this.f74690e.hashCode()) * 31) + this.f74691f.hashCode()) * 31) + Integer.hashCode(this.f74692g);
    }

    @m80.k
    public String toString() {
        return "BBReadingPlanDetail(plan_id=" + this.f74686a + ", chapter_num=" + this.f74687b + ", audio_url=" + this.f74688c + ", duration=" + this.f74689d + ", chapter_name=" + this.f74690e + ", audio_file_name=" + this.f74691f + ", file_size=" + this.f74692g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74685i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBReadingPlanDetail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBReadingPlanDetail.kt\ncom/baicizhan/biz/online/bs_words/BBReadingPlanDetail$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
    public static final class b implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74693a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74694b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74695c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f74696d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f74697e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f74698f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f74699g;

        public b() {
            this.f74693a = null;
            this.f74694b = null;
            this.f74695c = null;
            this.f74696d = null;
            this.f74697e = null;
            this.f74698f = null;
            this.f74699g = null;
        }

        @m80.k
        public final b a(@m80.k String audio_file_name) {
            g0.p(audio_file_name, "audio_file_name");
            this.f74698f = audio_file_name;
            return this;
        }

        @m80.k
        public final b b(@m80.k String audio_url) {
            g0.p(audio_url, "audio_url");
            this.f74695c = audio_url;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h build() {
            Integer num = this.f74693a;
            if (num == null) {
                throw new IllegalStateException("Required field 'plan_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74694b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'chapter_num' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f74695c;
            if (str == null) {
                throw new IllegalStateException("Required field 'audio_url' is missing");
            }
            Integer num3 = this.f74696d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'duration' is missing");
            }
            int intValue3 = num3.intValue();
            String str2 = this.f74697e;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'chapter_name' is missing");
            }
            String str3 = this.f74698f;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'audio_file_name' is missing");
            }
            Integer num4 = this.f74699g;
            if (num4 != null) {
                return new h(intValue, intValue2, str, intValue3, str2, str3, num4.intValue());
            }
            throw new IllegalStateException("Required field 'file_size' is missing");
        }

        @m80.k
        public final b d(@m80.k String chapter_name) {
            g0.p(chapter_name, "chapter_name");
            this.f74697e = chapter_name;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f74694b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f74696d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b g(int i11) {
            this.f74699g = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b h(int i11) {
            this.f74693a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74693a = null;
            this.f74694b = null;
            this.f74695c = null;
            this.f74696d = null;
            this.f74697e = null;
            this.f74698f = null;
            this.f74699g = null;
        }

        public b(@m80.k h source) {
            g0.p(source, "source");
            this.f74693a = Integer.valueOf(source.f74686a);
            this.f74694b = Integer.valueOf(source.f74687b);
            this.f74695c = source.f74688c;
            this.f74696d = Integer.valueOf(source.f74689d);
            this.f74697e = source.f74690e;
            this.f74698f = source.f74691f;
            this.f74699g = Integer.valueOf(source.f74692g);
        }
    }
}
