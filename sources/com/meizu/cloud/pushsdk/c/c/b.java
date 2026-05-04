package com.meizu.cloud.pushsdk.c.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class b extends j {

    /* renamed from: a, reason: collision with root package name */
    private static final g f39532a = g.a("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f39533b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f39534c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f39535a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f39536b = new ArrayList();

        public a a(String str, String str2) {
            this.f39535a.add(f.a(str, okhttp3.i.f77294u, false, false, true, true));
            this.f39536b.add(f.a(str2, okhttp3.i.f77294u, false, false, true, true));
            return this;
        }

        public a b(String str, String str2) {
            this.f39535a.add(f.a(str, okhttp3.i.f77294u, true, false, true, true));
            this.f39536b.add(f.a(str2, okhttp3.i.f77294u, true, false, true, true));
            return this;
        }

        public b a() {
            return new b(this.f39535a, this.f39536b);
        }
    }

    private b(List<String> list, List<String> list2) {
        this.f39533b = m.a(list);
        this.f39534c = m.a(list2);
    }

    private long a(com.meizu.cloud.pushsdk.c.g.c cVar, boolean z11) {
        com.meizu.cloud.pushsdk.c.g.b bVar = z11 ? new com.meizu.cloud.pushsdk.c.g.b() : cVar.b();
        int size = this.f39533b.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                bVar.b(38);
            }
            bVar.b(this.f39533b.get(i11));
            bVar.b(61);
            bVar.b(this.f39534c.get(i11));
        }
        if (!z11) {
            return 0L;
        }
        long a11 = bVar.a();
        bVar.j();
        return a11;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public long b() {
        return a((com.meizu.cloud.pushsdk.c.g.c) null, true);
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public g a() {
        return f39532a;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public void a(com.meizu.cloud.pushsdk.c.g.c cVar) {
        a(cVar, false);
    }
}
