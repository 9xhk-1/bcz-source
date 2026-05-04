package e70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.o;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class d<T extends org.apache.http.o> implements m70.p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final x70.k f49531a;

    /* renamed from: b, reason: collision with root package name */
    public final CharArrayBuffer f49532b;

    /* renamed from: c, reason: collision with root package name */
    public final l70.p f49533c;

    @Deprecated
    public d(x70.k kVar, l70.p pVar, HttpParams httpParams) {
        e80.a.j(kVar, "Session input buffer");
        this.f49531a = kVar;
        this.f49532b = new CharArrayBuffer(64);
        this.f49533c = pVar == null ? l70.j.f70706b : pVar;
    }

    @Override // m70.p
    public void a(T t11) throws IOException, HttpException {
        e80.a.j(t11, "HTTP message");
        b(t11);
        org.apache.http.h l11 = t11.l();
        while (l11.hasNext()) {
            this.f49531a.c(this.f49533c.c(this.f49532b, (org.apache.http.e) l11.next()));
        }
        this.f49532b.clear();
        this.f49531a.c(this.f49532b);
    }

    public abstract void b(T t11) throws IOException;

    public d(x70.k kVar, l70.p pVar) {
        this.f49531a = (x70.k) e80.a.j(kVar, "Session input buffer");
        this.f49533c = pVar == null ? l70.j.f70706b : pVar;
        this.f49532b = new CharArrayBuffer(64);
    }

    @Override // m70.p
    public void reset() {
    }
}
