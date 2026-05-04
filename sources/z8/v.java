package z8;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f102113e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v, a> f102114f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102115a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102116b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102117c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f102118d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 15) {
                                ws.f v42 = protocol.v4();
                                ArrayList arrayList = new ArrayList(v42.f96838b);
                                int i11 = v42.f96838b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    arrayList.add(Integer.valueOf(protocol.s8()));
                                }
                                protocol.l8();
                                builder.a(arrayList);
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
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k v struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ExtraInfo");
            protocol.Q6("newStudyUrl", 1, (byte) 11);
            protocol.p1(struct.f102115a);
            protocol.N2();
            protocol.Q6("reviewUrl", 2, (byte) 11);
            protocol.p1(struct.f102116b);
            protocol.N2();
            protocol.Q6("generalReviewUrl", 3, (byte) 11);
            protocol.p1(struct.f102117c);
            protocol.N2();
            protocol.Q6(a.f.C0247a.f16190b, 4, (byte) 15);
            protocol.y2((byte) 8, struct.f102118d.size());
            Iterator<Integer> it = struct.f102118d.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public v(@m80.k String newStudyUrl, @m80.k String reviewUrl, @m80.k String generalReviewUrl, @m80.k List<Integer> book_ids) {
        kotlin.jvm.internal.g0.p(newStudyUrl, "newStudyUrl");
        kotlin.jvm.internal.g0.p(reviewUrl, "reviewUrl");
        kotlin.jvm.internal.g0.p(generalReviewUrl, "generalReviewUrl");
        kotlin.jvm.internal.g0.p(book_ids, "book_ids");
        this.f102115a = newStudyUrl;
        this.f102116b = reviewUrl;
        this.f102117c = generalReviewUrl;
        this.f102118d = book_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v f(v vVar, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f102115a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f102116b;
        }
        if ((i11 & 4) != 0) {
            str3 = vVar.f102117c;
        }
        if ((i11 & 8) != 0) {
            list = vVar.f102118d;
        }
        return vVar.e(str, str2, str3, list);
    }

    @m80.k
    public final String a() {
        return this.f102115a;
    }

    @m80.k
    public final String b() {
        return this.f102116b;
    }

    @m80.k
    public final String c() {
        return this.f102117c;
    }

    @m80.k
    public final List<Integer> d() {
        return this.f102118d;
    }

    @m80.k
    public final v e(@m80.k String newStudyUrl, @m80.k String reviewUrl, @m80.k String generalReviewUrl, @m80.k List<Integer> book_ids) {
        kotlin.jvm.internal.g0.p(newStudyUrl, "newStudyUrl");
        kotlin.jvm.internal.g0.p(reviewUrl, "reviewUrl");
        kotlin.jvm.internal.g0.p(generalReviewUrl, "generalReviewUrl");
        kotlin.jvm.internal.g0.p(book_ids, "book_ids");
        return new v(newStudyUrl, reviewUrl, generalReviewUrl, book_ids);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.g0.g(this.f102115a, vVar.f102115a) && kotlin.jvm.internal.g0.g(this.f102116b, vVar.f102116b) && kotlin.jvm.internal.g0.g(this.f102117c, vVar.f102117c) && kotlin.jvm.internal.g0.g(this.f102118d, vVar.f102118d);
    }

    public int hashCode() {
        return (((((this.f102115a.hashCode() * 31) + this.f102116b.hashCode()) * 31) + this.f102117c.hashCode()) * 31) + this.f102118d.hashCode();
    }

    @m80.k
    public String toString() {
        return "ExtraInfo(newStudyUrl=" + this.f102115a + ", reviewUrl=" + this.f102116b + ", generalReviewUrl=" + this.f102117c + ", book_ids=" + this.f102118d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102114f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nExtraInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtraInfo.kt\ncom/baicizhan/biz/online/user_study_api/ExtraInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
    public static final class a implements ts.f<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f102119a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f102120b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f102121c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<Integer> f102122d;

        public a() {
            this.f102119a = null;
            this.f102120b = null;
            this.f102121c = null;
            this.f102122d = null;
        }

        @m80.k
        public final a a(@m80.k List<Integer> book_ids) {
            kotlin.jvm.internal.g0.p(book_ids, "book_ids");
            this.f102122d = book_ids;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v build() {
            String str = this.f102119a;
            if (str == null) {
                throw new IllegalStateException("Required field 'newStudyUrl' is missing");
            }
            String str2 = this.f102120b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'reviewUrl' is missing");
            }
            String str3 = this.f102121c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'generalReviewUrl' is missing");
            }
            List<Integer> list = this.f102122d;
            if (list != null) {
                return new v(str, str2, str3, list);
            }
            throw new IllegalStateException("Required field 'book_ids' is missing");
        }

        @m80.k
        public final a c(@m80.k String generalReviewUrl) {
            kotlin.jvm.internal.g0.p(generalReviewUrl, "generalReviewUrl");
            this.f102121c = generalReviewUrl;
            return this;
        }

        @m80.k
        public final a d(@m80.k String newStudyUrl) {
            kotlin.jvm.internal.g0.p(newStudyUrl, "newStudyUrl");
            this.f102119a = newStudyUrl;
            return this;
        }

        @m80.k
        public final a e(@m80.k String reviewUrl) {
            kotlin.jvm.internal.g0.p(reviewUrl, "reviewUrl");
            this.f102120b = reviewUrl;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102119a = null;
            this.f102120b = null;
            this.f102121c = null;
            this.f102122d = null;
        }

        public a(@m80.k v source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102119a = source.f102115a;
            this.f102120b = source.f102116b;
            this.f102121c = source.f102117c;
            this.f102122d = source.f102118d;
        }
    }
}
