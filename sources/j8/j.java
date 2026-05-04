package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f63816e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, b> f63817f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63818a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63819b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f63820c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f63821d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<j, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 10) {
                                builder.b(protocol.T1());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 10) {
                            builder.d(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.e(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczTabInfo");
            protocol.Q6("tab", 1, (byte) 11);
            protocol.p1(struct.f63818a);
            protocol.N2();
            protocol.Q6("icon", 2, (byte) 11);
            protocol.p1(struct.f63819b);
            protocol.N2();
            protocol.Q6("show_time", 3, (byte) 10);
            protocol.q7(struct.f63820c);
            protocol.N2();
            protocol.Q6("disappear_time", 4, (byte) 10);
            protocol.q7(struct.f63821d);
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

    public j(@m80.k String tab, @m80.k String icon, long j11, long j12) {
        g0.p(tab, "tab");
        g0.p(icon, "icon");
        this.f63818a = tab;
        this.f63819b = icon;
        this.f63820c = j11;
        this.f63821d = j12;
    }

    public static /* synthetic */ j f(j jVar, String str, String str2, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jVar.f63818a;
        }
        if ((i11 & 2) != 0) {
            str2 = jVar.f63819b;
        }
        if ((i11 & 4) != 0) {
            j11 = jVar.f63820c;
        }
        if ((i11 & 8) != 0) {
            j12 = jVar.f63821d;
        }
        long j13 = j12;
        return jVar.e(str, str2, j11, j13);
    }

    @m80.k
    public final String a() {
        return this.f63818a;
    }

    @m80.k
    public final String b() {
        return this.f63819b;
    }

    public final long c() {
        return this.f63820c;
    }

    public final long d() {
        return this.f63821d;
    }

    @m80.k
    public final j e(@m80.k String tab, @m80.k String icon, long j11, long j12) {
        g0.p(tab, "tab");
        g0.p(icon, "icon");
        return new j(tab, icon, j11, j12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f63818a, jVar.f63818a) && g0.g(this.f63819b, jVar.f63819b) && this.f63820c == jVar.f63820c && this.f63821d == jVar.f63821d;
    }

    public int hashCode() {
        return (((((this.f63818a.hashCode() * 31) + this.f63819b.hashCode()) * 31) + Long.hashCode(this.f63820c)) * 31) + Long.hashCode(this.f63821d);
    }

    @m80.k
    public String toString() {
        return "BczTabInfo(tab=" + this.f63818a + ", icon=" + this.f63819b + ", show_time=" + this.f63820c + ", disappear_time=" + this.f63821d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63817f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczTabInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczTabInfo.kt\ncom/baicizhan/biz/online/bcz_system_api/BczTabInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class b implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f63822a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63823b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f63824c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f63825d;

        public b() {
            this.f63822a = null;
            this.f63823b = null;
            this.f63824c = null;
            this.f63825d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j build() {
            String str = this.f63822a;
            if (str == null) {
                throw new IllegalStateException("Required field 'tab' is missing");
            }
            String str2 = this.f63823b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'icon' is missing");
            }
            Long l11 = this.f63824c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'show_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f63825d;
            if (l12 != null) {
                return new j(str, str2, longValue, l12.longValue());
            }
            throw new IllegalStateException("Required field 'disappear_time' is missing");
        }

        @m80.k
        public final b b(long j11) {
            this.f63825d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b c(@m80.k String icon) {
            g0.p(icon, "icon");
            this.f63823b = icon;
            return this;
        }

        @m80.k
        public final b d(long j11) {
            this.f63824c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b e(@m80.k String tab) {
            g0.p(tab, "tab");
            this.f63822a = tab;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63822a = null;
            this.f63823b = null;
            this.f63824c = null;
            this.f63825d = null;
        }

        public b(@m80.k j source) {
            g0.p(source, "source");
            this.f63822a = source.f63818a;
            this.f63823b = source.f63819b;
            this.f63824c = Long.valueOf(source.f63820c);
            this.f63825d = Long.valueOf(source.f63821d);
        }
    }
}
