package j50;

import h50.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n16#2:135\n21#2:136\n16#2:137\n16#2:138\n107#3,10:139\n11228#4:149\n11563#4,3:150\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n40#1:149\n40#1:150,3\n*E\n"})
/* loaded from: classes8.dex */
public class l2 implements h50.f, n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f63408a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final p0<?> f63409b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63410c;

    /* renamed from: d, reason: collision with root package name */
    public int f63411d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String[] f63412e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<Annotation>[] f63413f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public List<Annotation> f63414g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final boolean[] f63415h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public Map<String, Integer> f63416i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63417j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63418k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63419l;

    public l2(@m80.k String serialName, @m80.l p0<?> p0Var, int i11) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        this.f63408a = serialName;
        this.f63409b = p0Var;
        this.f63410c = i11;
        this.f63411d = -1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.f63412e = strArr;
        int i13 = this.f63410c;
        this.f63413f = new List[i13];
        this.f63415h = new boolean[i13];
        this.f63416i = a00.l1.z();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f63417j = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: j50.i2
            @Override // x00.a
            public final Object invoke() {
                f50.i[] t11;
                t11 = l2.t(l2.this);
                return t11;
            }
        });
        this.f63418k = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: j50.j2
            @Override // x00.a
            public final Object invoke() {
                h50.f[] z11;
                z11 = l2.z(l2.this);
                return z11;
            }
        });
        this.f63419l = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: j50.k2
            @Override // x00.a
            public final Object invoke() {
                int p11;
                p11 = l2.p(l2.this);
                return Integer.valueOf(p11);
            }
        });
    }

    public static final int p(l2 l2Var) {
        return n2.c(l2Var, l2Var.v());
    }

    public static /* synthetic */ void r(l2 l2Var, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        l2Var.q(str, z11);
    }

    public static final f50.i[] t(l2 l2Var) {
        f50.i<?>[] f11;
        p0<?> p0Var = l2Var.f63409b;
        return (p0Var == null || (f11 = p0Var.f()) == null) ? o2.f63442a : f11;
    }

    private final int w() {
        return ((Number) this.f63419l.getValue()).intValue();
    }

    public static final h50.f[] z(l2 l2Var) {
        ArrayList arrayList;
        f50.i<?>[] c11;
        p0<?> p0Var = l2Var.f63409b;
        if (p0Var == null || (c11 = p0Var.c()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(c11.length);
            for (f50.i<?> iVar : c11) {
                arrayList.add(iVar.a());
            }
        }
        return g2.e(arrayList);
    }

    @Override // j50.n
    @m80.k
    public Set<String> a() {
        return this.f63416i.keySet();
    }

    @Override // h50.f
    public boolean b() {
        return super.b();
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        Integer num = this.f63416i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // h50.f
    @m80.k
    public h50.f e(int i11) {
        return u()[i11].a();
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        h50.f fVar = (h50.f) obj;
        if (!kotlin.jvm.internal.g0.g(k(), fVar.k()) || !Arrays.equals(v(), ((l2) obj).v()) || h() != fVar.h()) {
            return false;
        }
        int h11 = h();
        for (int i11 = 0; i11 < h11; i11++) {
            if (!kotlin.jvm.internal.g0.g(e(i11).k(), fVar.e(i11).k()) || !kotlin.jvm.internal.g0.g(e(i11).getKind(), fVar.e(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f63414g;
        return list == null ? a00.h0.J() : list;
    }

    @Override // h50.f
    @m80.k
    public h50.m getKind() {
        return n.a.f58541a;
    }

    @Override // h50.f
    public final int h() {
        return this.f63410c;
    }

    public int hashCode() {
        return w();
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        return this.f63412e[i11];
    }

    @Override // h50.f
    public boolean isInline() {
        return super.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        List<Annotation> list = this.f63413f[i11];
        return list == null ? a00.h0.J() : list;
    }

    @Override // h50.f
    @m80.k
    public String k() {
        return this.f63408a;
    }

    @Override // h50.f
    public boolean l(int i11) {
        return this.f63415h[i11];
    }

    public final void q(@m80.k String name, boolean z11) {
        kotlin.jvm.internal.g0.p(name, "name");
        String[] strArr = this.f63412e;
        int i11 = this.f63411d + 1;
        this.f63411d = i11;
        strArr[i11] = name;
        this.f63415h[i11] = z11;
        this.f63413f[i11] = null;
        if (i11 == this.f63410c - 1) {
            this.f63416i = s();
        }
    }

    public final Map<String, Integer> s() {
        HashMap hashMap = new HashMap();
        int length = this.f63412e.length;
        for (int i11 = 0; i11 < length; i11++) {
            hashMap.put(this.f63412e[i11], Integer.valueOf(i11));
        }
        return hashMap;
    }

    @m80.k
    public String toString() {
        return n2.d(this);
    }

    public final f50.i<?>[] u() {
        return (f50.i[]) this.f63417j.getValue();
    }

    @m80.k
    public final h50.f[] v() {
        return (h50.f[]) this.f63418k.getValue();
    }

    public final void x(@m80.k Annotation annotation) {
        kotlin.jvm.internal.g0.p(annotation, "annotation");
        List<Annotation> list = this.f63413f[this.f63411d];
        if (list == null) {
            list = new ArrayList<>(1);
            this.f63413f[this.f63411d] = list;
        }
        list.add(annotation);
    }

    public final void y(@m80.k Annotation a11) {
        kotlin.jvm.internal.g0.p(a11, "a");
        if (this.f63414g == null) {
            this.f63414g = new ArrayList(1);
        }
        List<Annotation> list = this.f63414g;
        kotlin.jvm.internal.g0.m(list);
        list.add(a11);
    }

    public /* synthetic */ l2(String str, p0 p0Var, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(str, (i12 & 2) != 0 ? null : p0Var, i11);
    }
}
