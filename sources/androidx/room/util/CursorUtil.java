package androidx.room.util;

import a00.a0;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import r00.b;
import u30.f0;
import w00.j;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "CursorUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@u0({"SMAP\nCursorUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n146#1:178\n13467#2,3:179\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n*L\n39#1:178\n128#1:179,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CursorUtil {
    @k
    public static final Cursor copyAndClose(@k Cursor c11) {
        g0.p(c11, "c");
        Cursor cursor = c11;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c11.getColumnCount();
                for (int i11 = 0; i11 < columnCount; i11++) {
                    int type = cursor2.getType(i11);
                    if (type == 0) {
                        objArr[i11] = null;
                    } else if (type == 1) {
                        objArr[i11] = Long.valueOf(cursor2.getLong(i11));
                    } else if (type == 2) {
                        objArr[i11] = Double.valueOf(cursor2.getDouble(i11));
                    } else if (type == 3) {
                        objArr[i11] = cursor2.getString(i11);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i11] = cursor2.getBlob(i11);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            b.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        g0.m(columnNames);
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(@k Cursor c11, @k String name) {
        g0.p(c11, "c");
        g0.p(name, "name");
        int columnIndex = c11.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c11.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c11, name);
    }

    public static final int getColumnIndexOrThrow(@k Cursor c11, @k String name) {
        String str;
        g0.p(c11, "c");
        g0.p(name, "name");
        int columnIndex = getColumnIndex(c11, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c11.getColumnNames();
            g0.o(columnNames, "getColumnNames(...)");
            str = a0.Eh(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e11) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e11);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static final <R> R useCursor(@k Cursor cursor, @k l<? super Cursor, ? extends R> block) {
        g0.p(cursor, "<this>");
        g0.p(block, "block");
        Cursor cursor2 = cursor;
        try {
            R invoke = block.invoke(cursor2);
            d0.d(1);
            b.a(cursor2, null);
            d0.c(1);
            return invoke;
        } finally {
        }
    }

    @k
    public static final Cursor wrapMappedColumns(@k final Cursor cursor, @k final String[] columnNames, @k final int[] mapping) {
        g0.p(cursor, "cursor");
        g0.p(columnNames, "columnNames");
        g0.p(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    g0.p(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = i12 + 1;
                        if (f0.c2(strArr[i11], columnName, true)) {
                            return iArr[i12];
                        }
                        i11++;
                        i12 = i13;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(@k String[] columnNames, @k String name) {
        g0.p(columnNames, "columnNames");
        g0.p(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str3 = columnNames[i11];
            int i13 = i12 + 1;
            if (str3.length() >= name.length() + 2 && (f0.b2(str3, str, false, 2, null) || (str3.charAt(0) == '`' && f0.b2(str3, str2, false, 2, null)))) {
                return i12;
            }
            i11++;
            i12 = i13;
        }
        return -1;
    }
}
