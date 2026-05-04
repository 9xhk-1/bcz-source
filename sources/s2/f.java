package s2;

import a3.q;
import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends q2.b {

    /* renamed from: c, reason: collision with root package name */
    public k f87412c = new k();

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<? extends q> f87413d;

    public void D(com.badlogic.gdx.utils.a<? extends q> aVar) {
        this.f87413d = aVar;
    }

    @Override // q2.b, a3.q
    public void dispose() {
        com.badlogic.gdx.utils.a<? extends q> aVar = this.f87413d;
        if (aVar != null) {
            a.b<? extends q> it = aVar.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
        }
    }

    public k z() {
        return this.f87412c;
    }
}
