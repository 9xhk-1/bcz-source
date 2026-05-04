package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MutableLongState extends LongState, MutableState<Long> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        @k
        public static Long getValue(@k MutableLongState mutableLongState) {
            return Long.valueOf(MutableLongState.access$getValue$jd(mutableLongState));
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static void setValue(@k MutableLongState mutableLongState, long j11) {
            MutableLongState.super.setValue(j11);
        }
    }

    static /* synthetic */ long access$getValue$jd(MutableLongState mutableLongState) {
        return super.getValue().longValue();
    }

    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    void setLongValue(long j11);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Long l11) {
        setValue(l11.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @k
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    default void setValue(long j11) {
        setLongValue(j11);
    }
}
