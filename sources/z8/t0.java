package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t0 implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f102041j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t0, a> f102042k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102043a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102044b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102045c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102046d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102047e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f102048f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102049g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final int f102050h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f102051i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t0 read(@m80.k ws.i protocol, @m80.k a builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
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
                            builder.j(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
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
                            builder.a(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 9:
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
        public void write(@m80.k ws.i protocol, @m80.k t0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("Task");
            protocol.Q6("task_id", 1, (byte) 8);
            protocol.l5(struct.f102043a);
            protocol.N2();
            protocol.Q6(ma.b.f72959x1, 2, (byte) 8);
            protocol.l5(struct.f102044b);
            protocol.N2();
            protocol.Q6("task_title", 3, (byte) 11);
            protocol.p1(struct.f102045c);
            protocol.N2();
            protocol.Q6("task_sub_title", 4, (byte) 11);
            protocol.p1(struct.f102046d);
            protocol.N2();
            protocol.Q6(ma.b.D1, 5, (byte) 11);
            protocol.p1(struct.f102047e);
            protocol.N2();
            protocol.Q6("status", 6, (byte) 8);
            protocol.l5(struct.f102048f);
            protocol.N2();
            protocol.Q6("button_desc", 7, (byte) 11);
            protocol.p1(struct.f102049g);
            protocol.N2();
            protocol.Q6("button_action_type", 8, (byte) 8);
            protocol.l5(struct.f102050h);
            protocol.N2();
            if (struct.f102051i != null) {
                protocol.Q6("button_redirect_url", 9, (byte) 11);
                protocol.p1(struct.f102051i);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public t0(int i11, int i12, @m80.k String task_title, @m80.k String task_sub_title, @m80.k String award, int i13, @m80.k String button_desc, int i14, @m80.l String str) {
        kotlin.jvm.internal.g0.p(task_title, "task_title");
        kotlin.jvm.internal.g0.p(task_sub_title, "task_sub_title");
        kotlin.jvm.internal.g0.p(award, "award");
        kotlin.jvm.internal.g0.p(button_desc, "button_desc");
        this.f102043a = i11;
        this.f102044b = i12;
        this.f102045c = task_title;
        this.f102046d = task_sub_title;
        this.f102047e = award;
        this.f102048f = i13;
        this.f102049g = button_desc;
        this.f102050h = i14;
        this.f102051i = str;
    }

    public static /* synthetic */ t0 k(t0 t0Var, int i11, int i12, String str, String str2, String str3, int i13, String str4, int i14, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = t0Var.f102043a;
        }
        if ((i15 & 2) != 0) {
            i12 = t0Var.f102044b;
        }
        if ((i15 & 4) != 0) {
            str = t0Var.f102045c;
        }
        if ((i15 & 8) != 0) {
            str2 = t0Var.f102046d;
        }
        if ((i15 & 16) != 0) {
            str3 = t0Var.f102047e;
        }
        if ((i15 & 32) != 0) {
            i13 = t0Var.f102048f;
        }
        if ((i15 & 64) != 0) {
            str4 = t0Var.f102049g;
        }
        if ((i15 & 128) != 0) {
            i14 = t0Var.f102050h;
        }
        if ((i15 & 256) != 0) {
            str5 = t0Var.f102051i;
        }
        int i16 = i14;
        String str6 = str5;
        int i17 = i13;
        String str7 = str4;
        String str8 = str3;
        String str9 = str;
        return t0Var.j(i11, i12, str9, str2, str8, i17, str7, i16, str6);
    }

    public final int a() {
        return this.f102043a;
    }

    public final int b() {
        return this.f102044b;
    }

    @m80.k
    public final String c() {
        return this.f102045c;
    }

    @m80.k
    public final String d() {
        return this.f102046d;
    }

    @m80.k
    public final String e() {
        return this.f102047e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f102043a == t0Var.f102043a && this.f102044b == t0Var.f102044b && kotlin.jvm.internal.g0.g(this.f102045c, t0Var.f102045c) && kotlin.jvm.internal.g0.g(this.f102046d, t0Var.f102046d) && kotlin.jvm.internal.g0.g(this.f102047e, t0Var.f102047e) && this.f102048f == t0Var.f102048f && kotlin.jvm.internal.g0.g(this.f102049g, t0Var.f102049g) && this.f102050h == t0Var.f102050h && kotlin.jvm.internal.g0.g(this.f102051i, t0Var.f102051i);
    }

    public final int f() {
        return this.f102048f;
    }

    @m80.k
    public final String g() {
        return this.f102049g;
    }

    public final int h() {
        return this.f102050h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f102043a) * 31) + Integer.hashCode(this.f102044b)) * 31) + this.f102045c.hashCode()) * 31) + this.f102046d.hashCode()) * 31) + this.f102047e.hashCode()) * 31) + Integer.hashCode(this.f102048f)) * 31) + this.f102049g.hashCode()) * 31) + Integer.hashCode(this.f102050h)) * 31;
        String str = this.f102051i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.l
    public final String i() {
        return this.f102051i;
    }

    @m80.k
    public final t0 j(int i11, int i12, @m80.k String task_title, @m80.k String task_sub_title, @m80.k String award, int i13, @m80.k String button_desc, int i14, @m80.l String str) {
        kotlin.jvm.internal.g0.p(task_title, "task_title");
        kotlin.jvm.internal.g0.p(task_sub_title, "task_sub_title");
        kotlin.jvm.internal.g0.p(award, "award");
        kotlin.jvm.internal.g0.p(button_desc, "button_desc");
        return new t0(i11, i12, task_title, task_sub_title, award, i13, button_desc, i14, str);
    }

    @m80.k
    public String toString() {
        return "Task(task_id=" + this.f102043a + ", task_type=" + this.f102044b + ", task_title=" + this.f102045c + ", task_sub_title=" + this.f102046d + ", award=" + this.f102047e + ", status=" + this.f102048f + ", button_desc=" + this.f102049g + ", button_action_type=" + this.f102050h + ", button_redirect_url=" + this.f102051i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102042k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\ncom/baicizhan/biz/online/user_study_api/Task$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class a implements ts.f<t0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102052a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102053b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f102054c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f102055d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f102056e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f102057f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f102058g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f102059h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f102060i;

        public a() {
            this.f102052a = null;
            this.f102053b = null;
            this.f102054c = null;
            this.f102055d = null;
            this.f102056e = null;
            this.f102057f = null;
            this.f102058g = null;
            this.f102059h = null;
            this.f102060i = null;
        }

        @m80.k
        public final a a(@m80.k String award) {
            kotlin.jvm.internal.g0.p(award, "award");
            this.f102056e = award;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t0 build() {
            Integer num = this.f102052a;
            if (num == null) {
                throw new IllegalStateException("Required field 'task_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102053b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'task_type' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f102054c;
            if (str == null) {
                throw new IllegalStateException("Required field 'task_title' is missing");
            }
            String str2 = this.f102055d;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'task_sub_title' is missing");
            }
            String str3 = this.f102056e;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'award' is missing");
            }
            Integer num3 = this.f102057f;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'status' is missing");
            }
            int intValue3 = num3.intValue();
            String str4 = this.f102058g;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'button_desc' is missing");
            }
            Integer num4 = this.f102059h;
            if (num4 != null) {
                return new t0(intValue, intValue2, str, str2, str3, intValue3, str4, num4.intValue(), this.f102060i);
            }
            throw new IllegalStateException("Required field 'button_action_type' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f102059h = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String button_desc) {
            kotlin.jvm.internal.g0.p(button_desc, "button_desc");
            this.f102058g = button_desc;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f102060i = str;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f102057f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f102052a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(@m80.k String task_sub_title) {
            kotlin.jvm.internal.g0.p(task_sub_title, "task_sub_title");
            this.f102055d = task_sub_title;
            return this;
        }

        @m80.k
        public final a i(@m80.k String task_title) {
            kotlin.jvm.internal.g0.p(task_title, "task_title");
            this.f102054c = task_title;
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f102053b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102052a = null;
            this.f102053b = null;
            this.f102054c = null;
            this.f102055d = null;
            this.f102056e = null;
            this.f102057f = null;
            this.f102058g = null;
            this.f102059h = null;
            this.f102060i = null;
        }

        public a(@m80.k t0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102052a = Integer.valueOf(source.f102043a);
            this.f102053b = Integer.valueOf(source.f102044b);
            this.f102054c = source.f102045c;
            this.f102055d = source.f102046d;
            this.f102056e = source.f102047e;
            this.f102057f = Integer.valueOf(source.f102048f);
            this.f102058g = source.f102049g;
            this.f102059h = Integer.valueOf(source.f102050h);
            this.f102060i = source.f102051i;
        }
    }
}
