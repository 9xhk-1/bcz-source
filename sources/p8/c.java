package p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final C0982c f79704c = new C0982c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, b> f79705d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79706a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<d> f79707b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            arrayList.add(d.f79731d.read(protocol));
                        }
                        protocol.l8();
                        builder.a(arrayList);
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
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("AwardCombo");
            protocol.Q6("combo_totall", 1, (byte) 8);
            protocol.l5(struct.f79706a);
            protocol.N2();
            protocol.Q6("awards", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f79707b.size());
            Iterator<d> it = struct.f79707b.iterator();
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
    /* renamed from: p8.c$c, reason: collision with other inner class name */
    public static final class C0982c {
        public /* synthetic */ C0982c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C0982c() {
        }
    }

    public c(int i11, @m80.k List<d> awards) {
        kotlin.jvm.internal.g0.p(awards, "awards");
        this.f79706a = i11;
        this.f79707b = awards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c d(c cVar, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f79706a;
        }
        if ((i12 & 2) != 0) {
            list = cVar.f79707b;
        }
        return cVar.c(i11, list);
    }

    public final int a() {
        return this.f79706a;
    }

    @m80.k
    public final List<d> b() {
        return this.f79707b;
    }

    @m80.k
    public final c c(int i11, @m80.k List<d> awards) {
        kotlin.jvm.internal.g0.p(awards, "awards");
        return new c(i11, awards);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f79706a == cVar.f79706a && kotlin.jvm.internal.g0.g(this.f79707b, cVar.f79707b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79706a) * 31) + this.f79707b.hashCode();
    }

    @m80.k
    public String toString() {
        return "AwardCombo(combo_totall=" + this.f79706a + ", awards=" + this.f79707b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79705d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAwardCombo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwardCombo.kt\ncom/baicizhan/biz/online/game_api/AwardCombo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    public static final class b implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79708a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<d> f79709b;

        public b() {
            this.f79708a = null;
            this.f79709b = null;
        }

        @m80.k
        public final b a(@m80.k List<d> awards) {
            kotlin.jvm.internal.g0.p(awards, "awards");
            this.f79709b = awards;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f79708a;
            if (num == null) {
                throw new IllegalStateException("Required field 'combo_totall' is missing");
            }
            int intValue = num.intValue();
            List<d> list = this.f79709b;
            if (list != null) {
                return new c(intValue, list);
            }
            throw new IllegalStateException("Required field 'awards' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f79708a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79708a = null;
            this.f79709b = null;
        }

        public b(@m80.k c source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79708a = Integer.valueOf(source.f79706a);
            this.f79709b = source.f79707b;
        }
    }
}
