package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.json.JSONException;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35670a;

    /* renamed from: b, reason: collision with root package name */
    private final GrsBaseInfo f35671b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f35672c;

    public b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo) {
        this.f35670a = context;
        this.f35671b = grsBaseInfo;
        this.f35672c = aVar;
    }

    public String a(boolean z11) {
        String str;
        String str2 = com.huawei.hms.framework.network.grs.a.a(this.f35672c.a().a("geoipCountryCode", ""), "geoip.countrycode").get(Logger.ROOT_LOGGER_NAME);
        com.huawei.hms.framework.common.Logger.i("GeoipCountry", "geoIpCountry is: " + str2);
        String a11 = this.f35672c.a().a("geoipCountryCodetime", "0");
        long j11 = 0;
        if (!TextUtils.isEmpty(a11) && a11.matches("\\d+")) {
            try {
                j11 = Long.parseLong(a11);
            } catch (NumberFormatException e11) {
                com.huawei.hms.framework.common.Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e11);
            }
        }
        if (TextUtils.isEmpty(str2) || com.huawei.hms.framework.network.grs.h.e.a(Long.valueOf(j11))) {
            com.huawei.hms.framework.network.grs.g.j.c cVar = new com.huawei.hms.framework.network.grs.g.j.c(this.f35671b, this.f35670a);
            cVar.a("geoip.countrycode");
            com.huawei.hms.framework.network.grs.e.c c11 = this.f35672c.c();
            if (c11 != null) {
                try {
                    str = h.a(c11.a("services", ""), cVar.c());
                } catch (JSONException e12) {
                    com.huawei.hms.framework.common.Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e12.getMessage()));
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    c11.b("services", str);
                }
            }
            if (z11) {
                d a12 = this.f35672c.b().a(cVar, "geoip.countrycode", c11, -1);
                if (a12 != null) {
                    str2 = com.huawei.hms.framework.network.grs.a.a(a12.j(), "geoip.countrycode").get(Logger.ROOT_LOGGER_NAME);
                }
                com.huawei.hms.framework.common.Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + str2);
            } else {
                com.huawei.hms.framework.common.Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                this.f35672c.b().a(cVar, null, "geoip.countrycode", c11, -1);
            }
        }
        return str2;
    }
}
