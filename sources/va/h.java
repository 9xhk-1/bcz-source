package va;

import android.widget.Toast;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h {
    public static final void a(@m80.k x00.l<? super Toast, g2> block) {
        g0.p(block, "block");
        Toast toast = new Toast(pb.a.a());
        try {
            block.invoke(toast);
        } catch (Exception e11) {
            qb.c.c("customizedToast", "", e11);
        }
        toast.show();
    }
}
