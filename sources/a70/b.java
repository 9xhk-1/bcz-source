package a70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.o;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T extends org.apache.http.o> implements k70.e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final k70.i f2194a;

    /* renamed from: b, reason: collision with root package name */
    public final CharArrayBuffer f2195b;

    /* renamed from: c, reason: collision with root package name */
    public final l70.p f2196c;

    @Deprecated
    public b(k70.i iVar, l70.p pVar, HttpParams httpParams) {
        e80.a.j(iVar, "Session input buffer");
        this.f2194a = iVar;
        this.f2195b = new CharArrayBuffer(128);
        this.f2196c = pVar == null ? l70.j.f70706b : pVar;
    }

    @Override // k70.e
    public void a(T t11) throws IOException, HttpException {
        e80.a.j(t11, "HTTP message");
        b(t11);
        org.apache.http.h l11 = t11.l();
        while (l11.hasNext()) {
            this.f2194a.c(this.f2196c.c(this.f2195b, l11.r()));
        }
        this.f2195b.clear();
        this.f2194a.c(this.f2195b);
    }

    public abstract void b(T t11) throws IOException;

    public b(k70.i iVar, l70.p pVar) {
        this.f2194a = (k70.i) e80.a.j(iVar, "Session input buffer");
        this.f2196c = pVar == null ? l70.j.f70706b : pVar;
        this.f2195b = new CharArrayBuffer(128);
    }
}
