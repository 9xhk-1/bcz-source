package hb;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cb.a;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends Fragment implements View.OnClickListener, e {

    /* renamed from: d, reason: collision with root package name */
    public static final String f59153d = "total";

    /* renamed from: a, reason: collision with root package name */
    public int f59154a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f59155b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f59156c;

    public static d t(int total) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putInt(f59153d, total);
        dVar.setArguments(bundle);
        return dVar;
    }

    private void v() {
        this.f59155b.setText(Html.fromHtml("您会听到<font color='#124EE6'>" + this.f59154a + "</font>个单词"));
        String str = "大约需要<font color='#124EE6'>" + (this.f59154a / 2) + "</font>分钟";
        if (1 == this.f59154a) {
            str = "大约需要<font color='#124EE6'>0.5</font>分钟";
        }
        this.f59156c.setText(Html.fromHtml(str));
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
        this.f59154a = getArguments() != null ? getArguments().getInt(f59153d) : 0;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fm_line_item_start, container, false);
        viewGroup.setOnClickListener(this);
        this.f59155b = (TextView) viewGroup.findViewById(R.id.fm_start_tip_count);
        this.f59156c = (TextView) viewGroup.findViewById(R.id.fm_start_tip_time);
        v();
        return viewGroup;
    }

    @Override // hb.e
    public void setEnabled(boolean enabled) {
    }
}
