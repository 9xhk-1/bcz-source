package com.baicizhan.app.biz.game.impl.home.words;

import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8}, l = {192, 198, 204, 208, R.styleable.Theme_drawable_share, 226, R.styleable.Theme_drawable_tab_home, R.styleable.Theme_drawable_tab_review, 189}, m = "invokeSuspend", n = {"$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it", "$completion", "bookId", "$i$a$-flatMapLatest-WordsHomeViewModelImpl$observeDataUpdates$2", "$this$transformLatest", "it"}, s = {"L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 WordsHomeViewModelImpl.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsHomeViewModelImpl\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,189:1\n337#2,3:190\n342#2:198\n345#2,5:204\n352#2:214\n355#2:220\n361#2:226\n364#2:232\n367#2:238\n373#2:244\n49#3:193\n51#3:197\n49#3:199\n51#3:203\n49#3:209\n51#3:213\n49#3:215\n51#3:219\n49#3:221\n51#3:225\n49#3:227\n51#3:231\n49#3:233\n51#3:237\n49#3:239\n51#3:243\n46#4:194\n51#4:196\n46#4:200\n51#4:202\n46#4:210\n51#4:212\n46#4:216\n51#4:218\n46#4:222\n51#4:224\n46#4:228\n51#4:230\n46#4:234\n51#4:236\n46#4:240\n51#4:242\n105#5:195\n105#5:201\n105#5:211\n105#5:217\n105#5:223\n105#5:229\n105#5:235\n105#5:241\n*S KotlinDebug\n*F\n+ 1 WordsHomeViewModelImpl.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsHomeViewModelImpl\n*L\n339#1:193\n339#1:197\n342#1:199\n342#1:203\n349#1:209\n349#1:213\n352#1:215\n352#1:219\n355#1:221\n355#1:225\n361#1:227\n361#1:231\n364#1:233\n364#1:237\n367#1:239\n367#1:243\n339#1:194\n339#1:196\n342#1:200\n342#1:202\n349#1:210\n349#1:212\n352#1:216\n352#1:218\n355#1:222\n355#1:224\n361#1:228\n361#1:230\n364#1:234\n364#1:236\n367#1:240\n367#1:242\n339#1:195\n342#1:201\n349#1:211\n352#1:217\n355#1:223\n361#1:229\n364#1:235\n367#1:241\n*E\n"})
/* loaded from: classes3.dex */
public final class WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1 extends SuspendLambda implements q<j<? super y4.a>, Long, j00.c<? super g2>, Object> {
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ WordsHomeViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1(j00.c cVar, WordsHomeViewModelImpl wordsHomeViewModelImpl) {
        super(3, cVar);
        this.this$0 = wordsHomeViewModelImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x03b3, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r11, r2, r25) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.q
    public final Object invoke(j<? super y4.a> jVar, Long l11, j00.c<? super g2> cVar) {
        WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1 wordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1 = new WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1(cVar, this.this$0);
        wordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1.L$0 = jVar;
        wordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1.L$1 = l11;
        return wordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
