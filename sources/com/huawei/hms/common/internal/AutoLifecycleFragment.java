package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AutoLifecycleFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<a> f35532a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f35533b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HuaweiApiClient f35534a;

        /* renamed from: b, reason: collision with root package name */
        protected final int f35535b;

        public a(int i11, HuaweiApiClient huaweiApiClient) {
            this.f35534a = huaweiApiClient;
            this.f35535b = i11;
        }

        public void a() {
            this.f35534a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e11);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f35533b = true;
        for (int i11 = 0; i11 < this.f35532a.size(); i11++) {
            this.f35532a.valueAt(i11).f35534a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f35533b = false;
        for (int i11 = 0; i11 < this.f35532a.size(); i11++) {
            this.f35532a.valueAt(i11).f35534a.disconnect();
        }
    }

    public void startAutoMange(int i11, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.f35532a.indexOfKey(i11) < 0, "Already managing a HuaweiApiClient with this clientId: " + i11);
        this.f35532a.put(i11, new a(i11, huaweiApiClient));
        if (this.f35533b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i11) {
        a aVar = this.f35532a.get(i11);
        this.f35532a.remove(i11);
        if (aVar != null) {
            aVar.a();
        }
    }
}
