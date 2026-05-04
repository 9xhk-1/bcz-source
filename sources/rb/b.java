package rb;

import com.alipay.sdk.m.u.i;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends JsonRequest<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83905a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    public static final String f83906b = "Content-Type";

    public b(int method, String url, JSONObject jsonRequest, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(method, url, jsonRequest == null ? null : jsonRequest.toString(), listener, errorListener);
    }

    public static String a(Map<String, String> headers) {
        String str = headers.get("Content-Type");
        if (str == null) {
            return "UTF-8";
        }
        String[] split = str.split(i.f11097b);
        for (int i11 = 1; i11 < split.length; i11++) {
            String[] split2 = split[i11].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "UTF-8";
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
        try {
            return Response.success(new JSONObject(new String(response.data, a(response.headers))), HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e11) {
            return Response.error(new ParseError(e11));
        } catch (JSONException e12) {
            return Response.error(new ParseError(e12));
        }
    }

    public b(String url, JSONObject jsonRequest, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        this(jsonRequest == null ? 0 : 1, url, jsonRequest, listener, errorListener);
    }
}
