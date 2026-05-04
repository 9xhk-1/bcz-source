package com.baicizhan.client.business.util;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class BczPermissions {
    public static final int $stable = 0;

    @m80.k
    public static final BczPermissions INSTANCE = new BczPermissions();

    private BczPermissions() {
    }

    public final boolean getPhotoGranted() {
        return nc.b.b().getBoolean("bcz_permission_photo", false);
    }

    public final void setPhotoGranted(boolean z11) {
        nc.b.b().j("bcz_permission_photo", z11);
    }
}
