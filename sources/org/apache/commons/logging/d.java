package org.apache.commons.logging;

import java.io.IOException;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f77652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77653b;

    public d(ClassLoader classLoader, String str) {
        this.f77652a = classLoader;
        this.f77653b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.f77652a;
            return classLoader != null ? classLoader.getResources(this.f77653b) : ClassLoader.getSystemResources(this.f77653b);
        } catch (IOException e11) {
            if (g.z()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.f77653b);
                stringBuffer.append(":");
                stringBuffer.append(e11.getMessage());
                g.B(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
