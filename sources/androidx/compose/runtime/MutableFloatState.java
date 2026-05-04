package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        @k
        public static Float getValue(@k MutableFloatState mutableFloatState) {
            return Float.valueOf(MutableFloatState.access$getValue$jd(mutableFloatState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        public static void setValue(@k MutableFloatState mutableFloatState, float f11) {
            MutableFloatState.super.setValue(f11);
        }
    }

    static /* synthetic */ float access$getValue$jd(MutableFloatState mutableFloatState) {
        return super.getValue().floatValue();
    }

    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    void setFloatValue(float f11);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Float f11) {
        setValue(f11.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @k
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    default void setValue(float f11) {
        setFloatValue(f11);
    }
}
