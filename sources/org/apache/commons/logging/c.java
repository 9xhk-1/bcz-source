package org.apache.commons.logging;

import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f77650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77651b;

    public c(ClassLoader classLoader, String str) {
        this.f77650a = classLoader;
        this.f77651b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.f77650a;
        return classLoader != null ? classLoader.getResourceAsStream(this.f77651b) : ClassLoader.getSystemResourceAsStream(this.f77651b);
    }
}
