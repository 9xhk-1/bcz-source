package com.zx.sdk.api;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ZXApi {
    void addZXIDChangedListener(ZXIDChangedListener zXIDChangedListener);

    void allowPermissionDialog(boolean z11);

    void checkPermission(Activity activity, PermissionCallback permissionCallback);

    void getAuthToken(Callback callback);

    void getOpenID(Callback callback, Context context);

    void getSAID(String str, String str2, String str3, String str4, String str5, SAIDCallback sAIDCallback);

    void getTag(Callback callback);

    String getVersion();

    void getZXID(ZXIDListener zXIDListener);

    void init(Context context);

    String invoke(String str, String str2);

    boolean isAllowPermissionDialog();

    boolean isEnable();

    void setDebug(boolean z11);

    void setEnable(boolean z11);
}
