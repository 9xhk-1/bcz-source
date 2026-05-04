package g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c f53297b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, b> f53298c = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<h> f53299a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<j, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        arrayList.add(h.f53264n.read(protocol));
                    }
                    protocol.l8();
                    builder.a(arrayList);
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
            protocol.g6("BczOwnAd");
            protocol.Q6("ads", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f53299a.size());
            Iterator<h> it = struct.f53299a.iterator();
            while (it.hasNext()) {
                h.f53264n.write(protocol, it.next());
            }
            protocol.i5();
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

    public j(@m80.k List<h> ads) {
        g0.p(ads, "ads");
        this.f53299a = ads;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j c(j jVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = jVar.f53299a;
        }
        return jVar.b(list);
    }

    @m80.k
    public final List<h> a() {
        return this.f53299a;
    }

    @m80.k
    public final j b(@m80.k List<h> ads) {
        g0.p(ads, "ads");
        return new j(ads);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && g0.g(this.f53299a, ((j) obj).f53299a);
    }

    public int hashCode() {
        return this.f53299a.hashCode();
    }

    @m80.k
    public String toString() {
        return "BczOwnAd(ads=" + this.f53299a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53298c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczOwnAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczOwnAd.kt\ncom/baicizhan/biz/online/advertise_api/BczOwnAd$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
    public static final class b implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<h> f53300a;

        public b() {
            this.f53300a = null;
        }

        @m80.k
        public final b a(@m80.k List<h> ads) {
            g0.p(ads, "ads");
            this.f53300a = ads;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j build() {
            List<h> list = this.f53300a;
            if (list != null) {
                return new j(list);
            }
            throw new IllegalStateException("Required field 'ads' is missing");
        }

        @Override // ts.f
        public void reset() {
            this.f53300a = null;
        }

        public b(@m80.k j source) {
            g0.p(source, "source");
            this.f53300a = source.f53299a;
        }
    }
}
