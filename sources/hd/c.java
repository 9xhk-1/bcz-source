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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.jiongji.andriod.card.R;
import gd.m;
import gi.h0;
import gs.s3;
import gs.u3;
import id.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import qb0.h;
import w00.o;
import xb.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nQuestionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionDialog.kt\ncom/baicizhan/main/activity/aiclass/common/QuestionDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1878#2,3:191\n1869#2,2:194\n1869#2,2:197\n1#3:196\n*S KotlinDebug\n*F\n+ 1 QuestionDialog.kt\ncom/baicizhan/main/activity/aiclass/common/QuestionDialog\n*L\n58#1:191,3\n102#1:194,2\n138#1:197,2\n*E\n"})
/* loaded from: classes4.dex */
public final class c extends DialogFragment implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f59166e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f59167f = 8;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f59168g = "QuestionDialog";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f59169h = "qid";

    /* renamed from: i, reason: collision with root package name */
    public static final int f59170i = 2131361906;

    /* renamed from: j, reason: collision with root package name */
    public static final int f59171j = 2131361908;

    /* renamed from: k, reason: collision with root package name */
    public static final long f59172k = 2000;

    /* renamed from: l, reason: collision with root package name */
    public static final long f59173l = 2000;

    /* renamed from: a, reason: collision with root package name */
    @l
    public s3 f59174a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public List<u3> f59175b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @l
    public gd.l f59176c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public h f59177d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        @k
        public final c a(long j11) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putLong(c.f59169h, j11);
            cVar.setArguments(bundle);
            return cVar;
        }

        public a() {
        }
    }

    private final void A() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            gd.l lVar = (gd.l) new ViewModelProvider(activity, new m(activity)).get(gd.l.class);
            this.f59176c = lVar;
            if (lVar != null) {
                lVar.K();
            }
        }
        setCancelable(false);
        h0.a().d(getContext(), R.raw.chop, R.raw.answer_right, R.raw.answer_error);
    }

    public static final g2 x(c cVar, Long l11) {
        cVar.dismiss();
        return g2.f100423a;
    }

    public static final void y(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    @o
    @k
    public static final c z(long j11) {
        return f59166e.a(j11);
    }

    public final void B(s3 s3Var, LayoutInflater layoutInflater) {
        MutableLiveData<q> A;
        q value;
        this.f59174a = s3Var;
        gd.l lVar = this.f59176c;
        if (lVar != null && (A = lVar.A()) != null && (value = A.getValue()) != null) {
            Bundle arguments = getArguments();
            if (arguments == null || value.h() != arguments.getLong(f59169h, 0L)) {
                value = null;
            }
            if (value != null) {
                int i11 = 0;
                for (Object obj : value.i().e()) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        a00.h0.b0();
                    }
                    LinearLayout linearLayout = s3Var.f56702a;
                    u3 d11 = u3.d(layoutInflater);
                    d11.f56951a.setText((String) obj);
                    d11.f56952b.setOnClickListener(this);
                    d11.f56952b.setTag(R.id.ai_choose_idx, Integer.valueOf(i11));
                    d11.f56952b.setTag(R.id.ai_right_idx, Integer.valueOf(value.i().f()));
                    View root = d11.getRoot();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                    layoutParams.weight = 1.0f;
                    root.setLayoutParams(layoutParams);
                    List<u3> list = this.f59175b;
                    g0.m(d11);
                    list.add(d11);
                    linearLayout.addView(d11.getRoot());
                    i11 = i12;
                }
                E(s3Var);
                return;
            }
        }
        dismiss();
    }

    public final void C() {
        for (u3 u3Var : this.f59175b) {
            u3Var.f56953c.setVisibility(4);
            u3Var.f56952b.setVisibility(0);
            u3Var.f56952b.setEnabled(true);
        }
    }

    public final void D(long j11, int i11, int i12) {
        MutableLiveData<q> A;
        q value;
        gd.l lVar = this.f59176c;
        if (lVar == null || (A = lVar.A()) == null || (value = A.getValue()) == null) {
            return;
        }
        if (value.h() != j11) {
            value = null;
        }
        if (value != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ma.b.N, String.valueOf(j11));
            linkedHashMap.put(ma.b.O, String.valueOf(i11));
            linkedHashMap.put(ma.b.P, String.valueOf(i11 == i12));
            linkedHashMap.put("chapter_id", String.valueOf(value.g()));
            linkedHashMap.put(ma.b.Q, String.valueOf(value.j()));
            g2 g2Var = g2.f100423a;
            ma.l.e(t.f73027z, ma.a.Y2, linkedHashMap);
        }
    }

    public final void E(s3 s3Var) {
        int i11 = f.i(getContext());
        int f11 = f.f(getContext());
        s3Var.getRoot().measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(f11, 1073741824));
        s3Var.getRoot().layout(0, 0, i11, f11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l View view) {
        C();
        if (view != null) {
            view.setEnabled(false);
        }
        for (u3 u3Var : this.f59175b) {
            if (!u3Var.f56952b.isEnabled()) {
                boolean g11 = g0.g(u3Var.f56952b.getTag(R.id.ai_choose_idx), u3Var.f56952b.getTag(R.id.ai_right_idx));
                ImageView imageView = u3Var.f56953c;
                imageView.setImageResource(g11 ? R.drawable.ic_ai_class_option_right : R.drawable.ic_ai_class_option_wrong);
                imageView.setVisibility(0);
                u3Var.f56952b.setVisibility(4);
                w(g11);
                Bundle arguments = getArguments();
                if (arguments != null) {
                    Long valueOf = Long.valueOf(arguments.getLong(f59169h, 0L));
                    if (valueOf.longValue() == 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        Object tag = u3Var.f56952b.getTag(R.id.ai_choose_idx);
                        g0.n(tag, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) tag).intValue();
                        Object tag2 = u3Var.f56952b.getTag(R.id.ai_right_idx);
                        g0.n(tag2, "null cannot be cast to non-null type kotlin.Int");
                        D(longValue, intValue, ((Integer) tag2).intValue());
                    }
                }
            }
            u3Var.f56952b.setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        A();
        s3 d11 = s3.d(inflater);
        g0.m(d11);
        B(d11, inflater);
        View root = d11.getRoot();
        g0.o(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@k DialogInterface dialog) {
        g0.p(dialog, "dialog");
        super.onDismiss(dialog);
        gd.l lVar = this.f59176c;
        if (lVar != null) {
            lVar.M();
        }
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

    public final void w(boolean z11) {
        h hVar = this.f59177d;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        h0.a().b(getContext(), z11 ? R.raw.answer_right : R.raw.answer_error);
        rx.c<Long> I3 = rx.c.o6(2000L, TimeUnit.MILLISECONDS).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: hd.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = c.x(c.this, (Long) obj);
                return x11;
            }
        };
        this.f59177d = I3.t5(new wb0.b() { // from class: hd.b
            @Override // wb0.b
            public final void call(Object obj) {
                c.y(x00.l.this, obj);
            }
        });
    }
}
