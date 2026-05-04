package e70;

import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class q extends c {

    /* renamed from: l, reason: collision with root package name */
    public final org.apache.http.r f49562l;

    public q(x70.j jVar, l70.q qVar, org.apache.http.r rVar, HttpParams httpParams) {
        super(jVar, qVar, httpParams);
        e80.a.j(rVar, "Response factory");
        this.f49562l = rVar;
    }

    @Override // e70.c
    public org.apache.http.o c(CharArrayBuffer charArrayBuffer) throws HttpException, ParseException {
        return this.f49562l.b(this.f49529g.b(charArrayBuffer, new l70.r(0, charArrayBuffer.length())), null);
    }
}
