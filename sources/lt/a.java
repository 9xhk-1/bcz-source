package lt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.permissionx.guolindev.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f71598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71599b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71600c;

    /* renamed from: d, reason: collision with root package name */
    public final String f71601d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71602e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k Context context, @k List<String> permissions, @k String message, @k String positiveText, @l String str, int i11, int i12) {
        super(context, R.style.PermissionXDefaultDialog);
        g0.p(context, "context");
        g0.p(permissions, "permissions");
        g0.p(message, "message");
        g0.p(positiveText, "positiveText");
        this.f71598a = permissions;
        this.f71599b = message;
        this.f71600c = positiveText;
        this.f71601d = str;
        this.f71602e = i11;
        this.f71603f = i12;
    }

    @Override // lt.c
    @l
    public View a() {
        if (this.f71601d != null) {
            return (Button) findViewById(R.id.negativeBtn);
        }
        return null;
    }

    @Override // lt.c
    @k
    public List<String> b() {
        return this.f71598a;
    }

    @Override // lt.c
    @k
    public View c() {
        Button positiveBtn = (Button) findViewById(R.id.positiveBtn);
        g0.o(positiveBtn, "positiveBtn");
        return positiveBtn;
    }

    public final void d() {
        String str;
        HashSet hashSet = new HashSet();
        int i11 = Build.VERSION.SDK_INT;
        for (String str2 : this.f71598a) {
            if (i11 == 29) {
                str = b.a().get(str2);
            } else if (i11 != 30) {
                Context context = getContext();
                g0.o(context, "context");
                str = context.getPackageManager().getPermissionInfo(str2, 0).group;
            } else {
                str = b.b().get(str2);
            }
            if (str != null && !hashSet.contains(str)) {
                LayoutInflater from = LayoutInflater.from(getContext());
                int i12 = R.layout.permissionx_permission_item;
                int i13 = R.id.permissionsLayout;
                View inflate = from.inflate(i12, (ViewGroup) findViewById(i13), false);
                if (inflate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                }
                LinearLayout linearLayout = (LinearLayout) inflate;
                TextView textView = (TextView) linearLayout.findViewById(R.id.permissionText);
                g0.o(textView, "layout.permissionText");
                Context context2 = getContext();
                Context context3 = getContext();
                g0.o(context3, "context");
                textView.setText(context2.getString(context3.getPackageManager().getPermissionGroupInfo(str, 0).labelRes));
                int i14 = R.id.permissionIcon;
                ImageView imageView = (ImageView) linearLayout.findViewById(i14);
                Context context4 = getContext();
                g0.o(context4, "context");
                imageView.setImageResource(context4.getPackageManager().getPermissionGroupInfo(str, 0).icon);
                if (e()) {
                    if (this.f71603f != -1) {
                        ((ImageView) linearLayout.findViewById(i14)).setColorFilter(this.f71603f, PorterDuff.Mode.SRC_ATOP);
                    }
                } else if (this.f71602e != -1) {
                    ((ImageView) linearLayout.findViewById(i14)).setColorFilter(this.f71602e, PorterDuff.Mode.SRC_ATOP);
                }
                ((LinearLayout) findViewById(i13)).addView(linearLayout);
                hashSet.add(str);
            }
        }
    }

    public final boolean e() {
        Context context = getContext();
        g0.o(context, "context");
        Resources resources = context.getResources();
        g0.o(resources, "context.resources");
        return (resources.getConfiguration().uiMode & 48) == 32;
    }

    public final void f() {
        TextView messageText = (TextView) findViewById(R.id.messageText);
        g0.o(messageText, "messageText");
        messageText.setText(this.f71599b);
        int i11 = R.id.positiveBtn;
        Button positiveBtn = (Button) findViewById(i11);
        g0.o(positiveBtn, "positiveBtn");
        positiveBtn.setText(this.f71600c);
        if (this.f71601d != null) {
            LinearLayout negativeLayout = (LinearLayout) findViewById(R.id.negativeLayout);
            g0.o(negativeLayout, "negativeLayout");
            negativeLayout.setVisibility(0);
            Button negativeBtn = (Button) findViewById(R.id.negativeBtn);
            g0.o(negativeBtn, "negativeBtn");
            negativeBtn.setText(this.f71601d);
        } else {
            LinearLayout negativeLayout2 = (LinearLayout) findViewById(R.id.negativeLayout);
            g0.o(negativeLayout2, "negativeLayout");
            negativeLayout2.setVisibility(8);
        }
        if (e()) {
            if (this.f71603f != -1) {
                ((Button) findViewById(i11)).setTextColor(this.f71603f);
                ((Button) findViewById(R.id.negativeBtn)).setTextColor(this.f71603f);
                return;
            }
            return;
        }
        if (this.f71602e != -1) {
            ((Button) findViewById(i11)).setTextColor(this.f71602e);
            ((Button) findViewById(R.id.negativeBtn)).setTextColor(this.f71602e);
        }
    }

    public final void g() {
        Context context = getContext();
        g0.o(context, "context");
        Resources resources = context.getResources();
        g0.o(resources, "context.resources");
        int i11 = resources.getDisplayMetrics().widthPixels;
        Context context2 = getContext();
        g0.o(context2, "context");
        Resources resources2 = context2.getResources();
        g0.o(resources2, "context.resources");
        if (i11 < resources2.getDisplayMetrics().heightPixels) {
            Window it = getWindow();
            if (it != null) {
                g0.o(it, "it");
                WindowManager.LayoutParams attributes = it.getAttributes();
                it.setGravity(17);
                attributes.width = (int) (i11 * 0.86d);
                it.setAttributes(attributes);
                return;
            }
            return;
        }
        Window it2 = getWindow();
        if (it2 != null) {
            g0.o(it2, "it");
            WindowManager.LayoutParams attributes2 = it2.getAttributes();
            it2.setGravity(17);
            attributes2.width = (int) (i11 * 0.6d);
            it2.setAttributes(attributes2);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.permissionx_default_dialog_layout);
        f();
        d();
        g();
    }
}
