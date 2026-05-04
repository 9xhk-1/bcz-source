package pz;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface h<T> extends AutoCloseable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static <T> void a(@k h<T> hVar) {
            hVar.dispose();
        }
    }

    @k
    T U6();

    void b4(@k T t11);

    @Override // java.lang.AutoCloseable
    void close();

    void dispose();

    int getCapacity();
}
