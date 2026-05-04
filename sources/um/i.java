package um;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i {
    @Composable
    @a
    @m80.k
    public static final h a(@m80.k String permission, @m80.l Composer composer, int i11) {
        g0.p(permission, "permission");
        composer.startReplaceableGroup(1712149548);
        f a11 = g.a(permission, composer, i11 & 14);
        composer.endReplaceableGroup();
        return a11;
    }
}
