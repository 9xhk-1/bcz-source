package e70;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.o;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c<T extends org.apache.http.o> implements m70.n<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f49520i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f49521j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f49522k = 2;

    /* renamed from: a, reason: collision with root package name */
    public final x70.j f49523a;

    /* renamed from: b, reason: collision with root package name */
    public int f49524b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49525c;

    /* renamed from: d, reason: collision with root package name */
    public T f49526d;

    /* renamed from: e, reason: collision with root package name */
    public CharArrayBuffer f49527e;

    /* renamed from: f, reason: collision with root package name */
    public final List<CharArrayBuffer> f49528f;

    /* renamed from: g, reason: collision with root package name */
    public final l70.q f49529g;

    /* renamed from: h, reason: collision with root package name */
    public final v60.c f49530h;

    @Deprecated
    public c(x70.j jVar, l70.q qVar, HttpParams httpParams) {
        e80.a.j(jVar, "Session input buffer");
        e80.a.j(httpParams, "HTTP parameters");
        this.f49523a = jVar;
        this.f49524b = 0;
        this.f49525c = false;
        this.f49528f = new ArrayList();
        this.f49530h = a80.h.b(httpParams);
        this.f49529g = qVar == null ? l70.k.f70708c : qVar;
    }

    @Override // m70.n
    public T a() throws IOException, HttpException {
        while (this.f49524b != 2) {
            CharArrayBuffer charArrayBuffer = this.f49527e;
            if (charArrayBuffer == null) {
                this.f49527e = new CharArrayBuffer(64);
            } else {
                charArrayBuffer.clear();
            }
            boolean n11 = this.f49523a.n(this.f49527e, this.f49525c);
            int e11 = this.f49530h.e();
            if (e11 > 0 && (this.f49527e.length() > e11 || (!n11 && this.f49523a.length() > e11))) {
                throw new MessageConstraintException("Maximum line length limit exceeded");
            }
            if (!n11) {
                break;
            }
            int i11 = this.f49524b;
            if (i11 == 0) {
                try {
                    d();
                    this.f49524b = 1;
                } catch (ParseException e12) {
                    throw new ProtocolException(e12.getMessage(), e12);
                }
            } else if (i11 == 1) {
                if (this.f49527e.length() > 0) {
                    int d11 = this.f49530h.d();
                    if (d11 > 0 && this.f49528f.size() >= d11) {
                        throw new MessageConstraintException("Maximum header count exceeded");
                    }
                    e();
                } else {
                    this.f49524b = 2;
                }
            }
            if (this.f49525c && !this.f49523a.a()) {
                this.f49524b = 2;
            }
        }
        if (this.f49524b != 2) {
            return null;
        }
        Iterator<CharArrayBuffer> it = this.f49528f.iterator();
        while (it.hasNext()) {
            try {
                this.f49526d.c(this.f49529g.d(it.next()));
            } catch (ParseException e13) {
                throw new ProtocolException(e13.getMessage(), e13);
            }
        }
        return this.f49526d;
    }

    @Override // m70.n
    public int b(ReadableByteChannel readableByteChannel) throws IOException {
        int o11 = this.f49523a.o(readableByteChannel);
        if (o11 == -1) {
            this.f49525c = true;
        }
        return o11;
    }

    public abstract T c(CharArrayBuffer charArrayBuffer) throws HttpException, ParseException;

    public final void d() throws HttpException, ParseException {
        this.f49526d = c(this.f49527e);
    }

    public final void e() throws IOException {
        char charAt;
        CharArrayBuffer charArrayBuffer = this.f49527e;
        int size = this.f49528f.size();
        int i11 = 0;
        if ((this.f49527e.charAt(0) != ' ' && this.f49527e.charAt(0) != '\t') || size <= 0) {
            this.f49528f.add(charArrayBuffer);
            this.f49527e = null;
            return;
        }
        CharArrayBuffer charArrayBuffer2 = this.f49528f.get(size - 1);
        while (i11 < charArrayBuffer.length() && ((charAt = charArrayBuffer.charAt(i11)) == ' ' || charAt == '\t')) {
            i11++;
        }
        int e11 = this.f49530h.e();
        if (e11 > 0 && ((charArrayBuffer2.length() + 1) + charArrayBuffer.length()) - i11 > e11) {
            throw new MessageConstraintException("Maximum line length limit exceeded");
        }
        charArrayBuffer2.append(' ');
        charArrayBuffer2.append(charArrayBuffer, i11, charArrayBuffer.length() - i11);
    }

    @Override // m70.n
    public void reset() {
        this.f49524b = 0;
        this.f49525c = false;
        this.f49528f.clear();
        this.f49526d = null;
    }

    public c(x70.j jVar, l70.q qVar, v60.c cVar) {
        this.f49523a = (x70.j) e80.a.j(jVar, "Session input buffer");
        this.f49529g = qVar == null ? l70.k.f70708c : qVar;
        this.f49530h = cVar == null ? v60.c.f93129c : cVar;
        this.f49528f = new ArrayList();
        this.f49524b = 0;
        this.f49525c = false;
    }
}
