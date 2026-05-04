package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface IBridgeActivityDelegate {
    int getRequestCode();

    void onBridgeActivityCreate(Activity activity);

    void onBridgeActivityDestroy();

    boolean onBridgeActivityResult(int i11, int i12, Intent intent);

    void onBridgeConfigurationChanged();

    void onKeyUp(int i11, KeyEvent keyEvent);
}
