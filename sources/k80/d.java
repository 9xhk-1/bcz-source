package k80;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f66026a;

    /* renamed from: b, reason: collision with root package name */
    public static Class<?> f66027b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(11)
    public static class a extends DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            d.b(dialogInterface, i11, getActivity(), getArguments());
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return d.a(getActivity(), getArguments(), this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends androidx.fragment.app.DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            d.b(dialogInterface, i11, getActivity(), getArguments());
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return d.a(getActivity(), getArguments(), this);
        }
    }

    public static Dialog a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(bundle.getString(e.f66031d));
        builder.setMessage(bundle.getString(e.f66032e));
        int i11 = f66026a;
        if (i11 != 0) {
            builder.setIcon(i11);
        }
        builder.setPositiveButton(R.string.ok, onClickListener);
        return builder.create();
    }

    public static void b(DialogInterface dialogInterface, int i11, Activity activity, Bundle bundle) {
        Class<?> cls = f66027b;
        if (cls != null) {
            try {
                e.f66028a.f66025a.c().q(cls.newInstance());
            } catch (Exception e11) {
                throw new RuntimeException("Event cannot be constructed", e11);
            }
        }
        if (!bundle.getBoolean(e.f66033f, false) || activity == null) {
            return;
        }
        activity.finish();
    }
}
