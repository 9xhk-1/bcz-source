package kc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import coil.request.ImageRequest;
import com.baicizhan.framework.common.magicdialog.Location;
import com.baicizhan.framework.common.magicdialog.R;
import com.baicizhan.framework.common.magicdialog.State;
import kc.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import u30.k0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o extends kc.e {

    @m80.k
    public static final b J = new b(null);

    @m80.k
    public static final String K = "layout";

    @m80.k
    public static final String L = "hint";

    @m80.k
    public static final String M = "text";

    @m80.k
    public static final String N = "clear";

    @m80.k
    public static final String O = "auto_ime";

    @m80.k
    public static final String P = "max_input";
    public final int B = R.style.MagicDefault_Edit;
    public final int C = R.attr.magicEditAppearance;
    public int D = R.layout.fragment_dialog_edit;

    @m80.k
    public final c0 E = e0.c(new e());

    @m80.k
    public final c0 F = e0.c(new d());
    public EditText G;

    @m80.l
    public TextView H;

    @m80.l
    public c I;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e.a<a, o> {

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public c f66431g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kc.o$a$a, reason: collision with other inner class name */
        public static final class C0769a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<String, g2> f66432a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0769a(x00.l<? super String, g2> lVar) {
                this.f66432a = lVar;
            }

            @Override // kc.o.c
            public void a(@m80.k String text) {
                g0.p(text, "text");
                this.f66432a.invoke(text);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        @m80.k
        public final a N(@DrawableRes int i11) {
            h().putParcelable(o.N, Uri.parse("android.resource://" + ((Object) i().getResources().getResourcePackageName(i11)) + '/' + ((Object) i().getResources().getResourceTypeName(i11)) + '/' + ((Object) i().getResources().getResourceEntryName(i11))));
            return this;
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public o g() {
            o oVar = new o();
            oVar.q0(this.f66431g);
            return oVar;
        }

        @m80.k
        public final a P(@m80.k c listener) {
            g0.p(listener, "listener");
            this.f66431g = listener;
            return this;
        }

        @m80.k
        public final a Q(@m80.k x00.l<? super String, g2> listener) {
            g0.p(listener, "listener");
            this.f66431g = new C0769a(listener);
            return this;
        }

        @m80.k
        public final a R(@StringRes int i11) {
            String string = i().getString(i11);
            g0.o(string, "context.getString(hintId)");
            return S(string);
        }

        @m80.k
        public final a S(@m80.k CharSequence hint) {
            g0.p(hint, "hint");
            h().putCharSequence(o.L, hint);
            return this;
        }

        @m80.k
        public final a T(boolean z11) {
            h().putBoolean(o.O, z11);
            return this;
        }

        @m80.k
        public final a U(@LayoutRes int i11) {
            h().putInt("layout", i11);
            return this;
        }

        @m80.k
        public final a V(int i11) {
            h().putInt(o.P, i11);
            return this;
        }

        @m80.k
        public final a W(@StringRes int i11) {
            String string = i().getString(i11);
            g0.o(string, "context.getString(textId)");
            return X(string);
        }

        @m80.k
        public final a X(@m80.k CharSequence hint) {
            g0.p(hint, "hint");
            h().putCharSequence("text", hint);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(@m80.k String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<Integer> {
        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Integer invoke() {
            return Integer.valueOf(mc.b.d(o.this, R.attr.magicButtonActionRecommendedColorDisabled, 0, 2, null));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<InputMethodManager> {
        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final InputMethodManager invoke() {
            Object systemService = o.this.requireContext().getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements x00.l<View, g2> {
        public f() {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(View view) {
            invoke2(view);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k View it) {
            g0.p(it, "it");
            EditText editText = o.this.G;
            if (editText == null) {
                g0.S("edit");
                editText = null;
            }
            editText.setText((CharSequence) null);
        }
    }

    public static final void o0(o this$0, View view) {
        g0.p(this$0, "this$0");
        if (this$0.isAdded() && view.isShown()) {
            EditText editText = this$0.G;
            EditText editText2 = null;
            if (editText == null) {
                g0.S("edit");
                editText = null;
            }
            editText.requestFocus();
            InputMethodManager n02 = this$0.n0();
            EditText editText3 = this$0.G;
            if (editText3 == null) {
                g0.S("edit");
            } else {
                editText2 = editText3;
            }
            n02.showSoftInput(editText2, 1);
        }
    }

    @Override // kc.g
    public int D() {
        return this.C;
    }

    @Override // kc.g
    public int G() {
        return v.a(Location.CENTER, State.EXPANDED);
    }

    @Override // kc.d
    public void T(@m80.k TextView v11) {
        g0.p(v11, "v");
        super.T(v11);
        this.H = v11;
        Integer valueOf = Integer.valueOf(m0());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            TextView textView = this.H;
            if (textView != null) {
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{intValue, v11.getCurrentTextColor()}));
            }
        }
        p0();
    }

    @Override // kc.d
    @m80.l
    public View V(@m80.k LayoutInflater inflater) {
        Uri uri;
        String string;
        g0.p(inflater, "inflater");
        Integer n11 = mc.b.n(getArguments(), "layout");
        EditText editText = null;
        final View inflate = inflater.inflate(n11 == null ? mc.b.p(this, R.attr.magicEditLayout, this.D) : n11.intValue(), (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.magic_prompt_title);
        if (textView != null) {
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("title")) == null || k0.O3(string)) {
                string = null;
            }
            am.a.f(textView, string);
        }
        EditText editText2 = (EditText) inflate.findViewById(R.id.magic_edit_text);
        if (editText2 == null) {
            throw new RuntimeException("No EditText available!");
        }
        this.G = editText2;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.magic_edit_clear);
        Bundle arguments2 = getArguments();
        int i11 = arguments2 != null ? arguments2.getInt(P, Integer.MAX_VALUE) : Integer.MAX_VALUE;
        EditText editText3 = this.G;
        if (editText3 == null) {
            g0.S("edit");
            editText3 = null;
        }
        editText3.addTextChangedListener(new g(imageView, i11));
        if (imageView != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (uri = (Uri) arguments3.getParcelable(N)) != null) {
                Context context = imageView.getContext();
                g0.o(context, "fun ImageView.load(\n    …ri, imageLoader, builder)");
                b0.f c11 = b0.a.c(context);
                Context context2 = imageView.getContext();
                g0.o(context2, "context");
                c11.d(new ImageRequest.Builder(context2).j(uri).l0(imageView).f());
            }
            am.a.k(imageView, 0L, new f(), 1, null);
        }
        Bundle arguments4 = getArguments();
        String string2 = arguments4 == null ? null : arguments4.getString(L);
        if (string2 != null && string2.length() > 0) {
            EditText editText4 = this.G;
            if (editText4 == null) {
                g0.S("edit");
                editText4 = null;
            }
            editText4.setHint(string2);
        }
        Bundle arguments5 = getArguments();
        String string3 = arguments5 == null ? null : arguments5.getString("text");
        if (string3 != null && string3.length() > 0) {
            String obj = string3.subSequence(0, Integer.min(string3.length(), i11)).toString();
            EditText editText5 = this.G;
            if (editText5 == null) {
                g0.S("edit");
                editText5 = null;
            }
            editText5.setText(obj);
            EditText editText6 = this.G;
            if (editText6 == null) {
                g0.S("edit");
            } else {
                editText = editText6;
            }
            editText.setSelection(obj.length());
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null) {
            return inflate;
        }
        if (arguments6.getBoolean(O, true)) {
            inflate.postDelayed(new Runnable() { // from class: kc.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.o0(o.this, inflate);
                }
            }, 150L);
        }
        return inflate;
    }

    @Override // kc.d
    public void d0(@m80.k TextView v11) {
        String obj;
        g0.p(v11, "v");
        super.d0(v11);
        c cVar = this.I;
        if (cVar == null) {
            return;
        }
        EditText editText = this.G;
        if (editText == null) {
            g0.S("edit");
            editText = null;
        }
        Editable editableText = editText.getEditableText();
        String str = "";
        if (editableText != null && (obj = editableText.toString()) != null) {
            str = obj;
        }
        cVar.a(str);
    }

    public final int m0() {
        return ((Number) this.F.getValue()).intValue();
    }

    public final InputMethodManager n0() {
        return (InputMethodManager) this.E.getValue();
    }

    public final void p0() {
        TextView textView = this.H;
        if (textView == null) {
            return;
        }
        EditText editText = this.G;
        if (editText == null) {
            g0.S("edit");
            editText = null;
        }
        Editable editableText = editText.getEditableText();
        String obj = editableText != null ? editableText.toString() : null;
        textView.setEnabled(true ^ (obj == null || k0.O3(obj)));
    }

    public final void q0(c cVar) {
        this.I = cVar;
    }

    @Override // kc.h
    public int x() {
        Integer t11 = mc.b.t(this, R.attr.magicAnimation);
        return t11 == null ? R.style.EditDialogAnimation : t11.intValue();
    }

    @Override // kc.h
    public int z() {
        return this.B;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f66437b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f66438c;

        public g(ImageView imageView, int i11) {
            this.f66437b = imageView;
            this.f66438c = i11;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@m80.l Editable editable) {
            String obj;
            String str = "";
            if (editable != null && (obj = editable.toString()) != null) {
                str = obj;
            }
            String substring = str.substring(0, Integer.min(str.length(), this.f66438c));
            g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            EditText editText = null;
            if (g0.g(substring, editable == null ? null : editable.toString())) {
                ImageView clearBtn = this.f66437b;
                if (clearBtn != null) {
                    g0.o(clearBtn, "clearBtn");
                    am.a.o(this.f66437b, !k0.O3(substring));
                }
                o.this.p0();
                return;
            }
            EditText editText2 = o.this.G;
            if (editText2 == null) {
                g0.S("edit");
                editText2 = null;
            }
            editText2.setText(substring);
            EditText editText3 = o.this.G;
            if (editText3 == null) {
                g0.S("edit");
            } else {
                editText = editText3;
            }
            editText.setSelection(substring.length());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@m80.l CharSequence charSequence, int i11, int i12, int i13) {
        }
    }
}
