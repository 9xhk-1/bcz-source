package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,190:1\n65#2:191\n65#2:192\n70#2:195\n425#3:193\n425#3:194\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n50#1:191\n67#1:192\n161#1:195\n82#1:193\n86#1:194\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;

    @k
    private final IntObjectMap<Pair<V, Easing>> keyframes;

    @l
    private V lastInitialValue;

    @l
    private V lastTargetValue;

    @l
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;

    @k
    private final IntList timestamps;

    @l
    private V valueVector;

    @l
    private float[][] values;

    @l
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(@k IntList intList, @k IntObjectMap<Pair<V, Easing>> intObjectMap, int i11, int i12, float f11) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i11;
        this.delayMillis = i12;
        this.periodicBias = f11;
    }

    private final int findEntryForTimeMillis(int i11) {
        int binarySearch$default = IntList.binarySearch$default(this.timestamps, i11, 0, 0, 6, null);
        return binarySearch$default < -1 ? -(binarySearch$default + 2) : binarySearch$default;
    }

    private final float getEasedTimeFromIndex(int i11, int i12) {
        float f11;
        IntList intList = this.timestamps;
        if (i11 >= intList._size - 1) {
            f11 = i12;
        } else {
            int i13 = intList.get(i11);
            int i14 = this.timestamps.get(i11 + 1);
            if (i12 != i13) {
                float f12 = i14 - i13;
                return ((f12 * getEasing(i11).transform((i12 - i13) / f12)) + i13) / 1000;
            }
            f11 = i13;
        }
        return f11 / 1000;
    }

    private final Easing getEasing(int i11) {
        Easing second;
        Pair<V, Easing> pair = this.keyframes.get(this.timestamps.get(i11));
        return (pair == null || (second = pair.getSecond()) == null) ? EasingKt.getLinearEasing() : second;
    }

    private final void init(V v11, V v12, V v13) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v11);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v13);
            int i11 = this.timestamps._size;
            float[] fArr2 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr2[i12] = this.timestamps.get(i12) / 1000;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && g0.g(this.lastInitialValue, v11) && g0.g(this.lastTargetValue, v12)) {
            return;
        }
        boolean g11 = g0.g(this.lastInitialValue, v11);
        boolean g12 = g0.g(this.lastTargetValue, v12);
        this.lastInitialValue = v11;
        this.lastTargetValue = v12;
        int size$animation_core_release = v11.getSize$animation_core_release();
        float[][] fArr3 = this.values;
        if (fArr3 == null) {
            int i13 = this.timestamps._size;
            fArr3 = new float[i13][];
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = this.timestamps.get(i14);
                Pair<V, Easing> pair = this.keyframes.get(i15);
                if (i15 == 0 && pair == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i16 = 0; i16 < size$animation_core_release; i16++) {
                        fArr[i16] = v11.get$animation_core_release(i16);
                    }
                } else if (i15 == getDurationMillis() && pair == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i17 = 0; i17 < size$animation_core_release; i17++) {
                        fArr[i17] = v12.get$animation_core_release(i17);
                    }
                } else {
                    g0.m(pair);
                    V first = pair.getFirst();
                    float[] fArr4 = new float[size$animation_core_release];
                    for (int i18 = 0; i18 < size$animation_core_release; i18++) {
                        fArr4[i18] = first.get$animation_core_release(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i14] = fArr;
            }
            this.values = fArr3;
        } else {
            if (!g11 && !this.keyframes.containsKey(0)) {
                int binarySearch$default = IntList.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr5 = new float[size$animation_core_release];
                for (int i19 = 0; i19 < size$animation_core_release; i19++) {
                    fArr5[i19] = v11.get$animation_core_release(i19);
                }
                fArr3[binarySearch$default] = fArr5;
            }
            if (!g12 && !this.keyframes.containsKey(getDurationMillis())) {
                int binarySearch$default2 = IntList.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr6 = new float[size$animation_core_release];
                for (int i21 = 0; i21 < size$animation_core_release; i21++) {
                    fArr6[i21] = v12.get$animation_core_release(i21);
                }
                fArr3[binarySearch$default2] = fArr6;
            }
        }
        float[] fArr7 = this.times;
        if (fArr7 == null) {
            g0.S("times");
            fArr7 = null;
        }
        this.monoSpline = new MonoSpline(fArr7, fArr3, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j11 / 1000000);
        Pair<V, Easing> pair = this.keyframes.get(clampPlayTime);
        if (pair != null) {
            return pair.getFirst();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return v12;
        }
        if (clampPlayTime <= 0) {
            return v11;
        }
        init(v11, v12, v13);
        int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
        V v14 = this.valueVector;
        g0.m(v14);
        MonoSpline monoSpline = this.monoSpline;
        g0.m(monoSpline);
        monoSpline.getPos(getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime), v14, findEntryForTimeMillis);
        return v14;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j11 / 1000000);
        init(v11, v12, v13);
        int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
        V v14 = this.velocityVector;
        g0.m(v14);
        MonoSpline monoSpline = this.monoSpline;
        g0.m(monoSpline);
        monoSpline.getSlope(getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime), v14, findEntryForTimeMillis);
        return v14;
    }
}
