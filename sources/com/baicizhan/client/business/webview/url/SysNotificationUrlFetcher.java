package com.baicizhan.client.business.webview.url;

import android.app.Application;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.AdCommonHelper;
import com.baicizhan.online.notify.NotifyResult;
import com.google.gson.d;
import ha.c;
import i9.m;
import pb.a;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SysNotificationUrlFetcher extends UrlFetcher {
    public SysNotificationUrlFetcher(String defaultUrl) {
        super(defaultUrl);
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public String fetch() throws Exception {
        Application a11 = a.a();
        UserRecord p11 = x.r().p();
        String token = p11 != null ? p11.getToken() : null;
        if (TextUtils.isEmpty(token)) {
            token = m.d();
        }
        NotifyResult notifyResult = c.a(a11, token).get_latest_notify_v2(AdCommonHelper.INSTANCE.buildAdDeviceInfoSync());
        qb.c.i("GAO", "SysNotificationUrlFetcher %s", new d().z(notifyResult));
        return notifyResult != null ? notifyResult.service_url : this.mDefaultUrl;
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public rx.d scheduler() {
        return bc0.c.a();
    }
}
