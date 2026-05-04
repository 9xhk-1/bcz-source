package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SecureFlagPolicy_androidKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean shouldApplySecureFlag(@k SecureFlagPolicy secureFlagPolicy, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return z11;
        }
        throw new NoWhenBranchMatchedException();
    }
}
