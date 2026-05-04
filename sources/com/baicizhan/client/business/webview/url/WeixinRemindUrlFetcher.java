package com.baicizhan.client.business.webview.url;

import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.RandomStringCreator;
import java.util.Locale;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WeixinRemindUrlFetcher extends UrlFetcher {
    public WeixinRemindUrlFetcher(String defaultUrl) {
        super(defaultUrl);
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public String fetch() throws Exception {
        return String.format(Locale.CHINA, "%s/group/%s/index?wx_bind_alert", PathUtil.getDataDns(), RandomStringCreator.bornNumCharString());
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public d scheduler() {
        return null;
    }
}
