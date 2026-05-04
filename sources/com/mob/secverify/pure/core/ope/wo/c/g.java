package com.mob.secverify.pure.core.ope.wo.c;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f41067a;

    public static String a(Context context) {
        String str = f41067a;
        if (str != null && str.length() == 32) {
            return f41067a;
        }
        String c11 = c(context);
        if (TextUtils.isEmpty(c11) || c11.length() != 32) {
            c11 = b(context);
            if (!TextUtils.isEmpty(c11) && c11.length() == 32) {
                a(context, c11);
            }
        } else if (c11.equals(b(context))) {
            com.mob.secverify.pure.core.ope.wo.b.a.a(context, c11);
        }
        if (TextUtils.isEmpty(c11) || c11.length() != 32) {
            c11 = b.a(UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "") + System.currentTimeMillis());
        }
        f41067a = c11;
        return c11;
    }

    private static String b(Context context) {
        return com.mob.secverify.pure.core.ope.wo.b.a.a(context);
    }

    private static String c(Context context) {
        int i11;
        boolean z11;
        String str = null;
        try {
            i11 = Build.VERSION.SDK_INT;
            z11 = i11 >= 29 || b.c(context, "android.permission.READ_EXTERNAL_STORAGE");
            if (i11 >= 29 && b.a() && !b.c(context, "android.permission.READ_EXTERNAL_STORAGE")) {
                z11 = false;
            }
        } catch (Exception unused) {
        }
        if (!z11) {
            return null;
        }
        if (i11 >= 29 && !b.a()) {
            Cursor query = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_display_name", "date_added"}, "_display_name like?", new String[]{"xwud_%"}, "date_added");
            if (query != null && query.moveToFirst()) {
                try {
                    String string = query.getString(query.getColumnIndex("_display_name"));
                    return string.substring(string.indexOf("_") + 1, string.indexOf("."));
                } catch (Exception unused2) {
                }
            }
            return null;
        }
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/sharesdk/unicom/xwud.dat");
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            str = new String(bArr, "UTF-8");
        }
        if (!TextUtils.isEmpty(str) && str.length() == 32) {
            return str;
        }
        File[] listFiles = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).listFiles(new FilenameFilter() { // from class: com.mob.secverify.pure.core.ope.wo.c.g.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.startsWith("xwud_");
            }
        });
        if (listFiles != null && listFiles.length > 0) {
            Arrays.sort(listFiles, new Comparator<File>() { // from class: com.mob.secverify.pure.core.ope.wo.c.g.2
                @Override // java.util.Comparator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(File file2, File file3) {
                    long lastModified = file2.lastModified() - file3.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    return lastModified == 0 ? 0 : -1;
                }
            });
            String name = listFiles[0].getName();
            return name.substring(name.indexOf("_") + 1, name.indexOf("."));
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x011e A[Catch: IOException | Exception -> 0x0153, TryCatch #2 {IOException | Exception -> 0x0153, blocks: (B:59:0x002a, B:61:0x0030, B:75:0x0080, B:85:0x0095, B:90:0x0092, B:15:0x0096, B:18:0x00bb, B:24:0x00d4, B:47:0x00d9, B:40:0x00f1, B:38:0x00f9, B:43:0x00f6, B:34:0x00eb, B:50:0x00fa, B:52:0x011e, B:53:0x0121, B:55:0x013d, B:71:0x007a, B:65:0x005c, B:67:0x0062, B:79:0x0085, B:87:0x008d), top: B:58:0x002a, inners: #1, #3, #5, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d A[Catch: IOException | Exception -> 0x0153, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException | Exception -> 0x0153, blocks: (B:59:0x002a, B:61:0x0030, B:75:0x0080, B:85:0x0095, B:90:0x0092, B:15:0x0096, B:18:0x00bb, B:24:0x00d4, B:47:0x00d9, B:40:0x00f1, B:38:0x00f9, B:43:0x00f6, B:34:0x00eb, B:50:0x00fa, B:52:0x011e, B:53:0x0121, B:55:0x013d, B:71:0x007a, B:65:0x005c, B:67:0x0062, B:79:0x0085, B:87:0x008d), top: B:58:0x002a, inners: #1, #3, #5, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.c.g.a(android.content.Context, java.lang.String):void");
    }
}
