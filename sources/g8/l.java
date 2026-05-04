package g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f53315c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, b> f53316d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k> f53317a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k> f53318b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<l, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k b builder) {
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
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i12 = v42.f96838b;
                        while (i11 < i12) {
                            arrayList.add(k.f53302h.read(protocol));
                            i11++;
                        }
                        protocol.l8();
                        builder.c(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v43 = protocol.v4();
                    ArrayList arrayList2 = new ArrayList(v43.f96838b);
                    int i13 = v43.f96838b;
                    while (i11 < i13) {
                        arrayList2.add(k.f53302h.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.b(arrayList2);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BookAdV2");
            protocol.Q6("homepage", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f53317a.size());
            Iterator<k> it = struct.f53317a.iterator();
            while (it.hasNext()) {
                k.f53302h.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("wordlist", 2, (byte) 15);
            protocol.y2((byte) 12, struct.f53318b.size());
            Iterator<k> it2 = struct.f53318b.iterator();
            while (it2.hasNext()) {
                k.f53302h.write(protocol, it2.next());
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

    public l(@m80.k List<k> homepage, @m80.k List<k> wordlist) {
        g0.p(homepage, "homepage");
        g0.p(wordlist, "wordlist");
        this.f53317a = homepage;
        this.f53318b = wordlist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l d(l lVar, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = lVar.f53317a;
        }
        if ((i11 & 2) != 0) {
            list2 = lVar.f53318b;
        }
        return lVar.c(list, list2);
    }

    @m80.k
    public final List<k> a() {
        return this.f53317a;
    }

    @m80.k
    public final List<k> b() {
        return this.f53318b;
    }

    @m80.k
    public final l c(@m80.k List<k> homepage, @m80.k List<k> wordlist) {
        g0.p(homepage, "homepage");
        g0.p(wordlist, "wordlist");
        return new l(homepage, wordlist);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g0.g(this.f53317a, lVar.f53317a) && g0.g(this.f53318b, lVar.f53318b);
    }

    public int hashCode() {
        return (this.f53317a.hashCode() * 31) + this.f53318b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BookAdV2(homepage=" + this.f53317a + ", wordlist=" + this.f53318b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53316d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBookAdV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookAdV2.kt\ncom/baicizhan/biz/online/advertise_api/BookAdV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    public static final class b implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<k> f53319a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<k> f53320b;

        public b() {
            this.f53319a = null;
            this.f53320b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l build() {
            List<k> list = this.f53319a;
            if (list == null) {
                throw new IllegalStateException("Required field 'homepage' is missing");
            }
            List<k> list2 = this.f53320b;
            if (list2 != null) {
                return new l(list, list2);
            }
            throw new IllegalStateException("Required field 'wordlist' is missing");
        }

        @m80.k
        public final b b(@m80.k List<k> homepage) {
            g0.p(homepage, "homepage");
            this.f53319a = homepage;
            return this;
        }

        @m80.k
        public final b c(@m80.k List<k> wordlist) {
            g0.p(wordlist, "wordlist");
            this.f53320b = wordlist;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53319a = null;
            this.f53320b = null;
        }

        public b(@m80.k l source) {
            g0.p(source, "source");
            this.f53319a = source.f53317a;
            this.f53320b = source.f53318b;
        }
    }
}
