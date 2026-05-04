package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContentScaleTransitionEffect extends TransitionEffect {
    public static final int $stable = 0;

    @k
    public static final Key Key = new Key(null);

    @k
    private final Alignment alignment;

    @k
    private final ContentScale contentScale;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
        public /* synthetic */ Key(v vVar) {
            this();
        }

        private Key() {
        }
    }

    public ContentScaleTransitionEffect(@k ContentScale contentScale, @k Alignment alignment) {
        super(null);
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public static /* synthetic */ ContentScaleTransitionEffect copy$default(ContentScaleTransitionEffect contentScaleTransitionEffect, ContentScale contentScale, Alignment alignment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contentScale = contentScaleTransitionEffect.contentScale;
        }
        if ((i11 & 2) != 0) {
            alignment = contentScaleTransitionEffect.alignment;
        }
        return contentScaleTransitionEffect.copy(contentScale, alignment);
    }

    @k
    public final ContentScale component1() {
        return this.contentScale;
    }

    @k
    public final Alignment component2() {
        return this.alignment;
    }

    @k
    public final ContentScaleTransitionEffect copy(@k ContentScale contentScale, @k Alignment alignment) {
        return new ContentScaleTransitionEffect(contentScale, alignment);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        ContentScaleTransitionEffect contentScaleTransitionEffect = (ContentScaleTransitionEffect) obj;
        return g0.g(this.contentScale, contentScaleTransitionEffect.contentScale) && g0.g(this.alignment, contentScaleTransitionEffect.alignment);
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @k
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @Override // androidx.compose.animation.TransitionEffect
    @k
    public TransitionEffectKey<?> getKey$animation() {
        return Key;
    }

    public int hashCode() {
        return (this.contentScale.hashCode() * 31) + this.alignment.hashCode();
    }

    @k
    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.contentScale + ", alignment=" + this.alignment + ')';
    }
}
