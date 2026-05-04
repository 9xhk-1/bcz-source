package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TextWritingException extends a {
    private static final long serialVersionUID = 7198462597717255519L;
    private final String recordCharacters;
    private final long recordCount;
    private final Object[] recordData;

    private TextWritingException(String str, long j11, Object[] objArr, String str2, Throwable th2) {
        super(str, th2);
        this.recordCount = j11;
        this.recordData = objArr;
        this.recordCharacters = str2;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getDetails() {
        return a.printIfNotEmpty(a.printIfNotEmpty(a.printIfNotEmpty("", "recordCount", Long.valueOf(this.recordCount)), "recordData", restrictContent(this.recordData)), "recordCharacters", restrictContent((CharSequence) this.recordCharacters));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getErrorDescription() {
        return "Error writing data";
    }

    public String getRecordCharacters() {
        if (this.errorContentLength == 0) {
            return null;
        }
        return this.recordCharacters;
    }

    public long getRecordCount() {
        return this.recordCount;
    }

    public Object[] getRecordData() {
        return restrictContent(this.recordData);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public /* bridge */ /* synthetic */ void setErrorContentLength(int i11) {
        super.setErrorContentLength(i11);
    }

    public TextWritingException(String str, long j11, String str2, Throwable th2) {
        this(str, j11, null, str2, th2);
    }

    public TextWritingException(String str, long j11, Object[] objArr, Throwable th2) {
        this(str, j11, objArr, null, th2);
    }

    public TextWritingException(String str) {
        this(str, 0L, null, null, null);
    }

    public TextWritingException(Throwable th2) {
        this(th2 != null ? th2.getMessage() : null, 0L, null, null, th2);
    }

    public TextWritingException(String str, long j11, Object[] objArr) {
        this(str, j11, objArr, (Throwable) null);
    }

    public TextWritingException(String str, long j11, String str2) {
        this(str, j11, null, str2, null);
    }
}
