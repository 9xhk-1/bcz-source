package r8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f83590c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<a, C1041a> f83591d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final List<String> f83592a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f83593b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a, C1041a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C1041a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k C1041a builder) {
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
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(protocol.readString());
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
        public void write(@k i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("Feedback");
            protocol.Q6("selection", 1, (byte) 15);
            protocol.y2((byte) 11, struct.f83592a.size());
            Iterator<String> it = struct.f83592a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6(com.baicizhan.main.home.plan.module.exam.b.f22504c, 2, (byte) 11);
            protocol.p1(struct.f83593b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public a(@k List<String> selection, @k String toast) {
        g0.p(selection, "selection");
        g0.p(toast, "toast");
        this.f83592a = selection;
        this.f83593b = toast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aVar.f83592a;
        }
        if ((i11 & 2) != 0) {
            str = aVar.f83593b;
        }
        return aVar.c(list, str);
    }

    @k
    public final List<String> a() {
        return this.f83592a;
    }

    @k
    public final String b() {
        return this.f83593b;
    }

    @k
    public final a c(@k List<String> selection, @k String toast) {
        g0.p(selection, "selection");
        g0.p(toast, "toast");
        return new a(selection, toast);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f83592a, aVar.f83592a) && g0.g(this.f83593b, aVar.f83593b);
    }

    public int hashCode() {
        return (this.f83592a.hashCode() * 31) + this.f83593b.hashCode();
    }

    @k
    public String toString() {
        return "Feedback(selection=" + this.f83592a + ", toast=" + this.f83593b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f83591d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFeedback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Feedback.kt\ncom/baicizhan/biz/online/notify/Feedback$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
    /* renamed from: r8.a$a, reason: collision with other inner class name */
    public static final class C1041a implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public List<String> f83594a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f83595b;

        public C1041a() {
            this.f83594a = null;
            this.f83595b = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            List<String> list = this.f83594a;
            if (list == null) {
                throw new IllegalStateException("Required field 'selection' is missing");
            }
            String str = this.f83595b;
            if (str != null) {
                return new a(list, str);
            }
            throw new IllegalStateException("Required field 'toast' is missing");
        }

        @k
        public final C1041a b(@k List<String> selection) {
            g0.p(selection, "selection");
            this.f83594a = selection;
            return this;
        }

        @k
        public final C1041a c(@k String toast) {
            g0.p(toast, "toast");
            this.f83595b = toast;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f83594a = null;
            this.f83595b = null;
        }

        public C1041a(@k a source) {
            g0.p(source, "source");
            this.f83594a = source.f83592a;
            this.f83595b = source.f83593b;
        }
    }
}
