package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ShareResultActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        try {
            intent = getIntent();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getIntExtra("start_flag", -1) != 1002) {
            finish();
            return;
        }
        String action = intent.getAction();
        if ("com.sina.weibo.sdk.action.ACTION_SDK_REQ_ACTIVITY".equals(action)) {
            intent.setClassName(this, "com.sina.weibo.sdk.share.ShareTransActivity");
        } else if ("com.sina.weibo.sdk.action.ACTION_SDK_REQ_STORY".equals(action)) {
            intent.setClassName(this, "com.sina.weibo.sdk.share.ShareStoryActivity");
        }
        startActivity(intent);
        finish();
    }
}
