package hb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cb.a;
import com.baicizhan.client.fm.data.FmData;
import com.jiongji.andriod.card.R;
import com.wefika.flowlayout.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends Fragment implements View.OnClickListener, e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f59142c = "datas";

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<FmData> f59143a;

    /* renamed from: b, reason: collision with root package name */
    public FlowLayout f59144b;

    public static b t(ArrayList<FmData> datas) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f59142c, datas);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        a.C0143a c0143a = new a.C0143a();
        c0143a.b(0);
        i80.c.f().q(c0143a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.f59143a = getArguments().getParcelableArrayList(f59142c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fm_line_item_mid, container, false);
        viewGroup.setOnClickListener(this);
        this.f59144b = (FlowLayout) viewGroup.findViewById(R.id.words);
        v();
        return viewGroup;
    }

    public final void v() {
        LayoutInflater layoutInflater = getLayoutInflater();
        Iterator<FmData> it = this.f59143a.iterator();
        while (it.hasNext()) {
            FmData next = it.next();
            TextView textView = (TextView) layoutInflater.inflate(R.layout.item_fm_review_word, (ViewGroup) this.f59144b, false);
            textView.setText(next.getWord());
            this.f59144b.addView(textView);
        }
    }

    @Override // hb.e
    public void setEnabled(boolean enabled) {
    }
}
