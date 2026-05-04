package io.ktor.server.plugins;

import c40.g0;
import io.ktor.util.internal.c;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ParameterConversionException extends BadRequestException implements g0<ParameterConversionException> {

    @k
    private final String parameterName;

    @k
    private final String type;

    public /* synthetic */ ParameterConversionException(String str, String str2, Throwable th2, int i11, v vVar) {
        this(str, str2, (i11 & 4) != 0 ? null : th2);
    }

    @k
    public final String getParameterName() {
        return this.parameterName;
    }

    @k
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParameterConversionException(@k String parameterName, @k String type, @l Throwable th2) {
        super("Request parameter " + parameterName + " couldn't be parsed/converted to " + type, th2);
        kotlin.jvm.internal.g0.p(parameterName, "parameterName");
        kotlin.jvm.internal.g0.p(type, "type");
        this.parameterName = parameterName;
        this.type = type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public ParameterConversionException createCopy() {
        ParameterConversionException parameterConversionException = new ParameterConversionException(this.parameterName, this.type, this);
        c.a(parameterConversionException, this);
        return parameterConversionException;
    }
}
