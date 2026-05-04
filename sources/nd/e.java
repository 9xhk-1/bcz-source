package nd;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.client.business.util.animation.EasingType;
import com.baicizhan.client.business.util.animation.ElasticInterpolator;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.jiongji.andriod.card.R;
import gs.t9;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends com.baicizhan.client.business.widget.a implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: e, reason: collision with root package name */
    public View f75061e;

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        x();
        this.f17281a.f(getView());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.close) {
            dismiss();
        } else {
            if (id2 != R.id.red_packet_button) {
                return;
            }
            BczWebHelperKt.startExchangeCenter(getActivity(), null);
            dismiss();
        }
    }

    @Override // com.baicizhan.client.business.widget.a, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        t9 t9Var = (t9) DataBindingUtil.inflate(inflater, R.layout.fragment_new_year_coin, container, false);
        t9Var.f56862e.setOnClickListener(this);
        t9Var.f56858a.setOnClickListener(this);
        this.f75061e = t9Var.f56859b;
        y(t9Var.f56863f);
        this.f17281a.d(t9Var.f56860c);
        this.f17281a.e(t9Var.getRoot());
        t9Var.f56860c.setOnTouchListener(this);
        v(false);
        setCancelable(false);
        z();
        return t9Var.getRoot();
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

    public final void x() {
        this.f75061e.setPivotX(f.i(getActivity()) / 2);
        this.f75061e.setPivotY(f.f(getActivity()) / 2);
        this.f75061e.setTranslationY(0.0f);
        this.f75061e.animate().translationY(f.f(getActivity())).setInterpolator(new AccelerateInterpolator(3.0f)).setDuration(300L).setStartDelay(0L).start();
    }

    public final void y(TextView textView) {
        SpannableString spannableString = new SpannableString(getString(R.string.newyear_egg_content));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffdb4f")), 22, 26, 33);
        textView.setText(spannableString);
    }

    public final void z() {
        this.f75061e.setPivotX(f.i(getActivity()) / 2);
        this.f75061e.setPivotY(f.f(getActivity()) / 2);
        this.f75061e.setTranslationY(-f.f(getActivity()));
        this.f75061e.animate().translationY(0.0f).setInterpolator(new ElasticInterpolator(EasingType.Type.OUT, 0.0f, 0.65f)).setDuration(400L).setStartDelay(400L).start();
    }
}
