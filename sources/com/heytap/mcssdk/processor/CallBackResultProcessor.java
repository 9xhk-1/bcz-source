package com.heytap.mcssdk.processor;

import android.content.Context;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.mcssdk.mode.CallBackResult;
import com.heytap.mcssdk.utils.LogUtil;
import com.heytap.mcssdk.utils.ThreadUtil;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.BaseMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CallBackResultProcessor implements Processor {
    /* JADX INFO: Access modifiers changed from: private */
    public void processCallBackResult(CallBackResult callBackResult, PushService pushService) {
        int i11;
        if (callBackResult == null) {
            LogUtil.e("message is null , please check param of parseCommandMessage(2)");
        }
        if (pushService == null) {
            LogUtil.e("pushService is null , please check param of parseCommandMessage(2)");
            return;
        }
        if (pushService.getPushCallback() == null) {
            LogUtil.e("pushService.getPushCallback() is null , please check param of parseCommandMessage(2)");
            return;
        }
        int command = callBackResult.getCommand();
        if (command == 12287) {
            ICallBackResultService pushCallback = pushService.getPushCallback();
            if (pushCallback != null) {
                pushCallback.onError(callBackResult.getResponseCode(), callBackResult.getContent());
                return;
            }
            return;
        }
        if (command == 12298) {
            pushService.getPushCallback().onSetPushTime(callBackResult.getResponseCode(), callBackResult.getContent());
            return;
        }
        if (command == 12306) {
            pushService.getPushCallback().onGetPushStatus(callBackResult.getResponseCode(), Utils.parseInt(callBackResult.getContent()));
            return;
        }
        if (command == 12309) {
            pushService.getPushCallback().onGetNotificationStatus(callBackResult.getResponseCode(), Utils.parseInt(callBackResult.getContent()));
            return;
        }
        if (command == 12289) {
            if (callBackResult.getResponseCode() == 0) {
                pushService.setRegisterID(callBackResult.getContent());
            }
            pushService.getPushCallback().onRegister(callBackResult.getResponseCode(), callBackResult.getContent());
            return;
        }
        if (command == 12290) {
            pushService.getPushCallback().onUnRegister(callBackResult.getResponseCode());
            return;
        }
        switch (command) {
            case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
            case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                ISetAppNotificationCallBackService pushSetAppNotificationCallBack = pushService.getPushSetAppNotificationCallBack();
                if (pushSetAppNotificationCallBack != null) {
                    pushSetAppNotificationCallBack.onSetAppNotificationSwitch(callBackResult.getResponseCode());
                    break;
                }
                break;
            case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                try {
                    i11 = Integer.parseInt(callBackResult.getContent());
                } catch (Exception unused) {
                    i11 = 0;
                }
                IGetAppNotificationCallBackService pushGetAppNotificationCallBack = pushService.getPushGetAppNotificationCallBack();
                if (pushGetAppNotificationCallBack != null) {
                    pushGetAppNotificationCallBack.onGetAppNotificationSwitch(callBackResult.getResponseCode(), i11);
                    break;
                }
                break;
        }
    }

    @Override // com.heytap.mcssdk.processor.Processor
    public void process(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            final CallBackResult callBackResult = (CallBackResult) baseMode;
            LogUtil.d("mcssdk-CallBackResultProcessor:" + callBackResult.toString());
            ThreadUtil.executeOnUiThread(new Runnable() { // from class: com.heytap.mcssdk.processor.CallBackResultProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    CallBackResultProcessor.this.processCallBackResult(callBackResult, PushService.getInstance());
                }
            });
        }
    }
}
