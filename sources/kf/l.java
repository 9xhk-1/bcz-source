package kf;

import android.content.Context;
import android.os.Bundle;
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
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.jiongji.andriod.card.R;
import gs.a8;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f66476d = "CategoryPickupFragment";

    /* renamed from: e, reason: collision with root package name */
    public static final String f66477e = "param_level";

    /* renamed from: f, reason: collision with root package name */
    public static final int f66478f = -1;

    /* renamed from: a, reason: collision with root package name */
    public a8 f66479a;

    /* renamed from: b, reason: collision with root package name */
    public p f66480b;

    /* renamed from: c, reason: collision with root package name */
    public f f66481c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            if (newState == 1) {
                SystemUtil.hideIME(l.this.f66479a.f54154d);
            }
        }
    }

    private void A() {
        this.f66480b.f66498e.observe(this, new Observer() { // from class: kf.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                l.this.D((Void) obj);
            }
        });
        this.f66480b.f66499f.observe(this, new Observer() { // from class: kf.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                l.this.E((Boolean) obj);
            }
        });
        this.f66480b.f66497d.observe(this, new Observer() { // from class: kf.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                l.this.F((List) obj);
            }
        });
        this.f66480b.f66501h.observe(this, new Observer() { // from class: kf.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
    }

    private void B(LayoutInflater inflater) {
        a8 e11 = a8.e(inflater);
        this.f66479a = e11;
        e11.j(this.f66480b);
        this.f66479a.setLifecycleOwner(this);
        f fVar = new f(this.f66480b);
        this.f66481c = fVar;
        this.f66479a.f54152b.setAdapter(fVar);
        this.f66479a.f54152b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f66479a.f54154d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: kf.k
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean G;
                G = l.this.G(textView, i11, keyEvent);
                return G;
            }
        });
        this.f66479a.f54152b.addOnScrollListener(new a());
    }

    private void C() {
        int i11;
        this.f66480b = (p) new ViewModelProvider(this, new ta.a(this)).get(p.class);
        Bundle arguments = getArguments();
        if (arguments == null || (i11 = arguments.getInt(f66477e, -1)) == -1) {
            return;
        }
        this.f66480b.l(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Void r12) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void H(Context context) {
        I(context, -1);
    }

    public static void I(Context context, int level) {
        Bundle bundle = new Bundle();
        bundle.putInt(f66477e, level);
        SingleFragmentActivity.I0(context, l.class, bundle, context.getString(R.string.userinfo_edit_school__select_title));
    }

    public final /* synthetic */ void E(Boolean bool) {
        SystemUtil.hideIME(this.f66479a.f54154d);
    }

    public final /* synthetic */ void F(List list) {
        this.f66479a.f54152b.scrollToPosition(0);
    }

    public final /* synthetic */ boolean G(TextView textView, int i11, KeyEvent keyEvent) {
        SystemUtil.hideIME(this.f66479a.f54154d);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        B(inflater);
        A();
        return this.f66479a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
