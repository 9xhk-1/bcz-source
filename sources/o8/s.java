package o8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f76521c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s, a> f76522d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f76523a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f76524b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k s struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UnderLineItem");
            protocol.Q6("start_index", 1, (byte) 8);
            protocol.l5(struct.f76523a);
            protocol.N2();
            protocol.Q6("end_index", 2, (byte) 8);
            protocol.l5(struct.f76524b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public s(int i11, int i12) {
        this.f76523a = i11;
        this.f76524b = i12;
    }

    public static /* synthetic */ s d(s sVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = sVar.f76523a;
        }
        if ((i13 & 2) != 0) {
            i12 = sVar.f76524b;
        }
        return sVar.c(i11, i12);
    }

    public final int a() {
        return this.f76523a;
    }

    public final int b() {
        return this.f76524b;
    }

    @m80.k
    public final s c(int i11, int i12) {
        return new s(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f76523a == sVar.f76523a && this.f76524b == sVar.f76524b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f76523a) * 31) + Integer.hashCode(this.f76524b);
    }

    @m80.k
    public String toString() {
        return "UnderLineItem(start_index=" + this.f76523a + ", end_index=" + this.f76524b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f76522d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUnderLineItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnderLineItem.kt\ncom/baicizhan/biz/online/course_api/UnderLineItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f76525a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f76526b;

        public a() {
            this.f76525a = null;
            this.f76526b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s build() {
            Integer num = this.f76525a;
            if (num == null) {
                throw new IllegalStateException("Required field 'start_index' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f76526b;
            if (num2 != null) {
                return new s(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'end_index' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f76526b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f76525a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f76525a = null;
            this.f76526b = null;
        }

        public a(@m80.k s source) {
            g0.p(source, "source");
            this.f76525a = Integer.valueOf(source.f76523a);
            this.f76526b = Integer.valueOf(source.f76524b);
        }
    }
}
