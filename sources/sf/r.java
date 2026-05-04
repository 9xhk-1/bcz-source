package sf;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class r extends AndroidViewModel {

    /* renamed from: d, reason: collision with root package name */
    public static final int f88420d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f88421a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f88422b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public ThriftRequest<UnifiedUserService.Client, Integer> f88423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        this.f88421a = new MutableLiveData<>();
        this.f88422b = new MutableLiveData<>();
    }

    @m80.k
    public final MutableLiveData<Boolean> b() {
        return this.f88422b;
    }

    @m80.k
    public final LiveData<Boolean> c() {
        return this.f88421a;
    }

    public final void d(@m80.l UserLoginResult userLoginResult) {
        ThriftRequest<UnifiedUserService.Client, Integer> thriftRequest = this.f88423c;
        if (thriftRequest != null) {
            thriftRequest.cancel();
        }
        com.baicizhan.client.business.thrift.r b11 = com.baicizhan.client.business.thrift.c.b();
        a aVar = new a(userLoginResult);
        this.f88423c = aVar;
        b11.a(aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ThriftRequest<UnifiedUserService.Client, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserLoginResult f88425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserLoginResult userLoginResult) {
            super("/rpc/unified_user_service");
            this.f88425b = userLoginResult;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(UnifiedUserService.Client client) {
            Application application = r.this.getApplication();
            UserLoginResult userLoginResult = this.f88425b;
            UserRecord userRecord = new UserRecord();
            userRecord.setLoginType(6);
            g2 g2Var = g2.f100423a;
            gi.e.n(application, userLoginResult, 6, userRecord);
            return 0;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Integer num) {
            if (num != null && num.intValue() == 0) {
                r.this.f88421a.postValue(Boolean.TRUE);
            } else {
                va.g.g(R.string.verification_toast_login_failed, 0);
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exc) {
        }
    }
}
