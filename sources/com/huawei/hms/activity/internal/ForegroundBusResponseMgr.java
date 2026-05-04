package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ForegroundBusResponseMgr {

    /* renamed from: b, reason: collision with root package name */
    private static final ForegroundBusResponseMgr f35259b = new ForegroundBusResponseMgr();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, BusResponseCallback> f35260a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return f35259b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f35260a) {
            busResponseCallback = this.f35260a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (TextUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f35260a) {
            try {
                if (!this.f35260a.containsKey(str)) {
                    this.f35260a.put(str, busResponseCallback);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f35260a) {
            this.f35260a.remove(str);
        }
    }
}
