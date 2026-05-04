package z8;

import z8.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101869e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p0, a> f101870f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final q0 f101871a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final r0 f101872b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final y f101873c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final y f101874d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 12) {
                                builder.d(y.f102272e.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 12) {
                            builder.b(y.f102272e.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.e(r0.f101950j.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.c(q0.f101904e.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k p0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyHome");
            protocol.Q6("progress", 1, (byte) 12);
            q0.f101904e.write(protocol, struct.f101871a);
            protocol.N2();
            protocol.Q6("today_progresss", 2, (byte) 12);
            r0.f101950j.write(protocol, struct.f101872b);
            protocol.N2();
            protocol.Q6("learning_button", 3, (byte) 12);
            ts.a<y, y.a> aVar = y.f102272e;
            aVar.write(protocol, struct.f101873c);
            protocol.N2();
            protocol.Q6("review_button", 4, (byte) 12);
            aVar.write(protocol, struct.f101874d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p0(@m80.k q0 progress, @m80.k r0 today_progresss, @m80.k y learning_button, @m80.k y review_button) {
        kotlin.jvm.internal.g0.p(progress, "progress");
        kotlin.jvm.internal.g0.p(today_progresss, "today_progresss");
        kotlin.jvm.internal.g0.p(learning_button, "learning_button");
        kotlin.jvm.internal.g0.p(review_button, "review_button");
        this.f101871a = progress;
        this.f101872b = today_progresss;
        this.f101873c = learning_button;
        this.f101874d = review_button;
    }

    public static /* synthetic */ p0 f(p0 p0Var, q0 q0Var, r0 r0Var, y yVar, y yVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            q0Var = p0Var.f101871a;
        }
        if ((i11 & 2) != 0) {
            r0Var = p0Var.f101872b;
        }
        if ((i11 & 4) != 0) {
            yVar = p0Var.f101873c;
        }
        if ((i11 & 8) != 0) {
            yVar2 = p0Var.f101874d;
        }
        return p0Var.e(q0Var, r0Var, yVar, yVar2);
    }

    @m80.k
    public final q0 a() {
        return this.f101871a;
    }

    @m80.k
    public final r0 b() {
        return this.f101872b;
    }

    @m80.k
    public final y c() {
        return this.f101873c;
    }

    @m80.k
    public final y d() {
        return this.f101874d;
    }

    @m80.k
    public final p0 e(@m80.k q0 progress, @m80.k r0 today_progresss, @m80.k y learning_button, @m80.k y review_button) {
        kotlin.jvm.internal.g0.p(progress, "progress");
        kotlin.jvm.internal.g0.p(today_progresss, "today_progresss");
        kotlin.jvm.internal.g0.p(learning_button, "learning_button");
        kotlin.jvm.internal.g0.p(review_button, "review_button");
        return new p0(progress, today_progresss, learning_button, review_button);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.g0.g(this.f101871a, p0Var.f101871a) && kotlin.jvm.internal.g0.g(this.f101872b, p0Var.f101872b) && kotlin.jvm.internal.g0.g(this.f101873c, p0Var.f101873c) && kotlin.jvm.internal.g0.g(this.f101874d, p0Var.f101874d);
    }

    public int hashCode() {
        return (((((this.f101871a.hashCode() * 31) + this.f101872b.hashCode()) * 31) + this.f101873c.hashCode()) * 31) + this.f101874d.hashCode();
    }

    @m80.k
    public String toString() {
        return "StudyHome(progress=" + this.f101871a + ", today_progresss=" + this.f101872b + ", learning_button=" + this.f101873c + ", review_button=" + this.f101874d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101870f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyHome.kt\ncom/baicizhan/biz/online/user_study_api/StudyHome$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class a implements ts.f<p0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public q0 f101875a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public r0 f101876b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public y f101877c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public y f101878d;

        public a() {
            this.f101875a = null;
            this.f101876b = null;
            this.f101877c = null;
            this.f101878d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 build() {
            q0 q0Var = this.f101875a;
            if (q0Var == null) {
                throw new IllegalStateException("Required field 'progress' is missing");
            }
            r0 r0Var = this.f101876b;
            if (r0Var == null) {
                throw new IllegalStateException("Required field 'today_progresss' is missing");
            }
            y yVar = this.f101877c;
            if (yVar == null) {
                throw new IllegalStateException("Required field 'learning_button' is missing");
            }
            y yVar2 = this.f101878d;
            if (yVar2 != null) {
                return new p0(q0Var, r0Var, yVar, yVar2);
            }
            throw new IllegalStateException("Required field 'review_button' is missing");
        }

        @m80.k
        public final a b(@m80.k y learning_button) {
            kotlin.jvm.internal.g0.p(learning_button, "learning_button");
            this.f101877c = learning_button;
            return this;
        }

        @m80.k
        public final a c(@m80.k q0 progress) {
            kotlin.jvm.internal.g0.p(progress, "progress");
            this.f101875a = progress;
            return this;
        }

        @m80.k
        public final a d(@m80.k y review_button) {
            kotlin.jvm.internal.g0.p(review_button, "review_button");
            this.f101878d = review_button;
            return this;
        }

        @m80.k
        public final a e(@m80.k r0 today_progresss) {
            kotlin.jvm.internal.g0.p(today_progresss, "today_progresss");
            this.f101876b = today_progresss;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101875a = null;
            this.f101876b = null;
            this.f101877c = null;
            this.f101878d = null;
        }

        public a(@m80.k p0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101875a = source.f101871a;
            this.f101876b = source.f101872b;
            this.f101877c = source.f101873c;
            this.f101878d = source.f101874d;
        }
    }
}
