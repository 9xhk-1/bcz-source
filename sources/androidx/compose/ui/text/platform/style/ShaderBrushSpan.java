package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,52:1\n85#2:53\n113#2,2:54\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n37#1:53\n37#1:54,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 0;
    private final float alpha;

    @k
    private final ShaderBrush shaderBrush;

    @k
    private final MutableState size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(Size.Companion.m2345getUnspecifiedNHjbRc()), null, 2, null);

    @k
    private final State<Shader> shaderState = SnapshotStateKt.derivedStateOf(new a<Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Shader invoke() {
            if (ShaderBrushSpan.this.m4847getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m2339isEmptyimpl(ShaderBrushSpan.this.m4847getSizeNHjbRc())) {
                return null;
            }
            return ShaderBrushSpan.this.getShaderBrush().mo2478createShaderuvyYCjk(ShaderBrushSpan.this.m4847getSizeNHjbRc());
        }
    });

    public ShaderBrushSpan(@k ShaderBrush shaderBrush, float f11) {
        this.shaderBrush = shaderBrush;
        this.alpha = f11;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @k
    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4847getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m2342unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m4848setSizeuvyYCjk(long j11) {
        this.size$delegate.setValue(Size.m2325boximpl(j11));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@k TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
