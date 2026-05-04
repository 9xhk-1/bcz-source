package je;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.main.word_book.list.WordFavoriteBooksActivity;
import com.jiongji.andriod.card.R;
import gs.p9;
import java.util.HashMap;
import ma.b;
import ma.l;
import ma.t;
import ma.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final String f64064b = "MyTabFragment";

    /* renamed from: a, reason: collision with root package name */
    public p9 f64065a;

    private void x(LayoutInflater inflater) {
        p9 e11 = p9.e(inflater);
        this.f64065a = e11;
        e11.j(this);
        this.f64065a.setLifecycleOwner(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        x(inflater);
        return this.f64065a.getRoot();
    }

    public void t() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.W0, v.f73047r);
        l.e(t.f73012k, ma.a.f72738e4, hashMap);
        BczWebHelperKt.startLittleClassCollect(getActivity());
    }

    public void v() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.W0, v.f73048s);
        l.e(t.f73012k, ma.a.f72738e4, hashMap);
        if (getActivity() != null) {
            BczWebExecutorKt.startNormalWeb(getActivity(), getActivity().getResources().getString(R.string.url_bcz_store_collect), "收藏商品");
        }
    }

    public void w() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.W0, "word_book");
        l.e(t.f73012k, ma.a.f72738e4, hashMap);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WordFavoriteBooksActivity.f26767c.a(activity);
        }
    }
}
