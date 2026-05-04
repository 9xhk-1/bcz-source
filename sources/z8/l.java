package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101723e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f101724f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k> f101725a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101726b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101727c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101728d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.d(protocol.readString());
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
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(k.f101684k.read(protocol));
                    }
                    protocol.l8();
                    builder.b(arrayList);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DakaBackgroundData");
            protocol.Q6("category_info", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f101725a.size());
            Iterator<k> it = struct.f101725a.iterator();
            while (it.hasNext()) {
                k.f101684k.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("logo", 2, (byte) 11);
            protocol.p1(struct.f101726b);
            protocol.N2();
            protocol.Q6("title", 3, (byte) 11);
            protocol.p1(struct.f101727c);
            protocol.N2();
            protocol.Q6("qr_image", 4, (byte) 11);
            protocol.p1(struct.f101728d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l(@m80.k List<k> category_info, @m80.k String logo, @m80.k String title, @m80.k String qr_image) {
        kotlin.jvm.internal.g0.p(category_info, "category_info");
        kotlin.jvm.internal.g0.p(logo, "logo");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(qr_image, "qr_image");
        this.f101725a = category_info;
        this.f101726b = logo;
        this.f101727c = title;
        this.f101728d = qr_image;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l f(l lVar, List list, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = lVar.f101725a;
        }
        if ((i11 & 2) != 0) {
            str = lVar.f101726b;
        }
        if ((i11 & 4) != 0) {
            str2 = lVar.f101727c;
        }
        if ((i11 & 8) != 0) {
            str3 = lVar.f101728d;
        }
        return lVar.e(list, str, str2, str3);
    }

    @m80.k
    public final List<k> a() {
        return this.f101725a;
    }

    @m80.k
    public final String b() {
        return this.f101726b;
    }

    @m80.k
    public final String c() {
        return this.f101727c;
    }

    @m80.k
    public final String d() {
        return this.f101728d;
    }

    @m80.k
    public final l e(@m80.k List<k> category_info, @m80.k String logo, @m80.k String title, @m80.k String qr_image) {
        kotlin.jvm.internal.g0.p(category_info, "category_info");
        kotlin.jvm.internal.g0.p(logo, "logo");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(qr_image, "qr_image");
        return new l(category_info, logo, title, qr_image);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.g0.g(this.f101725a, lVar.f101725a) && kotlin.jvm.internal.g0.g(this.f101726b, lVar.f101726b) && kotlin.jvm.internal.g0.g(this.f101727c, lVar.f101727c) && kotlin.jvm.internal.g0.g(this.f101728d, lVar.f101728d);
    }

    public int hashCode() {
        return (((((this.f101725a.hashCode() * 31) + this.f101726b.hashCode()) * 31) + this.f101727c.hashCode()) * 31) + this.f101728d.hashCode();
    }

    @m80.k
    public String toString() {
        return "DakaBackgroundData(category_info=" + this.f101725a + ", logo=" + this.f101726b + ", title=" + this.f101727c + ", qr_image=" + this.f101728d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101724f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDakaBackgroundData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaBackgroundData.kt\ncom/baicizhan/biz/online/user_study_api/DakaBackgroundData$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<k> f101729a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101730b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101731c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101732d;

        public a() {
            this.f101729a = null;
            this.f101730b = null;
            this.f101731c = null;
            this.f101732d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            List<k> list = this.f101729a;
            if (list == null) {
                throw new IllegalStateException("Required field 'category_info' is missing");
            }
            String str = this.f101730b;
            if (str == null) {
                throw new IllegalStateException("Required field 'logo' is missing");
            }
            String str2 = this.f101731c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str3 = this.f101732d;
            if (str3 != null) {
                return new l(list, str, str2, str3);
            }
            throw new IllegalStateException("Required field 'qr_image' is missing");
        }

        @m80.k
        public final a b(@m80.k List<k> category_info) {
            kotlin.jvm.internal.g0.p(category_info, "category_info");
            this.f101729a = category_info;
            return this;
        }

        @m80.k
        public final a c(@m80.k String logo) {
            kotlin.jvm.internal.g0.p(logo, "logo");
            this.f101730b = logo;
            return this;
        }

        @m80.k
        public final a d(@m80.k String qr_image) {
            kotlin.jvm.internal.g0.p(qr_image, "qr_image");
            this.f101732d = qr_image;
            return this;
        }

        @m80.k
        public final a e(@m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            this.f101731c = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101729a = null;
            this.f101730b = null;
            this.f101731c = null;
            this.f101732d = null;
        }

        public a(@m80.k l source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101729a = source.f101725a;
            this.f101730b = source.f101726b;
            this.f101731c = source.f101727c;
            this.f101732d = source.f101728d;
        }
    }
}
