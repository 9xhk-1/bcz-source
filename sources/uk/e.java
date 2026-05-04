package uk;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import f0.q;
import f0.v;
import fl.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f92257a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.b f92258b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements u<Drawable> {

        /* renamed from: b, reason: collision with root package name */
        public static final int f92259b = 2;

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedImageDrawable f92260a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f92260a = animatedImageDrawable;
        }

        @Override // kk.u
        @NonNull
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // kk.u
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f92260a;
        }

        @Override // kk.u
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f92260a.getIntrinsicWidth();
            intrinsicHeight = this.f92260a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * o.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // kk.u
        public void recycle() {
            this.f92260a.stop();
            this.f92260a.clearAnimationCallbacks();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ik.f<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final e f92261a;

        public b(e eVar) {
            this.f92261a = eVar;
        }

        @Override // ik.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull ik.e eVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f92261a.b(createSource, i11, i12, eVar);
        }

        @Override // ik.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull ik.e eVar) throws IOException {
            return this.f92261a.d(byteBuffer);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ik.f<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final e f92262a;

        public c(e eVar) {
            this.f92262a = eVar;
        }

        @Override // ik.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull ik.e eVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(fl.a.b(inputStream));
            return this.f92262a.b(createSource, i11, i12, eVar);
        }

        @Override // ik.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull InputStream inputStream, @NonNull ik.e eVar) throws IOException {
            return this.f92262a.c(inputStream);
        }
    }

    public e(List<ImageHeaderParser> list, lk.b bVar) {
        this.f92257a = list;
        this.f92258b = bVar;
    }

    public static ik.f<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, lk.b bVar) {
        return new b(new e(list, bVar));
    }

    public static ik.f<InputStream, Drawable> f(List<ImageHeaderParser> list, lk.b bVar) {
        return new c(new e(list, bVar));
    }

    public u<Drawable> b(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new rk.d(i11, i12, eVar));
        if (q.a(decodeDrawable)) {
            return new a(v.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.f92257a, inputStream, this.f92258b));
    }

    public boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.f92257a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
