package tz;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 29)
/* loaded from: classes8.dex */
public class c extends b {
    public c(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r9.isClosed() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        if (r9.isClosed() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        r9.close();
     */
    @Override // tz.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "title"
            android.content.Context r1 = r8.f91236a
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            r1 = 0
            java.lang.String r4 = "_display_name"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r5 = "_display_name=?"
            java.lang.String r9 = r8.d(r9)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r7 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r9 == 0) goto L47
            int r2 = r9.getCount()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L63
            if (r2 <= 0) goto L47
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L63
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L63
            if (r0 < 0) goto L47
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L63
            r2 = 0
            java.lang.String r0 = tz.h0.b(r0, r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L63
            boolean r1 = r9.isClosed()
            if (r1 != 0) goto L43
            r9.close()
        L43:
            return r0
        L44:
            r0 = move-exception
            r1 = r9
            goto L57
        L47:
            if (r9 == 0) goto L6c
            boolean r0 = r9.isClosed()
            if (r0 != 0) goto L6c
        L4f:
            r9.close()
            goto L6c
        L53:
            r0 = move-exception
            goto L57
        L55:
            r9 = r1
            goto L63
        L57:
            if (r1 == 0) goto L62
            boolean r9 = r1.isClosed()
            if (r9 != 0) goto L62
            r1.close()
        L62:
            throw r0
        L63:
            if (r9 == 0) goto L6c
            boolean r0 = r9.isClosed()
            if (r0 != 0) goto L6c
            goto L4f
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tz.c.b(java.lang.String):java.lang.String");
    }

    @Override // tz.b
    public boolean c(String str, String str2) {
        if (a(str) != null) {
            return true;
        }
        ContentResolver contentResolver = this.f91236a.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", "Notifications/Installation");
        contentValues.put("_display_name", d(str));
        contentValues.put("title", h0.c(str2, 0));
        try {
            contentResolver.insert(uri, contentValues);
        } catch (Exception unused) {
        }
        return false;
    }

    public final String d(String str) {
        return str + ".mp3";
    }
}
