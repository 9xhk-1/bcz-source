package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface IntState extends State<Integer> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        @k
        public static Integer getValue(@k IntState intState) {
            return Integer.valueOf(IntState.access$getValue$jd(intState));
        }
    }

    static /* synthetic */ int access$getValue$jd(IntState intState) {
        return super.getValue().intValue();
    }

    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @k
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
