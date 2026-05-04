package com.tencent.liteav.network;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.liteav.basic.log.TXCLog;
import ix.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    protected JSONObject f43791a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f43792a;

        /* renamed from: b, reason: collision with root package name */
        public String f43793b;

        /* renamed from: c, reason: collision with root package name */
        public List<Integer> f43794c;
    }

    public j(JSONObject jSONObject) {
        this.f43791a = jSONObject;
    }

    public String a() {
        if (e() != null) {
            return e().f43795a;
        }
        if (c().size() == 0) {
            if (d() != null) {
                return d().f43795a;
            }
            return null;
        }
        List<Integer> j11 = j();
        if (j11 != null) {
            for (k kVar : c()) {
                if (j11.contains(Integer.valueOf(kVar.a()))) {
                    return kVar.f43795a;
                }
            }
        }
        return c().get(0).f43795a;
    }

    public String b() {
        try {
            JSONObject jSONObject = this.f43791a.getJSONObject("coverInfo");
            if (jSONObject != null) {
                return jSONObject.getString("coverUrl");
            }
            return null;
        } catch (JSONException e11) {
            TXCLog.e("TXPlayInfoResponse", "get cover url failed.", e11);
            return null;
        }
    }

    public List<k> c() {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = this.f43791a.getJSONObject("videoInfo").getJSONArray("transcodeList");
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    k kVar = new k();
                    kVar.f43795a = jSONObject.getString("url");
                    kVar.f43799e = jSONObject.getInt("duration");
                    kVar.f43797c = jSONObject.getInt("width");
                    kVar.f43796b = jSONObject.getInt("height");
                    kVar.f43798d = Math.max(jSONObject.getInt("totalSize"), jSONObject.getInt(g.b.f62794h));
                    kVar.f43800f = jSONObject.getInt(IjkMediaMeta.IJKM_KEY_BITRATE);
                    kVar.f43803i = jSONObject.getInt("definition");
                    kVar.f43801g = jSONObject.getString(TtmlNode.RUBY_CONTAINER);
                    kVar.f43802h = jSONObject.getString("templateName");
                    arrayList.add(kVar);
                }
            }
            return arrayList;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return arrayList;
        }
    }

    public k d() {
        try {
            JSONObject jSONObject = this.f43791a.getJSONObject("videoInfo").getJSONObject("sourceVideo");
            k kVar = new k();
            kVar.f43795a = jSONObject.getString("url");
            kVar.f43799e = jSONObject.getInt("duration");
            kVar.f43797c = jSONObject.getInt("width");
            kVar.f43796b = jSONObject.getInt("height");
            kVar.f43798d = Math.max(jSONObject.getInt(g.b.f62794h), jSONObject.getInt("totalSize"));
            kVar.f43800f = jSONObject.getInt(IjkMediaMeta.IJKM_KEY_BITRATE);
            return kVar;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public k e() {
        try {
            JSONObject jSONObject = this.f43791a.getJSONObject("videoInfo").getJSONObject("masterPlayList");
            k kVar = new k();
            kVar.f43795a = jSONObject.getString("url");
            return kVar;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public String f() {
        try {
            JSONObject jSONObject = this.f43791a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("name");
            }
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public String g() {
        try {
            JSONObject jSONObject = this.f43791a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("description");
            }
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public String h() {
        try {
            return this.f43791a.getJSONObject("playerInfo").getString("defaultVideoClassification");
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public List<a> i() {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = this.f43791a.getJSONObject("playerInfo").getJSONArray("videoClassification");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                a aVar = new a();
                aVar.f43792a = jSONArray.getJSONObject(i11).getString("id");
                aVar.f43793b = jSONArray.getJSONObject(i11).getString("name");
                aVar.f43794c = new ArrayList();
                JSONArray jSONArray2 = jSONArray.getJSONObject(i11).getJSONArray("definitionList");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    aVar.f43794c.add(Integer.valueOf(jSONArray2.getInt(i12)));
                }
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public List<Integer> j() {
        List<a> i11 = i();
        String h11 = h();
        if (h11 == null || i11 == null) {
            return null;
        }
        for (a aVar : i11) {
            if (aVar.f43792a.equals(h11)) {
                return aVar.f43794c;
            }
        }
        return null;
    }

    public k b(String str, String str2) {
        if (str == null) {
            return null;
        }
        for (k kVar : c()) {
            if (str.equals(kVar.f()) && (kVar.e() == null || kVar.e().contains(str2))) {
                return kVar;
            }
        }
        return null;
    }

    public k a(String str, String str2) {
        List<Integer> list;
        List<a> i11 = i();
        if (str != null && i11 != null) {
            for (a aVar : i11) {
                if (aVar.f43792a.equals(str)) {
                    list = aVar.f43794c;
                    break;
                }
            }
        }
        list = null;
        if (list != null) {
            for (k kVar : c()) {
                if (list.contains(Integer.valueOf(kVar.f43803i)) && (kVar.e() == null || kVar.e().contains(str2))) {
                    return kVar;
                }
            }
        }
        return null;
    }
}
