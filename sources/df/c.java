package df;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.AutoSizeMgr;
import java.util.HashMap;
import ma.l;
import ma.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends AndroidViewModel {

    /* renamed from: b, reason: collision with root package name */
    public static final String f47940b = "PostSettingViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Boolean> f47941a;

    public c(@NonNull Application application) {
        super(application);
        this.f47941a = new MutableLiveData<>();
    }

    public static /* synthetic */ void a(Boolean bool) {
        if (bool == null) {
            return;
        }
        AutoSizeMgr autoSizeMgr = AutoSizeMgr.INSTANCE;
        qb.c.i("PostSettingViewModel", "autoSize [lock, addPost] [%b,%b]", bool, Boolean.valueOf(autoSizeMgr.getUserCloseAutoSize()));
        if (autoSizeMgr.getUserCloseAutoSize() != bool.booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("open", bool);
            l.e(t.f73026y, ma.a.S2, hashMap);
        }
        autoSizeMgr.setUserCloseAutoSize(bool.booleanValue());
    }

    public void b() {
        this.f47941a.observeForever(new Observer() { // from class: df.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.a((Boolean) obj);
            }
        });
    }

    public void start() {
        this.f47941a.postValue(Boolean.valueOf(AutoSizeMgr.INSTANCE.getUserCloseAutoSize()));
        b();
    }
}
