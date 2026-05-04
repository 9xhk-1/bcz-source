package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f74894c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u, b> f74895d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74896a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74897b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<u, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 11) {
                        builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k u struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordTopicAsset");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74896a);
            protocol.N2();
            protocol.Q6("asset_zpk_path", 2, (byte) 11);
            protocol.p1(struct.f74897b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public u(int i11, @m80.k String asset_zpk_path) {
        g0.p(asset_zpk_path, "asset_zpk_path");
        this.f74896a = i11;
        this.f74897b = asset_zpk_path;
    }

    public static /* synthetic */ u d(u uVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = uVar.f74896a;
        }
        if ((i12 & 2) != 0) {
            str = uVar.f74897b;
        }
        return uVar.c(i11, str);
    }

    public final int a() {
        return this.f74896a;
    }

    @m80.k
    public final String b() {
        return this.f74897b;
    }

    @m80.k
    public final u c(int i11, @m80.k String asset_zpk_path) {
        g0.p(asset_zpk_path, "asset_zpk_path");
        return new u(i11, asset_zpk_path);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f74896a == uVar.f74896a && g0.g(this.f74897b, uVar.f74897b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f74896a) * 31) + this.f74897b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BBWordTopicAsset(topic_id=" + this.f74896a + ", asset_zpk_path=" + this.f74897b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74895d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordTopicAsset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordTopicAsset.kt\ncom/baicizhan/biz/online/bs_words/BBWordTopicAsset$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    public static final class b implements ts.f<u> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74898a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74899b;

        public b() {
            this.f74898a = null;
            this.f74899b = null;
        }

        @m80.k
        public final b a(@m80.k String asset_zpk_path) {
            g0.p(asset_zpk_path, "asset_zpk_path");
            this.f74899b = asset_zpk_path;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u build() {
            Integer num = this.f74898a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74899b;
            if (str != null) {
                return new u(intValue, str);
            }
            throw new IllegalStateException("Required field 'asset_zpk_path' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f74898a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74898a = null;
            this.f74899b = null;
        }

        public b(@m80.k u source) {
            g0.p(source, "source");
            this.f74898a = Integer.valueOf(source.f74896a);
            this.f74899b = source.f74897b;
        }
    }
}
