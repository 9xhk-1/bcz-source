package e70;

import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class o extends c {

    /* renamed from: l, reason: collision with root package name */
    public final org.apache.http.p f49561l;

    public o(x70.j jVar, l70.q qVar, org.apache.http.p pVar, HttpParams httpParams) {
        super(jVar, qVar, httpParams);
        e80.a.j(pVar, "Request factory");
        this.f49561l = pVar;
    }

    @Override // e70.c
    public org.apache.http.o c(CharArrayBuffer charArrayBuffer) throws HttpException, ParseException {
        return this.f49561l.b(this.f49529g.a(charArrayBuffer, new l70.r(0, charArrayBuffer.length())));
    }
}
