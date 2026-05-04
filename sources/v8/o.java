package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f93349e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f93350f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93351a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93352b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final boolean f93353c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93354d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                builder.b(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 2) {
                            builder.c(protocol.readBool());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.e(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("SearchSchoolItem");
            protocol.Q6("school_name", 1, (byte) 11);
            protocol.p1(struct.f93351a);
            protocol.N2();
            protocol.Q6("school_id", 2, (byte) 8);
            protocol.l5(struct.f93352b);
            protocol.N2();
            protocol.Q6("is_university", 3, (byte) 2);
            protocol.a4(struct.f93353c);
            protocol.N2();
            if (struct.f93354d != null) {
                protocol.Q6("descrp", 4, (byte) 11);
                protocol.p1(struct.f93354d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public o(@m80.k String school_name, int i11, boolean z11, @m80.l String str) {
        g0.p(school_name, "school_name");
        this.f93351a = school_name;
        this.f93352b = i11;
        this.f93353c = z11;
        this.f93354d = str;
    }

    public static /* synthetic */ o f(o oVar, String str, int i11, boolean z11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = oVar.f93351a;
        }
        if ((i12 & 2) != 0) {
            i11 = oVar.f93352b;
        }
        if ((i12 & 4) != 0) {
            z11 = oVar.f93353c;
        }
        if ((i12 & 8) != 0) {
            str2 = oVar.f93354d;
        }
        return oVar.e(str, i11, z11, str2);
    }

    @m80.k
    public final String a() {
        return this.f93351a;
    }

    public final int b() {
        return this.f93352b;
    }

    public final boolean c() {
        return this.f93353c;
    }

    @m80.l
    public final String d() {
        return this.f93354d;
    }

    @m80.k
    public final o e(@m80.k String school_name, int i11, boolean z11, @m80.l String str) {
        g0.p(school_name, "school_name");
        return new o(school_name, i11, z11, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return g0.g(this.f93351a, oVar.f93351a) && this.f93352b == oVar.f93352b && this.f93353c == oVar.f93353c && g0.g(this.f93354d, oVar.f93354d);
    }

    public int hashCode() {
        int hashCode = ((((this.f93351a.hashCode() * 31) + Integer.hashCode(this.f93352b)) * 31) + Boolean.hashCode(this.f93353c)) * 31;
        String str = this.f93354d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "SearchSchoolItem(school_name=" + this.f93351a + ", school_id=" + this.f93352b + ", is_university=" + this.f93353c + ", descrp=" + this.f93354d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93350f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSearchSchoolItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchSchoolItem.kt\ncom/baicizhan/biz/online/unified_user_service/SearchSchoolItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93355a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93356b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Boolean f93357c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93358d;

        public a() {
            this.f93355a = null;
            this.f93356b = null;
            this.f93357c = null;
            this.f93358d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o build() {
            String str = this.f93355a;
            if (str == null) {
                throw new IllegalStateException("Required field 'school_name' is missing");
            }
            Integer num = this.f93356b;
            if (num == null) {
                throw new IllegalStateException("Required field 'school_id' is missing");
            }
            int intValue = num.intValue();
            Boolean bool = this.f93357c;
            if (bool != null) {
                return new o(str, intValue, bool.booleanValue(), this.f93358d);
            }
            throw new IllegalStateException("Required field 'is_university' is missing");
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f93358d = str;
            return this;
        }

        @m80.k
        public final a c(boolean z11) {
            this.f93357c = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f93356b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String school_name) {
            g0.p(school_name, "school_name");
            this.f93355a = school_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93355a = null;
            this.f93356b = null;
            this.f93357c = null;
            this.f93358d = null;
        }

        public a(@m80.k o source) {
            g0.p(source, "source");
            this.f93355a = source.f93351a;
            this.f93356b = Integer.valueOf(source.f93352b);
            this.f93357c = Boolean.valueOf(source.f93353c);
            this.f93358d = source.f93354d;
        }
    }
}
