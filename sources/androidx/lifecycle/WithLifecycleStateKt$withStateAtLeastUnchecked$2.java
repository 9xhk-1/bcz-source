package androidx.lifecycle;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,207:1\n*E\n"})
/* loaded from: classes2.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> extends Lambda implements x00.a<R> {
    final /* synthetic */ x00.a<R> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(x00.a<? extends R> aVar) {
        super(0);
        this.$block = aVar;
    }

    @Override // x00.a
    public final R invoke() {
        return this.$block.invoke();
    }
}
