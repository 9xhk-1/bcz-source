package g8;

import com.tencent.connect.share.QQShare;
import com.tencent.open.SocialConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final c f53263m = new c(null);

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h, b> f53264n = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53265a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f53266b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53267c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53268d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f53269e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f53270f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final int f53271g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final int f53272h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53273i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53274j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53275k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53276l;

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
                            builder.d(protocol.s8());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(protocol.T1());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.s8());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.s8());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
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
            protocol.g6("BczLaunchAdItem");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f53265a);
            protocol.N2();
            protocol.Q6("click_type", 2, (byte) 8);
            protocol.l5(struct.f53266b);
            protocol.N2();
            protocol.Q6(y9.b.f99687c, 3, (byte) 11);
            protocol.p1(struct.f53267c);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 4, (byte) 11);
            protocol.p1(struct.f53268d);
            protocol.N2();
            protocol.Q6("start_time", 5, (byte) 10);
            protocol.q7(struct.f53269e);
            protocol.N2();
            protocol.Q6("end_time", 6, (byte) 10);
            protocol.q7(struct.f53270f);
            protocol.N2();
            protocol.Q6("show_times", 7, (byte) 8);
            protocol.l5(struct.f53271g);
            protocol.N2();
            protocol.Q6("show_seconds", 8, (byte) 8);
            protocol.l5(struct.f53272h);
            protocol.N2();
            if (struct.f53273i != null) {
                protocol.Q6("link_2", 9, (byte) 11);
                protocol.p1(struct.f53273i);
                protocol.N2();
            }
            if (struct.f53274j != null) {
                protocol.Q6("mini_program_id", 10, (byte) 11);
                protocol.p1(struct.f53274j);
                protocol.N2();
            }
            if (struct.f53275k != null) {
                protocol.Q6(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, 11, (byte) 11);
                protocol.p1(struct.f53275k);
                protocol.N2();
            }
            if (struct.f53276l != null) {
                protocol.Q6("mini_program_backup_url", 12, (byte) 11);
                protocol.p1(struct.f53276l);
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

    public h(int i11, int i12, @m80.k String link, @m80.k String img, long j11, long j12, int i13, int i14, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        g0.p(link, "link");
        g0.p(img, "img");
        this.f53265a = i11;
        this.f53266b = i12;
        this.f53267c = link;
        this.f53268d = img;
        this.f53269e = j11;
        this.f53270f = j12;
        this.f53271g = i13;
        this.f53272h = i14;
        this.f53273i = str;
        this.f53274j = str2;
        this.f53275k = str3;
        this.f53276l = str4;
    }

    public final int a() {
        return this.f53265a;
    }

    @m80.l
    public final String b() {
        return this.f53274j;
    }

    @m80.l
    public final String c() {
        return this.f53275k;
    }

    @m80.l
    public final String d() {
        return this.f53276l;
    }

    public final int e() {
        return this.f53266b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f53265a == hVar.f53265a && this.f53266b == hVar.f53266b && g0.g(this.f53267c, hVar.f53267c) && g0.g(this.f53268d, hVar.f53268d) && this.f53269e == hVar.f53269e && this.f53270f == hVar.f53270f && this.f53271g == hVar.f53271g && this.f53272h == hVar.f53272h && g0.g(this.f53273i, hVar.f53273i) && g0.g(this.f53274j, hVar.f53274j) && g0.g(this.f53275k, hVar.f53275k) && g0.g(this.f53276l, hVar.f53276l);
    }

    @m80.k
    public final String f() {
        return this.f53267c;
    }

    @m80.k
    public final String g() {
        return this.f53268d;
    }

    public final long h() {
        return this.f53269e;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f53265a) * 31) + Integer.hashCode(this.f53266b)) * 31) + this.f53267c.hashCode()) * 31) + this.f53268d.hashCode()) * 31) + Long.hashCode(this.f53269e)) * 31) + Long.hashCode(this.f53270f)) * 31) + Integer.hashCode(this.f53271g)) * 31) + Integer.hashCode(this.f53272h)) * 31;
        String str = this.f53273i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53274j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f53275k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f53276l;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final long i() {
        return this.f53270f;
    }

    public final int j() {
        return this.f53271g;
    }

    public final int k() {
        return this.f53272h;
    }

    @m80.l
    public final String l() {
        return this.f53273i;
    }

    @m80.k
    public final h m(int i11, int i12, @m80.k String link, @m80.k String img, long j11, long j12, int i13, int i14, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4) {
        g0.p(link, "link");
        g0.p(img, "img");
        return new h(i11, i12, link, img, j11, j12, i13, i14, str, str2, str3, str4);
    }

    @m80.k
    public String toString() {
        return "BczLaunchAdItem(id=" + this.f53265a + ", click_type=" + this.f53266b + ", link=" + this.f53267c + ", img=" + this.f53268d + ", start_time=" + this.f53269e + ", end_time=" + this.f53270f + ", show_times=" + this.f53271g + ", show_seconds=" + this.f53272h + ", link_2=" + this.f53273i + ", mini_program_id=" + this.f53274j + ", mini_program_path=" + this.f53275k + ", mini_program_backup_url=" + this.f53276l + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53264n.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczLaunchAdItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczLaunchAdItem.kt\ncom/baicizhan/biz/online/advertise_api/BczLaunchAdItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n1#2:415\n*E\n"})
    public static final class b implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53277a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f53278b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53279c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53280d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f53281e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f53282f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f53283g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f53284h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f53285i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f53286j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public String f53287k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public String f53288l;

        public b() {
            this.f53277a = null;
            this.f53278b = null;
            this.f53279c = null;
            this.f53280d = null;
            this.f53281e = null;
            this.f53282f = null;
            this.f53283g = null;
            this.f53284h = null;
            this.f53285i = null;
            this.f53286j = null;
            this.f53287k = null;
            this.f53288l = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h build() {
            Integer num = this.f53277a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f53278b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'click_type' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f53279c;
            if (str == null) {
                throw new IllegalStateException("Required field 'link' is missing");
            }
            String str2 = this.f53280d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'img' is missing");
            }
            Long l11 = this.f53281e;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'start_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f53282f;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'end_time' is missing");
            }
            long longValue2 = l12.longValue();
            Integer num3 = this.f53283g;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'show_times' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f53284h;
            if (num4 != null) {
                return new h(intValue, intValue2, str, str2, longValue, longValue2, intValue3, num4.intValue(), this.f53285i, this.f53286j, this.f53287k, this.f53288l);
            }
            throw new IllegalStateException("Required field 'show_seconds' is missing");
        }

        @m80.k
        public final b b(int i11) {
            this.f53278b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b c(long j11) {
            this.f53282f = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f53277a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(@m80.k String img) {
            g0.p(img, "img");
            this.f53280d = img;
            return this;
        }

        @m80.k
        public final b f(@m80.k String link) {
            g0.p(link, "link");
            this.f53279c = link;
            return this;
        }

        @m80.k
        public final b g(@m80.l String str) {
            this.f53285i = str;
            return this;
        }

        @m80.k
        public final b h(@m80.l String str) {
            this.f53288l = str;
            return this;
        }

        @m80.k
        public final b i(@m80.l String str) {
            this.f53286j = str;
            return this;
        }

        @m80.k
        public final b j(@m80.l String str) {
            this.f53287k = str;
            return this;
        }

        @m80.k
        public final b k(int i11) {
            this.f53284h = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b l(int i11) {
            this.f53283g = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b m(long j11) {
            this.f53281e = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53277a = null;
            this.f53278b = null;
            this.f53279c = null;
            this.f53280d = null;
            this.f53281e = null;
            this.f53282f = null;
            this.f53283g = null;
            this.f53284h = null;
            this.f53285i = null;
            this.f53286j = null;
            this.f53287k = null;
            this.f53288l = null;
        }

        public b(@m80.k h source) {
            g0.p(source, "source");
            this.f53277a = Integer.valueOf(source.f53265a);
            this.f53278b = Integer.valueOf(source.f53266b);
            this.f53279c = source.f53267c;
            this.f53280d = source.f53268d;
            this.f53281e = Long.valueOf(source.f53269e);
            this.f53282f = Long.valueOf(source.f53270f);
            this.f53283g = Integer.valueOf(source.f53271g);
            this.f53284h = Integer.valueOf(source.f53272h);
            this.f53285i = source.f53273i;
            this.f53286j = source.f53274j;
            this.f53287k = source.f53275k;
            this.f53288l = source.f53276l;
        }
    }
}
