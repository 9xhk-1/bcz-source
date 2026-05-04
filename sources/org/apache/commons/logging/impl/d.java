package org.apache.commons.logging.impl;

import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f77685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f77686b;

    public d(e eVar, ClassLoader classLoader) {
        this.f77686b = eVar;
        this.f77685a = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return this.f77685a.getParent();
    }
}
