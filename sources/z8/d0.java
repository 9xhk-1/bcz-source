package z8;

import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d0 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f101415f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d0, a> f101416g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101417a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101418b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101419c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101420d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<c0> f101421e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 read(@m80.k ws.i protocol, @m80.k a builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
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
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 15) {
                                    ws.f v42 = protocol.v4();
                                    ArrayList arrayList = new ArrayList(v42.f96838b);
                                    int i11 = v42.f96838b;
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        arrayList.add(c0.f101211d.read(protocol));
                                    }
                                    protocol.l8();
                                    builder.b(arrayList);
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.f(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k d0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ModeDetail");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f101417a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f101418b);
            protocol.N2();
            protocol.Q6("iconUrl", 3, (byte) 11);
            protocol.p1(struct.f101419c);
            protocol.N2();
            protocol.Q6("shorDesc", 4, (byte) 11);
            protocol.p1(struct.f101420d);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_APP_DESC, 5, (byte) 15);
            protocol.y2((byte) 12, struct.f101421e.size());
            Iterator<c0> it = struct.f101421e.iterator();
            while (it.hasNext()) {
                c0.f101211d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public d0(int i11, @m80.k String name, @m80.k String iconUrl, @m80.k String shorDesc, @m80.k List<c0> desc) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(iconUrl, "iconUrl");
        kotlin.jvm.internal.g0.p(shorDesc, "shorDesc");
        kotlin.jvm.internal.g0.p(desc, "desc");
        this.f101417a = i11;
        this.f101418b = name;
        this.f101419c = iconUrl;
        this.f101420d = shorDesc;
        this.f101421e = desc;
    }

    public static /* synthetic */ d0 g(d0 d0Var, int i11, String str, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = d0Var.f101417a;
        }
        if ((i12 & 2) != 0) {
            str = d0Var.f101418b;
        }
        if ((i12 & 4) != 0) {
            str2 = d0Var.f101419c;
        }
        if ((i12 & 8) != 0) {
            str3 = d0Var.f101420d;
        }
        if ((i12 & 16) != 0) {
            list = d0Var.f101421e;
        }
        List list2 = list;
        String str4 = str2;
        return d0Var.f(i11, str, str4, str3, list2);
    }

    public final int a() {
        return this.f101417a;
    }

    @m80.k
    public final String b() {
        return this.f101418b;
    }

    @m80.k
    public final String c() {
        return this.f101419c;
    }

    @m80.k
    public final String d() {
        return this.f101420d;
    }

    @m80.k
    public final List<c0> e() {
        return this.f101421e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f101417a == d0Var.f101417a && kotlin.jvm.internal.g0.g(this.f101418b, d0Var.f101418b) && kotlin.jvm.internal.g0.g(this.f101419c, d0Var.f101419c) && kotlin.jvm.internal.g0.g(this.f101420d, d0Var.f101420d) && kotlin.jvm.internal.g0.g(this.f101421e, d0Var.f101421e);
    }

    @m80.k
    public final d0 f(int i11, @m80.k String name, @m80.k String iconUrl, @m80.k String shorDesc, @m80.k List<c0> desc) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(iconUrl, "iconUrl");
        kotlin.jvm.internal.g0.p(shorDesc, "shorDesc");
        kotlin.jvm.internal.g0.p(desc, "desc");
        return new d0(i11, name, iconUrl, shorDesc, desc);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f101417a) * 31) + this.f101418b.hashCode()) * 31) + this.f101419c.hashCode()) * 31) + this.f101420d.hashCode()) * 31) + this.f101421e.hashCode();
    }

    @m80.k
    public String toString() {
        return "ModeDetail(id=" + this.f101417a + ", name=" + this.f101418b + ", iconUrl=" + this.f101419c + ", shorDesc=" + this.f101420d + ", desc=" + this.f101421e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101416g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nModeDetail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeDetail.kt\ncom/baicizhan/biz/online/user_study_api/ModeDetail$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
    public static final class a implements ts.f<d0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101422a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101423b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101424c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101425d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<c0> f101426e;

        public a() {
            this.f101422a = null;
            this.f101423b = null;
            this.f101424c = null;
            this.f101425d = null;
            this.f101426e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 build() {
            Integer num = this.f101422a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101423b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str2 = this.f101424c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'iconUrl' is missing");
            }
            String str3 = this.f101425d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'shorDesc' is missing");
            }
            List<c0> list = this.f101426e;
            if (list != null) {
                return new d0(intValue, str, str2, str3, list);
            }
            throw new IllegalStateException("Required field 'desc' is missing");
        }

        @m80.k
        public final a b(@m80.k List<c0> desc) {
            kotlin.jvm.internal.g0.p(desc, "desc");
            this.f101426e = desc;
            return this;
        }

        @m80.k
        public final a c(@m80.k String iconUrl) {
            kotlin.jvm.internal.g0.p(iconUrl, "iconUrl");
            this.f101424c = iconUrl;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101422a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f101423b = name;
            return this;
        }

        @m80.k
        public final a f(@m80.k String shorDesc) {
            kotlin.jvm.internal.g0.p(shorDesc, "shorDesc");
            this.f101425d = shorDesc;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101422a = null;
            this.f101423b = null;
            this.f101424c = null;
            this.f101425d = null;
            this.f101426e = null;
        }

        public a(@m80.k d0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101422a = Integer.valueOf(source.f101417a);
            this.f101423b = source.f101418b;
            this.f101424c = source.f101419c;
            this.f101425d = source.f101420d;
            this.f101426e = source.f101421e;
        }
    }
}
