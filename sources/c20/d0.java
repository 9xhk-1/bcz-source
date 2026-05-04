package c20;

import a00.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import n20.b;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyJavaPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1611#2,9:98\n1863#2:107\n1864#2:110\n1620#2:111\n1557#2:112\n1628#2,3:113\n1#3:108\n1#3:109\n*S KotlinDebug\n*F\n+ 1 LazyJavaPackageFragment.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageFragment\n*L\n47#1:98,9\n47#1:107\n47#1:110\n47#1:111\n56#1:112\n56#1:113,3\n47#1:109\n*E\n"})
/* loaded from: classes8.dex */
public final class d0 extends s10.h0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f7529o = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(d0.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(d0.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final f20.u f7530g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final b20.k f7531h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final m20.e f7532i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final d30.i f7533j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final f f7534k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final d30.i<List<n20.c>> f7535l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final q10.g f7536m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final d30.i f7537n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7538a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7538a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@m80.k b20.k outerContext, @m80.k f20.u jPackage) {
        super(outerContext.d(), jPackage.d());
        kotlin.jvm.internal.g0.p(outerContext, "outerContext");
        kotlin.jvm.internal.g0.p(jPackage, "jPackage");
        this.f7530g = jPackage;
        b20.k f11 = b20.c.f(outerContext, this, null, 0, 6, null);
        this.f7531h = f11;
        this.f7532i = o30.c.a(outerContext.a().b().f().g());
        this.f7533j = f11.e().f(new a0(this));
        this.f7534k = new f(f11, jPackage, this);
        this.f7535l = f11.e().d(new b0(this), a00.h0.J());
        this.f7536m = f11.a().i().b() ? q10.g.A0.b() : b20.h.a(f11, jPackage);
        this.f7537n = f11.e().f(new c0(this));
    }

    public static final Map H0(d0 d0Var) {
        h20.d0 o11 = d0Var.f7531h.a().o();
        String b11 = d0Var.d().b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        List<String> a11 = o11.a(b11);
        ArrayList arrayList = new ArrayList();
        for (String str : a11) {
            b.a aVar = n20.b.f74280d;
            n20.c e11 = v20.d.d(str).e();
            kotlin.jvm.internal.g0.o(e11, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            h20.x b12 = h20.w.b(d0Var.f7531h.a().j(), aVar.c(e11), d0Var.f7532i);
            Pair a12 = b12 != null ? h1.a(str, b12) : null;
            if (a12 != null) {
                arrayList.add(a12);
            }
        }
        return l1.B0(arrayList);
    }

    public static final HashMap M0(d0 d0Var) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, h20.x> entry : d0Var.J0().entrySet()) {
            String key = entry.getKey();
            h20.x value = entry.getValue();
            v20.d d11 = v20.d.d(key);
            kotlin.jvm.internal.g0.o(d11, "byInternalName(...)");
            KotlinClassHeader b11 = value.b();
            int i11 = a.f7538a[b11.c().ordinal()];
            if (i11 == 1) {
                String e11 = b11.e();
                if (e11 != null) {
                    hashMap.put(d11, v20.d.d(e11));
                }
            } else if (i11 == 2) {
                hashMap.put(d11, d11);
            }
        }
        return hashMap;
    }

    public static final List N0(d0 d0Var) {
        Collection<f20.u> r11 = d0Var.f7530g.r();
        ArrayList arrayList = new ArrayList(a00.i0.d0(r11, 10));
        Iterator<T> it = r11.iterator();
        while (it.hasNext()) {
            arrayList.add(((f20.u) it.next()).d());
        }
        return arrayList;
    }

    @m80.l
    public final p10.b I0(@m80.k f20.g jClass) {
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        return this.f7534k.j().l0(jClass);
    }

    @m80.k
    public final Map<String, h20.x> J0() {
        return (Map) d30.m.a(this.f7533j, this, f7529o[0]);
    }

    @Override // p10.g0
    @m80.k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public f r() {
        return this.f7534k;
    }

    @m80.k
    public final List<n20.c> L0() {
        return this.f7535l.invoke();
    }

    @Override // q10.b, q10.a
    @m80.k
    public q10.g getAnnotations() {
        return this.f7536m;
    }

    @Override // s10.h0, s10.n, p10.k
    @m80.k
    public p10.x0 getSource() {
        return new h20.y(this);
    }

    @Override // s10.h0, s10.m
    @m80.k
    public String toString() {
        return "Lazy Java package fragment: " + d() + " of module " + this.f7531h.a().m();
    }
}
