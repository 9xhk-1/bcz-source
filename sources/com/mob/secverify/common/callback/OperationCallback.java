package com.mob.secverify.common.callback;

import com.mob.secverify.common.exception.VerifyException;
import com.mob.tools.proguard.PublicMemberKeeper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class OperationCallback<T> implements PublicMemberKeeper {
    private boolean canceled;

    public boolean isCanceled() {
        return this.canceled;
    }

    public abstract void onComplete(T t11);

    public abstract void onFailure(VerifyException verifyException);

    public void setCanceled(boolean z11) {
        this.canceled = z11;
    }
}
