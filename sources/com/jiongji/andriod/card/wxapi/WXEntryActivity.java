package com.jiongji.andriod.card.wxapi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b9.a;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.google.gson.d;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WXEntryActivity extends BaseActivity implements IWXAPIEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final String f39039b = "WXEntryActivity";

    /* renamed from: a, reason: collision with root package name */
    public IWXAPI f39040a;

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, a.f6458g, false);
        this.f39040a = createWXAPI;
        createWXAPI.handleIntent(getIntent(), this);
        c.i(f39039b, "[FLAG,taskid, isRoot], [%d, %d, %b]", Integer.valueOf(getIntent().getFlags()), Integer.valueOf(getTaskId()), Boolean.valueOf(isTaskRoot()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f39040a.handleIntent(intent, this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    @SuppressLint({"WrongConstant"})
    public void onReq(BaseReq baseReq) {
        String str;
        String str2 = f39039b;
        c.i(str2, "request [%s] [%d]", baseReq, Integer.valueOf(baseReq.getType()));
        if ((baseReq instanceof ShowMessageFromWX.Req) && baseReq.getType() == 4) {
            String str3 = ((ShowMessageFromWX.Req) baseReq).message.messageExt;
            c.b(str2, "message: %s", str3);
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bcz://com.baicizhan/launch/wechat");
            if (str3 == null) {
                str = "";
            } else {
                str = "?intent=" + str3;
            }
            sb2.append(str);
            intent.setData(Uri.parse(sb2.toString()));
            startActivity(intent);
            finish();
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        c.i(f39039b, "response %s", new d().z(baseResp));
        if (baseResp instanceof SendAuth.Resp) {
            SendAuth.Resp resp = (SendAuth.Resp) baseResp;
            int i11 = resp.errCode;
            if (i11 == -4) {
                WeixinAuthHelper.A().o();
            } else if (i11 == -2) {
                WeixinAuthHelper.A().o();
            } else if (i11 != 0) {
                WeixinAuthHelper.A().o();
            } else {
                WeixinAuthHelper.A().B(resp.code);
            }
        } else if (baseResp instanceof SendMessageToWX.Resp) {
            int i12 = ((SendMessageToWX.Resp) baseResp).errCode;
            if (i12 == -2) {
                WeixinAuthHelper.A().q();
            } else if (i12 != 0) {
                WeixinAuthHelper.A().I();
            } else {
                WeixinAuthHelper.A().u();
            }
        } else if (baseResp instanceof SubscribeMessage.Resp) {
            SubscribeMessage.Resp resp2 = (SubscribeMessage.Resp) baseResp;
            int i13 = resp2.errCode;
            if (i13 == -2) {
                WeixinAuthHelper.A().p();
            } else if (i13 != 0) {
                WeixinAuthHelper.A().n(resp2.errCode, resp2.errStr);
            } else {
                WeixinAuthHelper.g gVar = new WeixinAuthHelper.g();
                gVar.f16037a = resp2.openId;
                gVar.f16038b = resp2.templateID;
                gVar.f16039c = resp2.action;
                gVar.f16041e = resp2.reserved;
                gVar.f16040d = resp2.scene;
                WeixinAuthHelper.A().t(gVar);
            }
        } else if (baseResp.getType() == 19) {
        }
        finish();
    }
}
