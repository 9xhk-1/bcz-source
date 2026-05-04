package com.baicizhan.client.business.webview.url;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import q9.x;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class UrlFetcher {
    public static final int STRATEGY_CAMPAIGN = 1;
    public static final int STRATEGY_DIRECT = 0;
    public static final int STRATEGY_SYS_NOTIFICATION = 2;
    public static final int STRATEGY_WEIXIN_REMIND = 3;
    protected final String mDefaultUrl;

    public UrlFetcher(String defaultUrl) {
        this.mDefaultUrl = defaultUrl;
    }

    public static c<String> fetchUrl(final UrlFetcher fetcher) {
        c<String> z22 = c.z2(new Callable<String>() { // from class: com.baicizhan.client.business.webview.url.UrlFetcher.1
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                String fetch = UrlFetcher.this.fetch();
                if (!x.r().S() || TextUtils.isEmpty(fetch)) {
                    return fetch;
                }
                if (fetch.startsWith("http://")) {
                    return "https://" + fetch.substring(7);
                }
                if (fetch.startsWith("https://")) {
                    return fetch;
                }
                return "https://" + fetch;
            }
        });
        d scheduler = fetcher.scheduler();
        return scheduler != null ? z22.w5(scheduler) : z22;
    }

    public static UrlFetcher getFetcher(int strategy, String defaultUrl) {
        if (strategy == 0) {
            return new DirectUrlFetcher(defaultUrl);
        }
        if (strategy == 1) {
            return new CampaignUrlFetcher(defaultUrl);
        }
        if (strategy == 2) {
            return new SysNotificationUrlFetcher(defaultUrl);
        }
        if (strategy != 3) {
            return null;
        }
        return new WeixinRemindUrlFetcher(defaultUrl);
    }

    public abstract String fetch() throws Exception;

    public abstract d scheduler();
}
