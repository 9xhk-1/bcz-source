package bh;

import android.app.Application;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.friend.model.SocialNetwork;
import hi.f;
import qb0.h;
import th.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends AndroidViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final String f6817i = "c";

    /* renamed from: j, reason: collision with root package name */
    public static final int f6818j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6819k = 2;

    /* renamed from: a, reason: collision with root package name */
    public ec0.b f6820a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray<h> f6821b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableLiveData<SparseBooleanArray> f6822c;

    /* renamed from: d, reason: collision with root package name */
    public final MutableLiveData<Boolean> f6823d;

    /* renamed from: e, reason: collision with root package name */
    public final MutableLiveData<Boolean> f6824e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableLiveData<Boolean> f6825f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableLiveData<Boolean> f6826g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableLiveData<Boolean> f6827h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bh.c$c, reason: collision with other inner class name */
    public static class C0119c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f6830a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f6831b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f6832c = 4;

        /* renamed from: d, reason: collision with root package name */
        public static final int f6833d = 8;

        /* renamed from: e, reason: collision with root package name */
        public static final int f6834e = 16;

        /* renamed from: f, reason: collision with root package name */
        public static final int f6835f = 32;

        /* renamed from: g, reason: collision with root package name */
        public static int f6836g;

        /* renamed from: h, reason: collision with root package name */
        public static SparseBooleanArray f6837h = new SparseBooleanArray(5);

        public static void d(int flag) {
            f6836g = flag | f6836g;
            e();
        }

        public static void e() {
            for (int i11 = 0; i11 < 5; i11++) {
                if (i11 == 0) {
                    f6837h.put(i11, (f6836g & 1) == 1);
                } else if (i11 == 2) {
                    f6837h.put(i11, (f6836g & 4) == 4);
                } else if (i11 == 4) {
                    SparseBooleanArray sparseBooleanArray = f6837h;
                    int i12 = f6836g;
                    if ((i12 & 8) != 8 && (i12 & 16) != 16 && (i12 & 32) != 32) {
                        r2 = false;
                    }
                    sparseBooleanArray.put(i11, r2);
                }
            }
        }

        public static void f(int flag) {
            f6836g = (~flag) & f6836g;
            e();
        }
    }

    public c(@NonNull Application application) {
        super(application);
        this.f6820a = new ec0.b();
        this.f6821b = new SparseArray<>();
        this.f6822c = new MutableLiveData<>();
        this.f6823d = new MutableLiveData<>();
        this.f6824e = new MutableLiveData<>();
        this.f6825f = new MutableLiveData<>();
        this.f6826g = new MutableLiveData<>();
        this.f6827h = new MutableLiveData<>();
    }

    public void d() {
        String str = f6817i;
        SocialNetwork.checkHasNewNotifications(str, new a());
        SocialNetwork.checkHasNewFeed(str, new b());
    }

    public void f() {
        l(1);
        if (!f.c()) {
            j();
        }
        h u52 = e.e(getApplication()).I3(tb0.a.a()).u5(new wb0.b() { // from class: bh.a
            @Override // wb0.b
            public final void call(Object obj) {
                c.this.g((e.i) obj);
            }
        }, new wb0.b() { // from class: bh.b
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.d(c.f6817i, ((Throwable) obj).getMessage(), new Object[0]);
            }
        });
        this.f6820a.a(u52);
        this.f6821b.put(1, u52);
    }

    public final /* synthetic */ void g(e.i iVar) {
        if (iVar == null) {
            return;
        }
        int c11 = ia.a.c(ia.a.f60469t);
        int i11 = iVar.f90603b;
        if (i11 > c11) {
            BczWebHelperKt.setSFeedbackUpdateTime(i11);
            C0119c.d(8);
            this.f6823d.postValue(Boolean.TRUE);
        }
        int c12 = ia.a.c(ia.a.f60470u);
        if (y9.e.f().c(y9.c.f99701i, y9.b.f99687c) != null) {
            c12 = iVar.f90604c;
        }
        int i12 = iVar.f90604c;
        if (i12 > c12 && i12 > 0) {
            BczWebHelperKt.setSCampaignUpdateTime(i12);
            C0119c.d(4);
        }
        if (f.c()) {
            C0119c.d(16);
            this.f6826g.postValue(Boolean.TRUE);
        }
        if (com.baicizhan.main.activity.idenity.a.f18511a.a()) {
            C0119c.d(32);
            this.f6827h.postValue(Boolean.TRUE);
        } else {
            C0119c.f(32);
            this.f6827h.postValue(Boolean.FALSE);
        }
        h();
    }

    public final void h() {
        this.f6822c.postValue(C0119c.f6837h);
    }

    public void i(int flag) {
        this.f6823d.postValue(Boolean.FALSE);
        k(flag);
    }

    public void j() {
        this.f6826g.postValue(Boolean.FALSE);
        k(16);
    }

    public void k(int flag) {
        C0119c.f(flag);
        h();
    }

    public final void l(int type) {
        h hVar = this.f6821b.get(type);
        if (hVar != null) {
            hVar.unsubscribe();
            this.f6820a.e(hVar);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f6820a.unsubscribe();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SocialNetwork.Listener<Boolean> {
        public a() {
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Boolean res) {
            boolean z11 = false;
            qb.c.b(c.f6817i, "friends new: " + res, new Object[0]);
            if (res != null && res.booleanValue()) {
                z11 = true;
            }
            c.this.f6824e.postValue(Boolean.valueOf(z11));
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements SocialNetwork.Listener<Boolean> {
        public b() {
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Boolean res) {
            boolean z11 = false;
            qb.c.b(c.f6817i, "friends notification: " + res, new Object[0]);
            if (res != null && res.booleanValue()) {
                z11 = true;
            }
            c.this.f6825f.postValue(Boolean.valueOf(z11));
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
        }
    }
}
