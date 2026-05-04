package com.jiongji.andriod.card.wxapi;

import android.content.Intent;
import android.os.Bundle;
import b9.a;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.webview.PayManager;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WXPayEntryActivity extends BaseActivity implements IWXAPIEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public IWXAPI f39041a;

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c.b("newmall", "enter WXPayEntry", new Object[0]);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, a.f6458g);
        this.f39041a = createWXAPI;
        createWXAPI.handleIntent(getIntent(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        c.b("newmall", "enter WXPayEntry", new Object[0]);
        setIntent(intent);
        this.f39041a.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp resp) {
        c.b("NEWMALL", "WXEntry onResp", new Object[0]);
        if (resp != null && resp.getType() == 5) {
            PayManager.getInstance().postWeixinPayResult(resp);
        }
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq req) {
    }
}
