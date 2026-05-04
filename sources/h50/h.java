package h50;

import a00.a0;
import a00.a1;
import a00.i0;
import a00.l1;
import a00.r0;
import j50.g2;
import j50.n2;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,393:1\n37#2:394\n36#2,3:395\n37#2:398\n36#2,3:399\n1563#3:402\n1634#3,3:403\n16#4:406\n16#4:407\n16#4:408\n21#4:409\n107#5,10:410\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n368#1:394\n368#1:395,3\n370#1:398\n370#1:399,3\n372#1:402\n372#1:403,3\n376#1:406\n378#1:407\n379#1:408\n380#1:409\n383#1:410,10\n*E\n"})
/* loaded from: classes8.dex */
public final class h implements f, j50.n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58521a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final m f58522b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58523c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Annotation> f58524d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Set<String> f58525e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String[] f58526f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final f[] f58527g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final List<Annotation>[] f58528h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final boolean[] f58529i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final Map<String, Integer> f58530j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final f[] f58531k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final c0 f58532l;

    public h(@m80.k String serialName, @m80.k m kind, int i11, @m80.k List<? extends f> typeParameters, @m80.k a builder) {
        g0.p(serialName, "serialName");
        g0.p(kind, "kind");
        g0.p(typeParameters, "typeParameters");
        g0.p(builder, "builder");
        this.f58521a = serialName;
        this.f58522b = kind;
        this.f58523c = i11;
        this.f58524d = builder.c();
        this.f58525e = r0.Y5(builder.g());
        String[] strArr = (String[]) builder.g().toArray(new String[0]);
        this.f58526f = strArr;
        this.f58527g = g2.e(builder.f());
        this.f58528h = (List[]) builder.e().toArray(new List[0]);
        this.f58529i = r0.S5(builder.h());
        Iterable<a1> Yz = a0.Yz(strArr);
        ArrayList arrayList = new ArrayList(i0.d0(Yz, 10));
        for (a1 a1Var : Yz) {
            arrayList.add(h1.a(a1Var.f(), Integer.valueOf(a1Var.e())));
        }
        this.f58530j = l1.B0(arrayList);
        this.f58531k = g2.e(typeParameters);
        this.f58532l = e0.c(new x00.a() { // from class: h50.g
            @Override // x00.a
            public final Object invoke() {
                int n11;
                n11 = h.n(h.this);
                return Integer.valueOf(n11);
            }
        });
    }

    public static final int n(h hVar) {
        return n2.c(hVar, hVar.f58531k);
    }

    @Override // j50.n
    @m80.k
    public Set<String> a() {
        return this.f58525e;
    }

    @Override // h50.f
    public boolean b() {
        return super.b();
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        g0.p(name, "name");
        Integer num = this.f58530j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // h50.f
    @m80.k
    public f e(int i11) {
        return this.f58527g[i11];
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        f fVar = (f) obj;
        if (!g0.g(k(), fVar.k()) || !Arrays.equals(this.f58531k, ((h) obj).f58531k) || h() != fVar.h()) {
            return false;
        }
        int h11 = h();
        for (int i11 = 0; i11 < h11; i11++) {
            if (!g0.g(e(i11).k(), fVar.e(i11).k()) || !g0.g(e(i11).getKind(), fVar.e(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return this.f58524d;
    }

    @Override // h50.f
    @m80.k
    public m getKind() {
        return this.f58522b;
    }

    @Override // h50.f
    public int h() {
        return this.f58523c;
    }

    public int hashCode() {
        return o();
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        return this.f58526f[i11];
    }

    @Override // h50.f
    public boolean isInline() {
        return super.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        return this.f58528h[i11];
    }

    @Override // h50.f
    @m80.k
    public String k() {
        return this.f58521a;
    }

    @Override // h50.f
    public boolean l(int i11) {
        return this.f58529i[i11];
    }

    public final int o() {
        return ((Number) this.f58532l.getValue()).intValue();
    }

    @m80.k
    public String toString() {
        return n2.d(this);
    }
}
