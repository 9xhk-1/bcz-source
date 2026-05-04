package hb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cb.a;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.widget.WordErrFeedbackFragment;
import com.baicizhan.client.fm.data.FmData;
import com.jiongji.andriod.card.R;
import com.malmstein.fenster.videorender.gles.GeneratedTexture;
import gi.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends Fragment implements View.OnClickListener, e {

    /* renamed from: h, reason: collision with root package name */
    public static final String f59145h = "fmdata";

    /* renamed from: a, reason: collision with root package name */
    public FmData f59146a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f59147b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f59148c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f59149d;

    /* renamed from: e, reason: collision with root package name */
    public Button f59150e;

    /* renamed from: f, reason: collision with root package name */
    public View f59151f;

    /* renamed from: g, reason: collision with root package name */
    public View f59152g;

    public static c t(FmData fmdata) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f59145h, fmdata);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        a.C0143a c0143a = new a.C0143a();
        c0143a.b(0);
        i80.c.f().q(c0143a);
        if (v11 != this.f59150e) {
            if (v11 == this.f59151f) {
                i80.c.f().q(new a.d());
                this.f59151f.setVisibility(8);
                this.f59152g.setVisibility(0);
                return;
            }
            return;
        }
        a.c cVar = new a.c();
        cVar.b(0);
        i80.c.f().q(cVar);
        WordErrFeedbackFragment.Word word = new WordErrFeedbackFragment.Word();
        word.c(Integer.valueOf(this.f59146a.getWordid()).intValue());
        word.d(this.f59146a.getWord());
        WordErrFeedbackFragment.A(word, true).show(getActivity().getSupportFragmentManager(), "feedback");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f59146a = getArguments() != null ? (FmData) getArguments().getParcelable(f59145h) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fm_line_item_normal, container, false);
        viewGroup.setOnClickListener(this);
        this.f59147b = (TextView) viewGroup.findViewById(R.id.fm_line_word);
        this.f59148c = (TextView) viewGroup.findViewById(R.id.fm_line_cnmean);
        this.f59149d = (TextView) viewGroup.findViewById(R.id.fm_line_example);
        Button button = (Button) viewGroup.findViewById(R.id.fm_line_send_err);
        this.f59150e = button;
        button.setOnClickListener(this);
        View findViewById = viewGroup.findViewById(R.id.fm_line_retry);
        this.f59151f = findViewById;
        findViewById.setOnClickListener(this);
        this.f59152g = viewGroup.findViewById(R.id.retry_progress);
        lq.c.b(this.f59150e, new ThemeResUtil.ShapeDrawableBuilder().with(getActivity()).setStroke(1.0f, R.attr.color_button_oval).setColor(GeneratedTexture.f39227d).setCorner(10).build());
        this.f59147b.setText(this.f59146a.getWord());
        this.f59148c.setText(this.f59146a.getWordType() + ": " + this.f59146a.getCnmean());
        m0.j.m(this.f59146a.getExample()).e(pb.a.a().getResources().getColor(R.color.main_blue)).f(this.f59146a.getWord()).c().l().d().i(this.f59149d);
        return viewGroup;
    }

    @Override // hb.e
    public void setEnabled(boolean enabled) {
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        this.f59150e.setVisibility(enabled ? 0 : 4);
        if (enabled) {
            return;
        }
        this.f59151f.setVisibility(8);
    }

    public void v(boolean retry) {
        this.f59151f.setVisibility(retry ? 0 : 8);
        this.f59152g.setVisibility(8);
    }
}
