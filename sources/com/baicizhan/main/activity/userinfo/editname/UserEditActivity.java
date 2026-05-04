package com.baicizhan.main.activity.userinfo.editname;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.main.activity.userinfo.editname.UserEditActivity;
import com.jiongji.andriod.card.R;
import gs.p2;
import java.io.UnsupportedEncodingException;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UserEditActivity extends BaseAppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final String f19891c = "UserEditTAG";

    /* renamed from: a, reason: collision with root package name */
    public p2 f19892a;

    /* renamed from: b, reason: collision with root package name */
    public hf.d f19893b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            UserEditActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Boolean> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            if (!aBoolean.booleanValue()) {
                SystemUtil.hideIME(UserEditActivity.this.f19892a.f56286c);
            } else {
                SystemUtil.showIME(UserEditActivity.this.f19892a.f56286c);
                UserEditActivity.this.f19892a.f56286c.requestFocus();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Observer<String> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String s11) {
            g.i(s11, 0);
        }
    }

    private void L0() {
        this.f19893b.f59241b.observe(this, new b());
        this.f19893b.f59242c.observe(this, new c());
        this.f19893b.f59244e.observe(this, new d());
        this.f19893b.f59243d.observe(this, new Observer() { // from class: hf.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UserEditActivity.this.O0((Void) obj);
            }
        });
        this.f19893b.f59245f.observe(this, new Observer() { // from class: hf.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UserEditActivity.this.P0((Void) obj);
            }
        });
    }

    private void M0() {
        p2 p2Var = (p2) DataBindingUtil.setContentView(this, R.layout.activity_user_edit);
        this.f19892a = p2Var;
        p2Var.setLifecycleOwner(this);
        this.f19892a.j(this.f19893b);
        SpannableString spannableString = new SpannableString(getString(R.string.user_center_nickname_edit_desc));
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.main_color_red)), 20, 29, 33);
        this.f19892a.f56285b.setText(spannableString);
        this.f19892a.f56286c.addTextChangedListener(new a());
    }

    private void N0() {
        this.f19893b = (hf.d) new ViewModelProvider(this).get(hf.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(Void r22) {
        EditText editText = this.f19892a.f56286c;
        editText.setSelection(editText.getText().toString().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(Void r12) {
        finish();
    }

    public static void Q0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) UserEditActivity.class));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        N0();
        M0();
        L0();
        this.f19893b.start();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        SystemUtil.hideIME(this.f19892a.f56286c);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public int f19894a;

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            int length;
            String obj = s11.toString();
            try {
                length = obj.getBytes("GBK").length;
            } catch (UnsupportedEncodingException unused) {
                qb.c.d(UserEditActivity.f19891c, "unsupported encode gbk", new Object[0]);
                length = obj.getBytes().length;
            }
            if (length > 24) {
                if (obj.length() > 0) {
                    obj = obj.substring(0, obj.length() - 1);
                }
                UserEditActivity.this.f19892a.f56286c.setText(obj);
                try {
                    UserEditActivity.this.f19892a.f56286c.setSelection(Math.min(this.f19894a, obj.length()));
                } catch (Throwable unused2) {
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            int selectionEnd = UserEditActivity.this.f19892a.f56286c.getSelectionEnd();
            if (selectionEnd <= 0) {
                selectionEnd = this.f19894a;
            }
            this.f19894a = selectionEnd;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }
}
