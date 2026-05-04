package b50;

import java.util.Collection;
import y40.o;
import y40.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c {
    static /* synthetic */ o a(c cVar, j jVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return cVar.b(jVar, z11);
    }

    static /* synthetic */ void d(c cVar, j jVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cVar.l(jVar, z11);
    }

    static /* synthetic */ void e(c cVar, j jVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        cVar.c(jVar, z11);
    }

    @m80.k
    o b(@m80.k j jVar, boolean z11);

    void c(@m80.k j jVar, boolean z11);

    boolean f(@m80.k j jVar);

    @m80.l
    b g(@m80.k j jVar);

    @m80.k
    p h(@m80.k j jVar);

    @m80.k
    Collection<j> i(@m80.k j jVar);

    void j(@m80.k j jVar, @m80.k j jVar2);

    @m80.k
    j k(@m80.k j jVar);

    void l(@m80.k j jVar, boolean z11);
}
