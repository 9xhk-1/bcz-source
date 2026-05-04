package l50;

import com.baicizhan.client.business.dataset.provider.a;
import h50.m;
import h50.n;
import kotlin.KotlinNothingValueException;
import yz.c2;
import yz.g2;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,279:1\n21#2,12:280\n35#2,15:293\n1#3:292\n36#4,9:308\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n83#1:280,12\n83#1:293,15\n83#1:292\n153#1:308,9\n*E\n"})
/* loaded from: classes8.dex */
public abstract class e extends j50.t1 implements k50.x {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k50.a f69974b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<k50.k, g2> f69975c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final k50.g f69976d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public String f69977e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public String f69978f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends i50.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f69980b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h50.f f69981c;

        public a(String str, h50.f fVar) {
            this.f69980b = str;
            this.f69981c = fVar;
        }

        @Override // i50.b, i50.h
        public void encodeString(String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            e.this.e0(this.f69980b, new k50.b0(value, false, this.f69981c));
        }

        @Override // i50.h, i50.e
        public o50.f getSerializersModule() {
            return e.this.a().getSerializersModule();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends i50.b {

        /* renamed from: a, reason: collision with root package name */
        public final o50.f f69982a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f69984c;

        public b(String str) {
            this.f69984c = str;
            this.f69982a = e.this.a().getSerializersModule();
        }

        @Override // i50.b, i50.h
        public void encodeByte(byte b11) {
            m(yz.o1.f0(yz.o1.i(b11)));
        }

        @Override // i50.b, i50.h
        public void encodeInt(int i11) {
            m(f.a(yz.s1.i(i11)));
        }

        @Override // i50.b, i50.h
        public void encodeLong(long j11) {
            String a11;
            a11 = k50.n.a(w1.i(j11), 10);
            m(a11);
        }

        @Override // i50.b, i50.h
        public void encodeShort(short s11) {
            m(c2.f0(c2.i(s11)));
        }

        @Override // i50.h, i50.e
        public o50.f getSerializersModule() {
            return this.f69982a;
        }

        public final void m(String s11) {
            kotlin.jvm.internal.g0.p(s11, "s");
            e.this.e0(this.f69984c, new k50.b0(s11, false, null, 4, null));
        }
    }

    public /* synthetic */ e(k50.a aVar, x00.l lVar, kotlin.jvm.internal.v vVar) {
        this(aVar, lVar);
    }

    public static final g2 M(e eVar, k50.k node) {
        kotlin.jvm.internal.g0.p(node, "node");
        eVar.e0(eVar.C(), node);
        return g2.f100423a;
    }

    @Override // j50.i3
    public void B(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        this.f69975c.invoke(a0());
    }

    @Override // j50.t1
    @m80.k
    public String H(@m80.k String parentName, @m80.k String childName) {
        kotlin.jvm.internal.g0.p(parentName, "parentName");
        kotlin.jvm.internal.g0.p(childName, "childName");
        return childName;
    }

    @Override // j50.t1
    @m80.k
    public String I(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return p0.i(descriptor, this.f69974b, i11);
    }

    @Override // j50.i3
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void n(@m80.k String tag, boolean z11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.b(Boolean.valueOf(z11)));
    }

    @Override // j50.i3
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void o(@m80.k String tag, byte b11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.c(Byte.valueOf(b11)));
    }

    @Override // j50.i3
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void p(@m80.k String tag, char c11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.d(String.valueOf(c11)));
    }

    @Override // j50.i3
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void q(@m80.k String tag, double d11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.c(Double.valueOf(d11)));
        if (!this.f69976d.c() && Math.abs(d11) > Double.MAX_VALUE) {
            throw i0.c(Double.valueOf(d11), tag, a0().toString());
        }
    }

    @Override // j50.i3
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void r(@m80.k String tag, @m80.k h50.f enumDescriptor, int i11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        e0(tag, k50.o.d(enumDescriptor.i(i11)));
    }

    @Override // j50.i3
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k String tag, float f11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.c(Float.valueOf(f11)));
        if (!this.f69976d.c() && Math.abs(f11) > Float.MAX_VALUE) {
            throw i0.c(Float.valueOf(f11), tag, a0().toString());
        }
    }

    @Override // j50.i3
    @m80.k
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public i50.h t(@m80.k String tag, @m80.k h50.f inlineDescriptor) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(inlineDescriptor, "inlineDescriptor");
        return m1.b(inlineDescriptor) ? d0(tag) : m1.a(inlineDescriptor) ? c0(tag, inlineDescriptor) : super.t(tag, inlineDescriptor);
    }

    @Override // j50.i3
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void u(@m80.k String tag, int i11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.c(Integer.valueOf(i11)));
    }

    @Override // j50.i3
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void v(@m80.k String tag, long j11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.c(Long.valueOf(j11)));
    }

    @Override // j50.i3
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void x(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.f0.INSTANCE);
    }

    @Override // j50.i3
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void y(@m80.k String tag, short s11) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        e0(tag, k50.o.c(Short.valueOf(s11)));
    }

    @Override // j50.i3
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k String tag, @m80.k String value) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(value, "value");
        e0(tag, k50.o.d(value));
    }

    @Override // j50.i3
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void A(@m80.k String tag, @m80.k Object value) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(value, "value");
        e0(tag, k50.o.d(value.toString()));
    }

    @Override // k50.x
    @m80.k
    public final k50.a a() {
        return this.f69974b;
    }

    @m80.k
    public abstract k50.k a0();

    @m80.k
    public final x00.l<k50.k, g2> b0() {
        return this.f69975c;
    }

    @Override // j50.i3, i50.h
    @m80.k
    public i50.e beginStructure(@m80.k h50.f descriptor) {
        e a1Var;
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        x00.l<k50.k, g2> lVar = D() == null ? this.f69975c : new x00.l() { // from class: l50.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 M;
                M = e.M(e.this, (k50.k) obj);
                return M;
            }
        };
        h50.m kind = descriptor.getKind();
        if (kotlin.jvm.internal.g0.g(kind, n.b.f58542a) || (kind instanceof h50.d)) {
            a1Var = new a1(this.f69974b, lVar);
        } else if (kotlin.jvm.internal.g0.g(kind, n.c.f58543a)) {
            k50.a aVar = this.f69974b;
            h50.f a11 = v1.a(descriptor.e(0), aVar.getSerializersModule());
            h50.m kind2 = a11.getKind();
            if ((kind2 instanceof h50.e) || kotlin.jvm.internal.g0.g(kind2, m.b.f58540a)) {
                a1Var = new c1(this.f69974b, lVar);
            } else {
                if (!aVar.i().d()) {
                    throw i0.d(a11);
                }
                a1Var = new a1(this.f69974b, lVar);
            }
        } else {
            a1Var = new y0(this.f69974b, lVar);
        }
        String str = this.f69977e;
        if (str != null) {
            if (a1Var instanceof c1) {
                c1 c1Var = (c1) a1Var;
                c1Var.e0(a.d.C0245a.f16161a, k50.o.d(str));
                String str2 = this.f69978f;
                if (str2 == null) {
                    str2 = descriptor.k();
                }
                c1Var.e0("value", k50.o.d(str2));
            } else {
                String str3 = this.f69978f;
                if (str3 == null) {
                    str3 = descriptor.k();
                }
                a1Var.e0(str, k50.o.d(str3));
            }
            this.f69977e = null;
            this.f69978f = null;
        }
        return a1Var;
    }

    public final a c0(String str, h50.f fVar) {
        return new a(str, fVar);
    }

    @Override // k50.x
    public void d(@m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        if (this.f69977e == null || (element instanceof k50.i0)) {
            encodeSerializableValue(k50.v.f65976a, element);
        } else {
            e1.f(this.f69978f, element);
            throw new KotlinNothingValueException();
        }
    }

    @r1
    public final b d0(String str) {
        return new b(str);
    }

    public abstract void e0(@m80.k String str, @m80.k k50.k kVar);

    @Override // j50.i3, i50.h
    @m80.k
    public i50.h encodeInline(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (D() == null) {
            return new s0(this.f69974b, this.f69975c).encodeInline(descriptor);
        }
        if (this.f69977e != null) {
            this.f69978f = descriptor.k();
        }
        return super.encodeInline(descriptor);
    }

    @Override // j50.i3, i50.h
    public void encodeNull() {
        String D = D();
        if (D == null) {
            this.f69975c.invoke(k50.f0.INSTANCE);
        } else {
            x(D);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (a().i().h() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (kotlin.jvm.internal.g0.g(r1, h50.n.d.f58544a) == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j50.i3, i50.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void encodeSerializableValue(@m80.k f50.b0<? super T> r4, T r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r0 = r3.D()
            if (r0 != 0) goto L2b
            h50.f r0 = r4.a()
            o50.f r1 = r3.getSerializersModule()
            h50.f r0 = l50.v1.a(r0, r1)
            boolean r0 = l50.u1.b(r0)
            if (r0 != 0) goto L1e
            goto L2b
        L1e:
            l50.s0 r0 = new l50.s0
            k50.a r1 = r3.f69974b
            x00.l<k50.k, yz.g2> r2 = r3.f69975c
            r0.<init>(r1, r2)
            r0.encodeSerializableValue(r4, r5)
            return
        L2b:
            k50.a r0 = r3.a()
            k50.g r0 = r0.i()
            boolean r0 = r0.v()
            if (r0 == 0) goto L3d
            r4.b(r3, r5)
            return
        L3d:
            boolean r0 = r4 instanceof j50.b
            if (r0 == 0) goto L52
            k50.a r1 = r3.a()
            k50.g r1 = r1.i()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L9a
            goto L87
        L52:
            k50.a r1 = r3.a()
            k50.g r1 = r1.i()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h()
            int[] r2 = l50.e1.a.f69987a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L9a
            r2 = 2
            if (r1 == r2) goto L9a
            r2 = 3
            if (r1 != r2) goto L94
            h50.f r1 = r4.a()
            h50.m r1 = r1.getKind()
            h50.n$a r2 = h50.n.a.f58541a
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 != 0) goto L87
            h50.n$d r2 = h50.n.d.f58544a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L9a
        L87:
            h50.f r1 = r4.a()
            k50.a r2 = r3.a()
            java.lang.String r1 = l50.e1.c(r1, r2)
            goto L9b
        L94:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L9a:
            r1 = 0
        L9b:
            if (r0 == 0) goto Le1
            r0 = r4
            j50.b r0 = (j50.b) r0
            if (r5 == 0) goto Lbd
            f50.b0 r0 = f50.p.b(r0, r3, r5)
            if (r1 == 0) goto Lb6
            l50.e1.a(r4, r0, r1)
            h50.f r4 = r0.a()
            h50.m r4 = r4.getKind()
            l50.e1.b(r4)
        Lb6:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.g0.n(r0, r4)
            r4 = r0
            goto Le1
        Lbd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            h50.f r5 = r0.a()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Le1:
            if (r1 == 0) goto Lef
            h50.f r0 = r4.a()
            java.lang.String r0 = r0.k()
            r3.f69977e = r1
            r3.f69978f = r0
        Lef:
            r4.b(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.e.encodeSerializableValue(f50.b0, java.lang.Object):void");
    }

    @Override // j50.i3, i50.h, i50.e
    @m80.k
    public final o50.f getSerializersModule() {
        return this.f69974b.getSerializersModule();
    }

    @Override // j50.i3, i50.e
    public boolean shouldEncodeElementDefault(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return this.f69976d.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(k50.a aVar, x00.l<? super k50.k, g2> lVar) {
        this.f69974b = aVar;
        this.f69975c = lVar;
        this.f69976d = aVar.i();
    }

    @Override // j50.i3, i50.h
    public void encodeNotNullMark() {
    }
}
