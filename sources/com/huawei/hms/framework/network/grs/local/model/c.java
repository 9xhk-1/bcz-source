package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f35741a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, d> f35742b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private List<b> f35743c = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f35742b.get(str);
        }
        Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public String b() {
        return this.f35741a;
    }

    public void c(String str) {
        this.f35741a = str;
    }

    public List<b> a() {
        return this.f35743c;
    }

    public void b(String str) {
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        this.f35742b.put(str, dVar);
    }

    public void a(List<b> list) {
        this.f35743c = list;
    }
}
