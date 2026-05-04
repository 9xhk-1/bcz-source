package com.sina.weibo.sdk.share;

import com.sina.weibo.sdk.common.UiError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface WbShareCallback {
    void onCancel();

    void onComplete();

    void onError(UiError uiError);
}
