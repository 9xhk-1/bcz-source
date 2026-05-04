package com.mob.secverify.common.callback;

import com.mob.secverify.common.exception.VerifyException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface InternalCallback<T> {
    void onFailure(VerifyException verifyException);

    void onSuccess(T t11);
}
