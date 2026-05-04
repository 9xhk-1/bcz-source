package n8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f74880g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t, b> f74881h = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f74882a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74883b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74884c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f74885d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<List<String>> f74886e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final boolean f74887f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<t, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol, @m80.k b builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 == 8) {
                            builder.c(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            builder.g(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            builder.d(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(protocol.readString());
                            }
                            protocol.l8();
                            builder.e(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 15) {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            for (int i14 = 0; i14 < i13; i14++) {
                                ws.f v44 = protocol.v4();
                                ArrayList arrayList3 = new ArrayList(v44.f96838b);
                                int i15 = v44.f96838b;
                                for (int i16 = 0; i16 < i15; i16++) {
                                    arrayList3.add(protocol.readString());
                                }
                                protocol.l8();
                                arrayList2.add(arrayList3);
                            }
                            protocol.l8();
                            builder.f(arrayList2);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 2) {
                            builder.b(protocol.readBool());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k t struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordSyllableData");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f74882a);
            protocol.N2();
            protocol.Q6("word_syllable", 2, (byte) 11);
            protocol.p1(struct.f74883b);
            protocol.N2();
            protocol.Q6("word_cloze", 3, (byte) 11);
            protocol.p1(struct.f74884c);
            protocol.N2();
            protocol.Q6("word_cloze_options", 4, (byte) 15);
            protocol.y2((byte) 11, struct.f74885d.size());
            Iterator<String> it = struct.f74885d.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("word_cloze_tips", 5, (byte) 15);
            protocol.y2((byte) 15, struct.f74886e.size());
            for (List<String> list : struct.f74886e) {
                protocol.y2((byte) 11, list.size());
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    protocol.p1(it2.next());
                }
                protocol.i5();
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("is_default_learn", 6, (byte) 2);
            protocol.a4(struct.f74887f);
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

    /* JADX WARN: Multi-variable type inference failed */
    public t(int i11, @m80.k String word_syllable, @m80.k String word_cloze, @m80.k List<String> word_cloze_options, @m80.k List<? extends List<String>> word_cloze_tips, boolean z11) {
        g0.p(word_syllable, "word_syllable");
        g0.p(word_cloze, "word_cloze");
        g0.p(word_cloze_options, "word_cloze_options");
        g0.p(word_cloze_tips, "word_cloze_tips");
        this.f74882a = i11;
        this.f74883b = word_syllable;
        this.f74884c = word_cloze;
        this.f74885d = word_cloze_options;
        this.f74886e = word_cloze_tips;
        this.f74887f = z11;
    }

    public static /* synthetic */ t h(t tVar, int i11, String str, String str2, List list, List list2, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = tVar.f74882a;
        }
        if ((i12 & 2) != 0) {
            str = tVar.f74883b;
        }
        if ((i12 & 4) != 0) {
            str2 = tVar.f74884c;
        }
        if ((i12 & 8) != 0) {
            list = tVar.f74885d;
        }
        if ((i12 & 16) != 0) {
            list2 = tVar.f74886e;
        }
        if ((i12 & 32) != 0) {
            z11 = tVar.f74887f;
        }
        List list3 = list2;
        boolean z12 = z11;
        return tVar.g(i11, str, str2, list, list3, z12);
    }

    public final int a() {
        return this.f74882a;
    }

    @m80.k
    public final String b() {
        return this.f74883b;
    }

    @m80.k
    public final String c() {
        return this.f74884c;
    }

    @m80.k
    public final List<String> d() {
        return this.f74885d;
    }

    @m80.k
    public final List<List<String>> e() {
        return this.f74886e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f74882a == tVar.f74882a && g0.g(this.f74883b, tVar.f74883b) && g0.g(this.f74884c, tVar.f74884c) && g0.g(this.f74885d, tVar.f74885d) && g0.g(this.f74886e, tVar.f74886e) && this.f74887f == tVar.f74887f;
    }

    public final boolean f() {
        return this.f74887f;
    }

    @m80.k
    public final t g(int i11, @m80.k String word_syllable, @m80.k String word_cloze, @m80.k List<String> word_cloze_options, @m80.k List<? extends List<String>> word_cloze_tips, boolean z11) {
        g0.p(word_syllable, "word_syllable");
        g0.p(word_cloze, "word_cloze");
        g0.p(word_cloze_options, "word_cloze_options");
        g0.p(word_cloze_tips, "word_cloze_tips");
        return new t(i11, word_syllable, word_cloze, word_cloze_options, word_cloze_tips, z11);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f74882a) * 31) + this.f74883b.hashCode()) * 31) + this.f74884c.hashCode()) * 31) + this.f74885d.hashCode()) * 31) + this.f74886e.hashCode()) * 31) + Boolean.hashCode(this.f74887f);
    }

    @m80.k
    public String toString() {
        return "BBWordSyllableData(topic_id=" + this.f74882a + ", word_syllable=" + this.f74883b + ", word_cloze=" + this.f74884c + ", word_cloze_options=" + this.f74885d + ", word_cloze_tips=" + this.f74886e + ", is_default_learn=" + this.f74887f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74881h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordSyllableData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordSyllableData.kt\ncom/baicizhan/biz/online/bs_words/BBWordSyllableData$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"})
    public static final class b implements ts.f<t> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f74888a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74889b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74890c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<String> f74891d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public List<? extends List<String>> f74892e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Boolean f74893f;

        public b() {
            this.f74888a = null;
            this.f74889b = null;
            this.f74890c = null;
            this.f74891d = null;
            this.f74892e = null;
            this.f74893f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t build() {
            Integer num = this.f74888a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f74889b;
            if (str == null) {
                throw new IllegalStateException("Required field 'word_syllable' is missing");
            }
            String str2 = this.f74890c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'word_cloze' is missing");
            }
            List<String> list = this.f74891d;
            if (list == null) {
                throw new IllegalStateException("Required field 'word_cloze_options' is missing");
            }
            List<? extends List<String>> list2 = this.f74892e;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'word_cloze_tips' is missing");
            }
            Boolean bool = this.f74893f;
            if (bool != null) {
                return new t(intValue, str, str2, list, list2, bool.booleanValue());
            }
            throw new IllegalStateException("Required field 'is_default_learn' is missing");
        }

        @m80.k
        public final b b(boolean z11) {
            this.f74893f = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final b c(int i11) {
            this.f74888a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.k String word_cloze) {
            g0.p(word_cloze, "word_cloze");
            this.f74890c = word_cloze;
            return this;
        }

        @m80.k
        public final b e(@m80.k List<String> word_cloze_options) {
            g0.p(word_cloze_options, "word_cloze_options");
            this.f74891d = word_cloze_options;
            return this;
        }

        @m80.k
        public final b f(@m80.k List<? extends List<String>> word_cloze_tips) {
            g0.p(word_cloze_tips, "word_cloze_tips");
            this.f74892e = word_cloze_tips;
            return this;
        }

        @m80.k
        public final b g(@m80.k String word_syllable) {
            g0.p(word_syllable, "word_syllable");
            this.f74889b = word_syllable;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74888a = null;
            this.f74889b = null;
            this.f74890c = null;
            this.f74891d = null;
            this.f74892e = null;
            this.f74893f = null;
        }

        public b(@m80.k t source) {
            g0.p(source, "source");
            this.f74888a = Integer.valueOf(source.f74882a);
            this.f74889b = source.f74883b;
            this.f74890c = source.f74884c;
            this.f74891d = source.f74885d;
            this.f74892e = source.f74886e;
            this.f74893f = Boolean.valueOf(source.f74887f);
        }
    }
}
