package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
@Immutable
/* loaded from: classes.dex */
public final class ScaleToBoundsImpl implements SharedTransitionScope.ResizeMode {
    public static final int $stable = 0;

    @k
    private final Alignment alignment;

    @k
    private final ContentScale contentScale;

    public ScaleToBoundsImpl(@k ContentScale contentScale, @k Alignment alignment) {
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @k
    public final ContentScale getContentScale() {
        return this.contentScale;
    }
}
