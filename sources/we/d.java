package we;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.daka.datasource.k;
import com.jiongji.andriod.card.R;
import qb0.g;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends AndroidViewModel {

    /* renamed from: e, reason: collision with root package name */
    public static final String f96191e = "DakaSettingViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Boolean> f96192a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<String> f96193b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f96194c;

    /* renamed from: d, reason: collision with root package name */
    public h f96195d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Boolean> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f96193b.setValue(va.g.e(e11, R.string.setting_study_operation_failed));
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            d.this.f96194c.call();
            d dVar = d.this;
            dVar.f96193b.setValue(dVar.getApplication().getString(R.string.setting_operation_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public d(@NonNull Application application) {
        super(application);
        this.f96192a = new MutableLiveData<>();
        this.f96193b = new SingleLiveEvent<>();
        this.f96194c = new SingleLiveEvent<>();
    }

    public void a() {
        if (this.f96192a.getValue() == null || this.f96192a.getValue().booleanValue()) {
            h hVar = this.f96195d;
            if (hVar == null || hVar.isUnsubscribed()) {
                c(true);
            }
        }
    }

    public void b() {
        if (this.f96192a.getValue() == null || !this.f96192a.getValue().booleanValue()) {
            h hVar = this.f96195d;
            if (hVar == null || hVar.isUnsubscribed()) {
                c(false);
            }
        }
    }

    public final void c(boolean classic) {
        this.f96195d = k.h(classic).r5(new a());
    }

    public void start() {
        this.f96192a.setValue(Boolean.valueOf(!k.d()));
    }
}
