package com.tencent.bugly.proguard;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class m implements Serializable {
    public abstract void a(k kVar);

    public abstract void a(l lVar);

    public abstract void a(StringBuilder sb2, int i11);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, 0);
        return sb2.toString();
    }
}
