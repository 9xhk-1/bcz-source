package r8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f83673c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<h, a> f83674d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f83675a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f83676b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h read(@k i protocol, @k a builder) {
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
        public void write(@k i protocol, @k h struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserRemindMsg");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f83675a);
            protocol.N2();
            protocol.Q6("msg", 2, (byte) 11);
            protocol.p1(struct.f83676b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public h(int i11, @k String msg) {
        g0.p(msg, "msg");
        this.f83675a = i11;
        this.f83676b = msg;
    }

    public static /* synthetic */ h d(h hVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = hVar.f83675a;
        }
        if ((i12 & 2) != 0) {
            str = hVar.f83676b;
        }
        return hVar.c(i11, str);
    }

    public final int a() {
        return this.f83675a;
    }

    @k
    public final String b() {
        return this.f83676b;
    }

    @k
    public final h c(int i11, @k String msg) {
        g0.p(msg, "msg");
        return new h(i11, msg);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f83675a == hVar.f83675a && g0.g(this.f83676b, hVar.f83676b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f83675a) * 31) + this.f83676b.hashCode();
    }

    @k
    public String toString() {
        return "UserRemindMsg(id=" + this.f83675a + ", msg=" + this.f83676b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f83674d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserRemindMsg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRemindMsg.kt\ncom/baicizhan/biz/online/notify/UserRemindMsg$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
    public static final class a implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f83677a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f83678b;

        public a() {
            this.f83677a = null;
            this.f83678b = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h build() {
            Integer num = this.f83677a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f83678b;
            if (str != null) {
                return new h(intValue, str);
            }
            throw new IllegalStateException("Required field 'msg' is missing");
        }

        @k
        public final a b(int i11) {
            this.f83677a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a c(@k String msg) {
            g0.p(msg, "msg");
            this.f83678b = msg;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f83677a = null;
            this.f83678b = null;
        }

        public a(@k h source) {
            g0.p(source, "source");
            this.f83677a = Integer.valueOf(source.f83675a);
            this.f83678b = source.f83676b;
        }
    }
}
