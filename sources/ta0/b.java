package ta0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.koin.core.error.InstanceCreationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f90406b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f90407c = "\n\t";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ra0.b<T> f90408a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public b(@k ra0.b<T> beanDefinition) {
        g0.p(beanDefinition, "beanDefinition");
        this.f90408a = beanDefinition;
    }

    public static /* synthetic */ void c(b bVar, cb0.b bVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i11 & 1) != 0) {
            bVar2 = null;
        }
        bVar.b(bVar2);
    }

    public static /* synthetic */ boolean h(b bVar, d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i11 & 1) != 0) {
            dVar = null;
        }
        return bVar.g(dVar);
    }

    public T a(@k d context) {
        g0.p(context, "context");
        context.c().a("| (+) '" + this.f90408a + '\'');
        try {
            ya0.a d11 = context.d();
            if (d11 == null) {
                d11 = ya0.b.a();
            }
            return this.f90408a.c().invoke(context.f(), d11);
        } catch (Exception e11) {
            String g11 = jb0.c.f64013a.g(e11);
            context.c().c("* Instance creation error : could not create instance for '" + this.f90408a + "': " + g11);
            throw new InstanceCreationException("Could not create instance for '" + this.f90408a + '\'', e11);
        }
    }

    public abstract void b(@l cb0.b bVar);

    public abstract void d();

    public abstract T e(@k d dVar);

    @k
    public final ra0.b<T> f() {
        return this.f90408a;
    }

    public abstract boolean g(@l d dVar);
}
