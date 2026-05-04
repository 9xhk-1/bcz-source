package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityComposeUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T findOwner(Context context) {
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
        return context;
    }
}
