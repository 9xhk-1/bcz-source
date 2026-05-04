package ba0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class v1 {
    public static String a(Class<?> clazz) {
        Package r02 = clazz.getPackage();
        if (r02 != null) {
            return r02.getName();
        }
        String name = clazz.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(0, lastIndexOf);
    }
}
