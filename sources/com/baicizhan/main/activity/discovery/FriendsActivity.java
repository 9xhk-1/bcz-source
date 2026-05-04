package com.baicizhan.main.activity.discovery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseFragmentActivity;
import com.baicizhan.client.friend.fragment.portrait.FriendListFragment;
import com.baicizhan.main.activity.discovery.FriendsActivity;
import com.jiongji.andriod.card.R;
import gs.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FriendsActivity extends BaseFragmentActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(Context context, boolean z11, boolean z12) {
        int i11 = z11;
        if (z12) {
            i11 = (z11 ? 1 : 0) | 2;
        }
        Intent intent = new Intent(context, (Class<?>) FriendsActivity.class);
        intent.putExtra("flags", i11);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((p0) DataBindingUtil.setContentView(this, R.layout.activity_friends)).j(new View.OnClickListener() { // from class: zd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsActivity.this.lambda$onCreate$0(view);
            }
        });
        FriendListFragment friendListFragment = (FriendListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        if (friendListFragment != null) {
            friendListFragment.z(getIntent().getIntExtra("flags", 0));
        }
    }
}
