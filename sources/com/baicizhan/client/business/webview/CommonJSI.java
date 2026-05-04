package com.baicizhan.client.business.webview;

import android.app.Activity;
import com.baicizhan.client.business.store.NewMallActivity;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.webview.JsonParams;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CommonJSI {
    protected final Activity activity;

    public CommonJSI(Activity activity) {
        this.activity = activity;
    }

    public void copyToClipboard(final String content) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.CommonJSI.4
            @Override // java.lang.Runnable
            public void run() {
                SystemUtil.copyToClipboard(CommonJSI.this.activity, content);
            }
        });
    }

    public void feedback() {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.CommonJSI.2
            @Override // java.lang.Runnable
            public void run() {
                BczWebHelperKt.startFeedBack(CommonJSI.this.activity);
            }
        });
    }

    public String getUploadInfo(String days) {
        return null;
    }

    public void jumpMall(String url) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        NewMallActivity.O0(activity, x.r().p(), url);
    }

    public void openNativeAction(final String intent) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.CommonJSI.1
            @Override // java.lang.Runnable
            public void run() {
                if (CommonJSI.this.activity.isFinishing()) {
                    return;
                }
                BczWebHelperKt.startNewWebActivity(CommonJSI.this.activity, JsonParams.WebActivityIntentI.fromJson(intent));
            }
        });
    }

    public void report(final int id2) {
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.CommonJSI.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public void dismissDialog() {
    }

    public void exit() {
    }

    public void getNetworkType() {
    }

    public void getShareableChannels() {
    }

    public void getWechatUserInfo() {
    }

    public void retry() {
    }

    public void shareDefault() {
    }

    public void authWeixinSubscribeMsg(String input) {
    }

    public void broadcastIntent(String meta) {
    }

    public void enterHeroActivity(final String intent) {
    }

    public void setShareState(final String state) {
    }

    public void setTitle(final String titleJson) {
    }

    public void shareEx(String param) {
    }

    public void showDialog(String param) {
    }

    public void startLocating(String option) {
    }

    public void uploadImage(String meta) {
    }

    public void uploadLog(String days) {
    }

    @Deprecated
    public void share(final String url, final String title, final String desc, final String img) {
    }
}
