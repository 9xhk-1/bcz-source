package va;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.client.business.util.ThemeUtil;
import com.jiongji.andriod.card.R;
import gs.a4;
import gs.c4;
import gs.e4;
import gs.g4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends Dialog {

    /* renamed from: j, reason: collision with root package name */
    public static final String f93691j = "BczDialog";

    /* renamed from: k, reason: collision with root package name */
    public static int f93692k = 10000;

    /* renamed from: l, reason: collision with root package name */
    public static int f93693l = 10000 + 1;

    /* renamed from: m, reason: collision with root package name */
    public static int f93694m = 10000 + 2;

    /* renamed from: a, reason: collision with root package name */
    public boolean f93695a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f93696b;

    /* renamed from: c, reason: collision with root package name */
    public Resources f93697c;

    /* renamed from: d, reason: collision with root package name */
    public a4 f93698d;

    /* renamed from: e, reason: collision with root package name */
    public Object f93699e;

    /* renamed from: f, reason: collision with root package name */
    public DialogInterface.OnClickListener f93700f;

    /* renamed from: g, reason: collision with root package name */
    public Context f93701g;

    /* renamed from: h, reason: collision with root package name */
    public DialogInterface.OnClickListener f93702h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f93703i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: va.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC1259b implements View.OnClickListener {
        public ViewOnClickListenerC1259b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (b.this.f93700f != null) {
                b.this.f93700f.onClick(b.this, v11.getId());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Context f93706a;

        /* renamed from: b, reason: collision with root package name */
        public LayoutInflater f93707b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f93708c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f93709d = null;

        /* renamed from: e, reason: collision with root package name */
        public DialogInterface.OnDismissListener f93710e = null;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f93711f = null;

        /* renamed from: g, reason: collision with root package name */
        public View f93712g = null;

        /* renamed from: h, reason: collision with root package name */
        public LinearLayout.LayoutParams f93713h = null;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence[] f93714i = null;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f93715j = null;

        /* renamed from: k, reason: collision with root package name */
        public int f93716k = 0;

        /* renamed from: l, reason: collision with root package name */
        public boolean f93717l = true;

        /* renamed from: m, reason: collision with root package name */
        public boolean f93718m = false;

        /* renamed from: n, reason: collision with root package name */
        public Map<Integer, CharSequence> f93719n = new HashMap();

        /* renamed from: o, reason: collision with root package name */
        public Map<Integer, DialogInterface.OnClickListener> f93720o = new HashMap();

        /* renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f93721p = new DialogInterfaceOnClickListenerC1260b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements DialogInterface.OnKeyListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                return keyCode == 4 || keyCode == 84;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: va.b$c$b, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC1260b implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC1260b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                DialogInterface.OnClickListener onClickListener;
                DialogInterface.OnClickListener onClickListener2;
                DialogInterface.OnClickListener onClickListener3;
                if (which == b.f93692k) {
                    if (c.this.f93720o.containsKey(-2)) {
                        DialogInterface.OnClickListener onClickListener4 = (DialogInterface.OnClickListener) c.this.f93720o.get(-2);
                        if (onClickListener4 != null) {
                            onClickListener4.onClick(dialog, -2);
                        }
                    } else if (c.this.f93720o.containsKey(-3)) {
                        DialogInterface.OnClickListener onClickListener5 = (DialogInterface.OnClickListener) c.this.f93720o.get(-3);
                        if (onClickListener5 != null) {
                            onClickListener5.onClick(dialog, -3);
                        }
                    } else if (c.this.f93720o.containsKey(-1) && (onClickListener3 = (DialogInterface.OnClickListener) c.this.f93720o.get(-1)) != null) {
                        onClickListener3.onClick(dialog, -1);
                    }
                } else if (which == b.f93693l) {
                    if (c.this.f93720o.containsKey(-3)) {
                        DialogInterface.OnClickListener onClickListener6 = (DialogInterface.OnClickListener) c.this.f93720o.get(-3);
                        if (onClickListener6 != null) {
                            onClickListener6.onClick(dialog, -3);
                        }
                    } else if (c.this.f93720o.containsKey(-1) && (onClickListener2 = (DialogInterface.OnClickListener) c.this.f93720o.get(-1)) != null) {
                        onClickListener2.onClick(dialog, -1);
                    }
                } else if (which == b.f93694m && c.this.f93720o.containsKey(-1) && (onClickListener = (DialogInterface.OnClickListener) c.this.f93720o.get(-1)) != null) {
                    onClickListener.onClick(dialog, -1);
                }
                dialog.dismiss();
            }
        }

        public c(Context context) {
            this.f93706a = null;
            this.f93706a = context;
            this.f93707b = LayoutInflater.from(context);
            this.f93708c = context.getResources();
        }

        public final void b() {
            this.f93714i = null;
            this.f93715j = null;
        }

        public final void c() {
            this.f93719n.clear();
            this.f93720o.clear();
        }

        @SuppressLint({"Override"})
        public b d() {
            b bVar = new b(this.f93706a);
            bVar.k(this.f93709d);
            bVar.setCancelable(this.f93717l);
            bVar.l(this.f93716k);
            if (!this.f93717l) {
                bVar.setOnKeyListener(new a());
            }
            if (this.f93719n.size() > 0) {
                ArrayList arrayList = new ArrayList();
                if (this.f93719n.containsKey(-2)) {
                    arrayList.add(this.f93719n.get(-2));
                }
                if (this.f93719n.containsKey(-3)) {
                    arrayList.add(this.f93719n.get(-3));
                }
                if (this.f93719n.containsKey(-1)) {
                    arrayList.add(this.f93719n.get(-1));
                }
                this.f93714i = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
                this.f93715j = this.f93721p;
            }
            bVar.h(this.f93714i, this.f93715j);
            CharSequence[] charSequenceArr = this.f93714i;
            if (charSequenceArr != null && charSequenceArr.length == 1) {
                TextView textView = (TextView) bVar.findViewById(b.f93692k);
                textView.setBackgroundResource(!this.f93719n.containsKey(-1) ? R.drawable.bcz_dialog_button_common : R.drawable.bcz_dialog_button_positive);
                textView.setTextColor(this.f93719n.containsKey(-1) ? -1 : -14671324);
            }
            bVar.g(this.f93718m);
            View view = this.f93712g;
            if (view == null) {
                bVar.j(this.f93711f);
            } else {
                bVar.i(view, this.f93713h);
            }
            DialogInterface.OnDismissListener onDismissListener = this.f93710e;
            if (onDismissListener != null) {
                bVar.setOnDismissListener(onDismissListener);
            }
            return bVar;
        }

        public c e(boolean isCancellable) {
            if (this.f93718m && isCancellable) {
                throw new RuntimeException("When close button is enabled, dialog cannot be cancellable");
            }
            this.f93717l = isCancellable;
            return this;
        }

        public c f(boolean enabled) {
            this.f93718m = enabled;
            if (this.f93717l && enabled) {
                this.f93717l = false;
            }
            return this;
        }

        public c g(int contentResId, LinearLayout.LayoutParams params) {
            return h(this.f93707b.inflate(contentResId, (ViewGroup) null), params);
        }

        public c h(View content, LinearLayout.LayoutParams params) {
            this.f93711f = null;
            this.f93712g = content;
            this.f93713h = params;
            return this;
        }

        public c i(int[] buttonsTextResIds, DialogInterface.OnClickListener listener) {
            int length = buttonsTextResIds.length;
            String[] strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                strArr[i11] = this.f93708c.getString(buttonsTextResIds[i11]);
            }
            return j(strArr, listener);
        }

        public c j(CharSequence[] buttonsText, DialogInterface.OnClickListener listener) {
            c();
            this.f93714i = buttonsText;
            this.f93715j = listener;
            return this;
        }

        public c k(int messageTextResId) {
            return l(this.f93708c.getString(messageTextResId));
        }

        public c l(CharSequence messageText) {
            this.f93712g = null;
            this.f93711f = messageText;
            return this;
        }

        public c m(int textId, final DialogInterface.OnClickListener listener) {
            n(this.f93708c.getText(textId), listener);
            return this;
        }

        public c n(CharSequence text, final DialogInterface.OnClickListener listener) {
            b();
            this.f93719n.put(-2, text);
            this.f93720o.put(-2, listener);
            return this;
        }

        public c o(int textId, final DialogInterface.OnClickListener listener) {
            p(this.f93708c.getText(textId), listener);
            return this;
        }

        public c p(CharSequence text, final DialogInterface.OnClickListener listener) {
            b();
            this.f93719n.put(-3, text);
            this.f93720o.put(-3, listener);
            return this;
        }

        public c q(DialogInterface.OnDismissListener listener) {
            this.f93710e = listener;
            return this;
        }

        public c r(int textId, final DialogInterface.OnClickListener listener) {
            s(this.f93708c.getText(textId), listener);
            return this;
        }

        public c s(CharSequence text, final DialogInterface.OnClickListener listener) {
            b();
            this.f93719n.put(-1, text);
            this.f93720o.put(-1, listener);
            return this;
        }

        public c t(int titleTextResId) {
            return u(this.f93708c.getString(titleTextResId));
        }

        public c u(CharSequence titleText) {
            this.f93709d = titleText;
            return this;
        }

        public c v(int src) {
            this.f93716k = src;
            return this;
        }

        public void w() {
            d().show();
        }
    }

    public b(Context context) {
        super(context, R.style.bczDialogStyle);
        this.f93695a = false;
        this.f93699e = null;
        this.f93700f = null;
        this.f93702h = new a();
        this.f93703i = new ViewOnClickListenerC1259b();
        Context ensureThemeContext = ThemeUtil.ensureThemeContext(context);
        this.f93701g = ensureThemeContext;
        this.f93696b = LayoutInflater.from(ensureThemeContext);
        this.f93697c = ensureThemeContext.getResources();
        a4 a4Var = (a4) DataBindingUtil.inflate(this.f93696b, R.layout.bcz_dialog_base, null, false);
        this.f93698d = a4Var;
        ViewGroup.LayoutParams layoutParams = a4Var.f54130g.getLayoutParams();
        int i11 = xb.f.i(ensureThemeContext) - xb.f.a(ensureThemeContext, 72.0f);
        layoutParams.width = i11;
        layoutParams.height = (i11 * 9) / 16;
        this.f93698d.f54130g.setLayoutParams(layoutParams);
        super.setContentView(this.f93698d.getRoot());
    }

    public Context c() {
        return this.f93701g;
    }

    public Object d() {
        return this.f93699e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
            this.f93695a = false;
        } catch (Throwable th2) {
            qb.c.c(f93691j, "", th2);
        }
    }

    public boolean e() {
        return this.f93695a;
    }

    public final /* synthetic */ void f(View view) {
        dismiss();
    }

    public void g(boolean enabled) {
        this.f93698d.f54127d.setVisibility(enabled ? 0 : 8);
        if (enabled) {
            this.f93698d.f54127d.setOnClickListener(new View.OnClickListener() { // from class: va.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.f(view);
                }
            });
        }
    }

    public void h(CharSequence[] buttonsText, DialogInterface.OnClickListener listener) {
        View root;
        if (buttonsText == null) {
            this.f93698d.f54126c.removeAllViews();
            return;
        }
        int length = buttonsText.length;
        this.f93700f = listener;
        if (length == 1) {
            e4 d11 = e4.d(this.f93696b);
            f93692k = R.id.button_single;
            d11.f54728a.setId(R.id.button_single);
            d11.f54728a.setOnClickListener(this.f93703i);
            d11.f54728a.setText(buttonsText[0]);
            root = d11.getRoot();
        } else if (length == 2) {
            c4 d12 = c4.d(this.f93696b);
            d12.f54379a.setOnClickListener(this.f93703i);
            f93692k = R.id.bottom_left;
            f93693l = R.id.bottom_right;
            d12.f54379a.setId(R.id.bottom_left);
            d12.f54379a.setText(buttonsText[0]);
            d12.f54380b.setOnClickListener(this.f93703i);
            d12.f54380b.setId(f93693l);
            d12.f54380b.setText(buttonsText[1]);
            root = d12.getRoot();
        } else if (length != 3) {
            root = null;
        } else {
            g4 d13 = g4.d(this.f93696b);
            f93692k = R.id.bottom_bottom;
            f93693l = R.id.bottom_middle;
            f93694m = R.id.bottom_top;
            d13.f54989c.setOnClickListener(this.f93703i);
            d13.f54989c.setId(f93694m);
            d13.f54989c.setText(buttonsText[2]);
            d13.f54988b.setOnClickListener(this.f93703i);
            d13.f54988b.setId(f93693l);
            d13.f54988b.setText(buttonsText[1]);
            d13.f54987a.setOnClickListener(this.f93703i);
            d13.f54987a.setId(f93692k);
            d13.f54987a.setText(buttonsText[0]);
            root = d13.getRoot();
        }
        this.f93698d.f54126c.removeAllViews();
        if (root != null) {
            this.f93698d.f54126c.addView(root);
        }
    }

    public void i(View view, LinearLayout.LayoutParams params) {
        if (view != null) {
            this.f93698d.f54124a.removeAllViews();
            if (params != null) {
                this.f93698d.f54124a.addView(view, new LinearLayout.LayoutParams(-1, -2));
            } else {
                this.f93698d.f54124a.addView(view);
            }
        }
    }

    public void j(CharSequence msg) {
        if (!TextUtils.isEmpty(msg)) {
            View findViewById = this.f93698d.f54124a.findViewById(R.id.bcz_dialog_messageText);
            if (findViewById == null) {
                findViewById = this.f93696b.inflate(R.layout.bcz_dialog_message, (ViewGroup) null);
                i(findViewById, null);
            }
            ((TextView) findViewById).setText(msg);
            findViewById.setVisibility(0);
            return;
        }
        View findViewById2 = this.f93698d.f54124a.findViewById(R.id.bcz_dialog_messageText);
        int a11 = xb.f.a(getContext(), 8.0f);
        this.f93698d.f54124a.setPadding(0, xb.f.a(getContext(), 16.0f), 0, a11);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }

    public void k(CharSequence charseq) {
        if (TextUtils.isEmpty(charseq)) {
            int a11 = xb.f.a(getContext(), 32.0f);
            this.f93698d.f54124a.setPadding(0, xb.f.a(getContext(), 32.0f), 0, a11);
            this.f93698d.f54129f.setVisibility(8);
            this.f93698d.f54125b.setText("");
            return;
        }
        this.f93698d.f54125b.setText(charseq);
        this.f93698d.f54129f.setVisibility(0);
        int a12 = xb.f.a(getContext(), 32.0f);
        this.f93698d.f54124a.setPadding(0, xb.f.a(getContext(), 16.0f), 0, a12);
    }

    public void l(int src) {
        if (src == 0) {
            this.f93698d.f54130g.setVisibility(8);
            this.f93698d.f54128e.setVisibility(0);
        } else {
            this.f93698d.f54130g.setVisibility(0);
            this.f93698d.f54128e.setVisibility(8);
            this.f93698d.f54130g.setImageDrawable(this.f93697c.getDrawable(src));
        }
    }

    public void m(boolean enabled) {
        View findViewById = this.f93698d.f54126c.findViewById(f93692k);
        if (findViewById != null) {
            findViewById.setEnabled(enabled);
        }
    }

    public void n(CharSequence charseq) {
        h(new CharSequence[]{charseq}, this.f93702h);
    }

    public void o(Object mTag) {
        this.f93699e = mTag;
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
        try {
            super.show();
            this.f93695a = true;
        } catch (WindowManager.BadTokenException e11) {
            qb.c.c(f93691j, "", e11);
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
