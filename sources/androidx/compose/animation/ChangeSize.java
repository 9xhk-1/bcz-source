package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class ChangeSize {
    public static final int $stable = 0;

    @k
    private final Alignment alignment;

    @k
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;

    @k
    private final l<IntSize, IntSize> size;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(@k Alignment alignment, @k l<? super IntSize, IntSize> lVar, @k FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z11) {
        this.alignment = alignment;
        this.size = lVar;
        this.animationSpec = finiteAnimationSpec;
        this.clip = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i11 & 2) != 0) {
            lVar = changeSize.size;
        }
        if ((i11 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i11 & 8) != 0) {
            z11 = changeSize.clip;
        }
        return changeSize.copy(alignment, lVar, finiteAnimationSpec, z11);
    }

    @k
    public final Alignment component1() {
        return this.alignment;
    }

    @k
    public final l<IntSize, IntSize> component2() {
        return this.size;
    }

    @k
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    @k
    public final ChangeSize copy(@k Alignment alignment, @k l<? super IntSize, IntSize> lVar, @k FiniteAnimationSpec<IntSize> finiteAnimationSpec, boolean z11) {
        return new ChangeSize(alignment, lVar, finiteAnimationSpec, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return g0.g(this.alignment, changeSize.alignment) && g0.g(this.size, changeSize.size) && g0.g(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @k
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    @k
    public final l<IntSize, IntSize> getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    @k
    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    public /* synthetic */ ChangeSize(Alignment alignment, l lVar, FiniteAnimationSpec finiteAnimationSpec, boolean z11, int i11, v vVar) {
        this(alignment, (i11 & 2) != 0 ? new l<IntSize, IntSize>() { // from class: androidx.compose.animation.ChangeSize.1
            @Override // x00.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m5278boximpl(m73invokemzRDjE0(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m73invokemzRDjE0(long j11) {
                long j12 = 0;
                return IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
            }
        } : lVar, finiteAnimationSpec, (i11 & 8) != 0 ? true : z11);
    }
}
