package com.soundcloud.android.crop;

import android.os.Bundle;
import com.baicizhan.base.BaseAppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g extends BaseAppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f41720a = new ArrayList<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(g activity);

        void b(g activity);

        void c(g activity);

        void d(g activity);
    }

    public void I0(b listener) {
        if (this.f41720a.contains(listener)) {
            return;
        }
        this.f41720a.add(listener);
    }

    public void J0(b listener) {
        this.f41720a.remove(listener);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Iterator<b> it = this.f41720a.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Iterator<b> it = this.f41720a.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Iterator<b> it = this.f41720a.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Iterator<b> it = this.f41720a.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements b {
        @Override // com.soundcloud.android.crop.g.b
        public void a(g activity) {
        }

        @Override // com.soundcloud.android.crop.g.b
        public void b(g activity) {
        }

        @Override // com.soundcloud.android.crop.g.b
        public void c(g activity) {
        }

        @Override // com.soundcloud.android.crop.g.b
        public void d(g activity) {
        }
    }
}
