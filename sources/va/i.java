package va;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.baicizhan.client.business.util.SystemUtil;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends DialogFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final String f93757e = "title";

    /* renamed from: a, reason: collision with root package name */
    public String f93758a;

    /* renamed from: b, reason: collision with root package name */
    public EditText f93759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f93760c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f93761d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextView.OnEditorActionListener {
        public a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v11, int actionId, KeyEvent event) {
            if (actionId != 4) {
                return true;
            }
            String obj = i.this.f93759b.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                return true;
            }
            if (i.this.f93761d != null) {
                i.this.f93761d.Y(obj);
            }
            SystemUtil.hideIME(i.this.f93759b);
            i.this.dismiss();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f93759b.requestFocus();
                SystemUtil.showIME(i.this.f93759b);
                i.this.f93760c = true;
            }
        }

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (i.this.f93760c) {
                return true;
            }
            i.this.f93759b.post(new a());
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (i.this.f93761d != null) {
                i.this.f93761d.Y(i.this.f93759b.getText().toString());
            }
            SystemUtil.hideIME(i.this.f93759b);
            i.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            SystemUtil.hideIME(i.this.f93759b);
            i.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void Y(String comment);

        void c0();
    }

    public static i y(String title) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        iVar.setArguments(bundle);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f93761d = (e) activity;
        } catch (ClassCastException unused) {
            qb.c.d("", "comment fragment parent activity does not implement OnCommentSendListener [%s]", activity.getClass().getName());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.bczDialogStyle);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        this.f93758a = savedInstanceState.getString("title");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.comment_fragment_dialog, container);
        EditText editText = (EditText) inflate.findViewById(R.id.edit);
        this.f93759b = editText;
        editText.setOnEditorActionListener(new a());
        this.f93759b.getViewTreeObserver().addOnPreDrawListener(new b());
        ((TextView) inflate.findViewById(R.id.title)).setText(this.f93758a);
        inflate.findViewById(R.id.submit).setOnClickListener(new c());
        inflate.findViewById(R.id.cancel).setOnClickListener(new d());
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
            return inflate;
        }
        setCancelable(false);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        e eVar = this.f93761d;
        if (eVar != null) {
            eVar.c0();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("title", this.f93758a);
    }
}
