package com.tencent.liteav.beauty;

import com.alipay.sdk.m.u.i;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a extends com.tencent.liteav.basic.module.a {

    /* renamed from: a, reason: collision with root package name */
    private C0513a f43471a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.beauty.a$a, reason: collision with other inner class name */
    public static class C0513a {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f43472a;

        public String a() {
            String str = "";
            for (String str2 : this.f43472a.keySet()) {
                str = str + str2 + ":" + this.f43472a.get(str2) + " ";
            }
            return "{" + str + i.f11099d;
        }
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        setStatusValue(3001, this.f43471a.a());
    }
}
