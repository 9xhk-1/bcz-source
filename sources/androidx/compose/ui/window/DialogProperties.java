package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;

    @k
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    @k
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }

    public DialogProperties(boolean z11, boolean z12, @k SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14) {
        this.dismissOnBackPress = z11;
        this.dismissOnClickOutside = z12;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z13;
        this.decorFitsSystemWindows = z14;
    }

    public /* synthetic */ DialogProperties(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, boolean z13, boolean z14, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i11 & 8) != 0 ? true : z13, (i11 & 16) != 0 ? true : z14);
    }

    public /* synthetic */ DialogProperties(boolean z11, boolean z12, boolean z13, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13);
    }

    public DialogProperties(boolean z11, boolean z12, boolean z13) {
        this(z11, z12, SecureFlagPolicy.Inherit, z13, true);
    }

    public /* synthetic */ DialogProperties(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ DialogProperties(boolean z11, boolean z12, SecureFlagPolicy secureFlagPolicy) {
        this(z11, z12, secureFlagPolicy, true, true);
    }
}
