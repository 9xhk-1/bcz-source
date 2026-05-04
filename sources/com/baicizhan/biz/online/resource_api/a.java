package com.baicizhan.biz.online.resource_api;

import com.microsoft.thrifty.ThriftException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import t8.j;
import ts.e;
import w00.g;
import ws.d;
import ws.f;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f15934e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @g
    @k
    public static final ts.a<a, C0236a> f15935f = new c();

    /* renamed from: a, reason: collision with root package name */
    @g
    @k
    public final TransResultType f15936a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @g
    public final String f15937b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @g
    public final List<j> f15938c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @g
    public final Integer f15939d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a, C0236a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0236a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k C0236a builder) {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 8) {
                                builder.c(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 15) {
                            f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(j.f90089f.read(protocol));
                            }
                            protocol.l8();
                            builder.e(arrayList);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    int s82 = protocol.s8();
                    TransResultType a11 = TransResultType.Companion.a(s82);
                    if (a11 == null) {
                        throw new ThriftException(ThriftException.Kind.PROTOCOL_ERROR, "Unexpected value for enum type TransResultType: " + s82);
                    }
                    builder.d(a11);
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
            protocol.g6("TransResultV2");
            protocol.Q6("type", 1, (byte) 8);
            protocol.l5(struct.f15936a.value);
            protocol.N2();
            if (struct.f15937b != null) {
                protocol.Q6("trans", 2, (byte) 11);
                protocol.p1(struct.f15937b);
                protocol.N2();
            }
            if (struct.f15938c != null) {
                protocol.Q6(xd.a.f98002r, 3, (byte) 15);
                protocol.y2((byte) 12, struct.f15938c.size());
                Iterator<j> it = struct.f15938c.iterator();
                while (it.hasNext()) {
                    j.f90089f.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f15939d != null) {
                protocol.Q6("trans_provider", 4, (byte) 8);
                protocol.l5(struct.f15939d.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public a(@k TransResultType type, @l String str, @l List<j> list, @l Integer num) {
        g0.p(type, "type");
        this.f15936a = type;
        this.f15937b = str;
        this.f15938c = list;
        this.f15939d = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a f(a aVar, TransResultType transResultType, String str, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            transResultType = aVar.f15936a;
        }
        if ((i11 & 2) != 0) {
            str = aVar.f15937b;
        }
        if ((i11 & 4) != 0) {
            list = aVar.f15938c;
        }
        if ((i11 & 8) != 0) {
            num = aVar.f15939d;
        }
        return aVar.e(transResultType, str, list, num);
    }

    @k
    public final TransResultType a() {
        return this.f15936a;
    }

    @l
    public final String b() {
        return this.f15937b;
    }

    @l
    public final List<j> c() {
        return this.f15938c;
    }

    @l
    public final Integer d() {
        return this.f15939d;
    }

    @k
    public final a e(@k TransResultType type, @l String str, @l List<j> list, @l Integer num) {
        g0.p(type, "type");
        return new a(type, str, list, num);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15936a == aVar.f15936a && g0.g(this.f15937b, aVar.f15937b) && g0.g(this.f15938c, aVar.f15938c) && g0.g(this.f15939d, aVar.f15939d);
    }

    public int hashCode() {
        int hashCode = this.f15936a.hashCode() * 31;
        String str = this.f15937b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<j> list = this.f15938c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f15939d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        return "TransResultV2(type=" + this.f15936a + ", trans=" + this.f15937b + ", words=" + this.f15938c + ", trans_provider=" + this.f15939d + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f15935f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTransResultV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransResultV2.kt\ncom/baicizhan/biz/online/resource_api/TransResultV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    /* renamed from: com.baicizhan.biz.online.resource_api.a$a, reason: collision with other inner class name */
    public static final class C0236a implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public TransResultType f15940a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f15941b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public List<j> f15942c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f15943d;

        public C0236a() {
            this.f15940a = null;
            this.f15941b = null;
            this.f15942c = null;
            this.f15943d = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a build() {
            TransResultType transResultType = this.f15940a;
            if (transResultType != null) {
                return new a(transResultType, this.f15941b, this.f15942c, this.f15943d);
            }
            throw new IllegalStateException("Required field 'type' is missing");
        }

        @k
        public final C0236a b(@l String str) {
            this.f15941b = str;
            return this;
        }

        @k
        public final C0236a c(@l Integer num) {
            this.f15943d = num;
            return this;
        }

        @k
        public final C0236a d(@k TransResultType type) {
            g0.p(type, "type");
            this.f15940a = type;
            return this;
        }

        @k
        public final C0236a e(@l List<j> list) {
            this.f15942c = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f15940a = null;
            this.f15941b = null;
            this.f15942c = null;
            this.f15943d = null;
        }

        public C0236a(@k a source) {
            g0.p(source, "source");
            this.f15940a = source.f15936a;
            this.f15941b = source.f15937b;
            this.f15942c = source.f15938c;
            this.f15943d = source.f15939d;
        }
    }
}
