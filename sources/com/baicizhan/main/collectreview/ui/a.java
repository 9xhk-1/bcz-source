package com.baicizhan.main.collectreview.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.fragment.app.DialogFragment;
import com.jiongji.andriod.card.R;
import qb.c;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends DialogFragment implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final String f19992d = "load_text";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19993e = "load_enabled";

    /* renamed from: a, reason: collision with root package name */
    public String f19994a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19995b = false;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0301a f19996c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.collectreview.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0301a {
        void N(@IdRes int id2);
    }

    public static a t(String loadText, boolean loadEnabled) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString(f19992d, loadText);
        bundle.putBoolean(f19993e, loadEnabled);
        aVar.setArguments(bundle);
        aVar.setCancelable(false);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f19996c = (InterfaceC0301a) activity;
        } catch (ClassCastException unused) {
            c.d("", "AssetLoadDialogFragment's activity does not implement OnAssetLoadInteractionListener...", new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        InterfaceC0301a interfaceC0301a = this.f19996c;
        if (interfaceC0301a != null) {
            interfaceC0301a.N(v11.getId());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.BczThemeNoFrameDialog);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f19994a = arguments.getString(f19992d);
            this.f19995b = arguments.getBoolean(f19993e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.asset_load_dialog, container);
        TextView textView = (TextView) inflate.findViewById(R.id.cancel_loading);
        textView.setOnClickListener(this);
        textView.setText(this.f19994a);
        textView.setEnabled(this.f19995b);
        inflate.findViewById(R.id.loading_progress).setVisibility(this.f19995b ? 4 : 0);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(f.i(getActivity()), -1);
    }
}
