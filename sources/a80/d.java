package a80;

import java.util.HashSet;
import java.util.Set;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final HttpParams f2312a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpParams f2313b;

    public d(HttpParams httpParams, HttpParams httpParams2) {
        this.f2312a = (HttpParams) e80.a.j(httpParams, "Local HTTP parameters");
        this.f2313b = httpParams2;
    }

    public Set<String> a() {
        return new HashSet(d(this.f2313b));
    }

    public HttpParams b() {
        return this.f2313b;
    }

    public Set<String> c() {
        return new HashSet(d(this.f2312a));
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        return new d(this.f2312a.copy(), this.f2313b);
    }

    public final Set<String> d(HttpParams httpParams) {
        if (httpParams instanceof i) {
            return ((i) httpParams).getNames();
        }
        throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
    }

    @Override // a80.a, a80.i
    public Set<String> getNames() {
        HashSet hashSet = new HashSet(d(this.f2313b));
        hashSet.addAll(d(this.f2312a));
        return hashSet;
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        HttpParams httpParams;
        Object parameter = this.f2312a.getParameter(str);
        return (parameter != null || (httpParams = this.f2313b) == null) ? parameter : httpParams.getParameter(str);
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        return this.f2312a.removeParameter(str);
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        return this.f2312a.setParameter(str, obj);
    }
}
