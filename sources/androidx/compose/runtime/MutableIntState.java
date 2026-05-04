package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        @k
        public static Integer getValue(@k MutableIntState mutableIntState) {
            return Integer.valueOf(MutableIntState.access$getValue$jd(mutableIntState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        public static void setValue(@k MutableIntState mutableIntState, int i11) {
            MutableIntState.super.setValue(i11);
        }
    }

    static /* synthetic */ int access$getValue$jd(MutableIntState mutableIntState) {
        return super.getValue().intValue();
    }

    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    void setIntValue(int i11);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        setValue(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @k
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    default void setValue(int i11) {
        setIntValue(i11);
    }
}
