package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f74622c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C0904b> f74623d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74624a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74625b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C0904b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0904b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C0904b builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBExam");
            protocol.Q6("exam_id", 1, (byte) 8);
            protocol.l5(struct.f74624a);
            protocol.N2();
            protocol.Q6("exam_name", 2, (byte) 11);
            protocol.p1(struct.f74625b);
            protocol.N2();
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

    public b(int i11, @m80.k String exam_name) {
        g0.p(exam_name, "exam_name");
        this.f74624a = i11;
        this.f74625b = exam_name;
    }

    public static /* synthetic */ b d(b bVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bVar.f74624a;
        }
        if ((i12 & 2) != 0) {
            str = bVar.f74625b;
        }
        return bVar.c(i11, str);
    }

    public final int a() {
        return this.f74624a;
    }

    @m80.k
    public final String b() {
        return this.f74625b;
    }

    @m80.k
    public final b c(int i11, @m80.k String exam_name) {
        g0.p(exam_name, "exam_name");
        return new b(i11, exam_name);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f74624a == bVar.f74624a && g0.g(this.f74625b, bVar.f74625b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f74624a) * 31) + this.f74625b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BBExam(exam_id=" + this.f74624a + ", exam_name=" + this.f74625b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74623d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBExam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBExam.kt\ncom/baicizhan/biz/online/bs_words/BBExam$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    /* renamed from: n8.b$b, reason: collision with other inner class name */
    public static final class C0904b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74626a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74627b;

        public C0904b() {
            this.f74626a = null;
            this.f74627b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f74626a;
            if (num == null) {
                throw new IllegalStateException("Required field 'exam_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74627b;
            if (str != null) {
                return new b(intValue, str);
            }
            throw new IllegalStateException("Required field 'exam_name' is missing");
        }

        @m80.k
        public final C0904b b(int i11) {
            this.f74626a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final C0904b c(@m80.k String exam_name) {
            g0.p(exam_name, "exam_name");
            this.f74627b = exam_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74626a = null;
            this.f74627b = null;
        }

        public C0904b(@m80.k b source) {
            g0.p(source, "source");
            this.f74626a = Integer.valueOf(source.f74624a);
            this.f74627b = source.f74625b;
        }
    }
}
