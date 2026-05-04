package com.mob.commons;

import com.mob.secverify.SecPure;
import com.mob.tools.proguard.ClassKeeper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SECVERIFY implements MobProduct, ClassKeeper {
    @Override // com.mob.commons.MobProduct
    public String getProductTag() {
        return SecPure.sdkTag;
    }

    @Override // com.mob.commons.MobProduct
    public int getSdkver() {
        return SecPure.SDK_VERSION_CODE;
    }
}
