package va0;

import a00.h0;
import a00.m0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import oa0.g;
import org.koin.core.definition.Kind;
import ra0.f;
import ta0.h;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b
@u0({"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\norg/koin/core/module/Module\n+ 2 Module.kt\norg/koin/core/module/ModuleKt\n+ 3 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n162#1:299\n163#1,2:316\n162#1:318\n163#1,2:321\n196#2,7:261\n203#2:282\n212#2:300\n213#2:315\n212#2,2:319\n212#2:323\n213#2:338\n212#2,2:339\n115#3,14:268\n99#3,7:283\n99#3,7:291\n115#3,14:301\n115#3,14:324\n1869#4:290\n1870#4:298\n*S KotlinDebug\n*F\n+ 1 Module.kt\norg/koin/core/module/Module\n*L\n153#1:299\n153#1:316,2\n153#1:318\n153#1:321,2\n110#1:261,7\n110#1:282\n153#1:300\n153#1:315\n153#1:319,2\n162#1:323\n162#1:338\n162#1:339,2\n110#1:268,14\n121#1:283,7\n129#1:291,7\n153#1:301,14\n162#1:324,14\n128#1:290\n128#1:298\n*E\n"})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93801a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f93802b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public LinkedHashSet<h<?>> f93803c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, ta0.b<?>> f93804d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashSet<za0.a> f93805e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<c> f93806f;

    public c() {
        this(false, 1, null);
    }

    public static /* synthetic */ f B(c cVar, za0.a aVar, boolean z11, p definition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        za0.a aVar2 = aVar;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        g0.p(definition, "definition");
        za0.c a11 = ab0.e.f2509e.a();
        Kind kind = Kind.Singleton;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h<?> hVar = new h<>(new ra0.b(a11, o0.d(Object.class), aVar2, definition, kind, J));
        cVar.q(hVar);
        if (z11 || cVar.m()) {
            cVar.v(hVar);
        }
        return new f(cVar, hVar);
    }

    public static /* synthetic */ f c(c cVar, za0.a aVar, p definition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        g0.p(definition, "definition");
        za0.c a11 = ab0.e.f2509e.a();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.a aVar2 = new ta0.a(new ra0.b(a11, o0.d(Object.class), aVar, definition, kind, J));
        cVar.q(aVar2);
        return new f(cVar, aVar2);
    }

    public static /* synthetic */ f d(c cVar, za0.a aVar, p definition, za0.a scopeQualifier, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.a aVar2 = new ta0.a(new ra0.b(scopeQualifier, o0.d(Object.class), aVar, definition, kind, J));
        cVar.q(aVar2);
        return new f(cVar, aVar2);
    }

    public final /* synthetic */ <T> f<T> A(za0.a aVar, boolean z11, p<? super cb0.b, ? super ya0.a, ? extends T> definition) {
        g0.p(definition, "definition");
        za0.c a11 = ab0.e.f2509e.a();
        Kind kind = Kind.Singleton;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h<?> hVar = new h<>(new ra0.b(a11, o0.d(Object.class), aVar, definition, kind, J));
        q(hVar);
        if (z11 || m()) {
            v(hVar);
        }
        return new f<>(this, hVar);
    }

    public final /* synthetic */ <T> f<T> a(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition) {
        g0.p(definition, "definition");
        za0.c a11 = ab0.e.f2509e.a();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.a aVar2 = new ta0.a(new ra0.b(a11, o0.d(Object.class), aVar, definition, kind, J));
        q(aVar2);
        return new f<>(this, aVar2);
    }

    @v0
    public final /* synthetic */ <T> f<T> b(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition, za0.a scopeQualifier) {
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.a aVar2 = new ta0.a(new ra0.b(scopeQualifier, o0.d(Object.class), aVar, definition, kind, J));
        q(aVar2);
        return new f<>(this, aVar2);
    }

    @k
    public final LinkedHashSet<h<?>> e() {
        return this.f93803c;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return g0.g(this.f93802b, ((c) obj).f93802b);
        }
        return false;
    }

    @k
    public final String f() {
        return this.f93802b;
    }

    @k
    public final List<c> g() {
        return this.f93806f;
    }

    public int hashCode() {
        return this.f93802b.hashCode();
    }

    @k
    public final LinkedHashMap<String, ta0.b<?>> i() {
        return this.f93804d;
    }

    @k
    public final LinkedHashSet<za0.a> k() {
        return this.f93805e;
    }

    public final boolean m() {
        return this.f93801a;
    }

    public final void o(@k Collection<c> module) {
        g0.p(module, "module");
        this.f93806f.addAll(module);
    }

    public final void p(@k c... module) {
        g0.p(module, "module");
        m0.u0(this.f93806f, module);
    }

    @g
    public final void q(@k ta0.b<?> instanceFactory) {
        String str;
        g0.p(instanceFactory, "instanceFactory");
        ra0.b<?> f11 = instanceFactory.f();
        h10.d<?> e11 = f11.e();
        za0.a f12 = f11.f();
        za0.a g11 = f11.g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fb0.b.a(e11));
        sb2.append(':');
        if (f12 == null || (str = f12.getValue()) == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(g11);
        w(sb2.toString(), instanceFactory);
    }

    @g
    public final void r(@k ta0.b<?> instanceFactory) {
        String str;
        g0.p(instanceFactory, "instanceFactory");
        ra0.b<?> f11 = instanceFactory.f();
        Iterator<T> it = f11.h().iterator();
        while (it.hasNext()) {
            h10.d dVar = (h10.d) it.next();
            za0.a f12 = f11.f();
            za0.a g11 = f11.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fb0.b.a(dVar));
            sb2.append(':');
            if (f12 == null || (str = f12.getValue()) == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(':');
            sb2.append(g11);
            w(sb2.toString(), instanceFactory);
        }
    }

    public final boolean s() {
        return !this.f93804d.isEmpty();
    }

    @k
    public final List<c> t(@k List<c> modules) {
        g0.p(modules, "modules");
        return r0.I4(a00.g0.l(this), modules);
    }

    @k
    public final List<c> u(@k c module) {
        g0.p(module, "module");
        return h0.Q(this, module);
    }

    @g
    public final void v(@k h<?> instanceFactory) {
        g0.p(instanceFactory, "instanceFactory");
        this.f93803c.add(instanceFactory);
    }

    @v0
    public final void w(@k String mapping, @k ta0.b<?> factory) {
        g0.p(mapping, "mapping");
        g0.p(factory, "factory");
        this.f93804d.put(mapping, factory);
    }

    @b
    public final /* synthetic */ <T> void x(x00.l<? super eb0.f, g2> scopeSet) {
        g0.p(scopeSet, "scopeSet");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        za0.d dVar = new za0.d(o0.d(Object.class));
        scopeSet.invoke(new eb0.f(dVar, this));
        k().add(dVar);
    }

    @b
    public final void y(@k za0.a qualifier, @k x00.l<? super eb0.f, g2> scopeSet) {
        g0.p(qualifier, "qualifier");
        g0.p(scopeSet, "scopeSet");
        scopeSet.invoke(new eb0.f(qualifier, this));
        this.f93805e.add(qualifier);
    }

    public final void z(@k LinkedHashSet<h<?>> linkedHashSet) {
        g0.p(linkedHashSet, "<set-?>");
        this.f93803c = linkedHashSet;
    }

    public c(boolean z11) {
        this.f93801a = z11;
        this.f93802b = jb0.e.a(jb0.c.f64013a);
        this.f93803c = new LinkedHashSet<>();
        this.f93804d = new LinkedHashMap<>();
        this.f93805e = new LinkedHashSet<>();
        this.f93806f = new ArrayList();
    }

    public /* synthetic */ c(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    @g
    public static /* synthetic */ void h() {
    }

    @g
    public static /* synthetic */ void j() {
    }

    @g
    public static /* synthetic */ void l() {
    }

    @v0
    public static /* synthetic */ void n() {
    }
}
