package gd;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.main.activity.aiclass.LoadingStatus;
import com.baicizhan.main.activity.aiclass.video.PlayerState;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b0 extends AndroidViewModel {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f53578c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f53579d = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f53580e = "LoadingVm";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f53581a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MediatorLiveData<LoadingStatus> f53582b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53583a;

        static {
            int[] iArr = new int[LoadingStatus.values().length];
            try {
                iArr[LoadingStatus.ERROR_MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadingStatus.ERROR_NO_NET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadingStatus.ERROR_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoadingStatus.ERROR_NO_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f53583a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f53584a;

        public c(x00.l function) {
            g0.p(function, "function");
            this.f53584a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f53584a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53584a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@m80.k Application context) {
        super(context);
        g0.p(context, "context");
        this.f53581a = new MutableLiveData<>();
        this.f53582b = new MediatorLiveData<>();
    }

    public static final g2 c(b0 b0Var, PlayerState playerState) {
        qb.c.i(f53580e, "video status " + playerState, new Object[0]);
        if (playerState != PlayerState.ERROR) {
            return g2.f100423a;
        }
        if (rb.d.f(b0Var.getApplication())) {
            b0Var.h(LoadingStatus.ERROR_MEDIA);
        } else {
            b0Var.h(LoadingStatus.ERROR_NO_NET);
        }
        return g2.f100423a;
    }

    public final void b(@m80.k LiveData<PlayerState> status) {
        g0.p(status, "status");
        this.f53582b.addSource(status, new c(new x00.l() { // from class: gd.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c11;
                c11 = b0.c(b0.this, (PlayerState) obj);
                return c11;
            }
        }));
    }

    @m80.k
    public final MutableLiveData<Integer> d() {
        return this.f53581a;
    }

    @m80.k
    public final LiveData<LoadingStatus> f() {
        return this.f53582b;
    }

    public final void g(@m80.k LoadingStatus status) {
        g0.p(status, "status");
        h(status);
    }

    public final void h(LoadingStatus loadingStatus) {
        this.f53582b.postValue(loadingStatus);
        int i11 = b.f53583a[loadingStatus.ordinal()];
        this.f53581a.postValue(Integer.valueOf(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : R.string.ai_class_loading_error_no_info : R.string.ai_class_loading_error_timeout : R.string.ai_class_loading_error_no_network : R.string.ai_class_loading_error_media));
    }
}
