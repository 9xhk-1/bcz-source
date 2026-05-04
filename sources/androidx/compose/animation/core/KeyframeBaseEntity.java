package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;

    @k
    private Easing easing;
    private final T value;

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, v vVar) {
        this(obj, easing);
    }

    @k
    public final Easing getEasing$animation_core_release() {
        return this.easing;
    }

    public final T getValue$animation_core_release() {
        return this.value;
    }

    public final void setEasing$animation_core_release(@k Easing easing) {
        this.easing = easing;
    }

    @k
    public final <V extends AnimationVector> Pair<V, Easing> toPair$animation_core_release(@k l<? super T, ? extends V> lVar) {
        return h1.a(lVar.invoke(this.value), this.easing);
    }

    private KeyframeBaseEntity(T t11, Easing easing) {
        this.value = t11;
        this.easing = easing;
    }
}
