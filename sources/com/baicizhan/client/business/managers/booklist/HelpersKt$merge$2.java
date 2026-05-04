package com.baicizhan.client.business.managers.booklist;

import com.baicizhan.online.user_study_api.MergeState;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.managers.booklist.HelpersKt$merge$2", f = "Helpers.kt", i = {0, 0, 0}, l = {30}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "id", "$i$a$-with-HelpersKt$merge$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
/* loaded from: classes4.dex */
public final class HelpersKt$merge$2 extends SuspendLambda implements l<j00.c<? super MergeState>, Object> {
    final /* synthetic */ int $bookId;
    final /* synthetic */ List<Integer> $books;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpersKt$merge$2(int i11, List<Integer> list, j00.c<? super HelpersKt$merge$2> cVar) {
        super(1, cVar);
        this.$bookId = i11;
        this.$books = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new HelpersKt$merge$2(this.$bookId, this.$books, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super MergeState> cVar) {
        return ((HelpersKt$merge$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            UserStudyApiService.Client client = (UserStudyApiService.Client) ck.a.b("/rpc/user_study");
            String merge_already_learned_words_async = client.merge_already_learned_words_async(this.$bookId, this.$books);
            this.L$0 = k.a(client);
            this.L$1 = k.a(merge_already_learned_words_async);
            this.I$0 = 0;
            this.label = 1;
            obj = HelpersKt.queryMergeResult(client, merge_already_learned_words_async, this);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return (MergeState) obj;
    }
}
