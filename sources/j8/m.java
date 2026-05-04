package j8;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f63848d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, a> f63849e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63850a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f63851b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Map<String, String> f63852c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 13) {
                            ws.g O = protocol.O();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(O.f96841c);
                            int i11 = O.f96841c;
                            for (int i12 = 0; i12 < i11; i12++) {
                                linkedHashMap.put(protocol.readString(), protocol.readString());
                            }
                            protocol.b6();
                            builder.c(linkedHashMap);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
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
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PrivacyAgreementInfo");
            protocol.Q6("content", 1, (byte) 11);
            protocol.p1(struct.f63850a);
            protocol.N2();
            protocol.Q6("privacy_version", 2, (byte) 8);
            protocol.l5(struct.f63851b);
            protocol.N2();
            protocol.Q6("privacy_urls", 3, (byte) 13);
            protocol.b3((byte) 11, (byte) 11, struct.f63852c.size());
            for (Map.Entry<String, String> entry : struct.f63852c.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                protocol.p1(key);
                protocol.p1(value);
            }
            protocol.W1();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m(@m80.k String content, int i11, @m80.k Map<String, String> privacy_urls) {
        g0.p(content, "content");
        g0.p(privacy_urls, "privacy_urls");
        this.f63850a = content;
        this.f63851b = i11;
        this.f63852c = privacy_urls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m e(m mVar, String str, int i11, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mVar.f63850a;
        }
        if ((i12 & 2) != 0) {
            i11 = mVar.f63851b;
        }
        if ((i12 & 4) != 0) {
            map = mVar.f63852c;
        }
        return mVar.d(str, i11, map);
    }

    @m80.k
    public final String a() {
        return this.f63850a;
    }

    public final int b() {
        return this.f63851b;
    }

    @m80.k
    public final Map<String, String> c() {
        return this.f63852c;
    }

    @m80.k
    public final m d(@m80.k String content, int i11, @m80.k Map<String, String> privacy_urls) {
        g0.p(content, "content");
        g0.p(privacy_urls, "privacy_urls");
        return new m(content, i11, privacy_urls);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g0.g(this.f63850a, mVar.f63850a) && this.f63851b == mVar.f63851b && g0.g(this.f63852c, mVar.f63852c);
    }

    public int hashCode() {
        return (((this.f63850a.hashCode() * 31) + Integer.hashCode(this.f63851b)) * 31) + this.f63852c.hashCode();
    }

    @m80.k
    public String toString() {
        return "PrivacyAgreementInfo(content=" + this.f63850a + ", privacy_version=" + this.f63851b + ", privacy_urls=" + this.f63852c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63849e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPrivacyAgreementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyAgreementInfo.kt\ncom/baicizhan/biz/online/bcz_system_api/PrivacyAgreementInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
    public static final class a implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f63853a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f63854b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Map<String, String> f63855c;

        public a() {
            this.f63853a = null;
            this.f63854b = null;
            this.f63855c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            String str = this.f63853a;
            if (str == null) {
                throw new IllegalStateException("Required field 'content' is missing");
            }
            Integer num = this.f63854b;
            if (num == null) {
                throw new IllegalStateException("Required field 'privacy_version' is missing");
            }
            int intValue = num.intValue();
            Map<String, String> map = this.f63855c;
            if (map != null) {
                return new m(str, intValue, map);
            }
            throw new IllegalStateException("Required field 'privacy_urls' is missing");
        }

        @m80.k
        public final a b(@m80.k String content) {
            g0.p(content, "content");
            this.f63853a = content;
            return this;
        }

        @m80.k
        public final a c(@m80.k Map<String, String> privacy_urls) {
            g0.p(privacy_urls, "privacy_urls");
            this.f63855c = privacy_urls;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f63854b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63853a = null;
            this.f63854b = null;
            this.f63855c = null;
        }

        public a(@m80.k m source) {
            g0.p(source, "source");
            this.f63853a = source.f63850a;
            this.f63854b = Integer.valueOf(source.f63851b);
            this.f63855c = source.f63852c;
        }
    }
}
