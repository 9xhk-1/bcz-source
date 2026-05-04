package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f74658d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, b> f74659e = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74660a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74661b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l f74662c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<f, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        } else if (b11 == 12) {
                            builder.a(l.f74759t.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBGetWordAssetInfoResult");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74660a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f74661b);
            protocol.N2();
            protocol.Q6("asset_info", 3, (byte) 12);
            l.f74759t.write(protocol, struct.f74662c);
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

    public f(int i11, int i12, @m80.k l asset_info) {
        g0.p(asset_info, "asset_info");
        this.f74660a = i11;
        this.f74661b = i12;
        this.f74662c = asset_info;
    }

    public static /* synthetic */ f e(f fVar, int i11, int i12, l lVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fVar.f74660a;
        }
        if ((i13 & 2) != 0) {
            i12 = fVar.f74661b;
        }
        if ((i13 & 4) != 0) {
            lVar = fVar.f74662c;
        }
        return fVar.d(i11, i12, lVar);
    }

    public final int a() {
        return this.f74660a;
    }

    public final int b() {
        return this.f74661b;
    }

    @m80.k
    public final l c() {
        return this.f74662c;
    }

    @m80.k
    public final f d(int i11, int i12, @m80.k l asset_info) {
        g0.p(asset_info, "asset_info");
        return new f(i11, i12, asset_info);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f74660a == fVar.f74660a && this.f74661b == fVar.f74661b && g0.g(this.f74662c, fVar.f74662c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f74660a) * 31) + Integer.hashCode(this.f74661b)) * 31) + this.f74662c.hashCode();
    }

    @m80.k
    public String toString() {
        return "BBGetWordAssetInfoResult(topic_id=" + this.f74660a + ", book_id=" + this.f74661b + ", asset_info=" + this.f74662c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74659e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBGetWordAssetInfoResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBGetWordAssetInfoResult.kt\ncom/baicizhan/biz/online/bs_words/BBGetWordAssetInfoResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
    public static final class b implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74663a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74664b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public l f74665c;

        public b() {
            this.f74663a = null;
            this.f74664b = null;
            this.f74665c = null;
        }

        @m80.k
        public final b a(@m80.k l asset_info) {
            g0.p(asset_info, "asset_info");
            this.f74665c = asset_info;
            return this;
        }

        @m80.k
        public final b b(int i11) {
            this.f74664b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f build() {
            Integer num = this.f74663a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74664b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue2 = num2.intValue();
            l lVar = this.f74665c;
            if (lVar != null) {
                return new f(intValue, intValue2, lVar);
            }
            throw new IllegalStateException("Required field 'asset_info' is missing");
        }

        @m80.k
        public final b d(int i11) {
            this.f74663a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74663a = null;
            this.f74664b = null;
            this.f74665c = null;
        }

        public b(@m80.k f source) {
            g0.p(source, "source");
            this.f74663a = Integer.valueOf(source.f74660a);
            this.f74664b = Integer.valueOf(source.f74661b);
            this.f74665c = source.f74662c;
        }
    }
}
