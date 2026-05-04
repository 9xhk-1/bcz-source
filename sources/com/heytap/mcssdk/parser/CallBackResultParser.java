package com.heytap.mcssdk.parser;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.constant.IntentConstant;
import com.heytap.mcssdk.mode.CallBackResult;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;
import com.heytap.msp.push.mode.BaseMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CallBackResultParser extends MessageParser {
    @Override // com.heytap.mcssdk.parser.Parser
    public BaseMode parse(Context context, int i11, Intent intent) {
        if (4105 == i11) {
            return parseMessageByIntent(intent, i11);
        }
        return null;
    }

    @Override // com.heytap.mcssdk.parser.MessageParser
    public BaseMode parseMessageByIntent(Intent intent, int i11) {
        try {
            CallBackResult callBackResult = new CallBackResult();
            callBackResult.setCommand(Integer.parseInt(CryptoUtil.sdkDecrypt(intent.getStringExtra(IntentConstant.COMMAND))));
            callBackResult.setResponseCode(Integer.parseInt(CryptoUtil.sdkDecrypt(intent.getStringExtra("code"))));
            callBackResult.setContent(CryptoUtil.sdkDecrypt(intent.getStringExtra("content")));
            callBackResult.setAppKey(CryptoUtil.sdkDecrypt(intent.getStringExtra(IntentConstant.APP_KEY)));
            callBackResult.setAppSecret(CryptoUtil.sdkDecrypt(intent.getStringExtra(IntentConstant.APP_SECRET)));
            callBackResult.setAppPackage(CryptoUtil.sdkDecrypt(intent.getStringExtra(IntentConstant.APP_PACKAGE)));
            LogUtil.d("OnHandleIntent-message:" + callBackResult.toString());
            return callBackResult;
        } catch (Exception e11) {
            LogUtil.d("OnHandleIntent--" + e11.getMessage());
            return null;
        }
    }
}
