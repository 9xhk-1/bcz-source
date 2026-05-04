package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BulletSpanWithLevel {
    public static final int $stable = 8;

    @k
    private final Bullet bullet;
    private final int indentationLevel;
    private final int start;

    public BulletSpanWithLevel(@k Bullet bullet, int i11, int i12) {
        this.bullet = bullet;
        this.indentationLevel = i11;
        this.start = i12;
    }

    public static /* synthetic */ BulletSpanWithLevel copy$default(BulletSpanWithLevel bulletSpanWithLevel, Bullet bullet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i13 & 2) != 0) {
            i11 = bulletSpanWithLevel.indentationLevel;
        }
        if ((i13 & 4) != 0) {
            i12 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.copy(bullet, i11, i12);
    }

    @k
    public final Bullet component1() {
        return this.bullet;
    }

    public final int component2() {
        return this.indentationLevel;
    }

    public final int component3() {
        return this.start;
    }

    @k
    public final BulletSpanWithLevel copy(@k Bullet bullet, int i11, int i12) {
        return new BulletSpanWithLevel(bullet, i11, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return g0.g(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    @k
    public final Bullet getBullet() {
        return this.bullet;
    }

    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.bullet.hashCode() * 31) + Integer.hashCode(this.indentationLevel)) * 31) + Integer.hashCode(this.start);
    }

    @k
    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.bullet + ", indentationLevel=" + this.indentationLevel + ", start=" + this.start + ')';
    }
}
