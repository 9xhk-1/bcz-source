package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g extends m {

    /* renamed from: k, reason: collision with root package name */
    static byte[] f42595k = null;

    /* renamed from: l, reason: collision with root package name */
    static Map<String, String> f42596l = null;

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f42597m = true;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f42604g;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, String> f42606i;

    /* renamed from: j, reason: collision with root package name */
    public Map<String, String> f42607j;

    /* renamed from: a, reason: collision with root package name */
    public short f42598a = 0;

    /* renamed from: b, reason: collision with root package name */
    public byte f42599b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f42600c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f42601d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f42602e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f42603f = null;

    /* renamed from: h, reason: collision with root package name */
    public int f42605h = 0;

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42598a, 1);
        lVar.a(this.f42599b, 2);
        lVar.a(this.f42600c, 3);
        lVar.a(this.f42601d, 4);
        lVar.a(this.f42602e, 5);
        lVar.a(this.f42603f, 6);
        lVar.a(this.f42604g, 7);
        lVar.a(this.f42605h, 8);
        lVar.a((Map) this.f42606i, 9);
        lVar.a((Map) this.f42607j, 10);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f42597m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        g gVar = (g) obj;
        return n.a(1, (int) gVar.f42598a) && n.a(1, (int) gVar.f42599b) && n.a(1, gVar.f42600c) && n.a(1, gVar.f42601d) && n.a((Object) 1, (Object) gVar.f42602e) && n.a((Object) 1, (Object) gVar.f42603f) && n.a((Object) 1, (Object) gVar.f42604g) && n.a(1, gVar.f42605h) && n.a((Object) 1, (Object) gVar.f42606i) && n.a((Object) 1, (Object) gVar.f42607j);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        try {
            this.f42598a = kVar.a(this.f42598a, 1, true);
            this.f42599b = kVar.a(this.f42599b, 2, true);
            this.f42600c = kVar.a(this.f42600c, 3, true);
            this.f42601d = kVar.a(this.f42601d, 4, true);
            this.f42602e = kVar.b(5, true);
            this.f42603f = kVar.b(6, true);
            if (f42595k == null) {
                f42595k = new byte[]{0};
            }
            this.f42604g = kVar.c(7, true);
            this.f42605h = kVar.a(this.f42605h, 8, true);
            if (f42596l == null) {
                HashMap hashMap = new HashMap();
                f42596l = hashMap;
                hashMap.put("", "");
            }
            this.f42606i = (Map) kVar.a((k) f42596l, 9, true);
            if (f42596l == null) {
                HashMap hashMap2 = new HashMap();
                f42596l = hashMap2;
                hashMap2.put("", "");
            }
            this.f42607j = (Map) kVar.a((k) f42596l, 10, true);
        } catch (Exception e11) {
            e11.printStackTrace();
            System.out.println("RequestPacket decode error " + f.a(this.f42604g));
            throw new RuntimeException(e11);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
        i iVar = new i(sb2, i11);
        iVar.a(this.f42598a, "iVersion");
        iVar.a(this.f42599b, "cPacketType");
        iVar.a(this.f42600c, "iMessageType");
        iVar.a(this.f42601d, "iRequestId");
        iVar.a(this.f42602e, "sServantName");
        iVar.a(this.f42603f, "sFuncName");
        iVar.a(this.f42604g, "sBuffer");
        iVar.a(this.f42605h, "iTimeout");
        iVar.a((Map) this.f42606i, c90.k.f8409a);
        iVar.a((Map) this.f42607j, "status");
    }
}
