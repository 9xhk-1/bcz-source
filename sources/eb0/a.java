package eb0;

import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDefinitionBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefinitionBinding.kt\norg/koin/dsl/DefinitionBindingKt\n+ 2 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n99#2,7:80\n99#2,7:88\n13472#3:87\n13473#3:95\n*S KotlinDebug\n*F\n+ 1 DefinitionBinding.kt\norg/koin/dsl/DefinitionBindingKt\n*L\n38#1:80,7\n65#1:88,7\n64#1:87\n64#1:95\n*E\n"})
/* loaded from: classes9.dex */
public final class a {
    @va0.e
    public static final /* synthetic */ <S> ra0.f<? extends S> a(ra0.f<? extends S> fVar) {
        g0.p(fVar, "<this>");
        g0.y(4, ExifInterface.LATITUDE_SOUTH);
        b(fVar, o0.d(Object.class));
        return fVar;
    }

    @va0.e
    @k
    public static final <S> ra0.f<? extends S> b(@k ra0.f<? extends S> fVar, @k h10.d<S> clazz) {
        String str;
        g0.p(fVar, "<this>");
        g0.p(clazz, "clazz");
        fVar.e().f().o(r0.J4(fVar.e().f().h(), clazz));
        za0.a f11 = fVar.e().f().f();
        za0.a g11 = fVar.e().f().g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fb0.b.a(clazz));
        sb2.append(':');
        if (f11 == null || (str = f11.getValue()) == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(':');
        sb2.append(g11);
        fVar.f().w(sb2.toString(), fVar.e());
        return fVar;
    }

    @va0.e
    @k
    public static final ra0.f<?> c(@k ra0.f<?> fVar, @k h10.d<?>[] classes) {
        String str;
        g0.p(fVar, "<this>");
        g0.p(classes, "classes");
        ra0.b<?> f11 = fVar.e().f();
        f11.o(r0.L4(f11.h(), classes));
        for (h10.d<?> dVar : classes) {
            za0.a f12 = fVar.e().f().f();
            za0.a g11 = fVar.e().f().g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fb0.b.a(dVar));
            sb2.append(':');
            if (f12 == null || (str = f12.getValue()) == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(':');
            sb2.append(g11);
            fVar.f().w(sb2.toString(), fVar.e());
        }
        return fVar;
    }

    @va0.e
    @k
    public static final <T> ra0.f<T> d(@k ra0.f<T> fVar, @k l<? super T, g2> onClose) {
        g0.p(fVar, "<this>");
        g0.p(onClose, "onClose");
        fVar.e().f().m(new ra0.d<>(onClose));
        return fVar;
    }
}
