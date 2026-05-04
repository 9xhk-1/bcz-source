package org.apache.commons.logging.impl;

import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77684b;

    public c(String str, String str2) {
        this.f77683a = str;
        this.f77684b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f77683a, this.f77684b);
    }
}
