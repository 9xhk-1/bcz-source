package gf;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.online.unified_user_service.Position;
import com.baicizhan.online.unified_user_service.SchoolInfoRequest;
import com.baicizhan.online.unified_user_service.SchoolMajorItem;
import com.baicizhan.online.unified_user_service.SchoolMajorRequest;
import com.baicizhan.online.unified_user_service.SchoolMajorResult;
import com.baicizhan.online.unified_user_service.SearchSchoolItem;
import com.baicizhan.online.unified_user_service.SearchSchoolRequest;
import com.baicizhan.online.unified_user_service.SearchSchoolResult;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53698a = "UserRepo";

    /* renamed from: b, reason: collision with root package name */
    public static final int f53699b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final int f53700c = 2000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.p<UnifiedUserService.Client, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f53701a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53702b;

        public a(final int val$sex, final Context val$context) {
            this.f53701a = val$sex;
            this.f53702b = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UnifiedUserService.Client client) {
            try {
                UserRecord p11 = x.r().p();
                client.update_gender(this.f53701a);
                p11.setSex(this.f53701a);
                i9.m.f(this.f53702b, p11);
                return Boolean.TRUE;
            } catch (Throwable th2) {
                throw vb0.a.c(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<UnifiedUserService.Client, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f53704a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53705b;

        public b(final String val$name, final Context val$context) {
            this.f53704a = val$name;
            this.f53705b = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(UnifiedUserService.Client client) {
            try {
                UserRecord p11 = x.r().p();
                client.update_nickname(this.f53704a);
                p11.setNickName(this.f53704a);
                i9.m.f(this.f53705b, p11);
                return Boolean.TRUE;
            } catch (Throwable th2) {
                throw vb0.a.c(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.p<UnifiedUserService.Client, Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f53707a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f53708b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53709c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f53710d;

        public c(final int val$y, final int val$m, final int val$d, final Context val$context) {
            this.f53707a = val$y;
            this.f53708b = val$m;
            this.f53709c = val$d;
            this.f53710d = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call(UnifiedUserService.Client client) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(this.f53707a, this.f53708b, this.f53709c, 1, 23);
            long timeInMillis = calendar.getTimeInMillis();
            try {
                UserRecord p11 = x.r().p();
                client.update_birthday(timeInMillis);
                p11.setBirthday(timeInMillis);
                i9.m.f(this.f53710d, p11);
                return Long.valueOf(timeInMillis);
            } catch (Throwable th2) {
                throw vb0.a.c(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f53712a;

        /* renamed from: b, reason: collision with root package name */
        public String f53713b;

        /* renamed from: c, reason: collision with root package name */
        public int f53714c;

        /* renamed from: d, reason: collision with root package name */
        public String f53715d;

        /* renamed from: e, reason: collision with root package name */
        public long f53716e;

        /* renamed from: f, reason: collision with root package name */
        public long f53717f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f53718g;

        /* renamed from: h, reason: collision with root package name */
        public int f53719h;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<T> {

        /* renamed from: a, reason: collision with root package name */
        public List<T> f53720a;

        /* renamed from: b, reason: collision with root package name */
        public int f53721b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f53722c;
    }

    public static /* synthetic */ e b(int i11, String str, UnifiedUserService.Client client) {
        SchoolMajorRequest schoolMajorRequest = new SchoolMajorRequest();
        schoolMajorRequest.page_size = 20;
        schoolMajorRequest.page_num = i11;
        schoolMajorRequest.major_key = str;
        try {
            SchoolMajorResult search_major = client.search_major(schoolMajorRequest);
            e eVar = new e();
            eVar.f53722c = search_major.has_next;
            eVar.f53721b = search_major.page_num;
            ArrayList arrayList = new ArrayList();
            List<SchoolMajorItem> list = search_major.majors;
            if (list != null) {
                Iterator<SchoolMajorItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(gf.c.a(it.next()));
                }
            }
            eVar.f53720a = arrayList;
            return eVar;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public static /* synthetic */ String d(gf.b bVar, Context context, UnifiedUserService.Client client) {
        try {
            UserRecord p11 = x.r().p();
            if (p11 == null) {
                throw new RuntimeException("null user");
            }
            client.update_position(bVar.f53659c);
            p11.setLocation(bVar.f53657a);
            i9.m.f(context, p11);
            return bVar.f53657a;
        } catch (Throwable th2) {
            throw vb0.a.c(th2);
        }
    }

    public static /* synthetic */ e e(String str, UnifiedUserService.Client client) {
        SearchSchoolRequest searchSchoolRequest = new SearchSchoolRequest();
        searchSchoolRequest.page_size = 20;
        searchSchoolRequest.page_num = 0;
        searchSchoolRequest.school_key = str;
        try {
            SearchSchoolResult search_school = client.search_school(searchSchoolRequest);
            e eVar = new e();
            eVar.f53722c = search_school.has_next;
            eVar.f53721b = search_school.page_num;
            ArrayList arrayList = new ArrayList();
            List<SearchSchoolItem> list = search_school.schools;
            if (list != null) {
                Iterator<SearchSchoolItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(gf.d.a(it.next()));
                }
            }
            eVar.f53720a = arrayList;
            return eVar;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public static /* synthetic */ Boolean f(String str, UnifiedUserService.Client client) {
        try {
            client.report_school(str, 1);
            return Boolean.TRUE;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public static /* synthetic */ List g(String str, int i11, String str2, String str3, String str4, UnifiedUserService.Client client) {
        SearchSchoolRequest searchSchoolRequest = new SearchSchoolRequest();
        searchSchoolRequest.setPage_size(2000);
        searchSchoolRequest.setProvince(str);
        searchSchoolRequest.setLevel(i11);
        searchSchoolRequest.setCity(str2);
        searchSchoolRequest.setCounty(str3);
        searchSchoolRequest.setSchool_key(str4);
        try {
            SearchSchoolResult search_school = client.search_school(searchSchoolRequest);
            if (!CollectionUtils.isEmpty(search_school.schools)) {
                ArrayList arrayList = new ArrayList();
                Iterator<SearchSchoolItem> it = search_school.schools.iterator();
                while (it.hasNext()) {
                    arrayList.add(gf.d.a(it.next()));
                }
                return arrayList;
            }
            if (!CollectionUtils.isEmpty(search_school.countys)) {
                return new ArrayList(search_school.countys);
            }
            if (!CollectionUtils.isEmpty(search_school.citys)) {
                return new ArrayList(search_school.citys);
            }
            if (!CollectionUtils.isEmpty(search_school.provinces)) {
                return new ArrayList(search_school.provinces);
            }
            qb.c.d(f53698a, "never reach here %s", search_school);
            return null;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public static /* synthetic */ d h(UserRecord userRecord) {
        d dVar = new d();
        dVar.f53716e = userRecord.getBirthday();
        dVar.f53713b = userRecord.getLocation();
        dVar.f53712a = userRecord.getEducation().schoolName;
        dVar.f53715d = userRecord.getEducation().schoolMajor;
        dVar.f53717f = userRecord.getEducation().schoolYear;
        dVar.f53714c = userRecord.getEducation().schoolBg;
        dVar.f53718g = userRecord.getEducation().isUniversity;
        dVar.f53719h = userRecord.getRole() != null ? userRecord.getRole().grade : -1;
        return dVar;
    }

    public static /* synthetic */ List j(UnifiedUserService.Client client) {
        try {
            List<Position> list = client.get_position_list();
            ArrayList arrayList = new ArrayList();
            Iterator<Position> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(gf.b.a(it.next()));
            }
            return arrayList;
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public String A() {
        UserRecord p11 = x.r().p();
        return p11 != null ? p11.getIpDescription() : "";
    }

    public int B() {
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            return p11.getSex();
        }
        return 3;
    }

    public final /* synthetic */ Integer C(int i11, Context context, UnifiedUserService.Client client) {
        try {
            UserRecord p11 = x.r().p();
            UserRecord.Education education = p11.getEducation();
            SchoolInfoRequest l11 = l(education);
            l11.setSchool_bg(i11);
            client.update_school(l11);
            education.schoolBg = i11;
            i9.m.f(context, p11);
            return Integer.valueOf(i11);
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public final /* synthetic */ Long D(int i11, Context context, UnifiedUserService.Client client) {
        try {
            UserRecord p11 = x.r().p();
            UserRecord.Education education = p11.getEducation();
            SchoolInfoRequest l11 = l(education);
            long j11 = i11;
            l11.setSchool_year(j11);
            client.update_school(l11);
            education.schoolYear = j11;
            i9.m.f(context, p11);
            return Long.valueOf(j11);
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public final /* synthetic */ Integer E(gf.c cVar, Context context, UnifiedUserService.Client client) {
        try {
            UserRecord p11 = x.r().p();
            UserRecord.Education education = p11.getEducation();
            SchoolInfoRequest l11 = l(education);
            l11.setMajor_id(cVar.f53661b);
            client.update_school(l11);
            education.majorId = cVar.f53661b;
            education.schoolMajor = cVar.f53660a;
            i9.m.f(context, p11);
            return Integer.valueOf(cVar.f53661b);
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public final /* synthetic */ Integer F(gf.d dVar, Context context, UnifiedUserService.Client client) {
        try {
            UserRecord p11 = x.r().p();
            UserRecord.Education education = p11.getEducation();
            SchoolInfoRequest l11 = l(education);
            l11.setSchool_id(dVar.f53663b);
            client.update_school(l11);
            education.schoolId = dVar.f53663b;
            education.schoolName = dVar.f53662a;
            education.isUniversity = dVar.f53665d;
            i9.m.f(context, p11);
            return Integer.valueOf(dVar.f53663b);
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public rx.c<Boolean> G(final String search) {
        return m().c3(new wb0.p() { // from class: gf.j
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.f(search, (UnifiedUserService.Client) obj);
            }
        }).I3(tb0.a.a());
    }

    public rx.c<e<gf.c>> H(final String major, final int page) {
        return m().c3(new wb0.p() { // from class: gf.q
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.b(page, major, (UnifiedUserService.Client) obj);
            }
        }).I3(tb0.a.a());
    }

    public rx.c<e<gf.d>> I(final String school) {
        return m().c3(new wb0.p() { // from class: gf.h
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.e(school, (UnifiedUserService.Client) obj);
            }
        }).I3(tb0.a.a());
    }

    public rx.c<List> J(final int level, final String province, final String city, final String county, final String key) {
        qb.c.i(f53698a, "[%d, %s, %s, %s, %s]", Integer.valueOf(level), province, city, county, key);
        return m().c3(new wb0.p() { // from class: gf.g
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.g(province, level, city, county, key, (UnifiedUserService.Client) obj);
            }
        }).I3(tb0.a.a());
    }

    public final SchoolInfoRequest l(UserRecord.Education education) {
        SchoolInfoRequest schoolInfoRequest = new SchoolInfoRequest();
        schoolInfoRequest.setMajor_id(education.majorId);
        schoolInfoRequest.setSchool_year(education.schoolYear);
        schoolInfoRequest.setSchool_bg(education.schoolBg);
        schoolInfoRequest.setSchool_id(education.schoolId);
        return schoolInfoRequest;
    }

    public final rx.c<UnifiedUserService.Client> m() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/unified_user_service").w5(bc0.c.e());
    }

    public rx.c<Long> n(Context context, final int y11, final int m11, final int d11) {
        return m().c3(new c(y11, m11, d11, context)).I3(tb0.a.a());
    }

    public rx.c<Integer> o(final Context context, final int eduBg) {
        return m().c3(new wb0.p() { // from class: gf.p
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer C;
                C = r.this.C(eduBg, context, (UnifiedUserService.Client) obj);
                return C;
            }
        }).I3(tb0.a.a());
    }

    public rx.c<Long> p(final Context context, final int y11) {
        return m().c3(new wb0.p() { // from class: gf.m
            @Override // wb0.p
            public final Object call(Object obj) {
                Long D;
                D = r.this.D(y11, context, (UnifiedUserService.Client) obj);
                return D;
            }
        }).I3(tb0.a.a());
    }

    public rx.c<String> q(final Context context, final gf.b locationInfo) {
        return m().c3(new wb0.p() { // from class: gf.o
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.d(b.this, context, (UnifiedUserService.Client) obj);
            }
        }).I3(tb0.a.a());
    }

    public rx.c<Integer> r(final Context context, final gf.c majorInfo) {
        return m().c3(new wb0.p() { // from class: gf.k
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer E;
                E = r.this.E(majorInfo, context, (UnifiedUserService.Client) obj);
                return E;
            }
        }).I3(tb0.a.a());
    }

    public rx.c<Boolean> s(final Context context, final String name) {
        return m().c3(new b(name, context)).I3(tb0.a.a());
    }

    public rx.c<Integer> t(final Context context, final gf.d school) {
        return m().c3(new wb0.p() { // from class: gf.l
            @Override // wb0.p
            public final Object call(Object obj) {
                Integer F;
                F = r.this.F(school, context, (UnifiedUserService.Client) obj);
                return F;
            }
        }).I3(tb0.a.a());
    }

    public rx.c<Boolean> u(final Context context, final int sex) {
        return m().c3(new a(sex, context)).I3(tb0.a.a());
    }

    public rx.c<d> v() {
        UserRecord p11 = x.r().p();
        return p11 == null ? rx.c.T1(new RuntimeException("null user")) : rx.c.M2(p11).c3(new wb0.p() { // from class: gf.i
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.h((UserRecord) obj);
            }
        }).I3(tb0.a.a());
    }

    public String w() {
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            return p11.getImage();
        }
        return null;
    }

    public rx.c<List<gf.b>> x() {
        return m().c3(new wb0.p() { // from class: gf.n
            @Override // wb0.p
            public final Object call(Object obj) {
                return r.j((UnifiedUserService.Client) obj);
            }
        }).I3(tb0.a.a());
    }

    public String y() {
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            return p11.getDisplayName();
        }
        return null;
    }

    public String z() {
        UserRecord p11 = x.r().p();
        if (p11 != null) {
            return p11.getVerboseSex();
        }
        return null;
    }
}
