package ss;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88929a = "channel";

    public static c a(File file) {
        Map<String, String> b11 = b(file);
        if (b11 == null) {
            return null;
        }
        String str = b11.get("channel");
        b11.remove("channel");
        return new c(str, b11);
    }

    public static Map<String, String> b(File file) {
        try {
            String c11 = c(file);
            if (c11 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c11);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.getString(obj));
            }
            return hashMap;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static String c(File file) {
        return f.d(file, a.f88918g);
    }
}
