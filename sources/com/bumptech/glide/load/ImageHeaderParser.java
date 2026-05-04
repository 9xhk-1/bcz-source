package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import lk.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28712a = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z11) {
            this.hasAlpha = z11;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i11 = a.f28713a[ordinal()];
            return i11 == 1 || i11 == 2 || i11 == 3;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28713a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f28713a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28713a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28713a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    boolean a(@NonNull ByteBuffer byteBuffer, @NonNull b bVar) throws IOException;

    int b(@NonNull ByteBuffer byteBuffer, @NonNull b bVar) throws IOException;

    @NonNull
    ImageType c(@NonNull InputStream inputStream) throws IOException;

    int d(@NonNull InputStream inputStream, @NonNull b bVar) throws IOException;

    @NonNull
    ImageType e(@NonNull ByteBuffer byteBuffer) throws IOException;

    boolean f(@NonNull InputStream inputStream, @NonNull b bVar) throws IOException;
}
