package eb0;

import a00.h0;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.koin.core.definition.Kind;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@va0.b
@u0({"SMAP\nScopeDSL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 2 Module.kt\norg/koin/core/module/ModuleKt\n+ 3 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 4 Module.kt\norg/koin/core/module/Module\n*L\n1#1,49:1\n222#2:50\n223#2:65\n212#2:67\n213#2:82\n212#2,2:85\n115#3,14:51\n115#3,14:68\n162#4:66\n163#4,2:83\n*S KotlinDebug\n*F\n+ 1 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n*L\n37#1:50\n37#1:65\n46#1:67\n46#1:82\n46#1:85,2\n37#1:51,14\n46#1:68,14\n46#1:66\n46#1:83,2\n*E\n"})
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final za0.a f49625a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final va0.c f49626b;

    public f(@k za0.a scopeQualifier, @k va0.c module) {
        g0.p(scopeQualifier, "scopeQualifier");
        g0.p(module, "module");
        this.f49625a = scopeQualifier;
        this.f49626b = module;
    }

    public static /* synthetic */ ra0.f b(f fVar, za0.a aVar, p definition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        za0.a aVar2 = aVar;
        g0.p(definition, "definition");
        va0.c c11 = fVar.c();
        za0.a d11 = fVar.d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.a aVar3 = new ta0.a(new ra0.b(d11, o0.d(Object.class), aVar2, definition, kind, J));
        c11.q(aVar3);
        return new ra0.f(c11, aVar3);
    }

    public static /* synthetic */ ra0.f f(f fVar, za0.a aVar, p definition, int i11, Object obj) {
        v vVar = null;
        za0.a aVar2 = (i11 & 1) != 0 ? null : aVar;
        g0.p(definition, "definition");
        za0.a d11 = fVar.d();
        Kind kind = Kind.Scoped;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.f fVar2 = new ta0.f(new ra0.b(d11, o0.d(Object.class), aVar2, definition, kind, J), false, 2, vVar);
        fVar.c().q(fVar2);
        return new ra0.f(fVar.c(), fVar2);
    }

    public final /* synthetic */ <T> ra0.f<T> a(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition) {
        g0.p(definition, "definition");
        va0.c c11 = c();
        za0.a d11 = d();
        Kind kind = Kind.Factory;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.a aVar2 = new ta0.a(new ra0.b(d11, o0.d(Object.class), aVar, definition, kind, J));
        c11.q(aVar2);
        return new ra0.f<>(c11, aVar2);
    }

    @k
    public final va0.c c() {
        return this.f49626b;
    }

    @k
    public final za0.a d() {
        return this.f49625a;
    }

    public final /* synthetic */ <T> ra0.f<T> e(za0.a aVar, p<? super cb0.b, ? super ya0.a, ? extends T> definition) {
        g0.p(definition, "definition");
        za0.a d11 = d();
        Kind kind = Kind.Scoped;
        List J = h0.J();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ta0.f fVar = new ta0.f(new ra0.b(d11, o0.d(Object.class), aVar, definition, kind, J), false, 2, null);
        c().q(fVar);
        return new ra0.f<>(c(), fVar);
    }
}
