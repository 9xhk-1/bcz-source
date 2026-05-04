package rb;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import xb.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a<T> extends Request<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final String f83896g = "GsonRequest";

    /* renamed from: h, reason: collision with root package name */
    public static final String f83897h = "utf-8";

    /* renamed from: i, reason: collision with root package name */
    public static final String f83898i = String.format("application/json; charset=%s", "utf-8");

    /* renamed from: a, reason: collision with root package name */
    public final Response.Listener<T> f83899a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83900b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.gson.d f83901c;

    /* renamed from: d, reason: collision with root package name */
    public Type f83902d;

    /* renamed from: e, reason: collision with root package name */
    public Request.Priority f83903e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f83904f;

    public a(int method, String url, Type type, String requestBody, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this.f83904f = new HashMap();
        this.f83901c = new com.google.gson.d();
        this.f83902d = type;
        this.f83899a = listener;
        this.f83900b = requestBody;
        this.f83903e = Request.Priority.NORMAL;
    }

    public void a(Request.Priority priority) {
        this.f83903e = priority;
    }

    @Override // com.android.volley.Request
    public void deliverResponse(T response) {
        this.f83899a.onResponse(response);
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        try {
            String str = this.f83900b;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.f83900b, "utf-8");
            return null;
        }
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        return f83898i;
    }

    @Override // com.android.volley.Request
    public Map<String, String> getHeaders() throws AuthFailureError {
        return this.f83904f;
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return this.f83903e;
    }

    @Override // com.android.volley.Request
    public Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String str = response.headers.get("Content-Type");
            return Response.success(this.f83901c.o((str == null || !str.contains("api/gz")) ? new String(response.data, "utf-8") : new String(k.d(response.data), "utf-8"), this.f83902d), HttpHeaderParser.parseCacheHeaders(response));
        } catch (JsonSyntaxException e11) {
            return Response.error(new ParseError(e11));
        } catch (UnsupportedEncodingException e12) {
            return Response.error(new ParseError(e12));
        } catch (IOException e13) {
            return Response.error(new ParseError(e13));
        } catch (Exception e14) {
            return Response.error(new ParseError(e14));
        }
    }

    public a(String url, Type type, String requestBody, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        this(0, url, type, requestBody, listener, errorListener);
    }
}
