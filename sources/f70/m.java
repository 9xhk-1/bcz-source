package f70;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m implements q70.g<q70.e> {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLong f51183g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public static final m f51184h = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Log f51185a;

    /* renamed from: b, reason: collision with root package name */
    public final Log f51186b;

    /* renamed from: c, reason: collision with root package name */
    public final Log f51187c;

    /* renamed from: d, reason: collision with root package name */
    public final z70.b f51188d;

    /* renamed from: e, reason: collision with root package name */
    public final m70.q<HttpRequest> f51189e;

    /* renamed from: f, reason: collision with root package name */
    public final m70.o<HttpResponse> f51190f;

    public m(m70.q<HttpRequest> qVar, m70.o<HttpResponse> oVar, z70.b bVar) {
        this.f51185a = org.apache.commons.logging.g.r("org.apache.http.headers");
        this.f51186b = org.apache.commons.logging.g.r("org.apache.http.wire");
        this.f51187c = org.apache.commons.logging.g.q(n.class);
        this.f51189e = qVar == null ? e70.j.f49553b : qVar;
        this.f51190f = oVar == null ? e70.l.f49556c : oVar;
        this.f51188d = bVar == null ? z70.g.f101095a : bVar;
    }

    @Override // q70.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q70.e a(x70.f fVar, v60.a aVar) {
        CharsetDecoder charsetDecoder;
        CharsetEncoder charsetEncoder;
        String str = "http-outgoing-" + Long.toString(f51183g.getAndIncrement());
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
        n nVar = new n(str, this.f51187c, this.f51185a, this.f51186b, fVar, aVar.d(), aVar.f(), this.f51188d, charsetDecoder, charsetEncoder, aVar.h(), null, null, this.f51189e, this.f51190f);
        fVar.b("http.connection", nVar);
        return nVar;
    }

    public m() {
        this(null, null, null);
    }
}
