package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1073:1\n382#2,4:1074\n354#2,6:1078\n364#2,3:1085\n367#2,9:1089\n386#2:1098\n425#2:1099\n425#2:1100\n1399#3:1084\n1270#3:1088\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n764#1:1074,4\n764#1:1078,6\n764#1:1085,3\n764#1:1089,9\n764#1:1098\n768#1:1099\n771#1:1100\n764#1:1084\n764#1:1088\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    @k
    private final KeyframesWithSplineSpecConfig<T> config;
    private float periodicBias;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 2)
    public static final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesWithSplineSpecConfig<T>) obj);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @k
        public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core_release(T t11) {
            return new KeyframesSpec.KeyframeEntity<>(t11, null, 0, 6, null);
        }
    }

    public KeyframesWithSplineSpec(@k KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
        this.periodicBias = Float.NaN;
    }

    @k
    public final KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i11;
        MutableIntObjectMap<KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        MutableIntList mutableIntList = new MutableIntList(keyframes$animation_core_release.getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(keyframes$animation_core_release.getSize());
        int[] iArr3 = keyframes$animation_core_release.keys;
        Object[] objArr3 = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j11) < 128) {
                            int i16 = (i12 << 3) + i15;
                            int i17 = iArr3[i16];
                            KeyframesSpec.KeyframeEntity keyframeEntity = (KeyframesSpec.KeyframeEntity) objArr3[i16];
                            mutableIntList.add(i17);
                            i11 = i13;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap.set(i17, new Pair(twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core_release()), keyframeEntity.getEasing$animation_core_release()));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i11 = i13;
                        }
                        j11 >>= i11;
                        i15++;
                        i13 = i11;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!keyframes$animation_core_release.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!keyframes$animation_core_release.containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        return new VectorizedMonoSplineKeyframesSpec(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis(), this.periodicBias);
    }

    public KeyframesWithSplineSpec(@k KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this(keyframesWithSplineSpecConfig);
        this.periodicBias = f11;
    }
}
