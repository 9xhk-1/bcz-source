package com.soundcloud.android.crop;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.jiongji.andriod.card.R;
import com.soundcloud.android.crop.ImageViewTouchBase;
import com.soundcloud.android.crop.a;
import com.soundcloud.android.crop.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import pn.j;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class CropImageActivity extends com.soundcloud.android.crop.g {

    /* renamed from: q, reason: collision with root package name */
    public static final String f41603q = "CropImage_TAG";

    /* renamed from: r, reason: collision with root package name */
    public static final int f41604r = 2048;

    /* renamed from: s, reason: collision with root package name */
    public static final int f41605s = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f41606b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public int f41607c;

    /* renamed from: d, reason: collision with root package name */
    public int f41608d;

    /* renamed from: e, reason: collision with root package name */
    public int f41609e;

    /* renamed from: f, reason: collision with root package name */
    public int f41610f;

    /* renamed from: g, reason: collision with root package name */
    public int f41611g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41612h;

    /* renamed from: i, reason: collision with root package name */
    public Uri f41613i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f41614j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41615k;

    /* renamed from: l, reason: collision with root package name */
    public int f41616l;

    /* renamed from: m, reason: collision with root package name */
    public com.soundcloud.android.crop.h f41617m;

    /* renamed from: n, reason: collision with root package name */
    public CropImageView f41618n;

    /* renamed from: o, reason: collision with root package name */
    public com.soundcloud.android.crop.e f41619o;

    /* renamed from: p, reason: collision with root package name */
    public qb0.h f41620p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ImageViewTouchBase.c {
        public a() {
        }

        @Override // com.soundcloud.android.crop.ImageViewTouchBase.c
        public void a(Bitmap b11) {
            b11.recycle();
            System.gc();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            CropImageActivity.this.setResult(0);
            CropImageActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            CropImageActivity.this.f1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f41625a;

            public a(final CountDownLatch val$latch) {
                this.f41625a = val$latch;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CropImageActivity.this.f41618n.getScale() == 1.0f) {
                    CropImageActivity.this.f41618n.b();
                }
                this.f41625a.countDown();
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            CropImageActivity.this.f41606b.post(new a(countDownLatch));
            try {
                countDownLatch.await();
                new h().b();
            } catch (InterruptedException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f41628a;

        public f(final Bitmap val$b) {
            this.f41628a = val$b;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageActivity.this.h1(this.f41628a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f41630a;

        public g(final Bitmap val$b) {
            this.f41630a = val$b;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageActivity.this.f41618n.e();
            this.f41630a.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.c();
                CropImageActivity.this.f41618n.invalidate();
                if (CropImageActivity.this.f41618n.f41634m.size() == 1) {
                    CropImageActivity cropImageActivity = CropImageActivity.this;
                    cropImageActivity.f41619o = cropImageActivity.f41618n.f41634m.get(0);
                    CropImageActivity.this.f41619o.q(true);
                }
            }
        }

        public void b() {
            CropImageActivity.this.f41606b.post(new a());
        }

        public final void c() {
            int i11;
            if (CropImageActivity.this.f41617m == null) {
                return;
            }
            com.soundcloud.android.crop.e eVar = new com.soundcloud.android.crop.e(CropImageActivity.this.f41618n);
            int e11 = CropImageActivity.this.f41617m.e();
            int b11 = CropImageActivity.this.f41617m.b();
            boolean z11 = false;
            Rect rect = new Rect(0, 0, e11, b11);
            int min = (Math.min(e11, b11) * 4) / 5;
            if (CropImageActivity.this.f41607c == 0 || CropImageActivity.this.f41608d == 0) {
                i11 = min;
            } else if (CropImageActivity.this.f41607c > CropImageActivity.this.f41608d) {
                i11 = (CropImageActivity.this.f41608d * min) / CropImageActivity.this.f41607c;
            } else {
                i11 = min;
                min = (CropImageActivity.this.f41607c * min) / CropImageActivity.this.f41608d;
            }
            RectF rectF = new RectF((e11 - min) / 2, (b11 - i11) / 2, r1 + min, r2 + i11);
            Matrix unrotatedMatrix = CropImageActivity.this.f41618n.getUnrotatedMatrix();
            if (CropImageActivity.this.f41607c != 0 && CropImageActivity.this.f41608d != 0) {
                z11 = true;
            }
            eVar.s(unrotatedMatrix, rect, rectF, z11);
            CropImageActivity.this.f41618n.v(eVar);
        }

        public h() {
        }
    }

    @Override // com.soundcloud.android.crop.g
    public /* bridge */ /* synthetic */ void I0(g.b listener) {
        super.I0(listener);
    }

    @Override // com.soundcloud.android.crop.g
    public /* bridge */ /* synthetic */ void J0(g.b listener) {
        super.J0(listener);
    }

    public final int X0(Uri bitmapUri) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i11 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = getContentResolver().openInputStream(bitmapUri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                com.soundcloud.android.crop.d.a(openInputStream);
                int a12 = a1();
                while (true) {
                    if (options.outHeight / i11 <= a12 && options.outWidth / i11 <= a12) {
                        return i11;
                    }
                    i11 <<= 1;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                com.soundcloud.android.crop.d.a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void Y0() {
        this.f41618n.e();
        com.soundcloud.android.crop.h hVar = this.f41617m;
        if (hVar != null) {
            hVar.g();
        }
        System.gc();
    }

    public final Bitmap Z0(Rect rect, int outWidth, int outHeight) {
        InputStream inputStream;
        Bitmap bitmap;
        int width;
        int height;
        Rect rect2;
        Bitmap bitmap2;
        int i11;
        int width2 = rect.width();
        int height2 = rect.height();
        try {
            try {
                InputStream openInputStream = getContentResolver().openInputStream(this.f41613i);
                try {
                    try {
                        BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(openInputStream, false);
                        width = newInstance.getWidth();
                        height = newInstance.getHeight();
                        if (this.f41611g != 0) {
                            RectF rectF = new RectF();
                            Matrix matrix = new Matrix();
                            matrix.setRotate(-this.f41611g);
                            matrix.mapRect(rectF, new RectF(rect));
                            rectF.offset(rectF.left < 0.0f ? width : 0.0f, rectF.top < 0.0f ? height : 0.0f);
                            rect2 = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        } else {
                            rect2 = rect;
                        }
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            i11 = Build.VERSION.SDK_INT;
                            Bitmap decodeRegion = newInstance.decodeRegion(rect2, options);
                            if (decodeRegion == null || (width2 <= outWidth && height2 <= outHeight)) {
                                bitmap2 = decodeRegion;
                            } else {
                                try {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.setRotate(this.f41611g);
                                    matrix2.postScale(outWidth / width2, outHeight / height2);
                                    bitmap2 = Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix2, true);
                                } catch (IOException e11) {
                                    e = e11;
                                    inputStream = openInputStream;
                                    bitmap = decodeRegion;
                                    qb.c.c(f41603q, "Error cropping image: " + e.getMessage(), e);
                                    i1(e);
                                    com.soundcloud.android.crop.d.a(inputStream);
                                    return bitmap;
                                } catch (IllegalArgumentException e12) {
                                    e = e12;
                                    bitmap2 = decodeRegion;
                                    throw new IllegalArgumentException("Rectangle " + rect2 + " is outside of the image (" + width + "," + height + "," + this.f41611g + j.f81007d, e);
                                } catch (OutOfMemoryError e13) {
                                    e = e13;
                                    inputStream = openInputStream;
                                    bitmap = decodeRegion;
                                    qb.c.c(f41603q, "OOM cropping image: " + e.getMessage(), e);
                                    i1(e);
                                    com.soundcloud.android.crop.d.a(inputStream);
                                    return bitmap;
                                }
                            }
                        } catch (IllegalArgumentException e14) {
                            e = e14;
                            bitmap2 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = openInputStream;
                        com.soundcloud.android.crop.d.a(inputStream);
                        throw th;
                    }
                } catch (IOException e15) {
                    e = e15;
                    inputStream = openInputStream;
                    bitmap = null;
                    qb.c.c(f41603q, "Error cropping image: " + e.getMessage(), e);
                    i1(e);
                    com.soundcloud.android.crop.d.a(inputStream);
                    return bitmap;
                } catch (OutOfMemoryError e16) {
                    e = e16;
                    inputStream = openInputStream;
                    bitmap = null;
                    qb.c.c(f41603q, "OOM cropping image: " + e.getMessage(), e);
                    i1(e);
                    com.soundcloud.android.crop.d.a(inputStream);
                    return bitmap;
                }
                try {
                    try {
                        qb.c.i(f41603q, "sdk %d w = %d, h = %d", Integer.valueOf(i11), Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()));
                        com.soundcloud.android.crop.d.a(openInputStream);
                        return bitmap2;
                    } catch (IllegalArgumentException e17) {
                        e = e17;
                        throw new IllegalArgumentException("Rectangle " + rect2 + " is outside of the image (" + width + "," + height + "," + this.f41611g + j.f81007d, e);
                    }
                } catch (IOException e18) {
                    e = e18;
                    bitmap = bitmap2;
                    inputStream = openInputStream;
                    qb.c.c(f41603q, "Error cropping image: " + e.getMessage(), e);
                    i1(e);
                    com.soundcloud.android.crop.d.a(inputStream);
                    return bitmap;
                } catch (OutOfMemoryError e19) {
                    e = e19;
                    bitmap = bitmap2;
                    inputStream = openInputStream;
                    qb.c.c(f41603q, "OOM cropping image: " + e.getMessage(), e);
                    i1(e);
                    com.soundcloud.android.crop.d.a(inputStream);
                    return bitmap;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e21) {
            e = e21;
            inputStream = null;
        } catch (OutOfMemoryError e22) {
            e = e22;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public final int a1() {
        int b12 = b1();
        if (b12 == 0) {
            return 2048;
        }
        return Math.min(b12, 4096);
    }

    public final int b1() {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(com.badlogic.gdx.graphics.f.V0, iArr, 0);
        return iArr[0];
    }

    public boolean c1() {
        return this.f41615k;
    }

    public final /* synthetic */ void d1(Rect rect, qb0.g gVar) {
        int i11;
        int width = rect.width();
        int height = rect.height();
        int i12 = this.f41609e;
        if (i12 > 0 && (i11 = this.f41610f) > 0 && (width > i12 || height > i11)) {
            float f11 = width / height;
            if (i12 / i11 > f11) {
                width = (int) ((i11 * f11) + 0.5f);
                height = i11;
            } else {
                height = (int) ((i12 / f11) + 0.5f);
                width = i12;
            }
        }
        try {
            gVar.onNext(Z0(rect, width, height));
        } catch (Exception e11) {
            gVar.onError(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.net.Uri] */
    public final void e1() {
        InputStream inputStream;
        Throwable th2;
        InputStream inputStream2;
        SecurityException e11;
        OutOfMemoryError e12;
        IllegalStateException e13;
        IOException e14;
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f41607c = extras.getInt(a.InterfaceC0497a.f41669a);
            this.f41608d = extras.getInt(a.InterfaceC0497a.f41670b);
            this.f41609e = extras.getInt(a.InterfaceC0497a.f41671c);
            this.f41610f = extras.getInt(a.InterfaceC0497a.f41672d);
            this.f41612h = extras.getBoolean(a.InterfaceC0497a.f41673e, false);
            this.f41614j = (Uri) extras.getParcelable("output");
        }
        Uri data = intent.getData();
        this.f41613i = data;
        if (data != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ContentResolver contentResolver = getContentResolver();
                    Uri uri = this.f41613i;
                    this.f41611g = com.soundcloud.android.crop.d.d(contentResolver.openInputStream(uri));
                    inputStream = uri;
                } catch (FileNotFoundException | SecurityException e15) {
                    qb.c.c(f41603q, "Error open image: ", e15);
                    inputStream = "Error open image: ";
                }
            } else {
                ContentResolver contentResolver2 = getContentResolver();
                ?? r12 = this.f41613i;
                this.f41611g = com.soundcloud.android.crop.d.c(com.soundcloud.android.crop.d.e(this, contentResolver2, r12));
                inputStream = r12;
            }
            try {
                try {
                    this.f41616l = X0(this.f41613i);
                    inputStream2 = getContentResolver().openInputStream(this.f41613i);
                } catch (Throwable th3) {
                    th2 = th3;
                    com.soundcloud.android.crop.d.a(inputStream);
                    throw th2;
                }
            } catch (IOException e16) {
                inputStream2 = null;
                e14 = e16;
            } catch (IllegalStateException e17) {
                inputStream2 = null;
                e13 = e17;
            } catch (OutOfMemoryError e18) {
                inputStream2 = null;
                e12 = e18;
            } catch (SecurityException e19) {
                inputStream2 = null;
                e11 = e19;
            } catch (Throwable th4) {
                inputStream = null;
                th2 = th4;
                com.soundcloud.android.crop.d.a(inputStream);
                throw th2;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = this.f41616l;
                this.f41617m = new com.soundcloud.android.crop.h(BitmapFactory.decodeStream(inputStream2, null, options), this.f41611g);
                inputStream = inputStream2;
            } catch (IOException e21) {
                e14 = e21;
                qb.c.c(f41603q, "Error reading image: ", e14);
                i1(e14);
                inputStream = inputStream2;
                com.soundcloud.android.crop.d.a(inputStream);
            } catch (IllegalStateException e22) {
                e13 = e22;
                qb.c.c(f41603q, "", e13);
                i1(e13);
                inputStream = inputStream2;
                com.soundcloud.android.crop.d.a(inputStream);
            } catch (OutOfMemoryError e23) {
                e12 = e23;
                qb.c.c(f41603q, "OOM reading image: ", e12);
                i1(e12);
                inputStream = inputStream2;
                com.soundcloud.android.crop.d.a(inputStream);
            } catch (SecurityException e24) {
                e11 = e24;
                qb.c.c(f41603q, "SecurityException reading image: ", e11);
                i1(e11);
                inputStream = inputStream2;
                com.soundcloud.android.crop.d.a(inputStream);
            }
            com.soundcloud.android.crop.d.a(inputStream);
        }
    }

    public final void f1() {
        com.soundcloud.android.crop.e eVar = this.f41619o;
        if (eVar == null || this.f41615k) {
            return;
        }
        this.f41615k = true;
        final Rect i11 = eVar.i(this.f41616l);
        qb0.h hVar = this.f41620p;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f41620p = rx.c.j1(new c.a() { // from class: com.soundcloud.android.crop.b
                @Override // wb0.b
                public final void call(Object obj) {
                    CropImageActivity.this.d1(i11, (qb0.g) obj);
                }
            }).w5(bc0.c.e()).I3(tb0.a.a()).r5(new e());
        }
    }

    public final void g1(Bitmap croppedImage) {
        if (croppedImage != null) {
            com.soundcloud.android.crop.d.h(this, null, getResources().getString(R.string.crop__saving), new f(croppedImage), this.f41606b);
        } else {
            finish();
        }
    }

    public final void h1(Bitmap croppedImage) {
        if (this.f41614j != null) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = getContentResolver().openOutputStream(this.f41614j);
                    if (outputStream != null) {
                        croppedImage.compress(this.f41612h ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 90, outputStream);
                    }
                } catch (IOException e11) {
                    i1(e11);
                    com.soundcloud.android.crop.f.b("Cannot open file: " + this.f41614j, e11);
                }
                com.soundcloud.android.crop.d.a(outputStream);
                j1(this.f41614j);
            } catch (Throwable th2) {
                com.soundcloud.android.crop.d.a(outputStream);
                throw th2;
            }
        }
        this.f41606b.post(new g(croppedImage));
        finish();
        overridePendingTransition(R.anim.business_no_fade, R.anim.business_push_right_out);
    }

    public final void i1(Throwable throwable) {
        setResult(404, new Intent().putExtra("error", throwable));
    }

    public final void j1(Uri uri) {
        setResult(-1, new Intent().putExtra("output", uri));
    }

    public final void k1() {
        setContentView(R.layout.crop__activity_crop);
        CropImageView cropImageView = (CropImageView) findViewById(R.id.crop_image);
        this.f41618n = cropImageView;
        cropImageView.f41636o = this;
        cropImageView.setRecycler(new a());
        findViewById(R.id.btn_cancel).setOnClickListener(new b());
        findViewById(R.id.btn_done).setOnClickListener(new c());
    }

    @TargetApi(19)
    public final void l1() {
        requestWindowFeature(1);
        getWindow().clearFlags(67108864);
    }

    public final void m1() {
        if (isFinishing()) {
            return;
        }
        this.f41618n.n(this.f41617m, true);
        com.soundcloud.android.crop.d.h(this, null, getResources().getString(R.string.crop__wait), new d(), this.f41606b);
    }

    @Override // com.soundcloud.android.crop.g, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle icicle) {
        l1();
        super.onCreate(icicle);
        k1();
        e1();
        if (this.f41617m == null) {
            finish();
        } else {
            m1();
        }
    }

    @Override // com.soundcloud.android.crop.g, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.soundcloud.android.crop.h hVar = this.f41617m;
        if (hVar != null) {
            hVar.g();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends qb0.g<Bitmap> {
        public e() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            CropImageActivity.this.i1(e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            if (bitmap != null) {
                CropImageActivity.this.f41618n.n(new com.soundcloud.android.crop.h(bitmap, CropImageActivity.this.f41611g), true);
                CropImageActivity.this.f41618n.b();
                CropImageActivity.this.f41618n.f41634m.clear();
            }
            CropImageActivity.this.g1(bitmap);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
