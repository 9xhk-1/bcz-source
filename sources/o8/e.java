package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f76395d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, a> f76396e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76397a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final q f76398b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f76399c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(q.f76502d.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("CourseQs");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f76397a);
            protocol.N2();
            protocol.Q6("qs_info", 2, (byte) 12);
            q.f76502d.write(protocol, struct.f76398b);
            protocol.N2();
            protocol.Q6("version", 3, (byte) 8);
            protocol.l5(struct.f76399c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e(int i11, @m80.k q qs_info, int i12) {
        g0.p(qs_info, "qs_info");
        this.f76397a = i11;
        this.f76398b = qs_info;
        this.f76399c = i12;
    }

    public static /* synthetic */ e e(e eVar, int i11, q qVar, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = eVar.f76397a;
        }
        if ((i13 & 2) != 0) {
            qVar = eVar.f76398b;
        }
        if ((i13 & 4) != 0) {
            i12 = eVar.f76399c;
        }
        return eVar.d(i11, qVar, i12);
    }

    public final int a() {
        return this.f76397a;
    }

    @m80.k
    public final q b() {
        return this.f76398b;
    }

    public final int c() {
        return this.f76399c;
    }

    @m80.k
    public final e d(int i11, @m80.k q qs_info, int i12) {
        g0.p(qs_info, "qs_info");
        return new e(i11, qs_info, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f76397a == eVar.f76397a && g0.g(this.f76398b, eVar.f76398b) && this.f76399c == eVar.f76399c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f76397a) * 31) + this.f76398b.hashCode()) * 31) + Integer.hashCode(this.f76399c);
    }

    @m80.k
    public String toString() {
        return "CourseQs(id=" + this.f76397a + ", qs_info=" + this.f76398b + ", version=" + this.f76399c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76396e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCourseQs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseQs.kt\ncom/baicizhan/biz/online/course_api/CourseQs$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76400a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public q f76401b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f76402c;

        public a() {
            this.f76400a = null;
            this.f76401b = null;
            this.f76402c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f76400a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            q qVar = this.f76401b;
            if (qVar == null) {
                throw new IllegalStateException("Required field 'qs_info' is missing");
            }
            Integer num2 = this.f76402c;
            if (num2 != null) {
                return new e(intValue, qVar, num2.intValue());
            }
            throw new IllegalStateException("Required field 'version' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f76400a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k q qs_info) {
            g0.p(qs_info, "qs_info");
            this.f76401b = qs_info;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f76402c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76400a = null;
            this.f76401b = null;
            this.f76402c = null;
        }

        public a(@m80.k e source) {
            g0.p(source, "source");
            this.f76400a = Integer.valueOf(source.f76397a);
            this.f76401b = source.f76398b;
            this.f76402c = Integer.valueOf(source.f76399c);
        }
    }
}
