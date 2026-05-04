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
public final class l implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f63838e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f63839f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f63840a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<Integer> f63841b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63842c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Map<Integer, String> f63843d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 13) {
                                ws.g O = protocol.O();
                                LinkedHashMap linkedHashMap = new LinkedHashMap(O.f96841c);
                                int i12 = O.f96841c;
                                while (i11 < i12) {
                                    int s82 = protocol.s8();
                                    linkedHashMap.put(Integer.valueOf(s82), protocol.readString());
                                    i11++;
                                }
                                protocol.b6();
                                builder.b(linkedHashMap);
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 15) {
                        ws.f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i13 = v42.f96838b;
                        while (i11 < i13) {
                            arrayList.add(Integer.valueOf(protocol.s8()));
                            i11++;
                        }
                        protocol.l8();
                        builder.a(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
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
            protocol.g6("GuideForNewStrategy");
            protocol.Q6("user_group", 1, (byte) 8);
            protocol.l5(struct.f63840a);
            protocol.N2();
            protocol.Q6("actionSequence", 2, (byte) 15);
            protocol.y2((byte) 8, struct.f63841b.size());
            Iterator<Integer> it = struct.f63841b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
            }
            protocol.i5();
            protocol.N2();
            if (struct.f63842c != null) {
                protocol.Q6("role_strategy", 3, (byte) 8);
                protocol.l5(struct.f63842c.intValue());
                protocol.N2();
            }
            if (struct.f63843d != null) {
                protocol.Q6("action_urls", 4, (byte) 13);
                protocol.b3((byte) 8, (byte) 11, struct.f63843d.size());
                for (Map.Entry<Integer, String> entry : struct.f63843d.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    String value = entry.getValue();
                    protocol.l5(intValue);
                    protocol.p1(value);
                }
                protocol.W1();
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public l(int i11, @m80.k List<Integer> actionSequence, @m80.l Integer num, @m80.l Map<Integer, String> map) {
        g0.p(actionSequence, "actionSequence");
        this.f63840a = i11;
        this.f63841b = actionSequence;
        this.f63842c = num;
        this.f63843d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l f(l lVar, int i11, List list, Integer num, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lVar.f63840a;
        }
        if ((i12 & 2) != 0) {
            list = lVar.f63841b;
        }
        if ((i12 & 4) != 0) {
            num = lVar.f63842c;
        }
        if ((i12 & 8) != 0) {
            map = lVar.f63843d;
        }
        return lVar.e(i11, list, num, map);
    }

    public final int a() {
        return this.f63840a;
    }

    @m80.k
    public final List<Integer> b() {
        return this.f63841b;
    }

    @m80.l
    public final Integer c() {
        return this.f63842c;
    }

    @m80.l
    public final Map<Integer, String> d() {
        return this.f63843d;
    }

    @m80.k
    public final l e(int i11, @m80.k List<Integer> actionSequence, @m80.l Integer num, @m80.l Map<Integer, String> map) {
        g0.p(actionSequence, "actionSequence");
        return new l(i11, actionSequence, num, map);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f63840a == lVar.f63840a && g0.g(this.f63841b, lVar.f63841b) && g0.g(this.f63842c, lVar.f63842c) && g0.g(this.f63843d, lVar.f63843d);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f63840a) * 31) + this.f63841b.hashCode()) * 31;
        Integer num = this.f63842c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<Integer, String> map = this.f63843d;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "GuideForNewStrategy(user_group=" + this.f63840a + ", actionSequence=" + this.f63841b + ", role_strategy=" + this.f63842c + ", action_urls=" + this.f63843d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63839f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGuideForNewStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideForNewStrategy.kt\ncom/baicizhan/biz/online/bcz_system_api/GuideForNewStrategy$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f63844a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public List<Integer> f63845b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f63846c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Map<Integer, String> f63847d;

        public a() {
            this.f63844a = null;
            this.f63845b = null;
            this.f63846c = null;
            this.f63847d = null;
        }

        @m80.k
        public final a a(@m80.k List<Integer> actionSequence) {
            g0.p(actionSequence, "actionSequence");
            this.f63845b = actionSequence;
            return this;
        }

        @m80.k
        public final a b(@m80.l Map<Integer, String> map) {
            this.f63847d = map;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l build() {
            Integer num = this.f63844a;
            if (num == null) {
                throw new IllegalStateException("Required field 'user_group' is missing");
            }
            int intValue = num.intValue();
            List<Integer> list = this.f63845b;
            if (list != null) {
                return new l(intValue, list, this.f63846c, this.f63847d);
            }
            throw new IllegalStateException("Required field 'actionSequence' is missing");
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f63846c = num;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f63844a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63844a = null;
            this.f63845b = null;
            this.f63846c = null;
            this.f63847d = null;
        }

        public a(@m80.k l source) {
            g0.p(source, "source");
            this.f63844a = Integer.valueOf(source.f63840a);
            this.f63845b = source.f63841b;
            this.f63846c = source.f63842c;
            this.f63847d = source.f63843d;
        }
    }
}
