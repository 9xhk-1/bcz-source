package me;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import gs.y3;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import ma.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class r extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f73197a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f73198b = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f73199c = "ProtocolUpgradeDialog";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final int f73200f = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Context f73201a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f73202b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public View.OnClickListener f73203c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public View.OnClickListener f73204d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Map<String, String> f73205e;

        public a(@m80.k Context context) {
            g0.p(context, "context");
            this.f73201a = context;
        }

        @m80.l
        public final r a() {
            if (this.f73205e == null || this.f73202b == null || this.f73203c == null || this.f73204d == null) {
                return null;
            }
            Context context = this.f73201a;
            String str = this.f73202b;
            g0.m(str);
            Map<String, String> map = this.f73205e;
            g0.m(map);
            View.OnClickListener onClickListener = this.f73203c;
            g0.m(onClickListener);
            View.OnClickListener onClickListener2 = this.f73204d;
            g0.m(onClickListener2);
            return new r(context, str, map, onClickListener, onClickListener2);
        }

        @m80.l
        public final View.OnClickListener b() {
            return this.f73204d;
        }

        @m80.l
        public final View.OnClickListener c() {
            return this.f73203c;
        }

        @m80.l
        public final String d() {
            return this.f73202b;
        }

        @m80.k
        public final Context e() {
            return this.f73201a;
        }

        @m80.l
        public final Map<String, String> f() {
            return this.f73205e;
        }

        @m80.k
        public final a g(@m80.k View.OnClickListener cancelListener) {
            g0.p(cancelListener, "cancelListener");
            this.f73204d = cancelListener;
            return this;
        }

        public final void h(@m80.l View.OnClickListener onClickListener) {
            this.f73204d = onClickListener;
        }

        @m80.k
        public final a i(@m80.k View.OnClickListener confirmListener) {
            g0.p(confirmListener, "confirmListener");
            this.f73203c = confirmListener;
            return this;
        }

        public final void j(@m80.l View.OnClickListener onClickListener) {
            this.f73203c = onClickListener;
        }

        @m80.k
        public final a k(@m80.k String content) {
            g0.p(content, "content");
            this.f73202b = content;
            return this;
        }

        public final void l(@m80.l String str) {
            this.f73202b = str;
        }

        @m80.k
        public final a m(@m80.k Map<String, String> high) {
            g0.p(high, "high");
            this.f73205e = high;
            return this;
        }

        public final void n(@m80.l Map<String, String> map) {
            this.f73205e = map;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final String a() {
            return r.f73199c;
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@m80.k Context context, @m80.k String contentString, @m80.k Map<String, String> links, @m80.k final View.OnClickListener confirmListener, @m80.k final View.OnClickListener cancelListener) {
        super(context, R.style.bczDialogStyle);
        g0.p(context, "context");
        g0.p(contentString, "contentString");
        g0.p(links, "links");
        g0.p(confirmListener, "confirmListener");
        g0.p(cancelListener, "cancelListener");
        y3 c11 = y3.c(LayoutInflater.from(context));
        c11.f57548f.setOnClickListener(new View.OnClickListener() { // from class: me.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.b(cancelListener, view);
            }
        });
        c11.f57544b.setOnClickListener(new View.OnClickListener() { // from class: me.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.a(confirmListener, this, view);
            }
        });
        o oVar = o.f73181a;
        TextView content = c11.f57546d;
        g0.o(content, "content");
        o.B(oVar, content, links, contentString, false, 4, null);
        c11.f57545c.getLayoutParams().width = xb.f.i(context) - xb.f.a(context, 72.0f);
        setContentView(c11.getRoot());
    }

    public static void a(View.OnClickListener onClickListener, r rVar, View view) {
        onClickListener.onClick(view);
        rVar.dismiss();
    }

    public static void b(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        ma.l.a(t.f73023v, ma.a.J2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable th2) {
            qb.c.c(f73199c, "", th2);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e11) {
            qb.c.c(f73199c, "", e11);
        }
    }
}
