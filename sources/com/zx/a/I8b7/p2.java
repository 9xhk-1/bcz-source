package com.zx.a.I8b7;

import com.zx.a.I8b7.y;
import com.zx.sdk.api.ZXIDListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p2 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, LinkedList<ZXIDListener>> f46652a = new ConcurrentHashMap<>();

    @Override // com.zx.a.I8b7.z0
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("code");
            String optString = jSONObject.optString("message");
            for (String str2 : this.f46652a.keySet()) {
                Iterator<ZXIDListener> it = this.f46652a.get(str2).iterator();
                while (it.hasNext()) {
                    ZXIDListener next = it.next();
                    if (i11 == 0) {
                        next.onSuccess(a(str2, jSONObject.getString("data")));
                    } else {
                        y yVar = y.b.f46753a;
                        yVar.getClass();
                        try {
                            yVar.a(new z(yVar, i11, optString));
                        } catch (Throwable th2) {
                            r2.a(th2);
                        }
                        next.onFailed(i11, optString);
                    }
                }
                this.f46652a.remove(str2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
