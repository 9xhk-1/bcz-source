package n2;

import java.nio.FloatBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface s extends a3.q {
    void I0(int i11, FloatBuffer floatBuffer, int i12, int i13);

    void Y0(FloatBuffer floatBuffer, int i11);

    FloatBuffer d(boolean z11);

    @Override // a3.q
    void dispose();

    void f(w wVar);

    void g(w wVar, int[] iArr);

    com.badlogic.gdx.graphics.s getAttributes();

    @Deprecated
    FloatBuffer getBuffer();

    void h0(float[] fArr, int i11, int i12);

    void i(w wVar, int[] iArr);

    void invalidate();

    void j0(int i11, float[] fArr, int i12, int i13);

    int m0();

    void n(w wVar);

    int x();
}
