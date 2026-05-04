package tv;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements nu.g<Object> {
        INSTANCE;

        @Override // nu.g
        public void injectMembers(Object instance) {
            s.c(instance, "Cannot inject members into a null reference");
        }
    }

    public static <T> nu.g<T> a() {
        return a.INSTANCE;
    }
}
