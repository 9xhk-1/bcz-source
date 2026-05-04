package org.apache.commons.logging;

import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f77649b;

    public b(String str, ClassLoader classLoader) {
        this.f77648a = str;
        this.f77649b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return g.d(this.f77648a, this.f77649b);
    }
}
