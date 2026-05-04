package com.sina.weibo.sdk.openapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.share.WbShareCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface IWBAPI {
    void authorize(Activity activity, WbAuthListener wbAuthListener);

    void authorizeCallback(Activity activity, int i11, int i12, Intent intent);

    void authorizeClient(Activity activity, WbAuthListener wbAuthListener);

    void authorizeWeb(Activity activity, WbAuthListener wbAuthListener);

    void doResultIntent(Intent intent, WbShareCallback wbShareCallback);

    boolean isWBAppInstalled();

    boolean isWBAppSupportMultipleImage();

    void registerApp(Context context, AuthInfo authInfo);

    void registerApp(Context context, AuthInfo authInfo, SdkListener sdkListener);

    void setLoggerEnable(boolean z11);

    void setShareUriParseV2(boolean z11);

    void shareMessage(Activity activity, WeiboMultiMessage weiboMultiMessage, boolean z11);
}
