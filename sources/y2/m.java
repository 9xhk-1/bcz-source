package y2;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f99183d;

    @Override // x2.a
    public boolean a(float f11) {
        ((z2.l) this.f97056b).Z(this.f99183d);
        return true;
    }

    @Override // x2.a
    public void h(com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar == null || (aVar instanceof z2.l)) {
            super.h(aVar);
            return;
        }
        throw new GdxRuntimeException("Actor must implement layout: " + aVar);
    }

    public boolean i() {
        return this.f99183d;
    }

    public void j(boolean z11) {
        this.f99183d = z11;
    }
}
