package androidx.compose.ui;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SensitiveContentKt {
    @k
    public static final Modifier sensitiveContent(@k Modifier modifier, boolean z11) {
        return modifier.then(new SensitiveNodeElement(z11));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return sensitiveContent(modifier, z11);
    }
}
