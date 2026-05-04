package pq;

import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class j implements oq.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81149a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81150b;

    /* renamed from: c, reason: collision with root package name */
    public oq.d f81151c;

    public j(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", "init");
        this.f81149a = context;
        this.f81150b = str;
    }

    @Override // oq.b
    public String a(String str, String str2) {
        if (this.f81151c == null) {
            this.f81151c = b();
        }
        if (this.f81151c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f81151c = new i(this.f81149a, this.f81150b).b();
        }
        return this.f81151c.a(n.b(this.f81149a, this.f81150b, "agc_plugin_", str), str2);
    }

    @Override // oq.b
    public oq.d b() {
        String b11 = n.b(this.f81149a, this.f81150b, "agc_plugin_", "crypto_component");
        if (b11 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(a.b(b11), "utf-8"));
            return new h(new f(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e11) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e11.getMessage());
            return null;
        }
    }
}
