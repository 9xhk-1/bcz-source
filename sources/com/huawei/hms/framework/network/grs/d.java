package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, c> f35640a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35641b = new Object();

    public static c a(GrsBaseInfo grsBaseInfo, Context context) {
        c cVar;
        String str;
        synchronized (f35641b) {
            try {
                int uniqueCode = grsBaseInfo.uniqueCode();
                Map<String, c> map = f35640a;
                cVar = map.get(context.getPackageName() + uniqueCode);
                if (cVar == null) {
                    Logger.i("GrsClientManager", "grsClientImpl == null, and new GrsClientImpl");
                    cVar = new c(context, grsBaseInfo);
                    str = context.getPackageName() + uniqueCode;
                } else if (!cVar.a((Object) new c(grsBaseInfo))) {
                    Logger.i("GrsClientManager", "The app_name, ser_country, reg_country and issue_country is equal, but other not.");
                    cVar = new c(context, grsBaseInfo);
                    str = context.getPackageName() + uniqueCode;
                }
                map.put(str, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
