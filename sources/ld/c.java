package ld;

import android.util.Pair;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_study_api.CalendarDailyInfo;
import com.baicizhan.online.user_study_api.UserDakaBaseInfo;
import com.baicizhan.online.user_study_api.UserDakaDate;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f71092c = "CalendarDataSoure";

    /* renamed from: d, reason: collision with root package name */
    public static final int f71093d = 100;

    /* renamed from: e, reason: collision with root package name */
    public static final int f71094e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f71095f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f71096g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f71097h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f71098i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f71099j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f71100k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f71101l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static final int f71102m = 4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f71103n = 5;

    /* renamed from: o, reason: collision with root package name */
    public static final int f71104o = 6;

    /* renamed from: p, reason: collision with root package name */
    public static final int f71105p = 7;

    /* renamed from: q, reason: collision with root package name */
    public static final int f71106q = 8;

    /* renamed from: a, reason: collision with root package name */
    public long f71107a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Set<Integer> f71108b = new HashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<UserStudyApiService.Client, rx.c<List<Integer>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Calendar f71109a;

        public a(final Calendar val$calendar) {
            this.f71109a = val$calendar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<List<Integer>> call(UserStudyApiService.Client client) {
            try {
                Pair h11 = c.h(this.f71109a);
                UserDakaBaseInfo userDakaBaseInfo = client.get_daka_base_info((UserDakaDate) h11.first, (UserDakaDate) h11.second);
                if (userDakaBaseInfo == null || xb.e.h(userDakaBaseInfo.daka_dates)) {
                    return rx.c.M2(Collections.EMPTY_LIST);
                }
                List<Integer> convert2Seconds = TimeUtil.convert2Seconds(userDakaBaseInfo.daka_dates);
                Iterator<Integer> it = convert2Seconds.iterator();
                while (it.hasNext()) {
                    c.this.f71108b.add(Integer.valueOf(it.next().intValue() / 86400));
                }
                return rx.c.M2(convert2Seconds);
            } catch (Throwable th2) {
                return rx.c.T1(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<List<Integer>, ld.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Calendar f71111a;

        public b(final Calendar val$calendar) {
            this.f71111a = val$calendar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
        
            r1 = r1 + 1;
         */
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ld.b call(java.util.List<java.lang.Integer> r9) {
            /*
                r8 = this;
                java.util.Collections.sort(r9)
                boolean r0 = r9.isEmpty()
                r1 = 1
                r2 = 1000(0x3e8, double:4.94E-321)
                if (r0 == 0) goto L1b
                ld.c r0 = ld.c.this
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = com.baicizhan.client.business.util.TimeUtil.getStartOfDay(r4)
                long r4 = r4 / r2
                ld.c.c(r0, r4)
                goto L39
            L1b:
                ld.c r0 = ld.c.this
                int r4 = r9.size()
                int r4 = r4 - r1
                java.lang.Object r4 = r9.get(r4)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                long r4 = (long) r4
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 / r2
                long r4 = java.lang.Math.max(r4, r6)
                ld.c.c(r0, r4)
            L39:
                ld.b r0 = new ld.b
                r0.<init>()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r0.f71089a = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r0.f71090b = r4
                java.util.Calendar r4 = r8.f71111a
                r0.f71091c = r4
                java.util.Iterator r9 = r9.iterator()
            L54:
                boolean r4 = r9.hasNext()
                if (r4 == 0) goto L73
                java.lang.Object r4 = r9.next()
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.util.Calendar r5 = java.util.Calendar.getInstance()
                int r4 = r4.intValue()
                long r6 = (long) r4
                long r6 = r6 * r2
                r5.setTimeInMillis(r6)
                java.util.List<java.util.Calendar> r4 = r0.f71089a
                r4.add(r5)
                goto L54
            L73:
                java.util.Calendar r9 = r8.f71111a
                r4 = 5
                int r9 = r9.getActualMaximum(r4)
                if (r1 > r9) goto Lbd
                java.util.Calendar r9 = java.util.Calendar.getInstance()
                java.util.Calendar r5 = r8.f71111a
                long r5 = r5.getTimeInMillis()
                r9.setTimeInMillis(r5)
                r9.set(r4, r1)
                java.util.List<java.util.Calendar> r4 = r0.f71089a
                java.util.Iterator r4 = r4.iterator()
            L92:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto La5
                java.lang.Object r5 = r4.next()
                java.util.Calendar r5 = (java.util.Calendar) r5
                boolean r5 = bg.a.e(r5, r9)
                if (r5 == 0) goto L92
                goto Lba
            La5:
                long r4 = r9.getTimeInMillis()
                long r4 = r4 / r2
                ld.c r6 = ld.c.this
                long r6 = ld.c.b(r6)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto Lb5
                goto Lbd
            Lb5:
                java.util.List<java.util.Calendar> r4 = r0.f71090b
                r4.add(r9)
            Lba:
                int r1 = r1 + 1
                goto L73
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ld.c.b.call(java.util.List):ld.b");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ld.c$c, reason: collision with other inner class name */
    public class C0854c implements p<UserStudyApiService.Client, rx.c<CalendarDailyInfo>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Calendar f71113a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f71114b;

        public C0854c(final Calendar val$calendar, final int val$offset) {
            this.f71113a = val$calendar;
            this.f71114b = val$offset;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<CalendarDailyInfo> call(UserStudyApiService.Client client) {
            try {
                return rx.c.M2(client.get_calendar_daily_info(Integer.valueOf(new SimpleDateFormat("yyyyMMdd").format(this.f71113a.getTime())).intValue(), this.f71114b, 100));
            } catch (Throwable th2) {
                return rx.c.T1(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static c f71116a = new c();
    }

    public static Pair<UserDakaDate, UserDakaDate> h(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        calendar2.set(5, 1);
        UserDakaDate userDakaDate = new UserDakaDate();
        userDakaDate.year = calendar2.get(1);
        userDakaDate.month = calendar2.get(2) + 1;
        userDakaDate.day = calendar2.getActualMaximum(5);
        userDakaDate.timestamp = (int) (calendar2.getTimeInMillis() * 0.001d);
        calendar2.set(5, 1);
        UserDakaDate userDakaDate2 = new UserDakaDate();
        userDakaDate2.year = userDakaDate.year;
        userDakaDate2.month = userDakaDate.month;
        userDakaDate2.day = 1;
        userDakaDate2.timestamp = (int) (calendar2.getTimeInMillis() * 0.001d);
        return new Pair<>(userDakaDate2, userDakaDate);
    }

    public static c j() {
        return d.f71116a;
    }

    public boolean e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(this.f71107a * 1000);
        return calendar2.get(1) == calendar.get(1) ? calendar.get(6) <= calendar2.get(6) : calendar.get(1) < calendar2.get(1);
    }

    public void f() {
        this.f71108b.clear();
    }

    public rx.c<List<Integer>> g(final Calendar calendar) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").b2(new a(calendar)).w5(bc0.c.e());
    }

    public boolean i(Calendar calendar) {
        return this.f71108b.contains(Integer.valueOf((int) (TimeUtil.getStartOfDay(calendar.getTimeInMillis()) / 86400000)));
    }

    public rx.c<ld.b> k(final Calendar calendar) {
        return g(calendar).c3(new b(calendar));
    }

    public rx.c<CalendarDailyInfo> l(final Calendar calendar, final int offset) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").b2(new C0854c(calendar, offset)).w5(bc0.c.e());
    }
}
