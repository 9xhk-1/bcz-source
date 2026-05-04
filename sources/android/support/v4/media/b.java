package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes.dex */
public class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(Parcel parcel);

        void onError(@NonNull String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: android.support.v4.media.b$b, reason: collision with other inner class name */
    public static class C0028b<T extends a> extends MediaBrowser.ItemCallback {

        /* renamed from: a, reason: collision with root package name */
        public final T f2878a;

        public C0028b(T t11) {
            this.f2878a = t11;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(@NonNull String str) {
            this.f2878a.onError(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f2878a.a(null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f2878a.a(obtain);
        }
    }

    public static Object a(a aVar) {
        return new C0028b(aVar);
    }

    public static void b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}
