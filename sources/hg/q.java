package hg;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.baicizhan.main.activity.EverydayNoticeSettingActivity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class q extends DialogFragment implements View.OnClickListener {
    public static q t(@NonNull FragmentManager manager, String tag) {
        q qVar = new q();
        qVar.setCancelable(false);
        qVar.show(manager, tag);
        return qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.cancel) {
            dismiss();
        } else if (id2 == R.id.ok) {
            EverydayNoticeSettingActivity.U0(getActivity());
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.remind_study_dialog, container);
        inflate.findViewById(R.id.cancel).setOnClickListener(this);
        inflate.findViewById(R.id.ok).setOnClickListener(this);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        ia.a.i(ia.a.f60471v, false);
    }
}
