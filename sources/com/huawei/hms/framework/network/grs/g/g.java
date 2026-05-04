package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f35704b = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> f35705c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f35706d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f35707a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<d> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f35708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35709b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f35710c;

        public a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.f35708a = cVar;
            this.f35709b = str;
            this.f35710c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.f35708a, g.this.f35707a).a(g.f35704b, this.f35709b, this.f35710c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f35712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f35714c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35715d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.b f35716e;

        public b(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i11, com.huawei.hms.framework.network.grs.b bVar) {
            this.f35712a = cVar;
            this.f35713b = str;
            this.f35714c = cVar2;
            this.f35715d = i11;
            this.f35716e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.f35712a, this.f35713b, this.f35714c, this.f35715d), this.f35716e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        if (r2.a() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.framework.network.grs.g.d a(com.huawei.hms.framework.network.grs.g.j.c r8, java.lang.String r9, com.huawei.hms.framework.network.grs.e.c r10, int r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.g.a(com.huawei.hms.framework.network.grs.g.j.c, java.lang.String, com.huawei.hms.framework.network.grs.e.c, int):com.huawei.hms.framework.network.grs.g.d");
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f35707a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i11) {
        f35704b.execute(new b(cVar, str, cVar2, i11, bVar));
    }

    public void a(String str) {
        synchronized (f35706d) {
            f35705c.remove(str);
        }
    }
}
