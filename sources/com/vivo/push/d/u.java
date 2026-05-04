package com.vivo.push.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.common.Constants;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class u extends z {
    public u(com.vivo.push.o oVar) {
        super(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        Intent parseUri;
        String str;
        com.vivo.push.b.p pVar = (com.vivo.push.b.p) oVar;
        InsideNotificationItem f11 = pVar.f();
        if (f11 == null) {
            com.vivo.push.util.p.d("OnNotificationClickTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage a11 = com.vivo.push.util.q.a(f11);
        boolean equals = this.f45035a.getPackageName().equals(pVar.d());
        if (equals) {
            NotifyAdapterUtil.cancelNotify(this.f45035a);
        }
        if (equals) {
            com.vivo.push.b.x xVar = new com.vivo.push.b.x(1030L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("type", "2");
            hashMap.put(IntentConstant.MESSAGE_ID, String.valueOf(pVar.e()));
            hashMap.put(Constants.PARAM_PLATFORM, this.f45035a.getPackageName());
            Context context = this.f45035a;
            String b11 = com.vivo.push.util.z.b(context, context.getPackageName());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put("remoteAppId", b11);
            }
            xVar.a(hashMap);
            com.vivo.push.e.a().a(xVar);
            com.vivo.push.util.p.d("OnNotificationClickTask", "notification is clicked by skip type[" + a11.getSkipType() + "]");
            int skipType = a11.getSkipType();
            if (skipType == 1) {
                new Thread(new v(this, this.f45035a, a11.getParams())).start();
                a(a11);
                return;
            }
            if (skipType == 2) {
                String skipContent = a11.getSkipContent();
                if (!skipContent.startsWith("http://") && !skipContent.startsWith("https://")) {
                    com.vivo.push.util.p.a("OnNotificationClickTask", "url not legal");
                } else {
                    Uri parse = Uri.parse(skipContent);
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse);
                    intent.setFlags(268435456);
                    b(intent, a11.getParams());
                    try {
                        this.f45035a.startActivity(intent);
                    } catch (Exception unused) {
                        com.vivo.push.util.p.a("OnNotificationClickTask", "startActivity error : ".concat(String.valueOf(parse)));
                    }
                }
                a(a11);
                return;
            }
            if (skipType == 3) {
                a(a11);
                return;
            }
            if (skipType != 4) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "illegitmacy skip type error : " + a11.getSkipType());
                return;
            }
            String skipContent2 = a11.getSkipContent();
            try {
                parseUri = Intent.parseUri(skipContent2, 1);
                str = parseUri.getPackage();
            } catch (Exception e11) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "open activity error : ".concat(String.valueOf(skipContent2)), e11);
            }
            if (!TextUtils.isEmpty(str) && !this.f45035a.getPackageName().equals(str)) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "open activity error : local pkgName is " + this.f45035a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                return;
            }
            String packageName = parseUri.getComponent() == null ? null : parseUri.getComponent().getPackageName();
            if (!TextUtils.isEmpty(packageName) && !this.f45035a.getPackageName().equals(packageName)) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "open activity component error : local pkgName is " + this.f45035a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                return;
            }
            parseUri.setSelector(null);
            parseUri.setPackage(this.f45035a.getPackageName());
            parseUri.addFlags(335544320);
            b(parseUri, a11.getParams());
            ActivityInfo resolveActivityInfo = parseUri.resolveActivityInfo(this.f45035a.getPackageManager(), 65536);
            if (resolveActivityInfo != null && !resolveActivityInfo.exported) {
                com.vivo.push.util.p.a("OnNotificationClickTask", "activity is not exported : " + resolveActivityInfo.toString());
                return;
            } else {
                this.f45035a.startActivity(parseUri);
                a(a11);
                return;
            }
        }
        com.vivo.push.util.p.a("OnNotificationClickTask", "notify is " + a11 + " ; isMatch is " + equals);
    }

    private void a(UPSNotificationMessage uPSNotificationMessage) {
        com.vivo.push.m.c(new w(this, uPSNotificationMessage));
    }
}
