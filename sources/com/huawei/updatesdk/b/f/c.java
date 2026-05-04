package com.huawei.updatesdk.b.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f36905a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static com.huawei.updatesdk.b.f.a f36906b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements com.huawei.updatesdk.b.f.a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f36907a = new ArrayList();

        @Override // com.huawei.updatesdk.b.f.a
        public void a(int i11, com.huawei.updatesdk.a.b.b.b bVar) {
            synchronized (this.f36907a) {
                try {
                    Iterator<b> it = this.f36907a.iterator();
                    while (it.hasNext()) {
                        it.next().a(i11, bVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.huawei.updatesdk.b.f.a
        public void b(b bVar) {
            synchronized (this.f36907a) {
                try {
                    this.f36907a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("InstallObserverManager", "unRegisterObserver UnsupportedOperationException");
                }
            }
        }

        @Override // com.huawei.updatesdk.b.f.a
        public void a(b bVar) {
            String str;
            String str2;
            synchronized (this.f36907a) {
                try {
                    if (bVar == null) {
                        return;
                    }
                    if (!this.f36907a.contains(bVar)) {
                        try {
                            this.f36907a.add(bVar);
                        } catch (ClassCastException unused) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver ClassCastException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        } catch (IllegalArgumentException unused2) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver IllegalArgumentException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        } catch (UnsupportedOperationException unused3) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver UnsupportedOperationException";
                            com.huawei.updatesdk.a.a.c.a.a.a.b(str, str2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private c() {
    }

    public static com.huawei.updatesdk.b.f.a a() {
        return f36906b;
    }

    public static c b() {
        return f36905a;
    }

    public void c(com.huawei.updatesdk.a.b.b.b bVar) {
        f36906b.a(2, bVar);
    }

    public void a(com.huawei.updatesdk.a.b.b.b bVar) {
        f36906b.a(1, bVar);
    }

    public void b(com.huawei.updatesdk.a.b.b.b bVar) {
        f36906b.a(0, bVar);
    }
}
