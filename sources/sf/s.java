package sf;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.AuthCallback;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.unified_user_service.BczLoginRequest;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s extends Fragment implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: l, reason: collision with root package name */
    public static final String f88426l = "EmailRegisterFragment";

    /* renamed from: m, reason: collision with root package name */
    public static final String f88427m = "default_account";

    /* renamed from: a, reason: collision with root package name */
    public String f88428a;

    /* renamed from: b, reason: collision with root package name */
    public EmailAutoCompleteEditText f88429b;

    /* renamed from: c, reason: collision with root package name */
    public View f88430c;

    /* renamed from: d, reason: collision with root package name */
    public EditText f88431d;

    /* renamed from: e, reason: collision with root package name */
    public View f88432e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f88433f;

    /* renamed from: g, reason: collision with root package name */
    public View f88434g;

    /* renamed from: h, reason: collision with root package name */
    public Button f88435h;

    /* renamed from: i, reason: collision with root package name */
    public va.f f88436i;

    /* renamed from: j, reason: collision with root package name */
    public qb0.h f88437j;

    /* renamed from: k, reason: collision with root package name */
    public u f88438k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<UnifiedUserService.Client, rx.c<UserLoginResult>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserRecord f88441a;

        public b(final UserRecord val$userRecord) {
            this.f88441a = val$userRecord;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<UserLoginResult> call(UnifiedUserService.Client client) {
            BczLoginRequest bczLoginRequest = new BczLoginRequest();
            bczLoginRequest.account = this.f88441a.getUser();
            bczLoginRequest.password = this.f88441a.getPasswordMD5();
            try {
                return rx.c.M2(client.register_user(bczLoginRequest));
            } catch (TException e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            if (TextUtils.isEmpty(s.this.f88429b.getText()) || TextUtils.isEmpty(s.this.f88431d.getText()) || TextUtils.isEmpty(s.this.f88433f.getText())) {
                s.this.f88435h.setEnabled(false);
            } else {
                s.this.f88435h.setEnabled(true);
            }
            s.this.f88430c.setVisibility(TextUtils.isEmpty(s.this.f88429b.getText()) ? 8 : 0);
            s.this.f88432e.setVisibility(TextUtils.isEmpty(s.this.f88431d.getText()) ? 8 : 0);
            s.this.f88434g.setVisibility(TextUtils.isEmpty(s.this.f88433f.getText()) ? 8 : 0);
        }

        public c() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends AuthCallback<UserRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<s> f88444a;

        public d(s fragment) {
            this.f88444a = new WeakReference<>(fragment);
        }

        @Override // com.baicizhan.client.business.util.AuthCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(UserRecord userRecord) {
            s sVar = this.f88444a.get();
            if (sVar == null || sVar.getActivity() == null) {
                return;
            }
            sVar.f88436i.dismiss();
            qb.c.b(s.f88426l, "phone login sucess", new Object[0]);
            if (sVar.f88438k != null) {
                sVar.f88438k.a(userRecord);
            }
        }

        @Override // com.baicizhan.client.business.util.AuthCallback
        public void onError(Throwable throwable) {
            s sVar = this.f88444a.get();
            if (sVar == null || sVar.getActivity() == null) {
                return;
            }
            sVar.f88436i.dismiss();
            if (sVar.f88438k != null) {
                sVar.f88438k.b(throwable);
            }
        }
    }

    private void D(View root) {
        root.findViewById(R.id.container).setOnTouchListener(this);
        View findViewById = root.findViewById(R.id.email_clear);
        this.f88430c = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = root.findViewById(R.id.password_clear);
        this.f88432e = findViewById2;
        findViewById2.setOnClickListener(this);
        View findViewById3 = root.findViewById(R.id.confirm_password_clear);
        this.f88434g = findViewById3;
        findViewById3.setOnClickListener(this);
        EmailAutoCompleteEditText emailAutoCompleteEditText = (EmailAutoCompleteEditText) root.findViewById(R.id.email);
        this.f88429b = emailAutoCompleteEditText;
        emailAutoCompleteEditText.addTextChangedListener(new c());
        EditText editText = (EditText) root.findViewById(R.id.password);
        this.f88431d = editText;
        editText.addTextChangedListener(new c());
        EditText editText2 = (EditText) root.findViewById(R.id.confirm_password);
        this.f88433f = editText2;
        editText2.addTextChangedListener(new c());
        Button button = (Button) root.findViewById(R.id.register);
        this.f88435h = button;
        button.setOnClickListener(this);
        if (!TextUtils.isEmpty(this.f88428a) && StringUtil.isValidEmailAddr(this.f88428a)) {
            this.f88429b.setText(this.f88428a);
        }
        va.f fVar = new va.f(getActivity());
        this.f88436i = fVar;
        fVar.setCancelable(false);
    }

    public static s F(String defaultAccount) {
        s sVar = new s();
        Bundle bundle = new Bundle();
        bundle.putString(f88427m, defaultAccount);
        sVar.setArguments(bundle);
        return sVar;
    }

    private void G() {
        qb0.h hVar = this.f88437j;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f88429b.clearFocus();
            String trim = this.f88429b.getTextToComplete().trim();
            String trim2 = this.f88431d.getText() != null ? this.f88431d.getText().toString().trim() : null;
            if (E(trim, trim2, this.f88433f.getText() != null ? this.f88433f.getText().toString().trim() : null)) {
                this.f88436i.show();
                UserRecord userRecord = new UserRecord();
                userRecord.setUser(trim);
                userRecord.setPasswordMD5(StringUtil.md5Hex(trim2, true));
                userRecord.setLoginType(0);
                this.f88437j = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false)).b2(new b(userRecord)).w5(bc0.c.a()).I3(tb0.a.a()).r5(new a(userRecord));
            }
        }
    }

    public final boolean E(String email, String password, String passwordConfirm) {
        int i11;
        if (TextUtils.isEmpty(email)) {
            this.f88429b.requestFocus();
            i11 = R.string.main_email_empty;
        } else if (StringUtil.isValidEmailAddr(email)) {
            i11 = -1;
        } else {
            this.f88429b.requestFocus();
            i11 = R.string.main_not_mail_format;
        }
        if (TextUtils.isEmpty(password)) {
            this.f88431d.requestFocus();
            i11 = R.string.main_password_is_empty;
        } else if (password.length() < 6 || password.length() > 35) {
            this.f88431d.requestFocus();
            i11 = R.string.main_password_length_error;
        } else if (!password.equals(passwordConfirm)) {
            this.f88433f.requestFocus();
            i11 = R.string.main_password_not_same;
        }
        if (i11 == -1) {
            return true;
        }
        va.g.g(i11, 0);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88438k = (u) activity;
        } catch (ClassCastException unused) {
            qb.c.d("", "EmailRegisterFragment's activity does not implement ILoginCallback...", new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.confirm_password_clear /* 2131362189 */:
                this.f88433f.setText((CharSequence) null);
                break;
            case R.id.email_clear /* 2131362437 */:
                this.f88429b.setText((CharSequence) null);
                this.f88429b.requestFocus();
                break;
            case R.id.password_clear /* 2131363183 */:
                this.f88431d.setText((CharSequence) null);
                this.f88431d.requestFocus();
                break;
            case R.id.register /* 2131363443 */:
                G();
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        if (savedInstanceState != null) {
            this.f88428a = savedInstanceState.getString(f88427m);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_email_register, container, false);
        D(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        qb0.h hVar = this.f88437j;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f88437j.unsubscribe();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(f88427m, this.f88428a);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v11, MotionEvent event) {
        SystemUtil.hideIME(v11);
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<UserLoginResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserRecord f88439a;

        public a(final UserRecord val$userRecord) {
            this.f88439a = val$userRecord;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            va.g.i(e11 instanceof LogicException ? e11.getMessage() : "注册失败", 0);
            qb.c.d(s.f88426l, "register user failed: " + e11, new Object[0]);
            s.this.f88436i.dismiss();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(UserLoginResult userLoginResult) {
            va.g.i("注册成功，正在登录中....", 1);
            gi.e.m(s.this.getActivity(), this.f88439a, new d(s.this), 0);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
