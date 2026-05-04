package nd;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.jiongji.andriod.card.R;
import gs.l5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f75054a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Dialog f75055b;

        public a(final View.OnClickListener val$onClickListener, final Dialog val$dialog) {
            this.f75054a = val$onClickListener;
            this.f75055b = val$dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            this.f75054a.onClick(v11);
            this.f75055b.dismiss();
        }
    }

    public static Dialog b(Context context, final View.OnClickListener onClickListener) {
        Dialog dialog = new Dialog(context, R.style.bczDialogStyle);
        l5 d11 = l5.d(LayoutInflater.from(context));
        if (onClickListener != null) {
            d11.f55714b.setOnClickListener(new a(onClickListener, dialog));
            d11.f55713a.setOnClickListener(new View.OnClickListener() { // from class: nd.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a(view);
                }
            });
        }
        dialog.setContentView(d11.getRoot());
        return dialog;
    }

    public static /* synthetic */ void a(View view) {
    }
}
