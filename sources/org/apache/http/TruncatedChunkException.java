package org.apache.http;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TruncatedChunkException extends MalformedChunkCodingException {
    private static final long serialVersionUID = -23506263930279460L;

    public TruncatedChunkException(String str) {
        super(str);
    }

    public TruncatedChunkException(String str, Object... objArr) {
        super(HttpException.clean(String.format(str, objArr)));
    }
}
