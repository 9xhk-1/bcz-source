package l8;

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

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c f70729c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @g
    @k
    public static final ts.a<a, b> f70730d = new C0847a();

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public final String f70731a;

    /* renamed from: b, reason: collision with root package name */
    @g
    @k
    public final String f70732b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l8.a$a, reason: collision with other inner class name */
    public static final class C0847a implements ts.a<a, b> {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
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
        public void write(@k i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBUserVocabInfo");
            protocol.Q6("test_vocab_info", 1, (byte) 11);
            protocol.p1(struct.f70731a);
            protocol.N2();
            protocol.Q6("test_vocab_count_range", 2, (byte) 11);
            protocol.p1(struct.f70732b);
            protocol.N2();
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

    public a(@k String test_vocab_info, @k String test_vocab_count_range) {
        g0.p(test_vocab_info, "test_vocab_info");
        g0.p(test_vocab_count_range, "test_vocab_count_range");
        this.f70731a = test_vocab_info;
        this.f70732b = test_vocab_count_range;
    }

    public static /* synthetic */ a d(a aVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f70731a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f70732b;
        }
        return aVar.c(str, str2);
    }

    @k
    public final String a() {
        return this.f70731a;
    }

    @k
    public final String b() {
        return this.f70732b;
    }

    @k
    public final a c(@k String test_vocab_info, @k String test_vocab_count_range) {
        g0.p(test_vocab_info, "test_vocab_info");
        g0.p(test_vocab_count_range, "test_vocab_count_range");
        return new a(test_vocab_info, test_vocab_count_range);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f70731a, aVar.f70731a) && g0.g(this.f70732b, aVar.f70732b);
    }

    public int hashCode() {
        return (this.f70731a.hashCode() * 31) + this.f70732b.hashCode();
    }

    @k
    public String toString() {
        return "BBUserVocabInfo(test_vocab_info=" + this.f70731a + ", test_vocab_count_range=" + this.f70732b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f70730d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBUserVocabInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBUserVocabInfo.kt\ncom/baicizhan/biz/online/bs_studys/BBUserVocabInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
    public static final class b implements f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f70733a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f70734b;

        public b() {
            this.f70733a = null;
            this.f70734b = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            String str = this.f70733a;
            if (str == null) {
                throw new IllegalStateException("Required field 'test_vocab_info' is missing");
            }
            String str2 = this.f70734b;
            if (str2 != null) {
                return new a(str, str2);
            }
            throw new IllegalStateException("Required field 'test_vocab_count_range' is missing");
        }

        @k
        public final b b(@k String test_vocab_count_range) {
            g0.p(test_vocab_count_range, "test_vocab_count_range");
            this.f70734b = test_vocab_count_range;
            return this;
        }

        @k
        public final b c(@k String test_vocab_info) {
            g0.p(test_vocab_info, "test_vocab_info");
            this.f70733a = test_vocab_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f70733a = null;
            this.f70734b = null;
        }

        public b(@k a source) {
            g0.p(source, "source");
            this.f70733a = source.f70731a;
            this.f70734b = source.f70732b;
        }
    }
}
