package yh;

import android.app.Application;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import i9.f;
import java.util.ArrayList;
import java.util.Collection;
import sh.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final String f100155c = "WalkListenerStrategy";

    /* renamed from: d, reason: collision with root package name */
    public static final String f100156d = "listener_topic_id";

    /* renamed from: e, reason: collision with root package name */
    public static final String f100157e = "listener_topic_id_remain";

    /* renamed from: f, reason: collision with root package name */
    public static final int f100158f = 50;

    /* renamed from: g, reason: collision with root package name */
    public static final String f100159g = ",";

    /* renamed from: a, reason: collision with root package name */
    public int f100160a;

    /* renamed from: b, reason: collision with root package name */
    public SparseIntArray f100161b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static d f100162a = new d();
    }

    public static d d() {
        return a.f100162a;
    }

    public final void a() {
        if (this.f100161b == null) {
            qb.c.d(f100155c, "WalkListenerStrategy has not load, so load", new Object[0]);
            h();
        }
    }

    public boolean b(int topicId) {
        a();
        if (this.f100161b.indexOfKey(topicId) >= 0) {
            qb.c.i(f100155c, "the topicId (%d) has already done", Integer.valueOf(topicId));
            return false;
        }
        qb.c.i(f100155c, "done topic Id = %d", Integer.valueOf(topicId));
        this.f100161b.put(topicId, 0);
        this.f100160a--;
        c();
        return true;
    }

    public final void c() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f100161b.size(); i11++) {
            sb2.append(this.f100161b.keyAt(i11));
            sb2.append(",");
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        f.n(pb.a.a(), f100156d, sb2.toString(), false);
        f.k(pb.a.a(), f100157e, this.f100160a);
    }

    public int e() {
        a();
        return this.f100160a;
    }

    public l f() {
        a();
        Collection<Integer> g11 = g();
        if (this.f100161b.size() > 0 && g11.isEmpty()) {
            qb.c.i(f100155c, "all word has been learned, do clean", new Object[0]);
            this.f100161b.clear();
            g11 = g();
        }
        this.f100160a = g11.size();
        qb.c.i(f100155c, "cache %s, problem %s", this.f100161b.toString(), new com.google.gson.d().z(g11));
        return new sh.b(g11);
    }

    public final Collection<Integer> g() {
        int i11 = this.f100160a;
        if (i11 == 0) {
            i11 = 50;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (TopicLearnRecord topicLearnRecord : LearnRecordManager.A().L().values()) {
            if (topicLearnRecord.topicScore >= 0) {
                arrayList.add(Integer.valueOf(topicLearnRecord.topicId));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : arrayList) {
            if (this.f100161b.indexOfKey(num.intValue()) < 0) {
                arrayList2.add(num);
            }
            if (arrayList2.size() >= i11) {
                break;
            }
        }
        return arrayList2;
    }

    public void h() {
        i();
        Application a11 = pb.a.a();
        String g11 = f.g(a11, f100156d, false);
        this.f100160a = f.d(a11, f100157e);
        this.f100161b = new SparseIntArray();
        if (!TextUtils.isEmpty(g11)) {
            for (String str : g11.split(",")) {
                this.f100161b.put(Integer.valueOf(str).intValue(), 0);
            }
        }
        qb.c.i(f100155c, "load %s topic Id, remain %d", this.f100161b.toString(), Integer.valueOf(this.f100160a));
    }

    public void i() {
        qb.c.i(f100155c, "release called", new Object[0]);
        SparseIntArray sparseIntArray = this.f100161b;
        if (sparseIntArray != null) {
            sparseIntArray.clear();
            this.f100161b = null;
        }
    }

    public void j(int remain) {
        qb.c.i(f100155c, "updateRemain %d", Integer.valueOf(remain));
        this.f100160a = remain;
    }

    public d() {
        this.f100160a = 0;
        this.f100161b = null;
    }
}
