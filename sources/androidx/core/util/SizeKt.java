package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class SizeKt {
    @RequiresApi(21)
    public static final int component1(@k Size size) {
        return size.getWidth();
    }

    @RequiresApi(21)
    public static final int component2(@k Size size) {
        return size.getHeight();
    }

    @RequiresApi(21)
    public static final float component1(@k SizeF sizeF) {
        return sizeF.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(@k SizeF sizeF) {
        return sizeF.getHeight();
    }

    public static final float component1(@k SizeFCompat sizeFCompat) {
        return sizeFCompat.getWidth();
    }

    public static final float component2(@k SizeFCompat sizeFCompat) {
        return sizeFCompat.getHeight();
    }
}
