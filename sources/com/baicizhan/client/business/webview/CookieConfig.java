package com.baicizhan.client.business.webview;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class CookieConfig {
    private static final String DEFAULT_DOMAIN = ".baicizhan.com";
    private static final String DEFAULT_DOMAIN_CN = ".bczeducation.cn";
    private static final String DEFAULT_DOMAIN_ORG = ".baicizhan.org";
    private StringBuilder cookieString;
    private String uniqueCookieName;
    private String domain = DEFAULT_DOMAIN;
    private List<HttpCookie> cookieList = new ArrayList();

    public static void removeCookie(@NonNull Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeSessionCookie();
        CookieSyncManager.getInstance().sync();
    }

    public String getCookie() {
        StringBuilder sb2 = this.cookieString;
        if (sb2 == null) {
            return null;
        }
        return sb2.toString();
    }

    public CookieConfig putCookie(String name, String value) {
        return putCookie(name, value, false);
    }

    public void setCookie(@NonNull Context context) {
        HttpCookie httpCookie;
        List<HttpCookie> parse;
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        List<HttpCookie> list = this.cookieList;
        Iterator<HttpCookie> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                httpCookie = null;
                break;
            }
            httpCookie = it.next();
            if (!TextUtils.isEmpty(this.uniqueCookieName) && TextUtils.equals(this.uniqueCookieName, httpCookie.getName())) {
                break;
            }
        }
        String cookie = cookieManager.getCookie(this.domain);
        if (httpCookie != null && cookie != null && (parse = HttpCookie.parse(cookie)) != null && !parse.isEmpty()) {
            Iterator<HttpCookie> it2 = parse.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                HttpCookie next = it2.next();
                if (TextUtils.equals(httpCookie.getName(), next.getName()) && TextUtils.equals(httpCookie.getValue(), next.getValue())) {
                    list = parse;
                    break;
                }
            }
        }
        cookieManager.setCookie(this.domain, "");
        if (TextUtils.equals(this.domain, DEFAULT_DOMAIN)) {
            cookieManager.setCookie("www.baicizhan.com", "");
            cookieManager.setCookie("www.baicizhan.org", "");
            cookieManager.setCookie("www.bczeducation.cn", "");
        }
        for (HttpCookie httpCookie2 : list) {
            cookieManager.setCookie(this.domain, httpCookie2.toString() + ";Max-Age=\"-1\"");
            cookieManager.setCookie(DEFAULT_DOMAIN_ORG, httpCookie2.toString() + ";Max-Age=\"-1\"");
            cookieManager.setCookie(DEFAULT_DOMAIN_CN, httpCookie2.toString() + ";Max-Age=\"-1\"");
            StringBuilder sb2 = this.cookieString;
            if (sb2 == null) {
                this.cookieString = new StringBuilder();
            } else {
                sb2.append("; ");
            }
            this.cookieString.append(httpCookie2.toString());
        }
        CookieSyncManager.getInstance().sync();
    }

    public CookieConfig putCookie(String name, String value, boolean unique) {
        this.cookieList.add(new HttpCookie(name, value));
        if (unique) {
            this.uniqueCookieName = name;
        }
        return this;
    }

    public CookieConfig setDomain(String domain) {
        return this;
    }
}
