package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class InnerBinderAdapter extends BinderAdapter {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f35303j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static BinderAdapter f35304k;

    private InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        synchronized (f35303j) {
            try {
                if (f35304k == null) {
                    f35304k = new InnerBinderAdapter(context, str, str2);
                }
                binderAdapter = f35304k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 2001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 2002;
    }
}
