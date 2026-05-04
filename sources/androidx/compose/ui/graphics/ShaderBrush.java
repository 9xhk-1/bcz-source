package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@kotlin.jvm.internal.u0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,658:1\n1#2:659\n*E\n"})
/* loaded from: classes.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;

    @m80.l
    private Shader internalShader;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.Companion.m2345getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo2456applyToPq9zytI(long j11, @m80.k Paint paint, float f11) {
        Shader shader = this.internalShader;
        if (shader == null || !Size.m2333equalsimpl0(this.createdSize, j11)) {
            if (Size.m2339isEmptyimpl(j11)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = Size.Companion.m2345getUnspecifiedNHjbRc();
            } else {
                shader = mo2478createShaderuvyYCjk(j11);
                this.internalShader = shader;
                this.createdSize = j11;
            }
        }
        long mo2382getColor0d7_KjU = paint.mo2382getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m2510equalsimpl0(mo2382getColor0d7_KjU, companion.m2535getBlack0d7_KjU())) {
            paint.mo2388setColor8_81llA(companion.m2535getBlack0d7_KjU());
        }
        if (!kotlin.jvm.internal.g0.g(paint.getShader(), shader)) {
            paint.setShader(shader);
        }
        if (paint.getAlpha() == f11) {
            return;
        }
        paint.setAlpha(f11);
    }

    @m80.k
    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo2478createShaderuvyYCjk(long j11);
}
