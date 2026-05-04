package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BrushKt {
    @m80.k
    public static final ShaderBrush ShaderBrush(@m80.k final Shader shader) {
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt$ShaderBrush$1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public Shader mo2478createShaderuvyYCjk(long j11) {
                return shader;
            }
        };
    }
}
