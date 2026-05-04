package com.baicizhan.client.friend.activity.portrait;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.friend.adapter.portrait.FriendSuggestionAdapter;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.client.friend.model.UIState;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.online.bs_socials.BBSearchResult;
import com.baicizhan.online.structs.BELogicException;
import com.jiongji.andriod.card.R;
import gs.mc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kc.u;
import q9.x;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendSearchActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    public static final String f17630m = "FriendSearchActivity";

    /* renamed from: n, reason: collision with root package name */
    public static final String f17631n = "search_key";

    /* renamed from: o, reason: collision with root package name */
    public static final int f17632o = 10;

    /* renamed from: a, reason: collision with root package name */
    public EditText f17633a;

    /* renamed from: b, reason: collision with root package name */
    public View f17634b;

    /* renamed from: c, reason: collision with root package name */
    public View f17635c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f17636d;

    /* renamed from: e, reason: collision with root package name */
    public FriendSuggestionAdapter f17637e;

    /* renamed from: f, reason: collision with root package name */
    public View f17638f;

    /* renamed from: g, reason: collision with root package name */
    public View f17639g;

    /* renamed from: h, reason: collision with root package name */
    public View f17640h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f17641i;

    /* renamed from: j, reason: collision with root package name */
    public va.f f17642j;

    /* renamed from: k, reason: collision with root package name */
    public mc f17643k;

    /* renamed from: l, reason: collision with root package name */
    public TextWatcher f17644l = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FriendSearchActivity.this.f17633a.setText((CharSequence) null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v11, int actionId, KeyEvent event) {
            if (actionId != 4 && (event == null || event.getKeyCode() != 66)) {
                return false;
            }
            FriendSearchActivity.this.Y0();
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean focused) {
            if (focused) {
                FriendSearchActivity.this.f17640h.setVisibility(0);
                FriendSearchActivity.this.f17635c.setVisibility(4);
                FriendSearchActivity.this.f17634b.setVisibility(0);
                FriendSearchActivity.this.f17634b.setEnabled(true);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FriendSearchActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17650a;

        static {
            int[] iArr = new int[UIState.values().length];
            f17650a = iArr;
            try {
                iArr[UIState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17650a[UIState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17650a[UIState.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17650a[UIState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements SocialNetwork.Listener<List<BBSearchResult>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<FriendSearchActivity> f17651a;

        public g(FriendSearchActivity activity) {
            this.f17651a = new WeakReference<>(activity);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBSearchResult> res) {
            FriendSearchActivity friendSearchActivity = this.f17651a.get();
            if (friendSearchActivity == null) {
                return;
            }
            friendSearchActivity.T0();
            friendSearchActivity.X0(new ArrayList(res));
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            FriendSearchActivity friendSearchActivity = this.f17651a.get();
            if (friendSearchActivity == null) {
                return;
            }
            if (e11 instanceof BELogicException) {
                va.g.i(e11.getMessage(), 0);
            }
            friendSearchActivity.Z0(UIState.ERROR);
            qb.c.d("FriendSearchActivity", e11.getMessage(), new Object[0]);
            friendSearchActivity.T0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements SocialNetwork.Listener<List<BBSearchResult>> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<FriendSearchActivity> f17652a;

        public h(FriendSearchActivity activity) {
            this.f17652a = new WeakReference<>(activity);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBSearchResult> res) {
            FriendSearchActivity friendSearchActivity = this.f17652a.get();
            if (friendSearchActivity == null) {
                return;
            }
            friendSearchActivity.f17637e.g(res);
            friendSearchActivity.Z0(res.isEmpty() ? UIState.EMPTY : UIState.COMPLETE);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            FriendSearchActivity friendSearchActivity = this.f17652a.get();
            if (friendSearchActivity == null) {
                return;
            }
            friendSearchActivity.f17638f.setVisibility(0);
            friendSearchActivity.Z0(UIState.ERROR);
        }
    }

    private void W0() {
        View findViewById = findViewById(R.id.search_frame);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(ThemeUtil.getThemeColorWithAttr(this, R.attr.color_friends_search));
        gradientDrawable.setCornerRadius(i.a(this, 4.0f));
        lq.c.b(findViewById, gradientDrawable);
        View findViewById2 = findViewById(R.id.search_clear);
        this.f17634b = findViewById2;
        findViewById2.setEnabled(false);
        this.f17634b.setOnClickListener(new b());
        EditText editText = (EditText) findViewById(R.id.search_box);
        this.f17633a = editText;
        editText.setImeOptions(268435459);
        this.f17633a.setOnEditorActionListener(new c());
        this.f17633a.addTextChangedListener(this.f17644l);
        this.f17633a.setOnFocusChangeListener(new d());
        View findViewById3 = findViewById(R.id.search_entry);
        this.f17640h = findViewById3;
        this.f17641i = (TextView) findViewById3.findViewById(R.id.search_name);
        this.f17640h.setVisibility(4);
        this.f17640h.setOnClickListener(this);
        this.f17643k.f55888a.D(new e());
        TextView textView = (TextView) findViewById(R.id.name);
        Locale locale = Locale.CHINA;
        textView.setText(String.format(locale, "我的昵称: %s", x.r().p().getDisplayName()));
        ((TextView) findViewById(R.id.id)).setText(String.format(locale, "我的百词斩ID: %d", Integer.valueOf(x.r().p().getUniqueId())));
        this.f17635c = findViewById(R.id.system_suggestion);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.suggestion_list);
        this.f17636d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        eu.a aVar = new eu.a(this);
        aVar.d(new ColorDrawable(-3029578));
        this.f17636d.addItemDecoration(aVar);
        FriendSuggestionAdapter friendSuggestionAdapter = new FriendSuggestionAdapter(this, FriendSuggestionAdapter.Mode.SYSTEM);
        this.f17637e = friendSuggestionAdapter;
        this.f17636d.setAdapter(friendSuggestionAdapter);
        this.f17638f = findViewById(R.id.empty_view);
        this.f17639g = findViewById(R.id.load_progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0(UIState state) {
        int i11 = f.f17650a[state.ordinal()];
        if (i11 == 1) {
            this.f17638f.setVisibility(8);
            this.f17639g.setVisibility(0);
            this.f17636d.setVisibility(4);
            return;
        }
        if (i11 == 2) {
            this.f17638f.setVisibility(8);
            this.f17639g.setVisibility(8);
            this.f17636d.setVisibility(0);
        } else if (i11 == 3) {
            this.f17638f.setVisibility(0);
            this.f17639g.setVisibility(8);
            this.f17636d.setVisibility(4);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f17638f.setVisibility(8);
            this.f17639g.setVisibility(8);
            this.f17636d.setVisibility(4);
        }
    }

    public static void b1(Context context) {
        context.startActivity(new Intent(context, (Class<?>) FriendSearchActivity.class));
    }

    public final void T0() {
        va.f fVar = this.f17642j;
        if (fVar != null) {
            fVar.dismiss();
            this.f17642j = null;
        }
        V0().setEnabled(true);
    }

    public final void U0() {
        Z0(UIState.LOADING);
        SocialNetwork.fetchSuggestedFriend("FriendSearchActivity", new h(this));
    }

    public final View V0() {
        return ((ViewGroup) getWindow().getDecorView()).getChildAt(0);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kc.d, kc.h] */
    public final void X0(ArrayList<BBSearchResult> result) {
        if (result.size() > 0) {
            FriendSearchResultActivity.I0(this, result);
        } else {
            mc.a.n(this, new u.a(this).V("查无此人，请确认是否输入正确").b0(ButtonType.SINGLE_POSITIVE).d(), "search-tip");
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kc.d, kc.h] */
    public final void Y0() {
        String trim = this.f17633a.getText().toString().trim();
        int i11 = TextUtils.isEmpty(trim) ? R.string.friend_error_search_key_empty : trim.length() > 10 ? R.string.friend_error_search_key_too_long : -1;
        if (i11 == -1) {
            a1();
            SocialNetwork.search("FriendSearchActivity", trim, new g(this));
        } else {
            mc.a.n(this, new u.a(this).U(i11).b0(ButtonType.SINGLE_POSITIVE).d(), "search-tip");
            this.f17633a.setText("");
            this.f17641i.setText("");
        }
    }

    public final void a1() {
        this.f17642j = va.f.h(this, "查询中，请稍后", true);
        V0().setEnabled(false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17642j != null) {
            T0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.search_entry) {
            Y0();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        setTheme(R.style.AppCompatStandardDefault);
        getWindow().setSoftInputMode(3);
        this.f17643k = (mc) DataBindingUtil.setContentView(this, R.layout.friend_search_activity_portrait);
        W0();
        U0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String string = savedInstanceState.getString(f17631n);
        if (TextUtils.isEmpty(string) || this.f17641i == null) {
            return;
        }
        this.f17633a.setText(string);
        this.f17641i.setText(string);
        if (this.f17633a.isFocused()) {
            return;
        }
        this.f17633a.requestFocus();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(this.f17633a.getText().toString())) {
            return;
        }
        this.f17633a.requestFocus();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(f17631n, this.f17633a.getText().toString());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            FriendSearchActivity.this.f17641i.setText(s11.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }
}
