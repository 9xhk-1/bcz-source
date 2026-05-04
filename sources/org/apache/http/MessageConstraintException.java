package org.apache.http;

import java.nio.charset.CharacterCodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class MessageConstraintException extends CharacterCodingException {
    private static final long serialVersionUID = 6077207720446368695L;
    private final String message;

    public MessageConstraintException(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
