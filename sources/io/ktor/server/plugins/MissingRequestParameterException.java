package io.ktor.server.plugins;

import c40.g0;
import io.ktor.util.internal.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class MissingRequestParameterException extends BadRequestException implements g0<MissingRequestParameterException> {

    @k
    private final String parameterName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingRequestParameterException(@k String parameterName) {
        super("Request parameter " + parameterName + " is missing", null, 2, null);
        kotlin.jvm.internal.g0.p(parameterName, "parameterName");
        this.parameterName = parameterName;
    }

    @k
    public final String getParameterName() {
        return this.parameterName;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public MissingRequestParameterException createCopy() {
        MissingRequestParameterException missingRequestParameterException = new MissingRequestParameterException(this.parameterName);
        c.a(missingRequestParameterException, this);
        return missingRequestParameterException;
    }
}
