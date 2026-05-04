package org.apache.http.params;

import org.apache.http.annotation.ThreadingBehavior;
import t60.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes9.dex */
public class SyncBasicHttpParams extends BasicHttpParams {
    private static final long serialVersionUID = 5387834869062660642L;

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized void clear() {
        super.clear();
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized Object getParameter(String str) {
        return super.getParameter(str);
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean isParameterSet(String str) {
        return super.isParameterSet(str);
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean isParameterSetLocally(String str) {
        return super.isParameterSetLocally(str);
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized boolean removeParameter(String str) {
        return super.removeParameter(str);
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized HttpParams setParameter(String str, Object obj) {
        return super.setParameter(str, obj);
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized void setParameters(String[] strArr, Object obj) {
        super.setParameters(strArr, obj);
    }
}
