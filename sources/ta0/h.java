package ta0;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h<T> extends b<T> {

    /* renamed from: d, reason: collision with root package name */
    @l
    public T f90422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@k ra0.b<T> beanDefinition) {
        super(beanDefinition);
        g0.p(beanDefinition, "beanDefinition");
    }

    public static final g2 j(h hVar, d dVar) {
        if (!hVar.g(dVar)) {
            hVar.f90422d = (T) hVar.a(dVar);
        }
        return g2.f100423a;
    }

    @Override // ta0.b
    public T a(@k d context) {
        g0.p(context, "context");
        return this.f90422d == null ? (T) super.a(context) : k();
    }

    @Override // ta0.b
    public void b(@l cb0.b bVar) {
        x00.l<T, g2> d11 = f().b().d();
        if (d11 != null) {
            d11.invoke(this.f90422d);
        }
        this.f90422d = null;
    }

    @Override // ta0.b
    public void d() {
        b.c(this, null, 1, null);
    }

    @Override // ta0.b
    public T e(@k final d context) {
        g0.p(context, "context");
        jb0.c.f64013a.j(this, new x00.a() { // from class: ta0.g
            @Override // x00.a
            public final Object invoke() {
                g2 j11;
                j11 = h.j(h.this, context);
                return j11;
            }
        });
        return k();
    }

    @Override // ta0.b
    public boolean g(@l d dVar) {
        return this.f90422d != null;
    }

    public final T k() {
        T t11 = this.f90422d;
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
