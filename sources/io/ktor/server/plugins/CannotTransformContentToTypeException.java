package io.ktor.server.plugins;

import c40.g0;
import h10.r;
import io.ktor.util.internal.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CannotTransformContentToTypeException extends ContentTransformationException implements g0<CannotTransformContentToTypeException> {

    @k
    private final r type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CannotTransformContentToTypeException(@k r type) {
        super("Cannot transform this request's content to " + type);
        kotlin.jvm.internal.g0.p(type, "type");
        this.type = type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public CannotTransformContentToTypeException createCopy() {
        CannotTransformContentToTypeException cannotTransformContentToTypeException = new CannotTransformContentToTypeException(this.type);
        c.a(cannotTransformContentToTypeException, this);
        return cannotTransformContentToTypeException;
    }
}
