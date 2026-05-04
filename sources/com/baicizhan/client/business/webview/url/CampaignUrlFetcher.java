package com.baicizhan.client.business.webview.url;

import com.baicizhan.client.business.thrift.c;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.online.bs_users.BSUsers;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CampaignUrlFetcher extends UrlFetcher {
    public CampaignUrlFetcher(String defaultUrl) {
        super(defaultUrl);
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public String fetch() throws Exception {
        return ((BSUsers.Client) new l("/rpc/users").e(false).f(c.f16594v).c(1).a()).get_activity_url();
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public d scheduler() {
        return bc0.c.a();
    }
}
