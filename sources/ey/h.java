package ey;

import java.io.File;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements d {
    @Override // ey.d
    @m80.l
    public a load(@m80.l String str) {
        ju.a I;
        ju.a l11;
        if (str == null) {
            str = "application.conf";
        } else if (!f0.b2(str, ".conf", false, 2, null) && !f0.b2(str, ".json", false, 2, null) && !f0.b2(str, ".properties", false, 2, null)) {
            return null;
        }
        if (Thread.currentThread().getContextClassLoader().getResource(str) != null) {
            I = com.typesafe.config.a.z(str);
        } else {
            File file = new File(str);
            I = file.exists() ? com.typesafe.config.a.I(file) : null;
        }
        if (I == null || (l11 = I.l()) == null) {
            return null;
        }
        return new f(l11);
    }
}
