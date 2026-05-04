package f2;

import a3.j0;
import com.badlogic.gdx.utils.a;
import x1.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements d<i2.c> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<i2.c> f50379a = new com.badlogic.gdx.utils.a<>(false, 5);

    /* renamed from: b, reason: collision with root package name */
    public int f50380b;

    @Override // f2.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void I(i2.c cVar) {
        this.f50379a.a(cVar);
        this.f50380b += cVar.f60126a.f48380e.f48329c;
    }

    @Override // f2.d
    public void c() {
        this.f50379a.clear();
        this.f50380b = 0;
    }

    public int d() {
        return this.f50380b;
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<i> aVar, j0<i> j0Var) {
        a.b<i2.c> it = this.f50379a.iterator();
        while (it.hasNext()) {
            i2.c next = it.next();
            int i11 = next.f60126a.f48380e.f48329c;
            for (int i12 = 0; i12 < i11; i12++) {
                next.f60118c.f48342f[i12].z(aVar, j0Var);
            }
        }
    }

    @Override // f2.d
    public void end() {
    }

    @Override // f2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
    }

    @Override // f2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
    }
}
