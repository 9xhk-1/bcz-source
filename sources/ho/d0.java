package ho;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class d0 extends l {
    public static boolean a(@CheckForNull Object a11, @CheckForNull Object b11) {
        if (a11 != b11) {
            return a11 != null && a11.equals(b11);
        }
        return true;
    }

    public static int b(@CheckForNull Object... objects) {
        return Arrays.hashCode(objects);
    }
}
