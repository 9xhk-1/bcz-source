package uk;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
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
@Deprecated
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f92263a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.b f92264b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements u<Drawable> {

        /* renamed from: b, reason: collision with root package name */
        public static final int f92265b = 2;

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedImageDrawable f92266a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f92266a = animatedImageDrawable;
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
            return this.f92266a;
        }

        @Override // kk.u
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f92266a.getIntrinsicWidth();
            intrinsicHeight = this.f92266a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * o.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // kk.u
        public void recycle() {
            this.f92266a.stop();
            this.f92266a.clearAnimationCallbacks();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ik.f<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final f f92267a;

        public b(f fVar) {
            this.f92267a = fVar;
        }

        @Override // ik.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull ik.e eVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f92267a.b(createSource, i11, i12, eVar);
        }

        @Override // ik.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull ik.e eVar) throws IOException {
            return this.f92267a.d(byteBuffer);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ik.f<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final f f92268a;

        public c(f fVar) {
            this.f92268a = fVar;
        }

        @Override // ik.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull ik.e eVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(fl.a.b(inputStream));
            return this.f92268a.b(createSource, i11, i12, eVar);
        }

        @Override // ik.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull InputStream inputStream, @NonNull ik.e eVar) throws IOException {
            return this.f92268a.c(inputStream);
        }
    }

    public f(List<ImageHeaderParser> list, lk.b bVar) {
        this.f92263a = list;
        this.f92264b = bVar;
    }

    public static ik.f<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, lk.b bVar) {
        return new b(new f(list, bVar));
    }

    public static ik.f<InputStream, Drawable> f(List<ImageHeaderParser> list, lk.b bVar) {
        return new c(new f(list, bVar));
    }

    public u<Drawable> b(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new rk.d(i11, i12, eVar));
        if (q.a(decodeDrawable)) {
            return new a(v.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }

    public boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.f92263a, inputStream, this.f92264b));
    }

    public boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.f92263a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
