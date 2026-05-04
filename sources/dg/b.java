package dg;

import android.content.Context;
import android.util.Pair;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.UserDakaBaseInfo;
import com.baicizhan.online.user_study_api.UserDakaDate;
import com.baicizhan.online.user_study_api.UserDakaRequest;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import q9.x;
import qb0.g;
import rx.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f47942a = "DakaObservables";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a<List<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f47943a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f47944b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f47945c;

        public a(final Context val$context, final int val$bookId, final int val$date) {
            this.f47943a = val$context;
            this.f47944b = val$bookId;
            this.f47945c = val$date;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super List<Integer>> subscriber) {
            try {
                subscriber.onNext(dg.a.h(this.f47943a, this.f47944b, this.f47945c));
            } catch (Throwable th2) {
                try {
                    subscriber.onError(th2);
                } finally {
                    subscriber.onCompleted();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dg.b$b, reason: collision with other inner class name */
    public class C0569b implements p<UserStudyApiService.Client, UserDakaShareInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f47946a;

        public C0569b(final Context val$context) {
            this.f47946a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserDakaShareInfo call(UserStudyApiService.Client client) {
            try {
                int l11 = x.r().l();
                int I = LearnRecordManager.A().I();
                List<Integer> p11 = b.c(this.f47946a).t6().p();
                if (p11 != null && !p11.isEmpty()) {
                    String id2 = TimeZone.getDefault().getID();
                    UserDakaRequest userDakaRequest = new UserDakaRequest();
                    userDakaRequest.book_id = l11;
                    userDakaRequest.count = I;
                    userDakaRequest.daka_dates = TimeUtil.convert2DakaDates(p11);
                    userDakaRequest.timezone = id2;
                    userDakaRequest.client_date = TimeUtil.convert2DakaDate(x.r().q());
                    userDakaRequest.poster_topic_ids = Collections.EMPTY_LIST;
                    UserDakaShareInfo user_daka_v2 = client.user_daka_v2(userDakaRequest);
                    dg.a.f(this.f47946a, l11, TimeUtil.convert2Seconds(user_daka_v2.daka_dates));
                    return user_daka_v2;
                }
                return null;
            } catch (Throwable th2) {
                qb.c.c(b.f47942a, "sync history daka dates failed.", th2);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<List<Integer>, rx.c<List<Integer>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f47947a;

        public c(final Context val$context) {
            this.f47947a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<List<Integer>> call(List<Integer> integers) {
            return (integers == null || integers.isEmpty()) ? b.e(this.f47947a) : rx.c.M2(integers);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Callable<List<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f47948a;

        public d(final Context val$context) {
            this.f47948a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> call() throws Exception {
            return dg.a.g(this.f47948a, x.r().l());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements p<UserStudyApiService.Client, rx.c<List<Integer>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f47949a;

        public e(final Context val$context) {
            this.f47949a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<List<Integer>> call(UserStudyApiService.Client client) {
            try {
                int l11 = x.r().l();
                Pair b11 = b.b();
                UserDakaBaseInfo userDakaBaseInfo = client.get_daka_base_info((UserDakaDate) b11.first, (UserDakaDate) b11.second);
                if (userDakaBaseInfo == null || xb.e.h(userDakaBaseInfo.daka_dates)) {
                    return rx.c.M2(Collections.EMPTY_LIST);
                }
                List<Integer> convert2Seconds = TimeUtil.convert2Seconds(userDakaBaseInfo.daka_dates);
                dg.a.f(this.f47949a, l11, convert2Seconds);
                return rx.c.M2(convert2Seconds);
            } catch (Throwable th2) {
                qb.c.d(b.f47942a, "getHistoryDakaDatesOnline failed. " + th2, new Object[0]);
                return rx.c.T1(th2);
            }
        }
    }

    public static Pair<UserDakaDate, UserDakaDate> b() {
        Calendar calendar = Calendar.getInstance();
        UserDakaDate userDakaDate = new UserDakaDate();
        userDakaDate.year = calendar.get(1);
        userDakaDate.month = calendar.get(2) + 1;
        userDakaDate.day = calendar.get(5);
        userDakaDate.timestamp = (int) (calendar.getTimeInMillis() * 0.001d);
        calendar.set(5, 1);
        UserDakaDate userDakaDate2 = new UserDakaDate();
        userDakaDate2.year = userDakaDate.year;
        userDakaDate2.month = userDakaDate.month;
        userDakaDate2.day = 1;
        userDakaDate2.timestamp = (int) (calendar.getTimeInMillis() * 0.001d);
        return new Pair<>(userDakaDate2, userDakaDate);
    }

    public static rx.c<List<Integer>> c(final Context context) {
        return d(context).b2(new c(context));
    }

    public static rx.c<List<Integer>> d(final Context context) {
        return rx.c.z2(new d(context)).w5(bc0.c.e());
    }

    public static rx.c<List<Integer>> e(final Context context) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").b2(new e(context)).w5(bc0.c.e());
    }

    public static rx.c<List<Integer>> f(final Context context, final int bookId, final int date) {
        return rx.c.j1(new a(context, bookId, date)).w5(bc0.c.e()).I3(tb0.a.a());
    }

    public static rx.c<UserDakaShareInfo> g(final Context context) {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/user_study")).c3(new C0569b(context)).w5(bc0.c.e());
    }
}
