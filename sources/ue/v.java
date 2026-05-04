package ue;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class v extends AndroidViewModel {

    /* renamed from: n, reason: collision with root package name */
    public static final String f92165n = "AboutUsViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f92166a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Boolean> f92167b;

    /* renamed from: c, reason: collision with root package name */
    public ClickProtectedEvent<Void> f92168c;

    /* renamed from: d, reason: collision with root package name */
    public ClickProtectedEvent<Void> f92169d;

    /* renamed from: e, reason: collision with root package name */
    public ClickProtectedEvent<Void> f92170e;

    /* renamed from: f, reason: collision with root package name */
    public ClickProtectedEvent<Void> f92171f;

    /* renamed from: g, reason: collision with root package name */
    public MutableLiveData<String> f92172g;

    /* renamed from: h, reason: collision with root package name */
    public MutableLiveData<String> f92173h;

    /* renamed from: i, reason: collision with root package name */
    public SingleLiveEvent<String> f92174i;

    /* renamed from: j, reason: collision with root package name */
    public final s f92175j;

    /* renamed from: k, reason: collision with root package name */
    public final int f92176k;

    /* renamed from: l, reason: collision with root package name */
    public final int f92177l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f92178m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f92179a;

        public a(final boolean val$showToast) {
            this.f92179a = val$showToast;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(v.f92165n, "", e11);
            if (this.f92179a) {
                v vVar = v.this;
                vVar.f92174i.setValue(vVar.getApplication().getString(R.string.about_us_upgrade_failed));
            }
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            qb.c.b(v.f92165n, "checkAppNewVersion:" + aBoolean, new Object[0]);
            v.this.f92167b.setValue(aBoolean);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f92181a = "time";

        /* renamed from: b, reason: collision with root package name */
        public static final String f92182b = "phone";

        /* renamed from: c, reason: collision with root package name */
        public static final String f92183c = "email";
    }

    public v(@NonNull Application application) {
        super(application);
        this.f92166a = new MutableLiveData<>();
        this.f92167b = new MutableLiveData<>();
        this.f92168c = new ClickProtectedEvent<>();
        this.f92169d = new ClickProtectedEvent<>();
        this.f92170e = new ClickProtectedEvent<>();
        this.f92171f = new ClickProtectedEvent<>();
        this.f92172g = new MutableLiveData<>();
        this.f92173h = new MutableLiveData<>();
        this.f92174i = new SingleLiveEvent<>();
        this.f92176k = 5;
        this.f92177l = 2000;
        this.f92178m = new long[5];
        this.f92175j = new s();
    }

    public final void c(boolean showToast) {
        this.f92175j.b(getApplication()).r5(new a(showToast));
    }

    public void f() {
        qb.c.b(f92165n, "doBczUpdate", new Object[0]);
        if (this.f92167b.getValue() == null) {
            c(true);
        } else if (this.f92167b.getValue().booleanValue()) {
            this.f92169d.call();
        } else {
            this.f92174i.setValue(getApplication().getString(R.string.about_us_no_new_version));
        }
    }

    public final void g() {
        this.f92175j.c().u5(new wb0.b() { // from class: ue.t
            @Override // wb0.b
            public final void call(Object obj) {
                v.this.i((Map) obj);
            }
        }, new wb0.b() { // from class: ue.u
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(v.f92165n, "", (Throwable) obj);
            }
        });
    }

    public void h() {
        this.f92168c.call();
    }

    public final /* synthetic */ void i(Map map) {
        String str;
        String str2 = (String) map.get("phone");
        String str3 = (String) map.get("time");
        if (!TextUtils.isEmpty(str2)) {
            MutableLiveData<String> mutableLiveData = this.f92172g;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (TextUtils.isEmpty(str3)) {
                str = "";
            } else {
                str = "\n" + str3;
            }
            sb2.append(str);
            mutableLiveData.setValue(sb2.toString());
        }
        String str4 = (String) map.get("email");
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        this.f92173h.setValue(str4);
    }

    public void j() {
        this.f92170e.call();
    }

    public void start() {
        this.f92166a.setValue(this.f92175j.e(getApplication()));
        c(false);
        g();
    }

    public void d() {
    }
}
