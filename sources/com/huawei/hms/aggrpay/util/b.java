package com.huawei.hms.aggrpay.util;

import android.text.TextUtils;
import com.baicizhan.client.business.webview.PayManager;
import com.huawei.hms.support.log.HMSLog;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, ResultListener> f35383a;

    /* renamed from: com.huawei.hms.aggrpay.util.b$b, reason: collision with other inner class name */
    public static class C0443b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f35384a = new b();
    }

    private b() {
        this.f35383a = new ConcurrentHashMap<>();
    }

    public ResultListener a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f35383a.get(str);
        }
        HMSLog.e(PayManager.TAG, "getResultListener but registerKey is empty");
        return null;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.e(PayManager.TAG, "removeResultListener but registerKey is empty");
        } else {
            this.f35383a.remove(str);
        }
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            bVar = C0443b.f35384a;
        }
        return bVar;
    }

    public void a(String str, ResultListener resultListener) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.e(PayManager.TAG, "addResultListener but registerKey is empty");
        } else if (resultListener == null) {
            HMSLog.e(PayManager.TAG, "addResultListener but resultListener is null");
        } else {
            this.f35383a.put(str, resultListener);
        }
    }

    public void a(String str, Object obj) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "notifyResult but registerKey is empty";
        } else {
            ResultListener resultListener = this.f35383a.get(str);
            if (resultListener != null) {
                resultListener.notifyResult(str, obj);
                return;
            }
            str2 = "notifyResult but resultListener is null";
        }
        HMSLog.e(PayManager.TAG, str2);
    }
}
