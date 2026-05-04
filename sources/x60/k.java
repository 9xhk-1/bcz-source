package x60;

import com.badlogic.gdx.Net;
import org.apache.http.HttpRequest;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class k implements org.apache.http.p {

    /* renamed from: a, reason: collision with root package name */
    public static final k f97641a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f97642b = {"GET"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f97643c = {"POST", Net.a.f11465d};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f97644d = {Net.a.f11462a, "OPTIONS", Net.a.f11467f, "TRACE", "CONNECT"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f97645e = {"PATCH"};

    public static boolean c(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.p
    public HttpRequest a(String str, String str2) throws MethodNotSupportedException {
        if (c(f97642b, str)) {
            return new l70.h(str, str2);
        }
        if (c(f97643c, str)) {
            return new l70.g(str, str2);
        }
        if (c(f97644d, str)) {
            return new l70.h(str, str2);
        }
        if (c(f97645e, str)) {
            return new l70.g(str, str2);
        }
        throw new MethodNotSupportedException(str + " method not supported");
    }

    @Override // org.apache.http.p
    public HttpRequest b(RequestLine requestLine) throws MethodNotSupportedException {
        e80.a.j(requestLine, "Request line");
        String method = requestLine.getMethod();
        if (c(f97642b, method)) {
            return new l70.h(requestLine);
        }
        if (c(f97643c, method)) {
            return new l70.g(requestLine);
        }
        if (c(f97644d, method)) {
            return new l70.h(requestLine);
        }
        if (c(f97645e, method)) {
            return new l70.g(requestLine);
        }
        throw new MethodNotSupportedException(method + " method not supported");
    }
}
