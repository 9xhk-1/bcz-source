package wk;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import fl.o;
import hk.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements ik.f<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f96414f = "BufferGifDecoder";

    /* renamed from: g, reason: collision with root package name */
    public static final C1293a f96415g = new C1293a();

    /* renamed from: h, reason: collision with root package name */
    public static final b f96416h = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f96417a;

    /* renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f96418b;

    /* renamed from: c, reason: collision with root package name */
    public final b f96419c;

    /* renamed from: d, reason: collision with root package name */
    public final C1293a f96420d;

    /* renamed from: e, reason: collision with root package name */
    public final wk.b f96421e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    /* renamed from: wk.a$a, reason: collision with other inner class name */
    public static class C1293a {
        public hk.a a(a.InterfaceC0675a interfaceC0675a, hk.c cVar, ByteBuffer byteBuffer, int i11) {
            return new hk.f(interfaceC0675a, cVar, byteBuffer, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<hk.d> f96422a = o.g(0);

        public synchronized hk.d a(ByteBuffer byteBuffer) {
            hk.d poll;
            try {
                poll = this.f96422a.poll();
                if (poll == null) {
                    poll = new hk.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return poll.q(byteBuffer);
        }

        public synchronized void b(hk.d dVar) {
            dVar.a();
            this.f96422a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.c.e(context).n().g(), com.bumptech.glide.c.e(context).h(), com.bumptech.glide.c.e(context).g());
    }

    public static int e(hk.c cVar, int i11, int i12) {
        int min = Math.min(cVar.a() / i12, cVar.d() / i11);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable(f96414f, 2) && max > 1) {
            Log.v(f96414f, "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Nullable
    public final e c(ByteBuffer byteBuffer, int i11, int i12, hk.d dVar, ik.e eVar) {
        StringBuilder sb2;
        long b11 = fl.i.b();
        try {
            hk.c d11 = dVar.d();
            if (d11.b() > 0 && d11.c() == 0) {
                Bitmap.Config config = eVar.c(i.f96469a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                hk.a a11 = this.f96420d.a(this.f96421e, d11, byteBuffer, e(d11, i11, i12));
                a11.b(config);
                a11.j();
                Bitmap i13 = a11.i();
                if (i13 == null) {
                    if (Log.isLoggable(f96414f, 2)) {
                        sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(fl.i.a(b11));
                        Log.v(f96414f, sb2.toString());
                    }
                    return null;
                }
                e eVar2 = new e(new c(this.f96417a, a11, rk.f.c(), i11, i12, i13));
                if (Log.isLoggable(f96414f, 2)) {
                    Log.v(f96414f, "Decoded GIF from stream in " + fl.i.a(b11));
                }
                return eVar2;
            }
            if (!Log.isLoggable(f96414f, 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(fl.i.a(b11));
            Log.v(f96414f, sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable(f96414f, 2)) {
                Log.v(f96414f, "Decoded GIF from stream in " + fl.i.a(b11));
            }
            throw th2;
        }
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull ik.e eVar) {
        hk.d a11 = this.f96419c.a(byteBuffer);
        try {
            return c(byteBuffer, i11, i12, a11, eVar);
        } finally {
            this.f96419c.b(a11);
        }
    }

    @Override // ik.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull ik.e eVar) throws IOException {
        return !((Boolean) eVar.c(i.f96470b)).booleanValue() && com.bumptech.glide.load.a.g(this.f96418b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public a(Context context, List<ImageHeaderParser> list, lk.e eVar, lk.b bVar) {
        this(context, list, eVar, bVar, f96416h, f96415g);
    }

    @VisibleForTesting
    public a(Context context, List<ImageHeaderParser> list, lk.e eVar, lk.b bVar, b bVar2, C1293a c1293a) {
        this.f96417a = context.getApplicationContext();
        this.f96418b = list;
        this.f96420d = c1293a;
        this.f96421e = new wk.b(eVar, bVar);
        this.f96419c = bVar2;
    }
}
