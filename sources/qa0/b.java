package qa0;

import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.koin.core.error.KoinApplicationAlreadyStartedException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f82022a = new b();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static na0.a f82023b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public static na0.b f82024c;

    @Override // qa0.c
    public void a(@k va0.c module, boolean z11) {
        g0.p(module, "module");
        synchronized (this) {
            na0.a.W(f82022a.get(), a00.g0.l(module), false, z11, 2, null);
            g2 g2Var = g2.f100423a;
        }
    }

    @Override // qa0.c
    public void b() {
        synchronized (this) {
            try {
                na0.a aVar = f82023b;
                if (aVar != null) {
                    aVar.a();
                }
                f82023b = null;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qa0.c
    @l
    public na0.a c() {
        return f82023b;
    }

    @Override // qa0.c
    @k
    public na0.b d(@k x00.l<? super na0.b, g2> appDeclaration) {
        na0.b a11;
        g0.p(appDeclaration, "appDeclaration");
        synchronized (this) {
            a11 = na0.b.f75035c.a();
            f82022a.j(a11);
            appDeclaration.invoke(a11);
            a11.c();
        }
        return a11;
    }

    @Override // qa0.c
    public void e(@k List<va0.c> modules) {
        g0.p(modules, "modules");
        synchronized (this) {
            f82022a.get().Z(modules);
            g2 g2Var = g2.f100423a;
        }
    }

    @Override // qa0.c
    @k
    public na0.b f(@k na0.b koinApplication) {
        g0.p(koinApplication, "koinApplication");
        synchronized (this) {
            f82022a.j(koinApplication);
            koinApplication.c();
        }
        return koinApplication;
    }

    @Override // qa0.c
    public void g(@k List<va0.c> modules, boolean z11) {
        g0.p(modules, "modules");
        synchronized (this) {
            na0.a.W(f82022a.get(), modules, false, z11, 2, null);
            g2 g2Var = g2.f100423a;
        }
    }

    @Override // qa0.c
    @k
    public na0.a get() {
        na0.a aVar = f82023b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    @Override // qa0.c
    public void h(@k va0.c module) {
        g0.p(module, "module");
        synchronized (this) {
            f82022a.get().Z(a00.g0.l(module));
            g2 g2Var = g2.f100423a;
        }
    }

    @l
    public final na0.b i() {
        return f82024c;
    }

    public final void j(na0.b bVar) {
        if (f82023b != null) {
            throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
        }
        f82024c = bVar;
        f82023b = bVar.d();
    }
}
