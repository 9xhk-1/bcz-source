package n2;

import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface b0 extends a3.q {
    void S0(float[] fArr, int i11, int i12);

    int W();

    FloatBuffer d(boolean z11);

    @Override // a3.q
    void dispose();

    void f(w wVar);

    void g(w wVar, int[] iArr);

    com.badlogic.gdx.graphics.s getAttributes();

    @Deprecated
    FloatBuffer getBuffer();

    void i(w wVar, int[] iArr);

    void invalidate();

    int m();

    void n(w wVar);

    void r0(int i11, float[] fArr, int i12, int i13);
}
