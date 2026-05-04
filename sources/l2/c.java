package l2;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<x1.k> f69158a = new com.badlogic.gdx.utils.a<>();

    public abstract x1.k b(x1.i iVar);

    @Override // a3.q
    public void dispose() {
        a.b<x1.k> it = this.f69158a.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.f69158a.clear();
    }

    @Override // l2.o
    public x1.k r(x1.i iVar) {
        x1.k kVar = iVar.f97052f;
        if (kVar != null && kVar.u(iVar)) {
            return kVar;
        }
        a.b<x1.k> it = this.f69158a.iterator();
        while (it.hasNext()) {
            x1.k next = it.next();
            if (next.u(iVar)) {
                return next;
            }
        }
        x1.k b11 = b(iVar);
        if (!b11.u(iVar)) {
            throw new GdxRuntimeException("unable to provide a shader for this renderable");
        }
        b11.init();
        this.f69158a.a(b11);
        return b11;
    }
}
