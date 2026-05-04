package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f76357c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, C0932a> f76358d = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f76359a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f76360b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<a, C0932a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0932a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k C0932a builder) {
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
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ChoiceBaseItem");
            protocol.Q6("content", 1, (byte) 11);
            protocol.p1(struct.f76359a);
            protocol.N2();
            protocol.Q6(ma.b.P, 2, (byte) 8);
            protocol.l5(struct.f76360b);
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

    public a(@m80.k String content, int i11) {
        g0.p(content, "content");
        this.f76359a = content;
        this.f76360b = i11;
    }

    public static /* synthetic */ a d(a aVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.f76359a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f76360b;
        }
        return aVar.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f76359a;
    }

    public final int b() {
        return this.f76360b;
    }

    @m80.k
    public final a c(@m80.k String content, int i11) {
        g0.p(content, "content");
        return new a(content, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f76359a, aVar.f76359a) && this.f76360b == aVar.f76360b;
    }

    public int hashCode() {
        return (this.f76359a.hashCode() * 31) + Integer.hashCode(this.f76360b);
    }

    @m80.k
    public String toString() {
        return "ChoiceBaseItem(content=" + this.f76359a + ", correct=" + this.f76360b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76358d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nChoiceBaseItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoiceBaseItem.kt\ncom/baicizhan/biz/online/course_api/ChoiceBaseItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    /* renamed from: o8.a$a, reason: collision with other inner class name */
    public static final class C0932a implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f76361a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f76362b;

        public C0932a() {
            this.f76361a = null;
            this.f76362b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            String str = this.f76361a;
            if (str == null) {
                throw new IllegalStateException("Required field 'content' is missing");
            }
            Integer num = this.f76362b;
            if (num != null) {
                return new a(str, num.intValue());
            }
            throw new IllegalStateException("Required field 'correct' is missing");
        }

        @m80.k
        public final C0932a b(@m80.k String content) {
            g0.p(content, "content");
            this.f76361a = content;
            return this;
        }

        @m80.k
        public final C0932a c(int i11) {
            this.f76362b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76361a = null;
            this.f76362b = null;
        }

        public C0932a(@m80.k a source) {
            g0.p(source, "source");
            this.f76361a = source.f76359a;
            this.f76362b = Integer.valueOf(source.f76360b);
        }
    }
}
