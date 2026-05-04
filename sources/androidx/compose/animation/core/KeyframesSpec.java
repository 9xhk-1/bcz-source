package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1073:1\n382#2,4:1074\n354#2,6:1078\n364#2,3:1085\n367#2,9:1089\n386#2:1098\n425#2:1099\n425#2:1100\n1399#3:1084\n1270#3:1088\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n644#1:1074,4\n644#1:1078,6\n644#1:1085,3\n644#1:1089,9\n644#1:1098\n654#1:1099\n657#1:1100\n644#1:1084\n644#1:1088\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    @k
    private final KeyframesSpecConfig<T> config;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 8;
        private int arcMode;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i11, v vVar) {
            this(obj, easing, i11);
        }

        public boolean equals(@l Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return g0.g(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && g0.g(keyframeEntity.getEasing$animation_core_release(), getEasing$animation_core_release()) && ArcMode.m143equalsimpl0(keyframeEntity.arcMode, this.arcMode);
        }

        /* renamed from: getArcMode--9T-Mq4$animation_core_release, reason: not valid java name */
        public final int m151getArcMode9TMq4$animation_core_release() {
            return this.arcMode;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + ArcMode.m144hashCodeimpl(this.arcMode)) * 31) + getEasing$animation_core_release().hashCode();
        }

        /* renamed from: setArcMode-Rur9ykg$animation_core_release, reason: not valid java name */
        public final void m152setArcModeRur9ykg$animation_core_release(int i11) {
            this.arcMode = i11;
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i11, int i12, v vVar) {
            this(obj, (i12 & 2) != 0 ? EasingKt.getLinearEasing() : easing, (i12 & 4) != 0 ? ArcMode.Companion.m149getArcLinear9TMq4() : i11, null);
        }

        private KeyframeEntity(T t11, Easing easing, int i11) {
            super(t11, easing, null);
            this.arcMode = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 2)
    @u0({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1073:1\n1#2:1074\n26#3:1075\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig\n*L\n594#1:1075\n*E\n"})
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity at(Object obj, int i11) {
            return at((KeyframesSpecConfig<T>) obj, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object obj, float f11) {
            return atFraction((KeyframesSpecConfig<T>) obj, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesSpecConfig<T>) obj);
        }

        @k
        /* renamed from: using-ngzHuyU, reason: not valid java name */
        public final KeyframeEntity<T> m153usingngzHuyU(@k KeyframeEntity<T> keyframeEntity, int i11) {
            keyframeEntity.m152setArcModeRur9ykg$animation_core_release(i11);
            return keyframeEntity;
        }

        @n(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @w0(expression = "this using easing", imports = {}))
        public final void with(@k KeyframeEntity<T> keyframeEntity, @k Easing easing) {
            keyframeEntity.setEasing$animation_core_release(easing);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @k
        public KeyframeEntity<T> at(T t11, @IntRange(from = 0) int i11) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t11, null, 0, 6, null);
            getKeyframes$animation_core_release().set(i11, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @k
        public KeyframeEntity<T> atFraction(T t11, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
            return at((KeyframesSpecConfig<T>) t11, Math.round(getDurationMillis() * f11));
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @k
        public KeyframeEntity<T> createEntityFor$animation_core_release(T t11) {
            return new KeyframeEntity<>(t11, null, 0, 6, null);
        }
    }

    public KeyframesSpec(@k KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    @k
    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i11;
        MutableIntList mutableIntList = new MutableIntList(this.config.getKeyframes$animation_core_release().getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(this.config.getKeyframes$animation_core_release().getSize());
        MutableIntObjectMap<KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr3 = keyframes$animation_core_release.keys;
        Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr3 = keyframes$animation_core_release.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr3[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j11) < 128) {
                            int i16 = (i12 << 3) + i15;
                            int i17 = iArr3[i16];
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr[i16];
                            mutableIntList.add(i17);
                            i11 = i13;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            mutableIntObjectMap.set(i17, new VectorizedKeyframeSpecElementInfo(twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core_release()), keyframeEntity.getEasing$animation_core_release(), keyframeEntity.m151getArcMode9TMq4$animation_core_release(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i11 = i13;
                        }
                        j11 >>= i11;
                        i15++;
                        i13 = i11;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.getKeyframes$animation_core_release().containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!this.config.getKeyframes$animation_core_release().containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        return new VectorizedKeyframesSpec<>(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis(), EasingKt.getLinearEasing(), ArcMode.Companion.m149getArcLinear9TMq4(), null);
    }
}
