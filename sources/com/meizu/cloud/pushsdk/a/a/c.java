package com.meizu.cloud.pushsdk.a.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f39333a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39334b;

    public c(int i11, String str) {
        this.f39333a = i11;
        this.f39334b = str;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.f39333a);
            jSONObject.put(TtmlNode.TAG_BODY, this.f39334b);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return "[NetResponse] " + jSONObject.toString();
    }
}
