package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: h, reason: collision with root package name */
    static HashMap<String, byte[]> f42589h;

    /* renamed from: i, reason: collision with root package name */
    static HashMap<String, HashMap<String, byte[]>> f42590i;

    /* renamed from: g, reason: collision with root package name */
    protected g f42591g;

    /* renamed from: j, reason: collision with root package name */
    private int f42592j;

    public e() {
        g gVar = new g();
        this.f42591g = gVar;
        this.f42592j = 0;
        gVar.f42598a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.d, com.tencent.bugly.proguard.c
    public final <T> void a(String str, T t11) {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
        }
        super.a(str, (String) t11);
    }

    @Override // com.tencent.bugly.proguard.d
    public final void b() {
        super.b();
        this.f42591g.f42598a = (short) 3;
    }

    public final void c(String str) {
        this.f42591g.f42603f = str;
    }

    public final void c() {
        this.f42591g.f42601d = 1;
    }

    public final void b(String str) {
        this.f42591g.f42602e = str;
    }

    @Override // com.tencent.bugly.proguard.d, com.tencent.bugly.proguard.c
    public final byte[] a() {
        g gVar = this.f42591g;
        if (gVar.f42598a == 2) {
            if (!gVar.f42602e.equals("")) {
                if (this.f42591g.f42603f.equals("")) {
                    throw new IllegalArgumentException("funcName can not is null");
                }
            } else {
                throw new IllegalArgumentException("servantName can not is null");
            }
        } else {
            if (gVar.f42602e == null) {
                gVar.f42602e = "";
            }
            if (gVar.f42603f == null) {
                gVar.f42603f = "";
            }
        }
        l lVar = new l(0);
        lVar.a(this.f42583c);
        if (this.f42591g.f42598a == 2) {
            lVar.a((Map) this.f42581a, 0);
        } else {
            lVar.a((Map) ((d) this).f42586e, 0);
        }
        this.f42591g.f42604g = n.a(lVar.f42614a);
        l lVar2 = new l(0);
        lVar2.a(this.f42583c);
        this.f42591g.a(lVar2);
        byte[] a11 = n.a(lVar2.f42614a);
        int length = a11.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a11).flip();
        return allocate.array();
    }

    @Override // com.tencent.bugly.proguard.d, com.tencent.bugly.proguard.c
    public final void a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                k kVar = new k(bArr, (byte) 0);
                kVar.a(this.f42583c);
                this.f42591g.a(kVar);
                g gVar = this.f42591g;
                if (gVar.f42598a == 3) {
                    k kVar2 = new k(gVar.f42604g);
                    kVar2.a(this.f42583c);
                    if (f42589h == null) {
                        HashMap<String, byte[]> hashMap = new HashMap<>();
                        f42589h = hashMap;
                        hashMap.put("", new byte[0]);
                    }
                    ((d) this).f42586e = kVar2.a((Map) f42589h, 0, false);
                    return;
                }
                k kVar3 = new k(gVar.f42604g);
                kVar3.a(this.f42583c);
                if (f42590i == null) {
                    f42590i = new HashMap<>();
                    HashMap<String, byte[]> hashMap2 = new HashMap<>();
                    hashMap2.put("", new byte[0]);
                    f42590i.put("", hashMap2);
                }
                this.f42581a = kVar3.a((Map) f42590i, 0, false);
                this.f42582b = new HashMap<>();
                return;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        throw new IllegalArgumentException("decode package must include size head");
    }
}
