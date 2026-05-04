package j8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c f63776b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, b> f63777c = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<j> f63778a;

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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(j.f63817f.read(protocol));
                    }
                    protocol.l8();
                    builder.b(arrayList);
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
            protocol.g6("BczNavTabs");
            protocol.Q6("tabs", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f63778a.size());
            Iterator<j> it = struct.f63778a.iterator();
            while (it.hasNext()) {
                j.f63817f.write(protocol, it.next());
            }
            protocol.i5();
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

    public f(@m80.k List<j> tabs) {
        g0.p(tabs, "tabs");
        this.f63778a = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f c(f fVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = fVar.f63778a;
        }
        return fVar.b(list);
    }

    @m80.k
    public final List<j> a() {
        return this.f63778a;
    }

    @m80.k
    public final f b(@m80.k List<j> tabs) {
        g0.p(tabs, "tabs");
        return new f(tabs);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && g0.g(this.f63778a, ((f) obj).f63778a);
    }

    public int hashCode() {
        return this.f63778a.hashCode();
    }

    @m80.k
    public String toString() {
        return "BczNavTabs(tabs=" + this.f63778a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63777c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczNavTabs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczNavTabs.kt\ncom/baicizhan/biz/online/bcz_system_api/BczNavTabs$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
    public static final class b implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<j> f63779a;

        public b() {
            this.f63779a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            List<j> list = this.f63779a;
            if (list != null) {
                return new f(list);
            }
            throw new IllegalStateException("Required field 'tabs' is missing");
        }

        @m80.k
        public final b b(@m80.k List<j> tabs) {
            g0.p(tabs, "tabs");
            this.f63779a = tabs;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63779a = null;
        }

        public b(@m80.k f source) {
            g0.p(source, "source");
            this.f63779a = source.f63778a;
        }
    }
}
