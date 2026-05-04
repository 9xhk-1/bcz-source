package com.sina.weibo.sdk.auth;

import com.sina.weibo.sdk.common.UiError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface WbAuthListener {
    void onCancel();

    void onComplete(Oauth2AccessToken oauth2AccessToken);

    void onError(UiError uiError);
}
