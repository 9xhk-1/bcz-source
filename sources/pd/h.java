package pd;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.jiongji.andriod.card.R;
import gs.od;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f80364a = "UserHintUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final String f80365b = "key_has_show_first_image_daka";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f80366a;

        public a(final Context val$context) {
            this.f80366a = val$context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            i9.f.j(this.f80366a, h.f80365b, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f80367a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Dialog f80368b;

        public b(final View.OnClickListener val$onClickListener, final Dialog val$dialog) {
            this.f80367a = val$onClickListener;
            this.f80368b = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            this.f80367a.onClick(v11);
            this.f80368b.dismiss();
        }
    }

    public static Dialog a(Context context, final View.OnClickListener onClickListener) {
        Dialog dialog = new Dialog(context, R.style.bczDialogStyle);
        od d11 = od.d(LayoutInflater.from(context));
        if (onClickListener != null) {
            d11.f56214a.setOnClickListener(new b(onClickListener, dialog));
        }
        dialog.setContentView(d11.getRoot());
        return dialog;
    }

    public static void b(final Context context) {
        if (i9.f.c(context, f80365b)) {
            return;
        }
        Dialog a11 = a(context, new a(context));
        a11.setCancelable(false);
        a11.show();
    }
}
