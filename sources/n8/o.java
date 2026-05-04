package n8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f74812e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, b> f74813f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f74814a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f74815b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f74816c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f74817d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<o, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 15) {
                                ws.f v42 = protocol.v4();
                                ArrayList arrayList = new ArrayList(v42.f96838b);
                                int i12 = v42.f96838b;
                                while (i11 < i12) {
                                    arrayList.add(protocol.readString());
                                    i11++;
                                }
                                protocol.l8();
                                builder.d(arrayList);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(protocol.readString());
                                i11++;
                            }
                            protocol.l8();
                            builder.c(arrayList2);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v44 = protocol.v4();
                        ArrayList arrayList3 = new ArrayList(v44.f96838b);
                        int i14 = v44.f96838b;
                        while (i11 < i14) {
                            arrayList3.add(protocol.readString());
                            i11++;
                        }
                        protocol.l8();
                        builder.e(arrayList3);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v45 = protocol.v4();
                    ArrayList arrayList4 = new ArrayList(v45.f96838b);
                    int i15 = v45.f96838b;
                    while (i11 < i15) {
                        arrayList4.add(protocol.readString());
                        i11++;
                    }
                    protocol.l8();
                    builder.b(arrayList4);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordMediaHalftimeList");
            protocol.Q6("word_fm_halftime_list", 1, (byte) 15);
            protocol.y2((byte) 11, struct.f74814a.size());
            Iterator<String> it = struct.f74814a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("word_tv_halftime_list", 2, (byte) 15);
            protocol.y2((byte) 11, struct.f74815b.size());
            Iterator<String> it2 = struct.f74815b.iterator();
            while (it2.hasNext()) {
                protocol.p1(it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("word_fm_head_list", 3, (byte) 15);
            protocol.y2((byte) 11, struct.f74816c.size());
            Iterator<String> it3 = struct.f74816c.iterator();
            while (it3.hasNext()) {
                protocol.p1(it3.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("word_fm_tail_list", 4, (byte) 15);
            protocol.y2((byte) 11, struct.f74817d.size());
            Iterator<String> it4 = struct.f74817d.iterator();
            while (it4.hasNext()) {
                protocol.p1(it4.next());
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

    public o(@m80.k List<String> word_fm_halftime_list, @m80.k List<String> word_tv_halftime_list, @m80.k List<String> word_fm_head_list, @m80.k List<String> word_fm_tail_list) {
        g0.p(word_fm_halftime_list, "word_fm_halftime_list");
        g0.p(word_tv_halftime_list, "word_tv_halftime_list");
        g0.p(word_fm_head_list, "word_fm_head_list");
        g0.p(word_fm_tail_list, "word_fm_tail_list");
        this.f74814a = word_fm_halftime_list;
        this.f74815b = word_tv_halftime_list;
        this.f74816c = word_fm_head_list;
        this.f74817d = word_fm_tail_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o f(o oVar, List list, List list2, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = oVar.f74814a;
        }
        if ((i11 & 2) != 0) {
            list2 = oVar.f74815b;
        }
        if ((i11 & 4) != 0) {
            list3 = oVar.f74816c;
        }
        if ((i11 & 8) != 0) {
            list4 = oVar.f74817d;
        }
        return oVar.e(list, list2, list3, list4);
    }

    @m80.k
    public final List<String> a() {
        return this.f74814a;
    }

    @m80.k
    public final List<String> b() {
        return this.f74815b;
    }

    @m80.k
    public final List<String> c() {
        return this.f74816c;
    }

    @m80.k
    public final List<String> d() {
        return this.f74817d;
    }

    @m80.k
    public final o e(@m80.k List<String> word_fm_halftime_list, @m80.k List<String> word_tv_halftime_list, @m80.k List<String> word_fm_head_list, @m80.k List<String> word_fm_tail_list) {
        g0.p(word_fm_halftime_list, "word_fm_halftime_list");
        g0.p(word_tv_halftime_list, "word_tv_halftime_list");
        g0.p(word_fm_head_list, "word_fm_head_list");
        g0.p(word_fm_tail_list, "word_fm_tail_list");
        return new o(word_fm_halftime_list, word_tv_halftime_list, word_fm_head_list, word_fm_tail_list);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return g0.g(this.f74814a, oVar.f74814a) && g0.g(this.f74815b, oVar.f74815b) && g0.g(this.f74816c, oVar.f74816c) && g0.g(this.f74817d, oVar.f74817d);
    }

    public int hashCode() {
        return (((((this.f74814a.hashCode() * 31) + this.f74815b.hashCode()) * 31) + this.f74816c.hashCode()) * 31) + this.f74817d.hashCode();
    }

    @m80.k
    public String toString() {
        return "BBWordMediaHalftimeList(word_fm_halftime_list=" + this.f74814a + ", word_tv_halftime_list=" + this.f74815b + ", word_fm_head_list=" + this.f74816c + ", word_fm_tail_list=" + this.f74817d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74813f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordMediaHalftimeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordMediaHalftimeList.kt\ncom/baicizhan/biz/online/bs_words/BBWordMediaHalftimeList$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"})
    public static final class b implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<String> f74818a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<String> f74819b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<String> f74820c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<String> f74821d;

        public b() {
            this.f74818a = null;
            this.f74819b = null;
            this.f74820c = null;
            this.f74821d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o build() {
            List<String> list = this.f74818a;
            if (list == null) {
                throw new IllegalStateException("Required field 'word_fm_halftime_list' is missing");
            }
            List<String> list2 = this.f74819b;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'word_tv_halftime_list' is missing");
            }
            List<String> list3 = this.f74820c;
            if (list3 == null) {
                throw new IllegalStateException("Required field 'word_fm_head_list' is missing");
            }
            List<String> list4 = this.f74821d;
            if (list4 != null) {
                return new o(list, list2, list3, list4);
            }
            throw new IllegalStateException("Required field 'word_fm_tail_list' is missing");
        }

        @m80.k
        public final b b(@m80.k List<String> word_fm_halftime_list) {
            g0.p(word_fm_halftime_list, "word_fm_halftime_list");
            this.f74818a = word_fm_halftime_list;
            return this;
        }

        @m80.k
        public final b c(@m80.k List<String> word_fm_head_list) {
            g0.p(word_fm_head_list, "word_fm_head_list");
            this.f74820c = word_fm_head_list;
            return this;
        }

        @m80.k
        public final b d(@m80.k List<String> word_fm_tail_list) {
            g0.p(word_fm_tail_list, "word_fm_tail_list");
            this.f74821d = word_fm_tail_list;
            return this;
        }

        @m80.k
        public final b e(@m80.k List<String> word_tv_halftime_list) {
            g0.p(word_tv_halftime_list, "word_tv_halftime_list");
            this.f74819b = word_tv_halftime_list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74818a = null;
            this.f74819b = null;
            this.f74820c = null;
            this.f74821d = null;
        }

        public b(@m80.k o source) {
            g0.p(source, "source");
            this.f74818a = source.f74814a;
            this.f74819b = source.f74815b;
            this.f74820c = source.f74816c;
            this.f74821d = source.f74817d;
        }
    }
}
