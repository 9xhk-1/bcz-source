package com.heytap.mcssdk.parser;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class MessageParser implements Parser {
    public static List<BaseMode> getMessageList(Context context, Intent intent) {
        int i11;
        BaseMode parse;
        if (intent == null) {
            return null;
        }
        try {
            i11 = Integer.parseInt(CryptoUtil.sdkDecrypt(intent.getStringExtra("type")));
        } catch (Exception e11) {
            LogUtil.e("MessageParser--getMessageByIntent--Exception:" + e11.getMessage());
            i11 = 4096;
        }
        LogUtil.d("MessageParser--getMessageByIntent--type:" + i11);
        ArrayList arrayList = new ArrayList();
        for (Parser parser : PushService.getInstance().getParsers()) {
            if (parser != null && (parse = parser.parse(context, i11, intent)) != null) {
                arrayList.add(parse);
            }
        }
        return arrayList;
    }

    public abstract BaseMode parseMessageByIntent(Intent intent, int i11);
}
