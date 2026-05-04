package com.baicizhan.main.home.plan.module.exam;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class Rsp<T extends JsModel> {
    public static final int $stable = 0;

    @k
    private final T data;

    public Rsp(@k T data) {
        g0.p(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rsp copy$default(Rsp rsp, JsModel jsModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jsModel = rsp.data;
        }
        return rsp.copy(jsModel);
    }

    @k
    public final T component1() {
        return this.data;
    }

    @k
    public final Rsp<T> copy(@k T data) {
        g0.p(data, "data");
        return new Rsp<>(data);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Rsp) && g0.g(this.data, ((Rsp) obj).data);
    }

    @k
    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @k
    public String toString() {
        return "Rsp(data=" + this.data + j.f81007d;
    }
}
