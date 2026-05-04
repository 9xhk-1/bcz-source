package com.baicizhan.biz.online.user_study_api;

import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
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
    public static final b f15972c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @g
    @k
    public static final ts.a<a, C0238a> f15973d = new c();

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public final String f15974a;

    /* renamed from: b, reason: collision with root package name */
    @g
    @k
    public final List<ModuleResourceType> f15975b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a, C0238a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0238a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k C0238a builder) {
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
                            int s82 = protocol.s8();
                            ModuleResourceType a11 = ModuleResourceType.Companion.a(s82);
                            if (a11 == null) {
                                throw new ThriftException(ThriftException.Kind.PROTOCOL_ERROR, "Unexpected value for enum type ModuleResourceType: " + s82);
                            }
                            arrayList.add(a11);
                        }
                        protocol.l8();
                        builder.b(arrayList);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
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
            protocol.g6("TrainPageResource");
            protocol.Q6("module_name", 1, (byte) 11);
            protocol.p1(struct.f15974a);
            protocol.N2();
            protocol.Q6(WordErrorFeedbackActivity.f18460k, 2, (byte) 15);
            protocol.y2((byte) 8, struct.f15975b.size());
            Iterator<ModuleResourceType> it = struct.f15975b.iterator();
            while (it.hasNext()) {
                protocol.l5(it.next().value);
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String module_name, @k List<? extends ModuleResourceType> items) {
        g0.p(module_name, "module_name");
        g0.p(items, "items");
        this.f15974a = module_name;
        this.f15975b = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f15974a;
        }
        if ((i11 & 2) != 0) {
            list = aVar.f15975b;
        }
        return aVar.c(str, list);
    }

    @k
    public final String a() {
        return this.f15974a;
    }

    @k
    public final List<ModuleResourceType> b() {
        return this.f15975b;
    }

    @k
    public final a c(@k String module_name, @k List<? extends ModuleResourceType> items) {
        g0.p(module_name, "module_name");
        g0.p(items, "items");
        return new a(module_name, items);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f15974a, aVar.f15974a) && g0.g(this.f15975b, aVar.f15975b);
    }

    public int hashCode() {
        return (this.f15974a.hashCode() * 31) + this.f15975b.hashCode();
    }

    @k
    public String toString() {
        return "TrainPageResource(module_name=" + this.f15974a + ", items=" + this.f15975b + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f15973d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTrainPageResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainPageResource.kt\ncom/baicizhan/biz/online/user_study_api/TrainPageResource$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
    /* renamed from: com.baicizhan.biz.online.user_study_api.a$a, reason: collision with other inner class name */
    public static final class C0238a implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f15976a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public List<? extends ModuleResourceType> f15977b;

        public C0238a() {
            this.f15976a = null;
            this.f15977b = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            String str = this.f15976a;
            if (str == null) {
                throw new IllegalStateException("Required field 'module_name' is missing");
            }
            List<? extends ModuleResourceType> list = this.f15977b;
            if (list != null) {
                return new a(str, list);
            }
            throw new IllegalStateException("Required field 'items' is missing");
        }

        @k
        public final C0238a b(@k List<? extends ModuleResourceType> items) {
            g0.p(items, "items");
            this.f15977b = items;
            return this;
        }

        @k
        public final C0238a c(@k String module_name) {
            g0.p(module_name, "module_name");
            this.f15976a = module_name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f15976a = null;
            this.f15977b = null;
        }

        public C0238a(@k a source) {
            g0.p(source, "source");
            this.f15976a = source.f15974a;
            this.f15977b = source.f15975b;
        }
    }
}
