package l70;

import java.util.ArrayList;
import java.util.BitSet;
import org.apache.http.ParseException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class f implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final char f70689d = ';';

    /* renamed from: e, reason: collision with root package name */
    public static final char f70690e = ',';

    /* renamed from: a, reason: collision with root package name */
    public final s f70693a = s.f70728g;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final f f70687b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final f f70688c = new f();

    /* renamed from: f, reason: collision with root package name */
    public static final BitSet f70691f = s.a(61, 59, 44);

    /* renamed from: g, reason: collision with root package name */
    public static final BitSet f70692g = s.a(59, 44);

    public static org.apache.http.f[] g(String str, o oVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (oVar == null) {
            oVar = f70688c;
        }
        return oVar.a(charArrayBuffer, rVar);
    }

    public static org.apache.http.f h(String str, o oVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (oVar == null) {
            oVar = f70688c;
        }
        return oVar.b(charArrayBuffer, rVar);
    }

    public static v i(String str, o oVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (oVar == null) {
            oVar = f70688c;
        }
        return oVar.c(charArrayBuffer, rVar);
    }

    public static v[] k(String str, o oVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (oVar == null) {
            oVar = f70688c;
        }
        return oVar.d(charArrayBuffer, rVar);
    }

    @Override // l70.o
    public org.apache.http.f[] a(CharArrayBuffer charArrayBuffer, r rVar) {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        ArrayList arrayList = new ArrayList();
        while (!rVar.a()) {
            org.apache.http.f b11 = b(charArrayBuffer, rVar);
            if (!b11.getName().isEmpty() || b11.getValue() != null) {
                arrayList.add(b11);
            }
        }
        return (org.apache.http.f[]) arrayList.toArray(new org.apache.http.f[arrayList.size()]);
    }

    @Override // l70.o
    public org.apache.http.f b(CharArrayBuffer charArrayBuffer, r rVar) {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        v c11 = c(charArrayBuffer, rVar);
        return e(c11.getName(), c11.getValue(), (rVar.a() || charArrayBuffer.charAt(rVar.c() + (-1)) == ',') ? null : d(charArrayBuffer, rVar));
    }

    @Override // l70.o
    public v c(CharArrayBuffer charArrayBuffer, r rVar) {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        String f11 = this.f70693a.f(charArrayBuffer, rVar, f70691f);
        if (rVar.a()) {
            return new BasicNameValuePair(f11, null);
        }
        char charAt = charArrayBuffer.charAt(rVar.c());
        rVar.e(rVar.c() + 1);
        if (charAt != '=') {
            return f(f11, null);
        }
        String g11 = this.f70693a.g(charArrayBuffer, rVar, f70692g);
        if (!rVar.a()) {
            rVar.e(rVar.c() + 1);
        }
        return f(f11, g11);
    }

    @Override // l70.o
    public v[] d(CharArrayBuffer charArrayBuffer, r rVar) {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        this.f70693a.h(charArrayBuffer, rVar);
        ArrayList arrayList = new ArrayList();
        while (!rVar.a()) {
            arrayList.add(c(charArrayBuffer, rVar));
            if (charArrayBuffer.charAt(rVar.c() - 1) == ',') {
                break;
            }
        }
        return (v[]) arrayList.toArray(new v[arrayList.size()]);
    }

    public org.apache.http.f e(String str, String str2, v[] vVarArr) {
        return new b(str, str2, vVarArr);
    }

    public v f(String str, String str2) {
        return new BasicNameValuePair(str, str2);
    }

    @Deprecated
    public v j(CharArrayBuffer charArrayBuffer, r rVar, char[] cArr) {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        BitSet bitSet = new BitSet();
        if (cArr != null) {
            for (char c11 : cArr) {
                bitSet.set(c11);
            }
        }
        bitSet.set(61);
        String f11 = this.f70693a.f(charArrayBuffer, rVar, bitSet);
        if (rVar.a()) {
            return new BasicNameValuePair(f11, null);
        }
        char charAt = charArrayBuffer.charAt(rVar.c());
        rVar.e(rVar.c() + 1);
        if (charAt != '=') {
            return f(f11, null);
        }
        bitSet.clear(61);
        String g11 = this.f70693a.g(charArrayBuffer, rVar, bitSet);
        if (!rVar.a()) {
            rVar.e(rVar.c() + 1);
        }
        return f(f11, g11);
    }
}
