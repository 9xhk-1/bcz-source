package um;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c {
    @Composable
    @a
    @m80.k
    public static final b a(@m80.k List<String> permissions, @m80.l Composer composer, int i11) {
        g0.p(permissions, "permissions");
        composer.startReplaceableGroup(-916785894);
        b a11 = e.a(permissions, composer, 8);
        composer.endReplaceableGroup();
        return a11;
    }
}
