package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,1038:1\n215#2,2:1039\n215#2,2:1041\n65#3:1043\n65#3:1044\n65#3:1045\n70#3:1047\n71#4:1046\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n246#1:1039,2\n259#1:1041,2\n301#1:1043\n304#1:1044\n335#1:1045\n469#1:1047\n418#1:1046\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;

    @k
    private ArcSpline arcSpline;

    @k
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;

    @k
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;

    @l
    private V lastInitialValue;

    @l
    private V lastTargetValue;

    @k
    private int[] modes;

    @k
    private float[] posArray;

    @k
    private float[] slopeArray;

    @k
    private float[] times;

    @k
    private final IntList timestamps;

    @l
    private V valueVector;

    @l
    private V velocityVector;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i11, int i12, Easing easing, int i13, v vVar) {
        this(intList, intObjectMap, i11, i12, easing, i13);
    }

    private final int findEntryForTimeMillis(int i11) {
        int binarySearch$default = IntList.binarySearch$default(this.timestamps, i11, 0, 0, 6, null);
        return binarySearch$default < -1 ? -(binarySearch$default + 2) : binarySearch$default;
    }

    private final float getEasedTime(int i11) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(i11), i11, false);
    }

    private final float getEasedTimeFromIndex(int i11, int i12, boolean z11) {
        Easing easing;
        float f11;
        IntList intList = this.timestamps;
        if (i11 >= intList._size - 1) {
            f11 = i12;
        } else {
            int i13 = intList.get(i11);
            int i14 = this.timestamps.get(i11 + 1);
            if (i12 == i13) {
                f11 = i13;
            } else {
                int i15 = i14 - i13;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i13);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f12 = i15;
                float transform = easing.transform((i12 - i13) / f12);
                if (z11) {
                    return transform;
                }
                f11 = (f12 * transform) + i13;
            }
        }
        return f11 / 1000;
    }

    private final void init(V v11, V v12, V v13) {
        ArcSpline arcSpline;
        ArcSpline arcSpline2;
        float[] fArr;
        ArcSpline arcSpline3 = this.arcSpline;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        boolean z11 = arcSpline3 != arcSpline;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v11);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v13);
            int i11 = this.timestamps._size;
            float[] fArr2 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr2[i12] = this.timestamps.get(i12) / 1000;
            }
            this.times = fArr2;
            int i13 = this.timestamps._size;
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(this.timestamps.get(i14));
                int m200getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m200getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m143equalsimpl0(m200getArcMode9TMq4, ArcMode.Companion.m149getArcLinear9TMq4())) {
                    z11 = true;
                }
                iArr[i14] = m200getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z11) {
            ArcSpline arcSpline4 = this.arcSpline;
            arcSpline2 = VectorizedAnimationSpecKt.EmptyArcSpline;
            if (arcSpline4 != arcSpline2 && g0.g(this.lastInitialValue, v11) && g0.g(this.lastTargetValue, v12)) {
                return;
            }
            this.lastInitialValue = v11;
            this.lastTargetValue = v12;
            int size$animation_core_release = (v11.getSize$animation_core_release() % 2) + v11.getSize$animation_core_release();
            this.posArray = new float[size$animation_core_release];
            this.slopeArray = new float[size$animation_core_release];
            int i15 = this.timestamps._size;
            float[][] fArr3 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = this.timestamps.get(i16);
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i17);
                if (i17 == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i18 = 0; i18 < size$animation_core_release; i18++) {
                        fArr[i18] = v11.get$animation_core_release(i18);
                    }
                } else if (i17 == getDurationMillis() && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i19 = 0; i19 < size$animation_core_release; i19++) {
                        fArr[i19] = v12.get$animation_core_release(i19);
                    }
                } else {
                    g0.m(vectorizedKeyframeSpecElementInfo2);
                    V vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                    float[] fArr4 = new float[size$animation_core_release];
                    for (int i21 = 0; i21 < size$animation_core_release; i21++) {
                        fArr4[i21] = vectorValue.get$animation_core_release(i21);
                    }
                    fArr = fArr4;
                }
                fArr3[i16] = fArr;
            }
            this.arcSpline = new ArcSpline(this.modes, this.times, fArr3);
        }
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
        ArcSpline arcSpline;
        V vectorValue;
        V vectorValue2;
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j11 / 1000000);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(clampPlayTime);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return v12;
        }
        if (clampPlayTime <= 0) {
            return v11;
        }
        init(v11, v12, v13);
        V v14 = this.valueVector;
        g0.m(v14);
        ArcSpline arcSpline2 = this.arcSpline;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        int i11 = 0;
        if (arcSpline2 != arcSpline) {
            float easedTime = getEasedTime(clampPlayTime);
            float[] fArr = this.posArray;
            this.arcSpline.getPos(easedTime, fArr);
            int length = fArr.length;
            while (i11 < length) {
                v14.set$animation_core_release(i11, fArr[i11]);
                i11++;
            }
            return v14;
        }
        int findEntryForTimeMillis = findEntryForTimeMillis(clampPlayTime);
        float easedTimeFromIndex = getEasedTimeFromIndex(findEntryForTimeMillis, clampPlayTime, true);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(this.timestamps.get(findEntryForTimeMillis));
        if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != null) {
            v11 = vectorValue2;
        }
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(this.timestamps.get(findEntryForTimeMillis + 1));
        if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != null) {
            v12 = vectorValue;
        }
        int size$animation_core_release = v14.getSize$animation_core_release();
        while (i11 < size$animation_core_release) {
            v14.set$animation_core_release(i11, (v11.get$animation_core_release(i11) * (1 - easedTimeFromIndex)) + (v12.get$animation_core_release(i11) * easedTimeFromIndex));
            i11++;
        }
        return v14;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        ArcSpline arcSpline;
        long clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j11 / 1000000);
        if (clampPlayTime < 0) {
            return v13;
        }
        init(v11, v12, v13);
        V v14 = this.velocityVector;
        g0.m(v14);
        ArcSpline arcSpline2 = this.arcSpline;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        int i11 = 0;
        if (arcSpline2 != arcSpline) {
            float easedTime = getEasedTime((int) clampPlayTime);
            float[] fArr = this.slopeArray;
            this.arcSpline.getSlope(easedTime, fArr);
            int length = fArr.length;
            while (i11 < length) {
                v14.set$animation_core_release(i11, fArr[i11]);
                i11++;
            }
        } else {
            AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, v11, v12, v13);
            AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, v11, v12, v13);
            int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
            while (i11 < size$animation_core_release) {
                v14.set$animation_core_release(i11, (valueFromMillis.get$animation_core_release(i11) - valueFromMillis2.get$animation_core_release(i11)) * 1000.0f);
                i11++;
            }
        }
        return v14;
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i11, int i12, Easing easing, int i13) {
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        ArcSpline arcSpline;
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i11;
        this.delayMillis = i12;
        this.defaultEasing = easing;
        this.initialArcMode = i13;
        iArr = VectorizedAnimationSpecKt.EmptyIntArray;
        this.modes = iArr;
        fArr = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.times = fArr;
        fArr2 = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.posArray = fArr2;
        fArr3 = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.slopeArray = fArr3;
        arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
        this.arcSpline = arcSpline;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i11, int i12, int i13, v vVar) {
        this(map, i11, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VectorizedKeyframesSpec(@m80.k java.util.Map<java.lang.Integer, ? extends kotlin.Pair<? extends V, ? extends androidx.compose.animation.core.Easing>> r9, int r10, int r11) {
        /*
            r8 = this;
            androidx.collection.MutableIntList r1 = new androidx.collection.MutableIntList
            int r0 = r9.size()
            int r0 = r0 + 2
            r1.<init>(r0)
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.add(r2)
            goto L13
        L2d:
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r9.containsKey(r2)
            if (r2 != 0) goto L3b
            r1.add(r0, r0)
        L3b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            boolean r2 = r9.containsKey(r2)
            if (r2 != 0) goto L48
            r1.add(r10)
        L48:
            r1.sort()
            androidx.collection.MutableIntObjectMap r2 = new androidx.collection.MutableIntObjectMap
            r3 = 1
            r4 = 0
            r2.<init>(r0, r3, r4)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L5a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo r5 = new androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo
            java.lang.Object r6 = r0.getFirst()
            androidx.compose.animation.core.AnimationVector r6 = (androidx.compose.animation.core.AnimationVector) r6
            java.lang.Object r0 = r0.getSecond()
            androidx.compose.animation.core.Easing r0 = (androidx.compose.animation.core.Easing) r0
            androidx.compose.animation.core.ArcMode$Companion r7 = androidx.compose.animation.core.ArcMode.Companion
            int r7 = r7.m149getArcLinear9TMq4()
            r5.<init>(r6, r0, r7, r4)
            r2.set(r3, r5)
            goto L5a
        L91:
            androidx.compose.animation.core.Easing r5 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            androidx.compose.animation.core.ArcMode$Companion r9 = androidx.compose.animation.core.ArcMode.Companion
            int r6 = r9.m149getArcLinear9TMq4()
            r7 = 0
            r0 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.VectorizedKeyframesSpec.<init>(java.util.Map, int, int):void");
    }
}
