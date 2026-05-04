package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class OuterBinderAdapter extends BinderAdapter {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f35305j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static BinderAdapter f35306k;

    /* renamed from: l, reason: collision with root package name */
    private static String f35307l;

    /* renamed from: m, reason: collision with root package name */
    private static String f35308m;

    private OuterBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance.");
        synchronized (f35305j) {
            try {
                if (f35306k == null) {
                    f35307l = str;
                    f35308m = str2;
                    f35306k = new OuterBinderAdapter(context, str, str2);
                } else if (!Objects.equal(f35307l, str) || !Objects.equal(f35308m, str2)) {
                    HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance refresh adapter");
                    f35307l = str;
                    f35308m = str2;
                    f35306k.unBind();
                    f35306k = new OuterBinderAdapter(context, str, str2);
                }
                binderAdapter = f35306k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 1001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 1002;
    }
}
