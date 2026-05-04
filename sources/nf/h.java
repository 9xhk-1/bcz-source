package nf;

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
import gs.ka;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f75073d = "SearchPositionFragment";

    /* renamed from: a, reason: collision with root package name */
    public ka f75074a;

    /* renamed from: b, reason: collision with root package name */
    public k f75075b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.Adapter f75076c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            if (newState == 1) {
                SystemUtil.hideIME(h.this.f75074a.f55589b);
            }
        }
    }

    private void A(LayoutInflater inflater) {
        ka e11 = ka.e(inflater);
        this.f75074a = e11;
        e11.j(this.f75075b);
        this.f75074a.setLifecycleOwner(this);
        b bVar = new b(this.f75075b);
        this.f75076c = bVar;
        this.f75074a.f55588a.setAdapter(bVar);
        this.f75074a.f55588a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f75074a.f55589b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: nf.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean D;
                D = h.this.D(textView, i11, keyEvent);
                return D;
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: nf.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.E();
            }
        }, 500L);
        this.f75074a.f55588a.addOnScrollListener(new a());
    }

    private void B() {
        this.f75075b = (k) new ViewModelProvider(this, new ta.a(this)).get(k.class);
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
        SystemUtil.hideIME(this.f75074a.f55589b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.f75074a.f55589b.requestFocus();
        SystemUtil.showIME(this.f75074a.f55589b);
    }

    private void z() {
        this.f75075b.f75083c.observe(this, new Observer() { // from class: nf.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                h.this.C((Void) obj);
            }
        });
        this.f75075b.f75084d.observe(this, new Observer() { // from class: nf.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
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
        return this.f75074a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SystemUtil.hideIME(this.f75074a.f55589b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
