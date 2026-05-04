package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,130:1\n29#2:131\n29#2:133\n16#3:132\n16#3:134\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n124#1:131\n126#1:133\n124#1:132\n126#1:134\n*E\n"})
/* loaded from: classes8.dex */
public final class y extends d0<Integer> implements m0<Integer> {
    public y(int i11) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        d(Integer.valueOf(i11));
    }

    @Override // kotlinx.coroutines.flow.m0
    @m80.k
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(P().intValue());
        }
        return valueOf;
    }

    public final boolean e0(int i11) {
        boolean d11;
        synchronized (this) {
            d11 = d(Integer.valueOf(P().intValue() + i11));
        }
        return d11;
    }
}
