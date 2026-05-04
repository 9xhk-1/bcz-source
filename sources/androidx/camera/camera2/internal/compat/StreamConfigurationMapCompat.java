package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import androidx.camera.core.Logger;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class StreamConfigurationMapCompat {
    private static final String TAG = "StreamConfigurationMapCompat";
    private final StreamConfigurationMapCompatImpl mImpl;
    private final OutputSizesCorrector mOutputSizesCorrector;
    private final Map<Integer, Size[]> mCachedFormatOutputSizes = new HashMap();
    private final Map<Integer, Size[]> mCachedFormatHighResolutionOutputSizes = new HashMap();
    private final Map<Class<?>, Size[]> mCachedClassOutputSizes = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface StreamConfigurationMapCompatImpl {
        @Nullable
        Size[] getHighResolutionOutputSizes(int i11);

        @Nullable
        int[] getOutputFormats();

        @Nullable
        Size[] getOutputSizes(int i11);

        @Nullable
        <T> Size[] getOutputSizes(@NonNull Class<T> cls);

        @NonNull
        StreamConfigurationMap unwrap();
    }

    private StreamConfigurationMapCompat(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull OutputSizesCorrector outputSizesCorrector) {
        this.mImpl = new StreamConfigurationMapCompatApi23Impl(streamConfigurationMap);
        this.mOutputSizesCorrector = outputSizesCorrector;
    }

    @NonNull
    public static StreamConfigurationMapCompat toStreamConfigurationMapCompat(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull OutputSizesCorrector outputSizesCorrector) {
        return new StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }

    @Nullable
    public Size[] getHighResolutionOutputSizes(int i11) {
        if (this.mCachedFormatHighResolutionOutputSizes.containsKey(Integer.valueOf(i11))) {
            if (this.mCachedFormatHighResolutionOutputSizes.get(Integer.valueOf(i11)) == null) {
                return null;
            }
            return (Size[]) this.mCachedFormatHighResolutionOutputSizes.get(Integer.valueOf(i11)).clone();
        }
        Size[] highResolutionOutputSizes = this.mImpl.getHighResolutionOutputSizes(i11);
        if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
            highResolutionOutputSizes = this.mOutputSizesCorrector.applyQuirks(highResolutionOutputSizes, i11);
        }
        this.mCachedFormatHighResolutionOutputSizes.put(Integer.valueOf(i11), highResolutionOutputSizes);
        if (highResolutionOutputSizes != null) {
            return (Size[]) highResolutionOutputSizes.clone();
        }
        return null;
    }

    @Nullable
    public int[] getOutputFormats() {
        int[] outputFormats = this.mImpl.getOutputFormats();
        if (outputFormats == null) {
            return null;
        }
        return (int[]) outputFormats.clone();
    }

    @Nullable
    public Size[] getOutputSizes(int i11) {
        if (this.mCachedFormatOutputSizes.containsKey(Integer.valueOf(i11))) {
            if (this.mCachedFormatOutputSizes.get(Integer.valueOf(i11)) == null) {
                return null;
            }
            return (Size[]) this.mCachedFormatOutputSizes.get(Integer.valueOf(i11)).clone();
        }
        Size[] outputSizes = this.mImpl.getOutputSizes(i11);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] applyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, i11);
            this.mCachedFormatOutputSizes.put(Integer.valueOf(i11), applyQuirks);
            return (Size[]) applyQuirks.clone();
        }
        Logger.w(TAG, "Retrieved output sizes array is null or empty for format " + i11);
        return outputSizes;
    }

    @NonNull
    public StreamConfigurationMap toStreamConfigurationMap() {
        return this.mImpl.unwrap();
    }

    @Nullable
    public <T> Size[] getOutputSizes(@NonNull Class<T> cls) {
        if (this.mCachedClassOutputSizes.containsKey(cls)) {
            if (this.mCachedClassOutputSizes.get(cls) == null) {
                return null;
            }
            return (Size[]) this.mCachedClassOutputSizes.get(cls).clone();
        }
        Size[] outputSizes = this.mImpl.getOutputSizes(cls);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] applyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, cls);
            this.mCachedClassOutputSizes.put(cls, applyQuirks);
            return (Size[]) applyQuirks.clone();
        }
        Logger.w(TAG, "Retrieved output sizes array is null or empty for class " + cls);
        return outputSizes;
    }
}
