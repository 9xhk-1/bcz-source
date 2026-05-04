package a70;

import java.io.IOException;
import java.util.ArrayList;
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
public abstract class a<T extends org.apache.http.o> implements k70.c<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f2184g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2185h = 1;

    /* renamed from: a, reason: collision with root package name */
    public final k70.h f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final v60.c f2187b;

    /* renamed from: c, reason: collision with root package name */
    public final List<CharArrayBuffer> f2188c;

    /* renamed from: d, reason: collision with root package name */
    public final l70.q f2189d;

    /* renamed from: e, reason: collision with root package name */
    public int f2190e;

    /* renamed from: f, reason: collision with root package name */
    public T f2191f;

    @Deprecated
    public a(k70.h hVar, l70.q qVar, HttpParams httpParams) {
        e80.a.j(hVar, "Session input buffer");
        e80.a.j(httpParams, "HTTP parameters");
        this.f2186a = hVar;
        this.f2187b = a80.h.b(httpParams);
        this.f2189d = qVar == null ? l70.k.f70708c : qVar;
        this.f2188c = new ArrayList();
        this.f2190e = 0;
    }

    public static org.apache.http.e[] c(k70.h hVar, int i11, int i12, l70.q qVar) throws HttpException, IOException {
        ArrayList arrayList = new ArrayList();
        if (qVar == null) {
            qVar = l70.k.f70708c;
        }
        return d(hVar, i11, i12, qVar, arrayList);
    }

    public static org.apache.http.e[] d(k70.h hVar, int i11, int i12, l70.q qVar, List<CharArrayBuffer> list) throws HttpException, IOException {
        int i13;
        char charAt;
        e80.a.j(hVar, "Session input buffer");
        e80.a.j(qVar, "Line parser");
        e80.a.j(list, "Header line list");
        CharArrayBuffer charArrayBuffer = null;
        CharArrayBuffer charArrayBuffer2 = null;
        while (true) {
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(64);
            } else {
                charArrayBuffer.clear();
            }
            i13 = 0;
            if (hVar.a(charArrayBuffer) == -1 || charArrayBuffer.length() < 1) {
                break;
            }
            if ((charArrayBuffer.charAt(0) == ' ' || charArrayBuffer.charAt(0) == '\t') && charArrayBuffer2 != null) {
                while (i13 < charArrayBuffer.length() && ((charAt = charArrayBuffer.charAt(i13)) == ' ' || charAt == '\t')) {
                    i13++;
                }
                if (i12 > 0 && ((charArrayBuffer2.length() + 1) + charArrayBuffer.length()) - i13 > i12) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
                charArrayBuffer2.append(' ');
                charArrayBuffer2.append(charArrayBuffer, i13, charArrayBuffer.length() - i13);
            } else {
                list.add(charArrayBuffer);
                charArrayBuffer2 = charArrayBuffer;
                charArrayBuffer = null;
            }
            if (i11 > 0 && list.size() >= i11) {
                throw new MessageConstraintException("Maximum header count exceeded");
            }
        }
        org.apache.http.e[] eVarArr = new org.apache.http.e[list.size()];
        while (i13 < list.size()) {
            try {
                eVarArr[i13] = qVar.d(list.get(i13));
                i13++;
            } catch (ParseException e11) {
                throw new ProtocolException(e11.getMessage());
            }
        }
        return eVarArr;
    }

    @Override // k70.c
    public T a() throws IOException, HttpException {
        int i11 = this.f2190e;
        if (i11 == 0) {
            try {
                this.f2191f = b(this.f2186a);
                this.f2190e = 1;
            } catch (ParseException e11) {
                throw new ProtocolException(e11.getMessage(), e11);
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("Inconsistent parser state");
        }
        this.f2191f.u(d(this.f2186a, this.f2187b.d(), this.f2187b.e(), this.f2189d, this.f2188c));
        T t11 = this.f2191f;
        this.f2191f = null;
        this.f2188c.clear();
        this.f2190e = 0;
        return t11;
    }

    public abstract T b(k70.h hVar) throws IOException, HttpException, ParseException;

    public a(k70.h hVar, l70.q qVar, v60.c cVar) {
        this.f2186a = (k70.h) e80.a.j(hVar, "Session input buffer");
        this.f2189d = qVar == null ? l70.k.f70708c : qVar;
        this.f2187b = cVar == null ? v60.c.f93129c : cVar;
        this.f2188c = new ArrayList();
        this.f2190e = 0;
    }
}
