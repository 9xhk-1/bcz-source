package m8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f72592d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<b, C0874b> f72593e = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final String f72594a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f72595b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f72596c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C0874b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0874b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol, @k C0874b builder) {
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
                        } else if (b11 == 10) {
                            builder.c(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
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
        public void write(@k i protocol, @k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBOperationStatLog");
            protocol.Q6("op_name", 1, (byte) 11);
            protocol.p1(struct.f72594a);
            protocol.N2();
            protocol.Q6("op_value", 2, (byte) 8);
            protocol.l5(struct.f72595b);
            protocol.N2();
            protocol.Q6("op_time", 3, (byte) 10);
            protocol.q7(struct.f72596c);
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

    public b(@k String op_name, int i11, long j11) {
        g0.p(op_name, "op_name");
        this.f72594a = op_name;
        this.f72595b = i11;
        this.f72596c = j11;
    }

    public static /* synthetic */ b e(b bVar, String str, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bVar.f72594a;
        }
        if ((i12 & 2) != 0) {
            i11 = bVar.f72595b;
        }
        if ((i12 & 4) != 0) {
            j11 = bVar.f72596c;
        }
        return bVar.d(str, i11, j11);
    }

    @k
    public final String a() {
        return this.f72594a;
    }

    public final int b() {
        return this.f72595b;
    }

    public final long c() {
        return this.f72596c;
    }

    @k
    public final b d(@k String op_name, int i11, long j11) {
        g0.p(op_name, "op_name");
        return new b(op_name, i11, j11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f72594a, bVar.f72594a) && this.f72595b == bVar.f72595b && this.f72596c == bVar.f72596c;
    }

    public int hashCode() {
        return (((this.f72594a.hashCode() * 31) + Integer.hashCode(this.f72595b)) * 31) + Long.hashCode(this.f72596c);
    }

    @k
    public String toString() {
        return "BBOperationStatLog(op_name=" + this.f72594a + ", op_value=" + this.f72595b + ", op_time=" + this.f72596c + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f72593e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBOperationStatLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBOperationStatLog.kt\ncom/baicizhan/biz/online/bs_users/BBOperationStatLog$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    /* renamed from: m8.b$b, reason: collision with other inner class name */
    public static final class C0874b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f72597a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f72598b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Long f72599c;

        public C0874b() {
            this.f72597a = null;
            this.f72598b = null;
            this.f72599c = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            String str = this.f72597a;
            if (str == null) {
                throw new IllegalStateException("Required field 'op_name' is missing");
            }
            Integer num = this.f72598b;
            if (num == null) {
                throw new IllegalStateException("Required field 'op_value' is missing");
            }
            int intValue = num.intValue();
            Long l11 = this.f72599c;
            if (l11 != null) {
                return new b(str, intValue, l11.longValue());
            }
            throw new IllegalStateException("Required field 'op_time' is missing");
        }

        @k
        public final C0874b b(@k String op_name) {
            g0.p(op_name, "op_name");
            this.f72597a = op_name;
            return this;
        }

        @k
        public final C0874b c(long j11) {
            this.f72599c = Long.valueOf(j11);
            return this;
        }

        @k
        public final C0874b d(int i11) {
            this.f72598b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f72597a = null;
            this.f72598b = null;
            this.f72599c = null;
        }

        public C0874b(@k b source) {
            g0.p(source, "source");
            this.f72597a = source.f72594a;
            this.f72598b = Integer.valueOf(source.f72595b);
            this.f72599c = Long.valueOf(source.f72596c);
        }
    }
}
