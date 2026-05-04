package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends c {

    /* renamed from: e, reason: collision with root package name */
    protected HashMap<String, byte[]> f42586e = null;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, Object> f42588g = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    k f42587f = new k();

    private void c(String str, Object obj) {
        this.f42588g.put(str, obj);
    }

    @Override // com.tencent.bugly.proguard.c
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public void b() {
        this.f42586e = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.c
    public <T> void a(String str, T t11) {
        if (this.f42586e == null) {
            super.a(str, (String) t11);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t11 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t11 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        l lVar = new l();
        lVar.a(this.f42583c);
        lVar.a(t11, 0);
        this.f42586e.put(str, n.a(lVar.f42614a));
    }

    public final <T> T b(String str, T t11) throws b {
        HashMap<String, byte[]> hashMap = this.f42586e;
        if (hashMap != null) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            if (this.f42588g.containsKey(str)) {
                return (T) this.f42588g.get(str);
            }
            try {
                this.f42587f.a(this.f42586e.get(str));
                this.f42587f.a(this.f42583c);
                T t12 = (T) this.f42587f.a((k) t11, 0, true);
                if (t12 == null) {
                    return t12;
                }
                c(str, t12);
                return t12;
            } catch (Exception e11) {
                throw new b(e11);
            }
        }
        if (!this.f42581a.containsKey(str)) {
            return null;
        }
        if (this.f42588g.containsKey(str)) {
            return (T) this.f42588g.get(str);
        }
        byte[] bArr = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f42581a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            bArr = next.getValue();
        }
        try {
            this.f42587f.a(bArr);
            this.f42587f.a(this.f42583c);
            T t13 = (T) this.f42587f.a((k) t11, 0, true);
            c(str, t13);
            return t13;
        } catch (Exception e12) {
            throw new b(e12);
        }
    }

    @Override // com.tencent.bugly.proguard.c
    public byte[] a() {
        if (this.f42586e != null) {
            l lVar = new l(0);
            lVar.a(this.f42583c);
            lVar.a((Map) this.f42586e, 0);
            return n.a(lVar.f42614a);
        }
        return super.a();
    }

    @Override // com.tencent.bugly.proguard.c
    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (Exception unused) {
            this.f42587f.a(bArr);
            this.f42587f.a(this.f42583c);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.f42586e = this.f42587f.a((Map) hashMap, 0, false);
        }
    }
}
