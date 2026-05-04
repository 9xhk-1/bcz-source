package f8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import ts.f;
import w00.g;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0612c f51280b = new C0612c(null);

    /* renamed from: c, reason: collision with root package name */
    @g
    @k
    public static final ts.a<c, b> f51281c = new a();

    /* renamed from: a, reason: collision with root package name */
    @l
    @g
    public final String f51282a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k i protocol, @k b builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
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
        public void write(@k i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdLunchApp");
            if (struct.f51282a != null) {
                protocol.Q6("deeplink", 1, (byte) 11);
                protocol.p1(struct.f51282a);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: f8.c$c, reason: collision with other inner class name */
    public static final class C0612c {
        public /* synthetic */ C0612c(v vVar) {
            this();
        }

        public C0612c() {
        }
    }

    public c(@l String str) {
        this.f51282a = str;
    }

    public static /* synthetic */ c c(c cVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f51282a;
        }
        return cVar.b(str);
    }

    @l
    public final String a() {
        return this.f51282a;
    }

    @k
    public final c b(@l String str) {
        return new c(str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g0.g(this.f51282a, ((c) obj).f51282a);
    }

    public int hashCode() {
        String str = this.f51282a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public String toString() {
        return "AdLunchApp(deeplink=" + this.f51282a + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f51281c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdLunchApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdLunchApp.kt\ncom/baicizhan/biz/online/ad_property/AdLunchApp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    public static final class b implements f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f51283a;

        public b() {
            this.f51283a = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            return new c(this.f51283a);
        }

        @k
        public final b b(@l String str) {
            this.f51283a = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f51283a = null;
        }

        public b(@k c source) {
            g0.p(source, "source");
            this.f51283a = source.f51282a;
        }
    }
}
