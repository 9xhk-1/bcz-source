package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class AndroidRenderEffect extends RenderEffect {

    @m80.k
    private final android.graphics.RenderEffect androidRenderEffect;

    public AndroidRenderEffect(@m80.k android.graphics.RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @m80.k
    public android.graphics.RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    @m80.k
    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
