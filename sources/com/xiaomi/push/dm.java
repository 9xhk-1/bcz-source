package com.xiaomi.push;

/* loaded from: classes8.dex */
public class dm {

    /* renamed from: a, reason: collision with root package name */
    private static volatile dm f45395a;

    /* renamed from: a, reason: collision with other field name */
    private dl f261a;

    /* renamed from: a, reason: collision with other method in class */
    public dl m5824a() {
        return this.f261a;
    }

    public static dm a() {
        if (f45395a == null) {
            synchronized (dm.class) {
                try {
                    if (f45395a == null) {
                        f45395a = new dm();
                    }
                } finally {
                }
            }
        }
        return f45395a;
    }

    public void a(dl dlVar) {
        this.f261a = dlVar;
    }
}
