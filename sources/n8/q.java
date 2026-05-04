package n8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f74844h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q, b> f74845i = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74846a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74847b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f74848c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74849d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f74850e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f74851f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f74852g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<q, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.c(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordPackage");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74846a);
            protocol.N2();
            protocol.Q6("zpk_path", 2, (byte) 11);
            protocol.p1(struct.f74847b);
            protocol.N2();
            protocol.Q6("zpk_size", 3, (byte) 10);
            protocol.q7(struct.f74848c);
            protocol.N2();
            protocol.Q6("zpk_md5", 4, (byte) 11);
            protocol.p1(struct.f74849d);
            protocol.N2();
            if (struct.f74850e != null) {
                protocol.Q6("tag_id", 5, (byte) 8);
                protocol.l5(struct.f74850e.intValue());
                protocol.N2();
            }
            if (struct.f74851f != null) {
                protocol.Q6(a.v.C0263a.f16322h, 6, (byte) 11);
                protocol.p1(struct.f74851f);
                protocol.N2();
            }
            if (struct.f74852g != null) {
                protocol.Q6(a.v.C0263a.f16323i, 7, (byte) 11);
                protocol.p1(struct.f74852g);
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

    public q(int i11, @m80.k String zpk_path, long j11, @m80.k String zpk_md5, @m80.l Integer num, @m80.l String str, @m80.l String str2) {
        g0.p(zpk_path, "zpk_path");
        g0.p(zpk_md5, "zpk_md5");
        this.f74846a = i11;
        this.f74847b = zpk_path;
        this.f74848c = j11;
        this.f74849d = zpk_md5;
        this.f74850e = num;
        this.f74851f = str;
        this.f74852g = str2;
    }

    public static /* synthetic */ q i(q qVar, int i11, String str, long j11, String str2, Integer num, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = qVar.f74846a;
        }
        if ((i12 & 2) != 0) {
            str = qVar.f74847b;
        }
        if ((i12 & 4) != 0) {
            j11 = qVar.f74848c;
        }
        if ((i12 & 8) != 0) {
            str2 = qVar.f74849d;
        }
        if ((i12 & 16) != 0) {
            num = qVar.f74850e;
        }
        if ((i12 & 32) != 0) {
            str3 = qVar.f74851f;
        }
        if ((i12 & 64) != 0) {
            str4 = qVar.f74852g;
        }
        long j12 = j11;
        return qVar.h(i11, str, j12, str2, num, str3, str4);
    }

    public final int a() {
        return this.f74846a;
    }

    @m80.k
    public final String b() {
        return this.f74847b;
    }

    public final long c() {
        return this.f74848c;
    }

    @m80.k
    public final String d() {
        return this.f74849d;
    }

    @m80.l
    public final Integer e() {
        return this.f74850e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f74846a == qVar.f74846a && g0.g(this.f74847b, qVar.f74847b) && this.f74848c == qVar.f74848c && g0.g(this.f74849d, qVar.f74849d) && g0.g(this.f74850e, qVar.f74850e) && g0.g(this.f74851f, qVar.f74851f) && g0.g(this.f74852g, qVar.f74852g);
    }

    @m80.l
    public final String f() {
        return this.f74851f;
    }

    @m80.l
    public final String g() {
        return this.f74852g;
    }

    @m80.k
    public final q h(int i11, @m80.k String zpk_path, long j11, @m80.k String zpk_md5, @m80.l Integer num, @m80.l String str, @m80.l String str2) {
        g0.p(zpk_path, "zpk_path");
        g0.p(zpk_md5, "zpk_md5");
        return new q(i11, zpk_path, j11, zpk_md5, num, str, str2);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f74846a) * 31) + this.f74847b.hashCode()) * 31) + Long.hashCode(this.f74848c)) * 31) + this.f74849d.hashCode()) * 31;
        Integer num = this.f74850e;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f74851f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74852g;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "BBWordPackage(topic_id=" + this.f74846a + ", zpk_path=" + this.f74847b + ", zpk_size=" + this.f74848c + ", zpk_md5=" + this.f74849d + ", tag_id=" + this.f74850e + ", tv_path=" + this.f74851f + ", tv_snapshot_path=" + this.f74852g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74845i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordPackage.kt\ncom/baicizhan/biz/online/bs_words/BBWordPackage$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
    public static final class b implements ts.f<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74853a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74854b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f74855c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74856d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f74857e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f74858f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f74859g;

        public b() {
            this.f74853a = null;
            this.f74854b = null;
            this.f74855c = null;
            this.f74856d = null;
            this.f74857e = null;
            this.f74858f = null;
            this.f74859g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q build() {
            Integer num = this.f74853a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74854b;
            if (str == null) {
                throw new IllegalStateException("Required field 'zpk_path' is missing");
            }
            Long l11 = this.f74855c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'zpk_size' is missing");
            }
            long longValue = l11.longValue();
            String str2 = this.f74856d;
            if (str2 != null) {
                return new q(intValue, str, longValue, str2, this.f74857e, this.f74858f, this.f74859g);
            }
            throw new IllegalStateException("Required field 'zpk_md5' is missing");
        }

        @m80.k
        public final b b(@m80.l Integer num) {
            this.f74857e = num;
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f74853a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.l String str) {
            this.f74858f = str;
            return this;
        }

        @m80.k
        public final b e(@m80.l String str) {
            this.f74859g = str;
            return this;
        }

        @m80.k
        public final b f(@m80.k String zpk_md5) {
            g0.p(zpk_md5, "zpk_md5");
            this.f74856d = zpk_md5;
            return this;
        }

        @m80.k
        public final b g(@m80.k String zpk_path) {
            g0.p(zpk_path, "zpk_path");
            this.f74854b = zpk_path;
            return this;
        }

        @m80.k
        public final b h(long j11) {
            this.f74855c = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74853a = null;
            this.f74854b = null;
            this.f74855c = null;
            this.f74856d = null;
            this.f74857e = null;
            this.f74858f = null;
            this.f74859g = null;
        }

        public b(@m80.k q source) {
            g0.p(source, "source");
            this.f74853a = Integer.valueOf(source.f74846a);
            this.f74854b = source.f74847b;
            this.f74855c = Long.valueOf(source.f74848c);
            this.f74856d = source.f74849d;
            this.f74857e = source.f74850e;
            this.f74858f = source.f74851f;
            this.f74859g = source.f74852g;
        }
    }
}
