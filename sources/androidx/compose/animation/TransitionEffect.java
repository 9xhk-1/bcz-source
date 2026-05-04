package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class TransitionEffect {
    public static final int $stable = 0;

    public /* synthetic */ TransitionEffect(v vVar) {
        this();
    }

    @k
    public abstract TransitionEffectKey<?> getKey$animation();

    private TransitionEffect() {
    }
}
