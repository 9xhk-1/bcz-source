package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e {
    public static boolean a(Context context, long j11, long j12) {
        p.d("ClientReportUtil", "report message: " + j11 + ", reportType: " + j12);
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(j12);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(j11));
        String b11 = z.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(b11)) {
            hashMap.put("remoteAppId", b11);
        }
        xVar.a(hashMap);
        com.vivo.push.e.a().a(xVar);
        return true;
    }

    public static boolean a(long j11, HashMap<String, String> hashMap) {
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(j11);
        xVar.a(hashMap);
        xVar.d();
        com.vivo.push.e.a().a(xVar);
        return true;
    }
}
