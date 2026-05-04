package io.ktor.server.plugins;

import c40.g0;
import io.ktor.util.internal.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsupportedMediaTypeException extends ContentTransformationException implements g0<UnsupportedMediaTypeException> {

    @k
    private final ix.k contentType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedMediaTypeException(@k ix.k contentType) {
        super("Content type " + contentType + " is not supported");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.contentType = contentType;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public UnsupportedMediaTypeException createCopy() {
        UnsupportedMediaTypeException unsupportedMediaTypeException = new UnsupportedMediaTypeException(this.contentType);
        c.a(unsupportedMediaTypeException, this);
        return unsupportedMediaTypeException;
    }
}
