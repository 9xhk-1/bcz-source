package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes2.dex */
class VolumeProviderCompatApi21 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Delegate {
        void onAdjustVolume(int i11);

        void onSetVolumeTo(int i11);
    }

    private VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i11, int i12, int i13, final Delegate delegate) {
        return new VolumeProvider(i11, i12, i13) { // from class: androidx.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i14) {
                delegate.onAdjustVolume(i14);
            }

            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i14) {
                delegate.onSetVolumeTo(i14);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i11) {
        ((VolumeProvider) obj).setCurrentVolume(i11);
    }
}
