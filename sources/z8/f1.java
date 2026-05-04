package z8;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101513e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f1, a> f101514f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101515a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<f2> f101516b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101517c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101518d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                builder.b(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.e(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(f2.f101524d.read(protocol));
                        }
                        protocol.l8();
                        builder.d(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k f1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBookCategory");
            protocol.Q6("category_name", 1, (byte) 11);
            protocol.p1(struct.f101515a);
            protocol.N2();
            protocol.Q6("sub_categories", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f101516b.size());
            Iterator<f2> it = struct.f101516b.iterator();
            while (it.hasNext()) {
                f2.f101524d.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f101517c != null) {
                protocol.Q6(PushConstants.SUB_TAGS_STATUS_NAME, 3, (byte) 11);
                protocol.p1(struct.f101517c);
                protocol.N2();
            }
            if (struct.f101518d != null) {
                protocol.Q6("cate_id", 4, (byte) 11);
                protocol.p1(struct.f101518d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f1(@m80.k String category_name, @m80.k List<f2> sub_categories, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(category_name, "category_name");
        kotlin.jvm.internal.g0.p(sub_categories, "sub_categories");
        this.f101515a = category_name;
        this.f101516b = sub_categories;
        this.f101517c = str;
        this.f101518d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f1 f(f1 f1Var, String str, List list, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f1Var.f101515a;
        }
        if ((i11 & 2) != 0) {
            list = f1Var.f101516b;
        }
        if ((i11 & 4) != 0) {
            str2 = f1Var.f101517c;
        }
        if ((i11 & 8) != 0) {
            str3 = f1Var.f101518d;
        }
        return f1Var.e(str, list, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f101515a;
    }

    @m80.k
    public final List<f2> b() {
        return this.f101516b;
    }

    @m80.l
    public final String c() {
        return this.f101517c;
    }

    @m80.l
    public final String d() {
        return this.f101518d;
    }

    @m80.k
    public final f1 e(@m80.k String category_name, @m80.k List<f2> sub_categories, @m80.l String str, @m80.l String str2) {
        kotlin.jvm.internal.g0.p(category_name, "category_name");
        kotlin.jvm.internal.g0.p(sub_categories, "sub_categories");
        return new f1(category_name, sub_categories, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.g0.g(this.f101515a, f1Var.f101515a) && kotlin.jvm.internal.g0.g(this.f101516b, f1Var.f101516b) && kotlin.jvm.internal.g0.g(this.f101517c, f1Var.f101517c) && kotlin.jvm.internal.g0.g(this.f101518d, f1Var.f101518d);
    }

    public int hashCode() {
        int hashCode = ((this.f101515a.hashCode() * 31) + this.f101516b.hashCode()) * 31;
        String str = this.f101517c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101518d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserBookCategory(category_name=" + this.f101515a + ", sub_categories=" + this.f101516b + ", tag_name=" + this.f101517c + ", cate_id=" + this.f101518d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101514f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBookCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookCategory.kt\ncom/baicizhan/biz/online/user_study_api/UserBookCategory$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
    public static final class a implements ts.f<f1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101519a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<f2> f101520b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101521c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101522d;

        public a() {
            this.f101519a = null;
            this.f101520b = null;
            this.f101521c = null;
            this.f101522d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1 build() {
            String str = this.f101519a;
            if (str == null) {
                throw new IllegalStateException("Required field 'category_name' is missing");
            }
            List<f2> list = this.f101520b;
            if (list != null) {
                return new f1(str, list, this.f101521c, this.f101522d);
            }
            throw new IllegalStateException("Required field 'sub_categories' is missing");
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f101522d = str;
            return this;
        }

        @m80.k
        public final a c(@m80.k String category_name) {
            kotlin.jvm.internal.g0.p(category_name, "category_name");
            this.f101519a = category_name;
            return this;
        }

        @m80.k
        public final a d(@m80.k List<f2> sub_categories) {
            kotlin.jvm.internal.g0.p(sub_categories, "sub_categories");
            this.f101520b = sub_categories;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f101521c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101519a = null;
            this.f101520b = null;
            this.f101521c = null;
            this.f101522d = null;
        }

        public a(@m80.k f1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101519a = source.f101515a;
            this.f101520b = source.f101516b;
            this.f101521c = source.f101517c;
            this.f101522d = source.f101518d;
        }
    }
}
