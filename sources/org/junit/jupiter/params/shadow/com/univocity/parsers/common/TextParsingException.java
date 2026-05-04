package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TextParsingException extends a {
    private static final long serialVersionUID = 1410975527141918214L;
    private long charIndex;
    private int columnIndex;
    private String content;
    protected int[] extractedIndexes;
    private String[] headers;
    private long lineIndex;
    private long recordNumber;

    public TextParsingException(i iVar, String str, Throwable th2) {
        super(str, th2);
        setContext(iVar);
    }

    private void setParsingContext(y yVar) {
        this.lineIndex = yVar == null ? -1L : yVar.o();
        this.charIndex = yVar == null ? 0L : yVar.n();
        this.content = yVar == null ? null : yVar.r();
    }

    public long getCharIndex() {
        return this.charIndex;
    }

    public int getColumnIndex() {
        return this.columnIndex;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getDetails() {
        String printIfNotEmpty = a.printIfNotEmpty(a.printIfNotEmpty(a.printIfNotEmpty("", "line", Long.valueOf(this.lineIndex)), "column", Integer.valueOf(this.columnIndex)), "record", Long.valueOf(this.recordNumber));
        long j11 = this.charIndex;
        if (j11 != 0) {
            printIfNotEmpty = a.printIfNotEmpty(printIfNotEmpty, "charIndex", Long.valueOf(j11));
        }
        return a.printIfNotEmpty(a.printIfNotEmpty(printIfNotEmpty, "headers", this.headers), "content parsed", restrictContent((CharSequence) this.content));
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getErrorDescription() {
        return "Error parsing input";
    }

    public final String[] getHeaders() {
        return this.headers;
    }

    public long getLineIndex() {
        return this.lineIndex;
    }

    public final String getParsedContent() {
        if (this.errorContentLength == 0) {
            return null;
        }
        return this.content;
    }

    public long getRecordNumber() {
        return this.recordNumber;
    }

    public void setContext(i iVar) {
        if (iVar instanceof y) {
            setParsingContext((y) iVar);
        } else {
            setParsingContext(null);
        }
        this.columnIndex = iVar == null ? -1 : iVar.m();
        this.recordNumber = iVar == null ? -1L : iVar.p();
        if (this.headers == null) {
            this.headers = iVar == null ? null : iVar.a();
        }
        this.extractedIndexes = iVar != null ? iVar.g() : null;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public /* bridge */ /* synthetic */ void setErrorContentLength(int i11) {
        super.setErrorContentLength(i11);
    }

    public TextParsingException(y yVar, String str) {
        this(yVar, str, null);
    }

    public TextParsingException(y yVar, Throwable th2) {
        this(yVar, th2 != null ? th2.getMessage() : null, th2);
    }

    public TextParsingException(y yVar) {
        this(yVar, null, null);
    }
}
