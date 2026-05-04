package lf;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.SystemUtil;
import gs.ma;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f71192d = "SearchPositionFragment";

    /* renamed from: a, reason: collision with root package name */
    public ma f71193a;

    /* renamed from: b, reason: collision with root package name */
    public k f71194b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.Adapter f71195c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            if (newState == 1) {
                SystemUtil.hideIME(h.this.f71193a.f55879b);
            }
        }
    }

    private void A(LayoutInflater inflater) {
        ma e11 = ma.e(inflater);
        this.f71193a = e11;
        e11.j(this.f71194b);
        this.f71193a.setLifecycleOwner(this);
        b bVar = new b(this.f71194b);
        this.f71195c = bVar;
        this.f71193a.f55878a.setAdapter(bVar);
        this.f71193a.f55878a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f71193a.f55879b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lf.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean D;
                D = h.this.D(textView, i11, keyEvent);
                return D;
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: lf.e
            @Override // java.lang.Runnable
            public final void run() {
                h.this.E();
            }
        }, 500L);
        this.f71193a.f55878a.addOnScrollListener(new a());
    }

    private void B() {
        k kVar = (k) new ViewModelProvider(this, new ta.a(this)).get(k.class);
        this.f71194b = kVar;
        kVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Void r12) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(TextView textView, int i11, KeyEvent keyEvent) {
        SystemUtil.hideIME(this.f71193a.f55879b);
        return true;
    }

    private void z() {
        this.f71194b.f71202c.observe(this, new Observer() { // from class: lf.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                h.this.C((Void) obj);
            }
        });
        this.f71194b.f71204e.observe(this, new Observer() { // from class: lf.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
    }

    public final /* synthetic */ void E() {
        this.f71193a.f55879b.requestFocus();
        SystemUtil.showIME(this.f71193a.f55879b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        B();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        A(inflater);
        z();
        return this.f71193a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SystemUtil.hideIME(this.f71193a.f55879b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
