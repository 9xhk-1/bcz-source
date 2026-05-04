package com.zx.a.I8b7;

import com.zx.sdk.api.ZXIDChangedListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q2 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, LinkedList<ZXIDChangedListener>> f46669a = new ConcurrentHashMap<>();

    @Override // com.zx.a.I8b7.z0
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("code");
            for (String str2 : this.f46669a.keySet()) {
                Iterator<ZXIDChangedListener> it = this.f46669a.get(str2).iterator();
                while (it.hasNext()) {
                    ZXIDChangedListener next = it.next();
                    if (i11 == 0) {
                        next.onChange(a(str2, jSONObject.getString("data")));
                    }
                }
                this.f46669a.remove(str2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
