package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c f79672b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C0981b> f79673c = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<d> f79674a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C0981b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new C0981b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C0981b builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(d.f79731d.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("AwardBox");
            protocol.Q6("awards", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f79674a.size());
            Iterator<d> it = struct.f79674a.iterator();
            while (it.hasNext()) {
                d.f79731d.write(protocol, it.next());
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

    public b(@m80.k List<d> awards) {
        kotlin.jvm.internal.g0.p(awards, "awards");
        this.f79674a = awards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b c(b bVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bVar.f79674a;
        }
        return bVar.b(list);
    }

    @m80.k
    public final List<d> a() {
        return this.f79674a;
    }

    @m80.k
    public final b b(@m80.k List<d> awards) {
        kotlin.jvm.internal.g0.p(awards, "awards");
        return new b(awards);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f79674a, ((b) obj).f79674a);
    }

    public int hashCode() {
        return this.f79674a.hashCode();
    }

    @m80.k
    public String toString() {
        return "AwardBox(awards=" + this.f79674a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79673c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwardBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwardBox.kt\ncom/baicizhan/biz/online/game_api/AwardBox$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
    /* renamed from: p8.b$b, reason: collision with other inner class name */
    public static final class C0981b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<d> f79675a;

        public C0981b() {
            this.f79675a = null;
        }

        @m80.k
        public final C0981b a(@m80.k List<d> awards) {
            kotlin.jvm.internal.g0.p(awards, "awards");
            this.f79675a = awards;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b build() {
            List<d> list = this.f79675a;
            if (list != null) {
                return new b(list);
            }
            throw new IllegalStateException("Required field 'awards' is missing");
        }

        @Override // ts.f
        public void reset() {
            this.f79675a = null;
        }

        public C0981b(@m80.k b source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79675a = source.f79674a;
        }
    }
}
