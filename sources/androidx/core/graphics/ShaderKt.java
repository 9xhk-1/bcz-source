package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ShaderKt {
    public static final void transform(@m80.k Shader shader, @m80.k x00.l<? super Matrix, g2> lVar) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
