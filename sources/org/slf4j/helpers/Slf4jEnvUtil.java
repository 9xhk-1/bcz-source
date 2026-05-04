package org.slf4j.helpers;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Slf4jEnvUtil {
    public static String slf4jVersion() {
        Package r02 = Slf4jEnvUtil.class.getPackage();
        if (r02 == null) {
            return null;
        }
        return r02.getImplementationVersion();
    }
}
