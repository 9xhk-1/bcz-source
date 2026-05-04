package com.baicizhan.app.biz.game.impl.home.words;

import k3.o4;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$special$$inlined$flatMapLatest$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, s = {"L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 WordsHomeViewModelImpl.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsHomeViewModelImpl\n*L\n1#1,189:1\n130#2:190\n*E\n"})
/* loaded from: classes3.dex */
public final class WordsHomeViewModelImpl$special$$inlined$flatMapLatest$1 extends SuspendLambda implements q<j<? super o4>, Boolean, j00.c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ WordsHomeViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordsHomeViewModelImpl$special$$inlined$flatMapLatest$1(j00.c cVar, WordsHomeViewModelImpl wordsHomeViewModelImpl) {
        super(3, cVar);
        this.this$0 = wordsHomeViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            j jVar = (j) this.L$0;
            Object obj2 = this.L$1;
            i b11 = ((Boolean) obj2).booleanValue() ? this.this$0.f13945b.b() : k.W1(this.this$0.f13945b.b(), 1);
            this.L$0 = l00.k.a(jVar);
            this.L$1 = l00.k.a(obj2);
            this.label = 1;
            if (k.o0(jVar, b11, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }

    @Override // x00.q
    public final Object invoke(j<? super o4> jVar, Boolean bool, j00.c<? super g2> cVar) {
        WordsHomeViewModelImpl$special$$inlined$flatMapLatest$1 wordsHomeViewModelImpl$special$$inlined$flatMapLatest$1 = new WordsHomeViewModelImpl$special$$inlined$flatMapLatest$1(cVar, this.this$0);
        wordsHomeViewModelImpl$special$$inlined$flatMapLatest$1.L$0 = jVar;
        wordsHomeViewModelImpl$special$$inlined$flatMapLatest$1.L$1 = bool;
        return wordsHomeViewModelImpl$special$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
