package w8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f95729c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<e, a> f95730d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f95731a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f95732b;

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
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@k i protocol, @k a builder) {
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
                        builder.a(protocol.s8());
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
        public void write(@k i protocol, @k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ExportWord");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f95731a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f95732b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e(int i11, int i12) {
        this.f95731a = i11;
        this.f95732b = i12;
    }

    public static /* synthetic */ e d(e eVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = eVar.f95731a;
        }
        if ((i13 & 2) != 0) {
            i12 = eVar.f95732b;
        }
        return eVar.c(i11, i12);
    }

    public final int a() {
        return this.f95731a;
    }

    public final int b() {
        return this.f95732b;
    }

    @k
    public final e c(int i11, int i12) {
        return new e(i11, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f95731a == eVar.f95731a && this.f95732b == eVar.f95732b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f95731a) * 31) + Integer.hashCode(this.f95732b);
    }

    @k
    public String toString() {
        return "ExportWord(topic_id=" + this.f95731a + ", book_id=" + this.f95732b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f95730d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExportWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportWord.kt\ncom/baicizhan/biz/online/user_activity_api/ExportWord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f95733a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f95734b;

        public a() {
            this.f95733a = null;
            this.f95734b = null;
        }

        @k
        public final a a(int i11) {
            this.f95734b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f95733a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f95734b;
            if (num2 != null) {
                return new e(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'book_id' is missing");
        }

        @k
        public final a c(int i11) {
            this.f95733a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f95733a = null;
            this.f95734b = null;
        }

        public a(@k e source) {
            g0.p(source, "source");
            this.f95733a = Integer.valueOf(source.f95731a);
            this.f95734b = Integer.valueOf(source.f95732b);
        }
    }
}
