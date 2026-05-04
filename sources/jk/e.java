package jk;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final String f64290f = "ThumbStreamOpener";

    /* renamed from: g, reason: collision with root package name */
    public static final a f64291g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final a f64292a;

    /* renamed from: b, reason: collision with root package name */
    public final d f64293b;

    /* renamed from: c, reason: collision with root package name */
    public final lk.b f64294c;

    /* renamed from: d, reason: collision with root package name */
    public final ContentResolver f64295d;

    /* renamed from: e, reason: collision with root package name */
    public final List<ImageHeaderParser> f64296e;

    public e(List<ImageHeaderParser> list, d dVar, lk.b bVar, ContentResolver contentResolver) {
        this(list, f64291g, dVar, bVar, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f64295d.openInputStream(uri);
                int b11 = com.bumptech.glide.load.a.b(this.f64296e, inputStream, this.f64294c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b11;
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException | NullPointerException e11) {
            if (Log.isLoggable(f64290f, 3)) {
                Log.d(f64290f, "Failed to open uri: " + uri, e11);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:26:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(@androidx.annotation.NonNull android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            jk.d r2 = r6.f64293b     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            android.database.Cursor r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            if (r2 == 0) goto L1f
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r3 == 0) goto L1f
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r2.close()
            return r7
        L1a:
            r7 = move-exception
            r1 = r2
            goto L4a
        L1d:
            r3 = move-exception
            goto L29
        L1f:
            if (r2 == 0) goto L24
            r2.close()
        L24:
            return r1
        L25:
            r7 = move-exception
            goto L4a
        L27:
            r3 = move-exception
            r2 = r1
        L29:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1a
            r4.append(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L1a
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L1a
        L44:
            if (r2 == 0) goto L49
            r2.close()
        L49:
            return r1
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.e.b(android.net.Uri):java.lang.String");
    }

    public final boolean c(File file) {
        return this.f64292a.a(file) && 0 < this.f64292a.c(file);
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b11 = b(uri);
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        File b12 = this.f64292a.b(b11);
        if (!c(b12)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b12);
        try {
            return this.f64295d.openInputStream(fromFile);
        } catch (NullPointerException e11) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e11));
        }
    }

    public e(List<ImageHeaderParser> list, a aVar, d dVar, lk.b bVar, ContentResolver contentResolver) {
        this.f64292a = aVar;
        this.f64293b = dVar;
        this.f64294c = bVar;
        this.f64295d = contentResolver;
        this.f64296e = list;
    }
}
