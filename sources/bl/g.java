package bl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import kk.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends a<g> {

    @Nullable
    private static g centerCropOptions;

    @Nullable
    private static g centerInsideOptions;

    @Nullable
    private static g circleCropOptions;

    @Nullable
    private static g fitCenterOptions;

    @Nullable
    private static g noAnimationOptions;

    @Nullable
    private static g noTransformOptions;

    @Nullable
    private static g skipMemoryCacheFalseOptions;

    @Nullable
    private static g skipMemoryCacheTrueOptions;

    @NonNull
    @CheckResult
    public static g bitmapTransform(@NonNull ik.h<Bitmap> hVar) {
        return new g().transform(hVar);
    }

    @NonNull
    @CheckResult
    public static g centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new g().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    @NonNull
    @CheckResult
    public static g centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new g().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    @NonNull
    @CheckResult
    public static g circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new g().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @NonNull
    @CheckResult
    public static g decodeTypeOf(@NonNull Class<?> cls) {
        return new g().decode(cls);
    }

    @NonNull
    @CheckResult
    public static g diskCacheStrategyOf(@NonNull j jVar) {
        return new g().diskCacheStrategy(jVar);
    }

    @NonNull
    @CheckResult
    public static g downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new g().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static g encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new g().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static g encodeQualityOf(@IntRange(from = 0, to = 100) int i11) {
        return new g().encodeQuality(i11);
    }

    @NonNull
    @CheckResult
    public static g errorOf(@Nullable Drawable drawable) {
        return new g().error(drawable);
    }

    @NonNull
    @CheckResult
    public static g fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new g().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    @NonNull
    @CheckResult
    public static g formatOf(@NonNull DecodeFormat decodeFormat) {
        return new g().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static g frameOf(@IntRange(from = 0) long j11) {
        return new g().frame(j11);
    }

    @NonNull
    @CheckResult
    public static g noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new g().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    @NonNull
    @CheckResult
    public static g noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new g().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    @NonNull
    @CheckResult
    public static <T> g option(@NonNull ik.d<T> dVar, @NonNull T t11) {
        return new g().set(dVar, t11);
    }

    @NonNull
    @CheckResult
    public static g overrideOf(int i11, int i12) {
        return new g().override(i11, i12);
    }

    @NonNull
    @CheckResult
    public static g placeholderOf(@Nullable Drawable drawable) {
        return new g().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static g priorityOf(@NonNull Priority priority) {
        return new g().priority(priority);
    }

    @NonNull
    @CheckResult
    public static g signatureOf(@NonNull ik.b bVar) {
        return new g().signature(bVar);
    }

    @NonNull
    @CheckResult
    public static g sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return new g().sizeMultiplier(f11);
    }

    @NonNull
    @CheckResult
    public static g skipMemoryCacheOf(boolean z11) {
        if (z11) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new g().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new g().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @NonNull
    @CheckResult
    public static g timeoutOf(@IntRange(from = 0) int i11) {
        return new g().timeout(i11);
    }

    @Override // bl.a
    public boolean equals(Object obj) {
        return (obj instanceof g) && super.equals(obj);
    }

    @Override // bl.a
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    @CheckResult
    public static g errorOf(@DrawableRes int i11) {
        return new g().error(i11);
    }

    @NonNull
    @CheckResult
    public static g overrideOf(int i11) {
        return overrideOf(i11, i11);
    }

    @NonNull
    @CheckResult
    public static g placeholderOf(@DrawableRes int i11) {
        return new g().placeholder(i11);
    }
}
