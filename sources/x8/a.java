package x8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f97676d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<a, C1312a> f97677e = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f97678a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f97679b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f97680c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<a, C1312a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C1312a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k ws.i protocol, @k C1312a builder) {
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
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.d(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k ws.i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ClipboardResp");
            protocol.Q6("style", 1, (byte) 8);
            protocol.l5(struct.f97678a);
            protocol.N2();
            protocol.Q6("json", 2, (byte) 11);
            protocol.p1(struct.f97679b);
            protocol.N2();
            protocol.Q6(ma.b.f72889a1, 3, (byte) 8);
            protocol.l5(struct.f97680c);
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

    public a(int i11, @k String json, int i12) {
        g0.p(json, "json");
        this.f97678a = i11;
        this.f97679b = json;
        this.f97680c = i12;
    }

    public static /* synthetic */ a e(a aVar, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f97678a;
        }
        if ((i13 & 2) != 0) {
            str = aVar.f97679b;
        }
        if ((i13 & 4) != 0) {
            i12 = aVar.f97680c;
        }
        return aVar.d(i11, str, i12);
    }

    public final int a() {
        return this.f97678a;
    }

    @k
    public final String b() {
        return this.f97679b;
    }

    public final int c() {
        return this.f97680c;
    }

    @k
    public final a d(int i11, @k String json, int i12) {
        g0.p(json, "json");
        return new a(i11, json, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f97678a == aVar.f97678a && g0.g(this.f97679b, aVar.f97679b) && this.f97680c == aVar.f97680c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f97678a) * 31) + this.f97679b.hashCode()) * 31) + Integer.hashCode(this.f97680c);
    }

    @k
    public String toString() {
        return "ClipboardResp(style=" + this.f97678a + ", json=" + this.f97679b + ", businessId=" + this.f97680c + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97677e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nClipboardResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardResp.kt\ncom/baicizhan/biz/online/user_assistant_api/ClipboardResp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    /* renamed from: x8.a$a, reason: collision with other inner class name */
    public static final class C1312a implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f97681a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f97682b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Integer f97683c;

        public C1312a() {
            this.f97681a = null;
            this.f97682b = null;
            this.f97683c = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f97681a;
            if (num == null) {
                throw new IllegalStateException("Required field 'style' is missing");
            }
            int intValue = num.intValue();
            String str = this.f97682b;
            if (str == null) {
                throw new IllegalStateException("Required field 'json' is missing");
            }
            Integer num2 = this.f97683c;
            if (num2 != null) {
                return new a(intValue, str, num2.intValue());
            }
            throw new IllegalStateException("Required field 'businessId' is missing");
        }

        @k
        public final C1312a b(int i11) {
            this.f97683c = Integer.valueOf(i11);
            return this;
        }

        @k
        public final C1312a c(@k String json) {
            g0.p(json, "json");
            this.f97682b = json;
            return this;
        }

        @k
        public final C1312a d(int i11) {
            this.f97681a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97681a = null;
            this.f97682b = null;
            this.f97683c = null;
        }

        public C1312a(@k a source) {
            g0.p(source, "source");
            this.f97681a = Integer.valueOf(source.f97678a);
            this.f97682b = source.f97679b;
            this.f97683c = Integer.valueOf(source.f97680c);
        }
    }
}
