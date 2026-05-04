package y2;

import com.badlogic.gdx.scenes.scene2d.Touchable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f0 extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public Touchable f99165d;

    @Override // x2.a
    public boolean a(float f11) {
        this.f97056b.L2(this.f99165d);
        return true;
    }

    public Touchable i() {
        return this.f99165d;
    }

    public void j(Touchable touchable) {
        this.f99165d = touchable;
    }
}
