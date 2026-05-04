package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImeEditCommandScope {
    boolean beginBatchEdit();

    void edit(@m80.k x00.l<? super TextFieldBuffer, g2> lVar);

    boolean endBatchEdit();

    /* renamed from: mapFromTransformed-GEjPoXI */
    long mo1217mapFromTransformedGEjPoXI(long j11);

    /* renamed from: mapToTransformed-GEjPoXI */
    long mo1218mapToTransformedGEjPoXI(long j11);
}
