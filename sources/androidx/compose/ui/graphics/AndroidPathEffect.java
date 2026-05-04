package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidPathEffect implements PathEffect {

    @m80.k
    private final android.graphics.PathEffect nativePathEffect;

    public AndroidPathEffect(@m80.k android.graphics.PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }

    @m80.k
    public final android.graphics.PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
