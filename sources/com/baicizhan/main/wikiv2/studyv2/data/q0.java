package com.baicizhan.main.wikiv2.studyv2.data;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface q0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ kotlinx.coroutines.flow.i b(q0 q0Var, Context context, int i11, int i12, boolean z11, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        return q0Var.a(context, i11, i12, z11);
    }

    @m80.k
    kotlinx.coroutines.flow.i<List<?>> a(@m80.k Context context, int i11, int i12, boolean z11);
}
