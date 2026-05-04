package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f90015i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, a> f90016j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f90017a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90018b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90019c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90020d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90021e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90022f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90023g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90024h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
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
                            builder.c(protocol.readString());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MeanInfo");
            protocol.Q6("id", 1, (byte) 10);
            protocol.q7(struct.f90017a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f90018b);
            protocol.N2();
            protocol.Q6("mean_type", 3, (byte) 11);
            protocol.p1(struct.f90019c);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, 4, (byte) 11);
            protocol.p1(struct.f90020d);
            protocol.N2();
            if (struct.f90021e != null) {
                protocol.Q6("accent_usa", 5, (byte) 11);
                protocol.p1(struct.f90021e);
                protocol.N2();
            }
            if (struct.f90022f != null) {
                protocol.Q6("accent_uk", 6, (byte) 11);
                protocol.p1(struct.f90022f);
                protocol.N2();
            }
            if (struct.f90023g != null) {
                protocol.Q6("accent_usa_audio_uri", 7, (byte) 11);
                protocol.p1(struct.f90023g);
                protocol.N2();
            }
            if (struct.f90024h != null) {
                protocol.Q6("accent_uk_audio_uri", 8, (byte) 11);
                protocol.p1(struct.f90024h);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f(long j11, int i11, @m80.k String mean_type, @m80.k String mean, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        g0.p(mean_type, "mean_type");
        g0.p(mean, "mean");
        this.f90017a = j11;
        this.f90018b = i11;
        this.f90019c = mean_type;
        this.f90020d = mean;
        this.f90021e = str;
        this.f90022f = str2;
        this.f90023g = str3;
        this.f90024h = str4;
    }

    public static /* synthetic */ f j(f fVar, long j11, int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = fVar.f90017a;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = fVar.f90018b;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = fVar.f90019c;
        }
        String str7 = str;
        if ((i12 & 8) != 0) {
            str2 = fVar.f90020d;
        }
        return fVar.i(j12, i13, str7, str2, (i12 & 16) != 0 ? fVar.f90021e : str3, (i12 & 32) != 0 ? fVar.f90022f : str4, (i12 & 64) != 0 ? fVar.f90023g : str5, (i12 & 128) != 0 ? fVar.f90024h : str6);
    }

    public final long a() {
        return this.f90017a;
    }

    public final int b() {
        return this.f90018b;
    }

    @m80.k
    public final String c() {
        return this.f90019c;
    }

    @m80.k
    public final String d() {
        return this.f90020d;
    }

    @m80.l
    public final String e() {
        return this.f90021e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f90017a == fVar.f90017a && this.f90018b == fVar.f90018b && g0.g(this.f90019c, fVar.f90019c) && g0.g(this.f90020d, fVar.f90020d) && g0.g(this.f90021e, fVar.f90021e) && g0.g(this.f90022f, fVar.f90022f) && g0.g(this.f90023g, fVar.f90023g) && g0.g(this.f90024h, fVar.f90024h);
    }

    @m80.l
    public final String f() {
        return this.f90022f;
    }

    @m80.l
    public final String g() {
        return this.f90023g;
    }

    @m80.l
    public final String h() {
        return this.f90024h;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.f90017a) * 31) + Integer.hashCode(this.f90018b)) * 31) + this.f90019c.hashCode()) * 31) + this.f90020d.hashCode()) * 31;
        String str = this.f90021e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90022f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90023g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90024h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @m80.k
    public final f i(long j11, int i11, @m80.k String mean_type, @m80.k String mean, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        g0.p(mean_type, "mean_type");
        g0.p(mean, "mean");
        return new f(j11, i11, mean_type, mean, str, str2, str3, str4);
    }

    @m80.k
    public String toString() {
        return "MeanInfo(id=" + this.f90017a + ", topic_id=" + this.f90018b + ", mean_type=" + this.f90019c + ", mean=" + this.f90020d + ", accent_usa=" + this.f90021e + ", accent_uk=" + this.f90022f + ", accent_usa_audio_uri=" + this.f90023g + ", accent_uk_audio_uri=" + this.f90024h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90016j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMeanInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeanInfo.kt\ncom/baicizhan/biz/online/resource_api/MeanInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f90025a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90026b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90027c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90028d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f90029e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f90030f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f90031g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f90032h;

        public a() {
            this.f90025a = null;
            this.f90026b = null;
            this.f90027c = null;
            this.f90028d = null;
            this.f90029e = null;
            this.f90030f = null;
            this.f90031g = null;
            this.f90032h = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90030f = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f90032h = str;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f90029e = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f90031g = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f build() {
            Long l11 = this.f90025a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f90026b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f90027c;
            if (str == null) {
                throw new IllegalStateException("Required field 'mean_type' is missing");
            }
            String str2 = this.f90028d;
            if (str2 != null) {
                return new f(longValue, intValue, str, str2, this.f90029e, this.f90030f, this.f90031g, this.f90032h);
            }
            throw new IllegalStateException("Required field 'mean' is missing");
        }

        @m80.k
        public final a f(long j11) {
            this.f90025a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a g(@m80.k String mean) {
            g0.p(mean, "mean");
            this.f90028d = mean;
            return this;
        }

        @m80.k
        public final a h(@m80.k String mean_type) {
            g0.p(mean_type, "mean_type");
            this.f90027c = mean_type;
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f90026b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90025a = null;
            this.f90026b = null;
            this.f90027c = null;
            this.f90028d = null;
            this.f90029e = null;
            this.f90030f = null;
            this.f90031g = null;
            this.f90032h = null;
        }

        public a(@m80.k f source) {
            g0.p(source, "source");
            this.f90025a = Long.valueOf(source.f90017a);
            this.f90026b = Integer.valueOf(source.f90018b);
            this.f90027c = source.f90019c;
            this.f90028d = source.f90020d;
            this.f90029e = source.f90021e;
            this.f90030f = source.f90022f;
            this.f90031g = source.f90023g;
            this.f90032h = source.f90024h;
        }
    }
}
