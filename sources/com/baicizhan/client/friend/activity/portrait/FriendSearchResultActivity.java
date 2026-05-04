package com.baicizhan.client.friend.activity.portrait;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.friend.adapter.portrait.FriendSuggestionAdapter;
import com.baicizhan.online.bs_socials.BBSearchResult;
import com.jiongji.andriod.card.R;
import gs.qc;
import java.util.ArrayList;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendSearchResultActivity extends BaseAppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final String f17653c = "FriendSearchResultActivity";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17654d = "search_result";

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<BBSearchResult> f17655a;

    /* renamed from: b, reason: collision with root package name */
    public qc f17656b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FriendSearchResultActivity.this.finish();
        }
    }

    public static void I0(Context context, ArrayList<BBSearchResult> results) {
        Intent intent = new Intent(context, (Class<?>) FriendSearchResultActivity.class);
        intent.putExtra(f17654d, results);
        context.startActivity(intent);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        setTheme(R.style.AppCompatStandardDefault);
        qc qcVar = (qc) DataBindingUtil.setContentView(this, R.layout.friend_search_result_activity_portrait);
        this.f17656b = qcVar;
        qcVar.f56484a.D(new a());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.search_result_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        eu.a aVar = new eu.a(this);
        aVar.d(new ColorDrawable(ThemeUtil.getThemeColorWithAttr(this, R.attr.color_friend_line)));
        recyclerView.addItemDecoration(aVar);
        FriendSuggestionAdapter friendSuggestionAdapter = new FriendSuggestionAdapter(this, FriendSuggestionAdapter.Mode.SEARCH);
        recyclerView.setAdapter(friendSuggestionAdapter);
        if (savedInstanceState != null) {
            this.f17655a = (ArrayList) savedInstanceState.getParcelable(f17654d);
        } else {
            this.f17655a = (ArrayList) getIntent().getSerializableExtra(f17654d);
        }
        friendSuggestionAdapter.g(this.f17655a);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(f17654d, this.f17655a);
    }
}
