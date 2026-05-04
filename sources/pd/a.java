package pd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.PathUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import rx.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final String f80333c = "ImageProcesser";

    /* renamed from: d, reason: collision with root package name */
    public static final String f80334d = "poster";

    /* renamed from: e, reason: collision with root package name */
    public static final String f80335e = "calendar";

    /* renamed from: f, reason: collision with root package name */
    public static final String f80336f = "beautiful_sentence";

    /* renamed from: g, reason: collision with root package name */
    public static final String f80337g = "photo";

    /* renamed from: h, reason: collision with root package name */
    public static final String f80338h = "win_day";

    /* renamed from: i, reason: collision with root package name */
    public static final String f80339i = "daily_sentence";

    /* renamed from: j, reason: collision with root package name */
    public static final int f80340j = 1080;

    /* renamed from: k, reason: collision with root package name */
    public static final int f80341k = 1440;

    /* renamed from: l, reason: collision with root package name */
    public static final String f80342l = "imagedaka";

    /* renamed from: m, reason: collision with root package name */
    public static final String f80343m = "daka_%s";

    /* renamed from: n, reason: collision with root package name */
    public static final int f80344n = -1;

    /* renamed from: a, reason: collision with root package name */
    public File f80345a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<String> f80346b = new MutableLiveData<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: pd.a$a, reason: collision with other inner class name */
    public class C0986a implements c.a<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f80347a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f80348b;

        public C0986a(final String val$url, final int val$failedRes) {
            this.f80347a = val$url;
            this.f80348b = val$failedRes;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Bitmap> subscriber) {
            subscriber.onStart();
            try {
                subscriber.onNext(hc.c.p(this.f80347a).get());
            } catch (Exception e11) {
                int i11 = this.f80348b;
                if (-1 != i11) {
                    try {
                        subscriber.onNext(hc.c.m(i11).get());
                    } catch (Exception unused) {
                        subscriber.onError(e11);
                        qb.c.d(a.f80333c, "down load failed %s %d", this.f80347a, Integer.valueOf(this.f80348b));
                    }
                } else {
                    subscriber.onError(e11);
                    qb.c.d(a.f80333c, "down load failed %s", this.f80347a);
                }
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<Bitmap, Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f80350a;

        public b(final String val$tag) {
            this.f80350a = val$tag;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call(Bitmap bitmap) {
            File baicizhanFile = PathUtil.getBaicizhanFile(a.f80342l);
            if (!baicizhanFile.exists()) {
                baicizhanFile.mkdirs();
            }
            a.this.f80345a = PathUtil.getBaicizhanFile(a.f80342l + File.separatorChar + String.format(a.f80343m, this.f80350a) + System.currentTimeMillis());
            if (a.this.f80345a.exists()) {
                a.this.f80345a.delete();
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(a.this.f80345a));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (Exception e11) {
                qb.c.c(a.f80333c, "", e11);
            }
            qb.c.i(a.f80333c, "sdk %d w = %d, h = %d, byte %d", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(bitmap.getByteCount()));
            return bitmap;
        }
    }

    @Override // pd.d
    public Boolean b() {
        return Boolean.TRUE;
    }

    @Override // pd.d
    public rx.c<String> c() {
        File file = this.f80345a;
        if (file != null && file.exists()) {
            try {
                return rx.c.M2(this.f80345a.getAbsolutePath());
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("image error");
        sb2.append(this.f80345a == null ? "null" : "exists false");
        return rx.c.T1(new RuntimeException(sb2.toString()));
    }

    @Override // pd.d
    public LiveData<String> e() {
        return this.f80346b;
    }

    public rx.c<Bitmap> i(final String url) {
        return j(url, -1);
    }

    public rx.c<Bitmap> j(final String url, final int failedRes) {
        return rx.c.j1(new C0986a(url, failedRes)).w5(bc0.c.e());
    }

    public Bitmap k(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(f80340j, 1073741824), View.MeasureSpec.makeMeasureSpec(1440, 1073741824));
        view.layout(0, 0, f80340j, 1440);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(f80340j, 1440, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            throw new RuntimeException("OOM");
        }
    }

    public p<Bitmap, Bitmap> l(final String tag) {
        return new b(tag);
    }
}
