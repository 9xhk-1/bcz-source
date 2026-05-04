package hd;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.jiongji.andriod.card.R;
import gs.w3;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import w00.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d extends DialogFragment implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f59178b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f59179c = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f59180d = "cid";

    /* renamed from: a, reason: collision with root package name */
    @l
    public w3 f59181a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        @k
        public final d a(long j11) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putLong("cid", j11);
            dVar.setArguments(bundle);
            return dVar;
        }

        public a() {
        }
    }

    @o
    @k
    public static final d t(long j11) {
        return f59178b.a(j11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@k View v11) {
        Integer num;
        g0.p(v11, "v");
        switch (v11.getId()) {
            case R.id.bad /* 2131361960 */:
                num = 2;
                break;
            case R.id.easy /* 2131362426 */:
                num = 1;
                break;
            case R.id.hard /* 2131362658 */:
                num = 0;
                break;
            case R.id.not_ready /* 2131363119 */:
                num = 3;
                break;
            case R.id.other /* 2131363164 */:
                num = 4;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            int intValue = num.intValue();
            Bundle arguments = getArguments();
            if (arguments != null) {
                long longValue = Long.valueOf(arguments.getLong("cid")).longValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("index", String.valueOf(intValue));
                linkedHashMap.put("chapter_id", String.valueOf(longValue));
                g2 g2Var = g2.f100423a;
                ma.l.e(t.f73027z, ma.a.X2, linkedHashMap);
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        setCancelable(false);
        w3 d11 = w3.d(inflater);
        this.f59181a = d11;
        d11.f57265b.setOnClickListener(this);
        d11.f57264a.setOnClickListener(this);
        d11.f57266c.setOnClickListener(this);
        d11.f57269f.setOnClickListener(this);
        d11.f57267d.setOnClickListener(this);
        d11.f57271h.setOnClickListener(this);
        View root = d11.getRoot();
        g0.o(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@k DialogInterface dialog) {
        g0.p(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        WindowManager.LayoutParams attributes = (dialog == null || (window3 = dialog.getWindow()) == null) ? null : window3.getAttributes();
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        if (attributes != null) {
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
            attributes.windowAnimations = R.style.bottomDialogAnimation;
            layoutParams = attributes;
        }
        window.setAttributes(layoutParams);
    }
}
