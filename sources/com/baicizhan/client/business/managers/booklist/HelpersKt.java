package com.baicizhan.client.business.managers.booklist;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HelpersKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object merge(int r7, @m80.l java.util.List<java.lang.Integer> r8, @m80.k j00.c<? super kotlin.Result<? extends com.baicizhan.online.user_study_api.MergeState>> r9) {
        /*
            boolean r0 = r9 instanceof com.baicizhan.client.business.managers.booklist.HelpersKt$merge$1
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.client.business.managers.booklist.HelpersKt$merge$1 r0 = (com.baicizhan.client.business.managers.booklist.HelpersKt$merge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.client.business.managers.booklist.HelpersKt$merge$1 r0 = new com.baicizhan.client.business.managers.booklist.HelpersKt$merge$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r7 = r4.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.m6317unboximpl()
            return r7
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = c40.h1.c()
            com.baicizhan.client.business.managers.booklist.HelpersKt$merge$2 r3 = new com.baicizhan.client.business.managers.booklist.HelpersKt$merge$2
            r9 = 0
            r3.<init>(r7, r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.L$0 = r8
            r4.I$0 = r7
            r4.label = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r7 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L5e
            return r0
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.booklist.HelpersKt.merge(int, java.util.List, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object merge$default(int i11, List list, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            list = null;
        }
        return merge(i11, list, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object queryMergeResult(com.baicizhan.online.user_study_api.UserStudyApiService.Client r8, java.lang.String r9, j00.c<? super com.baicizhan.online.user_study_api.MergeState> r10) {
        /*
            boolean r0 = r10 instanceof com.baicizhan.client.business.managers.booklist.HelpersKt$queryMergeResult$1
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.client.business.managers.booklist.HelpersKt$queryMergeResult$1 r0 = (com.baicizhan.client.business.managers.booklist.HelpersKt$queryMergeResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.baicizhan.client.business.managers.booklist.HelpersKt$queryMergeResult$1 r0 = new com.baicizhan.client.business.managers.booklist.HelpersKt$queryMergeResult$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$2
            com.baicizhan.online.user_study_api.MergeState r9 = (com.baicizhan.online.user_study_api.MergeState) r9
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.baicizhan.online.user_study_api.UserStudyApiService$Client r2 = (com.baicizhan.online.user_study_api.UserStudyApiService.Client) r2
            kotlin.e.n(r10)
            r7 = r2
            r2 = r8
            r8 = r7
            goto L6c
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            kotlin.e.n(r10)
            com.baicizhan.online.user_study_api.MergeState r10 = r8.get_merge_state(r9)
            r2 = 0
        L4a:
            int r4 = r10.state
            r5 = 2
            if (r4 == r5) goto L71
            int r4 = r2 + 1
            r5 = 3
            if (r2 >= r5) goto L71
            r0.L$0 = r8
            r0.L$1 = r9
            java.lang.Object r10 = l00.k.a(r10)
            r0.L$2 = r10
            r0.I$0 = r4
            r0.label = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = c40.a1.b(r5, r0)
            if (r10 != r1) goto L6b
            return r1
        L6b:
            r2 = r4
        L6c:
            com.baicizhan.online.user_study_api.MergeState r10 = r8.get_merge_state(r9)
            goto L4a
        L71:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.managers.booklist.HelpersKt.queryMergeResult(com.baicizhan.online.user_study_api.UserStudyApiService$Client, java.lang.String, j00.c):java.lang.Object");
    }
}
