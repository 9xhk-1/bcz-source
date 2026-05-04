package rx;

import qb0.h;
import wb0.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface Emitter<T> extends qb0.c<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    void a(h hVar);

    void b(n nVar);

    long j();
}
