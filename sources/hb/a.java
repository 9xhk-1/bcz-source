package hb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import cb.a;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment implements e, View.OnClickListener {
    public static a t() {
        return new a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        a.C0143a c0143a = new a.C0143a();
        c0143a.b(0);
        i80.c.f().q(c0143a);
        if (R.id.fm_end_listen_more == v11.getId()) {
            i80.c.f().q(new a.b());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fm_line_item_end, container, false);
        viewGroup.setOnClickListener(this);
        viewGroup.findViewById(R.id.fm_end_listen_more).setOnClickListener(this);
        return viewGroup;
    }

    @Override // hb.e
    public void setEnabled(boolean enabled) {
    }
}
