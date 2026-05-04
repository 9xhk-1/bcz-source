package com.jeremyfeinstein.slidingmenu.lib.app;

import android.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import es.a;
import es.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SlidingListActivity extends ListActivity implements a {

    /* renamed from: a, reason: collision with root package name */
    public b f38911a;

    @Override // es.a
    public void D(View v11, ViewGroup.LayoutParams params) {
        this.f38911a.i(v11, params);
    }

    @Override // es.a
    public void F() {
        this.f38911a.l();
    }

    @Override // es.a
    public void R() {
        this.f38911a.n();
    }

    @Override // es.a
    public void f0() {
        this.f38911a.m();
    }

    @Override // android.app.Activity
    public View findViewById(int id2) {
        View findViewById = super.findViewById(id2);
        return findViewById != null ? findViewById : this.f38911a.b(id2);
    }

    @Override // es.a
    public void k(boolean b11) {
        this.f38911a.k(b11);
    }

    @Override // es.a
    public SlidingMenu n() {
        return this.f38911a.c();
    }

    @Override // es.a
    public void n0(int id2) {
        setBehindContentView(getLayoutInflater().inflate(id2, (ViewGroup) null));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b bVar = new b(this);
        this.f38911a = bVar;
        bVar.d(savedInstanceState);
        ListView listView = new ListView(this);
        listView.setId(R.id.list);
        setContentView(listView);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        boolean e11 = this.f38911a.e(keyCode, event);
        return e11 ? e11 : super.onKeyUp(keyCode, event);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        this.f38911a.f(savedInstanceState);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.f38911a.g(outState);
    }

    @Override // es.a
    public void setBehindContentView(View v11) {
        D(v11, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Activity
    public void setContentView(int id2) {
        setContentView(getLayoutInflater().inflate(id2, (ViewGroup) null));
    }

    @Override // es.a
    public void toggle() {
        this.f38911a.o();
    }

    @Override // android.app.Activity
    public void setContentView(View v11) {
        setContentView(v11, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Activity
    public void setContentView(View v11, ViewGroup.LayoutParams params) {
        super.setContentView(v11, params);
        this.f38911a.h(v11, params);
    }
}
