package b9;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final String f6462b = "GalleryHelper";

    /* renamed from: c, reason: collision with root package name */
    public static final String f6463c = "bcz";

    /* renamed from: a, reason: collision with root package name */
    public qb0.h f6464a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c.a<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f6467a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ShareParams f6468b;

        public b(final Activity val$activity, final ShareParams val$params) {
            this.f6467a = val$activity;
            this.f6468b = val$params;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Void> subscriber) {
            try {
                subscriber.onStart();
                if (TextUtils.isEmpty(d.this.d(this.f6467a, this.f6468b.f16060d))) {
                    subscriber.onError(new ShareDelegate.ReadableException("无权限"));
                }
                subscriber.onNext(null);
            } catch (Exception e11) {
                subscriber.onError(e11);
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6470a = new d();
    }

    public static d c() {
        return c.f6470a;
    }

    public String d(Context context, String path) {
        return g(context, hc.c.p(path).h().get()) ? "success" : "";
    }

    public boolean e(Context context, Bitmap bitmap) {
        return g(context, bitmap);
    }

    public boolean f(Context context, byte[] bytes, String name, String ext) {
        return Build.VERSION.SDK_INT <= 28 ? k(context, bytes, name, ext) : i(context, bytes, name, ext);
    }

    public final boolean g(Context context, Bitmap bitmap) {
        return Build.VERSION.SDK_INT <= 28 ? j(context, bitmap) : h(context, bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.content.Context r13, android.graphics.Bitmap r14) {
        /*
            r12 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "bcz"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bcz_"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r5 = ".jpg"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "_display_name"
            r3.put(r5, r4)
            java.lang.String r4 = "mime_type"
            java.lang.String r5 = "image/jpeg"
            r3.put(r4, r5)
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "is_pending"
            r6 = 1
            r7 = 29
            if (r4 < r7) goto L5d
            java.lang.String r8 = "relative_path"
            r3.put(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r2)
        L5d:
            android.content.ContentResolver r13 = r13.getContentResolver()
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r2 = r13.insert(r2, r3)
            r8 = 0
            java.io.OutputStream r9 = r13.openOutputStream(r2)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            r11 = 100
            boolean r14 = r14.compress(r10, r11, r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            if (r14 == 0) goto L83
            if (r4 < r7) goto L7e
            r3.put(r5, r1)
            r13.update(r2, r3, r8, r8)
        L7e:
            r9.close()     // Catch: java.lang.Exception -> L81
        L81:
            r0 = r6
            goto Lad
        L83:
            java.io.IOException r14 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            java.lang.String r4 = "Failed to save bitmap."
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
            throw r14     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8d
        L8b:
            r14 = move-exception
            goto Lae
        L8d:
            r14 = move-exception
            goto L94
        L8f:
            r14 = move-exception
            r9 = r8
            goto Lae
        L92:
            r14 = move-exception
            r9 = r8
        L94:
            if (r2 == 0) goto L99
            r13.delete(r2, r8, r8)     // Catch: java.lang.Throwable -> L8b
        L99:
            java.lang.String r4 = "GalleryHelper"
            java.lang.String r6 = ""
            qb.c.c(r4, r6, r14)     // Catch: java.lang.Throwable -> L8b
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r7) goto Laa
            r3.put(r5, r1)
            r13.update(r2, r3, r8, r8)
        Laa:
            r9.close()     // Catch: java.lang.Exception -> Lad
        Lad:
            return r0
        Lae:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto Lb8
            r3.put(r5, r1)
            r13.update(r2, r3, r8, r8)
        Lb8:
            r9.close()     // Catch: java.lang.Exception -> Lbb
        Lbb:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.d.h(android.content.Context, android.graphics.Bitmap):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r11, byte[] r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "GalleryHelper"
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = android.os.Environment.DIRECTORY_PICTURES
            r4.append(r5)
            java.lang.String r5 = java.io.File.separator
            r4.append(r5)
            java.lang.String r5 = "bcz"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r14)
            java.lang.String r13 = r6.toString()
            java.lang.String r14 = "_display_name"
            r5.put(r14, r13)
            java.lang.String r13 = "mime_type"
            java.lang.String r14 = "image/jpeg"
            r5.put(r13, r14)
            int r13 = android.os.Build.VERSION.SDK_INT
            java.lang.String r14 = "is_pending"
            r6 = 1
            r7 = 29
            if (r13 < r7) goto L56
            java.lang.String r8 = "relative_path"
            r5.put(r8, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5.put(r14, r4)
        L56:
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r4 = r11.insert(r4, r5)
            r8 = 0
            java.io.OutputStream r9 = r11.openOutputStream(r4)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L84
            r9.write(r12)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r9.flush()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r13 < r7) goto L73
            r5.put(r14, r3)
            r11.update(r4, r5, r8, r8)
        L73:
            r9.close()     // Catch: java.lang.Exception -> L77
            goto L7b
        L77:
            r11 = move-exception
            qb.c.c(r1, r0, r11)
        L7b:
            r2 = r6
            goto La2
        L7d:
            r12 = move-exception
            goto La3
        L7f:
            r12 = move-exception
            goto L86
        L81:
            r12 = move-exception
            r9 = r8
            goto La3
        L84:
            r12 = move-exception
            r9 = r8
        L86:
            if (r4 == 0) goto L8b
            r11.delete(r4, r8, r8)     // Catch: java.lang.Throwable -> L7d
        L8b:
            qb.c.c(r1, r0, r12)     // Catch: java.lang.Throwable -> L7d
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r7) goto L98
            r5.put(r14, r3)
            r11.update(r4, r5, r8, r8)
        L98:
            if (r9 == 0) goto La2
            r9.close()     // Catch: java.lang.Exception -> L9e
            goto La2
        L9e:
            r11 = move-exception
            qb.c.c(r1, r0, r11)
        La2:
            return r2
        La3:
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r7) goto Lad
            r5.put(r14, r3)
            r11.update(r4, r5, r8, r8)
        Lad:
            if (r9 == 0) goto Lb7
            r9.close()     // Catch: java.lang.Exception -> Lb3
            goto Lb7
        Lb3:
            r11 = move-exception
            qb.c.c(r1, r0, r11)
        Lb7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.d.i(android.content.Context, byte[], java.lang.String, java.lang.String):boolean");
    }

    public final boolean j(Context context, Bitmap bitmap) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "bcz");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, "bcz_" + System.currentTimeMillis() + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            MediaScannerConnection.scanFile(context, new String[]{file2.getAbsolutePath()}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: b9.b
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri) {
                    qb.c.i(d.f6462b, "path %s , url %s", str, r2 == null ? "null" : uri.toString());
                }
            });
            return compress;
        } catch (IOException e11) {
            qb.c.h(f6462b, "", e11);
            return false;
        }
    }

    public final boolean k(Context context, byte[] bytes, String name, String ext) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "bcz");
        if (!file.exists() && !file.mkdir()) {
            return false;
        }
        File file2 = new File(file, name + ext);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            MediaScannerConnection.scanFile(context, new String[]{file2.getAbsolutePath()}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: b9.c
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri) {
                    qb.c.i(d.f6462b, "path %s , url %s", str, r2 == null ? "null" : uri.toString());
                }
            });
            return true;
        } catch (IOException e11) {
            qb.c.h(f6462b, "", e11);
            return false;
        }
    }

    public void l(final Activity activity, final ShareParams params, final ShareDelegate.b listener) {
        qb0.h hVar = this.f6464a;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f6464a.unsubscribe();
        }
        this.f6464a = rx.c.j1(new b(activity, params)).w5(bc0.c.e()).I3(tb0.a.a()).r5(new a(listener));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareDelegate.b f6465a;

        public a(final ShareDelegate.b val$listener) {
            this.f6465a = val$listener;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            this.f6465a.onShareError(ShareChannel.SAVE_PHOTO, e11);
        }

        @Override // qb0.g
        public void onStart() {
            this.f6465a.onShareSend(ShareChannel.SAVE_PHOTO);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
            this.f6465a.onShareSuccess(ShareChannel.SAVE_PHOTO);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
