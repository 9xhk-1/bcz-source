package com.jeremyfeinstein.slidingmenu.lib.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.baicizhan.base.BaseFragmentActivity;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import es.a;
import es.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SlidingFragmentActivity extends BaseFragmentActivity implements a {

    /* renamed from: a, reason: collision with root package name */
    public b f38910a;

    @Override // es.a
    public void D(View v11, ViewGroup.LayoutParams params) {
        this.f38910a.i(v11, params);
    }

    @Override // es.a
    public void F() {
        this.f38910a.l();
    }

    @Override // es.a
    public void R() {
        this.f38910a.n();
    }

    @Override // es.a
    public void f0() {
        this.f38910a.m();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public View findViewById(int id2) {
        View findViewById = super.findViewById(id2);
        return findViewById != null ? findViewById : this.f38910a.b(id2);
    }

    @Override // es.a
    public void k(boolean b11) {
        this.f38910a.k(b11);
    }

    @Override // es.a
    public SlidingMenu n() {
        return this.f38910a.c();
    }

    @Override // es.a
    public void n0(int id2) {
        setBehindContentView(getLayoutInflater().inflate(id2, (ViewGroup) null));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b bVar = new b(this);
        this.f38910a = bVar;
        bVar.d(savedInstanceState);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        boolean e11 = this.f38910a.e(keyCode, event);
        return e11 ? e11 : super.onKeyUp(keyCode, event);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        this.f38910a.f(savedInstanceState);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.f38910a.g(outState);
    }

    @Override // es.a
    public void setBehindContentView(View v11) {
        D(v11, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int id2) {
        setContentView(getLayoutInflater().inflate(id2, (ViewGroup) null));
    }

    @Override // es.a
    public void toggle() {
        this.f38910a.o();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View v11) {
        setContentView(v11, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View v11, ViewGroup.LayoutParams params) {
        super.setContentView(v11, params);
        this.f38910a.h(v11, params);
    }
}
