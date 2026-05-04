package sh;

import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f88568b = "PatternSwitcher";

    /* renamed from: c, reason: collision with root package name */
    public static final e f88569c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final int f88570d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static final int f88571e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f88572f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f88573g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f88574h = 3;

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, b> f88575a = new HashMap(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.p<UserStudyApiService.Client, rx.c<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88576a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f88577b;

        public a(final int val$switcherID, final int val$mode) {
            this.f88576a = val$switcherID;
            this.f88577b = val$mode;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Integer> call(UserStudyApiService.Client client) {
            qb.c.i(e.f88568b, "setSwitcherMode [switcherID, mode] [%d, %d]", Integer.valueOf(this.f88576a), Integer.valueOf(this.f88577b));
            try {
                rx.c<Integer> M2 = rx.c.M2(0);
                int i11 = this.f88576a;
                if (i11 == 1) {
                    M2 = rx.c.M2(Integer.valueOf(client.set_study_spell_mode(this.f88577b)));
                } else if (i11 == 2) {
                    M2 = rx.c.M2(Integer.valueOf(client.set_study_listening_mode(this.f88577b)));
                } else if (i11 == 3) {
                    M2 = rx.c.M2(Integer.valueOf(client.set_study_chn_mode(this.f88577b)));
                }
                e.e().d(this.f88576a).g(this.f88577b);
                x.r().a(4);
                return M2;
            } catch (TException e11) {
                qb.c.d(e.f88568b, "set switcher mode failed. " + e11, new Object[0]);
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: e, reason: collision with root package name */
        public static final int f88578e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f88579f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f88580g = -1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f88581h = 3;

        /* renamed from: a, reason: collision with root package name */
        public int f88582a;

        /* renamed from: b, reason: collision with root package name */
        public int f88583b;

        /* renamed from: c, reason: collision with root package name */
        public int f88584c;

        public b(int id2) {
            this.f88582a = id2;
        }

        public void a() {
            i9.f.k(pb.a.a(), c(), (this.f88583b << 24) | this.f88584c);
        }

        public int b() {
            return this.f88583b;
        }

        public String c() {
            return i9.f.h(i9.f.U, Integer.toString(this.f88582a));
        }

        public void d() {
            if (this.f88583b == 0) {
                int i11 = this.f88584c + 1;
                this.f88584c = i11;
                if (i11 > 255) {
                    this.f88584c = 255;
                }
            }
        }

        public void e() {
            int d11 = i9.f.d(pb.a.a(), c());
            int i11 = ((-16777216) & d11) >> 24;
            this.f88583b = i11;
            if (i11 != 0 && i11 != 1) {
                this.f88583b = -1;
            }
            this.f88584c = d11 & 255;
        }

        public boolean f() {
            return this.f88583b == 0 && this.f88584c >= 3;
        }

        public void g(int state) {
            this.f88583b = state;
            a();
        }
    }

    public static Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("slideWindowSize", 10);
        boolean z11 = true;
        HashMap hashMap2 = new HashMap(1);
        int b11 = e().d(2).b();
        if (b11 == 0) {
            b11 = -1;
        }
        hashMap2.put("listenStrategy", Integer.valueOf(b11));
        boolean z12 = b11 == 1;
        int b12 = e().d(1).b();
        hashMap2.put("spellStrategy", Integer.valueOf(b12));
        boolean z13 = b12 == 1 || z12;
        int b13 = e().d(3).b();
        hashMap2.put("cn2enStrategy", Integer.valueOf(b13));
        if (b13 != 1 && !z13) {
            z11 = false;
        }
        qb.c.i(f88568b, "allPersonalEnable %b, %s", Boolean.valueOf(z11), new com.google.gson.d().z(hashMap2));
        if (!z11) {
            hashMap2 = null;
        }
        hashMap.put("strategyAgency", hashMap2);
        return hashMap;
    }

    public static Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("slideWindowSize", 10);
        return hashMap;
    }

    public static e e() {
        return f88569c;
    }

    public static rx.c<Integer> g(final int switcherID, final int mode) {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").w5(bc0.c.e()).b2(new a(switcherID, mode)).I3(tb0.a.a());
    }

    public void a() {
        Iterator<b> it = this.f88575a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @NonNull
    public b d(int id2) {
        b bVar = this.f88575a.get(Integer.valueOf(id2));
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(id2);
        bVar2.e();
        this.f88575a.put(Integer.valueOf(id2), bVar2);
        return bVar2;
    }

    public void f(int topicId, int coverage) {
        yc.b w11 = x.r().w(topicId);
        if (w11 == null) {
            return;
        }
        if ((coverage & 1) <= 0) {
            w11.a0();
        } else {
            TopicLearnRecord J = LearnRecordManager.A().J(topicId);
            w11.b0(J == null ? 0 : J.extra.f16074ss);
        }
    }
}
