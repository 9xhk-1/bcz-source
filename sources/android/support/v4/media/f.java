package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Parcel;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes.dex */
public class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public static Object a(Object obj) {
            return ((MediaMetadata.Builder) obj).build();
        }

        public static Object b() {
            return new MediaMetadata.Builder();
        }

        public static void c(Object obj, String str, Bitmap bitmap) {
            ((MediaMetadata.Builder) obj).putBitmap(str, bitmap);
        }

        public static void d(Object obj, String str, long j11) {
            ((MediaMetadata.Builder) obj).putLong(str, j11);
        }

        public static void e(Object obj, String str, Object obj2) {
            ((MediaMetadata.Builder) obj).putRating(str, (Rating) obj2);
        }

        public static void f(Object obj, String str, String str2) {
            ((MediaMetadata.Builder) obj).putString(str, str2);
        }

        public static void g(Object obj, String str, CharSequence charSequence) {
            ((MediaMetadata.Builder) obj).putText(str, charSequence);
        }
    }

    public static Object a(Parcel parcel) {
        return MediaMetadata.CREATOR.createFromParcel(parcel);
    }

    public static Bitmap b(Object obj, String str) {
        return ((MediaMetadata) obj).getBitmap(str);
    }

    public static long c(Object obj, String str) {
        return ((MediaMetadata) obj).getLong(str);
    }

    public static Object d(Object obj, String str) {
        return ((MediaMetadata) obj).getRating(str);
    }

    public static CharSequence e(Object obj, String str) {
        return ((MediaMetadata) obj).getText(str);
    }

    public static Set<String> f(Object obj) {
        return ((MediaMetadata) obj).keySet();
    }

    public static void g(Object obj, Parcel parcel, int i11) {
        ((MediaMetadata) obj).writeToParcel(parcel, i11);
    }
}
