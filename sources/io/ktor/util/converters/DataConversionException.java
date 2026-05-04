package io.ktor.util.converters;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class DataConversionException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public DataConversionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataConversionException(@k String message) {
        super(message);
        g0.p(message, "message");
    }

    public /* synthetic */ DataConversionException(String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? "Invalid data format" : str);
    }
}
