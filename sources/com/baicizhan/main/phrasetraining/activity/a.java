package com.baicizhan.main.phrasetraining.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final int f24480d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f24481e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24482f = 2;

    /* renamed from: a, reason: collision with root package name */
    public Handler f24483a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    public RunnableC0320a f24484b;

    /* renamed from: c, reason: collision with root package name */
    public b f24485c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.phrasetraining.activity.a$a, reason: collision with other inner class name */
    public static class RunnableC0320a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f24486a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f24487b;

        public RunnableC0320a(a fragment, boolean right) {
            this.f24486a = new WeakReference<>(fragment);
            this.f24487b = right;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = this.f24486a.get();
            if (aVar == null) {
                return;
            }
            aVar.w(this.f24487b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void Q();

        void i(boolean right);

        void q0(Fragment last);

        void z(int action, Object cookie);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f24485c = (b) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RunnableC0320a runnableC0320a = this.f24484b;
        if (runnableC0320a != null) {
            this.f24483a.removeCallbacks(runnableC0320a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f24485c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("exit", true);
    }

    public void t(boolean right) {
        v(right, 400L);
    }

    public void v(boolean right, long delayed) {
        RunnableC0320a runnableC0320a = new RunnableC0320a(this, right);
        this.f24484b = runnableC0320a;
        this.f24483a.postDelayed(runnableC0320a, delayed);
    }

    public abstract void w(boolean right);

    public boolean x(Bundle savedInstanceState) {
        return savedInstanceState != null && savedInstanceState.getBoolean("exit", false);
    }
}
