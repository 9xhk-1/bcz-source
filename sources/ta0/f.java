package ta0;

import java.util.HashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.koin.core.error.MissingScopeValueException;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f<T> extends b<T> {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f90418d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public HashMap<String, T> f90419e;

    public /* synthetic */ f(ra0.b bVar, boolean z11, int i11, v vVar) {
        this(bVar, (i11 & 2) != 0 ? true : z11);
    }

    public static final g2 j(f fVar, d dVar) {
        if (!fVar.g(dVar) && fVar.f90418d) {
            fVar.f90419e.put(dVar.f().p(), super.a(dVar));
        }
        return g2.f100423a;
    }

    @Override // ta0.b
    public T a(@k d context) {
        g0.p(context, "context");
        if (this.f90419e.get(context.f().p()) == null) {
            return (T) super.a(context);
        }
        T t11 = this.f90419e.get(context.f().p());
        if (t11 != null) {
            return t11;
        }
        throw new MissingScopeValueException("Factory.create - Scoped instance not found for " + context.f().p() + " in " + f());
    }

    @Override // ta0.b
    public void b(@l cb0.b bVar) {
        if (bVar != null) {
            x00.l<T, g2> d11 = f().b().d();
            if (d11 != null) {
                d11.invoke(this.f90419e.get(bVar.p()));
            }
            this.f90419e.remove(bVar.p());
        }
    }

    @Override // ta0.b
    public void d() {
        this.f90419e.clear();
    }

    @Override // ta0.b
    public T e(@k final d context) {
        g0.p(context, "context");
        if (!g0.g(context.f().G(), f().g()) && !g0.g(context.g(), f().g())) {
            throw new IllegalStateException(("Wrong Scope qualifier: trying to open instance for " + context.f().p() + " in " + f()).toString());
        }
        jb0.c.f64013a.j(this, new x00.a() { // from class: ta0.e
            @Override // x00.a
            public final Object invoke() {
                g2 j11;
                j11 = f.j(f.this, context);
                return j11;
            }
        });
        T t11 = this.f90419e.get(context.f().p());
        if (t11 != null) {
            return t11;
        }
        throw new MissingScopeValueException("Factory.get -Scoped instance not found for " + context.f().p() + " in " + f());
    }

    @Override // ta0.b
    public boolean g(@l d dVar) {
        cb0.b f11;
        return this.f90419e.get((dVar == null || (f11 = dVar.f()) == null) ? null : f11.p()) != null;
    }

    public final boolean k() {
        return this.f90418d;
    }

    public final void l(@k String scopeID, @k Object instance) {
        g0.p(scopeID, "scopeID");
        g0.p(instance, "instance");
        this.f90419e.put(scopeID, instance);
    }

    @v0
    public final void m(@k String id2, T t11) {
        g0.p(id2, "id");
        this.f90419e.put(id2, t11);
    }

    public final int n() {
        return this.f90419e.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@k ra0.b<T> beanDefinition, boolean z11) {
        super(beanDefinition);
        g0.p(beanDefinition, "beanDefinition");
        this.f90418d = z11;
        this.f90419e = new HashMap<>();
    }
}
