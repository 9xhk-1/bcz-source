package n8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f74802e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, b> f74803f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74804a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f74805b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74806c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74807d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<n, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.e(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordAssetPackInfo");
            protocol.Q6("min_id", 1, (byte) 8);
            protocol.l5(struct.f74804a);
            protocol.N2();
            protocol.Q6("max_id", 2, (byte) 8);
            protocol.l5(struct.f74805b);
            protocol.N2();
            protocol.Q6("word_info_gz_path", 3, (byte) 11);
            protocol.p1(struct.f74806c);
            protocol.N2();
            protocol.Q6("asset_zpack_path", 4, (byte) 11);
            protocol.p1(struct.f74807d);
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

    public n(int i11, int i12, @m80.k String word_info_gz_path, @m80.k String asset_zpack_path) {
        g0.p(word_info_gz_path, "word_info_gz_path");
        g0.p(asset_zpack_path, "asset_zpack_path");
        this.f74804a = i11;
        this.f74805b = i12;
        this.f74806c = word_info_gz_path;
        this.f74807d = asset_zpack_path;
    }

    public static /* synthetic */ n f(n nVar, int i11, int i12, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = nVar.f74804a;
        }
        if ((i13 & 2) != 0) {
            i12 = nVar.f74805b;
        }
        if ((i13 & 4) != 0) {
            str = nVar.f74806c;
        }
        if ((i13 & 8) != 0) {
            str2 = nVar.f74807d;
        }
        return nVar.e(i11, i12, str, str2);
    }

    public final int a() {
        return this.f74804a;
    }

    public final int b() {
        return this.f74805b;
    }

    @m80.k
    public final String c() {
        return this.f74806c;
    }

    @m80.k
    public final String d() {
        return this.f74807d;
    }

    @m80.k
    public final n e(int i11, int i12, @m80.k String word_info_gz_path, @m80.k String asset_zpack_path) {
        g0.p(word_info_gz_path, "word_info_gz_path");
        g0.p(asset_zpack_path, "asset_zpack_path");
        return new n(i11, i12, word_info_gz_path, asset_zpack_path);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f74804a == nVar.f74804a && this.f74805b == nVar.f74805b && g0.g(this.f74806c, nVar.f74806c) && g0.g(this.f74807d, nVar.f74807d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f74804a) * 31) + Integer.hashCode(this.f74805b)) * 31) + this.f74806c.hashCode()) * 31) + this.f74807d.hashCode();
    }

    @m80.k
    public String toString() {
        return "BBWordAssetPackInfo(min_id=" + this.f74804a + ", max_id=" + this.f74805b + ", word_info_gz_path=" + this.f74806c + ", asset_zpack_path=" + this.f74807d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74803f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordAssetPackInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordAssetPackInfo.kt\ncom/baicizhan/biz/online/bs_words/BBWordAssetPackInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class b implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74808a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f74809b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74810c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f74811d;

        public b() {
            this.f74808a = null;
            this.f74809b = null;
            this.f74810c = null;
            this.f74811d = null;
        }

        @m80.k
        public final b a(@m80.k String asset_zpack_path) {
            g0.p(asset_zpack_path, "asset_zpack_path");
            this.f74811d = asset_zpack_path;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n build() {
            Integer num = this.f74808a;
            if (num == null) {
                throw new IllegalStateException("Required field 'min_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f74809b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'max_id' is missing");
            }
            int intValue2 = num2.intValue();
            String str = this.f74810c;
            if (str == null) {
                throw new IllegalStateException("Required field 'word_info_gz_path' is missing");
            }
            String str2 = this.f74811d;
            if (str2 != null) {
                return new n(intValue, intValue2, str, str2);
            }
            throw new IllegalStateException("Required field 'asset_zpack_path' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f74809b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(int i11) {
            this.f74808a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b e(@m80.k String word_info_gz_path) {
            g0.p(word_info_gz_path, "word_info_gz_path");
            this.f74810c = word_info_gz_path;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74808a = null;
            this.f74809b = null;
            this.f74810c = null;
            this.f74811d = null;
        }

        public b(@m80.k n source) {
            g0.p(source, "source");
            this.f74808a = Integer.valueOf(source.f74804a);
            this.f74809b = Integer.valueOf(source.f74805b);
            this.f74810c = source.f74806c;
            this.f74811d = source.f74807d;
        }
    }
}
