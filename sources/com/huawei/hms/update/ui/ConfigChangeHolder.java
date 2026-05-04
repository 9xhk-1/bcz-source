package com.huawei.hms.update.ui;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ConfigChangeHolder {

    /* renamed from: b, reason: collision with root package name */
    private static volatile ConfigChangeHolder f36544b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f36545a = false;

    private ConfigChangeHolder() {
    }

    public static ConfigChangeHolder getInstance() {
        if (f36544b == null) {
            synchronized (ConfigChangeHolder.class) {
                try {
                    if (f36544b == null) {
                        f36544b = new ConfigChangeHolder();
                    }
                } finally {
                }
            }
        }
        return f36544b;
    }

    public boolean isChanged() {
        return this.f36545a;
    }

    public void setChanged(boolean z11) {
        this.f36545a = z11;
    }
}
