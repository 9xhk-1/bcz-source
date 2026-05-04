package e50;

import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    public static final /* synthetic */ <T extends Parcelable> Parcelable.Creator<T> a() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object obj = Parcelable.class.getDeclaredField("CREATOR").get(null);
        Parcelable.Creator<T> creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : null;
        if (creator != null) {
            return creator;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not access CREATOR field in class ");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(o0.d(Parcelable.class).C());
        throw new IllegalArgumentException(sb2.toString());
    }
}
