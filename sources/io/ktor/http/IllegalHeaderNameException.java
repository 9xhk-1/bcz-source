package io.ktor.http;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class IllegalHeaderNameException extends IllegalArgumentException {

    @k
    private final String headerName;
    private final int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalHeaderNameException(@k String headerName, int i11) {
        super("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i11) + "' (code " + (headerName.charAt(i11) & 255) + ')');
        g0.p(headerName, "headerName");
        this.headerName = headerName;
        this.position = i11;
    }

    @k
    public final String getHeaderName() {
        return this.headerName;
    }

    public final int getPosition() {
        return this.position;
    }
}
