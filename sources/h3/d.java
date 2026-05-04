package h3;

import a3.q0;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.Vector2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends g {

    /* renamed from: i, reason: collision with root package name */
    public q0 f58169i;

    public d(q0 q0Var, float f11, float f12) {
        this(q0Var, f11, f12, new k());
    }

    @Override // h3.g
    public void I(int i11, int i12, boolean z11) {
        Vector2 a11 = this.f58169i.a(q(), p(), i11, i12);
        int round = Math.round(a11.f12535x);
        int round2 = Math.round(a11.f12536y);
        u((i11 - round) / 2, (i12 - round2) / 2, round, round2);
        b(z11);
    }

    public q0 J() {
        return this.f58169i;
    }

    public void K(q0 q0Var) {
        this.f58169i = q0Var;
    }

    public d(q0 q0Var, float f11, float f12, com.badlogic.gdx.graphics.a aVar) {
        this.f58169i = q0Var;
        C(f11, f12);
        t(aVar);
    }
}
