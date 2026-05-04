package u9;

import com.baicizhan.client.business.managers.experience.TaskAction;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ void d(f fVar, TaskAction taskAction, boolean z11, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doTask");
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        fVar.c(taskAction, z11, i11);
    }

    @k
    kotlinx.coroutines.flow.i<Boolean> a();

    void b();

    void c(@k TaskAction taskAction, boolean z11, int i11);
}
