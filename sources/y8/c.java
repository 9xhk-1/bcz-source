package y8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final C1351c f99523c = new C1351c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, b> f99524d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<g> f99525a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k> f99526b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            arrayList.add(k.f99634i.read(protocol));
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
                        arrayList2.add(g.f99558g.read(protocol));
                        i11++;
                    }
                    protocol.l8();
                    builder.a(arrayList2);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AddWordsToBooksRsp");
            protocol.Q6("book_infos", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f99525a.size());
            Iterator<g> it = struct.f99525a.iterator();
            while (it.hasNext()) {
                g.f99558g.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 2, (byte) 15);
            protocol.y2((byte) 12, struct.f99526b.size());
            Iterator<k> it2 = struct.f99526b.iterator();
            while (it2.hasNext()) {
                k.f99634i.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y8.c$c, reason: collision with other inner class name */
    public static final class C1351c {
        public /* synthetic */ C1351c(v vVar) {
            this();
        }

        public C1351c() {
        }
    }

    public c(@m80.k List<g> book_infos, @m80.k List<k> words) {
        g0.p(book_infos, "book_infos");
        g0.p(words, "words");
        this.f99525a = book_infos;
        this.f99526b = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c d(c cVar, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cVar.f99525a;
        }
        if ((i11 & 2) != 0) {
            list2 = cVar.f99526b;
        }
        return cVar.c(list, list2);
    }

    @m80.k
    public final List<g> a() {
        return this.f99525a;
    }

    @m80.k
    public final List<k> b() {
        return this.f99526b;
    }

    @m80.k
    public final c c(@m80.k List<g> book_infos, @m80.k List<k> words) {
        g0.p(book_infos, "book_infos");
        g0.p(words, "words");
        return new c(book_infos, words);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f99525a, cVar.f99525a) && g0.g(this.f99526b, cVar.f99526b);
    }

    public int hashCode() {
        return (this.f99525a.hashCode() * 31) + this.f99526b.hashCode();
    }

    @m80.k
    public String toString() {
        return "AddWordsToBooksRsp(book_infos=" + this.f99525a + ", words=" + this.f99526b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99524d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAddWordsToBooksRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddWordsToBooksRsp.kt\ncom/baicizhan/biz/online/user_book/AddWordsToBooksRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    public static final class b implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<g> f99527a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<k> f99528b;

        public b() {
            this.f99527a = null;
            this.f99528b = null;
        }

        @m80.k
        public final b a(@m80.k List<g> book_infos) {
            g0.p(book_infos, "book_infos");
            this.f99527a = book_infos;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c build() {
            List<g> list = this.f99527a;
            if (list == null) {
                throw new IllegalStateException("Required field 'book_infos' is missing");
            }
            List<k> list2 = this.f99528b;
            if (list2 != null) {
                return new c(list, list2);
            }
            throw new IllegalStateException("Required field 'words' is missing");
        }

        @m80.k
        public final b c(@m80.k List<k> words) {
            g0.p(words, "words");
            this.f99528b = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99527a = null;
            this.f99528b = null;
        }

        public b(@m80.k c source) {
            g0.p(source, "source");
            this.f99527a = source.f99525a;
            this.f99528b = source.f99526b;
        }
    }
}
