package pq;

import android.util.Log;
import androidx.camera.core.processing.util.GLUtils;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class k implements oq.c {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f81152a;

    public k(InputStream inputStream, String str) {
        this.f81152a = a(inputStream);
        b(str);
    }

    public final JSONObject a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(b.g(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final void b(String str) {
        try {
            JSONObject d11 = d(str);
            if (d11 == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal(GLUtils.VERSION_UNKNOWN);
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                this.f81152a.getJSONObject("client").put("app_id", d11.getString("app_id"));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> keys = d11.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"package_name".equals(next)) {
                        c(next, d11.get(next), this.f81152a);
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    public final void c(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            c(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    public final JSONObject d(String str) throws JSONException {
        JSONArray jSONArray = this.f81152a.getJSONArray("appInfos");
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (jSONObject.getString("package_name").equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // oq.c
    public String getString(String str, String str2) {
        if (!str.endsWith("/")) {
            String[] split = str.split("/");
            try {
                JSONObject jSONObject = this.f81152a;
                for (int i11 = 1; i11 < split.length; i11++) {
                    if (i11 == split.length - 1) {
                        str = jSONObject.get(split[i11]).toString();
                        return str;
                    }
                    jSONObject = jSONObject.getJSONObject(split[i11]);
                }
            } catch (JSONException unused) {
                Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
                return str2;
            }
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f81152a.toString().hashCode() + l50.b.f69928j;
    }
}
