package j8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final c f63806e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, b> f63807f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f63808a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<String> f63809b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Map<String, List<String>> f63810c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Map<String, List<String>> f63811d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<i, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            } else if (b11 == 13) {
                                ws.g O = protocol.O();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(O.f96841c);
                                int i12 = O.f96841c;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    String readString = protocol.readString();
                                    ws.f v42 = protocol.v4();
                                    ArrayList arrayList = new ArrayList(v42.f96838b);
                                    int i14 = v42.f96838b;
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        arrayList.add(protocol.readString());
                                    }
                                    protocol.l8();
                                    linkedHashMap.put(readString, arrayList);
                                }
                                protocol.b6();
                                builder.e(linkedHashMap);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 13) {
                            ws.g O2 = protocol.O();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O2.f96841c);
                            int i16 = O2.f96841c;
                            for (int i17 = 0; i17 < i16; i17++) {
                                String readString2 = protocol.readString();
                                ws.f v43 = protocol.v4();
                                ArrayList arrayList2 = new ArrayList(v43.f96838b);
                                int i18 = v43.f96838b;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    arrayList2.add(protocol.readString());
                                }
                                protocol.l8();
                                linkedHashMap2.put(readString2, arrayList2);
                            }
                            protocol.b6();
                            builder.c(linkedHashMap2);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v44 = protocol.v4();
                        ArrayList arrayList3 = new ArrayList(v44.f96838b);
                        int i21 = v44.f96838b;
                        while (i11 < i21) {
                            arrayList3.add(protocol.readString());
                            i11++;
                        }
                        protocol.l8();
                        builder.b(arrayList3);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v45 = protocol.v4();
                    ArrayList arrayList4 = new ArrayList(v45.f96838b);
                    int i22 = v45.f96838b;
                    while (i11 < i22) {
                        arrayList4.add(protocol.readString());
                        i11++;
                    }
                    protocol.l8();
                    builder.d(arrayList4);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczSystemInfos");
            protocol.Q6("res_dns", 1, (byte) 15);
            protocol.y2((byte) 11, struct.f63808a.size());
            Iterator<String> it = struct.f63808a.iterator();
            while (it.hasNext()) {
                protocol.p1(it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("data_dns", 2, (byte) 15);
            protocol.y2((byte) 11, struct.f63809b.size());
            Iterator<String> it2 = struct.f63809b.iterator();
            while (it2.hasNext()) {
                protocol.p1(it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("other_dns", 3, (byte) 13);
            protocol.b3((byte) 11, (byte) 15, struct.f63810c.size());
            for (Map.Entry<String, List<String>> entry : struct.f63810c.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                protocol.p1(key);
                protocol.y2((byte) 11, value.size());
                Iterator<String> it3 = value.iterator();
                while (it3.hasNext()) {
                    protocol.p1(it3.next());
                }
                protocol.i5();
            }
            protocol.W1();
            protocol.N2();
            if (struct.f63811d != null) {
                protocol.Q6("tls_dns", 4, (byte) 13);
                protocol.b3((byte) 11, (byte) 15, struct.f63811d.size());
                for (Map.Entry<String, List<String>> entry2 : struct.f63811d.entrySet()) {
                    String key2 = entry2.getKey();
                    List<String> value2 = entry2.getValue();
                    protocol.p1(key2);
                    protocol.y2((byte) 11, value2.size());
                    Iterator<String> it4 = value2.iterator();
                    while (it4.hasNext()) {
                        protocol.p1(it4.next());
                    }
                    protocol.i5();
                }
                protocol.W1();
                protocol.N2();
            }
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

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k List<String> res_dns, @m80.k List<String> data_dns, @m80.k Map<String, ? extends List<String>> other_dns, @m80.l Map<String, ? extends List<String>> map) {
        g0.p(res_dns, "res_dns");
        g0.p(data_dns, "data_dns");
        g0.p(other_dns, "other_dns");
        this.f63808a = res_dns;
        this.f63809b = data_dns;
        this.f63810c = other_dns;
        this.f63811d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i f(i iVar, List list, List list2, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = iVar.f63808a;
        }
        if ((i11 & 2) != 0) {
            list2 = iVar.f63809b;
        }
        if ((i11 & 4) != 0) {
            map = iVar.f63810c;
        }
        if ((i11 & 8) != 0) {
            map2 = iVar.f63811d;
        }
        return iVar.e(list, list2, map, map2);
    }

    @m80.k
    public final List<String> a() {
        return this.f63808a;
    }

    @m80.k
    public final List<String> b() {
        return this.f63809b;
    }

    @m80.k
    public final Map<String, List<String>> c() {
        return this.f63810c;
    }

    @m80.l
    public final Map<String, List<String>> d() {
        return this.f63811d;
    }

    @m80.k
    public final i e(@m80.k List<String> res_dns, @m80.k List<String> data_dns, @m80.k Map<String, ? extends List<String>> other_dns, @m80.l Map<String, ? extends List<String>> map) {
        g0.p(res_dns, "res_dns");
        g0.p(data_dns, "data_dns");
        g0.p(other_dns, "other_dns");
        return new i(res_dns, data_dns, other_dns, map);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return g0.g(this.f63808a, iVar.f63808a) && g0.g(this.f63809b, iVar.f63809b) && g0.g(this.f63810c, iVar.f63810c) && g0.g(this.f63811d, iVar.f63811d);
    }

    public int hashCode() {
        int hashCode = ((((this.f63808a.hashCode() * 31) + this.f63809b.hashCode()) * 31) + this.f63810c.hashCode()) * 31;
        Map<String, List<String>> map = this.f63811d;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @m80.k
    public String toString() {
        return "BczSystemInfos(res_dns=" + this.f63808a + ", data_dns=" + this.f63809b + ", other_dns=" + this.f63810c + ", tls_dns=" + this.f63811d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63807f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczSystemInfos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczSystemInfos.kt\ncom/baicizhan/biz/online/bcz_system_api/BczSystemInfos$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
    public static final class b implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public List<String> f63812a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<String> f63813b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Map<String, ? extends List<String>> f63814c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Map<String, ? extends List<String>> f63815d;

        public b() {
            this.f63812a = null;
            this.f63813b = null;
            this.f63814c = null;
            this.f63815d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            List<String> list = this.f63812a;
            if (list == null) {
                throw new IllegalStateException("Required field 'res_dns' is missing");
            }
            List<String> list2 = this.f63813b;
            if (list2 == null) {
                throw new IllegalStateException("Required field 'data_dns' is missing");
            }
            Map<String, ? extends List<String>> map = this.f63814c;
            if (map != null) {
                return new i(list, list2, map, this.f63815d);
            }
            throw new IllegalStateException("Required field 'other_dns' is missing");
        }

        @m80.k
        public final b b(@m80.k List<String> data_dns) {
            g0.p(data_dns, "data_dns");
            this.f63813b = data_dns;
            return this;
        }

        @m80.k
        public final b c(@m80.k Map<String, ? extends List<String>> other_dns) {
            g0.p(other_dns, "other_dns");
            this.f63814c = other_dns;
            return this;
        }

        @m80.k
        public final b d(@m80.k List<String> res_dns) {
            g0.p(res_dns, "res_dns");
            this.f63812a = res_dns;
            return this;
        }

        @m80.k
        public final b e(@m80.l Map<String, ? extends List<String>> map) {
            this.f63815d = map;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63812a = null;
            this.f63813b = null;
            this.f63814c = null;
            this.f63815d = null;
        }

        public b(@m80.k i source) {
            g0.p(source, "source");
            this.f63812a = source.f63808a;
            this.f63813b = source.f63809b;
            this.f63814c = source.f63810c;
            this.f63815d = source.f63811d;
        }
    }
}
