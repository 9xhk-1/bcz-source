package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final c f58943f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, b> f58944g = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58945a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58946b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58947c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58948d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58949e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<i, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k b builder) {
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
                                } else if (b11 == 11) {
                                    builder.b(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.c(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.f(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarSkillInfo");
            protocol.Q6("skill_id", 1, (byte) 8);
            protocol.l5(struct.f58945a);
            protocol.N2();
            protocol.Q6("skill_name", 2, (byte) 11);
            protocol.p1(struct.f58946b);
            protocol.N2();
            protocol.Q6("skill_upgrade_text", 3, (byte) 11);
            protocol.p1(struct.f58947c);
            protocol.N2();
            protocol.Q6("skill_icon", 4, (byte) 11);
            protocol.p1(struct.f58948d);
            protocol.N2();
            protocol.Q6("skill_desc", 5, (byte) 11);
            protocol.p1(struct.f58949e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public i(int i11, @m80.k String skill_name, @m80.k String skill_upgrade_text, @m80.k String skill_icon, @m80.k String skill_desc) {
        g0.p(skill_name, "skill_name");
        g0.p(skill_upgrade_text, "skill_upgrade_text");
        g0.p(skill_icon, "skill_icon");
        g0.p(skill_desc, "skill_desc");
        this.f58945a = i11;
        this.f58946b = skill_name;
        this.f58947c = skill_upgrade_text;
        this.f58948d = skill_icon;
        this.f58949e = skill_desc;
    }

    public static /* synthetic */ i g(i iVar, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iVar.f58945a;
        }
        if ((i12 & 2) != 0) {
            str = iVar.f58946b;
        }
        if ((i12 & 4) != 0) {
            str2 = iVar.f58947c;
        }
        if ((i12 & 8) != 0) {
            str3 = iVar.f58948d;
        }
        if ((i12 & 16) != 0) {
            str4 = iVar.f58949e;
        }
        String str5 = str4;
        String str6 = str2;
        return iVar.f(i11, str, str6, str3, str5);
    }

    public final int a() {
        return this.f58945a;
    }

    @m80.k
    public final String b() {
        return this.f58946b;
    }

    @m80.k
    public final String c() {
        return this.f58947c;
    }

    @m80.k
    public final String d() {
        return this.f58948d;
    }

    @m80.k
    public final String e() {
        return this.f58949e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f58945a == iVar.f58945a && g0.g(this.f58946b, iVar.f58946b) && g0.g(this.f58947c, iVar.f58947c) && g0.g(this.f58948d, iVar.f58948d) && g0.g(this.f58949e, iVar.f58949e);
    }

    @m80.k
    public final i f(int i11, @m80.k String skill_name, @m80.k String skill_upgrade_text, @m80.k String skill_icon, @m80.k String skill_desc) {
        g0.p(skill_name, "skill_name");
        g0.p(skill_upgrade_text, "skill_upgrade_text");
        g0.p(skill_icon, "skill_icon");
        g0.p(skill_desc, "skill_desc");
        return new i(i11, skill_name, skill_upgrade_text, skill_icon, skill_desc);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f58945a) * 31) + this.f58946b.hashCode()) * 31) + this.f58947c.hashCode()) * 31) + this.f58948d.hashCode()) * 31) + this.f58949e.hashCode();
    }

    @m80.k
    public String toString() {
        return "AvatarSkillInfo(skill_id=" + this.f58945a + ", skill_name=" + this.f58946b + ", skill_upgrade_text=" + this.f58947c + ", skill_icon=" + this.f58948d + ", skill_desc=" + this.f58949e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58944g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarSkillInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarSkillInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarSkillInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
    public static final class b implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58950a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f58951b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f58952c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f58953d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f58954e;

        public b() {
            this.f58950a = null;
            this.f58951b = null;
            this.f58952c = null;
            this.f58953d = null;
            this.f58954e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f58950a;
            if (num == null) {
                throw new IllegalStateException("Required field 'skill_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f58951b;
            if (str == null) {
                throw new IllegalStateException("Required field 'skill_name' is missing");
            }
            String str2 = this.f58952c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'skill_upgrade_text' is missing");
            }
            String str3 = this.f58953d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'skill_icon' is missing");
            }
            String str4 = this.f58954e;
            if (str4 != null) {
                return new i(intValue, str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'skill_desc' is missing");
        }

        @m80.k
        public final b b(@m80.k String skill_desc) {
            g0.p(skill_desc, "skill_desc");
            this.f58954e = skill_desc;
            return this;
        }

        @m80.k
        public final b c(@m80.k String skill_icon) {
            g0.p(skill_icon, "skill_icon");
            this.f58953d = skill_icon;
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f58950a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(@m80.k String skill_name) {
            g0.p(skill_name, "skill_name");
            this.f58951b = skill_name;
            return this;
        }

        @m80.k
        public final b f(@m80.k String skill_upgrade_text) {
            g0.p(skill_upgrade_text, "skill_upgrade_text");
            this.f58952c = skill_upgrade_text;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58950a = null;
            this.f58951b = null;
            this.f58952c = null;
            this.f58953d = null;
            this.f58954e = null;
        }

        public b(@m80.k i source) {
            g0.p(source, "source");
            this.f58950a = Integer.valueOf(source.f58945a);
            this.f58951b = source.f58946b;
            this.f58952c = source.f58947c;
            this.f58953d = source.f58948d;
            this.f58954e = source.f58949e;
        }
    }
}
