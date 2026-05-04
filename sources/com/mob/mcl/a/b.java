package com.mob.mcl.a;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.network.StringPart;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.HashonHelper;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f40468a;

    /* renamed from: b, reason: collision with root package name */
    public String f40469b;

    /* renamed from: c, reason: collision with root package name */
    public String f40470c;

    /* renamed from: d, reason: collision with root package name */
    public String f40471d;

    /* renamed from: e, reason: collision with root package name */
    public int f40472e;

    /* renamed from: f, reason: collision with root package name */
    public int f40473f;

    /* renamed from: g, reason: collision with root package name */
    public int f40474g;

    public static HashMap<String, String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return HashonHelper.fromJson(str);
    }

    public static b a(Bundle bundle) {
        b bVar = new b();
        if (bundle != null) {
            bVar.f40468a = bundle.getString("type");
            bVar.f40469b = bundle.getString("url");
            bVar.f40470c = bundle.getString("headers");
            bVar.f40472e = bundle.getInt("chunkLength");
            bVar.f40471d = bundle.getString(TtmlNode.TAG_BODY);
            bVar.f40473f = bundle.getInt("readTimout");
            bVar.f40474g = bundle.getInt("connectionTimeout");
        }
        return bVar;
    }

    public static Bundle a(String str, String str2, HashMap<String, String> hashMap, StringPart stringPart, int i11, NetworkHelper.NetworkTimeOut networkTimeOut) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("url", str2);
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        bundle.putString("headers", new Hashon().fromHashMap(hashMap2));
        bundle.putInt("chunkLength", i11);
        if (stringPart != null) {
            bundle.putString(TtmlNode.TAG_BODY, stringPart.toString());
        }
        bundle.putInt("readTimout", networkTimeOut.readTimout);
        bundle.putInt("connectionTimeout", networkTimeOut.connectionTimeout);
        return bundle;
    }
}
