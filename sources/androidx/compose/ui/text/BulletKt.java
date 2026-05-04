package androidx.compose.ui.text;

import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.unit.TextUnitKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BulletKt {

    @k
    private static final Bullet DefaultBullet;
    private static final long DefaultBulletIndentation = TextUnitKt.getEm(1);
    private static final long DefaultBulletPadding;
    private static final long DefaultBulletSize;

    static {
        long em2 = TextUnitKt.getEm(0.25d);
        DefaultBulletSize = em2;
        long em3 = TextUnitKt.getEm(0.25d);
        DefaultBulletPadding = em3;
        DefaultBullet = new Bullet(CircleShape.INSTANCE, em2, em3, null, 1.0f, Fill.INSTANCE, null);
    }

    @k
    public static final Bullet getDefaultBullet() {
        return DefaultBullet;
    }

    public static final long getDefaultBulletIndentation() {
        return DefaultBulletIndentation;
    }
}
