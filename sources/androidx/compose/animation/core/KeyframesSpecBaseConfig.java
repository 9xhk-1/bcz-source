package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1073:1\n26#2:1074\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpecBaseConfig\n*L\n503#1:1074\n*E\n"})
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;

    @k
    private final MutableIntObjectMap<E> keyframes;

    public /* synthetic */ KeyframesSpecBaseConfig(v vVar) {
        this();
    }

    @k
    public E at(T t11, @IntRange(from = 0) int i11) {
        E createEntityFor$animation_core_release = createEntityFor$animation_core_release(t11);
        this.keyframes.set(i11, createEntityFor$animation_core_release);
        return createEntityFor$animation_core_release;
    }

    @k
    public E atFraction(T t11, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return at(t11, Math.round(this.durationMillis * f11));
    }

    @k
    public abstract E createEntityFor$animation_core_release(T t11);

    @IntRange(from = 0)
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    @IntRange(from = 0)
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @k
    public final MutableIntObjectMap<E> getKeyframes$animation_core_release() {
        return this.keyframes;
    }

    public final void setDelayMillis(@IntRange(from = 0) int i11) {
        this.delayMillis = i11;
    }

    public final void setDurationMillis(@IntRange(from = 0) int i11) {
        this.durationMillis = i11;
    }

    @k
    public final E using(@k E e11, @k Easing easing) {
        e11.setEasing$animation_core_release(easing);
        return e11;
    }

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }
}
