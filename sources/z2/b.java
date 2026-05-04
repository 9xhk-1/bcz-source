package z2;

import com.badlogic.gdx.utils.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b<T> extends o<T> {

    /* renamed from: j, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<T> f100644j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f100645k = true;

    /* renamed from: l, reason: collision with root package name */
    public T f100646l;

    public b(com.badlogic.gdx.utils.a<T> aVar) {
        this.f100644j = aVar;
    }

    public boolean D() {
        return this.f100645k;
    }

    public void E(boolean z11) {
        this.f100645k = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F() {
        com.badlogic.gdx.utils.a<T> aVar = this.f100644j;
        if (aVar.f13179b == 0) {
            clear();
            return;
        }
        o.a<T> it = o().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (!aVar.l(it.next(), false)) {
                it.remove();
                z11 = true;
            }
        }
        if (this.f100735g && this.f100730b.f13401a == 0) {
            t(aVar.first());
        } else if (z11) {
            d();
        }
    }

    @Override // z2.o
    public void d() {
        this.f100646l = null;
    }

    @Override // z2.o
    public void f(T t11) {
        if (t11 == null) {
            throw new IllegalArgumentException("item cannot be null.");
        }
        if (this.f100732d) {
            return;
        }
        if (!this.f100645k || !this.f100734f) {
            super.f(t11);
            return;
        }
        if (this.f100730b.f13401a > 0 && t.k()) {
            T t12 = this.f100646l;
            int q11 = t12 == null ? -1 : this.f100644j.q(t12, false);
            if (q11 != -1) {
                T t13 = this.f100646l;
                A();
                int q12 = this.f100644j.q(t11, false);
                if (q11 > q12) {
                    int i11 = q11;
                    q11 = q12;
                    q12 = i11;
                }
                if (!t.c()) {
                    this.f100730b.j(8);
                }
                while (q11 <= q12) {
                    this.f100730b.add(this.f100644j.get(q11));
                    q11++;
                }
                if (h()) {
                    s();
                } else {
                    d();
                }
                this.f100646l = t13;
                g();
                return;
            }
        }
        super.f(t11);
        this.f100646l = t11;
    }
}
