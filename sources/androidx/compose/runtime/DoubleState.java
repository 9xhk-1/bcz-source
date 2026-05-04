package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface DoubleState extends State<Double> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        @k
        public static Double getValue(@k DoubleState doubleState) {
            return Double.valueOf(DoubleState.access$getValue$jd(doubleState));
        }
    }

    static /* synthetic */ double access$getValue$jd(DoubleState doubleState) {
        return super.getValue().doubleValue();
    }

    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @k
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }
}
