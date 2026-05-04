package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i11, int i12) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) spanned.getSpans(i11, i12, Object.class);
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = spanned.length();
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return spanned.getSpans(i11, i12, Object.class);
    }

    @m80.k
    public static final Spanned toSpanned(@m80.k CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
