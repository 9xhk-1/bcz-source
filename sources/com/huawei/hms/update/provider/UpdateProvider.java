package com.huawei.hms.update.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import en.r;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = ".hms.update.provider";

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f36525a = {"_display_name", "_size"};

    /* renamed from: b, reason: collision with root package name */
    private static ContentUriHelper f36526b = new ContentUriHelper();

    private static int a(String str) {
        if (r.f50027a.equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static File getLocalFile(Context context, String str) {
        if (context == null) {
            return null;
        }
        f36526b.setContext(context.getApplicationContext());
        return f36526b.getLocalFile(str);
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        if (context == null) {
            return null;
        }
        f36526b.setContext(context.getApplicationContext());
        return f36526b.getUriForFile(file, str);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo == null) {
            throw new SecurityException("Provider must not is null");
        }
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        f36526b.setContext(getContext().getApplicationContext());
        return f36526b.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (getContext() == null) {
            return "application/octet-stream";
        }
        f36526b.setContext(getContext().getApplicationContext());
        String name = f36526b.a(uri).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(lastIndexOf + 1));
            if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        f36526b.setContext(getContext().getApplicationContext());
        return ParcelFileDescriptor.open(f36526b.a(uri), a(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i11;
        f36526b.setContext(getContext().getApplicationContext());
        File a11 = f36526b.a(uri);
        if (strArr == null) {
            strArr = f36525a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i12 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i12] = "_display_name";
                i11 = i12 + 1;
                objArr[i12] = a11.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i12] = "_size";
                i11 = i12 + 1;
                objArr[i12] = Long.valueOf(a11.length());
            }
            i12 = i11;
        }
        String[] a12 = a(strArr3, i12);
        Object[] a13 = a(objArr, i12);
        MatrixCursor matrixCursor = new MatrixCursor(a12, 1);
        matrixCursor.addRow(a13);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    private static String[] a(String[] strArr, int i11) {
        String[] strArr2 = new String[i11];
        System.arraycopy(strArr, 0, strArr2, 0, i11);
        return strArr2;
    }

    private static Object[] a(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        return objArr2;
    }
}
