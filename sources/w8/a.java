package w8;

import com.baicizhan.client.business.util.navigate.NavigationIntentInfoKt;
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

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f95695e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<a, C1284a> f95696f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final List<d> f95697a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f95698b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f95699c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final w8.b f95700d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a, C1284a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C1284a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k C1284a builder) {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 12) {
                                builder.c(w8.b.f95706d.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.a(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 15) {
                    ws.f v42 = protocol.v4();
                    ArrayList arrayList = new ArrayList(v42.f96838b);
                    int i11 = v42.f96838b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(d.f95720f.read(protocol));
                    }
                    protocol.l8();
                    builder.e(arrayList);
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
            protocol.g6("ExportActivityInfo");
            protocol.Q6("template_infos", 1, (byte) 15);
            protocol.y2((byte) 12, struct.f95697a.size());
            Iterator<d> it = struct.f95697a.iterator();
            while (it.hasNext()) {
                d.f95720f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("balance", 2, (byte) 8);
            protocol.l5(struct.f95698b);
            protocol.N2();
            protocol.Q6(NavigationIntentInfoKt.KEY_ACTIVITY_URL, 3, (byte) 11);
            protocol.p1(struct.f95699c);
            protocol.N2();
            if (struct.f95700d != null) {
                protocol.Q6("banner", 4, (byte) 12);
                w8.b.f95706d.write(protocol, struct.f95700d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public a(@k List<d> template_infos, int i11, @k String activity_url, @l w8.b bVar) {
        g0.p(template_infos, "template_infos");
        g0.p(activity_url, "activity_url");
        this.f95697a = template_infos;
        this.f95698b = i11;
        this.f95699c = activity_url;
        this.f95700d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a f(a aVar, List list, int i11, String str, w8.b bVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = aVar.f95697a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f95698b;
        }
        if ((i12 & 4) != 0) {
            str = aVar.f95699c;
        }
        if ((i12 & 8) != 0) {
            bVar = aVar.f95700d;
        }
        return aVar.e(list, i11, str, bVar);
    }

    @k
    public final List<d> a() {
        return this.f95697a;
    }

    public final int b() {
        return this.f95698b;
    }

    @k
    public final String c() {
        return this.f95699c;
    }

    @l
    public final w8.b d() {
        return this.f95700d;
    }

    @k
    public final a e(@k List<d> template_infos, int i11, @k String activity_url, @l w8.b bVar) {
        g0.p(template_infos, "template_infos");
        g0.p(activity_url, "activity_url");
        return new a(template_infos, i11, activity_url, bVar);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f95697a, aVar.f95697a) && this.f95698b == aVar.f95698b && g0.g(this.f95699c, aVar.f95699c) && g0.g(this.f95700d, aVar.f95700d);
    }

    public int hashCode() {
        int hashCode = ((((this.f95697a.hashCode() * 31) + Integer.hashCode(this.f95698b)) * 31) + this.f95699c.hashCode()) * 31;
        w8.b bVar = this.f95700d;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    @k
    public String toString() {
        return "ExportActivityInfo(template_infos=" + this.f95697a + ", balance=" + this.f95698b + ", activity_url=" + this.f95699c + ", banner=" + this.f95700d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f95696f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExportActivityInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportActivityInfo.kt\ncom/baicizhan/biz/online/user_activity_api/ExportActivityInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
    /* renamed from: w8.a$a, reason: collision with other inner class name */
    public static final class C1284a implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public List<d> f95701a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public Integer f95702b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f95703c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public w8.b f95704d;

        public C1284a() {
            this.f95701a = null;
            this.f95702b = null;
            this.f95703c = null;
            this.f95704d = null;
        }

        @k
        public final C1284a a(@k String activity_url) {
            g0.p(activity_url, "activity_url");
            this.f95703c = activity_url;
            return this;
        }

        @k
        public final C1284a b(int i11) {
            this.f95702b = Integer.valueOf(i11);
            return this;
        }

        @k
        public final C1284a c(@l w8.b bVar) {
            this.f95704d = bVar;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a build() {
            List<d> list = this.f95701a;
            if (list == null) {
                throw new IllegalStateException("Required field 'template_infos' is missing");
            }
            Integer num = this.f95702b;
            if (num == null) {
                throw new IllegalStateException("Required field 'balance' is missing");
            }
            int intValue = num.intValue();
            String str = this.f95703c;
            if (str != null) {
                return new a(list, intValue, str, this.f95704d);
            }
            throw new IllegalStateException("Required field 'activity_url' is missing");
        }

        @k
        public final C1284a e(@k List<d> template_infos) {
            g0.p(template_infos, "template_infos");
            this.f95701a = template_infos;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f95701a = null;
            this.f95702b = null;
            this.f95703c = null;
            this.f95704d = null;
        }

        public C1284a(@k a source) {
            g0.p(source, "source");
            this.f95701a = source.f95697a;
            this.f95702b = Integer.valueOf(source.f95698b);
            this.f95703c = source.f95699c;
            this.f95704d = source.f95700d;
        }
    }
}
