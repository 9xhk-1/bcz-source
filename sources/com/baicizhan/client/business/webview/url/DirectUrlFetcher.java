package com.baicizhan.client.business.webview.url;

import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DirectUrlFetcher extends UrlFetcher {
    public DirectUrlFetcher(String defaultUrl) {
        super(defaultUrl);
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public String fetch() {
        return this.mDefaultUrl;
    }

    @Override // com.baicizhan.client.business.webview.url.UrlFetcher
    public d scheduler() {
        return null;
    }
}
