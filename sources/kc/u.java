package kc;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import coil.request.ImageRequest;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.framework.common.magicdialog.Location;
import com.baicizhan.framework.common.magicdialog.R;
import com.baicizhan.framework.common.magicdialog.State;
import java.io.Serializable;
import kc.e;
import kotlin.jvm.internal.g0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u extends e {

    @m80.k
    public static final b I = new b(null);

    @m80.k
    public static final String J = "picture";

    @m80.k
    public static final String K = "picture_uri";

    @m80.k
    public static final String L = "message";

    @m80.k
    public static final String M = "check_enable";

    @m80.k
    public static final String N = "check_tip";

    @m80.k
    public static final String O = "divider_enable";

    @m80.k
    public static final String P = "layout";

    @m80.k
    public static final String Q = "animation";

    @m80.k
    public static final String R = "match_state";

    @m80.k
    public static final String S = "location";
    public final int B = R.style.MagicDefault_Prompt;
    public final int C = R.attr.magicPromptAppearance;
    public int D = R.layout.fragment_dialog_prompt;

    @m80.l
    public c E;

    @m80.l
    public CheckBox F;

    @m80.l
    public TextView G;
    public boolean H;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends e.a<a, u> {

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public c f66446g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kc.u$a$a, reason: collision with other inner class name */
        public static final class C0770a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.p<Boolean, Integer, g2> f66447a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0770a(x00.p<? super Boolean, ? super Integer, g2> pVar) {
                this.f66447a = pVar;
            }

            @Override // kc.u.c
            public void a(boolean z11, int i11) {
                x00.p<Boolean, Integer, g2> pVar = this.f66447a;
                if (pVar == null) {
                    return;
                }
                pVar.invoke(Boolean.valueOf(z11), Integer.valueOf(i11));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a P(a aVar, boolean z11, String str, x00.p pVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                pVar = null;
            }
            return aVar.O(z11, str, pVar);
        }

        @m80.k
        public final a N(@StyleRes int i11) {
            h().putInt("animation", i11);
            return this;
        }

        @m80.k
        public final a O(boolean z11, @m80.k String tip, @m80.l x00.p<? super Boolean, ? super Integer, g2> pVar) {
            g0.p(tip, "tip");
            if (k0.O3(tip)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h().putBoolean(u.M, z11);
            h().putString(u.N, tip);
            this.f66446g = new C0770a(pVar);
            return this;
        }

        @Override // kc.d.a
        @m80.k
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public u g() {
            return new u();
        }

        @m80.k
        public final a R(boolean z11) {
            h().putBoolean(u.O, z11);
            return this;
        }

        @m80.k
        public final a S(@LayoutRes int i11) {
            h().putInt("layout", i11);
            return this;
        }

        @m80.k
        public final a T(@m80.k Location location) {
            g0.p(location, "location");
            h().putSerializable(u.S, location);
            return this;
        }

        @m80.k
        public final a U(@StringRes int i11) {
            return V(i().getString(i11));
        }

        @m80.k
        public final a V(@m80.l String str) {
            h().putString("message", str);
            return this;
        }

        @Override // kc.d.a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public void z(@m80.k u built) {
            g0.p(built, "built");
            built.E = this.f66446g;
        }

        @m80.k
        public final a X(@DrawableRes int i11) {
            h().putParcelable("picture", null);
            Bundle h11 = h();
            Uri parse = Uri.parse("android.resource://" + ((Object) i().getResources().getResourcePackageName(i11)) + '/' + ((Object) i().getResources().getResourceTypeName(i11)) + '/' + ((Object) i().getResources().getResourceEntryName(i11)));
            g0.o(parse, "parse(this)");
            h11.putParcelable(u.K, parse);
            return this;
        }

        @m80.k
        public final a Y(@m80.k Bitmap bitmap) {
            g0.p(bitmap, "bitmap");
            h().putParcelable(u.K, null);
            h().putParcelable("picture", bitmap);
            return this;
        }

        @m80.k
        public final a Z(@m80.k Uri uri) {
            g0.p(uri, "uri");
            h().putParcelable("picture", null);
            h().putParcelable(u.K, uri);
            return this;
        }

        @m80.k
        public final a a0(@m80.k State state) {
            g0.p(state, "state");
            h().putSerializable(u.R, state);
            return this;
        }

        @m80.k
        public final a b0(@m80.k ButtonType buttonType) {
            g0.p(buttonType, "buttonType");
            h().putSerializable("button_type", buttonType);
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
        void a(boolean z11, int i11);
    }

    public static final void l0(u this$0, CompoundButton compoundButton, boolean z11) {
        g0.p(this$0, "this$0");
        this$0.H = z11;
    }

    @Override // kc.d, kc.h
    public boolean A() {
        return false;
    }

    @Override // kc.g
    public int D() {
        return this.C;
    }

    @Override // kc.g
    public int G() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments == null ? null : arguments.getSerializable(S);
        Location location = serializable instanceof Location ? (Location) serializable : null;
        if (location == null) {
            location = Location.values()[mc.b.j(this, R.attr.magicLocation, Location.BOTTOM.ordinal())];
        }
        Bundle arguments2 = getArguments();
        Serializable serializable2 = arguments2 == null ? null : arguments2.getSerializable(R);
        State state = serializable2 instanceof State ? (State) serializable2 : null;
        if (state == null) {
            state = State.values()[mc.b.j(this, R.attr.magicState, State.EXPANDED.ordinal())];
        }
        return v.a(location, state);
    }

    @Override // kc.d
    @m80.l
    public View V(@m80.k LayoutInflater inflater) {
        Bundle arguments;
        String string;
        String string2;
        String string3;
        Boolean bool;
        boolean booleanValue;
        Uri uri;
        g0.p(inflater, "inflater");
        Integer n11 = mc.b.n(getArguments(), "layout");
        boolean z11 = false;
        View inflate = inflater.inflate(n11 == null ? mc.b.p(this, R.attr.magicPromptLayout, this.D) : n11.intValue(), (ViewGroup) null, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.magic_prompt_pic);
        if (imageView != null) {
            Bundle arguments2 = getArguments();
            Bitmap bitmap = arguments2 == null ? null : (Bitmap) arguments2.getParcelable("picture");
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null) {
                bool = null;
            } else {
                imageView.setImageBitmap(bitmap);
                bool = Boolean.TRUE;
            }
            if (bool == null) {
                Bundle arguments3 = getArguments();
                if (arguments3 == null || (uri = (Uri) arguments3.getParcelable(K)) == null) {
                    booleanValue = false;
                } else {
                    Context context = imageView.getContext();
                    g0.o(context, "fun ImageView.load(\n    …ri, imageLoader, builder)");
                    b0.f c11 = b0.a.c(context);
                    Context context2 = imageView.getContext();
                    g0.o(context2, "context");
                    ImageRequest.Builder l02 = new ImageRequest.Builder(context2).j(uri).l0(imageView);
                    l02.L(R.drawable.ic_prompt_pic_placeholder);
                    l02.r(R.drawable.ic_prompt_pic_error);
                    c11.d(l02.f());
                    booleanValue = true;
                }
            } else {
                booleanValue = bool.booleanValue();
            }
            am.a.o(imageView, booleanValue);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.magic_prompt_title);
        TextView message = (TextView) inflate.findViewById(R.id.magic_prompt_message);
        if (textView != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string3 = arguments4.getString("title")) == null || k0.O3(string3)) {
                string3 = null;
            }
            am.a.f(textView, string3);
        }
        if (message != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (string2 = arguments5.getString("message")) == null || k0.O3(string2)) {
                string2 = null;
            }
            am.a.f(message, string2);
        }
        if (textView != null && am.a.d(textView)) {
            int h11 = mc.b.h(this, R.attr.magicGapTitleTop, 0, 2, null);
            g0.o(message, "message");
            textView.setPadding(0, h11, 0, am.a.d(message) ? mc.b.h(this, R.attr.magicGapTitleMessage, 0, 2, null) : 0);
        } else if (message != null && am.a.d(message)) {
            message.setPadding(0, mc.b.h(this, R.attr.magicGapTitleTop, 0, 2, null), 0, 0);
        }
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.magic_prompt_checkbox);
        if (checkBox != null) {
            this.F = checkBox;
            Bundle arguments6 = getArguments();
            am.a.o(checkBox, (arguments6 == null || !arguments6.containsKey(M) || (arguments = getArguments()) == null || (string = arguments.getString(N)) == null || !(k0.O3(string) ^ true)) ? false : true);
            if (am.a.d(checkBox)) {
                Bundle arguments7 = getArguments();
                checkBox.setChecked(arguments7 != null && arguments7.getBoolean(M, false));
                this.H = checkBox.isChecked();
            }
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kc.t
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    u.l0(u.this, compoundButton, z12);
                }
            });
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.magic_prompt_checkbox_tip);
        if (textView2 != null) {
            this.G = textView2;
            Bundle arguments8 = getArguments();
            am.a.f(textView2, arguments8 != null ? arguments8.getString(N) : null);
        }
        View findViewById = inflate.findViewById(R.id.magic_prompt_divider);
        if (findViewById == null) {
            return inflate;
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null && arguments9.getBoolean(O, false)) {
            z11 = true;
        }
        am.a.o(findViewById, z11);
        return inflate;
    }

    @Override // kc.d
    public void b0(@m80.k TextView v11) {
        c cVar;
        g0.p(v11, "v");
        super.b0(v11);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey(M) || (cVar = this.E) == null) {
            return;
        }
        cVar.a(this.H, 0);
    }

    @Override // kc.d
    public void d0(@m80.k TextView v11) {
        c cVar;
        g0.p(v11, "v");
        super.d0(v11);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey(M) || (cVar = this.E) == null) {
            return;
        }
        cVar.a(this.H, 1);
    }

    public final void k0(@m80.k c interaction) {
        g0.p(interaction, "interaction");
        this.E = interaction;
    }

    @Override // kc.h
    public int x() {
        Integer n11 = mc.b.n(getArguments(), "animation");
        if (n11 != null) {
            return n11.intValue();
        }
        Integer t11 = mc.b.t(this, R.attr.magicAnimation);
        return t11 == null ? R.style.PromptDialogAnimation : t11.intValue();
    }

    @Override // kc.h
    public int z() {
        return this.B;
    }
}
