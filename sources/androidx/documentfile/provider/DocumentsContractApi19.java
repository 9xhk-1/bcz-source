package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(19)
/* loaded from: classes2.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
    }

    public static boolean canRead(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri));
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((queryForInt & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(rawType) || (queryForInt & 8) == 0) {
            return (TextUtils.isEmpty(rawType) || (queryForInt & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                a.a(autoCloseable);
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean exists(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                return cursor.getCount() > 0;
            } catch (Exception e11) {
                Log.w(TAG, "Failed query: " + e11);
                closeQuietly(cursor);
                return false;
            }
        } finally {
            closeQuietly(cursor);
        }
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    @Nullable
    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    @Nullable
    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    @Nullable
    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        return ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) ? false : true;
    }

    public static boolean isVirtual(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (getFlags(context, uri) & 512) != 0;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    private static int queryForInt(Context context, Uri uri, String str, int i11) {
        return (int) queryForLong(context, uri, str, i11);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j11) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    closeQuietly(cursor);
                    return j11;
                }
                long j12 = cursor.getLong(0);
                closeQuietly(cursor);
                return j12;
            } catch (Exception e11) {
                Log.w(TAG, "Failed query: " + e11);
                closeQuietly(cursor);
                return j11;
            }
        } catch (Throwable th2) {
            closeQuietly(cursor);
            throw th2;
        }
    }

    @Nullable
    private static String queryForString(Context context, Uri uri, String str, @Nullable String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    closeQuietly(cursor);
                    return str2;
                }
                String string = cursor.getString(0);
                closeQuietly(cursor);
                return string;
            } catch (Exception e11) {
                Log.w(TAG, "Failed query: " + e11);
                closeQuietly(cursor);
                return str2;
            }
        } catch (Throwable th2) {
            closeQuietly(cursor);
            throw th2;
        }
    }
}
