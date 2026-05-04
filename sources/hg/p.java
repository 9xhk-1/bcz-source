package hg;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class p extends DialogFragment implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public a f59305a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();

        void b();
    }

    public static p w(@NonNull FragmentManager manager, String tag) {
        p pVar = new p();
        pVar.setCancelable(false);
        pVar.show(manager, tag);
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f59305a = (a) activity;
        } catch (ClassCastException unused) {
            qb.c.d("", "PraiseSelectDialogFragment's activity does not implement OnPraiseSelectInteractionListener...", new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.give_criticism /* 2131362619 */:
                t();
                break;
            case R.id.give_praise /* 2131362620 */:
                v();
                break;
            case R.id.refuse /* 2131363442 */:
                x();
                break;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.praise_select_dialog, container);
        inflate.findViewById(R.id.give_praise).setOnClickListener(this);
        inflate.findViewById(R.id.give_criticism).setOnClickListener(this);
        inflate.findViewById(R.id.refuse).setOnClickListener(this);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        gi.v.a(8192);
    }

    public final void t() {
        a aVar = this.f59305a;
        if (aVar != null) {
            aVar.b();
        }
        dismiss();
    }

    public final void v() {
        a aVar = this.f59305a;
        if (aVar != null) {
            aVar.a();
        }
        dismiss();
    }

    public final void x() {
        dismiss();
    }
}
