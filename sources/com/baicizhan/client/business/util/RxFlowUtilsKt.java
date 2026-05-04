package com.baicizhan.client.business.util;

import kotlin.jvm.internal.g0;
import rx.Emitter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class RxFlowUtilsKt {
    @m80.k
    public static final <T> kotlinx.coroutines.flow.i<T> asFlow(@m80.k rx.c<T> cVar) {
        g0.p(cVar, "<this>");
        return kotlinx.coroutines.flow.k.t(new RxFlowUtilsKt$asFlow$1(cVar, null));
    }

    public static final <T> rx.c<T> asRxJava(@m80.k final kotlinx.coroutines.flow.i<? extends T> iVar) {
        g0.p(iVar, "<this>");
        return rx.c.k1(new wb0.b() { // from class: com.baicizhan.client.business.util.q
            @Override // wb0.b
            public final void call(Object obj) {
                RxFlowUtilsKt.asRxJava$lambda$0(kotlinx.coroutines.flow.i.this, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asRxJava$lambda$0(kotlinx.coroutines.flow.i iVar, Emitter emitter) {
        c40.j.b(null, new RxFlowUtilsKt$asRxJava$1$1(iVar, emitter, null), 1, null);
    }
}
