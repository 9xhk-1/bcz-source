package va;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baicizhan.client.business.util.ThemeUtil;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f extends Dialog {

    /* renamed from: e, reason: collision with root package name */
    public static final String f93752e = "BczLoadingDialog";

    /* renamed from: a, reason: collision with root package name */
    public Context f93753a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f93754b;

    /* renamed from: c, reason: collision with root package name */
    public View f93755c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f93756d;

    public f(Context context) {
        super(context, R.style.bczDialogStyle);
        Context ensureThemeContext = ThemeUtil.ensureThemeContext(context);
        this.f93753a = ensureThemeContext;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ensureThemeContext).inflate(R.layout.bcz_loading_dialog, (ViewGroup) null);
        this.f93754b = relativeLayout;
        this.f93755c = relativeLayout.findViewById(R.id.progress);
        this.f93756d = (TextView) this.f93754b.findViewById(R.id.bcz_dialog_messageText);
        super.setContentView(this.f93754b);
    }

    public static f g(Context context, CharSequence message) {
        return i(context, message, false, null);
    }

    public static f h(Context context, CharSequence message, boolean cancelable) {
        return i(context, message, cancelable, null);
    }

    public static f i(Context context, CharSequence message, boolean cancelable, DialogInterface.OnCancelListener cancelListener) {
        f fVar = new f(context);
        fVar.f(message);
        fVar.setCancelable(cancelable);
        fVar.setOnCancelListener(cancelListener);
        fVar.show();
        return fVar;
    }

    public Context b() {
        return this.f93753a;
    }

    public int c(final CharSequence text) {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f93756d.getTextSize());
        return (int) StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, xb.f.i(getContext())).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().getLineWidth(0);
    }

    public void d() {
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e11) {
            qb.c.c(f93752e, "", e11);
        }
    }

    public void e(int msgResId) {
        f(this.f93753a.getText(msgResId));
    }

    public void f(CharSequence msg) {
        if (msg == null) {
            this.f93756d.setText("");
            return;
        }
        this.f93756d.setText(msg);
        float i11 = xb.f.i(getContext()) - xb.f.a(getContext(), 80.0f);
        if (c(msg) > i11) {
            this.f93754b.getLayoutParams().width = (int) i11;
            this.f93754b.requestLayout();
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view) {
        throw new UnsupportedOperationException("this method is not support");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setTitle(int resId) {
        throw new UnsupportedOperationException("this method is not support");
    }

    @Override // android.app.Dialog
    public void show() {
        if (TextUtils.isEmpty(this.f93756d.getText().toString())) {
            this.f93756d.setVisibility(8);
        } else {
            this.f93756d.setVisibility(0);
        }
        try {
            super.show();
        } catch (Exception e11) {
            qb.c.c(f93752e, "", e11);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int layoutResID) {
        throw new UnsupportedOperationException("this method is not support");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setTitle(CharSequence title) {
        throw new UnsupportedOperationException("this method is not support");
    }
}
