package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {
    public static final int $stable = 0;
    private final int arcMode;

    @k
    private final Easing easing;

    @k
    private final V vectorValue;

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing, int i11, v vVar) {
        this(animationVector, easing, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-2NF0KzA$default, reason: not valid java name */
    public static /* synthetic */ VectorizedKeyframeSpecElementInfo m197copy2NF0KzA$default(VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo, AnimationVector animationVector, Easing easing, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            animationVector = vectorizedKeyframeSpecElementInfo.vectorValue;
        }
        if ((i12 & 2) != 0) {
            easing = vectorizedKeyframeSpecElementInfo.easing;
        }
        if ((i12 & 4) != 0) {
            i11 = vectorizedKeyframeSpecElementInfo.arcMode;
        }
        return vectorizedKeyframeSpecElementInfo.m199copy2NF0KzA(animationVector, easing, i11);
    }

    @k
    public final V component1() {
        return this.vectorValue;
    }

    @k
    public final Easing component2() {
        return this.easing;
    }

    /* renamed from: component3--9T-Mq4, reason: not valid java name */
    public final int m198component39TMq4() {
        return this.arcMode;
    }

    @k
    /* renamed from: copy-2NF0KzA, reason: not valid java name */
    public final VectorizedKeyframeSpecElementInfo<V> m199copy2NF0KzA(@k V v11, @k Easing easing, int i11) {
        return new VectorizedKeyframeSpecElementInfo<>(v11, easing, i11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return g0.g(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && g0.g(this.easing, vectorizedKeyframeSpecElementInfo.easing) && ArcMode.m143equalsimpl0(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    /* renamed from: getArcMode--9T-Mq4, reason: not valid java name */
    public final int m200getArcMode9TMq4() {
        return this.arcMode;
    }

    @k
    public final Easing getEasing() {
        return this.easing;
    }

    @k
    public final V getVectorValue() {
        return this.vectorValue;
    }

    public int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + ArcMode.m144hashCodeimpl(this.arcMode);
    }

    @k
    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ((Object) ArcMode.m145toStringimpl(this.arcMode)) + ')';
    }

    private VectorizedKeyframeSpecElementInfo(V v11, Easing easing, int i11) {
        this.vectorValue = v11;
        this.easing = easing;
        this.arcMode = i11;
    }
}
