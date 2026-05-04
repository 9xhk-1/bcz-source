package ta;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.online.structs.BELogicException;
import com.baicizhan.online.structs.BESystemException;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
import com.jiongji.andriod.card.R;
import java.net.UnknownHostException;
import javax.inject.Inject;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final int f90394g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f90395h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f90396i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f90397j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f90398k = 5;

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f90399a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Integer> f90400b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Drawable> f90401c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<Boolean> f90402d;

    /* renamed from: e, reason: collision with root package name */
    public LiveData<Void> f90403e;

    /* renamed from: f, reason: collision with root package name */
    public Application f90404f;

    @Inject
    public b(Application application) {
        super(application);
        this.f90399a = new MutableLiveData<>();
        this.f90400b = new MutableLiveData<>();
        this.f90401c = new MutableLiveData<>();
        this.f90402d = new MutableLiveData<>();
        this.f90403e = new ClickProtectedEvent();
        this.f90401c.setValue(null);
        this.f90404f = application;
    }

    private boolean i(Throwable e11) {
        if (e11 == null) {
            return false;
        }
        while (e11 != null) {
            if ((e11 instanceof BELogicException) || (e11 instanceof LogicException)) {
                r(3, e11.getMessage(), R.drawable.ic_base_loading_view_system_error);
                return true;
            }
            if ((e11 instanceof TTransportException) || (e11 instanceof UnknownHostException)) {
                q(3, R.string.base_loading_view_no_network, R.drawable.ic_base_loading_view_no_network);
                return true;
            }
            if ((e11 instanceof SystemException) || (e11 instanceof BESystemException)) {
                q(3, R.string.base_loading_view_system_error, R.drawable.ic_base_loading_view_system_error);
                return true;
            }
            e11 = e11.getCause();
        }
        return false;
    }

    public void a() {
        b(R.string.base_loading_view_empty);
    }

    public void b(int str) {
        c(str, 0);
    }

    public void c(int str, int img) {
        q(4, str, img);
    }

    public void d() {
        f(null);
    }

    public void f(Throwable e11) {
        g(e11, R.string.base_loading_view_failed);
    }

    public void g(Throwable e11, int failedText) {
        h(e11, failedText, R.drawable.ic_base_loading_view_no_network);
    }

    public void h(Throwable e11, int failedText, int failedImage) {
        if (i(e11)) {
            return;
        }
        q(3, failedText, R.drawable.ic_base_loading_view_system_error);
    }

    public boolean j() {
        return this.f90400b.getValue() != null && this.f90400b.getValue().intValue() == 1;
    }

    public void k() {
        l(R.string.base_loading_view_loading);
    }

    public void l(int text) {
        m(text, 0);
    }

    public void m(int text, int image) {
        q(1, text, image);
    }

    public void n(String text) {
        r(1, text, 0);
    }

    public void p() {
        ((SingleLiveEvent) this.f90403e).call();
    }

    public final void q(int status, int str, int img) {
        r(status, str == 0 ? "" : this.f90404f.getString(str), img);
    }

    public final void r(int status, String str, int img) {
        this.f90400b.setValue(Integer.valueOf(status));
        this.f90401c.setValue(img == 0 ? null : this.f90404f.getDrawable(img));
        this.f90399a.setValue(str);
        this.f90402d.setValue(Boolean.valueOf(status == 2));
    }

    public void s() {
        q(2, 0, 0);
    }

    public void o() {
    }
}
