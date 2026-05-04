package a70;

import java.io.IOException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class r extends a<org.apache.http.o> {

    /* renamed from: i, reason: collision with root package name */
    public final org.apache.http.p f2265i;

    /* renamed from: j, reason: collision with root package name */
    public final CharArrayBuffer f2266j;

    public r(k70.h hVar, l70.q qVar, org.apache.http.p pVar, HttpParams httpParams) {
        super(hVar, qVar, httpParams);
        this.f2265i = (org.apache.http.p) e80.a.j(pVar, "Request factory");
        this.f2266j = new CharArrayBuffer(128);
    }

    @Override // a70.a
    public org.apache.http.o b(k70.h hVar) throws IOException, HttpException, ParseException {
        this.f2266j.clear();
        if (hVar.a(this.f2266j) == -1) {
            throw new ConnectionClosedException("Client closed connection");
        }
        return this.f2265i.b(this.f2189d.a(this.f2266j, new l70.r(0, this.f2266j.length())));
    }
}
