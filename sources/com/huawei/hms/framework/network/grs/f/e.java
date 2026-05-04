package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35660a = "e";

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f35661b = Collections.unmodifiableSet(new a(16));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends HashSet<String> {
        public a(int i11) {
            super(i11);
            add("ser_country");
            add("reg_country");
            add("issue_country");
            add("geo_ip");
        }
    }

    private static String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z11) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        for (String str2 : str.split(">")) {
            if (f35661b.contains(str2.trim())) {
                if ("ser_country".equals(str2.trim()) && !TextUtils.isEmpty(serCountry) && !"UNKNOWN".equals(serCountry)) {
                    Logger.i(f35660a, "current route_by is serCountry and routerCountry is: " + serCountry);
                    return serCountry;
                }
                if ("reg_country".equals(str2.trim()) && !TextUtils.isEmpty(regCountry) && !"UNKNOWN".equals(regCountry)) {
                    Logger.i(f35660a, "current route_by is regCountry and routerCountry is: " + regCountry);
                    return regCountry;
                }
                if ("issue_country".equals(str2.trim()) && !TextUtils.isEmpty(issueCountry) && !"UNKNOWN".equals(issueCountry)) {
                    Logger.i(f35660a, "current route_by is issueCountry and routerCountry is: " + issueCountry);
                    return issueCountry;
                }
                if ("geo_ip".equals(str2.trim())) {
                    String a11 = new com.huawei.hms.framework.network.grs.g.b(context, aVar, grsBaseInfo).a(z11);
                    Logger.i(f35660a, "current route_by is geo_ip and routerCountry is: " + a11);
                    return a11;
                }
            }
        }
        return "";
    }

    public static String b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, String str, GrsBaseInfo grsBaseInfo, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f35660a, "routeBy must be not empty string or null.");
            return null;
        }
        if (!"no_route".equals(str) && !"unconditional".equals(str)) {
            return a(context, aVar, str, grsBaseInfo, z11);
        }
        Logger.v(f35660a, "routeBy equals NO_ROUTE_POLICY");
        return "no_route_country";
    }
}
