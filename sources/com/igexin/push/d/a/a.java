package com.igexin.push.d.a;

import com.igexin.c.a.b.d;
import com.igexin.c.a.d.a.e;
import com.igexin.push.d.c.f;
import com.igexin.push.d.c.h;
import com.igexin.push.d.c.k;
import com.igexin.push.d.c.m;
import com.igexin.push.d.c.n;
import com.igexin.push.d.c.p;
import com.igexin.push.d.c.q;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38379a = "CommandFilter";

    public a(String str, d dVar) {
        super(str, (byte) 0);
        a(dVar);
    }

    private static e c(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        com.igexin.push.d.c.a aVar = (com.igexin.push.d.c.a) obj;
        byte b11 = aVar.f38407b;
        com.igexin.push.d.c.c hVar = b11 != 0 ? b11 != 5 ? b11 != 9 ? b11 != 20 ? b11 != 26 ? b11 != 37 ? b11 != 97 ? null : new h() : new m() : new n() : new q() : new p() : new k() : new f();
        int i11 = aVar.f38411f;
        if ((i11 != 1 && i11 != 7) || hVar == null) {
            return null;
        }
        hVar.a(aVar.f38410e);
        if (aVar.f38411f == 7) {
            if (aVar.f38412g == 32 && !a(aVar, hVar)) {
                com.igexin.c.a.c.a.a(f38379a, "version = 7 and enc type = 0x20, redirect = false");
                return null;
            }
        } else if (!a(aVar, hVar)) {
            return null;
        }
        return hVar;
    }

    @Override // com.igexin.c.a.b.d
    public final Object a(Object obj) throws Exception {
        if (obj instanceof com.igexin.push.d.c.c) {
            com.igexin.push.d.c.c cVar = (com.igexin.push.d.c.c) obj;
            com.igexin.push.d.c.a aVar = new com.igexin.push.d.c.a();
            aVar.f38407b = (byte) cVar.f38438m;
            aVar.a(cVar.b());
            aVar.f38408c = cVar.f38439n;
            aVar.f38409d = cVar.f38440o;
            return aVar;
        }
        if (!(obj instanceof com.igexin.push.d.c.c[])) {
            return null;
        }
        com.igexin.push.d.c.c[] cVarArr = (com.igexin.push.d.c.c[]) obj;
        com.igexin.push.d.c.a[] aVarArr = new com.igexin.push.d.c.a[cVarArr.length];
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            com.igexin.push.d.c.a aVar2 = new com.igexin.push.d.c.a();
            aVarArr[i11] = aVar2;
            com.igexin.push.d.c.c cVar2 = cVarArr[i11];
            aVar2.f38407b = (byte) cVar2.f38438m;
            aVar2.a(cVar2.b());
        }
        return aVarArr;
    }

    @Override // com.igexin.c.a.b.d
    public final /* synthetic */ Object b(Object obj) throws Exception {
        return c(obj);
    }

    private static boolean a(com.igexin.push.d.c.a aVar, com.igexin.push.d.c.c cVar) {
        String string;
        if (aVar.f38407b != 26) {
            return false;
        }
        n nVar = (n) cVar;
        if (nVar.d() && nVar.f38501f != null) {
            try {
                JSONObject jSONObject = new JSONObject((String) nVar.f38501f);
                if (jSONObject.has("action") && (string = jSONObject.getString("action")) != null) {
                    if (string.equals(com.igexin.push.core.b.G)) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                com.igexin.c.a.c.a.a("CommandFilter|" + e11.toString(), new Object[0]);
            }
        }
        return false;
    }
}
