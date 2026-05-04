package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f35737a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c> f35738b = new ConcurrentHashMap(16);

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f35738b.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    public void b(String str) {
        this.f35737a = str;
    }

    public String a() {
        return this.f35737a;
    }

    public void a(long j11) {
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f35738b.put(str, cVar);
    }
}
