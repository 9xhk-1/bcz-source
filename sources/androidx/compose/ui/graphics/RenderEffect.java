package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@kotlin.jvm.internal.u0({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes.dex */
public abstract class RenderEffect {

    @m80.l
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(kotlin.jvm.internal.v vVar) {
        this();
    }

    @RequiresApi(31)
    @m80.k
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect createRenderEffect = createRenderEffect();
        this.internalRenderEffect = createRenderEffect;
        return createRenderEffect;
    }

    @RequiresApi(31)
    @m80.k
    public abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private RenderEffect() {
    }
}
