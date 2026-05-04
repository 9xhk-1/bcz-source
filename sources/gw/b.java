package gw;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f57828a = true;

    public static long a(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return 0L;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        return c(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        return c(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0130, code lost:
    
        if (r1 != null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r12, android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.b.b(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static String c(Context context, Uri uri) {
        String uri2 = uri.toString();
        return new File(context.getExternalFilesDir(null), uri2.substring(uri2.lastIndexOf("/"))).getAbsolutePath();
    }

    public static boolean d(Context context, Uri uri) {
        String str;
        String str2;
        String b11 = b(context, uri);
        if (TextUtils.isEmpty(b11)) {
            throw new IllegalArgumentException("get image path is null");
        }
        File file = new File(b11);
        File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
        if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return false;
        }
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absolutePath, options);
            str2 = options.outMimeType;
        } catch (Exception unused) {
            str = "*/*";
        }
        if (!str2.contains("jpg") && !str2.contains("gif") && !str2.contains("png")) {
            if (!str2.contains("jpeg")) {
                str = null;
                return !TextUtils.isEmpty(str) && str.startsWith("image/");
            }
        }
        str = "image/*";
        if (TextUtils.isEmpty(str)) {
            return false;
        }
    }

    public static boolean e(Context context, Uri uri) {
        String str;
        String b11 = b(context, uri);
        if (TextUtils.isEmpty(b11)) {
            throw new IllegalArgumentException("get video path is null");
        }
        File file = new File(b11);
        File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
        if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return false;
        }
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            String substring = name.substring(lastIndexOf);
            if (!TextUtils.isEmpty(substring) || substring.length() >= 2) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring.substring(1).toLowerCase());
                return TextUtils.isEmpty(str) && str.startsWith("video/");
            }
        }
        str = "*/*";
        if (TextUtils.isEmpty(str)) {
        }
    }
}
