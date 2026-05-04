package f70;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class f implements q70.b, q70.g<q70.e> {

    /* renamed from: g, reason: collision with root package name */
    public static final f f51156g = new f(null, null);

    /* renamed from: h, reason: collision with root package name */
    public static AtomicLong f51157h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Log f51158a;

    /* renamed from: b, reason: collision with root package name */
    public final Log f51159b;

    /* renamed from: c, reason: collision with root package name */
    public final Log f51160c;

    /* renamed from: d, reason: collision with root package name */
    public final r f51161d;

    /* renamed from: e, reason: collision with root package name */
    public final m70.o<HttpResponse> f51162e;

    /* renamed from: f, reason: collision with root package name */
    public final z70.b f51163f;

    public f(m70.o<HttpResponse> oVar, z70.b bVar) {
        this.f51158a = org.apache.commons.logging.g.r("org.apache.http.headers");
        this.f51159b = org.apache.commons.logging.g.r("org.apache.http.wire");
        this.f51160c = org.apache.commons.logging.g.q(n.class);
        this.f51161d = e();
        this.f51162e = oVar == null ? e70.l.f49556c : oVar;
        this.f51163f = bVar == null ? z70.g.f101095a : bVar;
    }

    @Override // q70.b
    @Deprecated
    public q70.a b(String str, x70.f fVar, HttpParams httpParams) {
        return new e(str, fVar, this.f51161d, this.f51163f, httpParams);
    }

    @Override // q70.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public q70.e a(x70.f fVar, v60.a aVar) {
        CharsetDecoder charsetDecoder;
        CharsetEncoder charsetEncoder;
        String str = "http-outgoing-" + Long.toString(f51157h.getAndIncrement());
        Charset e11 = aVar.e();
        CodingErrorAction g11 = aVar.g() != null ? aVar.g() : CodingErrorAction.REPORT;
        CodingErrorAction i11 = aVar.i() != null ? aVar.i() : CodingErrorAction.REPORT;
        if (e11 != null) {
            CharsetDecoder newDecoder = e11.newDecoder();
            newDecoder.onMalformedInput(g11);
            newDecoder.onUnmappableCharacter(i11);
            CharsetEncoder newEncoder = e11.newEncoder();
            newEncoder.onMalformedInput(g11);
            newEncoder.onUnmappableCharacter(i11);
            charsetEncoder = newEncoder;
            charsetDecoder = newDecoder;
        } else {
            charsetDecoder = null;
            charsetEncoder = null;
        }
        n nVar = new n(str, this.f51160c, this.f51158a, this.f51159b, fVar, aVar.d(), aVar.f(), this.f51163f, charsetDecoder, charsetEncoder, aVar.h(), null, null, null, this.f51162e);
        fVar.b("http.connection", nVar);
        return nVar;
    }

    @Deprecated
    public z70.b d() {
        return z70.g.f101095a;
    }

    @Deprecated
    public r e() {
        return x60.l.f97646b;
    }

    public f() {
        this.f51158a = org.apache.commons.logging.g.r("org.apache.http.headers");
        this.f51159b = org.apache.commons.logging.g.r("org.apache.http.wire");
        this.f51160c = org.apache.commons.logging.g.q(n.class);
        r e11 = e();
        this.f51161d = e11;
        this.f51162e = new e70.l(l70.k.f70708c, e11);
        this.f51163f = d();
    }
}
