package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final int flags;
    private final boolean inheritSecurePolicy;
    private final boolean usePlatformDefaultWidth;

    public PopupProperties(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.flags = i11;
        this.inheritSecurePolicy = z11;
        this.dismissOnBackPress = z12;
        this.dismissOnClickOutside = z13;
        this.excludeFromSystemGesture = z14;
        this.usePlatformDefaultWidth = z15;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.flags == popupProperties.flags && this.inheritSecurePolicy == popupProperties.inheritSecurePolicy && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth;
    }

    public final boolean getClippingEnabled() {
        return (this.flags & 512) == 0;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final int getFlags$ui_release() {
        return this.flags;
    }

    public final boolean getFocusable() {
        return (this.flags & 8) == 0;
    }

    public final boolean getInheritSecurePolicy$ui_release() {
        return this.inheritSecurePolicy;
    }

    @k
    public final SecureFlagPolicy getSecurePolicy() {
        return this.inheritSecurePolicy ? SecureFlagPolicy.Inherit : (this.flags & 8192) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((this.flags * 31) + Boolean.hashCode(this.inheritSecurePolicy)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }

    public /* synthetic */ PopupProperties(int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? true : z13, (i12 & 16) != 0 ? true : z14, (i12 & 32) != 0 ? false : z15);
    }

    public /* synthetic */ PopupProperties(boolean z11, boolean z12, boolean z13, boolean z14, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13, (i11 & 8) != 0 ? true : z14);
    }

    public PopupProperties(boolean z11, boolean z12, boolean z13, boolean z14) {
        this(z11, z12, z13, SecureFlagPolicy.Inherit, true, z14);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ PopupProperties(boolean r2, boolean r3, boolean r4, androidx.compose.ui.window.SecureFlagPolicy r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.v r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            androidx.compose.ui.window.SecureFlagPolicy r5 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.v):void");
    }

    public PopupProperties(boolean z11, boolean z12, boolean z13, @k SecureFlagPolicy secureFlagPolicy, boolean z14, boolean z15) {
        this(z11, z12, z13, secureFlagPolicy, z14, z15, false);
    }

    public /* synthetic */ PopupProperties(boolean z11, boolean z12, boolean z13, SecureFlagPolicy secureFlagPolicy, boolean z14, boolean z15, boolean z16, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? true : z13, (i11 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i11 & 16) != 0 ? true : z14, (i11 & 32) != 0 ? true : z15, (i11 & 64) != 0 ? false : z16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PopupProperties(boolean r1, boolean r2, boolean r3, @m80.k androidx.compose.ui.window.SecureFlagPolicy r4, boolean r5, boolean r6, boolean r7) {
        /*
            r0 = this;
            int r1 = androidx.compose.ui.window.AndroidPopup_androidKt.access$createFlags(r1, r4, r6)
            androidx.compose.ui.window.SecureFlagPolicy r6 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
            if (r4 != r6) goto L10
            r4 = 1
        L9:
            r6 = r5
            r5 = r3
            r3 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L12
        L10:
            r4 = 0
            goto L9
        L12:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, boolean):void");
    }
}
