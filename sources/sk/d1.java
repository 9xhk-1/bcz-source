package sk;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import ik.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d1<T> implements ik.f<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final String f88740d = "VideoDecoder";

    /* renamed from: e, reason: collision with root package name */
    public static final long f88741e = -1;

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    public static final int f88742f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final ik.d<Long> f88743g = ik.d.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: h, reason: collision with root package name */
    public static final ik.d<Integer> f88744h = ik.d.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: i, reason: collision with root package name */
    public static final f f88745i = new f();

    /* renamed from: j, reason: collision with root package name */
    public static final List<String> f88746j = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: k, reason: collision with root package name */
    public static final String f88747k = "video/webm";

    /* renamed from: a, reason: collision with root package name */
    public final e<T> f88748a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.e f88749b;

    /* renamed from: c, reason: collision with root package name */
    public final f f88750c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f88751a = ByteBuffer.allocate(8);

        @Override // ik.d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Long l11, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f88751a) {
                this.f88751a.position(0);
                messageDigest.update(this.f88751a.putLong(l11.longValue()).array());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements d.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f88752a = ByteBuffer.allocate(4);

        @Override // ik.d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f88752a) {
                this.f88752a.position(0);
                messageDigest.update(this.f88752a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(16)
    public static final class c implements e<AssetFileDescriptor> {
        public c() {
        }

        @Override // sk.d1.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // sk.d1.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public interface e<T> {
        @RequiresApi(16)
        void a(MediaExtractor mediaExtractor, T t11) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements e<ParcelFileDescriptor> {
        @Override // sk.d1.e
        @RequiresApi(16)
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // sk.d1.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public d1(lk.e eVar, e<T> eVar2) {
        this(eVar, eVar2, f88745i);
    }

    @RequiresApi(16)
    public static ik.f<AssetFileDescriptor, Bitmap> c(lk.e eVar) {
        return new d1(eVar, new c(null));
    }

    @RequiresApi(api = 23)
    public static ik.f<ByteBuffer, Bitmap> d(lk.e eVar) {
        return new d1(eVar, new d());
    }

    @TargetApi(30)
    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable(f88740d, 3)) {
                        Log.d(f88740d, "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable(f88740d, 3)) {
                    return bitmap;
                }
                Log.d(f88740d, "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11) {
        return mediaMetadataRetriever.getFrameAtTime(j11, i11);
    }

    @Nullable
    @TargetApi(27)
    public static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, DownsampleStrategy downsampleStrategy) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b11 = downsampleStrategy.b(parseInt, parseInt2, i12, i13);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(parseInt * b11), Math.round(b11 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th2) {
            if (!Log.isLoggable(f88740d, 3)) {
                return null;
            }
            Log.d(f88740d, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    @RequiresApi(30)
    public static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    @VisibleForTesting
    public static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 30 && i11 < 33;
    }

    public static boolean k() {
        Iterator<String> it = f88746j.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static ik.f<ParcelFileDescriptor, Bitmap> m(lk.e eVar) {
        return new d1(eVar, new g());
    }

    @Override // ik.f
    public kk.u<Bitmap> a(@NonNull T t11, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        long longValue = ((Long) eVar.c(f88743g)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) eVar.c(f88744h);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.c(DownsampleStrategy.f28814h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f28813g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever a11 = this.f88750c.a();
        try {
            this.f88748a.b(a11, t11);
            try {
                Bitmap f11 = f(t11, a11, longValue, num.intValue(), i11, i12, downsampleStrategy2);
                if (Build.VERSION.SDK_INT >= 29) {
                    androidx.documentfile.provider.a.a(a11);
                } else {
                    a11.release();
                }
                return sk.h.c(f11, this.f88749b);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    androidx.documentfile.provider.a.a(a11);
                    throw th3;
                }
                a11.release();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // ik.f
    public boolean b(@NonNull T t11, @NonNull ik.e eVar) {
        return true;
    }

    @Nullable
    public final Bitmap f(@NonNull T t11, MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, DownsampleStrategy downsampleStrategy) {
        if (l(t11, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap h11 = (Build.VERSION.SDK_INT < 27 || i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f28812f) ? null : h(mediaMetadataRetriever, j11, i11, i12, i13, downsampleStrategy);
        if (h11 == null) {
            h11 = g(mediaMetadataRetriever, j11, i11);
        }
        Bitmap e11 = e(mediaMetadataRetriever, h11);
        if (e11 != null) {
            return e11;
        }
        throw new h();
    }

    public final boolean l(@NonNull T t11, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f88748a.a(mediaExtractor2, t11);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i11 = 0; i11 < trackCount; i11++) {
                if (MimeTypes.VIDEO_VP8.equals(mediaExtractor2.getTrackFormat(i11).getString(IMediaFormat.KEY_MIME))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th3) {
            th = th3;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable(f88740d, 3)) {
                    Log.d(f88740d, "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    @VisibleForTesting
    public d1(lk.e eVar, e<T> eVar2, f fVar) {
        this.f88749b = eVar;
        this.f88748a = eVar2;
        this.f88750c = fVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static final class d implements e<ByteBuffer> {
        public final MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // sk.d1.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // sk.d1.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends MediaDataSource {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ByteBuffer f88753a;

            public a(ByteBuffer byteBuffer) {
                this.f88753a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f88753a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j11, byte[] bArr, int i11, int i12) {
                if (j11 >= this.f88753a.limit()) {
                    return -1;
                }
                this.f88753a.position((int) j11);
                int min = Math.min(i12, this.f88753a.remaining());
                this.f88753a.get(bArr, i11, min);
                return min;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
