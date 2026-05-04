package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class NavItemSelectedListener implements AdapterView.OnItemSelectedListener {
    private final ActionBar.OnNavigationListener mListener;

    public NavItemSelectedListener(ActionBar.OnNavigationListener onNavigationListener) {
        this.mListener = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
        ActionBar.OnNavigationListener onNavigationListener = this.mListener;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i11, j11);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
