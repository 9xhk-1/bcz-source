package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class IconKt {
    @RequiresApi(26)
    @k
    public static final Icon toAdaptiveIcon(@k Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    @RequiresApi(26)
    @k
    public static final Icon toIcon(@k Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @RequiresApi(26)
    @k
    public static final Icon toIcon(@k Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @RequiresApi(26)
    @k
    public static final Icon toIcon(@k byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
