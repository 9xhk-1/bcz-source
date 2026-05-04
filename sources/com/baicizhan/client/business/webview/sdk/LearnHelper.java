package com.baicizhan.client.business.webview.sdk;

import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.webview.sdk.LearnHelper;
import java.util.List;
import q9.x;
import rx.c;
import wb0.p;
import wb0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LearnHelper {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LearnInfoRsp implements NoProguard {
        public int bookId;
        public int increasedCount;
        public int learnPlanCount;
        public List<RecordRsp> learningRecords;
        public int planCount;
        public int reviewPlanCount;
        public List<Integer> roadMap;

        private LearnInfoRsp() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecordRsp {
        public int extra1;

        /* renamed from: id, reason: collision with root package name */
        public int f16812id;
        public int reviewRound;
        public int score;
        public int spanDay;
        public boolean todayNew;
        public int wrongTimes;

        public static RecordRsp fromLocalRecords(TopicLearnRecord record) {
            RecordRsp recordRsp = new RecordRsp();
            recordRsp.f16812id = record.topicId;
            recordRsp.score = record.topicScore;
            recordRsp.spanDay = record.topicDay;
            recordRsp.todayNew = record.isTodayNew == 1;
            recordRsp.wrongTimes = record.errNum;
            recordRsp.reviewRound = record.reviewRound;
            int i11 = record.extra.f16072ls;
            recordRsp.extra1 = i11 != -1024 ? i11 : 0;
            return recordRsp;
        }
    }

    public static /* synthetic */ void a(qb0.g gVar) {
        LearnInfoRsp learnInfoRsp = new LearnInfoRsp();
        BookRecord k11 = x.r().k();
        if (k11 == null) {
            gVar.onError(new RuntimeException("null bookRecord"));
            gVar.onCompleted();
            return;
        }
        learnInfoRsp.bookId = k11.bookId;
        int i11 = x.r().m() != null ? x.r().m().wantMoreCount : 0;
        learnInfoRsp.increasedCount = i11;
        int i12 = k11.dailyCount;
        learnInfoRsp.learnPlanCount = i12;
        learnInfoRsp.planCount = i12 + i11;
        learnInfoRsp.reviewPlanCount = k11.reviewCount;
        gVar.onNext(learnInfoRsp);
        gVar.onCompleted();
    }

    public static /* synthetic */ String b(LearnInfoRsp learnInfoRsp, List list, List list2) {
        learnInfoRsp.learningRecords = list;
        learnInfoRsp.roadMap = list2;
        return new com.google.gson.d().z(learnInfoRsp);
    }

    private static rx.c<LearnInfoRsp> countAndBookObs() {
        return rx.c.j1(new c.a() { // from class: com.baicizhan.client.business.webview.sdk.d
            @Override // wb0.b
            public final void call(Object obj) {
                LearnHelper.a((qb0.g) obj);
            }
        });
    }

    public static rx.c<String> learnInfoObs() {
        return rx.c.q7(countAndBookObs(), recordObs(), roadMapObs(), new r() { // from class: com.baicizhan.client.business.webview.sdk.c
            @Override // wb0.r
            public final Object i(Object obj, Object obj2, Object obj3) {
                return LearnHelper.b((LearnHelper.LearnInfoRsp) obj, (List) obj2, (List) obj3);
            }
        }).w5(bc0.c.a()).I3(tb0.a.a());
    }

    private static rx.c<List<RecordRsp>> recordObs() {
        return rx.c.u2(LearnRecordManager.A().x()).c3(new p() { // from class: com.baicizhan.client.business.webview.sdk.b
            @Override // wb0.p
            public final Object call(Object obj) {
                return LearnHelper.RecordRsp.fromLocalRecords((TopicLearnRecord) obj);
            }
        }).v6();
    }

    private static rx.c<List<Integer>> roadMapObs() {
        return rx.c.M2(x.r().z());
    }
}
