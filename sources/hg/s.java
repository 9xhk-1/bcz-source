package hg;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s extends DialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f59307d = "title";

    /* renamed from: e, reason: collision with root package name */
    public static final String f59308e = "content";

    /* renamed from: a, reason: collision with root package name */
    public String f59309a;

    /* renamed from: b, reason: collision with root package name */
    public String f59310b;

    /* renamed from: c, reason: collision with root package name */
    public DialogInterface.OnDismissListener f59311c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            s.this.dismiss();
        }
    }

    public static s t(@NonNull FragmentManager manager, String title, String content, String tag) {
        s sVar = new s();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("content", content);
        sVar.setArguments(bundle);
        sVar.setCancelable(false);
        sVar.show(manager, tag);
        return sVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, 0);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        if (savedInstanceState == null) {
            throw new IllegalArgumentException("server fatal error dialog has no title and content arguments.");
        }
        this.f59309a = savedInstanceState.getString("title");
        this.f59310b = savedInstanceState.getString("content");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.server_fatal_error_dialog, container);
        inflate.findViewById(R.id.i_know).setOnClickListener(new a());
        ((TextView) inflate.findViewById(R.id.title)).setText(this.f59309a);
        ((TextView) inflate.findViewById(R.id.content)).setText(this.f59310b);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.f59311c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
            this.f59311c = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("title", this.f59309a);
        outState.putString("content", this.f59310b);
    }

    public void v(DialogInterface.OnDismissListener listener) {
        this.f59311c = listener;
    }
}
