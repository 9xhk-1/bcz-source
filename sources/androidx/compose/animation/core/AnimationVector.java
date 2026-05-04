package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class AnimationVector {
    public static final int $stable = 0;

    public /* synthetic */ AnimationVector(v vVar) {
        this();
    }

    public abstract float get$animation_core_release(int i11);

    public abstract int getSize$animation_core_release();

    @k
    public abstract AnimationVector newVector$animation_core_release();

    public abstract void reset$animation_core_release();

    public abstract void set$animation_core_release(int i11, float f11);

    private AnimationVector() {
    }
}
