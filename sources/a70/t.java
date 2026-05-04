package a70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class t extends a<org.apache.http.o> {

    /* renamed from: i, reason: collision with root package name */
    public final org.apache.http.r f2267i;

    /* renamed from: j, reason: collision with root package name */
    public final CharArrayBuffer f2268j;

    public t(k70.h hVar, l70.q qVar, org.apache.http.r rVar, HttpParams httpParams) {
        super(hVar, qVar, httpParams);
        this.f2267i = (org.apache.http.r) e80.a.j(rVar, "Response factory");
        this.f2268j = new CharArrayBuffer(128);
    }

    @Override // a70.a
    public org.apache.http.o b(k70.h hVar) throws IOException, HttpException, ParseException {
        this.f2268j.clear();
        if (hVar.a(this.f2268j) == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        return this.f2267i.b(this.f2189d.b(this.f2268j, new l70.r(0, this.f2268j.length())), null);
    }
}
