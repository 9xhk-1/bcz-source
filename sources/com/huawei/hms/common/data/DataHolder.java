package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String[] f35528a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f35529b;

        /* renamed from: c, reason: collision with root package name */
        private final String f35530c;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap<Object, Integer> f35531d;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i11) {
            return new DataHolder(this, i11, (Bundle) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.huawei.hms.common.data.DataHolder.Builder setDataForContentValuesHashMap(java.util.HashMap<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "contentValuesHashMap cannot be null"
                com.huawei.hms.common.internal.Preconditions.checkNotNull(r4, r0)
                java.lang.String r0 = r3.f35530c
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r4.get(r0)
                if (r0 == 0) goto L2e
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.f35531d
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L1f
                int r0 = r1.intValue()
                r1 = 1
                goto L30
            L1f:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.f35531d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r3.f35529b
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.put(r0, r2)
            L2e:
                r0 = 0
                r1 = r0
            L30:
                if (r1 == 0) goto L3d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.f35529b
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.f35529b
                r1.add(r0, r4)
                return r3
            L3d:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r3.f35529b
                r0.add(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.Builder.setDataForContentValuesHashMap(java.util.HashMap):com.huawei.hms.common.data.DataHolder$Builder");
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.f35528a = strArr;
            this.f35529b = new ArrayList<>();
            this.f35530c = str;
            this.f35531d = new HashMap<>();
        }

        public DataHolder build(int i11, Bundle bundle) {
            return new DataHolder(this, i11, bundle, -1);
        }

        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i11) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle == null || !bundle.containsKey(str)) {
            str2 = "cannot find column: " + str;
        } else if (isClosed()) {
            str2 = "buffer has been closed";
        } else if (i11 < 0 || i11 >= this.dataCount) {
            str2 = "row is out of index:" + i11;
        } else {
            str2 = "";
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public static DataHolder empty(int i11) {
        return new DataHolder(BUILDER, i11, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i11;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i11 = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i11 = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i11, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th2) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th2.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    private static ArrayList<CursorWindow> iterCursorWindow(Builder builder, int i11, List list) {
        CursorWindow cursorWindow;
        boolean z11;
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        CursorWindow cursorWindow2 = new CursorWindow((String) null);
        cursorWindow2.setNumColumns(builder.f35528a.length);
        arrayList.add(cursorWindow2);
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                if (!cursorWindow2.allocRow()) {
                    HMSLog.d(TAG, "Failed to allocate a row");
                    cursorWindow = new CursorWindow((String) null);
                    try {
                        cursorWindow.setStartPosition(i12);
                        cursorWindow.setNumColumns(builder.f35528a.length);
                        if (!cursorWindow.allocRow()) {
                            HMSLog.e(TAG, "Failed to retry to allocate a row");
                            break;
                        }
                        arrayList.add(cursorWindow);
                        cursorWindow2 = cursorWindow;
                    } catch (RuntimeException unused) {
                        Iterator<CursorWindow> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().close();
                        }
                        HMSLog.w(TAG, "iter CursorWindow failed, RuntimeException occured.");
                        cursorWindow2 = cursorWindow;
                    }
                }
                HashMap hashMap = (HashMap) list.get(i12);
                z11 = true;
                for (int i13 = 0; i13 < builder.f35528a.length && (z11 = putValue(cursorWindow2, hashMap.get(builder.f35528a[i13]), i12, i13)); i13++) {
                }
            } catch (RuntimeException unused2) {
                cursorWindow = cursorWindow2;
            }
            if (!z11) {
                HMSLog.d(TAG, "fail to put data for row " + i12);
                cursorWindow2.freeLastRow();
                CursorWindow cursorWindow3 = new CursorWindow((String) null);
                cursorWindow3.setStartPosition(i12);
                cursorWindow3.setNumColumns(builder.f35528a.length);
                arrayList.add(cursorWindow3);
                break;
            }
            continue;
        }
        return arrayList;
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i11, int i12) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i11 < i12 && hMSCursorWrapper.moveToPosition(i11)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i11);
                hMSCursorWrapper.fillWindow(i11, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i11 = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i11, int i12) throws IllegalArgumentException {
        if (obj == null) {
            return cursorWindow.putNull(i11, i12);
        }
        if (obj instanceof Boolean) {
            return cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i11, i12);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i11, i12);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i11, i12);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i11, i12);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i11, i12);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i11, i12);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i11, i12);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!this.mClosed) {
                for (CursorWindow cursorWindow : this.cursorWindows) {
                    cursorWindow.close();
                }
                this.mClosed = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        String[] strArr = this.columns;
        int i11 = 0;
        if (strArr == null || strArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.columns;
            if (i12 >= strArr2.length) {
                break;
            }
            this.columnsBundle.putInt(strArr2[i12], i12);
            i12++;
        }
        CursorWindow[] cursorWindowArr = this.cursorWindows;
        if (cursorWindowArr == null || cursorWindowArr.length == 0) {
            this.dataCount = 0;
            return;
        }
        this.perCursorCounts = new int[cursorWindowArr.length];
        int i13 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = this.cursorWindows;
            if (i11 >= cursorWindowArr2.length) {
                this.dataCount = i13;
                return;
            } else {
                this.perCursorCounts[i11] = i13;
                i13 = cursorWindowArr2[i11].getStartPosition() + this.cursorWindows[i11].getNumRows();
                i11++;
            }
        }
    }

    public final void copyToBuffer(String str, int i11, int i12, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i11);
        this.cursorWindows[i12].copyStringToBuffer(i11, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    public final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i11, int i12, String str2) {
        str2.getClass();
        switch (str2) {
            case "type_float":
                checkAvailable(str, i11);
                return Float.valueOf(this.cursorWindows[i12].getFloat(i11, this.columnsBundle.getInt(str)));
            case "type_boolean":
                checkAvailable(str, i11);
                return Boolean.valueOf(this.cursorWindows[i12].getLong(i11, this.columnsBundle.getInt(str)) == 1);
            case "type_int":
                checkAvailable(str, i11);
                return Integer.valueOf(this.cursorWindows[i12].getInt(i11, this.columnsBundle.getInt(str)));
            case "type_double":
                checkAvailable(str, i11);
                return Double.valueOf(this.cursorWindows[i12].getDouble(i11, this.columnsBundle.getInt(str)));
            case "type_long":
                checkAvailable(str, i11);
                return Long.valueOf(this.cursorWindows[i12].getLong(i11, this.columnsBundle.getInt(str)));
            case "type_string":
                checkAvailable(str, i11);
                return this.cursorWindows[i12].getString(i11, this.columnsBundle.getInt(str));
            case "type_byte_array":
                checkAvailable(str, i11);
                return this.cursorWindows[i12].getBlob(i11, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i11) {
        int[] iArr;
        int i12 = 0;
        Preconditions.checkArgument(i11 >= 0 || i11 < this.dataCount, "rowIndex is out of index:" + i11);
        while (true) {
            iArr = this.perCursorCounts;
            if (i12 >= iArr.length) {
                break;
            }
            if (i11 < iArr[i12]) {
                i12--;
                break;
            }
            i12++;
        }
        return i12 == iArr.length ? i12 - 1 : i12;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i11, int i12) {
        checkAvailable(str, i11);
        return this.cursorWindows[i12].getType(i11, this.columnsBundle.getInt(str)) == 0;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (parcel == null) {
            return;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i11, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i11 & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i11, String[] strArr, CursorWindow[] cursorWindowArr, int i12, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i11;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i12;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i11;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i11) {
        if (builder.f35528a.length != 0) {
            if (i11 < 0 || i11 >= builder.f35529b.size()) {
                i11 = builder.f35529b.size();
            }
            ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder, i11, builder.f35529b.subList(0, i11));
            return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
        }
        return new CursorWindow[0];
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i11, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i11, bundle);
    }

    public DataHolder(Cursor cursor, int i11, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i11, bundle);
    }

    private DataHolder(Builder builder, int i11, Bundle bundle) {
        this(builder.f35528a, getCursorWindows(builder, -1), i11, (Bundle) null);
    }

    private DataHolder(Builder builder, int i11, Bundle bundle, int i12) {
        this(builder.f35528a, getCursorWindows(builder, -1), i11, bundle);
    }
}
