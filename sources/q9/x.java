package q9;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.OfflineStateRecord;
import com.baicizhan.client.business.dataset.models.RoadmapRecord;
import com.baicizhan.client.business.dataset.models.ScheduleRecord;
import com.baicizhan.client.business.dataset.models.UpdateZpkMd5;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.okhttp.DnsMgr;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import com.baicizhan.online.user_assistant_api.BetaUserType;
import com.baicizhan.online.user_study_api.PrimarySchoolModeConfig;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class x {
    public static final String E = "StudyManager";
    public static final int F = 1;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 64;
    public static volatile x L;
    public ad.b A;
    public String B;
    public boolean C;
    public List<WeakReference<a>> D;

    /* renamed from: b, reason: collision with root package name */
    public volatile UserRecord f81973b;

    /* renamed from: f, reason: collision with root package name */
    public aa.a f81977f;

    /* renamed from: g, reason: collision with root package name */
    public int f81978g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduleRecord f81979h;

    /* renamed from: i, reason: collision with root package name */
    public BookRecord f81980i;

    /* renamed from: j, reason: collision with root package name */
    public ScheduleRecord f81981j;

    /* renamed from: k, reason: collision with root package name */
    public OfflineStateRecord f81982k;

    /* renamed from: l, reason: collision with root package name */
    public Map<Integer, RoadmapRecord> f81983l;

    /* renamed from: m, reason: collision with root package name */
    public List<Integer> f81984m;

    /* renamed from: n, reason: collision with root package name */
    public Map<Integer, UpdateZpkMd5> f81985n;

    /* renamed from: o, reason: collision with root package name */
    public Set<Integer> f81986o;

    /* renamed from: p, reason: collision with root package name */
    public Map<Integer, WordClozeRecord> f81987p;

    /* renamed from: q, reason: collision with root package name */
    public Map<String, Integer> f81988q;

    /* renamed from: r, reason: collision with root package name */
    public List<Integer> f81989r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f81990s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f81991t;

    /* renamed from: u, reason: collision with root package name */
    public int f81992u;

    /* renamed from: v, reason: collision with root package name */
    public long f81993v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f81994w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f81995x;

    /* renamed from: y, reason: collision with root package name */
    public ad.a f81996y;

    /* renamed from: z, reason: collision with root package name */
    public Map<Integer, yc.b> f81997z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f81972a = false;

    /* renamed from: c, reason: collision with root package name */
    public BczSystemInfos f81974c = null;

    /* renamed from: d, reason: collision with root package name */
    public UserLimitInfoV2 f81975d = null;

    /* renamed from: e, reason: collision with root package name */
    public PrimarySchoolModeConfig f81976e = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void v(UserLimitInfoV2 pre, UserLimitInfoV2 now);
    }

    public x() {
        Map map = Collections.EMPTY_MAP;
        this.f81983l = map;
        this.f81984m = Collections.EMPTY_LIST;
        this.f81985n = map;
        this.f81986o = Collections.EMPTY_SET;
        this.f81987p = map;
        this.f81988q = new HashMap();
        this.f81990s = false;
        this.f81991t = false;
        this.f81994w = false;
        this.f81995x = false;
        this.f81997z = new ConcurrentHashMap();
        this.B = "RefreshRequestFlag";
        this.D = new ArrayList();
        this.f81977f = ((w) qu.e.d(pb.a.a(), w.class)).i();
    }

    public static x r() {
        if (L == null) {
            synchronized (x.class) {
                try {
                    if (L == null) {
                        L = new x();
                    }
                } finally {
                }
            }
        }
        return L;
    }

    public int A() {
        return this.f81984m.size();
    }

    public void A0(ScheduleRecord schedule) {
        this.f81981j = schedule;
    }

    public List<Integer> B() {
        return this.f81989r;
    }

    public void B0(int todayNewCount) {
        this.f81978g = todayNewCount;
    }

    public ScheduleRecord C() {
        return this.f81981j;
    }

    public synchronized void C0(UserLimitInfoV2 userLimit) {
        UserLimitInfoV2 userLimitInfoV2 = this.f81975d;
        this.f81975d = userLimit;
        for (WeakReference<a> weakReference : this.D) {
            if (weakReference.get() != null) {
                weakReference.get().v(userLimitInfoV2, this.f81975d);
            }
        }
    }

    public int D() {
        return this.f81978g;
    }

    public void D0(Map<Integer, WordClozeRecord> map) {
        this.f81987p = map;
    }

    public int[] E(int id2) {
        RoadmapRecord roadmapRecord = this.f81983l.get(Integer.valueOf(id2));
        if (roadmapRecord != null) {
            return roadmapRecord.options;
        }
        return null;
    }

    public boolean E0(int topicId) {
        Set<Integer> set = this.f81986o;
        return set != null && set.contains(Integer.valueOf(topicId));
    }

    public UpdateZpkMd5 F(int topicId) {
        Map<Integer, UpdateZpkMd5> map = this.f81985n;
        if (map == null || map.size() == 0) {
            return null;
        }
        return this.f81985n.get(Integer.valueOf(topicId));
    }

    public synchronized int F0() {
        int y11;
        y11 = y();
        qb.c.b(E, "takeRefreshRequestFlag " + y11, new Object[0]);
        i9.h.f().h(this.B, 0);
        return y11;
    }

    public UserLimitInfoV2 G() {
        return this.f81975d;
    }

    public void G0(a listener) {
        Iterator<WeakReference<a>> it = this.D.iterator();
        while (it.hasNext()) {
            if (it.next().get() == listener) {
                qb.c.i(E, "unregister and remove", new Object[0]);
                it.remove();
                return;
            }
        }
    }

    public long H() {
        if (this.f81993v == 0) {
            e0();
        }
        return this.f81993v;
    }

    public Map<Integer, WordClozeRecord> I() {
        return this.f81987p;
    }

    public boolean J() {
        return (this.f81980i == null || this.f81979h == null) ? false : true;
    }

    public boolean K() {
        return this.f81985n.size() > 0 && this.f81985n.size() == this.f81984m.size();
    }

    public boolean L() {
        return this.f81972a;
    }

    public boolean M() {
        return this.f81994w;
    }

    public boolean N() {
        return i9.j.b(i9.j.f60417h);
    }

    public boolean O() {
        return U(BetaUserType.BETA_TYPE_DAKA_LOTTERY);
    }

    public boolean P() {
        return U(BetaUserType.BETA_TYPE_DAKA_SHARE_BONUS);
    }

    public boolean Q() {
        return U(BetaUserType.BETA_TYPE_DICT);
    }

    public boolean R() {
        return U(BetaUserType.BETA_TYPE_INTENSE_REVIEW);
    }

    public boolean S() {
        return U(BetaUserType.BETA_TYPE_IOS_HTTPS);
    }

    public boolean T() {
        return U(BetaUserType.BETA_TYPE_USE_PUSH_MSG);
    }

    public final boolean U(BetaUserType type) {
        List<Integer> betaTypeList = this.f81973b != null ? this.f81973b.getBetaTypeList() : null;
        if (xb.e.h(betaTypeList)) {
            return false;
        }
        Iterator<Integer> it = betaTypeList.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == type.getValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean V() {
        return true;
    }

    public boolean W() {
        return this.f81995x;
    }

    public boolean X(int id2) {
        return this.f81983l.containsKey(Integer.valueOf(id2));
    }

    public boolean Y() {
        return this.f81991t;
    }

    public boolean Z() {
        return U(BetaUserType.BETA_TYPE_OCR_PDF);
    }

    public synchronized void a(int flag) {
        int y11 = y() | flag;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            qb.c.i(E, "addRefreshRequestFlag %d old %d [%s, %d, %s]", Integer.valueOf(flag), Integer.valueOf(y11), stackTrace[3].getFileName(), Integer.valueOf(stackTrace[3].getLineNumber()), stackTrace[3].getMethodName());
        } catch (Exception e11) {
            qb.c.c(E, "", e11);
        }
        i9.h.f().h(this.B, y11);
    }

    public boolean a0() {
        return this.C;
    }

    public void b(int id2) {
        if (this.f81989r == null) {
            this.f81989r = new ArrayList();
        }
        this.f81989r.add(Integer.valueOf(id2));
    }

    public boolean b0() {
        return this.f81990s;
    }

    public boolean c(Activity activity) {
        if (L()) {
            return false;
        }
        qb.c.i(E, "checkRestart " + activity.getComponentName(), new Object[0]);
        Intent intent = new Intent();
        intent.setClassName(fs.b.f52352b, "com.baicizhan.main.activity.LoadingPageActivity");
        intent.setFlags(268468224);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.business_no_fade_long, R.anim.business_no_fade_long);
        activity.finish();
        return true;
    }

    public boolean c0(String script) {
        if (this.f81996y != null) {
            return true;
        }
        ad.a load = new zc.e(script).load();
        this.f81996y = load;
        if (load == null) {
            qb.c.d(E, "loadLearningManager failed", new Object[0]);
            return false;
        }
        try {
            this.A = new bd.b();
        } catch (Exception unused) {
            this.A = null;
        }
        return true;
    }

    public synchronized void d() {
        qb.c.a(E, "clearCurrentScheduleData", new RuntimeException());
        this.f81978g = 0;
        this.f81980i = null;
        this.f81982k = null;
        this.f81979h = null;
        Map map = Collections.EMPTY_MAP;
        this.f81983l = map;
        this.f81984m = Collections.EMPTY_LIST;
        this.f81985n = map;
        this.f81986o = Collections.EMPTY_SET;
        f();
        h();
        g();
        LearnRecordManager.A().o();
    }

    public void d0(String key, int count) {
        this.f81988q.put(key, Integer.valueOf(count));
    }

    public synchronized void e() {
        qb.c.i(E, "clearPersonalData", new Object[0]);
        this.f81973b = null;
        this.f81974c = null;
        this.f81975d = null;
        this.f81994w = false;
        j0(false);
        BookListManager.getInstance().clear();
        d();
        BookListManager.getInstance().userRejectUpdate(false);
    }

    public void e0() {
        this.f81992u = (int) (TimeUtil.todayStart() / 1000);
        this.f81993v = this.f81977f.currentTimeMillis();
    }

    public void f() {
        this.f81988q.clear();
    }

    public void f0(a listener) {
        this.D.add(new WeakReference<>(listener));
    }

    public void g() {
        List<Integer> list = this.f81989r;
        if (list != null) {
            list.clear();
        }
    }

    public synchronized void g0() {
        try {
            qb.c.a(E, "resetCurrentScheduleData", new RuntimeException());
            this.f81978g = 0;
            BookRecord bookRecord = this.f81980i;
            if (bookRecord != null) {
                bookRecord.finishCount = 0;
            }
            this.f81982k = null;
            this.f81985n = Collections.EMPTY_MAP;
            this.f81986o = Collections.EMPTY_SET;
            f();
            h();
            g();
            LearnRecordManager.A().o();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void h() {
        this.f81987p.clear();
    }

    public void h0(boolean isAlive) {
        this.f81972a = isAlive;
    }

    public List<yc.b> i(int count) {
        return this.A.F(count);
    }

    public void i0(boolean enabled) {
        this.f81994w = enabled;
    }

    public BczSystemInfos j() {
        return this.f81974c;
    }

    public void j0(boolean autoDanced) {
        i9.j.n(i9.j.f60417h, autoDanced);
    }

    public BookRecord k() {
        return this.f81980i;
    }

    public void k0(Map<Integer, UpdateZpkMd5> updateFlagMD5) {
        this.f81985n = updateFlagMD5;
    }

    public int l() {
        ScheduleRecord o11 = o();
        if (o11 != null) {
            return o11.bookId;
        }
        return 0;
    }

    public void l0(BczSystemInfos checkInfo) {
        this.f81974c = checkInfo;
        DnsMgr.f16538a.g(checkInfo == null ? null : checkInfo.tls_dns);
        if (checkInfo != null) {
            com.baicizhan.client.business.thrift.c.d(checkInfo);
            com.baicizhan.client.business.thrift.h.a().c(checkInfo);
            na.d.e(checkInfo);
            m9.c.g(checkInfo.res_dns);
        }
    }

    public OfflineStateRecord m() {
        return this.f81982k;
    }

    public void m0(BookRecord book) {
        this.f81980i = book;
    }

    public Map<Integer, RoadmapRecord> n() {
        return this.f81983l;
    }

    public void n0(OfflineStateRecord offlineState) {
        this.f81982k = offlineState;
    }

    public ScheduleRecord o() {
        ScheduleRecord scheduleRecord = this.f81979h;
        return scheduleRecord != null ? scheduleRecord : j.c();
    }

    public void o0(List<RoadmapRecord> roadmap) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(roadmap.size());
        for (RoadmapRecord roadmapRecord : roadmap) {
            hashMap.put(Integer.valueOf(roadmapRecord.f16070id), roadmapRecord);
            arrayList.add(Integer.valueOf(roadmapRecord.f16070id));
        }
        this.f81984m = arrayList;
        this.f81983l = hashMap;
        qb.c.i(E, TimeModel.f32588i, Integer.valueOf(arrayList.size()));
    }

    public UserRecord p() {
        return this.f81973b;
    }

    public void p0(ScheduleRecord schedule) {
        this.f81979h = schedule;
    }

    public int q() {
        if (this.f81992u == 0) {
            e0();
        }
        return this.f81992u;
    }

    public void q0(UserRecord user) {
        r0(user, false);
    }

    public void r0(UserRecord user, boolean holdTemp) {
        if (user == null) {
            throw new IllegalStateException("setCurrentUser null");
        }
        UserRecord userRecord = holdTemp ? this.f81973b : null;
        this.f81973b = user;
        if (userRecord != null) {
            this.f81973b.setIsNewUser(userRecord.getIsNewUser());
            this.f81973b.setPublicKey(userRecord.getPublicKey());
            this.f81973b.setEmail(userRecord.getEmail());
            this.f81973b.setOauthAccountId(userRecord.getOauthAccountId());
            this.f81973b.setUniqueId(userRecord.getUniqueId());
            this.f81973b.setLastDevice(userRecord.getLastDevice());
            this.f81973b.setBetaTypeList(userRecord.getBetaTypeList());
            this.f81973b.setImage(userRecord.getImage());
            this.f81973b.setGameBeta(userRecord.getGameBeta());
        }
        if (TextUtils.isEmpty(this.f81973b.getToken())) {
            return;
        }
        com.baicizhan.client.business.thrift.c.b().k("access_token", user.getToken());
    }

    public ad.a s() {
        return this.f81996y;
    }

    public void s0(boolean everExceededDialogShown) {
        this.f81995x = everExceededDialogShown;
    }

    public int t(String key) {
        Integer num = this.f81988q.get(key);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void t0(Set<Integer> forceUpdateTopics) {
        this.f81986o = forceUpdateTopics;
    }

    public int u(String key, int threshold) {
        if (threshold <= 0) {
            return 0;
        }
        return threshold - (t(key) % threshold);
    }

    public void u0(boolean initing) {
        this.f81991t = initing;
    }

    public PrimarySchoolModeConfig v() {
        return this.f81976e;
    }

    public void v0(PrimarySchoolModeConfig primarySchoolModeConfig) {
        this.f81976e = primarySchoolModeConfig;
    }

    public yc.b w(int topicId) {
        return this.f81997z.get(Integer.valueOf(topicId));
    }

    public void w0(boolean mReturnFromLearn) {
        this.C = mReturnFromLearn;
    }

    public Map<Integer, yc.b> x() {
        return this.f81997z;
    }

    public void x0(List<Integer> roadmapOrder) {
        this.f81984m = roadmapOrder;
    }

    public int y() {
        return i9.h.f().b(this.B, 0);
    }

    public void y0(List<Integer> ids) {
        this.f81989r = ids;
    }

    public List<Integer> z() {
        return this.f81984m;
    }

    public void z0(boolean studying) {
        this.f81990s = studying;
    }
}
