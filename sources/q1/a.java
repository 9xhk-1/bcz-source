package q1;

import com.badlogic.gdx.Graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements Graphics {
    @Override // com.badlogic.gdx.Graphics
    public float I() {
        return D() / getWidth();
    }

    @Override // com.badlogic.gdx.Graphics
    public float getDensity() {
        float v11 = v();
        if (v11 <= 0.0f || v11 > Float.MAX_VALUE) {
            return 1.0f;
        }
        return v11 / 160.0f;
    }

    @Override // com.badlogic.gdx.Graphics
    public float z() {
        return S();
    }
}
