package ee;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.activity.schedule.data.BookDataSource;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class m0 extends AndroidViewModel {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f49719d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f49720e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final String f49721f = m0.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public qb0.h f49722a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public qb0.h f49723b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f49724c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends b<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Boolean> f49726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m0 m0Var, MutableLiveData<Boolean> mutableLiveData) {
            super();
            this.f49726b = mutableLiveData;
        }

        @Override // ee.m0.b, qb0.c
        public void onError(Throwable th2) {
            super.onError(th2);
            this.f49726b.postValue(Boolean.FALSE);
            va.g.j(th2, 0);
        }

        @Override // ee.m0.b, qb0.c
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            q(((Number) obj).intValue());
        }

        public void q(int i11) {
            super.onNext(Integer.valueOf(i11));
            this.f49726b.postValue(Boolean.TRUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends b<String> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<String, g2> f49727b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(m0 m0Var, x00.l<? super String, g2> lVar) {
            super();
            this.f49727b = lVar;
        }

        @Override // ee.m0.b, qb0.c
        public void onError(Throwable th2) {
            super.onError(th2);
            va.g.j(th2, 0);
        }

        @Override // ee.m0.b, qb0.c
        public void onNext(String t11) {
            kotlin.jvm.internal.g0.p(t11, "t");
            super.onNext((d) t11);
            this.f49727b.invoke(t11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f49724c = new MutableLiveData<>();
    }

    @m80.k
    public final MutableLiveData<Boolean> b() {
        return this.f49724c;
    }

    @m80.k
    public final LiveData<Boolean> c() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        qb0.h hVar = this.f49723b;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f49723b = BookDataSource.b().c(getApplication()).I3(tb0.a.a()).r5(new c(this, mutableLiveData));
        return mutableLiveData;
    }

    public final void d(int i11, @m80.k x00.l<? super String, g2> res) {
        kotlin.jvm.internal.g0.p(res, "res");
        qb0.h hVar = this.f49722a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f49722a = new t().j(i11, 0).I3(tb0.a.a()).r5(new d(this, res));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f49722a;
        if (hVar != null) {
            hVar.unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends qb0.g<T> {
        public b() {
        }

        @Override // qb0.c
        public void onError(@m80.l Throwable th2) {
            m0.this.f49724c.setValue(null);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            m0.this.f49724c.setValue(Boolean.FALSE);
        }

        @Override // qb0.g
        public void onStart() {
            m0.this.f49724c.setValue(Boolean.TRUE);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
