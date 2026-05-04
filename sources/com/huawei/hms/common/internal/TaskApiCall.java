package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import fr.b;
import fr.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final String f35589a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35590b;

    /* renamed from: c, reason: collision with root package name */
    private Parcelable f35591c;

    /* renamed from: d, reason: collision with root package name */
    private String f35592d;

    /* renamed from: e, reason: collision with root package name */
    private b f35593e;

    /* renamed from: f, reason: collision with root package name */
    private int f35594f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f35594f = 1;
        this.f35589a = str;
        this.f35590b = str2;
        this.f35591c = null;
        this.f35592d = null;
    }

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, l<ResultT> lVar);

    public int getApiLevel() {
        return this.f35594f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f35591c;
    }

    public String getRequestJson() {
        return this.f35590b;
    }

    public b getToken() {
        return this.f35593e;
    }

    public String getTransactionId() {
        return this.f35592d;
    }

    public String getUri() {
        return this.f35589a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, l<ResultT> lVar) {
        b bVar = this.f35593e;
        if (bVar != null && bVar.a()) {
            HMSLog.i("TaskApiCall", "This Task has been canceled, uri:" + this.f35589a + ", transactionId:" + this.f35592d);
            return;
        }
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f35589a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.f35592d);
        doExecute(clientt, responseErrorCode, str, lVar);
    }

    public void setApiLevel(int i11) {
        this.f35594f = i11;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f35591c = parcelable;
    }

    public void setToken(b bVar) {
        this.f35593e = bVar;
    }

    public void setTransactionId(String str) {
        this.f35592d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f35594f = 1;
        this.f35589a = str;
        this.f35590b = str2;
        this.f35591c = null;
        this.f35592d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i11) {
        this.f35589a = str;
        this.f35590b = str2;
        this.f35591c = null;
        this.f35592d = str3;
        this.f35594f = i11;
    }
}
