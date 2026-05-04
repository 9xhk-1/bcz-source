package com.huawei.updatesdk.a.a.d.i;

import android.content.Context;
import com.huawei.updatesdk.a.a.d.f;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends com.huawei.updatesdk.a.b.c.c.b {
    private String abis_;
    private String deviceFeatures_;
    private int dpi_;
    private String preferLan_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.updatesdk.a.a.d.i.b$b, reason: collision with other inner class name */
    public static class C0451b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36822a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36823b;

        /* renamed from: c, reason: collision with root package name */
        private Set<String> f36824c;

        /* renamed from: d, reason: collision with root package name */
        private String[] f36825d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f36826e;

        public C0451b(Context context) {
            this.f36822a = context;
        }

        private String b() {
            ArrayList arrayList = new ArrayList(c.c(this.f36822a));
            Set<String> set = this.f36824c;
            if (set != null) {
                for (String str : set) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            return this.f36826e ? f.a(c.a(arrayList, this.f36825d), ",") : f.a(arrayList, ",");
        }

        public C0451b a(boolean z11) {
            this.f36823b = z11;
            return this;
        }

        public b a() {
            b bVar = new b();
            bVar.abis_ = f.a(c.i(), ",");
            bVar.dpi_ = Integer.parseInt(c.e(this.f36822a));
            bVar.preferLan_ = b();
            if (this.f36823b) {
                bVar.deviceFeatures_ = c.a(this.f36822a);
            }
            return bVar;
        }
    }

    private b() {
    }
}
