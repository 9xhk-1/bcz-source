package g8;

import com.tencent.connect.share.QQShare;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f53172e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C0629b> f53173f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53174a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f53175b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53176c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53177d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C0629b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0629b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C0629b builder) {
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
                            } else if (b11 == 11) {
                                builder.e(protocol.readString());
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
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdLink");
            protocol.Q6(y9.b.f99687c, 1, (byte) 11);
            protocol.p1(struct.f53174a);
            protocol.N2();
            protocol.Q6("jump_type", 2, (byte) 8);
            protocol.l5(struct.f53175b);
            protocol.N2();
            if (struct.f53176c != null) {
                protocol.Q6("mini_program_id", 3, (byte) 11);
                protocol.p1(struct.f53176c);
                protocol.N2();
            }
            if (struct.f53177d != null) {
                protocol.Q6(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, 4, (byte) 11);
                protocol.p1(struct.f53177d);
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

    public b(@m80.k String link, int i11, @m80.l String str, @m80.l String str2) {
        g0.p(link, "link");
        this.f53174a = link;
        this.f53175b = i11;
        this.f53176c = str;
        this.f53177d = str2;
    }

    public static /* synthetic */ b f(b bVar, String str, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bVar.f53174a;
        }
        if ((i12 & 2) != 0) {
            i11 = bVar.f53175b;
        }
        if ((i12 & 4) != 0) {
            str2 = bVar.f53176c;
        }
        if ((i12 & 8) != 0) {
            str3 = bVar.f53177d;
        }
        return bVar.e(str, i11, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f53174a;
    }

    public final int b() {
        return this.f53175b;
    }

    @m80.l
    public final String c() {
        return this.f53176c;
    }

    @m80.l
    public final String d() {
        return this.f53177d;
    }

    @m80.k
    public final b e(@m80.k String link, int i11, @m80.l String str, @m80.l String str2) {
        g0.p(link, "link");
        return new b(link, i11, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f53174a, bVar.f53174a) && this.f53175b == bVar.f53175b && g0.g(this.f53176c, bVar.f53176c) && g0.g(this.f53177d, bVar.f53177d);
    }

    public int hashCode() {
        int hashCode = ((this.f53174a.hashCode() * 31) + Integer.hashCode(this.f53175b)) * 31;
        String str = this.f53176c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53177d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "AdLink(link=" + this.f53174a + ", jump_type=" + this.f53175b + ", mini_program_id=" + this.f53176c + ", mini_program_path=" + this.f53177d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53173f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdLink.kt\ncom/baicizhan/biz/online/advertise_api/AdLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
    /* renamed from: g8.b$b, reason: collision with other inner class name */
    public static final class C0629b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53178a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f53179b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53180c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53181d;

        public C0629b() {
            this.f53178a = null;
            this.f53179b = null;
            this.f53180c = null;
            this.f53181d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            String str = this.f53178a;
            if (str == null) {
                throw new IllegalStateException("Required field 'link' is missing");
            }
            Integer num = this.f53179b;
            if (num != null) {
                return new b(str, num.intValue(), this.f53180c, this.f53181d);
            }
            throw new IllegalStateException("Required field 'jump_type' is missing");
        }

        @m80.k
        public final C0629b b(int i11) {
            this.f53179b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final C0629b c(@m80.k String link) {
            g0.p(link, "link");
            this.f53178a = link;
            return this;
        }

        @m80.k
        public final C0629b d(@m80.l String str) {
            this.f53180c = str;
            return this;
        }

        @m80.k
        public final C0629b e(@m80.l String str) {
            this.f53181d = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53178a = null;
            this.f53179b = null;
            this.f53180c = null;
            this.f53181d = null;
        }

        public C0629b(@m80.k b source) {
            g0.p(source, "source");
            this.f53178a = source.f53174a;
            this.f53179b = Integer.valueOf(source.f53175b);
            this.f53180c = source.f53176c;
            this.f53181d = source.f53177d;
        }
    }
}
