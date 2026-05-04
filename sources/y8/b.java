package y8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f99517c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C1350b> f99518d = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final g f99519a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<k> f99520b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C1350b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C1350b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C1350b builder) {
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
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(k.f99634i.read(protocol));
                        }
                        protocol.l8();
                        builder.c(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.a(g.f99558g.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AddWordsRsp");
            protocol.Q6("book_info", 1, (byte) 12);
            g.f99558g.write(protocol, struct.f99519a);
            protocol.N2();
            protocol.Q6(xd.a.f98002r, 2, (byte) 15);
            protocol.y2((byte) 12, struct.f99520b.size());
            Iterator<k> it = struct.f99520b.iterator();
            while (it.hasNext()) {
                k.f99634i.write(protocol, it.next());
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

    public b(@m80.k g book_info, @m80.k List<k> words) {
        g0.p(book_info, "book_info");
        g0.p(words, "words");
        this.f99519a = book_info;
        this.f99520b = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b d(b bVar, g gVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = bVar.f99519a;
        }
        if ((i11 & 2) != 0) {
            list = bVar.f99520b;
        }
        return bVar.c(gVar, list);
    }

    @m80.k
    public final g a() {
        return this.f99519a;
    }

    @m80.k
    public final List<k> b() {
        return this.f99520b;
    }

    @m80.k
    public final b c(@m80.k g book_info, @m80.k List<k> words) {
        g0.p(book_info, "book_info");
        g0.p(words, "words");
        return new b(book_info, words);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f99519a, bVar.f99519a) && g0.g(this.f99520b, bVar.f99520b);
    }

    public int hashCode() {
        return (this.f99519a.hashCode() * 31) + this.f99520b.hashCode();
    }

    @m80.k
    public String toString() {
        return "AddWordsRsp(book_info=" + this.f99519a + ", words=" + this.f99520b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f99518d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAddWordsRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddWordsRsp.kt\ncom/baicizhan/biz/online/user_book/AddWordsRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
    /* renamed from: y8.b$b, reason: collision with other inner class name */
    public static final class C1350b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public g f99521a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<k> f99522b;

        public C1350b() {
            this.f99521a = null;
            this.f99522b = null;
        }

        @m80.k
        public final C1350b a(@m80.k g book_info) {
            g0.p(book_info, "book_info");
            this.f99521a = book_info;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b build() {
            g gVar = this.f99521a;
            if (gVar == null) {
                throw new IllegalStateException("Required field 'book_info' is missing");
            }
            List<k> list = this.f99522b;
            if (list != null) {
                return new b(gVar, list);
            }
            throw new IllegalStateException("Required field 'words' is missing");
        }

        @m80.k
        public final C1350b c(@m80.k List<k> words) {
            g0.p(words, "words");
            this.f99522b = words;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f99521a = null;
            this.f99522b = null;
        }

        public C1350b(@m80.k b source) {
            g0.p(source, "source");
            this.f99521a = source.f99519a;
            this.f99522b = source.f99520b;
        }
    }
}
