package ge;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import ge.b;
import java.util.List;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends AndroidViewModel {

    /* renamed from: j, reason: collision with root package name */
    public static final int f53637j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f53638k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f53639l = 3;

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Integer> f53640a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Integer> f53641b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<List<Integer>> f53642c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<List<Integer>> f53643d;

    /* renamed from: e, reason: collision with root package name */
    public MutableLiveData<String> f53644e;

    /* renamed from: f, reason: collision with root package name */
    public MutableLiveData<String> f53645f;

    /* renamed from: g, reason: collision with root package name */
    public ClickProtectedEvent<Void> f53646g;

    /* renamed from: h, reason: collision with root package name */
    public ClickProtectedEvent<Void> f53647h;

    /* renamed from: i, reason: collision with root package name */
    public ge.b f53648i;

    public d(@NonNull Application application) {
        super(application);
        this.f53640a = new MutableLiveData<>();
        this.f53641b = new MutableLiveData<>();
        this.f53642c = new MutableLiveData<>();
        this.f53643d = new MutableLiveData<>();
        this.f53644e = new MutableLiveData<>();
        this.f53645f = new MutableLiveData<>();
        this.f53646g = new ClickProtectedEvent<>();
        this.f53647h = new ClickProtectedEvent<>();
        this.f53648i = new ge.b();
    }

    public void a() {
        int intValue = this.f53641b.getValue() == null ? 0 : this.f53641b.getValue().intValue();
        if (intValue == 3) {
            c();
        } else if (intValue == 2) {
            this.f53647h.call();
        }
    }

    public void b() {
        int intValue = this.f53640a.getValue() == null ? 0 : this.f53640a.getValue().intValue();
        if (intValue == 3) {
            d();
        } else if (intValue == 2) {
            this.f53646g.call();
        }
    }

    public final void c() {
        this.f53641b.setValue(1);
        this.f53648i.a(getApplication()).r5(new b());
    }

    public final void d() {
        this.f53640a.setValue(1);
        this.f53648i.b(getApplication()).r5(new a());
    }

    public void start() {
        d();
        c();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<b.C0635b> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f53640a.setValue(3);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(b.C0635b result) {
            d.this.f53640a.setValue(2);
            d.this.f53642c.setValue(result.f53636b);
            d.this.f53644e.setValue(String.valueOf(result.f53635a));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<b.C0635b> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f53641b.setValue(3);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(b.C0635b result) {
            d.this.f53643d.setValue(result.f53636b);
            d.this.f53645f.setValue(String.valueOf(result.f53635a));
            d.this.f53641b.setValue(2);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
