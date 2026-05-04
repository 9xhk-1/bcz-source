package com.android.volley.toolbox;

import androidx.annotation.Nullable;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class JsonObjectRequest extends JsonRequest<JSONObject> {
    public JsonObjectRequest(String str, Response.Listener<JSONObject> listener, @Nullable Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONObject(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e11) {
            return Response.error(new ParseError(e11));
        } catch (JSONException e12) {
            return Response.error(new ParseError(e12));
        }
    }

    @Deprecated
    public JsonObjectRequest(String str, @Nullable JSONObject jSONObject, Response.Listener<JSONObject> listener, @Nullable Response.ErrorListener errorListener) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }

    public JsonObjectRequest(int i11, String str, @Nullable JSONObject jSONObject, Response.Listener<JSONObject> listener, @Nullable Response.ErrorListener errorListener) {
        super(i11, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }
}
