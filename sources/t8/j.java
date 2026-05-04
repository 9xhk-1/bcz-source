package t8;

import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f90088e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f90089f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90090a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f90091b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f90092c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f90093d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 11) {
                                builder.a(protocol.readString());
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
            protocol.g6("SearchWordResultV2");
            protocol.Q6("word", 1, (byte) 11);
            protocol.p1(struct.f90090a);
            protocol.N2();
            protocol.Q6("topic_id", 2, (byte) 8);
            protocol.l5(struct.f90091b);
            protocol.N2();
            protocol.Q6(a.e.C0246a.f16184d, 3, (byte) 11);
            protocol.p1(struct.f90092c);
            protocol.N2();
            if (struct.f90093d != null) {
                protocol.Q6("accent", 4, (byte) 11);
                protocol.p1(struct.f90093d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j(@m80.k String word, int i11, @m80.k String mean_cn, @m80.l String str) {
        g0.p(word, "word");
        g0.p(mean_cn, "mean_cn");
        this.f90090a = word;
        this.f90091b = i11;
        this.f90092c = mean_cn;
        this.f90093d = str;
    }

    public static /* synthetic */ j f(j jVar, String str, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = jVar.f90090a;
        }
        if ((i12 & 2) != 0) {
            i11 = jVar.f90091b;
        }
        if ((i12 & 4) != 0) {
            str2 = jVar.f90092c;
        }
        if ((i12 & 8) != 0) {
            str3 = jVar.f90093d;
        }
        return jVar.e(str, i11, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f90090a;
    }

    public final int b() {
        return this.f90091b;
    }

    @m80.k
    public final String c() {
        return this.f90092c;
    }

    @m80.l
    public final String d() {
        return this.f90093d;
    }

    @m80.k
    public final j e(@m80.k String word, int i11, @m80.k String mean_cn, @m80.l String str) {
        g0.p(word, "word");
        g0.p(mean_cn, "mean_cn");
        return new j(word, i11, mean_cn, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f90090a, jVar.f90090a) && this.f90091b == jVar.f90091b && g0.g(this.f90092c, jVar.f90092c) && g0.g(this.f90093d, jVar.f90093d);
    }

    public int hashCode() {
        int hashCode = ((((this.f90090a.hashCode() * 31) + Integer.hashCode(this.f90091b)) * 31) + this.f90092c.hashCode()) * 31;
        String str = this.f90093d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "SearchWordResultV2(word=" + this.f90090a + ", topic_id=" + this.f90091b + ", mean_cn=" + this.f90092c + ", accent=" + this.f90093d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f90089f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSearchWordResultV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchWordResultV2.kt\ncom/baicizhan/biz/online/resource_api/SearchWordResultV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f90094a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f90095b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90096c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f90097d;

        public a() {
            this.f90094a = null;
            this.f90095b = null;
            this.f90096c = null;
            this.f90097d = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f90097d = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j build() {
            String str = this.f90094a;
            if (str == null) {
                throw new IllegalStateException("Required field 'word' is missing");
            }
            Integer num = this.f90095b;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f90096c;
            if (str2 != null) {
                return new j(str, intValue, str2, this.f90097d);
            }
            throw new IllegalStateException("Required field 'mean_cn' is missing");
        }

        @m80.k
        public final a c(@m80.k String mean_cn) {
            g0.p(mean_cn, "mean_cn");
            this.f90096c = mean_cn;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f90095b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String word) {
            g0.p(word, "word");
            this.f90094a = word;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f90094a = null;
            this.f90095b = null;
            this.f90096c = null;
            this.f90097d = null;
        }

        public a(@m80.k j source) {
            g0.p(source, "source");
            this.f90094a = source.f90090a;
            this.f90095b = Integer.valueOf(source.f90091b);
            this.f90096c = source.f90092c;
            this.f90097d = source.f90093d;
        }
    }
}
