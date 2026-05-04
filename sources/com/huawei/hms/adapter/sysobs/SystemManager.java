package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class SystemManager {

    /* renamed from: a, reason: collision with root package name */
    private static SystemManager f35312a = new SystemManager();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35313b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static SystemNotifier f35314c = new a();

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return f35312a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f35314c;
    }

    public void notifyNoticeResult(int i11) {
        f35314c.notifyNoticeObservers(i11);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f35314c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i11) {
        f35314c.notifyObservers(i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SystemNotifier {

        /* renamed from: a, reason: collision with root package name */
        private final List<SystemObserver> f35315a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i11) {
            synchronized (SystemManager.f35313b) {
                try {
                    Iterator<SystemObserver> it = this.f35315a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i11)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f35313b) {
                try {
                    Iterator<SystemObserver> it = this.f35315a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f35315a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f35313b) {
                this.f35315a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f35313b) {
                this.f35315a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i11) {
            synchronized (SystemManager.f35313b) {
                try {
                    Iterator<SystemObserver> it = this.f35315a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i11)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
