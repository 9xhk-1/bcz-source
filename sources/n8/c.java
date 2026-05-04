package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final C0905c f74628g = new C0905c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, b> f74629h = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74630a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74631b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74632c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74633d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f74634e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f74635f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 6:
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
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBExamAudio");
            protocol.Q6("audio_url", 1, (byte) 11);
            protocol.p1(struct.f74630a);
            protocol.N2();
            protocol.Q6("duration", 2, (byte) 8);
            protocol.l5(struct.f74631b);
            protocol.N2();
            protocol.Q6("audio_name", 3, (byte) 11);
            protocol.p1(struct.f74632c);
            protocol.N2();
            protocol.Q6("audio_file_name", 4, (byte) 11);
            protocol.p1(struct.f74633d);
            protocol.N2();
            protocol.Q6("file_size", 5, (byte) 8);
            protocol.l5(struct.f74634e);
            protocol.N2();
            protocol.Q6(ma.b.f72887a, 6, (byte) 8);
            protocol.l5(struct.f74635f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: n8.c$c, reason: collision with other inner class name */
    public static final class C0905c {
        public /* synthetic */ C0905c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C0905c() {
        }
    }

    public c(@m80.k String audio_url, int i11, @m80.k String audio_name, @m80.k String audio_file_name, int i12, int i13) {
        g0.p(audio_url, "audio_url");
        g0.p(audio_name, "audio_name");
        g0.p(audio_file_name, "audio_file_name");
        this.f74630a = audio_url;
        this.f74631b = i11;
        this.f74632c = audio_name;
        this.f74633d = audio_file_name;
        this.f74634e = i12;
        this.f74635f = i13;
    }

    public static /* synthetic */ c h(c cVar, String str, int i11, String str2, String str3, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = cVar.f74630a;
        }
        if ((i14 & 2) != 0) {
            i11 = cVar.f74631b;
        }
        if ((i14 & 4) != 0) {
            str2 = cVar.f74632c;
        }
        if ((i14 & 8) != 0) {
            str3 = cVar.f74633d;
        }
        if ((i14 & 16) != 0) {
            i12 = cVar.f74634e;
        }
        if ((i14 & 32) != 0) {
            i13 = cVar.f74635f;
        }
        int i15 = i12;
        int i16 = i13;
        return cVar.g(str, i11, str2, str3, i15, i16);
    }

    @m80.k
    public final String a() {
        return this.f74630a;
    }

    public final int b() {
        return this.f74631b;
    }

    @m80.k
    public final String c() {
        return this.f74632c;
    }

    @m80.k
    public final String d() {
        return this.f74633d;
    }

    public final int e() {
        return this.f74634e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f74630a, cVar.f74630a) && this.f74631b == cVar.f74631b && g0.g(this.f74632c, cVar.f74632c) && g0.g(this.f74633d, cVar.f74633d) && this.f74634e == cVar.f74634e && this.f74635f == cVar.f74635f;
    }

    public final int f() {
        return this.f74635f;
    }

    @m80.k
    public final c g(@m80.k String audio_url, int i11, @m80.k String audio_name, @m80.k String audio_file_name, int i12, int i13) {
        g0.p(audio_url, "audio_url");
        g0.p(audio_name, "audio_name");
        g0.p(audio_file_name, "audio_file_name");
        return new c(audio_url, i11, audio_name, audio_file_name, i12, i13);
    }

    public int hashCode() {
        return (((((((((this.f74630a.hashCode() * 31) + Integer.hashCode(this.f74631b)) * 31) + this.f74632c.hashCode()) * 31) + this.f74633d.hashCode()) * 31) + Integer.hashCode(this.f74634e)) * 31) + Integer.hashCode(this.f74635f);
    }

    @m80.k
    public String toString() {
        return "BBExamAudio(audio_url=" + this.f74630a + ", duration=" + this.f74631b + ", audio_name=" + this.f74632c + ", audio_file_name=" + this.f74633d + ", file_size=" + this.f74634e + ", seq=" + this.f74635f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74629h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBExamAudio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBExamAudio.kt\ncom/baicizhan/biz/online/bs_words/BBExamAudio$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
    public static final class b implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f74636a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74637b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74638c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74639d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f74640e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f74641f;

        public b() {
            this.f74636a = null;
            this.f74637b = null;
            this.f74638c = null;
            this.f74639d = null;
            this.f74640e = null;
            this.f74641f = null;
        }

        @m80.k
        public final b a(@m80.k String audio_file_name) {
            g0.p(audio_file_name, "audio_file_name");
            this.f74639d = audio_file_name;
            return this;
        }

        @m80.k
        public final b b(@m80.k String audio_name) {
            g0.p(audio_name, "audio_name");
            this.f74638c = audio_name;
            return this;
        }

        @m80.k
        public final b c(@m80.k String audio_url) {
            g0.p(audio_url, "audio_url");
            this.f74636a = audio_url;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c build() {
            String str = this.f74636a;
            if (str == null) {
                throw new IllegalStateException("Required field 'audio_url' is missing");
            }
            Integer num = this.f74637b;
            if (num == null) {
                throw new IllegalStateException("Required field 'duration' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f74638c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'audio_name' is missing");
            }
            String str3 = this.f74639d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'audio_file_name' is missing");
            }
            Integer num2 = this.f74640e;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'file_size' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f74641f;
            if (num3 != null) {
                return new c(str, intValue, str2, str3, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'seq' is missing");
        }

        @m80.k
        public final b e(int i11) {
            this.f74637b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(int i11) {
            this.f74640e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b g(int i11) {
            this.f74641f = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74636a = null;
            this.f74637b = null;
            this.f74638c = null;
            this.f74639d = null;
            this.f74640e = null;
            this.f74641f = null;
        }

        public b(@m80.k c source) {
            g0.p(source, "source");
            this.f74636a = source.f74630a;
            this.f74637b = Integer.valueOf(source.f74631b);
            this.f74638c = source.f74632c;
            this.f74639d = source.f74633d;
            this.f74640e = Integer.valueOf(source.f74634e);
            this.f74641f = Integer.valueOf(source.f74635f);
        }
    }
}
