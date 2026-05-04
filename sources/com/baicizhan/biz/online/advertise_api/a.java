package com.baicizhan.biz.online.advertise_api;

import com.microsoft.thrifty.ThriftException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ts.e;
import w00.g;
import ws.d;
import ws.f;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c f15916c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @g
    @k
    public static final ts.a<a, b> f15917d = new C0234a();

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public final AdvertiseLoadingModule f15918a;

    /* renamed from: b, reason: collision with root package name */
    @g
    @k
    public final List<Integer> f15919b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.biz.online.advertise_api.a$a, reason: collision with other inner class name */
    public static final class C0234a implements ts.a<a, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k b builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                d a62 = protocol.a6();
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
                        f v42 = protocol.v4();
                        ArrayList arrayList = new ArrayList(v42.f96838b);
                        int i11 = v42.f96838b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayList.add(Integer.valueOf(protocol.s8()));
                        }
                        protocol.l8();
                        builder.a(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    int s82 = protocol.s8();
                    AdvertiseLoadingModule a11 = AdvertiseLoadingModule.Companion.a(s82);
                    if (a11 == null) {
                        throw new ThriftException(ThriftException.Kind.PROTOCOL_ERROR, "Unexpected value for enum type AdvertiseLoadingModule: " + s82);
                    }
                    builder.c(a11);
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
            protocol.g6("AdvertiseLoadingInfo");
            protocol.Q6("module_name", 1, (byte) 8);
            protocol.l5(struct.f15918a.value);
            protocol.N2();
            protocol.Q6("ad_ids", 2, (byte) 15);
            protocol.y2((byte) 8, struct.f15919b.size());
            Iterator<Integer> it = struct.f15919b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().intValue());
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

    public a(@k AdvertiseLoadingModule module_name, @k List<Integer> ad_ids) {
        g0.p(module_name, "module_name");
        g0.p(ad_ids, "ad_ids");
        this.f15918a = module_name;
        this.f15919b = ad_ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, AdvertiseLoadingModule advertiseLoadingModule, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            advertiseLoadingModule = aVar.f15918a;
        }
        if ((i11 & 2) != 0) {
            list = aVar.f15919b;
        }
        return aVar.c(advertiseLoadingModule, list);
    }

    @k
    public final AdvertiseLoadingModule a() {
        return this.f15918a;
    }

    @k
    public final List<Integer> b() {
        return this.f15919b;
    }

    @k
    public final a c(@k AdvertiseLoadingModule module_name, @k List<Integer> ad_ids) {
        g0.p(module_name, "module_name");
        g0.p(ad_ids, "ad_ids");
        return new a(module_name, ad_ids);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15918a == aVar.f15918a && g0.g(this.f15919b, aVar.f15919b);
    }

    public int hashCode() {
        return (this.f15918a.hashCode() * 31) + this.f15919b.hashCode();
    }

    @k
    public String toString() {
        return "AdvertiseLoadingInfo(module_name=" + this.f15918a + ", ad_ids=" + this.f15919b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f15917d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdvertiseLoadingInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertiseLoadingInfo.kt\ncom/baicizhan/biz/online/advertise_api/AdvertiseLoadingInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1#2:144\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public AdvertiseLoadingModule f15920a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public List<Integer> f15921b;

        public b() {
            this.f15920a = null;
            this.f15921b = null;
        }

        @k
        public final b a(@k List<Integer> ad_ids) {
            g0.p(ad_ids, "ad_ids");
            this.f15921b = ad_ids;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a build() {
            AdvertiseLoadingModule advertiseLoadingModule = this.f15920a;
            if (advertiseLoadingModule == null) {
                throw new IllegalStateException("Required field 'module_name' is missing");
            }
            List<Integer> list = this.f15921b;
            if (list != null) {
                return new a(advertiseLoadingModule, list);
            }
            throw new IllegalStateException("Required field 'ad_ids' is missing");
        }

        @k
        public final b c(@k AdvertiseLoadingModule module_name) {
            g0.p(module_name, "module_name");
            this.f15920a = module_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f15920a = null;
            this.f15921b = null;
        }

        public b(@k a source) {
            g0.p(source, "source");
            this.f15920a = source.f15918a;
            this.f15921b = source.f15919b;
        }
    }
}
