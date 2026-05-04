package h8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f58849h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f58850i = new C0665a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f58851a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f58852b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58853c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58854d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58855e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f58856f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f58857g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h8.a$a, reason: collision with other inner class name */
    public static final class C0665a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.d(protocol.readString());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AvatarActionInfo");
            protocol.Q6("action_id", 1, (byte) 8);
            protocol.l5(struct.f58851a);
            protocol.N2();
            protocol.Q6("action_type", 2, (byte) 8);
            protocol.l5(struct.f58852b);
            protocol.N2();
            protocol.Q6("action_name", 3, (byte) 11);
            protocol.p1(struct.f58853c);
            protocol.N2();
            protocol.Q6("action_upgrade_text", 4, (byte) 11);
            protocol.p1(struct.f58854d);
            protocol.N2();
            protocol.Q6("action_icon", 5, (byte) 11);
            protocol.p1(struct.f58855e);
            protocol.N2();
            protocol.Q6("action_desc", 6, (byte) 11);
            protocol.p1(struct.f58856f);
            protocol.N2();
            if (struct.f58857g != null) {
                protocol.Q6(i9.j.f60415f, 7, (byte) 11);
                protocol.p1(struct.f58857g);
                protocol.N2();
            }
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

    public a(int i11, int i12, @m80.k String action_name, @m80.k String action_upgrade_text, @m80.k String action_icon, @m80.k String action_desc, @m80.l String str) {
        g0.p(action_name, "action_name");
        g0.p(action_upgrade_text, "action_upgrade_text");
        g0.p(action_icon, "action_icon");
        g0.p(action_desc, "action_desc");
        this.f58851a = i11;
        this.f58852b = i12;
        this.f58853c = action_name;
        this.f58854d = action_upgrade_text;
        this.f58855e = action_icon;
        this.f58856f = action_desc;
        this.f58857g = str;
    }

    public static /* synthetic */ a i(a aVar, int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f58851a;
        }
        if ((i13 & 2) != 0) {
            i12 = aVar.f58852b;
        }
        if ((i13 & 4) != 0) {
            str = aVar.f58853c;
        }
        if ((i13 & 8) != 0) {
            str2 = aVar.f58854d;
        }
        if ((i13 & 16) != 0) {
            str3 = aVar.f58855e;
        }
        if ((i13 & 32) != 0) {
            str4 = aVar.f58856f;
        }
        if ((i13 & 64) != 0) {
            str5 = aVar.f58857g;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return aVar.h(i11, i12, str9, str2, str8, str6, str7);
    }

    public final int a() {
        return this.f58851a;
    }

    public final int b() {
        return this.f58852b;
    }

    @m80.k
    public final String c() {
        return this.f58853c;
    }

    @m80.k
    public final String d() {
        return this.f58854d;
    }

    @m80.k
    public final String e() {
        return this.f58855e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f58851a == aVar.f58851a && this.f58852b == aVar.f58852b && g0.g(this.f58853c, aVar.f58853c) && g0.g(this.f58854d, aVar.f58854d) && g0.g(this.f58855e, aVar.f58855e) && g0.g(this.f58856f, aVar.f58856f) && g0.g(this.f58857g, aVar.f58857g);
    }

    @m80.k
    public final String f() {
        return this.f58856f;
    }

    @m80.l
    public final String g() {
        return this.f58857g;
    }

    @m80.k
    public final a h(int i11, int i12, @m80.k String action_name, @m80.k String action_upgrade_text, @m80.k String action_icon, @m80.k String action_desc, @m80.l String str) {
        g0.p(action_name, "action_name");
        g0.p(action_upgrade_text, "action_upgrade_text");
        g0.p(action_icon, "action_icon");
        g0.p(action_desc, "action_desc");
        return new a(i11, i12, action_name, action_upgrade_text, action_icon, action_desc, str);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f58851a) * 31) + Integer.hashCode(this.f58852b)) * 31) + this.f58853c.hashCode()) * 31) + this.f58854d.hashCode()) * 31) + this.f58855e.hashCode()) * 31) + this.f58856f.hashCode()) * 31;
        String str = this.f58857g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "AvatarActionInfo(action_id=" + this.f58851a + ", action_type=" + this.f58852b + ", action_name=" + this.f58853c + ", action_upgrade_text=" + this.f58854d + ", action_icon=" + this.f58855e + ", action_desc=" + this.f58856f + ", sound_effect=" + this.f58857g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f58850i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAvatarActionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarActionInfo.kt\ncom/baicizhan/biz/online/avatar_api/AvatarActionInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f58858a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f58859b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f58860c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f58861d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f58862e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f58863f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f58864g;

        public b() {
            this.f58858a = null;
            this.f58859b = null;
            this.f58860c = null;
            this.f58861d = null;
            this.f58862e = null;
            this.f58863f = null;
            this.f58864g = null;
        }

        @m80.k
        public final b a(@m80.k String action_desc) {
            g0.p(action_desc, "action_desc");
            this.f58863f = action_desc;
            return this;
        }

        @m80.k
        public final b b(@m80.k String action_icon) {
            g0.p(action_icon, "action_icon");
            this.f58862e = action_icon;
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f58858a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.k String action_name) {
            g0.p(action_name, "action_name");
            this.f58860c = action_name;
            return this;
        }

        @m80.k
        public final b e(int i11) {
            this.f58859b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b f(@m80.k String action_upgrade_text) {
            g0.p(action_upgrade_text, "action_upgrade_text");
            this.f58861d = action_upgrade_text;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f58858a;
            if (num == null) {
                throw new IllegalStateException("Required field 'action_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f58859b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'action_type' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f58860c;
            if (str == null) {
                throw new IllegalStateException("Required field 'action_name' is missing");
            }
            String str2 = this.f58861d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'action_upgrade_text' is missing");
            }
            String str3 = this.f58862e;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'action_icon' is missing");
            }
            String str4 = this.f58863f;
            if (str4 != null) {
                return new a(intValue, intValue2, str, str2, str3, str4, this.f58864g);
            }
            throw new IllegalStateException("Required field 'action_desc' is missing");
        }

        @m80.k
        public final b h(@m80.l String str) {
            this.f58864g = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f58858a = null;
            this.f58859b = null;
            this.f58860c = null;
            this.f58861d = null;
            this.f58862e = null;
            this.f58863f = null;
            this.f58864g = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f58858a = Integer.valueOf(source.f58851a);
            this.f58859b = Integer.valueOf(source.f58852b);
            this.f58860c = source.f58853c;
            this.f58861d = source.f58854d;
            this.f58862e = source.f58855e;
            this.f58863f = source.f58856f;
            this.f58864g = source.f58857g;
        }
    }
}
