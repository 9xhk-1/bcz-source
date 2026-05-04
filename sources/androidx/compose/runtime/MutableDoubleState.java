package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        @k
        public static Double getValue(@k MutableDoubleState mutableDoubleState) {
            return Double.valueOf(MutableDoubleState.access$getValue$jd(mutableDoubleState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void setValue(@k MutableDoubleState mutableDoubleState, double d11) {
            MutableDoubleState.super.setValue(d11);
        }
    }

    static /* synthetic */ double access$getValue$jd(MutableDoubleState mutableDoubleState) {
        return super.getValue().doubleValue();
    }

    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    void setDoubleValue(double d11);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Double d11) {
        setValue(d11.doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @k
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    default void setValue(double d11) {
        setDoubleValue(d11);
    }
}
