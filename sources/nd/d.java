package nd;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.UserDakaRequest;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.baicizhan.online.user_study_api.UserDakaTopic;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.junit.jupiter.api.j2;
import q9.x;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f75056a = "DakaUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final int f75057b = 30;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<UserStudyApiService.Client, UserDakaShareInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f75058a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f75059b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f75060c;

        public a(final Context val$context, final int val$bookId, final int val$count) {
            this.f75058a = val$context;
            this.f75059b = val$bookId;
            this.f75060c = val$count;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserDakaShareInfo call(UserStudyApiService.Client client) {
            try {
                ScheduleRecord o11 = x.r().o();
                int q11 = x.r().q();
                List<Integer> h11 = dg.a.h(this.f75058a, this.f75059b, q11);
                String id2 = TimeZone.getDefault().getID();
                UserDakaRequest userDakaRequest = new UserDakaRequest();
                userDakaRequest.book_id = this.f75059b;
                userDakaRequest.count = this.f75060c;
                userDakaRequest.daka_dates = TimeUtil.convert2DakaDates(h11);
                userDakaRequest.timezone = id2;
                userDakaRequest.client_date = TimeUtil.convert2DakaDate(q11);
                userDakaRequest.poster_topic_ids = d.d();
                UserDakaShareInfo user_daka_v2 = client.user_daka_v2(userDakaRequest);
                if (o11 != null) {
                    o11.dakaDays = user_daka_v2.total_daka_days;
                    i9.a.t(this.f75058a, o11, "dakaDays");
                    qb.c.b(d.f75056a, "do_daka " + o11.dakaDays + j2.O + this.f75060c + j2.O + user_daka_v2, new Object[0]);
                }
                dg.a.f(this.f75058a, this.f75059b, TimeUtil.convert2Seconds(user_daka_v2.daka_dates));
                return user_daka_v2;
            } catch (Throwable th2) {
                qb.c.c(d.f75056a, "daka_v2 failed.", th2);
                throw vb0.a.c(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Comparator<TopicLearnRecord> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TopicLearnRecord lhs, TopicLearnRecord rhs) {
            return rhs.errNum - lhs.errNum;
        }
    }

    public static rx.c<UserDakaShareInfo> b(final Context context, final int bookId, final int count) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").w5(bc0.c.e()).c3(new a(context, bookId, count));
    }

    public static void c(final Context context) {
        ScheduleRecord o11 = x.r().o();
        int q11 = x.r().q();
        dg.a.h(context, o11.bookId, q11);
        qb.c.i(f75056a, "%d, %d", Integer.valueOf(o11.bookId), Integer.valueOf(q11));
    }

    public static List<UserDakaTopic> d() {
        Map<Integer, TopicLearnRecord> L = LearnRecordManager.A().L();
        if (L == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (TopicLearnRecord topicLearnRecord : L.values()) {
            if (topicLearnRecord.topicDay == 0) {
                arrayList.add(topicLearnRecord);
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Collections.sort(arrayList, new b());
        int min = Math.min(30, arrayList.size());
        ArrayList arrayList2 = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            TopicLearnRecord topicLearnRecord2 = (TopicLearnRecord) arrayList.get(i11);
            UserDakaTopic userDakaTopic = new UserDakaTopic();
            userDakaTopic.topic_id = topicLearnRecord2.topicId;
            userDakaTopic.wrong_times = topicLearnRecord2.errNum;
            userDakaTopic.done_times = topicLearnRecord2.doNum;
            arrayList2.add(userDakaTopic);
        }
        return arrayList2;
    }
}
