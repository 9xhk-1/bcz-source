package w8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f95719e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<d, a> f95720f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f95721a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f95722b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f95723c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f95724d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d read(@k i protocol, @k a builder) {
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
                            } else if (b11 == 8) {
                                builder.b(protocol.s8());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.e(protocol.readString());
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
        public void write(@k i protocol, @k d struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ExportTemplateInfo");
            protocol.Q6("t_id", 1, (byte) 8);
            protocol.l5(struct.f95721a);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 2, (byte) 11);
            protocol.p1(struct.f95722b);
            protocol.N2();
            protocol.Q6("title", 3, (byte) 11);
            protocol.p1(struct.f95723c);
            protocol.N2();
            protocol.Q6("cost", 4, (byte) 8);
            protocol.l5(struct.f95724d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public d(int i11, @k String img_url, @k String title, int i12) {
        g0.p(img_url, "img_url");
        g0.p(title, "title");
        this.f95721a = i11;
        this.f95722b = img_url;
        this.f95723c = title;
        this.f95724d = i12;
    }

    public static /* synthetic */ d f(d dVar, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f95721a;
        }
        if ((i13 & 2) != 0) {
            str = dVar.f95722b;
        }
        if ((i13 & 4) != 0) {
            str2 = dVar.f95723c;
        }
        if ((i13 & 8) != 0) {
            i12 = dVar.f95724d;
        }
        return dVar.e(i11, str, str2, i12);
    }

    public final int a() {
        return this.f95721a;
    }

    @k
    public final String b() {
        return this.f95722b;
    }

    @k
    public final String c() {
        return this.f95723c;
    }

    public final int d() {
        return this.f95724d;
    }

    @k
    public final d e(int i11, @k String img_url, @k String title, int i12) {
        g0.p(img_url, "img_url");
        g0.p(title, "title");
        return new d(i11, img_url, title, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f95721a == dVar.f95721a && g0.g(this.f95722b, dVar.f95722b) && g0.g(this.f95723c, dVar.f95723c) && this.f95724d == dVar.f95724d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f95721a) * 31) + this.f95722b.hashCode()) * 31) + this.f95723c.hashCode()) * 31) + Integer.hashCode(this.f95724d);
    }

    @k
    public String toString() {
        return "ExportTemplateInfo(t_id=" + this.f95721a + ", img_url=" + this.f95722b + ", title=" + this.f95723c + ", cost=" + this.f95724d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f95720f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExportTemplateInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportTemplateInfo.kt\ncom/baicizhan/biz/online/user_activity_api/ExportTemplateInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
    public static final class a implements ts.f<d> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f95725a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f95726b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f95727c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f95728d;

        public a() {
            this.f95725a = null;
            this.f95726b = null;
            this.f95727c = null;
            this.f95728d = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build() {
            Integer num = this.f95725a;
            if (num == null) {
                throw new IllegalStateException("Required field 't_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f95726b;
            if (str == null) {
                throw new IllegalStateException("Required field 'img_url' is missing");
            }
            String str2 = this.f95727c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            Integer num2 = this.f95728d;
            if (num2 != null) {
                return new d(intValue, str, str2, num2.intValue());
            }
            throw new IllegalStateException("Required field 'cost' is missing");
        }

        @k
        public final a b(int i11) {
            this.f95728d = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a c(@k String img_url) {
            g0.p(img_url, "img_url");
            this.f95726b = img_url;
            return this;
        }

        @k
        public final a d(int i11) {
            this.f95725a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a e(@k String title) {
            g0.p(title, "title");
            this.f95727c = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f95725a = null;
            this.f95726b = null;
            this.f95727c = null;
            this.f95728d = null;
        }

        public a(@k d source) {
            g0.p(source, "source");
            this.f95725a = Integer.valueOf(source.f95721a);
            this.f95726b = source.f95722b;
            this.f95727c = source.f95723c;
            this.f95728d = Integer.valueOf(source.f95724d);
        }
    }
}
