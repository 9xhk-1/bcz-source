package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f89993e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, a> f89994f = new C1194c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f89995a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f89996b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f89997c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f89998d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t8.c$c, reason: collision with other inner class name */
    public static final class C1194c implements ts.a<c, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                builder.d(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.e(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("GameWordItem");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f89995a);
            protocol.N2();
            protocol.Q6("content", 2, (byte) 11);
            protocol.p1(struct.f89996b);
            protocol.N2();
            if (struct.f89997c != null) {
                protocol.Q6("word_pack", 3, (byte) 11);
                protocol.p1(struct.f89997c);
                protocol.N2();
            }
            if (struct.f89998d != null) {
                protocol.Q6("topic_version", 4, (byte) 8);
                protocol.l5(struct.f89998d.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public c(int i11, @m80.k String content, @m80.l String str, @m80.l Integer num) {
        g0.p(content, "content");
        this.f89995a = i11;
        this.f89996b = content;
        this.f89997c = str;
        this.f89998d = num;
    }

    public static /* synthetic */ c f(c cVar, int i11, String str, String str2, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f89995a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f89996b;
        }
        if ((i12 & 4) != 0) {
            str2 = cVar.f89997c;
        }
        if ((i12 & 8) != 0) {
            num = cVar.f89998d;
        }
        return cVar.e(i11, str, str2, num);
    }

    public final int a() {
        return this.f89995a;
    }

    @m80.k
    public final String b() {
        return this.f89996b;
    }

    @m80.l
    public final String c() {
        return this.f89997c;
    }

    @m80.l
    public final Integer d() {
        return this.f89998d;
    }

    @m80.k
    public final c e(int i11, @m80.k String content, @m80.l String str, @m80.l Integer num) {
        g0.p(content, "content");
        return new c(i11, content, str, num);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f89995a == cVar.f89995a && g0.g(this.f89996b, cVar.f89996b) && g0.g(this.f89997c, cVar.f89997c) && g0.g(this.f89998d, cVar.f89998d);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f89995a) * 31) + this.f89996b.hashCode()) * 31;
        String str = this.f89997c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f89998d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "GameWordItem(topic_id=" + this.f89995a + ", content=" + this.f89996b + ", word_pack=" + this.f89997c + ", topic_version=" + this.f89998d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f89994f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGameWordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameWordItem.kt\ncom/baicizhan/biz/online/resource_api/GameWordItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f89999a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f90000b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f90001c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f90002d;

        public a() {
            this.f89999a = null;
            this.f90000b = null;
            this.f90001c = null;
            this.f90002d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f89999a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f90000b;
            if (str != null) {
                return new c(intValue, str, this.f90001c, this.f90002d);
            }
            throw new IllegalStateException("Required field 'content' is missing");
        }

        @m80.k
        public final a b(@m80.k String content) {
            g0.p(content, "content");
            this.f90000b = content;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f89999a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f90002d = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f90001c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f89999a = null;
            this.f90000b = null;
            this.f90001c = null;
            this.f90002d = null;
        }

        public a(@m80.k c source) {
            g0.p(source, "source");
            this.f89999a = Integer.valueOf(source.f89995a);
            this.f90000b = source.f89996b;
            this.f90001c = source.f89997c;
            this.f90002d = source.f89998d;
        }
    }
}
