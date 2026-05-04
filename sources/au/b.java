package au;

import android.content.res.Resources;
import android.util.TypedValue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static int a(int i11) {
        return (int) TypedValue.applyDimension(1, i11, Resources.getSystem().getDisplayMetrics());
    }

    public static int b(float f11) {
        return (int) TypedValue.applyDimension(0, f11, Resources.getSystem().getDisplayMetrics());
    }
}
