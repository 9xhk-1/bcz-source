package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DataProcessingException extends TextParsingException {
    private static final long serialVersionUID = 1410975527141918215L;
    private int columnIndex;
    private String columnName;
    private String details;
    private boolean fatal;
    private boolean handled;
    private Object[] row;
    private Object value;
    private Map<String, Object> values;

    public DataProcessingException(String str) {
        this(str, -1, null, null);
    }

    private int getExtractedColumnIndex() {
        int i11;
        int[] iArr = this.extractedIndexes;
        return (iArr == null || (i11 = this.columnIndex) >= iArr.length || i11 <= -1) ? this.columnIndex : iArr[i11];
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException
    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public String getColumnName() {
        String str = this.columnName;
        if (str != null) {
            return str;
        }
        String[] headers = getHeaders();
        if (headers == null || getExtractedColumnIndex() == -1 || getExtractedColumnIndex() >= headers.length) {
            return null;
        }
        return headers[getExtractedColumnIndex()];
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException, org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getDetails() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.details == null ? "" : this.details + '\n');
        sb2.append(super.getDetails());
        String sb3 = sb2.toString();
        Object[] row = getRow();
        if (row != null) {
            row = (Object[]) row.clone();
            for (int i11 = 0; i11 < row.length; i11++) {
                row[i11] = restrictContent(row[i11]);
            }
        }
        return a.printIfNotEmpty(a.printIfNotEmpty(a.printIfNotEmpty(a.printIfNotEmpty(sb3, "row", row), "value", restrictContent(getValue())), "columnName", getColumnName()), "columnIndex", Integer.valueOf(getColumnIndex()));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException, org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getErrorDescription() {
        return "Error processing parsed input";
    }

    public final Object[] getRow() {
        return restrictContent(this.row);
    }

    public final Object getValue() {
        int i11;
        if (this.errorContentLength == 0) {
            return null;
        }
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        Object[] objArr = this.row;
        if (objArr == null || (i11 = this.columnIndex) == -1 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }

    public final boolean isFatal() {
        return this.fatal;
    }

    public boolean isHandled() {
        return this.handled;
    }

    public final void markAsHandled(b0 b0Var) {
        this.handled = (b0Var == null || (b0Var instanceof v) || (b0Var instanceof w)) ? false : true;
    }

    public final void markAsNonFatal() {
        this.fatal = false;
    }

    public final void setColumnIndex(int i11) {
        this.columnIndex = i11;
    }

    public final void setColumnName(String str) {
        this.columnName = str;
    }

    public void setDetails(String str) {
        if (str == null || str.trim().isEmpty()) {
            str = null;
        }
        this.details = str;
    }

    public final void setRow(Object[] objArr) {
        if (this.errorContentLength == 0) {
            objArr = null;
        }
        this.row = objArr;
    }

    public final void setValue(Object obj) {
        if (this.errorContentLength == 0) {
            obj = null;
        }
        if (obj == null) {
            obj = "null";
        }
        this.value = obj;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public final String updateMessage(String str) {
        int indexOf;
        if (this.errorContentLength == 0 || str == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int indexOf2 = str.indexOf(123, i11);
            if (indexOf2 != -1 && (indexOf = str.indexOf(125, indexOf2)) != -1) {
                String substring = str.substring(indexOf2 + 1, indexOf);
                Object obj = "value".equals(substring) ? this.value : this.values.containsKey(substring) ? this.values.get(substring) : null;
                if (obj != null) {
                    String restrictContent = restrictContent(obj);
                    sb2.append((CharSequence) str, i12, indexOf2);
                    sb2.append(restrictContent);
                    i12 = indexOf;
                }
                i11 = indexOf;
            }
        }
        sb2.append((CharSequence) str, i12 != 0 ? i12 + 1 : 0, str.length());
        return sb2.toString();
    }

    public DataProcessingException(String str, Throwable th2) {
        this(str, -1, null, th2);
    }

    public DataProcessingException(String str, Object[] objArr) {
        this(str, -1, objArr, null);
    }

    public DataProcessingException(String str, Object[] objArr, Throwable th2) {
        this(str, -1, objArr, th2);
    }

    public final void setValue(String str, Object obj) {
        if (this.errorContentLength == 0) {
            obj = null;
        }
        this.values.put(str, obj);
    }

    public DataProcessingException(String str, int i11) {
        this(str, i11, null, null);
    }

    public DataProcessingException(String str, int i11, Object[] objArr, Throwable th2) {
        super(null, str, th2);
        this.values = new HashMap();
        this.fatal = true;
        this.handled = false;
        this.details = null;
        setColumnIndex(i11);
        this.row = objArr;
    }
}
