package com.huawei.hms.update.provider;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.io.IOException;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class ContentUriHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36522c = File.separator + "hms";

    /* renamed from: a, reason: collision with root package name */
    private Context f36523a;

    /* renamed from: b, reason: collision with root package name */
    private String f36524b;

    private static File a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    private static String b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    public File getLocalFile(String str) {
        String a11;
        if (str == null || str.contains(m.f102856e) || (a11 = a()) == null) {
            return null;
        }
        return a(new File(a11, str));
    }

    public Uri getUriForFile(File file, String str) {
        String b11;
        String a11;
        if (file == null || file.getPath().contains(m.f102856e) || (b11 = b(file)) == null || (a11 = a(b11)) == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str).encodedPath(a11).build();
    }

    public void setContext(Context context) {
        if (this.f36523a == null) {
            Checker.checkNonNull(context, "context must not be null.");
            this.f36523a = context;
        }
    }

    private String a() {
        String str;
        Context context = (Context) Checker.assertNonNull(this.f36523a, "mContext is null, call setContext first.");
        synchronized (this) {
            try {
                if (this.f36524b == null) {
                    if (context.getExternalCacheDir() != null) {
                        this.f36524b = b(context.getExternalCacheDir());
                    } else {
                        this.f36524b = b(context.getFilesDir());
                    }
                    this.f36524b += f36522c;
                }
                str = this.f36524b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    private String b(String str) {
        int indexOf;
        String b11;
        String a11 = a();
        if (a11 != null && (indexOf = str.indexOf(47, 1)) >= 0 && "ContentUriHelper".equals(Uri.decode(str.substring(1, indexOf))) && (b11 = b(new File(a11, Uri.decode(str.substring(indexOf + 1))))) != null && b11.startsWith(a11)) {
            return b11;
        }
        return null;
    }

    private String a(String str) {
        int length;
        String a11 = a();
        if (a11 == null || !str.startsWith(a11)) {
            return null;
        }
        if (a11.endsWith("/")) {
            length = a11.length();
        } else {
            length = a11.length() + 1;
        }
        return Uri.encode("ContentUriHelper") + '/' + str.substring(length);
    }

    public File a(Uri uri) {
        String encodedPath;
        String b11;
        if (uri == null || (encodedPath = uri.getEncodedPath()) == null || (b11 = b(encodedPath)) == null) {
            return null;
        }
        return a(new File(b11));
    }
}
