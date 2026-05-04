package com.baicizhan.biz.online.bs_users;

import com.microsoft.thrifty.ThriftException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import ts.f;
import w00.g;
import ws.d;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f15922f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @g
    @k
    public static final ts.a<a, b> f15923g = new C0235a();

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public final BBRedirectType f15924a;

    /* renamed from: b, reason: collision with root package name */
    @g
    @k
    public final String f15925b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @g
    public final String f15926c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @g
    public final Integer f15927d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @g
    public final String f15928e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.biz.online.bs_users.a$a, reason: collision with other inner class name */
    public static final class C0235a implements ts.a<a, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k b builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                d a62 = protocol.a6();
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
                                } else if (b11 == 11) {
                                    builder.b(protocol.readString());
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.e(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.f(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    int s82 = protocol.s8();
                    BBRedirectType a11 = BBRedirectType.Companion.a(s82);
                    if (a11 == null) {
                        throw new ThriftException(ThriftException.Kind.PROTOCOL_ERROR, "Unexpected value for enum type BBRedirectType: " + s82);
                    }
                    builder.c(a11);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBRedirectInfo");
            protocol.Q6("redirect_type", 1, (byte) 8);
            protocol.l5(struct.f15924a.value);
            protocol.N2();
            protocol.Q6("redirect_url", 2, (byte) 11);
            protocol.p1(struct.f15925b);
            protocol.N2();
            if (struct.f15926c != null) {
                protocol.Q6("taobao_item_id", 3, (byte) 11);
                protocol.p1(struct.f15926c);
                protocol.N2();
            }
            if (struct.f15927d != null) {
                protocol.Q6("sys_notify_id", 4, (byte) 8);
                protocol.l5(struct.f15927d.intValue());
                protocol.N2();
            }
            if (struct.f15928e != null) {
                protocol.Q6("mall_url", 5, (byte) 11);
                protocol.p1(struct.f15928e);
                protocol.N2();
            }
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

    public a(@k BBRedirectType redirect_type, @k String redirect_url, @l String str, @l Integer num, @l String str2) {
        g0.p(redirect_type, "redirect_type");
        g0.p(redirect_url, "redirect_url");
        this.f15924a = redirect_type;
        this.f15925b = redirect_url;
        this.f15926c = str;
        this.f15927d = num;
        this.f15928e = str2;
    }

    public static /* synthetic */ a g(a aVar, BBRedirectType bBRedirectType, String str, String str2, Integer num, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bBRedirectType = aVar.f15924a;
        }
        if ((i11 & 2) != 0) {
            str = aVar.f15925b;
        }
        if ((i11 & 4) != 0) {
            str2 = aVar.f15926c;
        }
        if ((i11 & 8) != 0) {
            num = aVar.f15927d;
        }
        if ((i11 & 16) != 0) {
            str3 = aVar.f15928e;
        }
        String str4 = str3;
        String str5 = str2;
        return aVar.f(bBRedirectType, str, str5, num, str4);
    }

    @k
    public final BBRedirectType a() {
        return this.f15924a;
    }

    @k
    public final String b() {
        return this.f15925b;
    }

    @l
    public final String c() {
        return this.f15926c;
    }

    @l
    public final Integer d() {
        return this.f15927d;
    }

    @l
    public final String e() {
        return this.f15928e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15924a == aVar.f15924a && g0.g(this.f15925b, aVar.f15925b) && g0.g(this.f15926c, aVar.f15926c) && g0.g(this.f15927d, aVar.f15927d) && g0.g(this.f15928e, aVar.f15928e);
    }

    @k
    public final a f(@k BBRedirectType redirect_type, @k String redirect_url, @l String str, @l Integer num, @l String str2) {
        g0.p(redirect_type, "redirect_type");
        g0.p(redirect_url, "redirect_url");
        return new a(redirect_type, redirect_url, str, num, str2);
    }

    public int hashCode() {
        int hashCode = ((this.f15924a.hashCode() * 31) + this.f15925b.hashCode()) * 31;
        String str = this.f15926c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f15927d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f15928e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BBRedirectInfo(redirect_type=" + this.f15924a + ", redirect_url=" + this.f15925b + ", taobao_item_id=" + this.f15926c + ", sys_notify_id=" + this.f15927d + ", mall_url=" + this.f15928e + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f15923g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBRedirectInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBRedirectInfo.kt\ncom/baicizhan/biz/online/bs_users/BBRedirectInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
    public static final class b implements f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public BBRedirectType f15929a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f15930b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f15931c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f15932d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f15933e;

        public b() {
            this.f15929a = null;
            this.f15930b = null;
            this.f15931c = null;
            this.f15932d = null;
            this.f15933e = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            BBRedirectType bBRedirectType = this.f15929a;
            if (bBRedirectType == null) {
                throw new IllegalStateException("Required field 'redirect_type' is missing");
            }
            String str = this.f15930b;
            if (str != null) {
                return new a(bBRedirectType, str, this.f15931c, this.f15932d, this.f15933e);
            }
            throw new IllegalStateException("Required field 'redirect_url' is missing");
        }

        @k
        public final b b(@l String str) {
            this.f15933e = str;
            return this;
        }

        @k
        public final b c(@k BBRedirectType redirect_type) {
            g0.p(redirect_type, "redirect_type");
            this.f15929a = redirect_type;
            return this;
        }

        @k
        public final b d(@k String redirect_url) {
            g0.p(redirect_url, "redirect_url");
            this.f15930b = redirect_url;
            return this;
        }

        @k
        public final b e(@l Integer num) {
            this.f15932d = num;
            return this;
        }

        @k
        public final b f(@l String str) {
            this.f15931c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f15929a = null;
            this.f15930b = null;
            this.f15931c = null;
            this.f15932d = null;
            this.f15933e = null;
        }

        public b(@k a source) {
            g0.p(source, "source");
            this.f15929a = source.f15924a;
            this.f15930b = source.f15925b;
            this.f15931c = source.f15926c;
            this.f15932d = source.f15927d;
            this.f15933e = source.f15928e;
        }
    }
}
