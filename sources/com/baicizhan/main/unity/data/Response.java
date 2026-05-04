package com.baicizhan.main.unity.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class Response {
    public static final int $stable = 0;
    private final boolean raw;

    public Response(boolean z11) {
        this.raw = z11;
    }

    public static /* synthetic */ Response copy$default(Response response, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = response.raw;
        }
        return response.copy(z11);
    }

    public final boolean component1() {
        return this.raw;
    }

    @k
    public final Response copy(boolean z11) {
        return new Response(z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Response) && this.raw == ((Response) obj).raw;
    }

    public final boolean getRaw() {
        return this.raw;
    }

    public int hashCode() {
        return Boolean.hashCode(this.raw);
    }

    @k
    public String toString() {
        return "Response(raw=" + this.raw + j.f81007d;
    }
}
