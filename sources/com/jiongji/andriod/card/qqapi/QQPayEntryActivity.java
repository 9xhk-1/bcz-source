package com.jiongji.andriod.card.qqapi;

import android.content.Intent;
import android.os.Bundle;
import b9.a;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.webview.PayManager;
import com.tencent.mobileqq.openpay.api.IOpenApi;
import com.tencent.mobileqq.openpay.api.IOpenApiListener;
import com.tencent.mobileqq.openpay.api.OpenApiFactory;
import com.tencent.mobileqq.openpay.data.base.BaseResponse;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class QQPayEntryActivity extends BaseActivity implements IOpenApiListener {

    /* renamed from: a, reason: collision with root package name */
    public IOpenApi f39038a;

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IOpenApi openApiFactory = OpenApiFactory.getInstance(this, a.f6456e);
        this.f39038a = openApiFactory;
        openApiFactory.handleIntent(getIntent(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f39038a.handleIntent(intent, this);
    }

    @Override // com.tencent.mobileqq.openpay.api.IOpenApiListener
    public void onOpenResponse(BaseResponse baseResponse) {
        PayManager.getInstance().postQQPayResult(baseResponse);
        finish();
    }
}
