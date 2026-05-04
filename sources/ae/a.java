package ae;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.jiongji.andriod.card.R;
import qb.c;
import va.g;
import xb.f;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends com.baicizhan.client.business.widget.a implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public static final int f2626h = 200;

    /* renamed from: i, reason: collision with root package name */
    public static final String f2627i = "init_content";

    /* renamed from: e, reason: collision with root package name */
    public EditText f2628e;

    /* renamed from: f, reason: collision with root package name */
    public String f2629f;

    /* renamed from: g, reason: collision with root package name */
    public b f2630g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ae.a$a, reason: collision with other inner class name */
    public class RunnableC0018a implements Runnable {
        public RunnableC0018a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f2628e.requestFocus();
            SystemUtil.showIME(a.this.f2628e);
            Editable text = a.this.f2628e.getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            a.this.f2628e.setSelection(text.length());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(String content);
    }

    public static Drawable y(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-460550);
        gradientDrawable.setStroke(1, -3881788);
        gradientDrawable.setCornerRadius(f.a(context, 4.0f));
        return gradientDrawable;
    }

    public static a z(String initContent) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString(f2627i, initContent);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        SystemUtil.hideIME(this.f2628e);
        this.f17281a.f(getView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f2630g = (b) activity;
        } catch (ClassCastException unused) {
            c.d("", "OtherErrorInputFragment's activity does not implement OnOtherErrorInputInteractionListener...", new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.ok) {
            String obj = this.f2628e.getText() != null ? this.f2628e.getText().toString() : null;
            if (obj != null && obj.length() > 200) {
                g.g(R.string.error_fb_others_overflow, 0);
                return;
            }
            b bVar = this.f2630g;
            if (bVar != null) {
                bVar.a(obj);
            }
            dismiss();
        }
    }

    @Override // com.baicizhan.client.business.widget.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f2629f = getArguments() != null ? getArguments().getString(f2627i) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_other_error_feedback, container);
        EditText editText = (EditText) inflate.findViewById(R.id.edit);
        this.f2628e = editText;
        lq.c.b(editText, y(getActivity()));
        this.f2628e.setText(this.f2629f);
        this.f2628e.setHint(getString(R.string.error_fb_others, 200));
        this.f2628e.post(new RunnableC0018a());
        Button button = (Button) inflate.findViewById(R.id.ok);
        button.setOnClickListener(this);
        lq.c.b(button, ThemeResUtil.getCorneredRectShape(-11889946, i.a(getActivity(), 4.0f)));
        View findViewById = inflate.findViewById(R.id.mask);
        this.f17281a.d(findViewById);
        this.f17281a.e(inflate);
        findViewById.setOnTouchListener(this);
        return inflate;
    }

    @Override // com.baicizhan.client.business.widget.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f17281a.g();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v11, MotionEvent event) {
        dismiss();
        return false;
    }
}
