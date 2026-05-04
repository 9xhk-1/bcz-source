package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DataValidationException extends DataProcessingException {
    private static final long serialVersionUID = 3110975527111918123L;

    public DataValidationException(String str) {
        super(str, -1, null, null);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException, org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException, org.junit.jupiter.params.shadow.com.univocity.parsers.common.a
    public String getErrorDescription() {
        return "Error validating parsed input";
    }

    public DataValidationException(String str, Throwable th2) {
        super(str, -1, null, th2);
    }

    public DataValidationException(String str, Object[] objArr) {
        super(str, -1, objArr, null);
    }

    public DataValidationException(String str, Object[] objArr, Throwable th2) {
        super(str, -1, objArr, th2);
    }

    public DataValidationException(String str, int i11) {
        super(str, i11, null, null);
    }
}
