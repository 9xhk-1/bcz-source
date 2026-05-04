package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface LongState extends State<Long> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        @k
        public static Long getValue(@k LongState longState) {
            return Long.valueOf(LongState.access$getValue$jd(longState));
        }
    }

    static /* synthetic */ long access$getValue$jd(LongState longState) {
        return super.getValue().longValue();
    }

    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @k
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
