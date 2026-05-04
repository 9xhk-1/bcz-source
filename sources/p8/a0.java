package p8;

import com.baicizhan.main.activity.SingleFragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f79646c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a0, a> f79647d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79648a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f79649b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(protocol.readString());
                        }
                        protocol.l8();
                        builder.c(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.a(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("MascotInfo");
            protocol.Q6(SingleFragmentActivity.f18194n, 1, (byte) 11);
            protocol.p1(struct.f79648a);
            protocol.N2();
            protocol.Q6("images", 2, (byte) 15);
            protocol.y2((byte) 11, struct.f79649b.size());
            Iterator<String> it = struct.f79649b.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public a0(@m80.k String background, @m80.k List<String> images) {
        kotlin.jvm.internal.g0.p(background, "background");
        kotlin.jvm.internal.g0.p(images, "images");
        this.f79648a = background;
        this.f79649b = images;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a0 d(a0 a0Var, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a0Var.f79648a;
        }
        if ((i11 & 2) != 0) {
            list = a0Var.f79649b;
        }
        return a0Var.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f79648a;
    }

    @m80.k
    public final List<String> b() {
        return this.f79649b;
    }

    @m80.k
    public final a0 c(@m80.k String background, @m80.k List<String> images) {
        kotlin.jvm.internal.g0.p(background, "background");
        kotlin.jvm.internal.g0.p(images, "images");
        return new a0(background, images);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.g0.g(this.f79648a, a0Var.f79648a) && kotlin.jvm.internal.g0.g(this.f79649b, a0Var.f79649b);
    }

    public int hashCode() {
        return (this.f79648a.hashCode() * 31) + this.f79649b.hashCode();
    }

    @m80.k
    public String toString() {
        return "MascotInfo(background=" + this.f79648a + ", images=" + this.f79649b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79647d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nMascotInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MascotInfo.kt\ncom/baicizhan/biz/online/game_api/MascotInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static final class a implements ts.f<a0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f79650a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<String> f79651b;

        public a() {
            this.f79650a = null;
            this.f79651b = null;
        }

        @m80.k
        public final a a(@m80.k String background) {
            kotlin.jvm.internal.g0.p(background, "background");
            this.f79650a = background;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 build() {
            String str = this.f79650a;
            if (str == null) {
                throw new IllegalStateException("Required field 'background' is missing");
            }
            List<String> list = this.f79651b;
            if (list != null) {
                return new a0(str, list);
            }
            throw new IllegalStateException("Required field 'images' is missing");
        }

        @m80.k
        public final a c(@m80.k List<String> images) {
            kotlin.jvm.internal.g0.p(images, "images");
            this.f79651b = images;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79650a = null;
            this.f79651b = null;
        }

        public a(@m80.k a0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79650a = source.f79648a;
            this.f79651b = source.f79649b;
        }
    }
}
