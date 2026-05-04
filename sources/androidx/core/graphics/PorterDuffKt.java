package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PorterDuffKt {
    @m80.k
    public static final PorterDuffColorFilter toColorFilter(@m80.k PorterDuff.Mode mode, int i11) {
        return new PorterDuffColorFilter(i11, mode);
    }

    @m80.k
    public static final PorterDuffXfermode toXfermode(@m80.k PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
