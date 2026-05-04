package x60;

import java.util.Locale;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.u;
import org.apache.http.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class n implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final n f97648a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final String[][] f97649b = {null, new String[3], new String[8], new String[8], new String[30], new String[8]};

    static {
        b(200, "OK");
        b(201, "Created");
        b(202, "Accepted");
        b(204, "No Content");
        b(301, "Moved Permanently");
        b(302, "Moved Temporarily");
        b(304, "Not Modified");
        b(400, "Bad Request");
        b(401, "Unauthorized");
        b(403, "Forbidden");
        b(404, "Not Found");
        b(u.P, "Too Many Requests");
        b(500, "Internal Server Error");
        b(501, "Not Implemented");
        b(502, "Bad Gateway");
        b(503, "Service Unavailable");
        b(100, "Continue");
        b(307, "Temporary Redirect");
        b(405, "Method Not Allowed");
        b(409, "Conflict");
        b(412, "Precondition Failed");
        b(413, "Request Too Long");
        b(414, "Request-URI Too Long");
        b(415, "Unsupported Media Type");
        b(300, "Multiple Choices");
        b(303, "See Other");
        b(305, "Use Proxy");
        b(402, "Payment Required");
        b(406, "Not Acceptable");
        b(407, "Proxy Authentication Required");
        b(408, "Request Timeout");
        b(101, "Switching Protocols");
        b(203, "Non Authoritative Information");
        b(205, "Reset Content");
        b(206, "Partial Content");
        b(504, "Gateway Timeout");
        b(505, "Http Version Not Supported");
        b(410, "Gone");
        b(411, "Length Required");
        b(416, "Requested Range Not Satisfiable");
        b(417, "Expectation Failed");
        b(102, "Processing");
        b(207, "Multi-Status");
        b(422, "Unprocessable Entity");
        b(419, "Insufficient Space On Resource");
        b(420, "Method Failure");
        b(423, "Locked");
        b(507, "Insufficient Storage");
        b(424, "Failed Dependency");
    }

    public static void b(int i11, String str) {
        int i12 = i11 / 100;
        f97649b[i12][i11 - (i12 * 100)] = str;
    }

    @Override // org.apache.http.w
    public String a(int i11, Locale locale) {
        e80.a.a(i11 >= 100 && i11 < 600, "Unknown category for status code " + i11);
        int i12 = i11 / 100;
        int i13 = i11 - (i12 * 100);
        String[] strArr = f97649b[i12];
        if (strArr.length > i13) {
            return strArr[i13];
        }
        return null;
    }
}
