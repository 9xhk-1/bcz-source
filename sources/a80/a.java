package a80;

import java.util.Set;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class a implements HttpParams, i {
    @Override // org.apache.http.params.HttpParams
    public boolean getBooleanParameter(String str, boolean z11) {
        Object parameter = getParameter(str);
        return parameter == null ? z11 : ((Boolean) parameter).booleanValue();
    }

    @Override // org.apache.http.params.HttpParams
    public double getDoubleParameter(String str, double d11) {
        Object parameter = getParameter(str);
        return parameter == null ? d11 : ((Double) parameter).doubleValue();
    }

    @Override // org.apache.http.params.HttpParams
    public int getIntParameter(String str, int i11) {
        Object parameter = getParameter(str);
        return parameter == null ? i11 : ((Integer) parameter).intValue();
    }

    @Override // org.apache.http.params.HttpParams
    public long getLongParameter(String str, long j11) {
        Object parameter = getParameter(str);
        return parameter == null ? j11 : ((Long) parameter).longValue();
    }

    @Override // a80.i
    public Set<String> getNames() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterFalse(String str) {
        return !getBooleanParameter(str, false);
    }

    @Override // org.apache.http.params.HttpParams
    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setBooleanParameter(String str, boolean z11) {
        setParameter(str, z11 ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setDoubleParameter(String str, double d11) {
        setParameter(str, Double.valueOf(d11));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setIntParameter(String str, int i11) {
        setParameter(str, Integer.valueOf(i11));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setLongParameter(String str, long j11) {
        setParameter(str, Long.valueOf(j11));
        return this;
    }
}
