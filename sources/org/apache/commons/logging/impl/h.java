package org.apache.commons.logging.impl;

import java.util.Enumeration;
import org.apache.commons.logging.impl.WeakHashtable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Enumeration f77701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeakHashtable f77702b;

    public h(WeakHashtable weakHashtable, Enumeration enumeration) {
        this.f77702b = weakHashtable;
        this.f77701a = enumeration;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f77701a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return ((WeakHashtable.b) this.f77701a.nextElement()).b();
    }
}
