package q0;

import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ViewSizeResolvers")
/* loaded from: classes3.dex */
public final class k {
    @w00.j(name = "create")
    @w00.k
    @m80.k
    public static final <T extends View> j<T> a(@m80.k T t11) {
        return c(t11, false, 2, null);
    }

    @w00.j(name = "create")
    @w00.k
    @m80.k
    public static final <T extends View> j<T> b(@m80.k T t11, boolean z11) {
        return new f(t11, z11);
    }

    public static /* synthetic */ j c(View view, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return b(view, z11);
    }
}
