package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompatApi21;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private Object mVolumeProviderObj;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i11, int i12, int i13) {
        this.mControlType = i11;
        this.mMaxVolume = i12;
        this.mCurrentVolume = i13;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public Object getVolumeProvider() {
        if (this.mVolumeProviderObj == null) {
            this.mVolumeProviderObj = VolumeProviderCompatApi21.createVolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, new VolumeProviderCompatApi21.Delegate() { // from class: androidx.media.VolumeProviderCompat.1
                @Override // androidx.media.VolumeProviderCompatApi21.Delegate
                public void onAdjustVolume(int i11) {
                    VolumeProviderCompat.this.onAdjustVolume(i11);
                }

                @Override // androidx.media.VolumeProviderCompatApi21.Delegate
                public void onSetVolumeTo(int i11) {
                    VolumeProviderCompat.this.onSetVolumeTo(i11);
                }
            });
        }
        return this.mVolumeProviderObj;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public final void setCurrentVolume(int i11) {
        this.mCurrentVolume = i11;
        Object volumeProvider = getVolumeProvider();
        if (volumeProvider != null) {
            VolumeProviderCompatApi21.setCurrentVolume(volumeProvider, i11);
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public void onAdjustVolume(int i11) {
    }

    public void onSetVolumeTo(int i11) {
    }
}
