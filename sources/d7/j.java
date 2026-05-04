package d7;

import kotlinx.coroutines.flow.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ void b(j jVar, String str, h hVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i11 & 2) != 0) {
            hVar = null;
        }
        jVar.c(str, hVar);
    }

    void a();

    void c(@m80.k String str, @m80.l h hVar);

    @m80.k
    m0<i> getState();

    void pause();

    void release();

    void stop();
}
