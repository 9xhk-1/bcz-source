package wa0;

import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import ta0.h;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOptionDSL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionDSL.kt\norg/koin/core/module/dsl/OptionDSLKt\n*L\n1#1,74:1\n27#1,13:75\n*S KotlinDebug\n*F\n+ 1 OptionDSL.kt\norg/koin/core/module/dsl/OptionDSLKt\n*L\n46#1:75,13\n*E\n"})
/* loaded from: classes9.dex */
public final class c {
    public static final /* synthetic */ <T> void a(ra0.b<? extends T> bVar) {
        g0.p(bVar, "<this>");
        List<h10.d<?>> h11 = bVar.h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        bVar.o(r0.J4(h11, o0.d(Object.class)));
    }

    public static final void b(@k ra0.b<?> bVar, @k List<? extends h10.d<?>> classes) {
        g0.p(bVar, "<this>");
        g0.p(classes, "classes");
        bVar.o(r0.I4(bVar.h(), classes));
    }

    public static final void c(@k ra0.b<?> bVar) {
        g0.p(bVar, "<this>");
        bVar.p(true);
    }

    public static final /* synthetic */ <T> void d(ra0.b<?> bVar) {
        g0.p(bVar, "<this>");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        bVar.n(new za0.d(o0.d(Object.class)));
    }

    public static final void e(@k ra0.b<?> bVar, @k String name) {
        g0.p(bVar, "<this>");
        g0.p(name, "name");
        bVar.n(new za0.c(name));
    }

    public static final <T> void f(@k ra0.b<T> bVar, @k l<? super T, g2> onClose) {
        g0.p(bVar, "<this>");
        g0.p(onClose, "onClose");
        bVar.m(new ra0.d<>(onClose));
    }

    @k
    public static final <T> ra0.f<T> g(@k ra0.f<T> fVar, @m80.l l<? super ra0.b<T>, g2> lVar) {
        g0.p(fVar, "<this>");
        if (lVar != null) {
            ra0.b<T> f11 = fVar.e().f();
            za0.a f12 = f11.f();
            lVar.invoke(f11);
            if (!g0.g(f11.f(), f12)) {
                fVar.f().q(fVar.e());
            }
            if (!f11.h().isEmpty()) {
                fVar.f().r(fVar.e());
            }
            if (f11.i() && (fVar.e() instanceof h)) {
                fVar.f().v((h) fVar.e());
            }
        }
        return fVar;
    }

    public static /* synthetic */ ra0.f h(ra0.f fVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        return g(fVar, lVar);
    }

    @va0.e
    @k
    public static final <T> ra0.f<T> i(@k ra0.f<T> fVar, @k l<? super ra0.b<T>, g2> options) {
        g0.p(fVar, "<this>");
        g0.p(options, "options");
        ra0.b<T> f11 = fVar.e().f();
        za0.a f12 = f11.f();
        options.invoke(f11);
        if (!g0.g(f11.f(), f12)) {
            fVar.f().q(fVar.e());
        }
        if (!f11.h().isEmpty()) {
            fVar.f().r(fVar.e());
        }
        if (f11.i() && (fVar.e() instanceof h)) {
            fVar.f().v((h) fVar.e());
        }
        return fVar;
    }
}
