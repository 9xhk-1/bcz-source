package com.baicizhan.client.business.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import b9.j;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.auth.WBShareActivity;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.share.WbShareCallback;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WBShareActivity extends BaseActivity implements WbShareCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16008a = "WBShareActivity";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16009b = "share_param_key";

    public static void K0(Context context, ShareParams shareParams) {
        Intent intent = new Intent(context, (Class<?>) WBShareActivity.class);
        intent.putExtra(f16009b, shareParams);
        context.startActivity(intent);
    }

    public final /* synthetic */ void J0() {
        ShareParams shareParams = (ShareParams) getIntent().getParcelableExtra(f16009b);
        if (shareParams != null) {
            try {
                j.h().r(this, shareParams);
            } catch (Throwable th2) {
                finish();
                c.c(f16008a, "WB init failed retry", th2);
            }
        } else {
            finish();
        }
        getIntent().putExtra(f16009b, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        j.h().m(data, this);
        finish();
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onCancel() {
        j.h().onCancel();
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onComplete() {
        j.h().onComplete();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j.h().j(this);
        this.mHandler.postDelayed(new Runnable() { // from class: b9.i
            @Override // java.lang.Runnable
            public final void run() {
                WBShareActivity.this.J0();
            }
        }, 500L);
    }

    @Override // com.sina.weibo.sdk.share.WbShareCallback
    public void onError(UiError uiError) {
        j.h().onError(uiError);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        j.h().m(intent, this);
    }
}
