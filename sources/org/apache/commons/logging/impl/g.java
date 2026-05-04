package org.apache.commons.logging.impl;

import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77700a;

    public g(String str) {
        this.f77700a = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader contextClassLoader;
        contextClassLoader = SimpleLog.getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader.getResourceAsStream(this.f77700a) : ClassLoader.getSystemResourceAsStream(this.f77700a);
    }
}
