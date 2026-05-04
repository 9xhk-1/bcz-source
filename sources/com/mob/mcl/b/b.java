package com.mob.mcl.b;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f40481a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40482b;

    public b(HashMap<String, Object> hashMap) {
        this.f40481a = hashMap;
        this.f40482b = false;
    }

    private byte[] f() {
        HashMap<String, Object> hashMap = this.f40481a;
        return ((hashMap == null || !hashMap.containsKey(TtmlNode.TAG_BODY)) ? "{}" : (String) this.f40481a.get(TtmlNode.TAG_BODY)).getBytes();
    }

    public HashMap<String, Object> a() {
        return this.f40481a;
    }

    public int b() throws IOException {
        HashMap<String, Object> hashMap = this.f40481a;
        if (hashMap != null) {
            return ((Integer) hashMap.get("code")).intValue();
        }
        return -1;
    }

    public InputStream c() throws IOException {
        return new ByteArrayInputStream(f());
    }

    public InputStream d() throws IOException {
        return new ByteArrayInputStream(f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, List<String>> e() throws IOException {
        HashMap hashMap;
        HashMap hashMap2 = new HashMap();
        a(hashMap2, "apc", String.valueOf(this.f40482b));
        HashMap<String, Object> hashMap3 = this.f40481a;
        if (hashMap3 != null && hashMap3.containsKey("headers") && (hashMap = (HashMap) this.f40481a.get("headers")) != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) entry.getValue());
                    hashMap2.put(entry.getKey(), arrayList);
                } else if (entry.getValue() instanceof List) {
                    hashMap2.put(entry.getKey(), (List) entry.getValue());
                }
            }
        }
        return hashMap2;
    }

    private void a(HashMap<String, List<String>> hashMap, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        hashMap.put(str, arrayList);
    }

    public b(HashMap<String, Object> hashMap, boolean z11) {
        this.f40481a = hashMap;
        this.f40482b = z11;
    }
}
