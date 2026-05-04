package va0;

import a00.h0;
import a00.m;
import a00.n0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import oa0.g;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionOverrideException;
import ta0.f;
import ta0.h;
import x00.p;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\norg/koin/core/module/ModuleKt\n+ 2 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,260:1\n115#2,14:261\n115#2,14:275\n115#2,14:289\n*S KotlinDebug\n*F\n+ 1 Module.kt\norg/koin/core/module/ModuleKt\n*L\n202#1:261,14\n212#1:275,14\n222#1:289,14\n*E\n"})
/* loaded from: classes9.dex */
public final class d {
    @g
    public static final /* synthetic */ <T> ta0.a<T> a(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition, za0.a scopeQualifier) {
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new ta0.a<>(new ra0.b(scopeQualifier, o0.d(Object.class), aVar, definition, kind, J));
    }

    public static /* synthetic */ ta0.a b(za0.a aVar, p definition, za0.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        za0.a aVar3 = aVar;
        if ((i11 & 4) != 0) {
            aVar2 = ab0.e.f2509e.a();
        }
        za0.a scopeQualifier = aVar2;
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new ta0.a(new ra0.b(scopeQualifier, o0.d(Object.class), aVar3, definition, kind, J));
    }

    @g
    public static final /* synthetic */ <T> f<T> c(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition, za0.a scopeQualifier) {
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Scoped;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new f<>(new ra0.b(scopeQualifier, o0.d(Object.class), aVar, definition, kind, J), false, 2, null);
    }

    public static /* synthetic */ f d(za0.a aVar, p definition, za0.a scopeQualifier, int i11, Object obj) {
        v vVar = null;
        za0.a aVar2 = (i11 & 1) != 0 ? null : aVar;
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Scoped;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new f(new ra0.b(scopeQualifier, o0.d(Object.class), aVar2, definition, kind, J), false, 2, vVar);
    }

    @g
    public static final /* synthetic */ <T> h<T> e(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition, za0.a scopeQualifier) {
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Singleton;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new h<>(new ra0.b(scopeQualifier, o0.d(Object.class), aVar, definition, kind, J));
    }

    public static /* synthetic */ h f(za0.a aVar, p definition, za0.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        za0.a aVar3 = aVar;
        if ((i11 & 4) != 0) {
            aVar2 = ab0.e.f2509e.a();
        }
        za0.a scopeQualifier = aVar2;
        g0.p(definition, "definition");
        g0.p(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Singleton;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new h(new ra0.b(scopeQualifier, o0.d(Object.class), aVar3, definition, kind, J));
    }

    @g
    @k
    public static final Set<c> g(@k List<c> modules) {
        g0.p(modules, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m mVar = new m(n0.c1(modules));
        while (!mVar.isEmpty()) {
            c cVar = (c) mVar.removeLast();
            if (linkedHashSet.add(cVar)) {
                for (c cVar2 : cVar.g()) {
                    if (!linkedHashSet.contains(cVar2)) {
                        mVar.add(cVar2);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    @v0
    public static final void h(@k ta0.b<?> factory, @k String mapping) {
        g0.p(factory, "factory");
        g0.p(mapping, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + factory.f() + " at " + mapping);
    }

    @k
    public static final List<c> i(@k List<c> list, @k c module) {
        g0.p(list, "<this>");
        g0.p(module, "module");
        return r0.I4(list, a00.g0.l(module));
    }
}
