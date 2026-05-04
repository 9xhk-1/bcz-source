package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class Slide {
    public static final int $stable = 0;

    @k
    private final FiniteAnimationSpec<IntOffset> animationSpec;

    @k
    private final l<IntSize, IntOffset> slideOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(@k l<? super IntSize, IntOffset> lVar, @k FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.slideOffset = lVar;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, l lVar, FiniteAnimationSpec finiteAnimationSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = slide.slideOffset;
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(lVar, finiteAnimationSpec);
    }

    @k
    public final l<IntSize, IntOffset> component1() {
        return this.slideOffset;
    }

    @k
    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    @k
    public final Slide copy(@k l<? super IntSize, IntOffset> lVar, @k FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new Slide(lVar, finiteAnimationSpec);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return g0.g(this.slideOffset, slide.slideOffset) && g0.g(this.animationSpec, slide.animationSpec);
    }

    @k
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    @k
    public final l<IntSize, IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    @k
    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
