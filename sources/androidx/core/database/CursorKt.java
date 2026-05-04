package androidx.core.database;

import android.database.Cursor;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CursorKt {
    @l
    public static final byte[] getBlobOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getBlob(i11);
    }

    @l
    public static final Double getDoubleOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i11));
    }

    @l
    public static final Float getFloatOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i11));
    }

    @l
    public static final Integer getIntOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i11));
    }

    @l
    public static final Long getLongOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i11));
    }

    @l
    public static final Short getShortOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i11));
    }

    @l
    public static final String getStringOrNull(@k Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }
}
