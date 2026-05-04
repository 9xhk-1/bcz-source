package org.apache.http.params;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public interface HttpParams {
    HttpParams copy();

    boolean getBooleanParameter(String str, boolean z11);

    double getDoubleParameter(String str, double d11);

    int getIntParameter(String str, int i11);

    long getLongParameter(String str, long j11);

    Object getParameter(String str);

    boolean isParameterFalse(String str);

    boolean isParameterTrue(String str);

    boolean removeParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z11);

    HttpParams setDoubleParameter(String str, double d11);

    HttpParams setIntParameter(String str, int i11);

    HttpParams setLongParameter(String str, long j11);

    HttpParams setParameter(String str, Object obj);
}
